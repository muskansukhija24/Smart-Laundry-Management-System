#  Smart Laundry Management System

![Java](https://img.shields.io/badge/Language-Java-blue)
![Status](https://img.shields.io/badge/Project-Completed-brightgreen)
![Platform](https://img.shields.io/badge/Platform-Console-lightgrey)
![License](https://img.shields.io/badge/License-Educational-orange)

##  Introduction

The **Smart Laundry Management System** is a Java-based console application designed to simplify and automate laundry operations in small-scale environments such as hostels and apartment complexes.

Traditional laundry systems rely on manual record-keeping, which is inefficient and prone to errors. This project provides a digital solution to manage laundry orders, track their progress, and maintain records effectively.

---

##  Problem Statement

In many hostels and apartment complexes, laundry services are managed manually using registers or informal methods. This leads to:

-  Mismanagement of clothes  
-  Difficulty in tracking order status  
-  Data loss and human errors  
-  Inefficient handling of multiple orders  

This project solves these issues by providing a structured and automated system.

---

##  Objectives

- To automate the laundry management process  
- To provide a user-friendly interface for placing orders  
- To implement dynamic pricing based on service and cloth type  
- To store and retrieve data using file handling  
- To improve efficiency and reduce manual errors  
- To create a scalable system for future enhancements  

---

##  System Overview

This system allows users to:

- Place laundry orders  
- View all existing orders  
- Update order status (admin functionality)  
- Automatically calculate price  

It uses file handling to store data permanently, ensuring that orders are not lost after program execution.

---

##  Features

-  Place new laundry orders  
-  View all orders  
-  Update order status (Pending → Washing → Completed)  
-  Dynamic pricing system  
-  Supports multiple services:
  - Wash  
  - Iron  
  - Wash + Iron  
-  Supports cloth types:
  - Normal  
  - Woolen  
-  File-based persistent storage  
-  Auto-loads previous data on restart  

---

##  System Architecture

The system follows a simple modular architecture:

### 🔹 1. Presentation Layer
- Console-based user interface  
- Handles user input and output  

### 🔹 2. Business Logic Layer
- Managed by `LaundryService.java`  
- Calculates pricing based on logic  

### 🔹 3. Data Layer
- Managed using file handling (`orders.txt`)  
- Stores and retrieves order data  

---

##  Project Structure

```
Smart-Laundry-Management-System/
│
├── src/
│   ├── Main.java
│   ├── Order.java
│   ├── LaundryService.java
│   ├── User.java
│   └── Payment.java
│
├── data/
│   └── orders.txt
│
├── README.md
├── Project_Report.pdf
└── .gitignore
```


##  How It Works

1. The system starts and loads existing orders from the file  
2. A menu is displayed to the user  
3. User selects an option:
   - Place Order  
   - View Orders  
   - Update Status  
4. System processes the request  
5. Data is saved back to file  
6. Program continues until user exits  

---

##  Pricing Mechanism

The pricing is calculated dynamically based on:

- Service Type  
- Cloth Type  

###  Pricing Table:

| Service       | Normal | Woolen |
|--------------|--------|--------|
| Wash         | ₹10    | ₹15    |
| Iron         | ₹5     | ₹8     |
| Wash + Iron  | ₹15    | ₹20    |

###  Logic Explanation:

- Woolen clothes require more care → higher price  
- Combined service (wash + iron) → discounted compared to separate services  

---

##  Sample Output

```
=== Smart Laundry Management System ===

1. Place Order
2. View Orders
3. Update Order Status
4. Exit

Choose option: 1

Enter your name: Muskan
Enter service (wash/iron/wash+iron): wash
Enter cloth type (normal/woolen): normal
Enter quantity: 3

Order placed successfully!
```
##  Highlights

- Simple and user-friendly system  
- Designed for hostels and apartments  
- Dynamic pricing model  
- File-based persistent storage  
- Easy to extend in future
  
##  Testing

The system was tested under different scenarios:

-  Valid inputs  
-  Invalid service types  
-  Multiple orders  
-  File read/write operations  

All test cases were executed successfully.

---

##  Limitations

- Console-based interface (no GUI)  
- No database integration  
- No authentication system  
- Limited scalability  

---

##  Future Enhancements

- GUI using Java Swing or JavaFX  
- Database integration (MySQL)  
- Online payment system  
- Mobile application  
- SMS/Email notifications  
- Multi-user login system  

---

##  User Roles

###  User:
- Place order  
- View order  

###  Admin:
- Update order status  

---

##  Concepts Used

- Object-Oriented Programming (OOP)  
- Classes and Objects  
- File Handling  
- Exception Handling  
- Conditional Logic  

---

##  Author

**Name:** Muskan Sukhija 
**Registration Number:** 24BAI10927
**Project:** Smart Laundry Management System  

---

## 📄 License

This project is created for academic purposes only.
