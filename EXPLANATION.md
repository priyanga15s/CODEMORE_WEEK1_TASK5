# Explanation of Java Concepts Used

## Objective

This program performs two string operations:

1. Checks whether a string is a palindrome.
2. Counts the number of vowels in the string.

---

# 1. Scanner Class

The `Scanner` class is used to read input from the user.

```java
Scanner sc = new Scanner(System.in);
```

Method used:

- `nextLine()` – Reads an entire line of text, including spaces.

---

# 2. String

A `String` is a sequence of characters.

Example:

```java
String input = sc.nextLine();
```

The entered text is stored in the variable `input`.

---

# 3. Methods (Functions)

The program uses two user-defined methods.

### isPalindrome()

```java
public static boolean isPalindrome(String str)
```

Returns:

- `true` if the string is a palindrome.
- `false` otherwise.

### countVowels()

```java
public static int countVowels(String str)
```

Returns the total number of vowels in the string.

---

# 4. Character Manipulation

The program accesses each character using:

```java
str.charAt(i)
```

Example:

```java
char ch = str.charAt(i);
```

---

# 5. Converting to Lowercase

```java
str = str.toLowerCase();
```

This ensures uppercase and lowercase letters are treated the same.

Example:

- MADAM
- Madam
- madam

All become:

```
madam
```

---

# 6. While Loop

The palindrome check compares characters from both ends.

```java
while(start < end)
```

If any pair is different, the string is not a palindrome.

---

# 7. For Loop

The vowel-counting method checks every character.

```java
for(int i = 0; i < str.length(); i++)
```

---

# 8. Conditional Statement

The program checks whether a character is a vowel.

```java
if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
```

If true, the vowel count increases.

---

# 9. String Methods Used

| Method | Purpose |
|---------|---------|
| `length()` | Returns the length of the string |
| `charAt(index)` | Returns the character at a specific position |
| `toLowerCase()` | Converts all letters to lowercase |

---

# 10. Output Statements

Results are displayed using:

```java
System.out.println();
```

---

# 11. Closing the Scanner

```java
sc.close();
```

This releases system resources after input is complete.

---

# Program Flow

1. Read a string from the user.
2. Convert the string to lowercase.
3. Compare characters from the beginning and end to check for a palindrome.
4. Traverse the string to count vowels.
5. Display whether the string is a palindrome.
6. Display the total number of vowels.
7. Close the Scanner.
8. End the program.

---

# Java Concepts Covered

- Scanner Class
- Strings
- String Methods (`length()`, `charAt()`, `toLowerCase()`)
- Variables
- Methods (Functions)
- While Loop
- For Loop
- If-Else Statements
- Character Manipulation
- Boolean Return Type
- Integer Return Type
- Output Statements
- Resource Management (`sc.close()`)
