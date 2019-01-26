enum Mobile{

  Apple(100), Samsung, Mi(500);

  int price;

  Mobile(){                             //constructor can possible
    price = 40;
    System.out.println("constructor");
  }

  Mobile(int price){
    this.price=price;
  }

  int getPrice(){
    return price;
  }
}

public class EnumClass{
  public static void main(String[] arg){
    System.out.println("phone price is: "+Mobile.Apple.getPrice());

    Mobile m[] = Mobile.values();    //we can also use value EnumMethod
    for(Mobile i : m)
      System.out.println(i);
  }
}
