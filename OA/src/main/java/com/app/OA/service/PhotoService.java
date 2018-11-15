package com.app.OA.service;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.app.OA.dao.AccountDao;
import com.app.OA.dao.PhotoDao;
import com.app.OA.domain.Photo;
import com.app.OA.domain.User;

@Component
public class PhotoService {

	@Autowired
	PhotoDao photoDao;
	
	@Autowired
	AccountDao accountDao;
	
	@Value("${web.upload-path}")
    private String path;
	
	//获取当前时间
	public String getTime(){
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		
		return sdf.format(date);
	}
	
	/**
	 * 增加图
	 * 
	 * 
	 * @throws IOException 
	 */
	public void add(Photo photo ) throws IOException {
		String createTime= getTime();
		photo.setCreateTime(createTime);
		photoDao.add(photo);
		//记录日志
		switch (photo.getType()) {
		case 0:
			accountDao.addLog(photo.getCreateUserId(),createTime,"新增轮播图: "+photo.getTitle());
			break;
		case 1:
			accountDao.addLog(photo.getCreateUserId(),createTime,"新增资讯图: "+photo.getTitle());
			break;
		case 2:
			accountDao.addLog(photo.getCreateUserId(),createTime,"新增宣教图: "+photo.getTitle());
			break;
		default:
			accountDao.addLog(photo.getCreateUserId(),createTime,"新增公告图: "+photo.getTitle());
			break;
		}
		
	}
	
	/**
	 * 删除图
	 * 
	 * 
	 * @param id 所要删除轮播图的编号 
	 * @return
	 */
	public void delete(User user) {
		String createTime = getTime();
		File file=new File(path+user.getGuid());
		file.delete();
		
		photoDao.delete(user.getId());
		//记录日志
		switch (user.getUserSex()) {
		case 0:
			accountDao.addLog(user.getName(),createTime,"删除轮播图: "+user.getUserName());
			break;
		case 1:
			accountDao.addLog(user.getName(),createTime,"删除资讯图 : "+user.getUserName());
			break;
		case 2:
			accountDao.addLog(user.getName(),createTime,"删除宣教图 : "+user.getUserName());
			break;
		default:
			accountDao.addLog(user.getName(),createTime,"删除公告图 : "+user.getUserName());
			break;
		}
		
		//批量删除轮播图
//		for (Integer id : user.getIds()) {
//			Photo photo=photoDao.findOnePhoto(id);
//			file=new File(path+photo.getPhoto());
//			file.delete();
//			photoDao.delete(id);
//			accountDao.addLog(user.getName(),createTime,"删除图 ");//记录日志
//		}
	}
	
	/**
	 * 修改图(修改图片相关 )
	 * 
	 * @param 
	 * @return
	 * @throws IOException 
	 * @throws IllegalStateException 
	 */
	public void updatePhoto(Photo phot) throws IllegalStateException, IOException {
		String updateTime= getTime();
		phot.setUpdateTime(updateTime);
		photoDao.updatePhoto(phot);
		switch (phot.getType()) {
		case 0:
			accountDao.addLog(phot.getUpdateUserId(),updateTime,"修改轮播图: "+phot.getTitle());
			break;
		case 1:
			accountDao.addLog(phot.getUpdateUserId(),updateTime,"修改资讯图: "+phot.getTitle());
			break;
		case 2:
			accountDao.addLog(phot.getUpdateUserId(),updateTime,"修改宣教图: "+phot.getTitle());
			break;
		default:
			accountDao.addLog(phot.getUpdateUserId(),updateTime,"修改公告图: "+phot.getTitle());
			break;
		}
	}

	/**
	 * 查询所有的图
	 * 
	 * 
	 * @return
	 */
	public List<Photo> selectAllPhoto(Photo photo) {
		Integer start = 0;
		if(photo.getStatus() !=null){
			start = (photo.getId()-1)*photo.getStatus();
			
		}else{
			photo.setStatus(20);
		}
		photo.setId(start);
		return photoDao.selectAllPhoto( photo);
	}

	/**
	 * 更改图状态
	 * 
	 * 
	 * @return
	 */
	public void changeStatus(Photo photo) {
		String updateTime = getTime();
		photoDao.changeStatus(photo.getStatus(),photo.getId());
		if(photo.getStatus() == 0){
			switch (photo.getType()) {
			case 0:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"修改轮播图: "+photo.getTitle()+"的状态为停用");
				break;
			case 1:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"修改资讯图: "+photo.getTitle()+"的状态为停用");
				break;
			case 2:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"修改宣教图: "+photo.getTitle()+"的状态为停用");
				break;
			default:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"修改公告图: "+photo.getTitle()+"的状态为停用");
				break;
			}
		}else{
			switch (photo.getType()) {
			case 0:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"更改轮播图: "+photo.getTitle()+"的状态为生效");
				break;
			case 1:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"更改资讯图: "+photo.getTitle()+"的状态为生效");
				break;
			case 2:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"更改宣教图: "+photo.getTitle()+"的状态为生效");
				break;
			default:
				accountDao.addLog(photo.getUpdateUserId(),updateTime,"更改公告图: "+photo.getTitle()+"的状态为生效");
				break;
			}
		}
		
	}

	/**
	 * 上传文件
	 * 
	 * @param file 上传的图片
	 * @throws IOException 
	 */
	public String upload(MultipartFile file) throws IllegalStateException, IOException {
		long nowTime = System.currentTimeMillis();
		String photoName = nowTime+file.getOriginalFilename();
		File newFile = new File(path+photoName);
		file.transferTo(newFile);
		return photoName;
	}

	/**
	 * 删除上传文件
	 * 
	 * @param file 上传的图片
	 * @throws IOException 
	 */
	public void deletephoto(Photo photo) {
		//删除老照片
		File newFile=new File(path+photo.getPhoto());
		newFile.delete();
	}

	/**
	 * 查询所有的图总数
	 * 
	 * 
	 * @return
	 */
	public Integer selectAllPhotoCount(Photo photo) {
		return photoDao.selectAllPhotoCount(photo);
	}
	
	
}
