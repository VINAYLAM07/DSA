module com.example.dsa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.dsa to javafx.fxml;
    exports com.example.dsa;
    exports com.example.dsa.BinarySearch;
    opens com.example.dsa.BinarySearch to javafx.fxml;
    exports com.example.dsa.BinarySearch.twoDArray;
    opens com.example.dsa.BinarySearch.twoDArray to javafx.fxml;
}