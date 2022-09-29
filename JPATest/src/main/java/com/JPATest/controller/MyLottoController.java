package com.JPATest.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.JPATest.entity.MyLottoNo;
import com.JPATest.service.MyLottoService;


@Controller
@EnableAutoConfiguration
@RequestMapping(value = "/views")
public class MyLottoController {
	
	@Autowired
	MyLottoService myLottoService;
	
	private final static Logger logger = LoggerFactory.getLogger("");

	@RequestMapping("/myLottoNoPage")
	public String lottoInfo(@RequestParam(value="schDrwNo", required=false) String schDrwNo, Model model) throws Exception {
		
		logger.info("###### START [LottoController :: /views/myLottoNoPage] ######");
		
		return "myLottoNo";
	}
	

	@ResponseBody
	@RequestMapping("/myLottoNoIns")
	public String myLottoNoIns(@RequestParam Map<String, Object> map){
		logger.info("###### START [MyLottoController :: /views/myLottoNoIns] ######");
		
		myLottoService.insertMyLottoNo(map);

		return "저장되었습니다.";
	}
	
	@ResponseBody
	@RequestMapping("/myLottoNoSel")
	public List<MyLottoNo> myLottoNoSel(@RequestParam Map<String, Object> map) {
		logger.info("###### START [MyLottoController :: /views/myLottoNoSel] ######");
		
		List<MyLottoNo> jpaListMap = myLottoService.selectMyLottoNo();
		
		return jpaListMap;
	}
	
	@ResponseBody
	@RequestMapping("/myLottoNoDel")
	public String myLottoNoDel(@RequestParam Map<String, Object> map) {
		logger.info("###### START [MyLottoController :: /views/myLottoNoDel] ######");

		myLottoService.deleteMyLottoNo(Integer.parseInt(map.get("no").toString()));
		
		return "삭제되었습니다.";
	}
}
