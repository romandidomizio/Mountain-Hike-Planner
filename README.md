# OOAD-Semester-Project

#### Title: Mountain Hike Planner

#### Team Members:
- Roman Di Domizio
- Aaron Asibbey

#### Description:
The Mountain Hike Planner is a straightforward Java application aimed at helping hikers quickly select a trail and prepare a gear checklist. Focused on simplicity and ease of use, this desktop application allows users to browse a curated list of trails, view essential trail details, and generate a gear checklist customized to the selected trail’s requirements. This tool is designed for novice hikers or those seeking a quick way to plan day hikes without the need for extensive research or preparation.

#### Language Choice: Java

#### Known Libraries/Frameworks:
- **JavaFX**: For creating the graphical user interface (GUI).
- **Jackson**: For simple JSON processing to manage trail data and user-generated checklists.

#### Functional Elements:
1. **Trail Selection Interface**: A minimalistic interface allowing users to browse and select a trail, showcasing basic details like distance, elevation gain, and estimated completion time.
2. **Gear Checklist Generator**: Based on the selected trail, automatically generate a basic checklist of recommended gear items.
3. **Trail Data Management**: Manage the underlying JSON-based storage of trail data, allowing for the addition, removal, and updating of trail information.
4. **User Interface for Checklist Customization**: Enable users to add personal items to the automatically generated gear checklist and save their customized lists for future reference.

#### Design Patterns to Implement:
1. **Singleton Pattern**: To manage a single instance of the application's main window and trail data source.
2. **Factory Pattern**: For creating instances of different types of checklist items, standardizing the way items are added to the checklist.
3. **Observer Pattern**: To update the checklist display in real-time as users customize their list.
4. **Strategy Pattern**: Implemented in the selection of gear items, allowing for different strategies based on trail difficulty and length.
