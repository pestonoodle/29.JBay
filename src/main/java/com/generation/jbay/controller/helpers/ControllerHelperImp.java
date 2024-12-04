package com.generation.jbay.controller.helpers;

import com.generation.jbay.model.entities.Merch;
import com.generation.jbay.model.entities.Seller;
import com.generation.jbay.model.repositories.MerchRepository;
import com.generation.jbay.model.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ControllerHelperImp implements ControllerHelper
{
	@Autowired
	private MerchRepository mRepo;

	@Autowired
	private SellerRepository sRepo;

	@Override
	public void saveMerch(Merch merch, int seller_id)
	{
		Seller s = sRepo.findById(seller_id).get();
		merch.setSeller(s);
		mRepo.save(merch);
	}

	@Override
	public List<Merch> findAllMerch()
	{
		return mRepo.findAll();
	}

	@Override
	public void saveSeller(Seller seller)
	{
		sRepo.save(seller);
	}

	@Override
	public List<Seller> findAllSellers()
	{
		return sRepo.findAll();
	}
}
