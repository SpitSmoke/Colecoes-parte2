import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        while (true) {

            System.out.print("Digite o nome (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }


            System.out.print("Digite o sexo (M/F): ");
            String sexo = scanner.nextLine().toUpperCase();


            if (sexo.equals("M")) {
                homens.add(nome);
            } else if (sexo.equals("F")) {
                mulheres.add(nome);
            } else {
                System.out.println("Sexo inválido! Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }
        }


        System.out.println("\nGrupo Masculino: " + homens);
        System.out.println("Grupo Feminino: " + mulheres);


        scanner.close();
    }
}
