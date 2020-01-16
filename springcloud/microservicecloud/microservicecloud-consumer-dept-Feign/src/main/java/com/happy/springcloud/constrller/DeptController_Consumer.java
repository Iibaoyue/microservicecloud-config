package com.happy.springcloud.constrller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.happy.springcloud.entities.Dept;
import com.happy.springcloud.service.DeptClientService;


@RestController
public class DeptController_Consumer {
	
	@Autowired
	private DeptClientService service;
	
	
	@RequestMapping(value="/consumer/dept/get/{id}")
	public Dept get(@PathVariable Long id) {
		
		return service.get(id);
	}
	
	@RequestMapping(value="/consumer/dept/list")
	public List<Dept> list (){
		
		return service.list();
	}
	
	@RequestMapping(value="/consumer/dept/add")
	public boolean add(Dept dept) {
		
		return service.add(dept);
	}
	
	
	
	
	
	
	
	
	
	
	

//	//private static final String REST_URL_PREFIX="http://localhost:8001";
//	private static final String REST_URL_PREFIX="http://MICROSERVICECLOUD-DEPT";
//
//	
//	//RestTemplate提供了多种便捷访问远程HTTP服务的方法,
//	//是一种简单便捷的访问restful服务模板类,是spring提供的用于访问rest服务的客户端模板工具集
//	//使用
//	//访问restful接口
//	//(url,requestMap,ResponseBean.class)
//	//rest请求地址,请求参数,HTTP响应被转换的对象类型
//	@Autowired
//	private RestTemplate restTemplate;
//	
//	@RequestMapping(value="/consumer/dept/add")
//	public boolean add(Dept dept) {
//		
//		return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, boolean.class);
//	}
//	
//	@RequestMapping(value="/consumer/dept/get/{id}")
//	public Dept get(@PathVariable Long id) {
//		
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id, Dept.class);
//	}
//	
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value="/consumer/dept/list")
//	public List<Dept> list (){
//		
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
//	}
//	
//	
//	@RequestMapping(value="/consumer/dept/discovery")
//	public Object discovery (){
//		
//		return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery", Object.class);
//	}
	
}
