package com.study.project.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {
	List<Map<String, Object>> list();
	
	int insert(Map<String, Object> insertMap);
	
	Map<String, Object> detail(int num);
	
	int update(Map<String, Object> dataMap);
	
	int delete(int num);
	//마이바티스에연결된아이디
	int viewCnt(int num);

	int delete(List<Integer> nums);
}
