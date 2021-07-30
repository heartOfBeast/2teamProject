/********************************************* 품목 차트 *********************************************/	
	var stockOptions = null
	
		stockOptions = {
		chart: {
			width: 330,
			type: 'pie',
		},
		labels: [],
		series: [],
		responsive: [{
			breakpoint: 480,
			options: {
				chart: {
					width: 200
				},
				legend: {
					position: 'bottom'
				}
			}
		}],
		stroke: {
			width: 0,
		},
		fill: {
			type: 'none',
		},
		colors: ['#81BEF7', '#045FB4', '#088FB4', '#099FB4', '#012F44', '#077FB4', '#011F84', '#023FB4'],
	}
	
	var stockChart = new ApexCharts(
		document.querySelector("#stockGraph"),
		stockOptions
	);

	/********************************************* 품목 차트 DATA *********************************************/	
	var dataBCate = [];
	var BCateSet = null;
	var dataCount = {};
	
		for(i = 0; i < test.length; i++){
			dataBCate.push(test[i].bCate);
			
			if(dataCount[test[i].bCate] == undefined){
				dataCount[test[i].bCate] = 1;
			}else{
				dataCount[test[i].bCate] += 1;				
			}
		}
			BCateSet = [...new Set(dataBCate)];

		BCateSet.forEach(function(e){
			stockOptions.labels.push(e);
			stockOptions.series.push(dataCount[e]);
		})
		
		
	stockChart.render();
		/********************************************* 창고 차트 *********************************************/
	var warehouseOptions = null;
		warehouseOptions = {
			chart: {
				width: 360,
				type: 'pie',
			},
			labels: [],
			series: [],
			responsive: [{
				breakpoint: 480,
				options: {
					chart: {
						width: 200
					},
					legend: {
						position: 'bottom'
					}
				}
			}],
			stroke: {
				width: 0,
			},
			fill: {
				type: 'none',
			},
			colors: ['#81BEF7', '#045FB4', '#088FB4', '#099FB4', '#012F44', '#077FB4', '#011F84', '#023FB4'],
		}
	var warehouseChart = new ApexCharts(
		document.querySelector("#warehouseGraph"),
		warehouseOptions
	);
		
	/********************************************* 창고 차트 DATA *********************************************/		
	var dataWareName = [];
	var wareNameSet = null;
	var wareCount = {};
	
// 		test.forEach(function(e){
// 			dataWareName.push(e.warehouseName);
// 		})
		for(i = 0; i < test.length; i++){
			dataWareName.push(test[i].warehouseName);
			
			if(wareCount[test[i].warehouseName] == undefined){
				wareCount[test[i].warehouseName] = 1;
			}else{
				wareCount[test[i].warehouseName] += 1;
			}
		}
		wareNameSet = [...new Set(dataWareName)];
		
		wareNameSet.forEach(function(e){
			warehouseOptions.labels.push(e);
			warehouseOptions.series.push(wareCount[e]);
		})
			
	warehouseChart.render();	
		
	/********************************************* 거래처 차트 *********************************************/
	var spmOptions = null;
		spmOptions = {
			chart: {
				width: 320,
				type: 'pie',
			},
			labels: [],
			series: [],
			responsive: [{
				breakpoint: 480,
				options: {
					chart: {
						width: 200
					},
					legend: {
						position: 'bottom'
					}
				}
			}],
			stroke: {
				width: 0,
			},
			fill: {
				type: 'none',
			},
			colors: ['#81BEF7', '#045FB4', '#088FB4', '#099FB4', '#012F44', '#077FB4', '#011F84', '#023FB4'],
		}
	var spmChart = new ApexCharts(
		document.querySelector("#spmGraph"),
		spmOptions
	);
		
	/********************************************* 거래처 차트 DATA *********************************************/		
	var dataSpmName = [];
	var spmNameSet = null;
	var spmCount = {};
	
		for(i = 0; i < test.length; i++){
			dataSpmName.push(test[i].spmName);
			
			if(spmCount[test[i].spmName] == undefined){
				spmCount[test[i].spmName] = 1;
			}else{
				spmCount[test[i].spmName] += 1;
			}
		}
		spmNameSet = [...new Set(dataSpmName)];
		
		spmNameSet.forEach(function(e){
			spmOptions.labels.push(e);
			spmOptions.series.push(spmCount[e]);
		})
			
	spmChart.render();	