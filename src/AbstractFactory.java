import interfacesClass.Color;
import interfacesClass.Shape;

/**
 * Created by agungaprian on 11/06/17.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
