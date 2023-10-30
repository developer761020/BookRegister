package com.book.store.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.store.entity.Entitiystore;
import com.book.store.jpa.Storerespo;

@Service
public class Storeserv {
	
	@Autowired
	private Storerespo respo;
	
	public void save(Entitiystore s) {
		respo.save(s);
	}
	public List<Entitiystore> Allbooks()
	{
		return respo.findAll();
	}
	public Entitiystore updatecode(int id) {
		return respo.findById(id).get();
		
	}
	public void deletcode(int id) {
		respo.deleteById(id);
	}

}
