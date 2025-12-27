class Addition {
    int a, b;
    void add() {
        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

public class Main {
    public static void main(String[] args) {

        Addition obj = new Addition();

        
        obj.a = 10;
        obj.b = 20;
        obj.add();
    }
}
