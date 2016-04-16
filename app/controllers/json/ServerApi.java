package controllers.json;

import com.fasterxml.jackson.databind.JsonNode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;



import controllers.Application;

import models.JsonResult;
import play.db.jpa.Transactional;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

public class ServerApi extends Controller{

	
	/*************************************
	 ***********Download******************
	 *************************************/
	
	@Transactional(readOnly =true)
	public Result downloadApp(String filename){
		InputStream is = null;
		String filePath = Application.getRootPath() + "/public/apps/";
		File imgFile = new File(filePath + filename);
		try {
				is = new FileInputStream(imgFile);
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}
		return ok(is);
	}


	public Result testJson() {

		JsonResult jsonResult = JsonResult.instance();
		jsonResult.code = 123;

		JsonNode result = Json.toJson(jsonResult);

		return ok(result);
	}

	
}
