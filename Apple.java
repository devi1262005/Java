class Apple1 implements App {
    @Override
    public void crunch() {
        System.out.println("The apple is bitten");
    }

    @Override
    public void rotten() {
        System.out.println("The apple is rotten");
    }

    @Override
    public void eaten() {
        System.out.println("The apple is eaten");
    }

    @Override
    public void juicen() {
        System.out.println("Apple made juice!!");
    }

    @Override
    public void fridge() {
        System.out.println("Apple in fridge");
    }
}

class Apple {
    public static void main(String[] args) {
        Apple1 a = new Apple1();
        a.crunch();
        a.rotten();
        a.eaten();
        a.juicen();
        a.fridge();
    }
}