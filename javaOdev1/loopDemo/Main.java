 class Main {
  public static void main(String[] args) {

    // For
    for (int i = 0; i<=10; i++)
    {
      System.out.println(i);
    }
    System.out.println("For döngüsü bitti!");

    // While
    int i = 0;
    while(i < 10){
      System.out.println(i);
      i += 2;
    }
    System.out.println("While döngüsü bitti!");

    // Do-While
    i = 1;
    do{
      //System.out.println("loglandı");
      System.out.println(i);
      i += 2;
    }while(i < 10);
    System.out.println("Do-While döngüsü bitti!");
    
    
  }
}