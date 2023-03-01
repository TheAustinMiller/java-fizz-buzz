class Main {
  public static void main(String[] args) {
    for (int lcv = 1; lcv < 101; lcv++) {
      String msg = "";
      if (lcv % 3 == 0) {
        msg += "Fizz";
      }
      if (lcv % 5 == 0) {
        msg += "Buzz";
      }
      if (msg == "") {
        msg = lcv + "";
      }
      System.out.println(msg);
      msg = "";
    }
  }
}
