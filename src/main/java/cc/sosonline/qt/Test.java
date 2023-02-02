package cc.sosonline.qt;

import io.qt.widgets.*;

public class Test {
    public static void main(String[] args) {
        QApplication.initialize(args);
        QMessageBox.information(null, "QtJambi", "Hello Brave New World!");
        QApplication.shutdown();
    }
}
