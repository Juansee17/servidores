public class Main {
    public static void main(String[] args) {
        System.out.println("Total servidores antes de crear: " + Servidor.getTotalServidores());

        Servidor serv1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor serv2 = new Servidor("ServidorBD", "192.168.1.21");

        System.out.println("Total servidores creados: " + Servidor.getTotalServidores());

        // Activando un servidor
        serv1.activar();
        serv1.mostrarDatos();

        System.out.println("Servidores activos actualmente: " + Servidor.getServidoresActivos());
    }
}