import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.awt.Dimension;
import java.awt.GridLayout;

@SuppressWarnings("serial")

public class Window extends JPanel {
	
	public Window() {
        super(new GridLayout(1,0));

        String[] columnNames = {"First Name",
                                "Last Name",
                                "Birthday"}; 
         
        String[][] data = {
        {"Dimitris", "Kepesidis", "22/4/1998"},
        {"Vassilis", "Chavales", "27/2/1997"},
        {"Stella", "Seitanidou", "15/5/1997"},
        {"Rick", "Santsez", "1/1/1"},
        {"Happy", "Horse", "2/8/2004"}
        };
        
        final JTable table = new JTable(data, columnNames);
        table.setPreferredScrollableViewportSize(new Dimension(500, 80));
        table.setFillsViewportHeight(true);
 
        JScrollPane scrollPane = new JScrollPane(table);
 
        add(scrollPane);
    }
 
	
    static void createAndShowGUI() {
        //Dimiourgia parathirou
        JFrame frame = new JFrame("Ergazomenoi");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Parathiro periexomenwn
        Window newContentPane = new Window();
        newContentPane.setOpaque(true);
        frame.setContentPane(newContentPane);
 
        //Provoli tou parathirou
        frame.pack();
        frame.setVisible(true);
    }
/* 
    public static void main(String[] args) {
        
    	javax.swing.SwingUtilities.invokeLater(new Runnable() {
        	public void run() {
            	Window.createAndShowGUI();
        	}
        });
    } 
*/    
}
