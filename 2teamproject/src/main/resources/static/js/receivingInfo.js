
var recevingInfo = new Array($(".realDate"));
		
		console.log(recevingInfo);
		
		var jan = new Array();
		var feb = new Array();
		var mar = new Array();
		var apr = new Array();
		var may = new Array();
		var jun = new Array();
		var jul = new Array();
		var aug = new Array();
		var sep = new Array();
		var oct = new Array();
		var nov = new Array();
		var dec = new Array();
		
		for(var i=0; i<recevingInfo.length; i++){
			for(var j=0; j<recevingInfo[i].length; j++){
				if((recevingInfo[i][j].innerText).indexOf('-01-') > 0){
					jan.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-02-') > 0){
					feb.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-03-') > 0){
					mar.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-04-') > 0){
					apr.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-05-') > 0){
					may.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-06-') > 0){
					jun.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-07-') > 0){
					jul.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-08-') > 0){
					aug.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-09-') > 0){
					sep.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-10-') > 0){
					oct.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-11-') > 0){
					nov.push(recevingInfo[i][j].innerText);
				}else if((recevingInfo[i][j].innerText).indexOf('-12-') > 0){
					dec.push(recevingInfo[i][j].innerText);
				}										
			}
		};
		
		var janCount = jan.length;
		var febCount = feb.length;
		var marCount = mar.length;
		var aprCount = apr.length;
		var mayCount = may.length;
		var junCount = jun.length;
		var julCount = jul.length;
		var augCount = aug.length;
		var sepCount = sep.length;
		var octCount = oct.length;
		var novCount = nov.length;
		var decCount = dec.length;
		
		
		
		var options = null;
	
		options = {
				chart: {
					height: 350,
					type: 'bar',
				},
				plotOptions: {
					bar: {
						dataLabels: {
							position: 'top', // top, center, bottom
						},
					}
				},
				dataLabels: {
					enabled: true,
					formatter: function (val) {
						return val + "건";
					},
					offsetY: -20,
					style: {
						fontSize: '12px',
						colors: ["#2e323c"]
					}
				},
				series: [{
					name: '',
					data: [janCount, febCount, marCount, aprCount, mayCount, junCount, julCount, augCount, sepCount, octCount, novCount, decCount ]
				}],
				xaxis: {
					categories: ["1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"],
					position: 'top',
					labels: {
						offsetY: -18,
					},
					axisBorder: {
						show: false
					},
					axisTicks: {
						show: false
					},
					crosshairs: {
						fill: {
							type: 'gradient',
							gradient: {
								colorFrom: '#225de4',
								colorTo: '#81a3f0',
								stops: [0, 100],
								opacityFrom: 0.4,
								opacityTo: 0.5,
							}
						}
					},
					tooltip: {
						enabled: true,
						offsetY: -35,
					}
				},
				fill: {
					gradient: {
						shade: 'light',
						type: "horizontal",
						shadeIntensity: 0.25,
						gradientToColors: undefined,
						inverseColors: true,
						opacityFrom: 1,
						opacityTo: 1,
						stops: [50, 0, 100, 100]
					},
				},
				yaxis: {
					axisBorder: {
						show: false
					},
					axisTicks: {
						show: false,
					},
					labels: {
						show: false,
						formatter: function (val) {
							return val + "%";
						}
					}
				},
				title: {
					text: '2021년 입고현황',
					floating: true,
					offsetY: 320,
					align: 'center',
					style: {
						color: '#2e323c'
					}
				},
				colors: ['#1646b3', '#194eca', '#225de4', '#4274e8', '#628cec', '#81a3f0'],
			}
			var receivingGraph = new ApexCharts(
				document.querySelector("#receivingGraph"),
				options
			);
				receivingGraph.render();
	