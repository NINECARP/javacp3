package com.stir.cscu9t4practical1;

class SprintEntry extends Entry{
	private int rounds;
	private int recoveryTime;
	
	public SprintEntry(String n, int d, int m, int y, int h, int min, int s, float dist, int r, int rt) {
		super(n, d, m, y, h, min, s, dist);
		rounds = r;
		recoveryTime = rt;
		
		}
		
		public int getRounds() {
			return rounds;
		}
		
		public int getRecoveryTime() {
			return recoveryTime;
		}
		
		public String getEntry() {
			String result = getName() + "swam" + getDistance() + "km in "
					 	  + getHour() + ":" + getMin() + ":" + getSec() + "on "
					 	  + getDay() + "/" + getMonth() + "/" + getYear()
					 	  + " in " + getRounds() + "with" + getRecoveryTime() + "recovery time" + "\n";
			return result;
		}
	}
