package servlet;

import dao.Impl.FindOne;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet("/uploadXMLServlet")
public class UploadXMLServlet extends HttpServlet {
    private FindOne findOne = new FindOne();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            // Get XML file from request
       /*     InputStream inputStream = request.getPart("file").getInputStream();

            // Load XML file
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputStream);
            doc.getDocumentElement().normalize();

            // Connect to database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");
            findOne(doc);
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
            response.getWriter().write("Data inserted into database successfully.");*/

        } catch (ParserConfigurationException | SAXException | SQLException | ServletException e) {
            e.printStackTrace();
            response.getWriter().write("Error inserting data into database.");
        }
    }
}