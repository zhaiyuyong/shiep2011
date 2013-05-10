package com.zyy.javaee.project.dao;

import com.zyy.javaee.project.po.RepMessage;
import java.util.*;

public interface RepMessageDao {

	public void saveRepMessage(RepMessage repmessage);
	public List<RepMessage> getRepmessagesByMessId(Integer id);
}
