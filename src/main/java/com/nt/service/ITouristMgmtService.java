package com.nt.service;

import java.util.List;

import com.nt.entity.Tourist;
import com.nt.exception.TouristNotFoundException;

public interface ITouristMgmtService {

	public String registerTourist(Tourist tourist);
	public List<Tourist> fetchAllTourist();
	public  Tourist fetchTouristById(Integer tid)throws TouristNotFoundException;
	public String updateTouristDetails(Tourist tourist)throws TouristNotFoundException;
	public List<Tourist> findAllTouristByName(String name);
	
}
