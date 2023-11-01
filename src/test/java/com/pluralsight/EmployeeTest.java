package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;

public class EmployeeTest {
    private Employee employee;

    @BeforeEach
    void setUp() {
        // Create an instance of Employee before each test
        employee = new Employee(1, "John Doe", "IT", 20.0, 40.0, 0.0, 0.0, 40.0, 0.0, 0.0, 0.0);
    }

    @Test
    public void testGetTotalPay() {
        double totalPay = employee.getTotalPay();
        assertEquals(800.0, totalPay, 0.01); // Assuming regular pay rate of $20 and 40 regular hours
    }

    @Test
    public void testGetTotalHours() {
        double totalHours = employee.getTotalHours();
        assertEquals(40.0, totalHours, 0.01); // Assuming 40 regular hours and 0 overtime hours
    }

    @Test
    public void testPunchIn() {
        LocalDateTime fakeTime = LocalDateTime.of(2023, 1, 1, 8, 0);
        Employee.timeNow = fakeTime;
        Employee.punchIn();
    }

    @Test
    public void testPunchOut() {
        LocalDateTime fakeTime = LocalDateTime.of(2023, 1, 1, 17, 0);
        Employee.timeNow = fakeTime;
        Employee.punchOut();
    }
}
