public class Hilo extends Thread{
    private DataCenter data;

    Hilo(DataCenter data, String name){
        super(name);
        this.data = data;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            data.incrementa(Integer.parseInt(this.getName()));
        }
        data.bandera++;
        System.out.println(this.getName() + " incrementa");
    }
    
}
