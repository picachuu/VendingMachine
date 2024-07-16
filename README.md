## Pizza Vending Machine Factory Application

<p align="justify">
The Pizza Vending Machine Factory application allows users to create and test pizza vending machines. The application provides features for both creating custom pizza vending machines and managing their operations and maintenance.
</p>

## Prerequisites
- Java Development Kit (JDK) 8 or higher must be installed. You can download it from [here](https://www.oracle.com/java/technologies/javase-downloads.html).

## Installation

Clone the repo:

```bash
git clone https://github.com/picachuu/VendingMachine.git
```

Compile the Java files:

```bash
javac MCOMain.java
```

Run the application:

```bash
java MCOMain
```

## Usage
Users can navigate through the application to explore the range of features offered. Key features include:

- **Create a Vending Machine**: Select "Create a Vending Machine" to choose between a Regular Vending Machine and a Special Vending Machine for pizzas.
- **Test a Vending Machine**: Select "Test a Vending Machine" to access vending features and maintenance features for testing purposes.

## Application Structure
The application is structured with various classes and forms to manage different functionalities. Here are some key components:

- **Main Class (MCOMain.java)**
  - Entry point of the application. Initializes and connects all views and controllers.

- **Views**
  - `VMView.java`: Main view of the application.
  - `CreateMenu.java`: View for creating vending machines.
  - `TestMenu.java`: View for testing vending machine features.
  - `ManageMoney.java`: View for managing the money in the vending machine.
  - `PizzaMake.java`: View for creating custom pizzas in the special vending machine.

- **Controllers**
  - `VMController.java`: Manages interactions between the views and the model.

- **Models**
  - `Item.java`: Represents an item in the vending machine.
  - `Money.java`: Manages the financial aspects of the vending machine.

## Maintenance Features
- **Product Management**: Add, remove, and update items in the vending machine.
- **Money Management**: Replenish and collect money from the vending machine.
- **Summary of Transactions**: Print and view the summary of transactions to keep track of sales and inventory.

#### Notes
- Ensure all Java dependencies are properly configured in your development environment.
- Refer to the comments and documentation within the code for additional details on the functionality of specific classes and methods.
