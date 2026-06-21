package com.utilityplus.library;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * A comprehensive utility class for date and time operations.
 * This class provides various methods for date manipulation, formatting,
 * and calculations using the modern Java Time API (java.time).
 * 
 * <p>All methods in this class are static and thread-safe.</p>
 * 
 * @author Utility Plus Library Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class DateUtils {

    /**
     * Default date format pattern.
     */
    public static final String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";

    /**
     * Default date-time format pattern.
     */
    public static final String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private DateUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Gets the current date as a LocalDate object.
     * 
     * @return the current date
     */
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }

    /**
     * Gets the current date and time as a LocalDateTime object.
     * 
     * @return the current date and time
     */
    public static LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }

    /**
     * Formats a LocalDate to a string using the default format.
     * 
     * @param date the date to format
     * @return the formatted date string, or null if input is null
     */
    public static String formatDate(LocalDate date) {
        return formatDate(date, DEFAULT_DATE_FORMAT);
    }

    /**
     * Formats a LocalDate to a string using a specified format pattern.
     * 
     * @param date the date to format
     * @param pattern the format pattern (e.g., "yyyy-MM-dd", "dd/MM/yyyy")
     * @return the formatted date string, or null if input is null
     */
    public static String formatDate(LocalDate date, String pattern) {
        if (date == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }

    /**
     * Formats a LocalDateTime to a string using the default format.
     * 
     * @param dateTime the date-time to format
     * @return the formatted date-time string, or null if input is null
     */
    public static String formatDateTime(LocalDateTime dateTime) {
        return formatDateTime(dateTime, DEFAULT_DATETIME_FORMAT);
    }

    /**
     * Formats a LocalDateTime to a string using a specified format pattern.
     * 
     * @param dateTime the date-time to format
     * @param pattern the format pattern (e.g., "yyyy-MM-dd HH:mm:ss")
     * @return the formatted date-time string, or null if input is null
     */
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        if (dateTime == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    /**
     * Parses a string to a LocalDate using the default format.
     * 
     * @param dateStr the date string to parse
     * @return the parsed LocalDate, or null if input is null
     * @throws java.time.format.DateTimeParseException if the string cannot be parsed
     */
    public static LocalDate parseDate(String dateStr) {
        return parseDate(dateStr, DEFAULT_DATE_FORMAT);
    }

    /**
     * Parses a string to a LocalDate using a specified format pattern.
     * 
     * @param dateStr the date string to parse
     * @param pattern the format pattern
     * @return the parsed LocalDate, or null if input is null
     * @throws java.time.format.DateTimeParseException if the string cannot be parsed
     */
    public static LocalDate parseDate(String dateStr, String pattern) {
        if (dateStr == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDate.parse(dateStr, formatter);
    }

    /**
     * Parses a string to a LocalDateTime using the default format.
     * 
     * @param dateTimeStr the date-time string to parse
     * @return the parsed LocalDateTime, or null if input is null
     * @throws java.time.format.DateTimeParseException if the string cannot be parsed
     */
    public static LocalDateTime parseDateTime(String dateTimeStr) {
        return parseDateTime(dateTimeStr, DEFAULT_DATETIME_FORMAT);
    }

    /**
     * Parses a string to a LocalDateTime using a specified format pattern.
     * 
     * @param dateTimeStr the date-time string to parse
     * @param pattern the format pattern
     * @return the parsed LocalDateTime, or null if input is null
     * @throws java.time.format.DateTimeParseException if the string cannot be parsed
     */
    public static LocalDateTime parseDateTime(String dateTimeStr, String pattern) {
        if (dateTimeStr == null) {
            return null;
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return LocalDateTime.parse(dateTimeStr, formatter);
    }

    /**
     * Calculates the number of days between two dates.
     * 
     * @param startDate the start date
     * @param endDate the end date
     * @return the number of days between the dates
     * @throws IllegalArgumentException if either date is null
     */
    public static long daysBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    /**
     * Calculates the number of months between two dates.
     * 
     * @param startDate the start date
     * @param endDate the end date
     * @return the number of months between the dates
     * @throws IllegalArgumentException if either date is null
     */
    public static long monthsBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        return ChronoUnit.MONTHS.between(startDate, endDate);
    }

    /**
     * Calculates the number of years between two dates.
     * 
     * @param startDate the start date
     * @param endDate the end date
     * @return the number of years between the dates
     * @throws IllegalArgumentException if either date is null
     */
    public static long yearsBetween(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null) {
            throw new IllegalArgumentException("Dates cannot be null");
        }
        return ChronoUnit.YEARS.between(startDate, endDate);
    }

    /**
     * Adds a specified number of days to a date.
     * 
     * @param date the original date
     * @param days the number of days to add (can be negative)
     * @return the new date
     * @throws IllegalArgumentException if date is null
     */
    public static LocalDate addDays(LocalDate date, long days) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.plusDays(days);
    }

    /**
     * Adds a specified number of months to a date.
     * 
     * @param date the original date
     * @param months the number of months to add (can be negative)
     * @return the new date
     * @throws IllegalArgumentException if date is null
     */
    public static LocalDate addMonths(LocalDate date, long months) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.plusMonths(months);
    }

    /**
     * Adds a specified number of years to a date.
     * 
     * @param date the original date
     * @param years the number of years to add (can be negative)
     * @return the new date
     * @throws IllegalArgumentException if date is null
     */
    public static LocalDate addYears(LocalDate date, long years) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.plusYears(years);
    }

    /**
     * Checks if a date is in the future.
     * 
     * @param date the date to check
     * @return true if the date is in the future, false otherwise
     * @throws IllegalArgumentException if date is null
     */
    public static boolean isFuture(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.isAfter(LocalDate.now());
    }

    /**
     * Checks if a date is in the past.
     * 
     * @param date the date to check
     * @return true if the date is in the past, false otherwise
     * @throws IllegalArgumentException if date is null
     */
    public static boolean isPast(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.isBefore(LocalDate.now());
    }

    /**
     * Checks if a date is today.
     * 
     * @param date the date to check
     * @return true if the date is today, false otherwise
     * @throws IllegalArgumentException if date is null
     */
    public static boolean isToday(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return date.equals(LocalDate.now());
    }

    /**
     * Gets the age in years based on a birth date.
     * 
     * @param birthDate the birth date
     * @return the age in years
     * @throws IllegalArgumentException if birth date is null
     */
    public static int getAge(LocalDate birthDate) {
        if (birthDate == null) {
            throw new IllegalArgumentException("Birth date cannot be null");
        }
        return (int) yearsBetween(birthDate, LocalDate.now());
    }

    /**
     * Checks if a year is a leap year.
     * 
     * @param year the year to check
     * @return true if the year is a leap year, false otherwise
     */
    public static boolean isLeapYear(int year) {
        return LocalDate.of(year, 1, 1).isLeapYear();
    }

    /**
     * Gets the number of days in a month for a given year.
     * 
     * @param year the year
     * @param month the month (1-12)
     * @return the number of days in the month
     * @throws IllegalArgumentException if month is not between 1 and 12
     */
    public static int getDaysInMonth(int year, int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month must be between 1 and 12");
        }
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }

    /**
     * Checks if a date is a weekend day (Saturday or Sunday).
     * 
     * @param date the date to check
     * @return true if the date is a weekend, false otherwise
     * @throws IllegalArgumentException if date is null
     */
    public static boolean isWeekend(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        java.time.DayOfWeek day = date.getDayOfWeek();
        return day == java.time.DayOfWeek.SATURDAY || day == java.time.DayOfWeek.SUNDAY;
    }

    /**
     * Checks if a date is a weekday (Monday through Friday).
     * 
     * @param date the date to check
     * @return true if the date is a weekday, false otherwise
     * @throws IllegalArgumentException if date is null
     */
    public static boolean isWeekday(LocalDate date) {
        if (date == null) {
            throw new IllegalArgumentException("Date cannot be null");
        }
        return !isWeekend(date);
    }
}
