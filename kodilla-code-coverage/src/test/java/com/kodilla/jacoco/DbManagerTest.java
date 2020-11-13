        package com.kodilla.jacoco;

        import junit.framework.TestCase;
        import org.junit.Assert;
        import org.junit.jupiter.api.Assertions;
        import org.junit.jupiter.api.Test;

        import java.sql.PreparedStatement;
        import java.sql.ResultSet;
        import java.sql.SQLException;
        import java.sql.Statement;

        public class DbManagerTest extends TestCase {
        @Test
        public void testConnect() throws SQLException {
            //Given
            //When
            DbManager dbManager = DbManager.getInstance();
            //Then
            Assert.assertNotNull(dbManager.getConnection());
        }

        @Test
        public void testSelectUsers() throws SQLException {
            //Given
            DbManager dbManager = DbManager.getInstance();
            String countQuery = "SELECT COUNT(*) FROM USERS";
            Statement statement = dbManager.getConnection().createStatement();
            ResultSet rs = statement.executeQuery(countQuery);
            int count = 0;
            while (rs.next()) {
                count = rs.getInt("COUNT(*)");
            }
            String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
            statement.executeUpdate(sql);
            sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
            statement.executeUpdate(sql);

            //When
            String sqlQuery = "SELECT * FROM USERS";
            statement = dbManager.getConnection().createStatement();
            rs = statement.executeQuery(sqlQuery);

            //Then
            int counter = 0;
            while(rs.next()) {
                System.out.println(rs.getInt("ID") + ", " +
                        rs.getString("FIRSTNAME") + ", " +
                        rs.getString("LASTNAME"));
                counter++;
            }
            int expected = count + 5;
            Assert.assertEquals(expected, counter);

            rs.close();
            statement.close();
        }

        @Test
        public void testSelectUsersAndPosts() throws SQLException {
         // given
         DbManager dbManager = DbManager.getInstance();
         String sqlGetUsers = "SELECT  COUNT(*) " +
                 "FROM USERS U\n" +
                 "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                 "GROUP BY P.USER_ID\n" +
                 "HAVING COUNT(*) >= 2;";
         Statement statement = dbManager.getConnection().createStatement();
         ResultSet rs = statement.executeQuery(sqlGetUsers);
         int initialCounter = 0;
         while(rs.next()){
             initialCounter++;
         }
         PreparedStatement pstmt;
         int newUserId = 0;
         String insertSql = "INSERT INTO users(FIRSTNAME, LASTNAME) VALUES ('Test', 'User');";
         pstmt = dbManager.getConnection().prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);
         pstmt.executeUpdate();
         ResultSet resSet = pstmt.getGeneratedKeys();
         resSet.next();
         newUserId = resSet.getInt(1);

         insertSql = "INSERT INTO posts (id, user_id, body) VALUES (NULL, '"+ newUserId +"', 'Some body text 1');";
         pstmt = dbManager.getConnection().prepareStatement(insertSql);
         pstmt.executeUpdate();
         insertSql = "INSERT INTO posts (id, user_id, body) VALUES (NULL, '"+ newUserId +"', 'Some body text 2');";
         pstmt = dbManager.getConnection().prepareStatement(insertSql);
         pstmt.executeUpdate();
         insertSql = "INSERT INTO posts (id, user_id, body) VALUES (NULL, '"+ newUserId +"', 'Some body text 3');";
         pstmt = dbManager.getConnection().prepareStatement(insertSql);
         pstmt.executeUpdate();

         resSet.close();
         pstmt.close();

         String sqlQuery = "SELECT  COUNT(*) " +
                 "FROM USERS U\n" +
                 "JOIN POSTS P ON U.ID = P.USER_ID\n" +
                 "GROUP BY P.USER_ID\n" +
                 "HAVING COUNT(*) >= 2;";
         statement = dbManager.getConnection().createStatement();
         rs = statement.executeQuery(sqlQuery);

         // then
         int counter = 0;
         while(rs.next()){
             counter++;
         }
         rs.close();
         statement.close();
         Assert.assertEquals(initialCounter+1 , counter);
        }
        }