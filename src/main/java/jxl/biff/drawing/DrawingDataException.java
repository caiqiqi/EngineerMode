package jxl.biff.drawing;

public class DrawingDataException extends RuntimeException {
    private static String message = "Drawing number exceeds available SpContainers";

    DrawingDataException() {
        super(message);
    }
}
