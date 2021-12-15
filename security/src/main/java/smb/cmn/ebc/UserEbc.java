package smb.cmn.ebc;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserEbc {
	public List<HashMap<String, Object>> retrieveAllListUser();

	public List<HashMap<String, Object>> findByUserName(String name);

	public List<HashMap<String, Object>> findRoleByUserName(String name);

	public List<HashMap<String, Object>> findAuthorityByRoleCodes(String roleCode);
}
