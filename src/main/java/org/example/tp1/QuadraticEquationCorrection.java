package org.example.tp1;


public class QuadraticEquationCorrection {
    public static double[] solve(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("a must not be zero");
        }
        double delta = b * b - 4 * a * c;

        // Utilisation d'une petite marge pour gérer les erreurs d'arrondi
        double epsilon = 1e-12;

        if (delta < -epsilon) {
            return null;  // Pas de racines réelles
        }

        if (Math.abs(delta) < epsilon) {
            // Une racine double (dans la limite de précision)
            return new double[]{-b / (2 * a)};
        }

        // Deux racines réelles distinctes
        double sqrtDelta = Math.sqrt(delta);
        return new double[]{
                (-b + sqrtDelta) / (2 * a),
                (-b - sqrtDelta) / (2 * a)
        };
    }
}