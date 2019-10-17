//import static jdk.nashorn.internal.objects.NativeMath.min;

public class Main2 {
    double Speed;

    public static void main(String[] args) {
        int iii;
        iii = 123;

        Dog d;
        d = new Dog();
        d.setAge(324);
        int i = d.getAge();
        System.out.println(i);

        Printer A = new Printer(); //TASK 6
        A.setTonerLevels(100,100, 100, 100);
        A.print(139, true, true);
        System.out.println();
        double speed =0;
        int power =1;
        Car B = new Car("Mustang", "Big", 0);
        double sp = B.speedColculate(8,power,91);
        power = 4;
        int powerlim= B.speedblock(speed);
        if (powerlim == 5) {power=5;}
        speed += sp;
        System.out.printf("%.2f км/час \n", speed );
        speed = B.speedColculate(3, power, 90);
        powerlim= B.speedblock(speed);
        power =3;
        if (powerlim == 5) {power=5;}
        System.out.printf("%.2f км/час \n", speed );
        speed = B.speedColculate(4, power, 91);
        System.out.printf("%.2f км/час \n", speed );
        speed += sp;
        power =4;
        powerlim= B.speedblock(speed);
        if (powerlim == 5) {power=5;}
        speed = B.speedColculate(5, power, 90);
        power =4;
        powerlim= B.speedblock(speed);
        if (powerlim == 5) {power=5;}
        System.out.printf("%.2f км/час \n", speed );
        speed = B.speedColculate(8, power, 91);
        System.out.printf("%.2f км/час \n", speed );
        speed += sp;


        // Task 2
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

class Dog { //Task 3
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

    class Human { //Task 1
        String firstName;
        String lastName;
        int age;
        int weight;
        int height;

        Human(String a, String b, int c, int d, int e) {
            firstName = a;
            lastName = b;
            age = c;
            weight = d;
            height = e;
        }
    }

    // TASK 4
    class Task4 {
        public static void main(String[] args) {
        }

        public class Worker {

        }

        public class Clerk extends Worker {

        }

        public class IT extends Worker {

        }

        public class Programmer extends IT{

        }

        public class ProjectManager extends IT {

        }

        public class CTO extends IT {

        }

        public class OfficeManager extends Clerk  {

        }

        public class HR extends Clerk {

        }

        public class Cleaner extends Clerk {

        }
    }
    // TASK 5
    class Cat {
        public String name;
        public int age;
        public int weight;

        public Cat(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        private String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    class Printer {
        private String manufacturer;
        private String model;
        private boolean isColor;
        private String type;
        private boolean isDuplex;
        private double tonerLevelBlack;
        private double tonerLevelMagenta;
        private double tonerLevelYellow;
        private double tonerLevelBlue;
        private int printedPages;




        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setModel(String model) {
            this.manufacturer = model;
        }

        public String getModel() {
            return model;
        }

        public void setIsColor(boolean isColor) {
            this.isColor = isColor;
        }

        public void setTonerLevels(int tonerLevelBlack, int tonerLevelMagenta, int tonerLevelYellow, int tonerLevelBlue) {
            this.tonerLevelBlack = tonerLevelBlack;
            this.tonerLevelMagenta = tonerLevelMagenta;
            this.tonerLevelYellow = tonerLevelYellow;
            this.tonerLevelBlue = tonerLevelBlue;
        }

        public double getColorLevel() {
            if (isColor == false) {
                return tonerLevelBlack;
            } else {
                double minone = Math.min(tonerLevelBlack, tonerLevelMagenta);
                double mintwo = Math.min(tonerLevelYellow, tonerLevelBlue);
                double RGB = Math.min(minone, mintwo);
                return RGB;
            }

        }

        public void setSisDuplex(boolean isDuplex) {
            this.isDuplex = isDuplex;
        }

        public boolean getSisDuplex() {
            return isDuplex;
        }

        public void print(int pages, boolean isDuplex, boolean isColor){
            if (getColorLevel() <= 10){
                System.out.println("You are running out of toner");
                return;
            }
            double delta=0.01*pages;
            if (isColor == true){
                tonerLevelMagenta = tonerLevelMagenta - delta;
                tonerLevelYellow = tonerLevelYellow - delta;
                tonerLevelBlue = tonerLevelBlue - delta;
            } else {
                tonerLevelBlack= tonerLevelBlack - delta;
            }
            if (isDuplex == true){
                int n =(int)Math.ceil(pages/2.0);
                printedPages+=n;
            } else {
                printedPages+=pages;
            }
            System.out.println("pages = " + printedPages + " Black toner " + tonerLevelBlack + " %;"+ " Color toner " + tonerLevelMagenta +" %;");
        }


    }

class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;



    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);

    }
    public void stop(){
        this.currentVelocity = 0;

    }

        public String getName() {
            return name;
        }

        public String getSize() {
            return size;
        }

        public int getCurrentVelocity() {
            return currentVelocity;
        }

        public int getCurrentDirection() {
            return currentDirection;
        }
    }

class Car extends Vehicle {
     public double speed;
     public int speedLimit;
     public String typeRoad;



    public Car(String name, String size, double startSpeed) {
        super(name, size);
        speed = startSpeed;
    }

    public int Transmission (int spead){
        if (spead>=0 && (spead<20)) {return 1;}
        if (spead>=20 && (spead<10)) {return 2;}
        if (spead>=40 && (spead<60)) {return 3;}
        if (spead>=60 && (spead<80)) {return 4;}
        if (spead>=80 && (spead<300)) {return 5;}
        System.out.println("spead = " + spead + " ERROR: no correct value");
        return 0;
    }
    public int speadLimit (String typeRoad){
        if (typeRoad== "Сity") {return 50;}
        if (typeRoad== "Track") {return 110;}
        if (typeRoad== "motorway") {return 130;}
        System.out.println("Unable to select restrictions on this road");

        return speedLimit;
        }

    public int speedblock (double speed){
        int speedlim=110;
        if (speedlim<=speed){
            int powerlim =5;
            return powerlim;
        }
        System.out.println("Ограничения скорости для данной месности = "+speedlim+" км/час");
        return 0;
    }

    public double speedColculate (int t, int power, int direction){
        double k = 0;
        double rad = 0;
        double dV = 15;
        double sp = speed;
        int time = t;
        ;
        switch (power){
            case 1: k = 0.15; break;
            case 2: k = 0.45; break;
            case 3: k = 0.7; break;
            case 4: k = 1.0; break;
            case 5: dV = 0;  break;
        }


         if ((direction > 90) && (direction <= 115)) { rad = 0.85;}
         if ((direction < 90) && (direction >= 75)) {rad = 0.85;}
         if ((direction >= 116) && (direction <= 130)) {rad = 0.5;}
         if ((direction <= 74) && (direction >= 50)) {rad = 0.5;}
         if ((direction <= 49) && (direction >= 131)) {rad = 0;}
         if (direction == 90) { rad = 1;}


          for (int i=0;i<time;i++){
              double delta = k*rad*dV;
          sp = sp+delta;
          if (delta==0) {
              i=time;
          }
          }
        System.out.println("Начальная скорость "+ speed+". Время " + t +" секунд, с условием угла отклонения "+ (90-rad) + " градусов и силой нажатия на педаль " + power  +" из 4 максимальных");

          speed = sp;
        return sp;
    }




}



