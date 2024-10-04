module reymark.blackjackfx {
    requires transitive javafx.controls;
    requires javafx.fxml;

    requires core.fx;

    opens dev.reymark to javafx.fxml;

    exports dev.reymark;
}
