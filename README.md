# Utility Plus Library

A comprehensive Java utility library providing common string manipulation, mathematical operations, and date/time utilities.

## Version
1.0.0

## Description
Utility Plus Library is a lightweight, dependency-free Java library designed to simplify common programming tasks. It provides three main utility classes:
- **StringUtils**: String manipulation and validation methods
- **MathUtils**: Mathematical operations and calculations
- **DateUtils**: Date and time formatting, parsing, and calculations

## Features

### StringUtils
- String validation (isEmpty, isBlank, isAlpha, isAlphanumeric, isNumeric)
- String transformation (reverse, capitalize, toLowerCase, toUpperCase)
- String manipulation (removeWhitespace, truncate, countOccurrences)
- String padding (leftPad, rightPad)
- String comparison (equalsIgnoreCase)
- String joining (join)

### MathUtils
- Number theory operations (gcd, lcm, isPrime)
- Factorial and Fibonacci calculations
- Statistical functions (average, max, min, sum, standardDeviation)
- Number rounding and clamping
- Even/odd checking
- Percentage calculations
- Degree/radian conversions

### DateUtils
- Current date/time retrieval
- Date formatting and parsing
- Date arithmetic (add days, months, years)
- Date comparison (isFuture, isPast, isToday)
- Date difference calculations (daysBetween, monthsBetween, yearsBetween)
- Age calculation
- Leap year checking
- Weekend/weekday checking

## Installation

### Using Maven
Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.utilityplus</groupId>
    <artifactId>utility-plus-library</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Using Gradle
Add the following dependency to your `build.gradle`:

```gradle
implementation 'com.utilityplus:utility-plus-library:1.0.0'
```

### Using JAR File
1. Download the JAR file from the target directory: `utility-plus-library-1.0.0.jar`
2. Add the JAR to your project's classpath
3. Import the classes in your code:
```java
import com.utilityplus.library.StringUtils;
import com.utilityplus.library.MathUtils;
import com.utilityplus.library.DateUtils;
```

## Usage Examples

### StringUtils Examples

```java
import com.utilityplus.library.StringUtils;

// String validation
boolean empty = StringUtils.isEmpty(""); // true
boolean blank = StringUtils.isBlank("   "); // true
boolean alpha = StringUtils.isAlpha("hello"); // true
boolean numeric = StringUtils.isNumeric("12345"); // true

// String transformation
String reversed = StringUtils.reverse("hello"); // "olleh"
String capitalized = StringUtils.capitalize("hello"); // "Hello"
String upper = StringUtils.toUpperCase("hello"); // "HELLO"

// String manipulation
String noSpaces = StringUtils.removeWhitespace("hello world"); // "helloworld"
String truncated = StringUtils.truncate("Hello World", 8); // "Hello..."
int count = StringUtils.countOccurrences("hello world hello", "hello"); // 2

// String padding
String leftPadded = StringUtils.leftPad("123", 5, '0'); // "00123"
String rightPadded = StringUtils.rightPad("abc", 6, '-'); // "abc---"

// String joining
String joined = StringUtils.join(", ", "apple", "banana", "cherry"); // "apple, banana, cherry"
```

### MathUtils Examples

```java
import com.utilityplus.library.MathUtils;

// Number theory
int gcd = MathUtils.gcd(12, 18); // 6
int lcm = MathUtils.lcm(4, 6); // 12
boolean prime = MathUtils.isPrime(17); // true

// Calculations
long factorial = MathUtils.factorial(5); // 120
long fibonacci = MathUtils.fibonacci(10); // 55

// Statistical functions
double[] numbers = {1, 2, 3, 4, 5};
double avg = MathUtils.average(numbers); // 3.0
double max = MathUtils.max(numbers); // 5.0
double min = MathUtils.min(numbers); // 1.0
double sum = MathUtils.sum(numbers); // 15.0
double stdDev = MathUtils.standardDeviation(numbers); // 1.414...

// Rounding and clamping
double rounded = MathUtils.round(3.14159, 2); // 3.14
double clamped = MathUtils.clamp(15, 0, 10); // 10.0

// Number properties
boolean even = MathUtils.isEven(4); // true
boolean odd = MathUtils.isOdd(3); // true

// Percentage
double percent = MathUtils.percentage(25, 100); // 25.0

// Conversions
double radians = MathUtils.degreesToRadians(180); // 3.14159...
double degrees = MathUtils.radiansToDegrees(Math.PI); // 180.0
```

### DateUtils Examples

```java
import com.utilityplus.library.DateUtils;
import java.time.LocalDate;
import java.time.LocalDateTime;

// Current date/time
LocalDate today = DateUtils.getCurrentDate();
LocalDateTime now = DateUtils.getCurrentDateTime();

// Formatting
String formattedDate = DateUtils.formatDate(today); // "2024-01-15"
String customFormat = DateUtils.formatDate(today, "dd/MM/yyyy"); // "15/01/2024"
String formattedDateTime = DateUtils.formatDateTime(now, "yyyy-MM-dd HH:mm:ss");

// Parsing
LocalDate parsed = DateUtils.parseDate("2024-01-15");
LocalDate customParsed = DateUtils.parseDate("15/01/2024", "dd/MM/yyyy");

// Date arithmetic
LocalDate nextWeek = DateUtils.addDays(today, 7);
LocalDate nextMonth = DateUtils.addMonths(today, 1);
LocalDate nextYear = DateUtils.addYears(today, 1);

// Date comparison
boolean future = DateUtils.isFuture(nextWeek); // true
boolean past = DateUtils.isPast(today.minusDays(1)); // true
boolean isToday = DateUtils.isToday(today); // true

// Date differences
long days = DateUtils.daysBetween(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 31)); // 30
long months = DateUtils.monthsBetween(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 6, 1)); // 5
long years = DateUtils.yearsBetween(LocalDate.of(2000, 1, 1), LocalDate.of(2024, 1, 1)); // 24

// Age calculation
LocalDate birthDate = LocalDate.of(1990, 5, 15);
int age = DateUtils.getAge(birthDate); // 34 (as of 2024)

// Leap year
boolean leap = DateUtils.isLeapYear(2024); // true

// Days in month
int daysInMonth = DateUtils.getDaysInMonth(2024, 2); // 29 (February in leap year)

// Weekend/weekday
boolean weekend = DateUtils.isWeekend(LocalDate.of(2024, 1, 6)); // true (Saturday)
boolean weekday = DateUtils.isWeekday(LocalDate.of(2024, 1, 8)); // true (Monday)
```

## Requirements
- Java 11 or higher
- No external dependencies

## Building from Source

To build the library from source:

```bash
mvn clean package
```

This will generate:
- `utility-plus-library-1.0.0.jar` - Main library JAR
- `utility-plus-library-1.0.0-sources.jar` - Source code JAR
- `utility-plus-library-1.0.0-javadoc.jar` - JavaDoc JAR

## Documentation
Comprehensive JavaDoc documentation is included in the library. You can also generate the JavaDoc HTML by running:

```bash
mvn javadoc:javadoc
```

The generated documentation will be in the `target/site/apidocs` directory.

## License
MIT License

## Author
Utility Plus Library Team

## Version History
- **1.0.0** (2024-01-15): Initial release with StringUtils, MathUtils, and DateUtils

## Support
For issues, questions, or contributions, please visit the project repository.
