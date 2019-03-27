package vikings;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Configuration;


@Entity
public class House {
	
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private int price;
    private int size;
    private String location;
    private String phone;
    private int status;
    //private photo;;;;!!!
    
	public House(int price, int size, String location, String phone, int status) {
		this.price = price;
		this.size = size;
		this.location = location;
		this.phone = phone;
		this.status = status;
	}
    
    
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
    
}
