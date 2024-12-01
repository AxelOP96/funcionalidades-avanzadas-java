// Ejemplo de archivo ThreadExample3.java
public class ThreadExample3 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hilo usando Lambda - Iteración: " + i);
            }
        });
        
        thread.start();
    }
}
