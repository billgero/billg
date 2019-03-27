package vikings;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController    // This means that this class is a Controller
@RequestMapping(path="/demo")
public class MainController {
	
	@Autowired
	private HouseRepository houseRepository;
	
	@RequestMapping(value = "/add", method = RequestMethod.POST) // Map ONLY GET Requests
	public @ResponseBody House addNewHouse (@RequestParam int price, @RequestParam int size,
		   @RequestParam String location, @RequestParam String phone, @RequestParam int status) {
		// @RequestParam photo field!!!
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		//House h = new House(price,size,location,phone,status);
		House h = HouseDTO.convert();
		houseRepository.save(h);
		return h;
	}

	@GetMapping(path="/all")
	public @ResponseBody Iterable<House> getAllHouses() {
		// This returns a JSON or XML with the houses
		return houseRepository.findAll();
	}
}
