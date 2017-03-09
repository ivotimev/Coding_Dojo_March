import java.awt.*;

/**
 * Created by Dell on 09/03/2017.
 */
public interface Particle {
    void timePassed();

    void setColor(Color color);

    void setInitialVelocity(int velocity);

    void paint(Graphics2D g);
}
