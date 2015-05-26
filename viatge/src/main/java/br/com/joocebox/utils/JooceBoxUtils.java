package br.com.joocebox.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import br.com.joocebox.model.Role;

public class JooceBoxUtils {
	
	public Map<Role, String> getListOfSytemRoles(){
		Map<Role, String> roleMap = new HashMap<Role, String>();
		for (Role role : Arrays.asList(Role.values())) {
			if(!Role.ROLE_MASTER.equals(role))
			roleMap.put(role, role.getRole());
		}
		return roleMap;
	}

}