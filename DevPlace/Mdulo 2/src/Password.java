public class Password {

    protected static int Longitud;
    private static char GetAscii;
    private static int NumAleatorio;
    private static int esFuerte;
    private static int Minuscula = 0;
    private static int mayuscula = 0;
    private static int Numeros = 0;

    public Password() {
        this.Longitud = 15;
    }

    public Password(int longitud) {
        this.Longitud = longitud;
    }

    public static char generarPassword() {
        GetAscii = 'A';
        for (int i = 1; i <= Longitud; i++) {

            NumAleatorio = (int) ((Math.random() * (122 - 48 + 1) + 48));
            GetAscii = (char) NumAleatorio;
            if (i == Longitud) {
                return GetAscii;
            }

        }
        return GetAscii;
    }

    public static void GetSeguridadContraseña() {

        if (NumAleatorio >= 48 && NumAleatorio <= 57) {
            Numeros++;
        }

        if (NumAleatorio >= 65 && NumAleatorio <= 90) {
            mayuscula++;
        }
        if (NumAleatorio >= 97 && NumAleatorio <= 122) {
            Minuscula++;
        }

    }

    public static String esFuerte() {

        if (mayuscula >= 2 && Minuscula >= 1 && Numeros >= 3) {
            return "La contraseña es Segura!";
        } else {
            return "la contraseña es Débil!!";
        }

    }

}
