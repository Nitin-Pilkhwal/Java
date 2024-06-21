# Polymorphism in Java

This is a brief guide on understanding and implementing polymorphism in Java.

## Table of Contents
- [What is Polymorphism?](#what-is-polymorphism)
- [Types of Polymorphism](#types-of-polymorphism)

## What is Polymorphism?
Polymorphism is a fundamental concept in object-oriented programming that allows objects of different classes to be treated as objects of a common superclass. It enables code reusability, flexibility, and extensibility.

## Types of Polymorphism
There are two types of polymorphism in Java:
1. Compile-time Polymorphism (Method Overloading): This occurs when multiple methods with the same name but different parameters are defined in a class.
2. Runtime Polymorphism (Method Overriding): This occurs when a subclass provides its own implementation of a method that is already defined in its superclass.
## Method Overriding
Method overriding is a type of runtime polymorphism where a subclass provides its own implementation of a method that is already defined in its superclass. The method in the subclass must have the same name, return type, and parameters as the method in the superclass. By overriding a method, you can provide a specialized implementation for the subclass.


## Method Overloading
Method overloading is a type of compile-time polymorphism where multiple methods with the same name but different parameters are defined in a class. The methods must have different parameter lists, which can include different types or different numbers of parameters. The compiler determines which method to call based on the arguments passed during the method invocation.

## Note
In Java, non-static inner classes have an implicit reference to an instance of the outer class. This means you can't instantiate them without first having an instance of the outer class.