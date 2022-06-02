import java.awt.geom.Point2D;
public class Vector2D {
    private double len = 200;                                                     // Длина вектора
    private double ang = 88;                                                     // Угол вектора

    /**
     * Создание вектора по длине и углу
     * @param len длина
     * @param ang угол в радианах
     */
    public Vector2D(double len, double ang) {
        this.len = len;
        this.ang = ang;
    }

    /**
     * Создание вектора по 2м точкам
     * @param a первая точка
     * @param b вторая точка
     */
    public Vector2D(Point2D.Double a, Point2D.Double b) {
        double dx;
        double dy;
        dx = a.x - b.x;
        dy = a.y - b.y;
        len = Math.sqrt(dx*dx + dy*dy);
        ang = Math.atan2(dy, dx);
    }

    /**
     * Получение конечной точки вектора
     * @param beginPoint начальная точка
     * @return конечная точка
     */
    public Point2D.Double getEndPoint(Point2D.Double beginPoint) {
        Point2D.Double point = new Point2D.Double();
        point.x = beginPoint.x + len * Math.cos(ang);
        point.y = beginPoint.y + len * Math.sin(ang);
        return point;
    }

}