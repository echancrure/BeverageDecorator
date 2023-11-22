public class Main {
    public static void main(String[] args) {
        Beverage coffee = new SimpleBeverage();
        Beverage c1 = new MilkDecorator(coffee);
        Beverage c2 = new SugarDecorator(c1);
        System.out.println("Here is your beverage:" + c2.getDescription());
        System.out.println("Total cost: " + c2.cost());
    }
}