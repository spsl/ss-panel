package controllers.json;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



import controllers.Application;

import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

public class ServerApi extends Controller{

	
	/*************************************
	 ***********Download******************
	 *************************************/
	
	@Transactional(readOnly =true)
	public static Result downloadApp(String filename){
		InputStream is = null;
		String filePath = Application.getfilePath() + "/public/apps/";
		File imgFile = new File(filePath + filename);
		try {
				is = new FileInputStream(imgFile);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return ok(is);
	}

	
}
