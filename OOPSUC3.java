public class OOPSUC3 {
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
            System.out.println(
                O[i] + GAP +
                O[i] + GAP +
                P[i] + GAP +
                S[i]
            );
        }
    }
}