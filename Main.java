public class Main {    
    public static void main(String[] args) throws Exception {
        DataCenter data = new DataCenter();
        Hilo[] hilos = new Hilo[5];
        System.out.println("Valor al comenzar: " + data.getValor());
        for (int i = 0; i < 5; i++) {
            hilos[i] = new Hilo(data, Integer.toString(i));
            hilos[i].start();
        }
        for (int i = 0; i < 5; i++) {
            try{
                hilos[i].join();
            }catch(InterruptedException ie){
                System.out.println("Thread " + Integer.toString(i) + " was interrupted");
            }
            
        }
        System.out.println("Valor al terminar: " + data.getValor());
    }
}
