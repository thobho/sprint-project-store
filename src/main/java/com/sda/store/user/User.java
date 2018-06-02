package com.sda.store.user;

import java.util.Date;
import java.util.Objects;

public class User {

    private String name;
    private Date joinDate;

    public User(String name, Date joinDate) {
        this.name = name;
        this.joinDate = joinDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", joinDate=" + joinDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(joinDate, user.joinDate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, joinDate);
    }
}
