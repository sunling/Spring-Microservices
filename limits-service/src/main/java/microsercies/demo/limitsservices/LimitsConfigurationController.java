package microsercies.demo.limitsservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import microsercies.demo.limitsservices.bean.LimitsConfiguration;

@RestController
public class LimitsConfigurationController {
	
//	@GetMapping("/limits")
//	public LimitsConfiguration retrieveLimitsFromConfiguration() {
//		return new LimitsConfiguration(100,1);
//	}
	
	@Autowired
	private Configuration conf;
	
	@GetMapping("/limits")
	public LimitsConfiguration retrieveLimitsFromConfiguration() {
		return new LimitsConfiguration(conf.getMaximum(),conf.getMinimum());
	}

}
