# Object Oriented Analysis & Design: Semester Project

## Mountain Hike Planner

## Team Members
- Roman Di Domizio
- Aaron Asibbey

## Project Description
The Mountain Hike Planner is a Java desktop application designed to assist hikers in selecting trails and preparing gear checklists. This tool targets novice hikers and those looking for a quick, easy way to plan day hikes. Users can browse trails, view essential details such as distance and elevation, and generate a customized gear checklist tailored to the selected trail.

## Language and Tools
- **Programming Language**: Java
- **UI Framework**: JavaFX - for creating the graphical user interface.
- **Data Management**: Jackson - for JSON processing to handle trail and checklist data.

## Functional Elements
- **Trail Selection Interface**: Users can view and select from a list of trails, with details like distance, elevation gain, and estimated completion time.
- **Gear Checklist Generator**: Automatically generates a gear checklist based on the trail selected, which users can customize.
- **Trail Data Management**: Allows adding, removing, and updating trail information using a JSON-based storage system.
- **User Interface for Checklist Customization**: Users can modify the checklist by adding personal items and save their configurations for later use.

## Design Patterns
- **Singleton Pattern**: Ensures a single instance of the application's main window and data source throughout the application's lifecycle.
- **Factory Pattern**: Utilized for creating different types of checklist items, ensuring consistency in item creation.
- **Observer Pattern**: Updates the UI in real-time as users add or remove items from their checklist.
- **Strategy Pattern**: Allows the selection logic of gear items to vary based on the difficulty and length of the trail.

## Development Setup
1. **Clone the Repository**: Start by cloning the repo to your local machine.
2. **Install JavaFX**: Ensure JavaFX is installed and properly configured in your development environment.
3. **Set Up Jackson**: Include the Jackson libraries for managing JSON data.
4. **Compile and Run**: Use your IDE (IntelliJ IDEA) to compile the project and run the main application.

## Contribution Guidelines
To contribute to the Mountain Hike Planner, please follow these guidelines:
1. **Fork the Repository**: Make a fork of the project.
2. **Feature Branch**: Create a branch for each new feature or improvement.
3. **Pull Requests**: Submit a pull request from your feature branch to the main project for review.
4. **Code Reviews**: Participate in code reviews to maintain code quality and consistency.

## Project Timeline
- **Phase 1**: Setup and initial implementation (UI setup, basic data handling).
- **Phase 2**: Implementation of core functionalities (trail selection, checklist generation).
- **Phase 3**: Testing and final adjustments.
- **Demo Day**: Prepare for final demo and grading interview.
