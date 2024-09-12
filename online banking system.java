import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BankingSystem {
    private static final String url = "jdbc:mysql://localhost:3306/accounts";
    private static final String username = "root";
    private static final String password = "0077";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nONLINE BANKING SYSTEM");
                System.out.println("1. INSERT (CREATE ACCOUNT)");
                System.out.println("2. DELETE (CLOSE ACCOUNT)");
                System.out.println("3. SELECT (VIEW ACCOUNTS)");
                System.out.println("4. UPDATE (UPDATE ACCOUNT DETAILS)");
                System.out.println("5. EXIT");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        createAccount(connection, scanner);
                        break;
                    case 2:
                        deleteAccount(connection, scanner);
                        break;
                    case 3:
                        viewAccounts(connection);
                        break;
                    case 4:
                        updateAccount(connection, scanner);
                        break;
                    case 5:
                        exit();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        } catch (SQLException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void createAccount(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Customer Name: ");
            String customerName = scanner.next();
            scanner.nextLine();
            System.out.print("Enter Account Number: ");
            int accountNumber = scanner.nextInt();
            System.out.print("Enter Address: ");
            String address = scanner.next();

            String sql = "INSERT INTO accounts (customer_name, account_number, address) " +
                    "VALUES ('" + customerName + "', " + accountNumber + ", '" + address + "')";

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);
                if (affectedRows > 0) {
                    System.out.println("Account created successfully!");
                } else {
                    System.out.println("Account creation failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void deleteAccount(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Account ID to delete: ");
            int accountId = scanner.nextInt();

            if (!accountExists(connection, accountId)) {
                System.out.println("Account not found for the given ID.");
                return;
            }

            String sql = "DELETE FROM accounts WHERE account_id = " + accountId;

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);
                if (affectedRows > 0) {
                    System.out.println("Account deleted successfully!");
                } else {
                    System.out.println("Account deletion failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewAccounts(Connection connection) throws SQLException {
        String sql = "SELECT account_id, customer_name, account_number, address, creation_date FROM accounts";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            System.out.println("Current Accounts:");
            System.out.println("+------------+-----------------+----------------+-------------------+-------------------------+");
            System.out.println("| Account ID | Customer Name    | Account Number | Address           | Creation Date           |");
            System.out.println("+------------+-----------------+----------------+-------------------+-------------------------+");

            while (resultSet.next()) {
                int accountId = resultSet.getInt("account_id");
                String customerName = resultSet.getString("customer_name");
                int accountNumber = resultSet.getInt("account_number");
                String address = resultSet.getString("address");
                String creationDate = resultSet.getTimestamp("creation_date").toString();

                System.out.printf("| %-10d | %-15s | %-14d | %-17s | %-23s |\n",
                        accountId, customerName, accountNumber, address, creationDate);
            }

            System.out.println("+------------+-----------------+----------------+-------------------+-------------------------+");
        }
    }

    private static void updateAccount(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter Account ID to update: ");
            int accountId = scanner.nextInt();
            scanner.nextLine();

            if (!accountExists(connection, accountId)) {
                System.out.println("Account not found for the given ID.");
                return;
            }

            System.out.print("Enter new Customer Name: ");
            String newCustomerName = scanner.nextLine();
            System.out.print("Enter new Account Number: ");
            int newAccountNumber = scanner.nextInt();
            System.out.print("Enter new Address: ");
            String newAddress = scanner.next();

            String sql = "UPDATE accounts SET customer_name = '" + newCustomerName + "', " +
                    "account_number = " + newAccountNumber + ", " +
                    "address = '" + newAddress + "' " +
                    "WHERE account_id = " + accountId;

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);
                if (affectedRows > 0) {
                    System.out.println("Account updated successfully!");
                } else {
                    System.out.println("Account update failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean accountExists(Connection connection, int accountId) {
        try {
            String sql = "SELECT account_id FROM accounts WHERE account_id = " + accountId;

            try (Statement statement = connection.createStatement();
                 ResultSet resultSet = statement.executeQuery(sql)) {

                return resultSet.next();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void exit() throws InterruptedException {
        System.out.print("Exiting System");
        int i = 5;
        while (i != 0) {
            System.out.print(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("Thank you for using the Banking System!");
    }
}
