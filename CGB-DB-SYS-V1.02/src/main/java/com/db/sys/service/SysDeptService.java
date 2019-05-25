package com.db.sys.service;
import java.util.List;
import java.util.Map;

import com.db.common.vo.Node;
import com.db.sys.entity.SysDept;

//我在这里偷偷摸摸加了一条注释
public interface SysDeptService {
	int saveObject(SysDept entity);
	int updateObject(SysDept entity);
	
	List<Node> findZTreeNodes();
	List<Map<String,Object>> findObjects();
	
	int deleteObject(Integer id);
}
