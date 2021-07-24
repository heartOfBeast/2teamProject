var options = {
	chart: {
		height: 350,
		type: 'bar',
	},
	plotOptions: {
		bar: {
			horizontal: false,
			endingShape: 'rounded',
			columnWidth: '35%',
		},
	},
	dataLabels: {
		enabled: false
	},
	stroke: {
		show: true,
		width: 2,
		colors: ['transparent']
	},
	series: [{
		name: '매출',
		data: [ ]
	}, {
		name: '지출',
		data: []
	}, {
		name: '순이익',
		data: []
	}],
	xaxis: {
		categories: ['1월','2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월','11월','12월'],
	},
	yaxis: {
		title: {
			text: '원(만)'
		}
	},
	fill: {
		opacity: 1
	},
	tooltip: {
		y: {
			formatter: function(val) {
				return "$ " + val + " thousands"
			}
		}
	},
	grid: {
		row: {
			colors: ['#f5f9fe', '#ffffff'], // takes an array which will be repeated on columns
			opacity: 0.5
		},
	},
	colors: ['#1646b3', '#194eca', '#225de4', '#4274e8', '#628cec', '#81a3f0'],
}
var chart = new ApexCharts(
	document.querySelector("#basic-column-graph"),
	options
);
chart.render();
