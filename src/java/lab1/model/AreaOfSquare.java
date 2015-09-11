package lab1.model;

import javafx.stage.Modality;

/**
 *
 * @author Tyler
 */
public class AreaOfSquare {

    private double lengthOfSide;

    public AreaOfSquare(String lengthOfSide) {
        try {
            setLengthOfSide(lengthOfSide);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            System.out.println("Whoops! Enter a number!");
        }
    }

    public final double getLengthOfSide() {
        return lengthOfSide;
    }

    public final void setLengthOfSide(String lengthOfSide) {
        double l = Double.parseDouble(lengthOfSide);
        this.lengthOfSide = l;
    }

    public final double calculateAreaOfSquare() {
        return (Math.pow(lengthOfSide, 2));

    }

//    public static void main(String[] args) {
//        AreaOfSquare aos = new AreaOfSquare(7.0);
//        System.out.println(aos.getTotalArea());
//    }
}
