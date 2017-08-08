import interfacesClass.Color;
import interfacesClass.Shape;

/**
 * Created by agungaprian on 11/06/17.
 */
public class FactoryPatternDemo {
    public static void main (String [] x){
        //get shape factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //get an object of Shape Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        //call draw method of Shape Circle
        shape1.Draw();
        //get an object of Shape Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        //call draw method of Shape Rectangle
        shape2.Draw();
        //get an object of Shape Square
        Shape shape3 = shapeFactory.getShape("SQUARE");
        //call draw method of Shape Square
        shape3.Draw();

        //get color factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        //get an object of Color Red
        Color color1 = colorFactory.getColor("RED");
        //call fill method of Red
        color1.fill();
        //get an object of Color Green
        Color color2 = colorFactory.getColor("Green");
        //call fill method of Green
        color2.fill();
        //get an object of Color Blue
        Color color3 = colorFactory.getColor("BLUE");
        //call fill method of Color Blue
        color3.fill();
    }
}
