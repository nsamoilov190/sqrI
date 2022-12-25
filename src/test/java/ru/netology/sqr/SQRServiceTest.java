package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void calcTestSQR() {
        SQRService service = new SQRService();
        int actual = service.findingSQR(200, 300);
        int expected = 3;
        assertEquals(expected, actual);
    }
@Test
    public void calcTestSQR2() {
    SQRService service = new SQRService();
    int actual = service.findingSQR(0, 200);
    int expected = 5;
    assertEquals(expected, actual);

}
    @Test
    public void calcTestSQR3() {
        SQRService service = new SQRService();
        int actual = service.findingSQR(9802, 9999);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void calcTestSQR5() {
        SQRService service = new SQRService();
        int actual = service.findingSQR(0, 99);
        int expected = 0;
        assertEquals(expected, actual);
    }

}