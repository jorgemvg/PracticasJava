package edu.hackerrank.challenge;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 * Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
 *
 *	Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
 *	- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.
 */

public class TimeConversion {

	public static void main(String[] args) {

		try {

			String s = "07:05:45PM";

			DateFormat formatAmPm = new SimpleDateFormat("hh:mm:ssa", Locale.US);
			Date dateAmPm = formatAmPm.parse(s);
			DateFormat format24 = new SimpleDateFormat("HH:mm:ss", Locale.US);

			System.out.println(format24.format(dateAmPm));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
