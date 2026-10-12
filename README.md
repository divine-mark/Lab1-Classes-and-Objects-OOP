Author
Divine Mark Makhomeya
H250333E Object Oriented Programming
Monday 12 October 2026


# Object-Oriented Programming in Java — Lab 1: Classes and Objects

    This repository contains my solutions for **Lab 1** of the OOP in Java lab manual.  
    The lab introduces the fundamentals of classes, objects, references, aliasing, and `null` handling.

    ## Lab Objectives
    - Define a class with fields (state) and methods (behaviour).
    - Create objects with `new` and access members with the dot operator.
    - Understand that object variables hold **references**, not the objects themselves.
    - Recognise `null` and avoid `NullPointerException`.

## Exercises

### Exercise 1 & 2: `Car` Class
    - `Car` class with fields `brand`, `year`, `mileage`.
    - `display()` method prints the car details.
    - `isAntique()` method returns `true` if the car is more than 25 years old.
    - Created three cars and printed their details and antique status.

    **Expected Output:**
    Toyota 1998 150000.0 km
    Honda 2010 90000.0 km
    Ford 2005 120000.0 km
    Toyota antique? true
    Honda antique? false
    Ford antique? false



### Exercise 3: `Rectangle` Class
    - `Rectangle` class with `width`, `height`, `area()`, and `perimeter()`.
    - Created an array of 5 rectangles.
    - Found and printed the rectangle with the largest area.

    **Expected Output:**
    Largest rectangle:
    width = 5.0
    height = 5.0
    area = 25.0
    perimeter = 20.0



### Exercise 4: Reference Aliasing
    - Demonstrated that `Rectangle r2 = r1;` copies the **reference**, not the object.
    - Changing `r2.width` also changes `r1.width`.
    - Explained why `r1 == r2` is `true`.

    **Expected Output:**
    r1.width = 10.0
    r2.width = 10.0
    r1 == r2? true



### Exercise 5: `Address` and `Person` (Chained Dot and `null`)
    - `Address` and `Person` classes where `Person` has an `Address`.
    - Printed a person’s city using a chained dot expression: `person.address.city`.
    - Showed what happens when `address` is `null` and how to handle it safely.

    **Expected Output:**
    Tariro lives in Harare
    Farai has no address on file



## Files
- `Car.java` — Exercises 1 & 2
- `Rectangle.java` — Exercise 3
- `RectangleAliasDemo.java` — Exercise 4
- `AddressPersonDemo.java` — Exercise 5

