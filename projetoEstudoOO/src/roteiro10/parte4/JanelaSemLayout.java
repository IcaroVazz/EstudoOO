package roteiro10.parte4;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JanelaSemLayout extends JFrame implements ActionListener {

    private int largura = 500;
    private int altura = 500;

    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;

    public JanelaSemLayout() {
        this.setTitle("Janela sem Layout");
        this.setSize(largura, altura);
        this.setLayout(null); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        iniciarComponentes();

        this.setVisible(true);
    }

    public void iniciarComponentes() {
        btn01 = new JButton("Botão 01");
        btn02 = new JButton("Botão 02");
        btn03 = new JButton("Botão 03");
        btn04 = new JButton("Botão 04");
        btn05 = new JButton("Botão 05");
        btn06 = new JButton("Botão 06");

     
        btn01.setBounds(50, 50, 100, 30);
        btn02.setBounds(160, 50, 100, 30);
        btn03.setBounds(270, 50, 100, 30);
        btn04.setBounds(50, 100, 100, 30);
        btn05.setBounds(160, 100, 100, 30);
        btn06.setBounds(270, 100, 100, 30);

 
        add(btn01);
        add(btn02);
        add(btn03);
        add(btn04);
        add(btn05);
        add(btn06);

     
        btn01.addActionListener(this);
        btn02.addActionListener(this);
        btn03.addActionListener(this);
        btn04.addActionListener(this);
        btn05.addActionListener(this);
        btn06.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object o = e.getSource();         
        JButton b = (JButton) o;         
        String nome = b.getText();     
        System.out.println("O clique do mouse foi acionado por: " + nome +  " da classe " + o.getClass().getName());
    }
}
