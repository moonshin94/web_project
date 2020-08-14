package com.safetour.sql;

import java.sql.SQLException;

import com.safetour.myapp.model.tourDTO;

public interface tourDAO {
	tourDTO getRecord(String title) throws Exception;
	
}
