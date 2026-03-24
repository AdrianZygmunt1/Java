class Robot{
    int id;
    Robot(int i){
        id = i;
        Brain b = new Brain();
        b.think();
    }

    private class Brain{
        public void think(){
            System.out.println(id + " is thinking");
        }
    }
    @Override
    public String toString() {
        return "";
    }
}


public class klasawewnetrzna {
    public static void main(String[] args) {
        Robot r = new Robot(2);
        System.out.println(r);
    }
}
