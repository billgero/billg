package vikings;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class HouseDTO implements Converter<HouseDTO, House> {
	
	private int price;
	private int size;
	private String location;
	private String phone;
	private int status;
	
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
	
/*	public House convert() {
		House house = new House(price, size, location, phone, status);
		
		house.setPrice(price);
		house.setSize(this.size);
		house.setLocation(this.location);
		house.setPhone(this.phone);
		house.setStatus(this.status);
		
		return house;
	}*/
	@Override
	public House convert(HouseDTO houseDto) {
		House house = new House(price, size, location, phone, status);
		
		house.setPrice(houseDto.getPrice());
		house.setSize(houseDto.getSize());
		house.setLocation(houseDto.getLocation());
		house.setPhone(houseDto.getPhone());
		house.setStatus(houseDto.getStatus());
		
		return house;
	}
	}