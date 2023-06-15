# File Management Application

# Overview
This is a sample application that showcases how a file management system functions. Using this program, one can retrieve a list of files from a specific directory, add new files to the directory, remove existing files from the directory, and even search for files within the directory.

# Goals
The application should provide users with the ability to perform the following tasks:
1. View all files within the directory.
2. Add, delete, and search for files.
3. Navigate through various options and have the ability to exit the application.


# Specifications
Java 11.0.19 is used for developing this application. IntelliJ is the IDE used for the development. Git & Github are used for storing and maintaining the source code and tracking the changes.
The File class from the java.io package is used for doing all the file handling. Arrays, Collections, and  List are used for doing the activities like file  listing, sorting, searching etc. Exception handling is used for taking care of any unexpected scenarios.
The application is expecting ‘/var/www/html/files/’ to be present on the server. This is the root folder where this application is going to search/add/delete the files.

# Dataflow
As soon as the application is launched, the user will be able to see a welcome message followed by the application name and the developer name. Then, there will be a message to select the option followed by the options below.

1 - Display Files (Ascending order): This option lists all the files and directories from the main directory.

2 - Manage Files: This option shows all the manage-file options.

3 - Exit: This option is to exit from the application.


If the Manage Files option is selected then the following options will be listed.

1 - Add a file: This option will allow the user to enter a filename and after entering it the file will be saved into the main directory.

2 - Delete a file: This option will ask the user to enter a filename. The entered file will be deleted from the main directory if it is present else it will show an appropriate message.

3 - Search a file: This option will allow the user to enter the filename and the file path will be shown to the user if it is present else it will show an appropriate message.

4 - Back to main menu: This option will take the user to the previous menu.
