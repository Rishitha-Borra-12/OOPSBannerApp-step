public class OopsUsingStar {
    public static void main(String[] args) {
        String[] O = {
            "   ***    ",  
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "  
        };
        String[] P = {
            "******    ",
            "**    **  ",
            "**    **  ",
            "******    ",
            "**        ",
            "**        ",
            "**        "
        };
        String[] S = {
            " ******   ",
            "**        ",
            "**        ",
            "  ****    ",
            "      **  ",
            "      **  ",
            " ******   "
        };
        final String GAP = "   ";
        for (int i = 0; i < O.length; i++) {
            String line = String.join(GAP, O[i], O[i], P[i], S[i]);
            System.out.println(line);
        }
    }
}