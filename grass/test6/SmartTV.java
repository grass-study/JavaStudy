package grass.test6;

public class SmartTV implements VariableScopeExam6,VariableScopeExam6_2 {

    //인터페이스의 메서드는 반드시 구현해야함
    public void on() {
        System.out.println("켜다");
    }

    public void turnOff() {
        System.out.println("끄다");
    }

    public void changeVolume(int value) {
        System.out.println(value + "로 볼륨조정하다.");
    }

    public void changeChannel(int number) {
        System.out.println(number + "로 채널조정하다.");
    }

    public void changeColor(int number) {
        System.out.println(number + "로 색조정하다.");
    }


    public static void main(String[] args) {

        SmartTV tv = new SmartTV();
        tv.turnOff();
        tv.changeColor(5);

    }
}

