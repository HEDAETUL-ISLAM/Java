// class Mobile{
//   static final Mobile Apple = new Mobile();
//   static final Mobile Samsung = new Mobile();
//   static final Mobile Mi = new Mobile();
//
// }
//these line execute in background
enum Mobile{
  Apple, Samsung, Mi;
}

public class EnumDemo{
  public static void main(String arg[]){
    System.out.println(Mobile.Apple);
  }
}
