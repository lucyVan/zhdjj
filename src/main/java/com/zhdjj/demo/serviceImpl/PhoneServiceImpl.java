package com.zhdjj.demo.serviceImpl;

import com.zhdjj.demo.dao.PhoneMapper;
import com.zhdjj.demo.pojo.Phone;
import com.zhdjj.demo.service.PhoneService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public int InsertInfo() throws IOException {
        String url = "https://search.jd.com/Search?keyword=%E6%89%8B%E6%9C%BA&enc=utf-8&wq=%E6%89%8B%E6%9C%BA";
        Document doc = Jsoup.connect(url).get();
//        Document doc = Jsoup.parse(new URL(url).openStream(), "gbk", url);
        Elements elements = doc.getElementsByClass("gl-item");
        for (Element headline : elements) {
            Phone phone = new Phone();
            phone.setSrc(headline.select("div[class='p-img']").select("img").attr("source-data-lazy-img"));
            phone.setName(headline.select("div[class='p-name p-name-type-2']").select("em").text());
            phone.setPrice(headline.select("div[class='p-price']").select("i").text());
            phoneMapper.InsertInfo(phone);
            System.out.println(1);
        }
        System.out.println(1);
        return elements.size();
    }
}
