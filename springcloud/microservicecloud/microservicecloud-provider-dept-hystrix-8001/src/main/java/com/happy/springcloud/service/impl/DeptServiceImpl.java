package com.happy.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.happy.springcloud.dao.DeptDao;
import com.happy.springcloud.entities.Dept;
import com.happy.springcloud.service.DeptClientService;
import com.happy.springcloud.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao dao; 
	
	@Override
	public boolean add(Dept dept) {

		return dao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		
		return dao.findById(id);
	}

	@Override
	public List<Dept> list() {
		
		return dao.findAll();
	}

}