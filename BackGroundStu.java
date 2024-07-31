package New_Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableModel;

public class BackGroundStu extends JFrame implements ActionListener {
    private JLabel l1 = new JLabel("Student Name");
    private JComboBox<String> name = new JComboBox<>();
    private JButton btns = new JButton("Show");
    private JButton btne = new JButton("Exit");
    private JTable table;
    private DefaultTableModel tableModel;

    public BackGroundStu() {

        // Set background color for JFrame
        getContentPane().setBackground(new ColorUIResource(Color.cyan));

        setLayout(null);
        // Create a panel for the title and set it at the top
        JPanel titlePanel = new JPanel(new BorderLayout());
        JLabel titleLabel = new JLabel("Student Information", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 16));
        titlePanel.add(titleLabel, BorderLayout.CENTER);
        titlePanel.setBounds(0, 0, 700, 30);
        add(titlePanel);

        l1.setBounds(50, 40, 100, 20);
        add(l1);
        name.setBounds(150, 40, 150, 20);
        name.addItem("Ngorn Lika");
        name.addItem("Keo Sovannarith");
        name.addItem("Raksa Chamrong");
        name.addItem("Kun Seyha");
        name.addItem("Chon Panha");
        name.addItem("Ngo CheckTay");
        name.addItem("Chhay Seyhak");
        name.addItem("Chheng Borey");
        add(name);
        btns.setBounds(440, 40, 80, 20);
        btns.addActionListener(this);
        add(btns);

        btne.setBounds(440, 70, 80, 20);
        btne.addActionListener(this);
        add(btne);

        // Set button background and foreground colors
        btns.setBounds(440, 40, 80, 20);
        btns.setBackground(new Color(50, 205, 50));
        btns.setForeground(Color.WHITE);
        btns.addActionListener(this);
        add(btns);

        btne.setBounds(440, 70, 80, 20);
        btne.setBackground(new Color(255, 69, 0));
        btne.setForeground(Color.WHITE);
        btne.addActionListener(this);
        add(btne);

        String[] columnNames = {"ID", "Full Name", "Sex", "DOB", "Major", "Picture"};
        tableModel = new DefaultTableModel(columnNames, 0) {
            @Override
            public Class<?> getColumnClass(int column) {
                if (column == 5) {
                    return ImageIcon.class;
                }
                return Object.class;
            }
        };
        table = new JTable(tableModel);
        table.setRowHeight(100);
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(20, 100, 640, 330);
        add(scrollPane);

        setTitle("Student Information");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BackGroundStu();
    }


    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btns) {
            String selectedName = (String) name.getSelectedItem();
            // Check if the student is already in the table
            boolean exists = false;
            for (int i = 0; i < tableModel.getRowCount(); i++) {
                if (tableModel.getValueAt(i, 1).equals(selectedName)) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                Object[] studentInfo = null;
                String selection = null;
                if ("Ngorn Lika".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\lika.jpg";
                    studentInfo = new Object[]{"ID05", "Ngorn Lika", "Female", "12/09/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Keo Sovannarith".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\me.jpg";
                    studentInfo = new Object[]{"ID01", "Keo Sovannarith", "Male", "12/12/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Ngo CheckTay".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\tay.jpg";
                    studentInfo = new Object[]{"ID23", "Ngo CheckTay", "Male", "01/07/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Raksa Chamrong".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\raksa.jpg";
                    studentInfo = new Object[]{"ID09", "Raksa Chamrong", "Male", "01/08/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Kun Seyha".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\seyha.jpg";
                    studentInfo = new Object[]{"ID04", "Kun Seyha", "Male", "01/08/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Chon Panha".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\nha.jpg";
                    studentInfo = new Object[]{"ID09", "Chon Panha", "Male", "01/08/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Chhay Seyhak".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\syhak.jpg";
                    studentInfo = new Object[]{"ID09", "Chhay Seyhak", "Male", "01/08/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if ("Chheng Borey".equals(selectedName)) {
                    selection = "C:\\Users\\ASUS TUF A15\\IdeaProjects\\ReanJava\\src\\images\\bory.jpg";
                    studentInfo = new Object[]{"ID09", "Chheng Borey", "Male", "19/10/2004", "CS", new ImageIcon(new ImageIcon(selection).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH))};
                }
                if (studentInfo != null) {
                    tableModel.addRow(studentInfo);
                }
            }
        }
        if (ae.getSource() == btne) {
            System.exit(0);
        }
    }
}


