package org.cuatrovientos.camping;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Simple class to deal with all the input reading and parsing
 * @author Pello Altadill
 * @greet any
 * 
 */
public class UserInput {
	 private Scanner reader;
	 public static final String DATE_FORMAT = "dd/MM/yyyy";

	/**
	 * default constructor
	 */
	public UserInput () {
		reader = new Scanner(System.in);
	}
	
    /**
     * readInt 
     * @param msg to show
     * @return readed value
     */
    public int readInteger (String msg) {
            int result = 0;
            boolean noCorrectData = true;
            String readedLine = "";
            do {
                    try {
                            System.out.println(msg);
                            readedLine = reader.nextLine(); 
                            result = Integer.parseInt(readedLine);
                            noCorrectData = false;
                    } catch (Exception e) {
                            System.err.println("Incorrect number format");
                            noCorrectData = true;
                    }
                    
            } while(noCorrectData);
            
            return result;
    }
    
   
    
    /**
     * readDecimal 
     * @param msg to show
     * @return readed value
     */
    public float readDecimal (String msg) {
            float result = 0;
            boolean noCorrectData = true;
            String readedLine = "";
            do {
                    try {
                            System.out.println(msg);
                            readedLine = reader.nextLine();
                            result = Float.parseFloat(readedLine);
                            noCorrectData = false;
                    } catch (Exception e) {
                            System.err.println("Incorrect number format");
                            noCorrectData = true;
                    }
                    
            } while(noCorrectData);
            
            return result;
    }
    
    /**
     * read
     * @param mensaje
     * @return String
     */
    public String read (String msg) {
            String line = "";
            
            try {
                    System.out.println(msg);
                    line = reader.nextLine();
                    
            } catch (Exception e) {
                    System.err.println("Error reading data, return 0");
            }
            
            return line;
    }
    
    /**
     * readDate
     * @param mensaje
     * @return Date
     */
    public Date readDate (String msg) {
            String lineaLeida = "";
            Date fecha = new Date();
            SimpleDateFormat formatoDeFecha = new SimpleDateFormat(DATE_FORMAT);
            
            try {
                    System.out.println(msg);
                    lineaLeida = reader.nextLine();
                    fecha = formatoDeFecha.parse(lineaLeida);
                    
            } catch (Exception e) {
                    System.err.println("Error reading date, use , return 0");
            }
            
            return fecha;
    }

}
