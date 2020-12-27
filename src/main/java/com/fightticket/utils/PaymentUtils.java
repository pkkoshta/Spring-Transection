package com.fightticket.utils;

import java.util.HashMap;
import java.util.Map;

import com.fightticket.exception.InsufficientBalance;

public class PaymentUtils {
	
	private static Map<String, Double > map = new HashMap<String, Double>();
	
	static {
		map.put("acc1", 12000.0);
		map.put("acc2", 2000.0);
		map.put("acc3", 6000.0);
		map.put("acc4", 3000.0);
	}
	
	public static boolean validateAmount(String acc, double payment) {
		if(payment > map.get(acc)) {
			 throw new InsufficientBalance("insufficient fund..!");
		}else {
			return true;
		}
	}

}
