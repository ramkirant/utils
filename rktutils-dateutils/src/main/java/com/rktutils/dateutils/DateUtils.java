package com.rktutils.dateutils;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtils {
	
	public static LocalDate getTodaysDateWithoutTime() {
		return LocalDate.now();
	}
	
	public static LocalDate setDate(Integer year, Integer month, Integer day) {
		return LocalDate.of(year, month, day);
	}
	
	public static LocalDate addDays(LocalDate localDate, Integer days) {
		return localDate.plusDays(days);
	}
	
	public static LocalDate subtractDays(LocalDate localDate, Integer days) {
		return localDate.minusDays(days);
	}
	
	public static LocalDate addMonths(LocalDate localDate, Integer months) {
		return localDate.plusMonths(months);
	}
	
	public static LocalDate subtractMonths(LocalDate localDate, Integer months) {
		return localDate.minusMonths(months);
	}
	
	public static LocalDate addYears(LocalDate localDate, Integer years) {
		return localDate.plusYears(years);
	}
	
	public static LocalDate subtractYears(LocalDate localDate, Integer years) {
		return localDate.minusYears(years);
	}
	
	public static String dateToFormatString(LocalDate localDate, String pattern) {
		return localDate.format(DateTimeFormatter.ofPattern(pattern));
	}
	
	public static Date localDateToUtilDate(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
	}
	
	public static LocalDate utilDateToLocalDate(Date date) {
		return Instant.ofEpochMilli(date.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
	}
}
