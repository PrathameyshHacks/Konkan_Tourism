package MyPackage;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.*;
import java.sql.*;

public class MyTrips extends JFrame{

    private JTable table;
    private DefaultTableModel tableMod;
    JPanel p1;

    public MyTrips() {
       

        super("My Trips");
        this.setBounds(350,150,800,400);        

        String user_id = LogIn.us();

        p1 = new JPanel();

            p1.setBounds(100,0, 600, 400);
            p1.setBackground(new Color(227, 154, 255));

        this.add(p1);

        tableMod = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // This causes the table not to be editable
            }
        };


        tableMod.addColumn("User ID");
        tableMod.addColumn("City");
		tableMod.addColumn("Date");
        tableMod.addColumn("Hotel");


        // Create the table
        table = new JTable(tableMod);

        JTableHeader tableHeader = table.getTableHeader();
        p1.add(tableHeader, BorderLayout.NORTH);
        p1.add(new JScrollPane(table), BorderLayout.CENTER);


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/konkantourism", "root", "pratal");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM hotels where user_id ='"+user_id+"'");

            // Add data to the table model
            while (resultSet.next()) {
                tableMod.addRow(new Object[] {
                        resultSet.getInt("user_id"),
                        resultSet.getString("ct"),
                        resultSet.getString("dat"),
						resultSet.getString("hot")
                });
            }

            // Close the database connection
            connection.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error connecting to database: " + e.getMessage());
        }

        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MyTrips();
    }
}