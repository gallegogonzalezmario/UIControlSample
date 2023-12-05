module es.ieslosmontecillos.uicontrolsample {
    requires javafx.controls;
    requires javafx.fxml;



    exports es.ieslosmontecillos.uicontrolsample.tooltip;
    opens es.ieslosmontecillos.uicontrolsample.tooltip to javafx.fxml;
    exports es.ieslosmontecillos.uicontrolsample.checkbox;
    opens es.ieslosmontecillos.uicontrolsample.checkbox to javafx.fxml;
    exports es.ieslosmontecillos.uicontrolsample.tableview;
    opens es.ieslosmontecillos.uicontrolsample.tableview to javafx.fxml;
    exports es.ieslosmontecillos.uicontrolsample.listview;
    opens es.ieslosmontecillos.uicontrolsample.listview to javafx.fxml;
}