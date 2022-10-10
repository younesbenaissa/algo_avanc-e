import java.io.IOException;

public class Console {
    public Console() {
    }

    public static void printPrompt(String var0) {
        System.out.print(var0 + " ");
        System.out.flush();
    }

    public static String readString() {
        String var1 = "";
        boolean var2 = false;

        while(!var2) {
            try {
                int var0 = System.in.read();
                if (var0 >= 0 && (char)var0 != '\n') {
                    var1 = var1 + (char)var0;
                } else {
                    var2 = true;
                }
            } catch (IOException var4) {
                var2 = true;
            }
        }

        return var1;
    }

    public static String readString(String var0) {
        printPrompt(var0);
        return readString();
    }

    public static String readWord() {
        String var1 = "";
        boolean var2 = false;

        while(!var2) {
            try {
                int var0 = System.in.read();
                if (var0 >= 0 && !Character.isWhitespace((char)var0)) {
                    var1 = var1 + (char)var0;
                } else {
                    var2 = true;
                }
            } catch (IOException var4) {
                var2 = true;
            }
        }

        return var1;
    }

    public static int readInt(String var0) {
        while(true) {
            printPrompt(var0);

            try {
                return Integer.valueOf(readString().trim());
            } catch (NumberFormatException var2) {
                System.out.println("Not an integer. Please try again!");
            }
        }
    }

    public static double readDouble(String var0) {
        while(true) {
            printPrompt(var0);

            try {
                return Double.valueOf(readString().trim());
            } catch (NumberFormatException var2) {
                System.out.println("Not a floating point number. Please try again!");
            }
        }
    }

    public static float readFloat(String var0) {
        while(true) {
            printPrompt(var0);

            try {
                return Float.valueOf(readString().trim());
            } catch (NumberFormatException var2) {
                System.out.println("Not a floating point number. Please try again!");
            }
        }
    }
}
