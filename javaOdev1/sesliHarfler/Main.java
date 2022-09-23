class Main {
  public static void main(String[] args) {
    String  harf = "e";

    switch (harf.toUpperCase()) {
      case "A":
      case "I":
      case "O":
      case "U":
        System.out.println("Kalın sesli harf");
        break;
      case "E":
      case "İ":
      case "Ö":
      case "Ü":
        System.out.println("İnce sesli harf");
        break;
      default:
        System.out.println("Sesli harf değil");
    }
  }
}