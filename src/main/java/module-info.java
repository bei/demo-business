module org.update4j.demo.business {
    requires transitive org.update4j;
    requires org.update4j.demo.bootstrap;
    requires transitive javafx.fxml;
    requires transitive javafx.controls;
    requires com.jfoenix;
    requires controlsfx;
    requires jfxtras.gauge.linear;
    exports org.update4j.demo.business;
    opens org.update4j.demo.business;
}
