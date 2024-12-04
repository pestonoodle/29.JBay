package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Merch;
import com.generation.jbay.model.entities.Seller;

import java.util.List;

public interface ControllerHelper
{
	void saveMerch(Merch merch, int sellerId);

	List<Merch> findAllMerch();

	void saveSeller(Seller seller);

	List<Seller> findAllSellers();
}
