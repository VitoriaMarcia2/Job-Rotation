package TestePratico;

public class PercentualRepresentacaoEstados {
    public static void main(String[] args) {
        // Valores de faturamento mensal por estado
        double faturamentoSP = 67836.43;
        double faturamentoRJ = 36678.66;
        double faturamentoMG = 29229.88;
        double faturamentoES = 27165.48;
        double faturamentoOutros = 19849.53;

        // Cálculo do valor total mensal da distribuidora
        double valorTotalMensal = faturamentoSP + faturamentoRJ + faturamentoMG + faturamentoES + faturamentoOutros;

        // Cálculo do percentual de representação de cada estado
        double percentualSP = (faturamentoSP / valorTotalMensal) * 100;
        double percentualRJ = (faturamentoRJ / valorTotalMensal) * 100;
        double percentualMG = (faturamentoMG / valorTotalMensal) * 100;
        double percentualES = (faturamentoES / valorTotalMensal) * 100;
        double percentualOutros = (faturamentoOutros / valorTotalMensal) * 100;

        // Exibição dos resultados
        System.out.println("Percentual de representação de SP: " + percentualSP + "%");
        System.out.println("Percentual de representação de RJ: " + percentualRJ + "%");
        System.out.println("Percentual de representação de MG: " + percentualMG + "%");
        System.out.println("Percentual de representação de ES: " + percentualES + "%");
        System.out.println("Percentual de representação de Outros: " + percentualOutros + "%");
    }
}
