package roteiro10.parte3;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Color;

public class JanelaBorderLayout_v1 extends JFrame {
    private JPanel pnCabecalho;
    private JPanel pnRodape;
    private JPanel pnEsquerda;
    private JPanel pnDireita;
    private JPanel pnCentro;

    public JanelaBorderLayout_v1(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Janela BorderLayout");

        this.setLayout(new BorderLayout());
        this.iniciarComponentes();
        this.pack();
        this.setVisible(true);
    }

    public void iniciarComponentes(){
        this.pnCabecalho = new JPanel();
        this.pnRodape = new JPanel();
        this.pnEsquerda = new JPanel();
        this.pnDireita = new JPanel();
        this.pnCentro = new JPanel();

        this.pnCabecalho.setBackground(Color.red);
        this.pnRodape.setBackground(Color.blue);
        this.pnEsquerda.setBackground(Color.yellow);
        this.pnDireita.setBackground(Color.gray);
        this.pnCentro.setBackground(Color.green);

        this.add(pnCabecalho, BorderLayout.PAGE_START);
        this.add(pnRodape, BorderLayout.PAGE_END);
        this.add(pnEsquerda, BorderLayout.LINE_START);
        this.add(pnDireita, BorderLayout.LINE_END);
        this.add(pnCentro, BorderLayout.CENTER);
    }
}
