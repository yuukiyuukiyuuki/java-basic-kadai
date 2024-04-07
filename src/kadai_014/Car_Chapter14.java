package kadai_014;

public class Car_Chapter14 {
	//車クラスのフィールド
	private int gear = 1;
    private int speed = 10;
    
    //車クラスのメソッド
    public void gearChange(int afterGear) {
            this.gear = afterGear;
            switch (this.gear) {
                case 1 -> this.speed = 10;
                case 2 -> this.speed = 20;
                case 3 -> this.speed = 30;
                case 4 -> this.speed = 40;
                case 5 -> this.speed = 50;
                default -> this.speed = 10;
            }
    }
    
    public void run() {
    	System.out.println("ギア" + this.gear + "に切り替えました");
        System.out.println("速度は時速" + speed + "kmです");
    }
}
