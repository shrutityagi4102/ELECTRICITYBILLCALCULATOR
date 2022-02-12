# ELECTRICITY BILL CALCULATOR

As part of our Object Oriented Programming Internal Assesment, Varshaah and I made an Electricity Bill Calculator in Java using Inheritance

ComputerElectricityBill.java has our code

OOPM IA 2.mp4 has a video we made explaining what Inheritance is, different types of Inheritance, it's advantages and disadvantages and finally, our problem statement and how we solved it using Inheritance

## Problem Definition

On entering the units of electricity consumed, the task is to calculate the electricity bill with the help of the below charges :
- Less Than 100 units – 1.20 INR PER UNIT
- 100 to 300 units – 2.00 INR PER UNIT
- More Than 300 units – 3.00 INR PER UNIT 

## Code Explanation

We used the concept of inheritance in this code. The parent class is CalculateBill. It has a double variable. This class contains a function, Bill, to calculate the bill generated. This function Bill has an input parameter of type long, which is used to store the units. The calculated bill is stored in a variable called billpay.

Now, the child class, ComputeElectricityBill, is declared. This class is derived from the class CalculateBill. The number of units consumed is taken as input from the user. Then an object of the class ComputeElectricityBill is created. Using this object, we access the function Bill, which belongs to the class CalculateBill. The bill is calculated using this function and displayed.

## Working Explained using a flowchart 

<img width="763" alt="Screenshot 2022-02-12 at 7 34 15 PM" src="https://user-images.githubusercontent.com/71224019/153714492-37ea42a6-0cb4-4e2a-a665-bdd3343067d7.png">

## Algorithm

1. Start
2. Create a class to calculate the electricity bill
   - Declare a variable to store the calculated bill
   - Create a function to calculate the electricity bill
       -- If units consumed < 100: bill = units*1.20
       -- If 100 < units consumed < 300: bill = (units*1.20) + (units-100)*2
       -- If units consumed > 300: bill = (100*1.20) + (200 *2) + (units-300)*3
3. Create a child class inherited from the above class (parent class)
   - Declare a variable to store the units
   - Take the number of units consumed from the user 
   - Create an object of the class ComputeElectricityBill
   - Call the function to calculate the electricity bill, which belongs to the parent class
   - Display the calculated electricity bill

## Class Diagram

<img width="759" alt="Screenshot 2022-02-12 at 7 37 36 PM" src="https://user-images.githubusercontent.com/71224019/153714595-840ae404-bb39-42c9-ad24-b62e44049d71.png">


