package ru.forxy.patterns.sample.callcenter;

import org.junit.Assert;
import org.junit.Test;
import ru.forxy.sample.callcenter.CallCenter;
import ru.forxy.sample.callcenter.Customer;
import ru.forxy.sample.callcenter.Operator;

/**
 * Unit test for CallCenter
 */
public class CallCenterTest {

    @Test
    public void testCallCenterHappyPath() throws InterruptedException {
        CallCenter callCenter = new CallCenter(5);
        callCenter.call(new Customer("Alex"));
        callCenter.call(new Customer("Valery"));
        callCenter.call(new Customer("Max"));
        callCenter.call(new Customer("David"));
        callCenter.call(new Customer("Matt"));
        Assert.assertEquals(5, callCenter.getQueueSize());
        callCenter.registerOperator("Terminator");
        callCenter.registerOperator("Sunny");
        callCenter.registerOperator("RoboChicken");
        Thread.sleep(1000);
        Assert.assertEquals(0, callCenter.getQueueSize());
    }

    @Test
    public void testCallCenterOverload() {
        CallCenter callCenter = new CallCenter(2);
        callCenter.call(new Customer("Max"));
        callCenter.call(new Customer("David"));
        try {
            callCenter.call(new Customer("Alex"));
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertNotNull(e.getMessage());
        }
    }
}
