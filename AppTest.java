package com.company;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void testLogin1() {
        App myapp = new App();
        Assert.assertEquals(0, myapp.userLogin("Kaya", "Kaya97"));
    }
    @Test
    public void testLogin2() {
        App myapp = new App();
        Assert.assertEquals(1, myapp.userLogin("Kaya", "Kaya@97"));
    }


}
