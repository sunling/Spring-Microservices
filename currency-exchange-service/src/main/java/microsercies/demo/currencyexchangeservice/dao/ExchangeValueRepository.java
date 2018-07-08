package microsercies.demo.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import microsercies.demo.currencyexchangeservice.bean.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue,Long> {
	ExchangeValue findByFromAndTo(String from,String to); 
}
