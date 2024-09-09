package filemanipulation;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class JSONFileManipulation {
    public static void main(String[] args) {
        try {
            String conteudo = Files.readString(Paths.get("java-fundamentals/dados.json"));


            JSONArray jsonArray = new JSONArray(conteudo);

            List<Double> faturamentos = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject dia = jsonArray.getJSONObject(i);
                double valor = dia.optDouble("valor", 0.0);
                if (valor > 0) {
                    faturamentos.add(valor);
                }
            }

            double menorValor = faturamentos.stream().min(Double::compare).orElse(0.0);
            double maiorValor = faturamentos.stream().max(Double::compare).orElse(0.0);
            double somaFaturamento = faturamentos.stream().mapToDouble(Double::doubleValue).sum();
            double mediaMensal = somaFaturamento / faturamentos.size();
            long diasAcimaDaMedia = faturamentos.stream().filter(valor -> valor > mediaMensal).count();

            System.out.println("Menor valor de faturamento: " + menorValor);
            System.out.println("Maior valor de faturamento: " + maiorValor);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            System.err.println("Erro ao processar o arquivo: " + e.getMessage());
        }
    }
}
