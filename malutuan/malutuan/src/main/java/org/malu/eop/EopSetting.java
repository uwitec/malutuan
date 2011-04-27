package org.malu.eop;



import java.io.File;
import java.io.InputStream;
import java.util.Properties;

import org.malu.framework.image.ThumbnailCreatorFactory;
import org.malu.framework.util.FileUtil;
//import org.malu.framework.util.PropertiesUtil;
import org.malu.framework.util.StringUtil;

public class EopSetting {
	

	public static String INSTALL_LOCK ="NO"; //是否已经安装

	
	public static void init(Properties props ){


		File installLockFile = new File(StringUtil.getRootPath()+"/install/install.lock");
		if( installLockFile.exists() ){
			INSTALL_LOCK = "YES"; //如果存在则不能安装
		}else{
			INSTALL_LOCK = "NO"; //如果不存在，则认为是全新的，跳到install页
		}
	}
	
	

}
