package sumulavolei;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SumulaVoleiApp {

    private List<String> jogadoresTime1 = new ArrayList<>();
    private List<String> jogadoresTime2 = new ArrayList<>();
    private List<Integer> pontuacoesTime1 = new ArrayList<>();
    private List<Integer> pontuacoesTime2 = new ArrayList<>();
    private String arbitro, local, horarioInicio, horarioFim;
    private String nomeTime1, nomeTime2;
    private int errosTime1, acertosTime1, errosTime2, acertosTime2;
    private String resultadoFinal;
    private JFrame frame;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SumulaVoleiApp::new);
    }

    public SumulaVoleiApp() {
        frame = new JFrame("Súmula de Vôlei");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new GridLayout(6, 1));

        // Botões do menu principal
        JButton cadastrarDadosButton = new JButton("Cadastrar Dados do Jogo");
        JButton cadastrarTimesButton = new JButton("Cadastrar Times");
        JButton registrarEstatisticasButton = new JButton("Registrar Estatísticas Gerais");
        JButton registrarPontuacoesButton = new JButton("Registrar Pontuações");
        JButton registrarResultadoButton = new JButton("Registrar Resultado Final");
        JButton gerarSumulaButton = new JButton("Gerar Súmula");
        JButton reiniciarButton = new JButton("Reiniciar Dados");
        JButton sairButton = new JButton("Sair");

        cadastrarDadosButton.addActionListener(e -> cadastrarDadosJogo());
        cadastrarTimesButton.addActionListener(e -> cadastrarTimes());
        registrarEstatisticasButton.addActionListener(e -> registrarEstatisticas());
        registrarPontuacoesButton.addActionListener(e -> registrarPontuacoes());
        registrarResultadoButton.addActionListener(e -> registrarResultado());
        gerarSumulaButton.addActionListener(e -> gerarSumula());
        reiniciarButton.addActionListener(e -> reiniciar());
        sairButton.addActionListener(e -> System.exit(0));

        frame.add(cadastrarDadosButton);
        frame.add(cadastrarTimesButton);
        frame.add(registrarEstatisticasButton);
        frame.add(registrarPontuacoesButton);
        frame.add(registrarResultadoButton);
        frame.add(gerarSumulaButton);
        frame.add(reiniciarButton);
        frame.add(sairButton);

        frame.setVisible(true);
    }

    private void cadastrarDadosJogo() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField arbitroField = new JTextField();
        JTextField localField = new JTextField();
        JTextField horarioInicioField = new JTextField();
        JTextField horarioFimField = new JTextField();

        panel.add(new JLabel("Árbitro:"));
        panel.add(arbitroField);
        panel.add(new JLabel("Local:"));
        panel.add(localField);
        panel.add(new JLabel("Horário Início:"));
        panel.add(horarioInicioField);
        panel.add(new JLabel("Horário Fim:"));
        panel.add(horarioFimField);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Cadastrar Dados do Jogo", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            arbitro = arbitroField.getText();
            local = localField.getText();
            horarioInicio = horarioInicioField.getText();
            horarioFim = horarioFimField.getText();
        }
    }

    private void cadastrarTimes() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField nomeTime1Field = new JTextField();
        JTextField jogadoresTime1Field = new JTextField();
        JTextField nomeTime2Field = new JTextField();
        JTextField jogadoresTime2Field = new JTextField();

        panel.add(new JLabel("Nome do Time 1:"));
        panel.add(nomeTime1Field);
        panel.add(new JLabel("Jogadores Time 1 (separados por vírgula):"));
        panel.add(jogadoresTime1Field);
        panel.add(new JLabel("Nome do Time 2:"));
        panel.add(nomeTime2Field);
        panel.add(new JLabel("Jogadores Time 2 (separados por vírgula):"));
        panel.add(jogadoresTime2Field);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Cadastrar Times", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            nomeTime1 = nomeTime1Field.getText();
            nomeTime2 = nomeTime2Field.getText();

            for (String jogador : jogadoresTime1Field.getText().split(",")) {
                jogadoresTime1.add(jogador.trim());
            }
            for (String jogador : jogadoresTime2Field.getText().split(",")) {
                jogadoresTime2.add(jogador.trim());
            }
        }
    }

    private void registrarPontuacoes() {
        JPanel panel = new JPanel(new GridLayout(2, 2));
        JTextField pontuacoesTime1Field = new JTextField();
        JTextField pontuacoesTime2Field = new JTextField();

        panel.add(new JLabel("Pontuações Time 1 (separadas por vírgula):"));
        panel.add(pontuacoesTime1Field);
        panel.add(new JLabel("Pontuações Time 2 (separadas por vírgula):"));
        panel.add(pontuacoesTime2Field);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Registrar Pontuações", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            pontuacoesTime1.clear();
            pontuacoesTime2.clear();

            for (String ponto : pontuacoesTime1Field.getText().split(",")) {
                pontuacoesTime1.add(Integer.parseInt(ponto.trim()));
            }
            for (String ponto : pontuacoesTime2Field.getText().split(",")) {
                pontuacoesTime2.add(Integer.parseInt(ponto.trim()));
            }
        }
    }

    private void registrarEstatisticas() {
        JPanel panel = new JPanel(new GridLayout(4, 2));
        JTextField errosTime1Field = new JTextField();
        JTextField acertosTime1Field = new JTextField();
        JTextField errosTime2Field = new JTextField();
        JTextField acertosTime2Field = new JTextField();

        panel.add(new JLabel("Erros Time 1:"));
        panel.add(errosTime1Field);
        panel.add(new JLabel("Acertos Time 1:"));
        panel.add(acertosTime1Field);
        panel.add(new JLabel("Erros Time 2:"));
        panel.add(errosTime2Field);
        panel.add(new JLabel("Acertos Time 2:"));
        panel.add(acertosTime2Field);

        int result = JOptionPane.showConfirmDialog(frame, panel, "Registrar Estatísticas Gerais", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            errosTime1 = Integer.parseInt(errosTime1Field.getText());
            acertosTime1 = Integer.parseInt(acertosTime1Field.getText());
            errosTime2 = Integer.parseInt(errosTime2Field.getText());
            acertosTime2 = Integer.parseInt(acertosTime2Field.getText());
        }
    }

    private void registrarResultado() {
        resultadoFinal = JOptionPane.showInputDialog(frame, "Digite o resultado final do jogo:");
    }

    private void gerarSumula() {
        String timestamp = new java.text.SimpleDateFormat("yyyyMMdd_HHmmss").format(new java.util.Date());
        String nomeArquivo = "sumula_volei_" + timestamp + ".txt";
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            writer.write("SÚMULA DE VÔLEI\n");
            writer.write("=================\n");
            writer.write("Árbitro: " + arbitro + "\n");
            writer.write("Local: " + local + "\n");
            writer.write("Horário Início: " + horarioInicio + "\n");
            writer.write("Horário Fim: " + horarioFim + "\n");
            writer.write("\n");

            writer.write("Time 1: " + nomeTime1 + "\n");
            writer.write("Jogadores:\n");
            for (String jogador : jogadoresTime1) {
                writer.write(" - " + jogador + "\n");
            }
            writer.write("Pontuações: " + pontuacoesTime1 + "\n");
            writer.write("Erros: " + errosTime1 + "\n");
            writer.write("Acertos: " + acertosTime1 + "\n\n");

            writer.write("Time 2: " + nomeTime2 + "\n");
            writer.write("Jogadores:\n");
            for (String jogador : jogadoresTime2) {
                writer.write(" - " + jogador + "\n");
            }
            writer.write("Pontuações: " + pontuacoesTime2 + "\n");
            writer.write("Erros: " + errosTime2 + "\n");
            writer.write("Acertos: " + acertosTime2 + "\n\n");

            writer.write("Resultado Final: " + resultadoFinal + "\n");

            JOptionPane.showMessageDialog(frame, "Súmula gerada com sucesso!\nArquivo salvo como: " + nomeArquivo);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(frame, "Erro ao gerar súmula: " + e.getMessage());
        }
    }

    private void reiniciar() {
        jogadoresTime1.clear();
        jogadoresTime2.clear();
        pontuacoesTime1.clear();
        pontuacoesTime2.clear();
        arbitro = local = horarioInicio = horarioFim = nomeTime1 = nomeTime2 = resultadoFinal = null;
        errosTime1 = acertosTime1 = errosTime2 = acertosTime2 = 0;
        JOptionPane.showMessageDialog(frame, "Todos os dados foram reiniciados!");
    }
}



