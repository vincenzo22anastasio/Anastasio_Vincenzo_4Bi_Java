public class MainTelefilm{

    public static void main(String[] args) {
        try
        {
            Stagione a = new Stagione(10, "Luchino Visconti", "troppo lunga ");
            Stagione b = new Stagione(120, "Benigni", "troppo lunga ");
            Stagione c = new Stagione(20, "Benigni", "troppo lunga ");


            System.out.println(a.getNrEpisodi());
            System.out.println(b.getNrEpisodi());
            System.out.println(c.getNrEpisodi());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}