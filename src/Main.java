import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.Scanner;
import java.sql.Statement;
import java.sql.ResultSet;
public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "AnshikaSql123";

    public static void main(String[] args) throws ClassNotFoundException, SQLException{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connection = DriverManager.getConnection(url, username, password));
            while(true) {
                System.out.println();
                System.out.println("HOTEL MANAGEMENT SYSTEM");
                Scanner scanner = new Scanner(System.in);
                System.out.println("1. Reserve a room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        reserveRoom(connection, scanner);
                        break;
//                    case 2:
//                        viewReservations(connection);
//                        break;
//                    case 3:
//                        getRoomNumber(connection, scanner);
//                        break;
//                    case 4:
//                        updateReservation(connection, scanner);
//                        break;
//                    case 5:
//                        deleteReservation(connection, scanner);
//                        break;
//                    case 0:
//                        exit();
//                        scanner.close();
//                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }

            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

        private static void reserveRoom(Connection connection, Scanner scanner) {
            try {
                System.out.print("Enter guest name: ");
                String guestName = scanner.next();
                scanner.nextLine();
                System.out.print("Enter room number: ");
                int roomNumber = scanner.nextInt();
                System.out.print("Enter contact number: ");
                String contactNumber = scanner.next();

                String sql = "INSERT INTO reservation(guest_name, room_number, contact_number) " +
                        "VALUES ('" + guestName + "', " + roomNumber + ", '" + contactNumber + "')";

                try (Statement statement = connection.createStatement()) {
                    int affectedRows = statement.executeUpdate(sql);

                    if (affectedRows > 0) {
                        System.out.println("Reservation successful!");
                    } else {
                        System.out.println("Reservation failed.");
                    }
                }
            }
                catch (SQLException e) {
                    e.printStackTrace();
                }
        }



    }