import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends JFrame implements ActionListener {

    private final JButton[] buttons = new JButton[9];
    private boolean xTurn = true;
    private int moveCount = 0;
    private final JLabel statusLabel = new JLabel("X's Turn");

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel board = new JPanel();
        board.setLayout(new GridLayout(3, 3));
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 60);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton("");
            buttons[i].setFont(font);
            buttons[i].addActionListener(this);
            board.add(buttons[i]);
        }

        JPanel bottom = new JPanel(new BorderLayout());
        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> resetGame());
        statusLabel.setHorizontalAlignment(JLabel.CENTER);
        bottom.add(statusLabel, BorderLayout.CENTER);
        bottom.add(resetButton, BorderLayout.EAST);

        add(board, BorderLayout.CENTER);
        add(bottom, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (!btn.getText().equals("")) return;

        btn.setText(xTurn ? "X" : "O");
        moveCount++;

        if (checkWin()) {
            statusLabel.setText((xTurn ? "X" : "O") + " wins!");
            disableButtons();
        } else if (moveCount == 9) {
            statusLabel.setText("Draw!");
        } else {
            xTurn = !xTurn;
            statusLabel.setText((xTurn ? "X" : "O") + "'s Turn");
        }
    }

    private boolean checkWin() {
        String[][] grid = new String[3][3];
        for (int i = 0; i < 9; i++) {
            grid[i / 3][i % 3] = buttons[i].getText();
        }

        String player = xTurn ? "X" : "O";
        return
            (grid[0][0].equals(player) && grid[0][1].equals(player) && grid[0][2].equals(player)) ||
            (grid[1][0].equals(player) && grid[1][1].equals(player) && grid[1][2].equals(player)) ||
            (grid[2][0].equals(player) && grid[2][1].equals(player) && grid[2][2].equals(player)) ||
            (grid[0][0].equals(player) && grid[1][0].equals(player) && grid[2][0].equals(player)) ||
            (grid[0][1].equals(player) && grid[1][1].equals(player) && grid[2][1].equals(player)) ||
            (grid[0][2].equals(player) && grid[1][2].equals(player) && grid[2][2].equals(player)) ||
            (grid[0][0].equals(player) && grid[1][1].equals(player) && grid[2][2].equals(player)) ||
            (grid[0][2].equals(player) && grid[1][1].equals(player) && grid[2][0].equals(player));
    }

    private void disableButtons() {
        for (JButton b : buttons) {
            b.setEnabled(false);
        }
    }

    private void resetGame() {
        for (JButton b : buttons) {
            b.setText("");
            b.setEnabled(true);
        }
        xTurn = true;
        moveCount = 0;
        statusLabel.setText("X's Turn");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TicTacToe game = new TicTacToe();
            game.setVisible(true);
        });
    }
}
