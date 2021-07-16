package com.cafe2team.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cafe2team.dao.ExpenditureMapper;
import com.cafe2team.domain.Contract;
import com.cafe2team.domain.Expenditure;

@Service
public class ExpenditureService {

 @Autowired
 private final ExpenditureMapper expenditureMapper;
 
 	public ExpenditureService(ExpenditureMapper expenditureMapper) {
 		this.expenditureMapper = expenditureMapper;
 	}
 	 
 	
 	 public List<Expenditure> getExpenditureList(){
 		 
 		List<Expenditure> expenditureList = expenditureMapper.getExpenditureList();
 		
 		return expenditureList;
 	 }
 	 
 	 public int expenditureinsert(Expenditure expenditure) {
 		 int result = expenditureMapper.expenditureinsert(expenditure);
 		 
 		 return result;
 	 }
 	 
 	public int expenditureDelete(List<String> paramList) {
		return expenditureMapper.expenditureDeleteByCode(paramList);
		
	}

 	/******창고 총정산에서 창고총지출과 창고총매출을 가져옴********/
	public List<Expenditure> getCalculate() {
		List<Expenditure> caculate = expenditureMapper.getCaculate();
		return caculate;
	}

	public List<Expenditure> getsales() {
		List<Expenditure> sales = expenditureMapper.getsales();
		return sales;  
	}
	public List<Expenditure> getSalesCal(List<Expenditure> caculate, List<Expenditure> sales) {
		List<Expenditure> calculated = new ArrayList<>();
		List<Expenditure> result = new ArrayList<>();
		
		String month = null;
		
		for (int i = 0; i < 12; i++) {
			Expenditure expenditure = new Expenditure();
			boolean needCalc = false;
			String expe = "0";
			String cont = "0";
			int total = 0;
			month = "0"+(i+1);
			//지출금액
			for(int j=0; j < caculate.size(); j ++) {
				if (caculate.get(j).getMonth().equals(month)) {
					needCalc = true;
					expe = caculate.get(j).getExpense();
					expenditure.setExpensePayment(expe);
					break;
				}
			}
			//매출금액
			for (int k = 0; k < sales.size(); k++) {
				
				if (sales.get(k).getMonth().equals(month)) {
					needCalc = true;
					expenditure.setContract(new Contract());
					cont=sales.get(k).getExpense();
					expenditure.getContract().setContractFinalPay(cont);
					break;
				}
			}
			//당월 순이익
			if(expe !="0" || cont !="0") {
				total += Integer.parseInt(cont);
				total -= Integer.parseInt(expe);
				expenditure.setTotalaggregate(total);
			}
			
			expenditure.setMonth(month);
			calculated.add(i, expenditure);
			//전월대비 증감률
			if(needCalc) {
				if(month.equals("01")) {
					expenditure.setFluctuation(0);
				}else{
					Integer preTotalaggregate = calculated.get(i-1).getTotalaggregate();
					Integer nowTotalaggregate =	calculated.get(i).getTotalaggregate();
					if(preTotalaggregate == null)preTotalaggregate = 0;
					if(nowTotalaggregate == null)nowTotalaggregate = 0;
					System.out.println("---------------------------");
					System.out.println(month);
					System.out.println(preTotalaggregate);
					System.out.println(nowTotalaggregate);
					System.out.println("---------------------------");
					double increPercent =Math.round((preTotalaggregate-nowTotalaggregate) / nowTotalaggregate * 100);
					
					expenditure.setFluctuation(increPercent);
				}
			}
			
			
			result.add(i, expenditure);
		}
		return result;
	}
	/***********************************************/


	public int modifyExpenditure(Expenditure expenditure) {
		return expenditureMapper.modifyExpenditure(expenditure);
	}
	
	
	
}
