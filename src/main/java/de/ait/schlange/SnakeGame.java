package de.ait.schlange;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.util.LinkedList;
import java.util.Random;

public class SnakeGame extends JFrame implements KeyListener {
    private static final long serialVersionUID = 1L;
    private static final int TILE_SIZE = 30;
    private static final int GRID_SIZE = 30;
    private static final int GAME_SPEED = 150;

    private LinkedList<Point> snake;
    private Point fruit;
    private int direction; // 0 - Up, 1 - Right, 2 - Down, 3 - Left
    private boolean gameOver;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(GRID_SIZE * TILE_SIZE, GRID_SIZE * TILE_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);

        snake = new LinkedList<>();
        snake.add(new Point(GRID_SIZE / 2, GRID_SIZE / 2));
        direction = 1; // initially moving to the right
        spawnFruit();

        new Thread(() -> {
            while (!gameOver) {
                move();
                checkCollision();
                checkFruit();
                repaint();
                try {
                    Thread.sleep(GAME_SPEED);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

    private void move() {
        Point head = snake.getFirst();
        Point newHead = null;

        switch (direction) {
            case 0: // Up
                newHead = new Point(head.x, (head.y - 1 + GRID_SIZE) % GRID_SIZE);
                break;
            case 1: // Right
                newHead = new Point((head.x + 1) % GRID_SIZE, head.y);
                break;
            case 2: // Down
                newHead = new Point(head.x, (head.y + 1) % GRID_SIZE);
                break;
            case 3: // Left
                newHead = new Point((head.x - 1 + GRID_SIZE) % GRID_SIZE, head.y);
                break;
        }

        snake.addFirst(newHead);

        if (!newHead.equals(fruit)) {
            snake.removeLast();
        }
    }

    private void checkCollision() {
        Point head = snake.getFirst();

        // Check collision with the body
        for (int i = 1; i < snake.size(); i++) {
            if (head.equals(snake.get(i))) {
                gameOver = true;
            }
        }

        // Check collision with the walls
        if (head.x < 0 || head.x >= GRID_SIZE || head.y < 0 || head.y >= GRID_SIZE) {
            gameOver = true;
        }
    }

    private void checkFruit() {
        Point head = snake.getFirst();

        if (head.equals(fruit)) {
            spawnFruit();
        }
    }

    private void spawnFruit() {
        Random rand = new Random();
        int x, y;
        do {
            x = rand.nextInt(GRID_SIZE);
            y = rand.nextInt(GRID_SIZE);
        } while (snake.contains(new Point(x, y)));

        fruit = new Point(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Draw the snake
        g.setColor(Color.GREEN);
        for (Point p : snake) {
            g.fillRect(p.x * TILE_SIZE, p.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);
        }

        // Draw the fruit
        g.setColor(Color.RED);
        g.fillRect(fruit.x * TILE_SIZE, fruit.y * TILE_SIZE, TILE_SIZE, TILE_SIZE);

        // Draw the game over message
        if (gameOver) {
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 40));
            g.drawString("Game Over", GRID_SIZE * TILE_SIZE / 4, GRID_SIZE * TILE_SIZE / 2);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if ((key == KeyEvent.VK_UP) && (direction != 2)) {
            direction = 0;
        } else if ((key == KeyEvent.VK_RIGHT) && (direction != 3)) {
            direction = 1;
        } else if ((key == KeyEvent.VK_DOWN) && (direction != 0)) {
            direction = 2;
        } else if ((key == KeyEvent.VK_LEFT) && (direction != 1)) {
            direction = 3;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SnakeGame game = new SnakeGame();
            game.setVisible(true);
        });
    }
}


