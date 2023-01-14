import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class ArrowKeys {
    public ArrowKeys(){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel("Up: 0");
        JLabel down = new JLabel("Down: 0");
        JLabel left = new JLabel("Left: 0");
        JLabel right = new JLabel("Right: 0");

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);

        frame.addKeyListener(new KeyListener() {
            int upCount = 0;
            int downCount = 0;
            int leftCount = 0;
            int rightCount = 0;

            public void keyTyped(KeyEvent e) {

            }
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        up.setText("Up: " + Integer.toString(upCount++));
                        break;
                    case KeyEvent.VK_DOWN:
                        down.setText("Down: " + Integer.toString(downCount++));
                        break;
                    case KeyEvent.VK_LEFT:
                        left.setText("Left: " + Integer.toString(leftCount++));
                        break;
                    case KeyEvent.VK_RIGHT:
                        right.setText("Right: " + Integer.toString(rightCount++));
                        break;
                }
            }
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);


    }

    public static void main(String[] args) {
        new ArrowKeys();

    }
}