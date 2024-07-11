package lesson14;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class QuadraticEquationTest extends TestCase {

    QuadraticEquation equation;

    @Test
    public void testGetTwoRoots() {
        double a = 1;
        double b = 5;
        double c = 6;

        double expectedFirstRoot = -2;
        double expectedSecondRoot = -3;
        equation = new QuadraticEquation(a,b,c);
        double[] actualRoots  = equation.solve();

        Assert.assertEquals(actualRoots.length, 2);
        Assert.assertEquals(actualRoots[0],expectedFirstRoot, 0.0001);
        Assert.assertEquals(actualRoots[1],expectedSecondRoot, 0.0001);
    }
    @Test
    public void testGetOneRoot() {
        double a = 4;
        double b = 4;
        double c = 1;

        double expectedRoot = - 0.5;

        equation = new QuadraticEquation(a,b,c);
        double[] actualRoots  = equation.solve();

        Assert.assertEquals(actualRoots.length, 1);
        Assert.assertEquals(actualRoots[0],expectedRoot, 0.0001);

    }
    @Test
    public void testWithoutRoots() {
        double a = 1;
        double b = 2;
        double c = 3;

        equation = new QuadraticEquation(a,b,c);
        double[] actualRoots  = equation.solve();

        Assert.assertNotNull(actualRoots);

    }
}