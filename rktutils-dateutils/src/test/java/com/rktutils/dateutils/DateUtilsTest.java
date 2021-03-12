package com.rktutils.dateutils;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

class DateUtilsTest {
	
	@Test
	void setDateTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		assertEquals("2021-03-11", date.toString());
	}
	
	@Test
	void addDaysTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.addDays(date, 1);
		assertEquals("2021-03-12", date.toString());
	}
	
	@Test
	void subtractDaysTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.subtractDays(date, 1);
		assertEquals("2021-03-10", date.toString());
	}
	
	@Test
	void addMonthsTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.addMonths(date, 1);
		assertEquals("2021-04-11", date.toString());
	}
	
	@Test
	void subtractMonthsTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.subtractMonths(date, 1);
		assertEquals("2021-02-11", date.toString());
	}
	
	@Test
	void addYearsTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.addYears(date, 1);
		assertEquals("2022-03-11", date.toString());
	}
	
	@Test
	void subtractYearsTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		date = DateUtils.subtractYears(date, 1);
		assertEquals("2020-03-11", date.toString());
	}
	
	@Test
	void dateToFormatStringTest() {
		LocalDate date = DateUtils.setDate(2021, 3, 11);
		String dateFormatString = DateUtils.dateToFormatString(date, "dd-MMM-yyyy");
		assertEquals("11-Mar-2021", dateFormatString);
	}
	
	@Test
	void localDateToUtilDateTest() {
		LocalDate localDate = DateUtils.setDate(2021, 3, 11);
		Date utilDate = DateUtils.localDateToUtilDate(localDate);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(utilDate);
		String dateStr = calendar.get(Calendar.YEAR)+"-"+calendar.get(Calendar.MONTH)+"-"+calendar.get(Calendar.DATE);
		assertEquals("2021-2-11", dateStr);
	}
	
	@Test
	void utilDateToLocalDateTest() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, 2021);
		calendar.set(Calendar.MONTH, 2);
		calendar.set(Calendar.DAY_OF_MONTH, 11);
		
		Date utilDate = calendar.getTime();
		
		LocalDate localDate = DateUtils.utilDateToLocalDate(utilDate);
		assertEquals("2021-03-11", localDate.toString());
	}

}
