package com.ims.logic;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.ims.dao.DAOInventory;
import com.ims.dao.DIInventory;
import com.ims.domain.Inventory;

@Service
public class InventoryLogic {
	private static DAOInventory daoInv = new DIInventory();
	
	
	
//	@Transactional(readOnly=false, isolation=Isolation.READ_COMMITTED)	
	public static List<Inventory> viewAllInventory(int retailerId){
		List<Inventory> list = daoInv.getAllInventory(retailerId);
		return list;
	}
	

}
