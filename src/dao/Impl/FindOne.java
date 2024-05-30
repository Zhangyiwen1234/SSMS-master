/*
package dao.Impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FindOne(Document doc){
    // Connect to database
    Connection conn;

    {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Parse and insert data into database
    NodeList recordList = doc.getElementsByTagName("Person");
            for (int i = 0; i < recordList.getLength(); i++) {
        Node recordNode = recordList.item(i);
        if (recordNode.getNodeType() == Node.ELEMENT_NODE) {
            Element recordElement = (Element) recordNode;
            String name = recordElement.getElementsByTagName("name").item(0).getTextContent();
            int age = Integer.parseInt(recordElement.getElementsByTagName("age").item(0).getTextContent());
            String city = recordElement.getElementsByTagName("city").item(0).getTextContent();

            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO mytable (name, age, city) VALUES (?, ?, ?)");
            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, city);
            pstmt.executeUpdate();
        }
    }

            conn.close();
            response.getWriter().write("Data inserted into database successfully.");

} catch (ParserConfigurationException | SAXException | SQLException | ServletException e) {
        e.printStackTrace();
        response.getWriter().write("Error inserting data into database.");
        }
}
*/
