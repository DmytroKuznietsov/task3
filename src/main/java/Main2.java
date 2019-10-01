public class Main2 {
    public static void main(String[] args) {
        int iii;
        iii = 123;

        Dog d;
        d = new Dog();
        d.setAge(324);
        int i = d.getAge();
        System.out.println(i);


        Boxer KostyaDzy = new Boxer(16, 65, 65,"Kostya Jeleznobokiy");
        Boxer KDS = new Boxer(17, 55, 25,"Dmytro Aoutomation Kuznietsov");
        boolean result=KostyaDzy.fight(KDS);
        if (result == true){
            System.out.println("Победу одержал боксер " + KostyaDzy.name);
        }else{
            System.out.println("Победу одержал боксер " + KDS.name);
        }
        boolean result2=KDS.fight(KostyaDzy);
        if (result2 == false){
            System.out.println("Победу одержал боксер " + KostyaDzy.name);
        }else{
            System.out.println("Победу одержал боксер " + KDS.name);
        }
    }
}
class Boxer {
    public int age;
    public int weight;
    public int strength;
    public String name;

    public Boxer(int age, int weight, int strength, String name) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.name= name;
    }

    public boolean fight(Boxer anotherBoxer) {
        return this.age > anotherBoxer.age;
    }


}

class Dog {
    private int age;
    private String name;


    public void setName (String name) {
        if (name == null) {
            return;
        } else {
            this.name = name;
        }
    }
    public void setAge (int age){
        this.age=age;
    }
    public String getName (){
            return this.name;
        }

    public int getAge(){
        return this.age;
    }
}






