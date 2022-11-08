package grass.test5;

public class VariableScopeExam5 {
    public static void main(String[] args) {
        Car car = new Car();
        car.turnOn();
        car.testmethod();

        if(Machine.class.isInstance(car)){
            System.out.println("정답입니다. [제출]을 누르세요.");
        }
        else{
            System.out.println("Car가 Machine을 상속받지 않았습니다.");
        }
    }
}