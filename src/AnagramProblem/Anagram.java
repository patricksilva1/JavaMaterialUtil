package AnagramProblem;

public class Anagram {

    public static void main(String args[]) {

        AnagramProblem ap = new AnagramProblem();
        System.out.println(ap.solve("restful".toCharArray(), "fluster".toCharArray()));
    }

}
