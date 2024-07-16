import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounterApp {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Word Counter");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a text area for input
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        
        // Create a button to count words
        JButton countButton = new JButton("Count Words");
        
        // Create a label to display the result
        JLabel resultLabel = new JLabel("Word Count: 0");
        
        // Add action listener to the button
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText().trim();
                int wordCount = countWords(text);
                resultLabel.setText("Word Count: " + wordCount);
            }
        });
        
        // Create a panel and add components
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(textArea));
        panel.add(countButton);
        panel.add(resultLabel);
        
        // Add panel to the frame
        frame.add(panel);
        frame.setVisible(true);
    }
    
    // Method to count words
    private static int countWords(String text) {
        if (text.isEmpty()) {
            return 0;
        }
        String[] words = text.split("\\s+"); // Split by whitespace
        return words.length;
    }
}
