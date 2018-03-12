package service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jd.pojo.Area;
import com.jd.service.AreaService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml","classpath:spring/spring-service.xml"})
public class AreaServiceTest {

	@Autowired
	private AreaService areaService;
	
	@Test
	public void testInsert() {
		Area area = new Area();
		area.setAreaName("中国fds");
		//area.setCreateTime(new Date());
		area.setPriority(1);
		if (areaService.insertSelective(area)>0) {
			System.out.println("yes");
		}
	}
	
	@Test
	public void testGetList() {
		List<Area> lsit = areaService.selectByExample(null);
		for (Area area : lsit) {
			System.out.println(area);
		}
	}
}
