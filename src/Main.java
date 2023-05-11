public class Main {
    public static void main(String[] args) {
        var potion1 = new Potion("potion1", 2, 5000.0, 12.5, 666.0, "Heal");
        var potion2 = new Potion("potion2", 3, 6000.0, 13.5, 777.0, "Attack");
        var potion3 = new Potion("potion3", 4, 7000.0, 14.5, 888.0, "defend");
        System.out.println("----------POTION----------");
        System.out.println(potion1.methodAttack());
        System.out.println(potion2.methodAttack());
        System.out.println(potion3.methodAttack() + "\n");

        System.out.println("----------SWORD----------");
        var sword1 = new Sword("sword1", 5, 12_000.0, 999.0);
        System.out.println(sword1.methodAttack() + "\n");

        System.out.println("----------SHIELD----------");
        var shield1 = new Shield("shield1", 6, 500.0, 500.0);
        System.out.println(shield1.methodDefense());
    }
}
