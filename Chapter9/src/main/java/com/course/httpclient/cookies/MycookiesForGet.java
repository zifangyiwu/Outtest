package com.course.httpclient.cookies;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class MycookiesForGet<CooiesStore> {
    private String url;
    private ResourceBundle bundle;
    private CookieStore store;
    @BeforeTest
    public void beforeTest(){
        bundle = ResourceBundle.getBundle("application");
        url=bundle.getString("test.uri");
    }
    @Test
    public void testGetCookies() throws IOException {
        String result;
        String uri=bundle.getString("getCookies.uri");
        String testUrl=this.url+uri;
        //测试代码书写
        HttpGet get=new HttpGet(testUrl);
        DefaultHttpClient client = new DefaultHttpClient();
        HttpResponse respone = client.execute(get);
        result=EntityUtils.toString(respone.getEntity(),"utf-8");
        System.out.println(result);
        //获取cookies信息
       this.store = client.getCookieStore();
       List<Cookie> cookieslist = store.getCookies();
        for(Cookie cookie:cookieslist) {
            String name = cookie.getName();
            String value = cookie.getValue();
            System.out.println("cookie name=" + name + ";cookie value =" + value);
        }
    }
    @Test(dependsOnMethods={"testGetCookies"})
    public void testGetWithCookies() throws IOException {
        String uri = bundle.getString("test.get.with.cookies");
        String testUrl=this.url+uri;
        HttpGet get = new HttpGet(testUrl);
        DefaultHttpClient client=new DefaultHttpClient();
//设置cookies信息
        client.setCookieStore(this.store);
        HttpResponse response=client.execute(get);
//获取响应的状态码
        int statusCode=response.getStatusLine().getStatusCode();
        System.out.println("statusCode="+statusCode);
        if(statusCode==200){
            String result=EntityUtils.toString(response.getEntity(),"utf-8");
            System.out.println(result);
        }
    }
}

