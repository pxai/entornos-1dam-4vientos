/**
 * 
 */
package org.cuatrovientos.diary;

import java.util.Date;

/**
 * Represents an entry in the diary
 * @author pello altadill
 * @greetz any
 */
public class Entry {
	private String text;
	private Date date;
	
	/**
	 * @param text
	 * @param date
	 */
	public Entry(String text, Date date) {
		this.text = text;
		this.date = date;
	}
	
	/**
	 * shows Entry with date as heading followed by text
	 * @return
	 */
	public String show () {
		return date.toString() + "\n" + text;
	}
	
	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}
	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
