package com.Geekster.UserManagementSystemvalid;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class User {
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDateTime getUserDOB() {
        return userDOB;
    }

    public void setUserDOB(LocalDateTime userDOB) {
        this.userDOB = userDOB;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Integer userPhone) {
        this.userPhone = userPhone;
    }

    public LocalDate getUserDate() {
        return userDate;
    }

    public void setUserDate(LocalDate userDate) {
        this.userDate = userDate;
    }

    public LocalTime getUserTime() {
        return userTime;
    }

    public void setUserTime(LocalTime userTime) {
        this.userTime = userTime;
    }

    public Type getUserType() {
        return userType;
    }

    public User(Integer userId, String userName, LocalDateTime userDOB, String userEmail, Integer userPhone, LocalDate userDate, LocalTime userTime, Type userType) {
        this.userId = userId;
        this.userName = userName;
        this.userDOB = userDOB;
        this.userEmail = userEmail;
        this.userPhone = userPhone;
        this.userDate = userDate;
        this.userTime = userTime;
        this.userType = userType;
    }

    public void setUserType(Type userType) {
        this.userType = userType;
    }

    @NotNull
    private Integer userId;
    @NotBlank
    private String userName;

    private LocalDateTime userDOB;

    private String userEmail;

    @Size(min = 10, max=10)
    @Pattern(regexp = "^[0-9]+$", message = "contacts should be just numbers!!")

    private Integer userPhone;

    private LocalDate userDate;

    private LocalTime userTime;

    private Type userType;
}
