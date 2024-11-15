# Hotel Reservation System
A Hotel Reservation System designed in Java to streamline the process of room reservations in a hotel. 
The system allows users to reserve rooms, view current reservations, update bookings, and delete reservations through a console-based interface. 
The project integrates a MySQL database for storing and managing reservation data, utilizing JDBC for database connectivity.


## Features
- **Reserve a Room:** Users can book a room by providing guest details, room number, and contact information.
- **View Reservations:** Display all existing reservations with details like reservation ID, guest name, room number, and reservation date.
- **Get Room Number:** Retrieve the room number associated with a specific reservation by providing the reservation ID and guest name.
- **Update Reservation:** Modify existing reservation details, such as guest name, room number, and contact information.
- **Delete Reservation:** Remove a reservation from the system by providing the reservation ID.
- **Exit:** Gracefully exit the system.

## Technologies Used
- **Java:** Core programming language for building the system.
- **JDK:**: Java Development Kit (JDK 18 or later) to compile and run the program
- **JDBC:** Java Database Connectivity for interacting with the MySQL database.
- **MySQL:** Database for storing reservation details.
- **IntelliJ IDEA:** Integrated Development Environment (IDE) for coding and debugging.
- **Dotenv:** Java Dependency for managing environment variables like database credentials.
  
### -- High Level Design --
![High Level Design](https://github.com/user-attachments/assets/0f5b3b88-3c18-4eab-846b-91643f898295)

### -- Sequence Diagram --
![Sequence Diagram](https://github.com/user-attachments/assets/24a1d71c-df6f-45fa-8352-f84459a65ae0)


## How to Set Up

### 1. Clone the repository:
  ```bash
    git clone https://github.com/ANSHIKA010/hotel_reservation_system.git
  ```

### 2. Database Setup:

- Ensure that MySQL is installed and running on your machine.
- Create a database and the necessary tables for storing reservations using the mysql [dump file](./database/hotel_db_reservation.sql) present in database folder.

### 3. Configure Environment Variables:

- Use the .env.example file to configure the database connection details.

### 4. Run the Application:

- Open the project in IntelliJ IDEA or any Java IDE.
- Use JDK(18 or later) to compile and run the program.
- Ensure the required MySQL JDBC driver is added to the project dependencies.
- Run the Main class to start the system.

## How to Use
Once the system starts, a menu will be displayed with options:

```markdown
HOTEL MANAGEMENT SYSTEM
1. Reserve a room
2. View Reservations
3. Get Room Number
4. Update Reservation
5. Delete Reservation
0. Exit
Select the desired option by entering the corresponding number and follow the prompts.
```

### Example Operations

#### 1. Reserving a Room
- Enter 1
- Enter guest details (name room_number contact_number).
  
The system will confirm if the reservation is successful.

#### 2. Viewing Reservations
- Enter 2
  
Displays a list of all active reservations with their details in a table format.

#### 3. Get Room Details
- Enter 3
- Enter room_number

Get the guest details of the entered room number.

#### 4. Updating Reservation
- Enter 4
- Enter reservation details (ReservationId guest_name room_number contact_number)
  
Modify the guest name, room number, or contact number for an existing reservation.

### 5. Deleting a Reservation
- Enter 5
- Enter reservation_id
  
Permanently delete a reservation by providing the reservation ID.

### 6. Exiting the system
- Enter 0
  
To exit the system.

### -- User Flow --
![User Flow](https://github.com/user-attachments/assets/94eb0b66-3c0e-4ab4-b7f3-efd032ca96ba)



## Project Structure

```bash
  hotel_reservation_system/
  │
  |   .env                              # Environment file for sensitive information.
  |   .env.example                      # Environment file example.
  |   .gitIgnore
  |   hotel_reservation_system.iml        
  |
  +---database
  |       hotel_db_reservation.sql      # MySQL database dump file to initialize the DB.
  |
  +---lib                               # Contains the libraries used for the project.
  |       dotenv-java-3.0.2.jar
  |       mysql-connector-java-8.0.28.jar
  |       protobuf-java-3.11.4.jar
  |
  +---out
  |   \---production
  |       \---hotel_reservation_system
  |               Main.class
  |
  \---src
          Main.java                      # Entry point of the application
  
```

## Future Improvements
- Add a graphical user interface (GUI) for a more user-friendly experience.
- Implement user authentication for better security.
- Allow dynamic pricing and availability checks for rooms.
