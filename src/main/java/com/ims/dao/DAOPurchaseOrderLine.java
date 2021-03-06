package com.ims.dao;

import java.util.List;

import com.ims.domain.PurchaseOrderLine;

public interface DAOPurchaseOrderLine {
	//basic CRUD
	void createPurchaseOrderLine(PurchaseOrderLine pol);
	PurchaseOrderLine getPurchaseOrderLine(int poLineId);
	List<PurchaseOrderLine> getAllPurchaseOrderLinesByPO(int poId);
	void updatePurchaseOrderLine(PurchaseOrderLine poLineId);
	void deletePurchaseOrderLine(PurchaseOrderLine poLineId);
	
}
