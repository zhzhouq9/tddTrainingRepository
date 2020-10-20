package tdd;
/**
 * @author zhzhouq
 * @date 2020-10-20 - 22:30
 * <p>
 * 类名称: FizzBuzzTest
 * 类描述：(这里用一句话描述这个类的作用)
 * 创建时间: 2020-10-20 22:30
 * 创建人： zhzhouq
 * 版本： 1.0
 */

import com.iss.tdd.FizzBuzz;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {
    private static int n = 100;

    @Before
    public void paramInit() {
        n = 10;
    }

    @Test
    public void FizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.FizzBuzz(n);
    }
}