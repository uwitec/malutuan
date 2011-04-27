package org.malu.framework.image;



import org.malu.framework.image.impl.JavaImageIOCreator;


/**
 * 缩略图生成器工厂<br>
 *
 */
public abstract class ThumbnailCreatorFactory {
	private ThumbnailCreatorFactory(){}
	public static String CREATORTYPE="javaimageio";
	
	/**
	 * 返回缩略图生成器
	 * @param source 图片原文件路径
	 * @param target 图片缩略图路径
	 * @return 
	 * 当{@link #CREATORTYPE} 为javaimageio时使用{@link JavaImageIOCreator }生成器<br>
	 */
	public static final IThumbnailCreator getCreator(String source,String target){
		if(CREATORTYPE.equals("javaimageio")){
			return new JavaImageIOCreator(source, target);
		}
		

		
		
		return new JavaImageIOCreator(source, target);
	}
}
