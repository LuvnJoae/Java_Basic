package test;

import Junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAdd(){
//        System.out.println("我被执行了");
        //1. 创建对象
        Calculator c = new Calculator();
        //2. 调用add方法
        int result = c.add(1, 2);
//        System.out.println(result);
        //3. 断言
        Assert.assertEquals(3,result);

    }

}
