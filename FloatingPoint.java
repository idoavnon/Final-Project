public class FloatingPoint {
   private double x;
   private double y;
   
   public FloatingPoint(double x, double y) {
      this.x = x;
      this.y = y;
   }
   
   public double getX() {
      return x;
   }
   
   public double getY() {
      return y;
   }
   
   public void setPoint(double x, double y) {
      this.x = x;
      this.y = y;
   }

   public String toString() {
      return "(" + x + ", " + y + ")";
   }
}