# Java Strings 


## Learning Objectives

By the end of this topic, you should be able to:

1. Understand what a `String` is in Java.
2. Differentiate between **String** and **StringBuffer**.
3. Use common `String` methods like `length()`, `charAt()`, `equals()`, `substring()`, etc.
4. Perform string manipulations — joining, comparing, replacing, trimming, converting case.
5. Explain why **Strings are immutable** and when to use `StringBuffer`.

---

## 1. What is a String in Java?

A **String** is a **sequence of characters** — like a word or a sentence.
It is **not a primitive type** (like `int` or `float`) — instead, it is an **object** in Java.

**Example:**

```java
String message = "Hello, World!";
```

Here, `"Hello, World!"` is a String literal stored in memory.

** Real-life analogy:**
Think of a String like a **printed word on paper**. Once printed, the letters cannot be changed.
If you want to change something, you must **print a new page** — just like **immutability**.

---

## 2. Immutability of Strings

Strings in Java are **immutable**, meaning once created, they **cannot be modified**.

```java
String player = "Ronaldo";
player = "Messi";
```

**What happens internally:**

* `"Ronaldo"` is created first.
* When you assign `"Messi"`, Java doesn’t modify `"Ronaldo"`.
  It **creates a new String object** for `"Messi"` and makes `player` reference it.

**Diagram:**

```
[Ronaldo]   [Messi]
   ↑          ↑
  player →  player (now points to Messi)
```

**Why immutable?**

* For **security** (passwords, URLs)
* For **thread safety** (immutable = no race conditions)
* For **string pooling optimization** (JVM reuses common string values)

---

## 3. Creating Strings

### Using String Literals

```java
String str1 = "Hello Java";
```

Stored in the **String pool**. If the same value appears again, JVM **reuses** it.

### Using `new` Keyword

```java
String str2 = new String("Hello Java");
```

Stored **outside** the String pool — even if the same text exists.

---

## 4. Concatenation (Joining Strings)

### Method 1: Using `+`

```java
String sentence = "I " + "love " + "Java.";
System.out.println(sentence); // I love Java.
```

### Method 2: Using `concat()`

```java
String first = "Java ";
String second = "Programming";
String result = first.concat(second);
System.out.println(result); // Java Programming
```

**Example:** Joining first and last names:

```java
String fullName = firstName + " " + lastName;
```

---

## 5. Finding the Length of a String

```java
String text = "Hello World!";
System.out.println("Length: " + text.length());
```

**Output:** `Length: 12`

Analogy: Counting letters in a word — `"Cat"` has 3 letters.

---

## 6. Accessing Characters

```java
String name = "Hanif";
System.out.println(name.charAt(3)); // Output: i
```

Invalid index (`name.charAt(10)`) → `StringIndexOutOfBoundsException`

---

## 7. Comparing Strings

### Using `.equals()` (Content equality)

```java
String a = "Hello";
String b = "Hello";
System.out.println(a.equals(b)); // true
```

### Using `==` (Reference equality)

```java
String a = new String("Hello");
String b = new String("Hello");
System.out.println(a == b); // false
```

**Use `.equals()` for comparing values**, not `==`.

---

## 8. Checking if String Contains Only Digits

```java
String code = "567867A56";
for (int i = 0; i < code.length(); i++) {
    char ch = code.charAt(i);
    if (!Character.isDigit(ch)) {
        System.out.println("String contains NON-digits");
        break;
    }
}
```

Example: Validating phone numbers or student IDs.

---

## 9. Finding a Substring

### `indexOf()`

```java
String text = "Today is holiday. Tomorrow is working day";
int loc = text.indexOf("holiday");
System.out.println("Position of 'holiday': " + loc);
```

**Output:** `9`

### `substring()`

```java
String word = text.substring(9, 16);
System.out.println(word); // holiday
```

---

## 10. Splitting Strings

```java
String sentence = "Today is holiday tomorrow is working day";
String[] words = sentence.split(" ");
for (String w : words) {
    System.out.println(w);
}
```

Example: Splitting `"John Doe"` into first and last name.

---

## 11. Lexicographical Comparison

```java
String str1 = " abdul";
String str2 = "abdul";
int result = str1.compareTo(str2);
```

* `> 0` → str1 > str2
* `< 0` → str1 < str2
* `= 0` → str1 = str2

Used in **sorting** alphabetically.

---

## 12. Replace Characters

```java
String text = "Hello";
String replaced = text.replace('l', 'w');
System.out.println(replaced); // Hewwo
```

Example: Censoring words or changing file extensions.

---

## 13. Trimming Whitespace

```java
String text = "   Hello World.   ";
String clean = text.trim();
System.out.println(clean); // "Hello World."
```

Used for cleaning user input or file data.

---

## 14. Changing Case

```java
String lang = "Java Language";
System.out.println(lang.toUpperCase()); // JAVA LANGUAGE
System.out.println(lang.toLowerCase()); // java language
```

