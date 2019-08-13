package com.sj.util;

import com.sj.entity.sys.SysMenu;

import java.util.ArrayList;
import java.util.List;


/**
 * 将查询出来的菜单集合，变为有层级的
 * 描述：
 * 作者：XF
 * 2019年5月6日上午10:17:49
 */
public class TreeNodeUtil {
	
	/**
	 * 查找一级菜单
	 * @param list
	 * @return
	 */
	public List<SysMenu> getFatherMenu(List<SysMenu> list){
		//定义一个集合，放父级菜单(一级菜单)
		List<SysMenu> fatherList = new ArrayList<SysMenu>();
		for(SysMenu m:list) {
			if(m.getParentId()==1 && m.getType()==1) {
				//调用下面的递归方法查找所有的子元素
				m.setChildren(getChildrenMenu(m.getId(),list));
				//一级菜单加入到集合
				fatherList.add(m);
			}
		}
		return fatherList;
	}
	
	/**
	 * 根据一级菜单的id查找里面所有的子元素，包含递归算法
	 * @param pid
	 * @param list
	 * @return
	 */
	public List<SysMenu> getChildrenMenu(Long pid,List<SysMenu> list){
		List<SysMenu> childrenList = new ArrayList<SysMenu>();
		for(SysMenu m:list) {
			//转菜单只需要将菜单类型的放进去就OK
			if(m.getParentId()==0 && m.getType()==0) {
				//是一级菜单，不需要加进去
				continue;
			}
			//如果当前菜单的父元素和传过来的一致，就可以直接加到集合里
			if(m.getParentId()==pid && m.getType()==1) {
				m.setChildren(getChildrenMenu(m.getId(),list));
				childrenList.add(m);
			}
		}
		return childrenList;
	}
	

}
