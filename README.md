# 🟦 Object-Oriented Programming with Java

This repository demonstrates the lessons I have in Batangas State University - Malvar Campus and also the **four pillars of Object-Oriented Programming (OOP)** in Java:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

It includes beginner-friendly examples and explanations to help you understand how Java uses classes and objects to model real-world concepts.

---

## 📖 What is OOP?

**Object-Oriented Programming (OOP)** is a programming paradigm where software is organized into **objects**.  
Each object represents a concept and contains:

- **Attributes (fields)** → data about the object
- **Methods (behaviors)** → actions the object can perform

This makes programs more **modular, reusable, and easier to maintain**.

---

## 🧱 The Four Pillars of OOP in Java

### 1. Encapsulation

- **Definition**: Hiding data inside a class and exposing it through controlled methods.
- **Benefit**: Protects object state.
- **Example**:

  ```java
  public class BankAccount {
      private double balance;

      public BankAccount(double initialBalance) {
          this.balance = initialBalance;
      }

      public void deposit(double amount) {
          balance += amount;
      }

      public double getBalance() {
          return balance;
      }
  }
  ```

### 2. Inheritance

- **Definition**: A child class inherits fields and methods from a parent class.
- **Benefit**: Promotes code reuse.
- **Example**:

  ```java
  class Animal {
      void eat() {
          System.out.println("This animal eats food.");
      }
  }

  class Dog extends Animal {
      void bark() {
          System.out.println("Woof!");
      }
  }
  ```

### 3. Polymorphism

- **Definition**: An object can take many forms (method overriding / overloading).
- **Benefit**: Makes systems flexible and extensible.
- **Example**:

  ```java
  class Animal {
    void makeSound() {
        System.out.println("Some sound...");
    }
  }

  class Cat extends Animal {
      @Override
      void makeSound() {
          System.out.println("Meow!");
      }
  }

  // Usage
  Animal a = new Cat();
  a.makeSound(); // Meow!
  ```

### 4. Abstraction

- **Definition**: Hiding implementation details and exposing only the necessary interface.
- **Benefit**: Simplifies complexity.
- **Example**:

```java
abstract class Shape {
   abstract double area();
}

class Circle extends Shape {
   private double radius;

   Circle(double radius) {
       this.radius = radius;
   }

   @Override
   double area() {
       return Math.PI * radius * radius;
   }
}

<div align="center">
 <h2>CREATED BY: CYRUS WILSON</h2>
</div>
```
