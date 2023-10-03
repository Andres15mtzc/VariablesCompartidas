public class DataCenter {
    private int valor;
    public int bandera = 0;

    public void incrementa(int hilo){
        while(bandera != hilo){
            
        }
        valor++;
    }

    public void decrementa(){
        valor--;
    }

    public int getValor(){
        return this.valor;
    }
}
