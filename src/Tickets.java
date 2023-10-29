public class Tickets {
     private String from;
     private String to;
     private double price;

     public Tickets(String from, String to, int price) {
          this.from = from;
          this.to = to;
          this.price = price;
     }

     public String getFrom() {
          return from;
     }

     public String getTo() {
          return to;
     }

     public double getPrice() {
          return price;
     }

     public void setFrom(String from) {
          this.from = from;
     }

     public void setTo(String to) {
          this.to = to;
     }

     public void setPrice(int price) {
          this.price = price;
     }

     @Override
     public String toString() {
          return "Tickets{" +
                  "from='" + from + '\'' +
                  ", to='" + to + '\'' +
                  ", price=" + price +
                  '}';
     }
}
