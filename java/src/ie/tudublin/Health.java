package ie.tudublin;

public class Health {
    float x, y;
    float dx, dy;
    float w = 50;
    float halfW = w/2;
    YASC yasc;
    float rotation;

    public Health(){

    }

    public Health(float x, float y, YASC yasc, float rotation) {
        this.x = x;
        this.y = y;
        this.yasc = yasc;
        this.rotation = 0;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getCx() {
        return dx;
    }

    public void setCx(float cx) {
        this.dx = cx;
    }

    public float getCy() {
        return dy;
    }

    public void setCy(float cy) {
        this.dy = cy;
    }

    public float getW() {
        return w;
    }

    public void setW(float w) {
        this.w = w;
    }

    public float getHalfW() {
        return halfW;
    }

    public void setHalfW(float halfW) {
        this.halfW = halfW;
    }

    public YASC getYasc() {
        return yasc;
    }

    public void setYasc(YASC yasc) {
        this.yasc = yasc;
    }

    public float getRotation() {
        return rotation;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    @Override
    public String toString() {
        return "Health [cx=" + dx + ", cy=" + dy + ", halfW=" + halfW + ", rotation=" + rotation + ", w=" + w + ", x="
                + x + ", y=" + y + ", yasc=" + yasc + "]";
    }

    

    
}
