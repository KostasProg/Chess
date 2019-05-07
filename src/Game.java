import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;

public class Game extends Canvas implements Runnable {
    private final JFrame frame;
    private Dimension dimension;
    private final long serialVersionUID = -7231598331440141632L;
    private Thread thread;
    private Boolean running = false;
    private Handler handler;
    private Mouse mouse;

    public Game(Dimension dimension, JFrame frame) {
        this.frame = frame;
        this.dimension = dimension;
        setSize(dimension);
        setFocusable(true);


        this.handler = new Handler(this);
        mouse=new Mouse(this,handler);
        addMouseListener(mouse);

    }

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        double amounOFTicks = 60;
        double ns = 1000000000 / amounOFTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running) {
                render();
            }
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }

    }

    private void tick() {
        handler.tick();

    }


    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        this.handler.render(g);


        g.dispose();
        bs.show();
    }


    public synchronized void start() {


        thread = new Thread(this);
        thread.start();
        running = true;

    }

    public synchronized void stop() {
        try {
            thread.join();
            running = false;
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
