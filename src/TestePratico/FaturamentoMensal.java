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

            // Armazenamento dos valores de faturamento di�rio em um vetor
            ArrayList<Double> faturamentoDiario = new ArrayList<>();
            for (Object value : faturamentoArray) {
                faturamentoDiario.add((Double) value);
            }

            // C�lculo do menor valor de faturamento di�rio
            double menorFaturamento = Double.MAX_VALUE;
            for (double faturamento : faturamentoDiario) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
            }

            // C�lculo do maior valor de faturamento di�rio
            double maiorFaturamento = Double.MIN_VALUE;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
            }

            // C�lculo da m�dia mensal de faturamento
            double mediaMensal = 0;
            for (double faturamento : faturamentoDiario) {
                mediaMensal += faturamento;
            }
            mediaMensal /= faturamentoDiario.size();

            // Contagem do n�mero de dias com faturamento superior � m�dia mensal
            int diasSuperiorMedia = 0;
            for (double faturamento : faturamentoDiario) {
                if (faturamento > mediaMensal) {
                    diasSuperiorMedia++;
                }
            }

            // Exibi��o dos resultados
            System.out.println("Menor valor de faturamento di�rio: " + menorFaturamento);
            System.out.println("Maior valor de faturamento di�rio: " + maiorFaturamento);
            System.out.println("N�mero de dias com faturamento superior � m�dia mensal: " + diasSuperiorMedia);
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }
}

