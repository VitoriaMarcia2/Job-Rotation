package TestePratico;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FaturamentoMensal {
    public static void main(String[] args) {
        // Leitura dos dados do faturamento mensal a partir de um arquivo JSON
        JSONParser parser = new JSONParser();
        try {
            // Leitura do arquivo JSON contendo os dados do faturamento mensal
            FileReader fileReader = new FileReader("faturamento.json");
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray faturamentoArray = (JSONArray) jsonObject.get("faturamento");

            // Armazenamento dos valores de faturamento diário em um vetor
            ArrayList<Double> faturamentoDiario = new ArrayList<>();
            for (Object value : faturamentoArray) {
                faturamentoDiario.add((Double) value);
            }

            // Cálculo do menor valor de faturamento diário
            double menorFaturamento = Double.MAX_VALUE;
            for (double faturamento : faturamentoDiario) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
            }

            // Cálculo do maior valor de faturamento diário
            double maiorFaturamento = Double.MIN_VALUE;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }

            // Cálculo da média mensal de faturamento
            double mediaMensal = 0;
            for (double faturamento : faturamentoDiario) {
                mediaMensal += faturamento;
            }
            mediaMensal /= faturamentoDiario.size();

            // Contagem do número de dias com faturamento superior à média mensal
            int diasSuperiorMedia = 0;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > mediaMensal) {
                    diasSuperiorMedia++;
                }
            }

            // Exibição dos resultados
            System.out.println("Menor valor de faturamento diário: " + menorFaturamento);
            System.out.println("Maior valor de faturamento diário: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento superior à média mensal: " + diasSuperiorMedia);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

