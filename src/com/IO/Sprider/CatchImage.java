package com.IO.Sprider;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class CatchImage {
	
	//��ַ
	private static final String URL = "http://www.ifeng.com/";
	
	//����
	private static final String ECODING = "UTF-8";
	
	//��ȡIMG��ǩ����
	private static final String IMGURL_REG = "<img.*src=(.*?)[^>]*?>";
	
	// ��ȡsrc·��������  
    private static final String IMGSRC_REG = "http:\"?(.*?)(\"|>|\\s+)";  
    
    /**
     * ��ȡHTML���� 
     * @throws IOException 
     * */
    private String getHTML(String url) throws IOException{
    	URL uri = new URL(url);
    	URLConnection connection = uri.openConnection();  
        InputStream in = connection.getInputStream();  
        byte[] buf = new byte[1024];  
        int length = 0;  
        StringBuffer sb = new StringBuffer();  
        while ((length = in.read(buf, 0, buf.length)) > 0) {  
            sb.append(new String(buf, ECODING));  
        }  
        in.close();  
        return sb.toString();
    }
    
    /**
     * ��ȡImageUrl��ַ 
     * */
    private List<String> getImageUrl(String HTML) {  
        Matcher matcher = Pattern.compile(IMGURL_REG).matcher(HTML);  
        List<String> listImgUrl = new ArrayList<String>();  
        while (matcher.find()) {  
            listImgUrl.add(matcher.group());  
        }  
        return listImgUrl;  
    }  
    
    /**
     * ��ȡImageSrc��ַ 
     * */
    private List<String> getImageSrc(List<String> listImageUrl) {  
        List<String> listImgSrc = new ArrayList<String>();  
        for (String image : listImageUrl) {  
            Matcher matcher = Pattern.compile(IMGSRC_REG).matcher(image);  
            while (matcher.find()) {  
                listImgSrc.add(matcher.group().substring(0, matcher.group().length() - 1));  
            }  
        }  
        return listImgSrc;  
    } 
    
    /**
     * ����ͼƬ
     * */
    private void Download(List<String> listImgSrc) {  
        try {  
            for (String url : listImgSrc) {  
                String imageName = url.substring(url.lastIndexOf("/") + 1, url.length());  
                URL uri = new URL(url);  
                InputStream in = uri.openStream();  
                FileOutputStream fo = new FileOutputStream(new File(imageName));  
                byte[] buf = new byte[1024];  
                int length = 0;  
                System.out.println("��ʼ����:" + url);  
                while ((length = in.read(buf, 0, buf.length)) != -1) {  
                    fo.write(buf, 0, length);  
                }  
                in.close();  
                fo.close();  
                System.out.println(imageName + "�������");  
            }  
        } catch (Exception e) {  
            System.out.println("����ʧ��");  
        }  
    }  
    
    
    public static void main(String[] args) throws Exception {  
        CatchImage cm = new CatchImage();  
        //���html�ı�����  
        String HTML = cm.getHTML(URL);  
        //��ȡͼƬ��ǩ  
        List<String> imgUrl = cm.getImageUrl(HTML);  
        //��ȡͼƬsrc��ַ  
        List<String> imgSrc = cm.getImageSrc(imgUrl);  
        //����ͼƬ  
        cm.Download(imgSrc);  
    } 

}
