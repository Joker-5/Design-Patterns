package prototype.pattern;/*
 *项目名: Design-Patterns
 *文件名: PlaneFactory
 *创建者: 张昊
 *创建时间:2020/12/23 23:56
 *描述: TODO

 */

import prototype.bean.Plane;

public class PlaneFactory {
    //定义原型
    private static Plane prototype = new Plane(200);

    //利用工厂方法直接从工厂中克隆原型
    public static Plane planeFactory(int x) throws CloneNotSupportedException {
        Plane clone = prototype.clone();
        clone.setX(x);
        return clone;
    }
}
