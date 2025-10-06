**Data Types in Java**
======================

**1\. Data Types**
------------------

In Java, a **data type** specifies the size and type of values that can be stored in a variable (identifier). Java has two main categories:

1.  **Primitive Data Types** – store simple values like numbers, characters, or boolean.
    
2.  **Non-Primitive (Reference) Data Types** – store references (addresses) to objects.
    

**2\. Primitive Data Types**
----------------------------

Primitive types are the most basic built-in data types in Java.

### **a) Integer Types**

Used for whole numbers.

TypeSizeRangeDefault ValueExamplebyte1 B-128 to 1270byte b=10;short2 B-32,768 to 32,7670short s=11;int4 B-2,147,483,648 to 2,147,483,6470int i=10;long8 B-9,223,372,036,854,775,808 to 9,223,372,036,854,775,8070long l=100012;

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   public class Demo {      public static void main(String[] args) {          byte b = 20;          short s = 20;          int i = 20;          long l = 20;          System.out.println(b + ", " + s + ", " + i + ", " + l);      }  }   `

### **b) Floating-point Types**

Used for decimal numbers.

TypeSizeDefault ValueExamplefloat4 B0.0ffloat f=10.3f;double8 B0.0ddouble d=11.123;

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   public class Demo {      public static void main(String[] args) {          float f = 20.25f;          double d = 20.25;          System.out.println(f + ", " + d);      }  }   `

### **c) Character Type**

TypeSizeRangeExamplechar2 B0 to 65,535 (Unicode)char c='a';

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   public class Demo {      public static void main(String[] args) {          char ch = 'S';          char ch2 = '&';          System.out.println(ch + ", " + ch2);      }  }   `

### **d) Boolean Type**

Represents true or false values.

TypeDefault ValueExamplebooleanfalseboolean b=true;

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   public class Demo {      public static void main(String[] args) {          boolean t = true;          boolean f = false;          System.out.println(t + ", " + f);      }  }   `

**3\. Reference (Non-Primitive) Data Types**
--------------------------------------------

*   Used to store **references to objects**.
    
*   Examples include **Strings, Arrays, Classes, and Interfaces**.
    
*   A reference variable points to the memory address of an object rather than holding the actual value.
    

**Example:**

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   String str = "Hello World";  System.out.println(str);   `

> str is a reference variable pointing to a String object.

**4\. Type Casting in Java**
----------------------------

Type casting is converting one data type into another.

### **a) Widening (Automatic) Type Conversion**

*   Converts a smaller type to a larger type.
    
*   **Automatic** by Java.
    
*   Examples: byte → short → int → long → float → double
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   int i = 100;  double d = i; // automatic conversion   `

### **b) Narrowing (Explicit) Type Conversion**

*   Converts a larger type to a smaller type.
    
*   **Requires explicit casting** by the programmer.
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   double d = 100.5;  int i = (int) d; // explicit conversion   `