Useful for case-insensitive comparisons or normalization.

---

## 15. StringBuffer (Mutable Strings)

```java
StringBuffer sb = new StringBuffer("Hello");
sb.append(" World");
System.out.println(sb); // Hello World
```

Other methods:

```java
sb.insert(5, " Java");   // Hello Java World
sb.replace(6, 10, "C++"); // Hello C++ World
sb.reverse();             // dlroW ++C olleH
```

### When to use StringBuffer?

* When performing **many modifications** (loops, concatenations)
* Example: Building large text dynamically

---

## ⚔️ 16. String vs StringBuffer vs StringBuilder

| Feature     | String                | StringBuffer        | StringBuilder        |
| ----------- | --------------------- | ------------------- | -------------------- |
| Mutability  | Immutable             | Mutable             | Mutable              |
| Thread-Safe | ✅ Yes                 | ✅ Yes               | ❌ No                 |
| Speed       | Slow                  | Medium              | Fast                 |
| Use Case    | Small text, constants | Multi-threaded apps | Single-threaded apps |

---

## 17. Real-Life Applications of Strings

1. **Form input validation** – email, phone, username
2. **URL or file path handling** – `"C:\\Users\\Documents"`
3. **Data parsing** – reading CSV or JSON data
4. **Chat applications** – manipulating user messages
5. **Text-based games** – analyzing player input

---


# END 



# Java StringBuffer Advanced and Practical Guide


## 1. What is StringBuffer?

A `StringBuffer` is like a **whiteboard** where you can erase and rewrite freely — unlike a `String`, which is like a **printed page** (you can’t change it).

It is **mutable**, meaning the content **can be modified** after creation.

```java
StringBuffer sb = new StringBuffer("Hello");
```

---

## 2. append() — Add Text at the End

```java
StringBuffer sb = new StringBuffer("I love");
sb.append(" Java");
sb.append(" Programming");
System.out.println(sb);
```

**Output:**

```
I love Java Programming
```

**Explanation:** Adds new text at the **end** of the buffer without creating a new object.

**Analogy:** Writing more sentences on a whiteboard — same board, extended.

---

## 3. insert() — Add Text at a Specific Position

```java
StringBuffer sb = new StringBuffer("I Java");
sb.insert(2, "love ");
System.out.println(sb);
```

**Output:**

```
I love Java
```

**Explanation:** Inserts `"love "` starting at index `2`.

**Analogy:** Adding a missing word in the middle of a sentence.

---

## 4. replace() — Replace Part of a String

```java
StringBuffer sb = new StringBuffer("I like Java");
sb.replace(7, 11, "Python");
System.out.println(sb);
```

**Output:**

```
I like Python
```

**Explanation:** Replaces substring from index `7` to `11` (exclusive).

**Analogy:** Editing a word in a message before sending.

---

## 5. delete() — Remove Part of a String

```java
StringBuffer sb = new StringBuffer("Coding is fun!");
sb.delete(7, 10);
System.out.println(sb);
```

**Output:**

```
Coding fun!
```

**Explanation:** Removes characters from index `7` (inclusive) to `10` (exclusive).

**Analogy:** Deleting extra words from a note.

---

## 6. reverse() — Flip the Whole String

```java
StringBuffer sb = new StringBuffer("ABCDE");
sb.reverse();
System.out.println(sb);
```

**Output:**

```
EDCBA
```

**Analogy:** Useful in **palindrome checking**.

**Palindrome Example:**

```java
String word = "madam";
StringBuffer sb = new StringBuffer(word);
if (word.equals(sb.reverse().toString())) {
    System.out.println(word + " is a palindrome!");
} else {
    System.out.println(word + " is not a palindrome!");
}
```

---

## 7. substring() — Extract a Portion

```java
StringBuffer sb = new StringBuffer("Welcome to Java Programming");
String sub = sb.substring(11, 15);
System.out.println(sub);
```

**Output:**

```
Java
```

**Explanation:** Extracts characters from index `11` to `15` (exclusive).

**Analogy:** Cutting out a specific word from a sentence.

---

## 8. length() and capacity()

```java
StringBuffer sb = new StringBuffer("Hello");
System.out.println("Length: " + sb.length());
System.out.println("Capacity: " + sb.capacity());
```

**Output:**

```
Length: 5
Capacity: 21
```

**Explanation:**

* `length()` → Number of characters
* `capacity()` → Reserved memory (16 + initial length)

**Tip:** Java auto-expands capacity if needed.

---

## ⚙️ 9. setLength() — Resize the Buffer

```java
StringBuffer sb = new StringBuffer("JavaWorld");
sb.setLength(4);
System.out.println(sb);
```

**Output:**

```
Java
```

**Explanation:** Cuts string to 4 characters.

---

## 10. ensureCapacity() — Control Internal Space

```java
StringBuffer sb = new StringBuffer();
sb.ensureCapacity(50);
System.out.println("Capacity ensured: " + sb.capacity());
```

**Output:**

