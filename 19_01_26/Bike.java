class Bike {
    int speed;
    String name;
    String number;

    Bike(String name, int speed, String number) {
        this.speed = speed;
        this.name = name;
        this.number = number;
    }

    void display() {
        System.out.println(speed);
        System.out.println(name);
        System.out.println(number);
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Gt", 170, null); // 2 para
        Bike b2 = new Bike("Jawa", 130, "DL90CF1234"); // 3 para
        b1.display();
        b2.display();
    }
}