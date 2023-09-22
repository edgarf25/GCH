import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Main {
    private static final Color PANEL_BACKGROUND_COLOR = Color.WHITE; // Background color
    private static final Color GRID_COLOR = Color.GRAY; // Grid color

    public static void main(String[] args) {
        // Create a JFrame (window)
        JFrame frame = new JFrame("Box Example");
        int[] height = new int[11];
        Arrays.fill(height, 0);
        // Create a JPanel (a container for components)
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                // Set the background color
                g.setColor(PANEL_BACKGROUND_COLOR);
                g.fillRect(0, 0, getWidth(), getHeight()); // Fill the panel with the background color

                // Draw the grid
                drawGrid(g);

                try {
                    Main main = new Main();
                    main.redraw(args, g, height);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            private void drawGrid(Graphics g) {
                // Define grid parameters
                int gridSize = 20; // Adjust the size of the grid squares
                int width = getWidth();
                int height = getHeight();

                // Set the grid color
                g.setColor(GRID_COLOR);

                // Draw vertical grid lines
                for (int x = 0; x < width; x += gridSize) {
                    g.drawLine(x, 0, x, height);
                }

                // Draw horizontal grid lines
                for (int y = 0; y < height; y += gridSize) {
                    g.drawLine(0, y, width, y);
                }
            }
        };

        JButton button = new JButton("REDRAW");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    panel.repaint(); // Clear the panel by repainting it
                    Main main = new Main();
                    main.redraw(args, panel.getGraphics(), height);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
        // Add the panel to the frame
        frame.add(panel);
        panel.add(button);
        // Set the frame size and make it visible
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setResizable(false);
    }

    public void redraw(String[] args, Graphics g, int[] height) throws Exception {
        Random rand = new Random();
        for (int i = 0; i < 11; i++) {
            height[i] = rand.nextInt(-90, 200); // Corrected random range
            int red = rand.nextInt(255);
            int green = rand.nextInt(255);
            int blue = rand.nextInt(255);
            g.setColor(new Color(red, green, blue));
            g.fillRect(35 + 40 * i, 300 - height[i], 10, 100 + height[i]);
        }
    }
}