```
Capacity ensured: 50
```

**Use Case:** When handling large text concatenations like logs or reports.

---

## 11. Practical Example — Building a Bio Dynamically

```java
public class BioBuilder {
    public static void main(String[] args) {
        StringBuffer bio = new StringBuffer("My name is ");
        bio.append("Biniyam Teketel");
        bio.append(". ");
        bio.append("I am a full stack developer.");
        bio.insert(11, "(Mr.) ");
        bio.replace(35, 43, "software engineer");
        bio.append(" I love Java ❤️");
        System.out.println(bio);
    }
}
```

**Output:**

```
My name is (Mr.) Biniyam Teketel. I am a software engineer. I love Java ❤️
```

---

## 12. Example — Reversing User Input

```java
import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        StringBuffer sb = new StringBuffer(input);
        System.out.println("Reversed: " + sb.reverse());
    }
}
```

**Use Case:** Encryption, puzzle games, or palindrome checking.

---

## 13. Interview Trick: String vs StringBuffer

| Feature     | String                | StringBuffer                              |
| ----------- | --------------------- | ----------------------------------------- |
| Type        | Immutable             | Mutable                                   |
| Performance | Slow for many changes | Fast for edits                            |
| Thread Safe | ✅ Yes                 | ✅ Yes                                     |
| Stored In   | String Pool           | Heap                                      |
| Example Use | Fixed text            | Dynamic text (chat messages, bio builder) |

---

## 14. Real-World Example: Dynamic URL Generator

```java
public class URLBuilder {
    public static void main(String[] args) {
        StringBuffer url = new StringBuffer("https://example.com/search?");
        url.append("q=java");
        url.append("&page=2");
        url.append("&sort=latest");

        System.out.println("Generated URL: " + url);
    }
}
```

**Output:**

```
https://example.com/search?q=java&page=2&sort=latest
```

---

## 15. Mini Project Example — Message Editor

```java
public class MessageEditor {
    public static void main(String[] args) {
        StringBuffer message = new StringBuffer("I lvoe Jvaa!");
        
        // fix spelling mistakes
        message.replace(3, 6, "ove");
        message.replace(8, 12, "Java");
        
        // add exclamation
        message.append(" 🚀");

        // reverse to surprise effect
        System.out.println("Original: " + message);
        System.out.println("Reversed: " + new StringBuffer(message).reverse());
    }
}
```

**Output:**

```
Original: I love Java! 🚀
Reversed: 🚀 !avaJ evol I
```

---



# **String & StringBuffer LeetCode-Style Practice**


## 1️⃣ Reverse String — LeetCode 344 (Variant)

**Problem:** Reverse a string `s`.

**Key methods:** `StringBuffer.reverse()`, `toString()`

```java
public class ReverseString {
    public static String reverse(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("hello")); // "olleh"
    }
}
```

**Explanation:** Reverses characters in-place.


---

## 2️⃣ Valid Palindrome — LeetCode 125

**Problem:** Check if `s` is a palindrome ignoring non-alphanumeric characters and case.

**Key methods:** `charAt()`, `toLowerCase()`, `Character.isLetterOrDigit()`

```java
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++; j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(isPalindrome("race a car")); // false
    }
}
```


---

## 3️⃣ Implement strStr() — LeetCode 28

**Problem:** Return index of first occurrence of `needle` in `haystack`.

**Key method:** `indexOf()`

```java
public class StrStr {
    public static int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) return 0;
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll")); // 2
        System.out.println(strStr("aaaaa", "bba")); // -1
    }
}
```


---

## 4️⃣ First Unique Character — LeetCode 387

**Problem:** Return index of first non-repeating char.

**Key methods:** `indexOf()`, `lastIndexOf()`

```java
public class FirstUniqueChar {
    public static int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.indexOf(c) == s.lastIndexOf(c)) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode")); // 0
        System.out.println(firstUniqChar("loveleetcode")); // 2
    }
}
```


---

## 5️⃣ Longest Common Prefix — LeetCode 14

**Problem:** Find longest common prefix among strings.

**Key methods:** `substring()`, `startsWith()`

```java
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"})); // "fl"
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"})); // ""
    }
}
```

---

## 6️⃣ Add Binary — LeetCode 67

**Problem:** Sum two binary strings.

**Key methods:** `charAt()`, `append()`, `reverse()`

```java
public class AddBinary {
    public static String addBinary(String a, String b) {
        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        StringBuffer sb = new StringBuffer();

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("11", "1")); // "100"
        System.out.println(addBinary("1010", "1011")); // "10101"
    }
}
```


---

## 7️⃣ Palindrome Check Using `reverse()`

**Problem:** Check palindrome using only `StringBuffer.reverse()`.

```java
public class PalCheck {
    public static boolean isPalindromeSimple(String s) {
        return s.equals(new StringBuffer(s).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeSimple("madam")); // true
        System.out.println(isPalindromeSimple("Madam")); // false
    }
}
```

---



