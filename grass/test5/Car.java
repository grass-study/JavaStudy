package grass.test5;


class Car extends Machine {
    // @Override로 상속 메서드 재정의 주의!
    @Override
    public void turnOn() {
        System.out.println("켜지다");
    }

    @Override
    public void turnOff() {
        System.out.println("꺼지다");
    }

//
//    class Car2 extends Machine2 {
//         @Override로 상속 메서드 재정의 주의! Car에 여러 클래스 상속 안됨. Car2를 생성할 것
//        public int testsum(int a) {
//            return a + 1;
//        }
//        @Override
//        public int testsum(int a,int b) {
//            return a + 1;
//        }
//
//    }

}

