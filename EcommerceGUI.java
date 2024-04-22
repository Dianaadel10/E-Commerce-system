import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcommerceGUI extends JFrame implements ActionListener {
    private JTextField idField, nameField, addressField, nProductsField;
    private JTextArea outputArea;
    private JButton submitButton;

    public EcommerceGUI() {
        setTitle("E-commerce System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(6, 2));

        JLabel idLabel = new JLabel("Customer ID:");
        idField = new JTextField();
        mainPanel.add(idLabel);
        mainPanel.add(idField);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField();
        mainPanel.add(nameLabel);
        mainPanel.add(nameField);

        JLabel addressLabel = new JLabel("Address:");
        addressField = new JTextField();
        mainPanel.add(addressLabel);
        mainPanel.add(addressField);

        JLabel nProductsLabel = new JLabel("Number of Products:");
        nProductsField = new JTextField();
        mainPanel.add(nProductsLabel);
        mainPanel.add(nProductsField);

        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);
        mainPanel.add(submitButton);

        outputArea = new JTextArea();
        outputArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        add(mainPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        int customerId = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String address = addressField.getText();
        int nProducts = Integer.parseInt(nProductsField.getText());

        outputArea.setText("Customer ID: " + customerId + "\nName: " + name + "\nAddress: " + address +
                "\nNumber of Products: " + nProducts);
    }
}