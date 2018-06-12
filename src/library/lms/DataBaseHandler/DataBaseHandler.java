package library.lms.DataBaseHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

public class DataBaseHandler {

    private static DataBaseHandler dbh = null;
    private static Connection con = null;
    private static Statement st = null;

    private DataBaseHandler() throws Exception {
        getConnection();
        setLoginTable();
        setBookTable();
        setMemberTable();
        setIssueTable();

    }

    private void getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/lms", "root", "");
            st = con.createStatement();
            System.out.println("Driver & Connection OK");
        } catch (ClassNotFoundException e) {
            System.out.println("Driver Problem " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("SQL Problem " + e.getMessage());

        }

    }

    
    
    
    
    public static DataBaseHandler getDataBaseHandler() throws Exception {

        if (dbh == null) {
            dbh = new DataBaseHandler();
        }

        return dbh;
    }
    
    
    
    
    private void setLoginTable() throws SQLException{
        
        
        
        DatabaseMetaData dbmd = con.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "loginLms", null);

        if (rs.next()) {
            System.out.println("Table loginLms Already Exist");
        } else {
            String login = "CREATE Table loginLms("
                    + "username varchar(200) NOT NULL  ,"
                    + "password varchar(200) NOT NULL  ,"
                    +"email varchar(200) NOT NUll,"
                    +"epassword varchar(200)"
                     + ")";
            st.execute(login);
            isExeQuery("insert into loginLms values('password','password','xyz123@gmail.com','##########')");
            System.out.println("Table book Created");
        }

        
    
    
    }
    

    private void setBookTable() throws SQLException {

        DatabaseMetaData dbmd = con.getMetaData();
        ResultSet rs = dbmd.getTables(null, null, "book", null);

        if (rs.next()) {
            System.out.println("Table book Already Exist");
        } else {
            String book = "CREATE Table book("
                    + "bookId varchar(200) NOT NULL PRIMARY KEY,"
                    + "bookName varchar(200) NOT NULL,"
                    + "author varchar(200) NOT NULL,"
                    + "publisher varchar(200) NOT NULL,"
                    + "isY boolean default true"
                    + ")";
            st.execute(book);
            System.out.println("Table book Created");
        }

    }
    
    
    
     
    void setMemberTable() throws SQLException
    {
        DatabaseMetaData db = con.getMetaData();
        ResultSet rs = db.getTables(null,null,"MEMBER",null);
        if(rs.next()){        
        System.out.println("Table Member Already Exist");
        }
        else{
              st = con.createStatement();
            String member = "create table member("
                    + "id varchar(200) NOT NULL PRIMARY KEY,\n"
                    + "name varchar(200)NOT NULL,\n"
                    + "contact varchar(20) NOT NULL,\n"
                    + "email varchar(200) NOT NULL\n"
                    + ")";
         st.execute(member); 
         System.out.println("Table Member Created");

        
        
        }      
        
        
    }
    
    
     
    void setIssueTable() throws SQLException
    {
        DatabaseMetaData db = con.getMetaData();
        ResultSet rs = db.getTables(null,null,"issueBook",null);        
        
        if(rs.next()){        
        System.out.println("Table issueBook Already Exist");
        }
        else{
              st = con.createStatement();
            String member = "create table issueBook("
                    + "bookId varchar(200) NOT NULL PRIMARY KEY,\n"
                    + "memberId varchar(200) NOT NULL,\n"                    
                    + "issueTime timestamp default CURRENT_TIMESTAMP,\n"
                    + "renewCount integer default 0,\n"
                    + "FOREIGN KEY (bookId) REFERENCES book(bookId),\n"
                     + "FOREIGN KEY (memberId) REFERENCES member(id)"
                    + ")";
         st.execute(member); 
         System.out.println("Table issueBook Created");

        
        
        }      
        
        
    }
    
    

    public boolean isExeQuery(String query) {
        try {
            
            st.execute(query);
            System.out.println("Query executed");           

            return true;

        } catch (SQLException e) {
            System.out.println("Problem in SQL " + e.getMessage());
           
            return false;
        }
    }

    public ResultSet getData(String query) {
        
        ResultSet rs = null;
        try {
           // st = con.createStatement();
            rs = st.executeQuery(query);          

        } catch (SQLException ex) {
             
            System.out.println("Load Data Problem " + ex.getMessage());
        }       
        return rs;

    }

}
