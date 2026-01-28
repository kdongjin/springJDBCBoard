package com.board;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class SpringJdbcBoardApplicationTests {

	@Test
	void contextLoads() {
		String searchType = "title"; 
		String keyword = "c";
		String query = "select * from jdbcBoard where "+searchType+" like '%"+keyword+"%'"; 
		
		log.info(query);
	}

}
