package com.example.miprimeraplicacion;

import android.widget.Toast;

import java.util.HashSet;
import java.util.Set;

public class TestPU {
    public boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false; // Menos de 8 caracteres
        }

        boolean hasLetter = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        // Recorre cada carácter en la contraseña
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }

            // Si tiene al menos dos tipos de caracteres, es válida
            if ((hasLetter && hasDigit) || (hasLetter && hasSpecial) || (hasDigit && hasSpecial)) {
                return true;
            }
        }

        return false; // No cumple con los tipos mínimos de caracteres
    }
    private static final Set<String> PROFANIDADES = new HashSet<>();

    // Lista de profanidades a prohibir, se tienen que añadir en lower case.
    static {
        PROFANIDADES.add("puta");
        PROFANIDADES.add("pene");
        PROFANIDADES.add("vagina");
        PROFANIDADES.add("sexo");
        PROFANIDADES.add("mierda");
        PROFANIDADES.add("idiota");
        PROFANIDADES.add("estupido");
        PROFANIDADES.add("coño");
        PROFANIDADES.add("tetas");
        PROFANIDADES.add("culo");
        PROFANIDADES.add("verga");
        PROFANIDADES.add("pito");
        PROFANIDADES.add("perra");
        PROFANIDADES.add("mamar");
        PROFANIDADES.add("zorra");
        PROFANIDADES.add("maricon");

    }

    /**
     * Checkea si un string contiene profanidades
     *
     * @param input String que se desea ver si tiene profanidedes
     * @return true si contiene profanidades, false en caso contrario
     */
    public boolean contieneProfanidades(String input) {
        if (input == null || input.isEmpty()) {
            return false;
        }

        // Normalize input to lowercase
        String normalizedInput = input.toLowerCase();

        // Check if any profanity is a substring of the input
        for (String profanity : PROFANIDADES) {
            if (normalizedInput.contains(profanity)) {

                return true;
            }
        }

        return false;
    }
}
