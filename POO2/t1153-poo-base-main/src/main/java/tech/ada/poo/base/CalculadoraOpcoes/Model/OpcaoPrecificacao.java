package tech.ada.poo.base.CalculadoraOpcoes.Model;

import tech.ada.poo.base.CalculadoraOpcoes.Lib.Gaussian;
import tech.ada.poo.base.CalculadoraOpcoes.Lib.StdOut;
import tech.ada.poo.base.CalculadoraOpcoes.Lib.StdRandom;

public class       OpcaoPrecificacao {

                // formula Black-Scholes
        public static double PrecoDaPut(double s, double x, double r, double sigma, double t) {
            double d1 = (Math.log(s/x) + (r + sigma * sigma/2) * t) / (sigma * Math.sqrt(t));
            double d2 = d1 - sigma * Math.sqrt(t);
            return s * Gaussian.cdf(d1) - x * Math.exp(-r*t) * Gaussian.cdf(d2);
        }

        // Preco Call por Simulação de Monte Carlo por 10mil interações
        public static double PrecoDaCall(double s, double x, double r, double sigma, double t, int n) {
            double sum = 0.0;
            for (int i = 0; i < n; i++) {
                double eps = StdRandom.gaussian();
                double price = s * Math.exp(r*t - 0.5*sigma*sigma*t + sigma*eps*Math.sqrt(t));
                double value = Math.max(price - x, 0);
                sum += value;
            }
            double mean = sum / n;

            return Math.exp(-r*t) * mean;
        }

/*
        public static void main(String[] args) {
            double s     = Double.parseDouble(args[0]);
            double x     = Double.parseDouble(args[1]);
            double r     = Double.parseDouble(args[2]);
            double sigma = Double.parseDouble(args[3]);
            double t     = Double.parseDouble(args[4]);
            double n     = Double.parseDouble(args[5]);
            StdOut.println(PrecoDaPut(s, x, r, sigma, t));
            StdOut.println(PrecoDaCall(s, x, r, sigma, t, n));
        }
 */

}
