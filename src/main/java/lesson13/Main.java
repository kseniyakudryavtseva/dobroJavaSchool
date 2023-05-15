package lesson13;

import java.sql.*;

public class Main {
    private static final String INSERT_FACULTY = "INSERT into faculty (name) values (?);";
    private static final String INSERT_GROUPS = "INSERT into groups (name, faculty_id) values (?,?);";
    private static final String INSERT_STUDENT = "INSERT into student (name, age, scholarship, group_id) values (?,?,?,?);";
    private static final String SELECT = "SELECT * FROM student where group_id = ? AND age < ? AND scholarship > ?;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        ConnectionConfiguration config = new ConnectionConfiguration();
        try (Connection connection = DriverManager.getConnection(config.getUrl(), config.getUsername(), config.getPassword())) {
            Statement statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS faculty, groups, student CASCADE;");
            statement.execute("CREATE TABLE IF NOT EXISTS faculty (id bigserial primary key, name text)");
            statement.execute("CREATE TABLE IF NOT EXISTS groups (id bigserial primary key, name text, faculty_id bigint)");
            statement.execute("CREATE TABLE IF NOT exists student (id bigserial primary key, name text not null, age int not null, scholarship numeric(10, 2), group_id bigint references groups (id));");
            PreparedStatement faculty = connection.prepareStatement(INSERT_FACULTY);
            faculty.setString(1, "Economics");
            faculty.addBatch();
            faculty.setString(1, "History");
            faculty.addBatch();
            faculty.setString(1, "Biology");
            faculty.addBatch();
            faculty.executeBatch();
            PreparedStatement groups = connection.prepareStatement(INSERT_GROUPS);
            groups.setString(1, "10");
            groups.setInt(2, 1);
            groups.addBatch();
            groups.setString(1, "11");
            groups.setInt(2, 1);
            groups.addBatch();
            groups.setString(1, "20");
            groups.setInt(2, 2);
            groups.addBatch();
            groups.setString(1, "25x");
            groups.setInt(2, 2);
            groups.addBatch();
            groups.executeBatch();
            PreparedStatement student = connection.prepareStatement(INSERT_STUDENT);
            student.setString(1, "Tom");
            student.setInt(2, 19);
            student.setDouble(3, 110.30);
            student.setInt(4, 1);
            student.setString(1, "John");
            student.setInt(2, 20);
            student.setDouble(3, 130.30);
            student.setInt(4, 2);
            student.addBatch();
            student.executeBatch();
            student.setString(1, "Mike");
            student.setInt(2, 25);
            student.setDouble(3, 130.30);
            student.setInt(4, 3);
            student.addBatch();
            student.executeBatch();

            ResultSet rs = statement.executeQuery("Select * from student");
            while (rs.next()) {
                String testName = rs.getString("name");
                System.out.println(testName);
            }
            PreparedStatement selectStudent = connection.prepareStatement(SELECT);
            selectStudent.setInt(1, 3);
            selectStudent.setInt(2, 20);
            selectStudent.setDouble(3, 100);
            statement.executeUpdate("UPDATE student set age = 19 where name = 'Mike';");
            ResultSet resultSet = selectStudent.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
