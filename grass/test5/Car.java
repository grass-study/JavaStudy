package grass.test5;


class Car extends Machine {
    // Machine 클래스를 상속받고, 추상 메소드를 구현하세요.
    @Override
    public void turnOn() {
        System.out.println("켜지다");
    }

    @Override
    public void turnOff() {
        System.out.println("꺼지다");
    }

}