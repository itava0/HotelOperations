package com.pluralsight;

import java.time.format.DateTimeFormatter;
import java.util.*;
import java.time.*;

public class Employee {
    static Scanner myScanner = new Scanner(System.in);
    static LocalDateTime timeNow = LocalDateTime.now();
    static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd h:mm:a");
    private long employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double totalHours;
    private double regularsHours;
    private double overtimeHours;
    private double punchIn;
    private double punchOut;
    static double decimalTime = timeNow.getHour() + (timeNow.getMinute() / 60);


    public Employee(long employeeId, String name, String department, double payRate, double hoursWorked, double totalPay, double totalHours, double regularsHours, double overtimeHours, double punchIn, double punchOut) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.totalHours = totalHours;
        this.regularsHours = regularsHours;
        this.overtimeHours = overtimeHours;
        this.punchIn = punchIn;
        this.punchOut = punchOut;
    }

    public static void punchTimeCard() {
        while (true) {
            System.out.println("""
                    Please choose one of the following.
                    1) Check In
                    2) Check Out
                    3) Exit
                    """);
            String userChoice = myScanner.nextLine();
            switch (userChoice) {
                case "1":
                    punchIn();
                    break;
                case "2":
                    punchOut();
                    break;
                case "3":
                    System.exit(0);
                default:
                    System.out.println("Choose 1 or 2 ");

            }
        }

    }
    public static void punchIn(double overtimeHours){}
    public static void punchIn(){
        System.out.println("Welcome, you've clocked in at " + timeFormat.format(timeNow) + " " + decimalTime);
    }
    public static void punchOut(double overtimeHours){}
    public static void punchOut(){
        System.out.println("Goodbye, you've clocked out at  " + timeFormat.format(timeNow) + " " + decimalTime);
    }
    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        if (overtimeHours < 0) {
            return regularsHours * payRate;
        } else {
            return (regularsHours * payRate) + (overtimeHours * payRate * 1.5);
        }
    }

    public void setTotalPay(double totalPay) {
        this.totalPay = totalPay;
    }

    public double getTotalHours() {
        return regularsHours + overtimeHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double getRegularsHours() {
        return regularsHours;
    }

    public void setRegularsHours(double regularsHours) {
        this.regularsHours = regularsHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }

    public void setOvertimeHours(double overtimeHours) {
        this.overtimeHours = overtimeHours;
    }
}