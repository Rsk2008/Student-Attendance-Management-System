module com.ijse.githubintrllijstudentattendancemanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ijse.githubintrllijstudentattendancemanagementsystem to javafx.fxml;
    exports com.ijse.githubintrllijstudentattendancemanagementsystem;
}