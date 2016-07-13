package com.yao.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TimeUsage {

	public static long getTimeAfterNDay(int day) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(calendar.DATE, day);
		date = calendar.getTime();
		return FormatTime(date);
	}
	
	public static Long FormatTime(Date date) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Long time = Long.valueOf(format.format(date));
		return time;
	}
	
	public static Date FormatTime(Long time) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
		Date date = null;
		try {
			date = format.parse(String.valueOf(time));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String[] args) {
		System.out.println(FormatTime(new Date()));
	}
}
