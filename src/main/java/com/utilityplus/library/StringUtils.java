package com.utilityplus.library;

/**
 * A comprehensive utility class for string manipulation operations.
 * This class provides various methods for common string operations including
 * validation, transformation, and formatting.
 * 
 * <p>All methods in this class are static and thread-safe.</p>
 * 
 * @author Utility Plus Library Team
 * @version 1.0.0
 * @since 1.0.0
 */
public class StringUtils {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private StringUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Checks if a string is null or empty.
     * 
     * @param str the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Checks if a string is null, empty, or contains only whitespace.
     * 
     * @param str the string to check
     * @return true if the string is null, empty, or whitespace only, false otherwise
     */
    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * Reverses the given string.
     * 
     * @param str the string to reverse
     * @return the reversed string, or null if the input is null
     */
    public static String reverse(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Capitalizes the first letter of the string.
     * 
     * @param str the string to capitalize
     * @return the string with first letter capitalized, or null if input is null
     */
    public static String capitalize(String str) {
        if (isEmpty(str)) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     * Converts the string to lowercase.
     * 
     * @param str the string to convert
     * @return the lowercase string, or null if input is null
     */
    public static String toLowerCase(String str) {
        return str == null ? null : str.toLowerCase();
    }

    /**
     * Converts the string to uppercase.
     * 
     * @param str the string to convert
     * @return the uppercase string, or null if input is null
     */
    public static String toUpperCase(String str) {
        return str == null ? null : str.toUpperCase();
    }

    /**
     * Counts the number of occurrences of a substring within a string.
     * 
     * @param str the string to search in
     * @param sub the substring to search for
     * @return the number of occurrences, or 0 if either parameter is null
     */
    public static int countOccurrences(String str, String sub) {
        if (str == null || sub == null || sub.isEmpty()) {
            return 0;
        }
        
        int count = 0;
        int index = 0;
        
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        
        return count;
    }

    /**
     * Checks if a string contains only alphabetic characters.
     * 
     * @param str the string to check
     * @return true if the string contains only letters, false otherwise
     */
    public static boolean isAlpha(String str) {
        if (isEmpty(str)) {
            return false;
        }
        return str.matches("[a-zA-Z]+");
    }

    /**
     * Checks if a string contains only alphanumeric characters.
     * 
     * @param str the string to check
     * @return true if the string contains only letters and digits, false otherwise
     */
    public static boolean isAlphanumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        return str.matches("[a-zA-Z0-9]+");
    }

    /**
     * Checks if a string contains only numeric characters.
     * 
     * @param str the string to check
     * @return true if the string contains only digits, false otherwise
     */
    public static boolean isNumeric(String str) {
        if (isEmpty(str)) {
            return false;
        }
        return str.matches("[0-9]+");
    }

    /**
     * Removes all whitespace from a string.
     * 
     * @param str the string to process
     * @return the string without whitespace, or null if input is null
     */
    public static String removeWhitespace(String str) {
        return str == null ? null : str.replaceAll("\\s", "");
    }

    /**
     * Truncates a string to a specified maximum length, adding an ellipsis if truncated.
     * 
     * @param str the string to truncate
     * @param maxLength the maximum length
     * @return the truncated string, or null if input is null
     */
    public static String truncate(String str, int maxLength) {
        if (str == null) {
            return null;
        }
        if (str.length() <= maxLength) {
            return str;
        }
        return str.substring(0, maxLength - 3) + "...";
    }

    /**
     * Checks if two strings are equal, ignoring case.
     * 
     * @param str1 the first string
     * @param str2 the second string
     * @return true if the strings are equal ignoring case, false otherwise
     */
    public static boolean equalsIgnoreCase(String str1, String str2) {
        if (str1 == null && str2 == null) {
            return true;
        }
        if (str1 == null || str2 == null) {
            return false;
        }
        return str1.equalsIgnoreCase(str2);
    }

    /**
     * Joins an array of strings with a specified delimiter.
     * 
     * @param delimiter the delimiter to use
     * @param strings the strings to join
     * @return the joined string, or empty string if array is null or empty
     */
    public static String join(String delimiter, String... strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        return String.join(delimiter, strings);
    }

    /**
     * Pads a string on the left with a specified character to reach a target length.
     * 
     * @param str the string to pad
     * @param length the target length
     * @param padChar the character to pad with
     * @return the padded string
     */
    public static String leftPad(String str, int length, char padChar) {
        if (str == null) {
            str = "";
        }
        if (str.length() >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        sb.append(str);
        return sb.toString();
    }

    /**
     * Pads a string on the right with a specified character to reach a target length.
     * 
     * @param str the string to pad
     * @param length the target length
     * @param padChar the character to pad with
     * @return the padded string
     */
    public static String rightPad(String str, int length, char padChar) {
        if (str == null) {
            str = "";
        }
        if (str.length() >= length) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        for (int i = str.length(); i < length; i++) {
            sb.append(padChar);
        }
        return sb.toString();
    }
}
