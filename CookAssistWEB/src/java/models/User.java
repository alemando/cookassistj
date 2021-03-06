package models;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class User {

    public static ArrayList<User> all_users = new ArrayList<User>() {
        {
            add(new User("Admin", "Admin", "admin@admin", "1234", "00/00/00", true));
            add(new User("Juan", "Ciro", "juan@gmail", "1234", "00/00/00", false));
        }
    };

    private String name;
    private String l_name;
    private String email;
    private String password;
    private String born_date;
    private boolean status;
    private ArrayList<Rating> rating = new ArrayList<Rating>() {
    };
    private ArrayList<Order> order = new ArrayList<Order>() {
    };
    private ArrayList<Bill> bill = new ArrayList<Bill>() {
    };

    public User(String name, String l_name, String email, String pass, String born_date, boolean status) {
        this.name = name;
        this.l_name = l_name;
        this.email = email;
        this.born_date = born_date;
        this.status = status;
        this.password = pass;
        
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLName() {
        return this.l_name;
    }

    public void setLName(String name) {
        this.l_name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBornDate() {
        return this.born_date;
    }

    public void setBornDate(String born) {
        this.born_date = born;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ArrayList<Rating> getRating() {
        return this.rating;
    }

    public void setRating(Rating r) {
        this.rating.add(r);
    }

    public ArrayList<Order> getOrder() {
        return this.order;
    }

    public void setOrder(Order order) {
        this.order.add(order);
    }

    public ArrayList<Bill> getBill() {
        return this.bill;
    }

    public void setBill(Bill bill) {
        this.bill.add(bill);
    }

    public static boolean existUser(String em, String pass) {
        for (User us : User.all_users) {
            if (us.getPassword().equals(pass) && us.getEmail().equals(em)) {
                return true;
            }
        }
        return false;
    }

    public static User getUser(String em, String pass) {
        for (User us : User.all_users) {
            if (us.getPassword().equals(pass) && us.getEmail().equals(em)) {
                return us;
            }
        }
        return null;
    }

    public Order getOrderPerCode(String code) {
        for (Order o : this.getOrder()) {
            if (code.equals(o.getCode())) {
                return o;
            }
        }
        return null;
    }
    
    public void delOrderPerCode(String code) {
        Order order = null;
        for (Order b : this.getOrder()) {
            if (code.equals(b.getCode())) {
                order = b;
            }
        }
        if (order != null) {
            this.getOrder().remove(order);
        }
    }

    public Bill getBillPerCode(String code) {
        for (Bill b : this.getBill()) {
            if (code.equals(b.getCode())) {
                return b;
            }
        }
        return null;
    }

    public void delBillPerCode(String code) {
        Bill bill = null;
        for (Bill b : this.getBill()) {
            if (code.equals(b.getCode())) {
                bill = b;
            }
        }
        if (bill != null) {
            this.getBill().remove(bill);
        }
    }
}   



//xd
