public class Hello {

    public static void main(String[] args) {
        System.out.printf("Oi, %s, você tem %s pontos !!!!\n", 
                          args[0], Integer.parseInt(args[2]) + 1);
    }
}
