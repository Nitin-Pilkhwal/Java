# Wrapper Class in Java

Wrapper classes in Java provide a way to use primitive data types as objects. They wrap the primitive values and provide useful methods to manipulate them. This readme file will guide you through the basics of wrapper classes in Java.

## Table of Contents
- [Introduction](#introduction)
- [Wrapper Classes](#wrapper-classes)
- [Need to Wrapper Classes](#need-to-wrapper-class)
- [Autoboxing and Unboxing](#autoboxing-and-unboxing)
- [Common Methods](#common-methods)
- [Conclusion](#conclusion)

## Introduction
In Java, primitive data types like `int`, `char`, `boolean`, etc., are not objects. Wrapper classes provide a solution to this problem by wrapping the primitive values and providing additional functionality.

## Wrapper Classes
Java provides a set of wrapper classes for each primitive data type. The wrapper classes are as follows:
- `Integer` for `int`
- `Double` for `double`
- `Character` for `char`
- `Boolean` for `boolean`
- and so on...

## Need to wrapper class
<li> THe calssses in java.util package handle only objects and hence wrapper classes help in this case also.</li>
<li> Data Structures in collection framework such as ArrayList, Vector etc. Store only object (referene types ) and not primitive type.</li>
<li> An object is needed to support synchronization in multithreading.</li>

## Autoboxing and Unboxing
Autoboxing is the automatic conversion of primitive types to their corresponding wrapper classes, and unboxing is the reverse process. Java automatically performs autoboxing and unboxing when necessary, making it convenient to work with wrapper classes.

## Common Methods
Wrapper classes provide various methods to manipulate the wrapped values. Some common methods include:
- `valueOf()` - creates a wrapper object from a primitive value or a string representation
- `intValue()` - returns the wrapped value as an `int`
- `doubleValue()` - returns the wrapped value as a `double`
- `toString()` - returns a string representation of the wrapped value
- and many more...

For detailed information about the methods and functionalities of each wrapper class, refer to the official Java documentation.

## Conclusion
Wrapper classes in Java are essential when we need to treat primitive data types as objects. They provide a convenient way to work with primitive values and offer additional functionality. Understanding wrapper classes is crucial for Java developers.
