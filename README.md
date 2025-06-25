# 🔥 Smart Kitchen Appliance Factory

A Java implementation of a smart kitchen system demonstrating **SOLID principles**, **Factory Design Pattern**, and **Object-Oriented Programming** concepts through an interchangeable cooking method system.

## 📋 Table of Contents
- [Problem Statement](#problem-statement)
- [Features](#features)
- [Design Patterns Used](#design-patterns-used)
- [SOLID Principles Applied](#solid-principles-applied)
- [Project Structure](#project-structure)
- [How to Run](#how-to-run)
- [Usage Examples](#usage-examples)
- [Contributing](#contributing)

## 🎯 Problem Statement

Design a smart kitchen system where appliances can be controlled centrally and have **interchangeable cooking methods**. The system should support different types of cooking technologies that can be easily swapped without modifying the core appliance logic.

### Core Requirements
- ✅ Appliances with replaceable cooking methods
- ✅ Support for Gas, Electric, and Smart cooking technologies
- ✅ Temperature control (0°C to 300°C in 25°C increments)
- ✅ Power management (turn on/off functionality)
- ✅ Intelligent cooking method selection for Smart mode
- ✅ Factory pattern for appliance and cooking method creation

## ⭐ Features

### 🏠 **Appliance Operations**
- **Power Control**: Turn appliances on/off
- **Temperature Management**: Increase/decrease heat with validation
- **Method Swapping**: Replace cooking methods at runtime
- **Status Monitoring**: Track appliance state and temperature

### 🔥 **Cooking Methods**
- **Gas Cooking**: Traditional flame-based heating
- **Electric Cooking**: Induction/electric coil heating  
- **Smart Cooking**: AI-powered hybrid system
  - Uses Electric below 150°C (energy efficient)
  - Uses Gas above 150°C (faster heating)
  - Automatic optimization for energy efficiency

### 🏭 **Factory System**
- **Appliance Factory**: Creates configured appliances
- **Cooking Method Factory**: Instantiates specific cooking technologies
- **Easy Extension**: Add new cooking methods without code modification

## 🏗️ Design Patterns Used

| Pattern | Implementation | Purpose |
|---------|---------------|---------|
| **Factory Pattern** | `ApplianceFactory`, `CookingMethodFactory` | Create objects without specifying exact classes |
| **Strategy Pattern** | `CookingMethod` interface | Interchangeable cooking algorithms |
| **Composition** | `Stove` contains `CookingMethod` | Favor composition over inheritance |

## 🎯 SOLID Principles Applied

### 🔸 **S** - Single Responsibility Principle
- `Stove`: Manages appliance state and operations
- `CookingMethod`: Handles specific heating logic
- `Logger`: Manages logging operations
- `Factory`: Creates and configures objects

### 🔸 **O** - Open/Closed Principle
- ✅ **Open for extension**: Easy to add new cooking methods
- ✅ **Closed for modification**: No need to change existing code

### 🔸 **L** - Liskov Substitution Principle
- All `CookingMethod` implementations are interchangeable
- Smart cooking can substitute any cooking method

### 🔸 **I** - Interface Segregation Principle
- Focused interfaces: `StoveInterface`, `CookingMethod`
- No forced implementation of unused methods

### 🔸 **D** - Dependency Inversion Principle
- `Stove` depends on `CookingMethod` interface, not concrete classes
- High-level modules don't depend on low-level modules
