# Geometry Drawing Program

![Project Image](https://braydonwang.github.io/geometry.png)

> This is my Geometry Drawing Project created for my ICS4UE course

---

## Description

A geometry drawer that uses object oriented programming to draw a variety of different shapes on a 2D cartesian plane. The program takes input from the user through the console and has features including adding a shape, removing a shape, translating a shape, translating the drawing, saving the drawing to a file, and loading a drawing from a file.

#### List of Shapes and Features

- Square
  - Side Length
  - Coordinates (x,y)
- Circle
  - Radius
  - Coordinates (x,y)
- Rectangle
  - Length
  - Width
  - Coordinates (x,y)
- Ellipse
  - Major Axis Radius
  - Minor Axis Radius
  - Coordinates (x,y)
- Triangle
  - Base
  - Height
  - Coordinates (x,y)
- Trapezoid
  - Top Base
  - Bottom Base
  - Height
  - Coordinates (x,y)
- Parallelogram
  - Base
  - Side Length
  - Height
  - Coordinates (x,y)
- Rhombus
  - Base
  - Height
  - Coordinates (x,y)

#### Filter Invalid Input

The program itself filters invalid input pertaining to errors such as parallelogram/rhombus dimension exceptions (height must be less than or equal to side length) and negative side length exceptions. When this occurs, the program throws an exception, warns the user, and asks them to input a valid value instead.

#### Language

- Java

#### Java Docs

All classes and methods are commented using Java Docs and can be viewed through the HTMl files in the folder.

#### Violet UML

Also included in this repository is the Violet UML diagram that I created during the planning stage of this project. It helped me visualize all of the different classes that inherit each other and how everything comes together in one seamless framework.


