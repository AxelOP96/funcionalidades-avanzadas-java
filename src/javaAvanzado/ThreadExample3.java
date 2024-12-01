// Ejemplo de archivo ThreadExample4.java
public class ThreadExample4 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hilo 1 - Iteración: " + i);
                    Thread.sleep(500); // Pausa por 500ms
                }
            } catch (InterruptedException e) {
                System.out.println("Hilo 1 interrumpido");
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Hilo 2 - Iteración: " + i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("Hilo 2 interrumpido");
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // Espera a que termine thread1
            thread2.join(); // Espera a que termine thread2
        } catch (InterruptedException e) {
            System.out.println("Main interrumpido");
        }

        System.out.println("Todos los hilos han finalizado");
    }
}
