package scheduler;

//through this class slots are generated to match minimum hours criteria for each subject
//also this class holds slots in order
public class TimeTable {

	public static Slot[] slot;

	TimeTable() {

		int k = 0;
		int subjectno = 0;
		int hourcount = 1;
		int days = inputdata.daysperweek;
		int hours = inputdata.hoursperday;
		int nostgrp = inputdata.nostudentgroup;

		// creating as many slots as the no of blocks in overall timetable
		slot = new Slot[hours * days * nostgrp];

		

	}// end constructor

	public static Slot[] returnSlots() {
		return slot;
	}
}