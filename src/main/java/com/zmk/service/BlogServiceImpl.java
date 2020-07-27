package com.zmk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zmk.bean.Categ;
import com.zmk.mapper.BlogMapper;

@Service
public class BlogServiceImpl implements BlogService {
	
	@Resource
	private BlogMapper blogMapper;
	@Override
	public List<Categ> selc() {
		// TODO Auto-generated method stub
		return blogMapper.selc();
	}
	
}
