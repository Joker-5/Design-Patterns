package prototype.bean;/*
 *项目名: Design-Patterns
 *文件名: Plane
 *创建者: 张昊
 *创建时间:2020/12/23 23:54
 *描述: TODO

 */

public class Plane implements Cloneable {
    private int x;
    private int y = 0;
    private Bullet bullet = new Bullet();

    public Plane(int x) {
        this.x = x;
    }

    public void fly() {
        y++;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setBullet(Bullet bullet) {
        this.bullet = bullet;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public Plane clone() throws CloneNotSupportedException {
        Plane clone = (Plane) super.clone();
        //注意此处是为了处理子弹对象的浅拷贝问题，实现对象的深拷贝
        clone.setBullet(this.bullet.clone());
        return clone;
    }
}
