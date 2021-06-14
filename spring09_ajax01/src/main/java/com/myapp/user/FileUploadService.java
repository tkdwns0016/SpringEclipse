package com.myapp.user;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {
	public boolean saveUploadedFile(MultipartFile uploadFile) {
	
		// 파일을 저장하기 위해 file자료형을 사용한다.
		// 업로드할 폴더.
		String uploadFolder = "C:/Users/Mr.KIM/uploadedImages";
		
		//폴더가 없다면 폴더를 생성해주는 로직
		File dir = new File(uploadFolder);
		if(!dir.exists()) {
			dir.mkdir();
		}
		
		File file = new File(uploadFolder, uploadFile.getOriginalFilename());

		// 실제로 파일을 저장.
		try {
			uploadFile.transferTo(file);
			return true;
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
