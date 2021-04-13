class Main {
  public static void main(String[] args) {
    Sugar sugar1 = new Sugar("Tree", false);
    sugar1.cutShapes(sugar1.returnShape(), 10);
    sugar1.bakeCookies(350, 12);
    sugar1.decorateCookie();
    Sugar aCookie = new Sugar();
    aCookie.decorateCookie();
  }
}