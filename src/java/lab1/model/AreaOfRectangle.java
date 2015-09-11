package lab1.model;

/**
 *
 * @author Tyler
 */
public class AreaOfRectangle {

    private double lengthOfSide;
    private double widthOfSide;

    public AreaOfRectangle(String lengthOfSide, String widthOfSide) {
        try{
        setLengthOfSide(lengthOfSide);
        setWidthOfSide(widthOfSide);
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
            System.out.println("Whoops! Enter the dimensions!");
        }
    }

    public final double getLengthOfSide() {
        return lengthOfSide;
    }

    public final void setLengthOfSide(String lengthOfSide) {
        double los = Double.parseDouble(lengthOfSide);
        this.lengthOfSide = los;
    }

    public final double getWidthOfSide() {
        return widthOfSide;
    }

    public final void setWidthOfSide(String widthOfSide) {
        double wos = Double.parseDouble(widthOfSide);
        this.widthOfSide = wos;
    }

    public final double calculateAreaOfRectangle() {
        return lengthOfSide * widthOfSide;
    }

//    public static void main(String[] args) {
//       AreaOfRectangle aor = new AreaOfRectangle(5.0,6.0);
//         System.out.println(aor.getTotalArea()); 
//    }
}
