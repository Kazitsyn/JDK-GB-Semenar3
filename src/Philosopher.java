public class Philosopher extends Thread{
    private String name;
    private int eatCount = 0;
    private boolean eatThink = true;
    private Fork left;
    private Fork right;

    public Philosopher(String name, Fork left, Fork right) {
        this.name = name;
        this.left = left;
        this.right = right;
    }

    public void eat() throws InterruptedException {
        if (eatCount >= 3){
            System.out.println(name + " наелся");
            left.setOnTable(true);
            right.setOnTable(true);
            interrupt();
        }else {
            System.out.println(name + " кушает " + ++eatCount + " порцию");
//            eatCount++;
            eatThink = false;
            sleep(2000);
            left.setOnTable(true);
            right.setOnTable(true);
        }
    }
    public void think() throws InterruptedException{
        System.out.println(name + " думает");
        sleep(3000);
        eatThink = true;
    }
    @Override
    public void run() {
        while (!isInterrupted()){
            try {
                if (left.isOnTable() && right.isOnTable()){
                    left.setOnTable(false);
                    right.setOnTable(false);
                    if (eatThink) {
                        eat();
                    }
                }
                think();
//                sleep(1000);
            } catch (InterruptedException e) {
                e.getMessage();
                interrupt();
            }
        }

    }


}
