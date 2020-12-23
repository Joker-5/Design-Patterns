package prototype.bean;/*
 *项目名: Design-Patterns
 *文件名: Bullet
 *创建者: 张昊
 *创建时间:2020/12/23 23:56
 *描述: TODO

 */

public class Bullet {
    @Override
    protected Bullet clone() throws CloneNotSupportedException {
        return (Bullet) super.clone();
    }
}
