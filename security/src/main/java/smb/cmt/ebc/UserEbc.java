package smb.cmt.ebc;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserEbc {
	public List<HashMap<String, Object>> retrieveAllListUser();
}
