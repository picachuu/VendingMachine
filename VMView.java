import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Color;

public class VMView {
	private JFrame mainFrame;
	private JLabel idLbl, nameLbl, feedbackLbl;
	private JTextField idTf, nameTf;
	private JButton addBtn, viewBtn;
	private JTextArea employeeListTextArea;
    private JLabel greetingsLbl;
    private JLabel alignmentLbl;

	public VMView() {
		this.mainFrame = new JFrame("Vending Machine Factory");
        this.mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.mainFrame.setLayout(new FlowLayout());
        this.mainFrame.setSize(280, 200);

        this.greetingsLbl = new JLabel(" ");
        this.alignmentLbl = new JLabel(" ");

        initializeGreetingElements();
        
        initializeAlignmentElements();
        initializeSwappingElements();

        this.mainFrame.setVisible(true);
    }
    private void initializeGreetingElements() {
        JLabel greetingsPromptLb1 = new JLabel();
        greetingsPromptLb1.setText("Name: ");
        
        JTextField greetingNameTf = new JTextField();
        greetingNameTf.setColumns(10);

        JButton greetingsBtn = new JButton("Submit");
        greetingsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (greetingNameTf.getText().equals("Niccolo")||greetingNameTf.getText().equals("niccolo")) {
                    greetingsLbl.setText("     Hi pogi     ");
                } else {
                    greetingsLbl.setText("you're not pogi");
                }
            }
        });    

        
        this.mainFrame.add(greetingsPromptLb1); 
        this.mainFrame.add(greetingNameTf);
        this.mainFrame.add(greetingsBtn);
        this.mainFrame.add(greetingsLbl);
    }

    private void initializeAlignmentElements() {
        JPanel panel = new JPanel(new BorderLayout());
       
        panel.setBackground(Color.red);

        JButton btn1 = new JButton("Left");
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alignmentLbl.setText("Left");
                alignmentLbl.setHorizontalAlignment(JLabel.LEFT);
            }
        });

        JButton btn2 = new JButton("Center");
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alignmentLbl.setText("Center");
                alignmentLbl.setHorizontalAlignment(JLabel.CENTER);
            }
        });

        JButton btn3 = new JButton("Right");
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alignmentLbl.setText("Right");
                alignmentLbl.setHorizontalAlignment(JLabel.RIGHT);
            }
        });

        panel.add(btn1, BorderLayout.WEST);
        panel.add(btn2, BorderLayout.CENTER);
        panel.add(btn3, BorderLayout.EAST);
        panel.add(alignmentLbl, BorderLayout.SOUTH);

        this.mainFrame.add(panel);
    }

    private void initializeSwappingElements() {
        JButton btn = new JButton("Loves me");
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton) e.getSource();

                if (btn.getText().equals("Loves me")) {
                    btn.setText("Loves me not");
                } else {
                    btn.setText("Loves me");
                }
            }
        });

        this.mainFrame.add(btn);
    }
    
}
