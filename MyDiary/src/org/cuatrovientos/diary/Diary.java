/**
 * 
 */
package org.cuatrovientos.diary;

import java.util.Vector;

/**
 * Represents a diary with entries
 * @author Pello Altadill
 * @greetz any
 */
public class Diary {
	private Vector<Entry> entries;
	
	/**
	 * default constructor, inits entry vector
	 */
	public Diary () {
		entries = new Vector<Entry>();
	}
	
	/**
	 * adds entry into diary
	 * @param entry
	 */
	public void addEntry (Entry entry) {
		entries.add(entry);
	}
	
	/**
	 * removes entry from Diary
	 * @param index
	 * @return if entry was successfully removed or not
	 */
	public boolean removeEntry (int index) {
		if (index < entries.size()) {
			entries.remove(index);
			return true;
		} else {
			return false;
		}
		
	}
	
	/**
	 * reads one entry from diary
	 * @param index
	 * @return entry referenced by index, null otherwise 
	 */
	public Entry readEntry (int index) {
		if (index < entries.size() ) {
			return entries.elementAt(index);
		} else {
			return null;
		}
		
	}

	public String readAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
