# Sales-Project
A Java sales system that models a shop selling products, services and warranties. It handles customer purchases, refunds and running totals, and calculates delivery costs for products.

## Built With
* Java
* JUnit
* Eclipse

## Project Structure
* **Saleable** is an interface that every sellable item implements
* **Product**, **Service** and **Warranty** are the items that can be sold
* **Transaction** is an abstract class that all transactions extend
* **Purchase** and **Refund** extend Transaction
* **Customer** stores transactions and calculates the running total
* **CustomerTest** contains the JUnit tests
* **Main** runs an example set of purchases and a refund

## How to Run
1. Download this repository by clicking Code and then Download ZIP
2. Extract the ZIP file
3. Open Eclipse and choose File, then Import, then Existing Projects into Workspace
4. Select the extracted Sales folder
5. Open Main.java in the src folder and press Run

## Running the Tests
Right click CustomerTest.java and choose Run As, then JUnit Test.

## About
This project helped me learn the core principles of object oriented programming, including interfaces, abstract classes, inheritance and unit testing.
