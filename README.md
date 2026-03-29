# 🧺 Smart Laundry Management System

## 📌 Introduction

The **Smart Laundry Management System** is a Java-based console application designed to simplify and automate laundry operations in small-scale environments such as hostels and apartment complexes.

Traditional laundry systems rely on manual record-keeping, which is inefficient and prone to errors. This project provides a digital solution to manage laundry orders, track their progress, and maintain records effectively.

---

## 🎯 Problem Statement

In many hostels and apartment complexes, laundry services are managed manually using registers or informal methods. This leads to:

- ❌ Mismanagement of clothes  
- ❌ Difficulty in tracking order status  
- ❌ Data loss and human errors  
- ❌ Inefficient handling of multiple orders  

This project solves these issues by providing a structured and automated system.

---

## 🎯 Objectives

- To automate the laundry management process  
- To provide a user-friendly interface for placing orders  
- To implement dynamic pricing based on service and cloth type  
- To store and retrieve data using file handling  
- To improve efficiency and reduce manual errors  
- To create a scalable system for future enhancements  

---

## 🧠 System Overview

This system allows users to:

- Place laundry orders  
- View all existing orders  
- Update order status (admin functionality)  
- Automatically calculate price  

It uses file handling to store data permanently, ensuring that orders are not lost after program execution.

---

## 🚀 Features

- 📦 Place new laundry orders  
- 👀 View all orders  
- 🔄 Update order status (Pending → Washing → Completed)  
- 🧾 Dynamic pricing system  
- 🧵 Supports multiple services:
  - Wash  
  - Iron  
  - Wash + Iron  
- 👕 Supports cloth types:
  - Normal  
  - Woolen  
- 💾 File-based persistent storage  
- 🔁 Auto-loads previous data on restart  

---

## 🏗️ System Architecture

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

## 🧩 Project Structure
