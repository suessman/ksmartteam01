package anypet.ksmartteam01.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accommodation")
public class AccommodationListController {
	@GetMapping("/insertReservation")
	public String insertReservation() {
		return "/user/accommodation/insertReservation";
	}
}
