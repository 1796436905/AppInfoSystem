package cn.appsys.dao.addinfo;

import java.util.List;

import cn.appsys.pojo.AddInfo;
import cn.appsys.pojo.QueryAddInfoVO;

public interface AddInfoMapper {

	int getAddInfoCount(QueryAddInfoVO queryAddInfoVO);
	List<AddInfo> getAddInfoList(QueryAddInfoVO queryAddInfoVO);
}
