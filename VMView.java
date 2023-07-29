import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;

public class VMView {
	private JFrame mainFrame;
	private JLabel idLbl, nameLbl, feedbackLbl;
	private JTextField idTf, nameTf;
	private JButton addBtn, viewBtn;
	private JTextArea employeeListTextArea;

	public VMView() {
		this.mainFrame = new JFrame("Vending Machine Factory");

    }
}