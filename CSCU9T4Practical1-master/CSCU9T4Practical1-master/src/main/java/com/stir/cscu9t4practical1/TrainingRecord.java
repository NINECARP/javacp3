// An implementation of a Training Record as an ArrayList
package com.stir.cscu9t4practical1;

import java.util.*;


public class TrainingRecord {
    private List<Entry> tr;
    private List<SprintEntry> SprintRecord;
    
    public TrainingRecord() {
        tr = new ArrayList<Entry>();
         SprintRecord = new ArrayList<SprintEntry>();
        
    } //constructor
    
    // add a record to the list
   public void addEntry(Entry e){
       tr.add(e);    
   } // addClass
   
   public void addSprintEntry(SwimEntry e)
   {
	   tr.add(e);
       tr.add(e);
   } // addClass
   
   // look up the entry of a given day and month
public String lookupEntry (int d, int m, int y) {
       ListIterator<Entry> iter = tr.listIterator();
       String result = "No entries found";
       while (iter.hasNext()) {
          Entry current = iter.next();
          if (current.getDay()==d && current.getMonth()==m && current.getYear()==y) 
             result = current.getEntry();
            }
       return result;
   } // lookupEntry
   
   public String lookUpAllEntry(int d, int m, int y) {

		ListIterator<Entry> iter = tr.listIterator();
		String result = "No Entries Found";
		int actionSelect = 0;
		while (iter.hasNext()) {
			Entry current = iter.next();
			if (current.getDay() == d && current.getMonth() == m && current.getYear() == y)
			{
				actionSelect++;
				if(actionSelect == 1)
				{
					result = current.getEntry();
				}
				else
				{
					result = result.concat(current.getEntry());
				}
			}
			
		}
		return result;
   }
   
   
   public int getNumberOfEntries(){
       return tr.size();
   }
   // Clear all entries
   public void clearSelectedEntry(String name, int d, int m, int y) {
    List<Entry> matchingEntries = new ArrayList<>();
    for (Entry entry : tr) {
        if (entry.getName().equals(name) &&
                entry.getDay() == d &&
                entry.getMonth() == m &&
                entry.getYear() == y) {
            matchingEntries.add(entry);
        }
    }
        tr.removeAll(matchingEntries);
    }
   
} // TrainingRecord