# Design Patterns Demonstration Project

## Overview
This repository contains a Java-based implementation of various design patterns, developed as part of a coding exercise for a placement preparation program. The project showcases six design patterns—Behavioral, Creational, and Structural—using space-themed use cases to demonstrate real-world applicability. The code adheres to global best practices, including SOLID principles, logging, exception handling, and performance optimization.

This project was created based on the guidelines outlined in the "2025-26 Coding Exercises" PDF provided for the placement training, completed on September 28, 2025, by Kabil.

## Project Structure

design-patterns-demo/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── example/
│                   └── designpatterns/
│                       ├── Main.java          (Entry point for the demo)
│                       ├── demos/             (Demo classes for each pattern)
│                       ├── behavioral/        (Strategy and Observer patterns)
│                       ├── creational/        (Singleton and Factory patterns)
│                       ├── structural/        (Adapter and Decorator patterns)
├── target/                (Compiled .class files)
└── README.md             (This file)


## How to Run
1. **Prerequisites**: Ensure Java JDK 21+ is installed. Verify with `java -version`.
2. **Compile**:
   - Navigate to the project directory: `cd C:\Users\kabil\OneDrive\Desktop\design-patterns-demo`
   - Create the output directory and compile all files:
     ```bash
     mkdir target\classes
     javac -sourcepath src/main/java -d target/classes ^
     src/main/java/com/example/designpatterns/Main.java ^
     src/main/java/com/example/designpatterns/demos/AdapterDemo.java ^
     src/main/java/com/example/designpatterns/demos/DecoratorDemo.java ^
     src/main/java/com/example/designpatterns/demos/FactoryDemo.java ^
     src/main/java/com/example/designpatterns/demos/ObserverDemo.java ^
     src/main/java/com/example/designpatterns/demos/SingletonDemo.java ^
     src/main/java/com/example/designpatterns/demos/StrategyDemo.java ^
     src/main/java/com/example/designpatterns/behavioral/observer/GroundStation.java ^
     src/main/java/com/example/designpatterns/behavioral/observer/Observer.java ^
     src/main/java/com/example/designpatterns/behavioral/observer/Satellite.java ^
     src/main/java/com/example/designpatterns/behavioral/strategy/AvoidObstacleNavigation.java ^
     src/main/java/com/example/designpatterns/behavioral/strategy/DirectNavigation.java ^
     src/main/java/com/example/designpatterns/behavioral/strategy/NavigationStrategy.java ^
     src/main/java/com/example/designpatterns/behavioral/strategy/Rover.java ^
     src/main/java/com/example/designpatterns/creational/factory/CargoRocket.java ^
     src/main/java/com/example/designpatterns/creational/factory/CargoRocketFactory.java ^
     src/main/java/com/example/designpatterns/creational/factory/PassengerRocket.java ^
     src/main/java/com/example/designpatterns/creational/factory/PassengerRocketFactory.java ^
     src/main/java/com/example/designpatterns/creational/factory/Rocket.java ^
     src/main/java/com/example/designpatterns/creational/factory/RocketFactory.java ^
     src/main/java/com/example/designpatterns/creational/singleton/MissionControl.java ^
     src/main/java/com/example/designpatterns/structural/adapter/NewSensor.java ^
     src/main/java/com/example/designpatterns/structural/adapter/OldSensor.java ^
     src/main/java/com/example/designpatterns/structural/adapter/SensorAdapter.java ^
     src/main/java/com/example/designpatterns/structural/decorator/BasicSpaceship.java ^
     src/main/java/com/example/designpatterns/structural/decorator/ShieldDecorator.java ^
     src/main/java/com/example/designpatterns/structural/decorator/Spaceship.java ^
     src/main/java/com/example/designpatterns/structural/decorator/SpaceshipDecorator.java ^
     src/main/java/com/example/designpatterns/structural/decorator/WeaponDecorator.java

    
Run:
Execute the program:
bashjava -cp target/classes com.example.designpatterns.Main

A menu will appear with options 1-6 to run different pattern demos and 0 to exit.


Test Cases and Results
The following test cases were executed to validate the functionality of each design pattern demonstration.

Strategy Pattern (Option 1)

Input: Select 1
Output: Navigating directly to (5, 5) and Navigating to (5, 5) while avoiding obstacles
Verdict: Pass


Observer Pattern (Option 2)

Input: Select 2
Output: No alert at 50%, alerts at 10% from both stations
Verdict: Pass


Singleton Pattern (Option 3)

Input: Select 3
Output: Instances are the same: true and Mission Control sending: Initiate launch sequence
Verdict: Pass


Factory Method Pattern (Option 4)

Input: Select 4
Output: Launching Cargo Rocket with supplies and Launching Passenger Rocket with crew
Verdict: Pass


Adapter Pattern (Option 5)

Input: Select 5
Output: Adapted sensor data: 123
Verdict: Pass


Decorator Pattern (Option 6)

Input: Select 6
Output: Basic Spaceship, with Shield, with Weapons costs $1500000.0
Verdict: Pass


Edge Cases

Invalid Strategy: Setting null strategy throws IllegalStateException.
Invalid Battery Level: Setting -5 or 150 throws IllegalArgumentException.
Invalid Command: Empty command to MissionControl throws IllegalArgumentException.
Invalid Sensor Data: Malformed data throws exception with warning log.
Null Decoration: Passing null to decorator throws IllegalArgumentException.
Verdict: All edge cases handled correctly.
