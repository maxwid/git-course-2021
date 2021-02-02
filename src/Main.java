import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> movieList = List.of("Daredevil", "Matrix", "Gudfadern");
        //movieList.stream().filter();
        String matrix =findByString(movieList, "Matrix");
        System.out.println(matrix);
    }

    private static String findByString(List<String> movieList, String str) {
        String result = null;
        for (String movieName: movieList) {
            if (movieName.equals(str)) {
                result = str;
                break;
            }
        }
        return result;
    }
}
