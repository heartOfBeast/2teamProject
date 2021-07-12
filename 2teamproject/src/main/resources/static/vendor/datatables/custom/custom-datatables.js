// Basic DataTable
$(function(){
	$('#basicExample').DataTable({
		'iDisplayLength': 4,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
			"info": "Showing Page _PAGE_ of _PAGES_",
		}
	});
});


// FPrint/Copy/CSV
$(function(){
	$('#copy-print-csv').DataTable( {
		dom: 'Bfrtip',
		buttons: [
			'copyHtml5',
			'excelHtml5',
			'csvHtml5',
			'pdfHtml5',
			'print'
		],
		'iDisplayLength': 15,
	});
});



//$(document).ready(function () {
//	
//    $.fn.dataTable.ext.search.push(
//        function(settings, data, dataIndex){
//            var min = Date.parse($('#fromDate').val());
//            var max = Date.parse($('#toDate').val());
//            var targetDate = Date.parse(data[5]);
//
//            if( (isNaN(min) && isNaN(max) ) || 
//                (isNaN(min) && targetDate <= max )|| 
//                ( min <= targetDate && isNaN(max) ) ||
//                ( targetDate >= min && targetDate <= max) ){ 
//                    return true;
//            }
//            return false;
//        }
//    )
//
//    var table = $('#myTable').DataTable({
//        responsive: true,
//        orderMulti: true,
//        "language": {
//            "emptyTable": "데이터가 없어요.",
//            "lengthMenu": "페이지당 _MENU_ 개씩 보기",
//            "info": "현재 _START_ - _END_ / _TOTAL_건",
//            "infoEmpty": "데이터 없음",
//            "infoFiltered": "( _MAX_건의 데이터에서 필터링됨 )",
//            "search": "에서 검색: ",
//            "zeroRecords": "일치하는 데이터가 없어요.",
//            "loadingRecords": "로딩중...",
//            "processing":     "잠시만 기다려 주세요...",
//            "paginate": {
//                "next": "다음",
//                "previous": "이전"
//            }
//        },
//        
//        dom : 'Blfrtip',
//        buttons:[{
//			extend:'csvHtml5',
//			text: 'Export CSV',
//			footer: true,
//			bom: true,
//			className: 'exportCSV'
//		}]
//    });
//
//    /* Column별 검색기능 추가 */
//    $('#myTable_filter').prepend('<select id="select"></select>');
//    $('#myTable > thead > tr').children().each(function (indexInArray, valueOfElement) { 
//        $('#select').append('<option>'+valueOfElement.innerHTML+'</option>');
//    });
//    
//    $('.dataTables_filter input').unbind().bind('keyup', function () {
//        var colIndex = document.querySelector('#select').selectedIndex;
//        table.column(colIndex).search(this.value).draw();
//    });
//
//    /* 날짜검색 이벤트 리바인딩 */
//    $('#myTable_filter').prepend('<input type="text" id="toDate" placeholder="yyyy-MM-dd"> ');
//    $('#myTable_filter').prepend('<input type="text" id="fromDate" placeholder="yyyy-MM-dd">~');
//    $('#toDate, #fromDate').unbind().bind('keyup',function(){
//        table.draw();
//    })
//});

	




// dataTable 수정 - 병윤
$(function(){
	$('#copy-print-csv-KO').DataTable( {
		dom: 'Bfrtip',
		buttons: [
			'copyHtml5',
			'excelHtml5',
			'csvHtml5',
			'pdfHtml5',
			'print'
		],
		"scrollCollapse": true,
		"paging": false,
		"bInfo" : false,
//		"overflow-x" : hidden,
	});
});


// Fixed Header
$(document).ready(function(){
	var table = $('#fixedHeader').DataTable({
		fixedHeader: true,
		'iDisplayLength': 4,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
			"info": "Showing Page _PAGE_ of _PAGES_",
		}
	});
});


// Vertical Scroll
$(function(){
	$('#scrollVertical').DataTable({
		"scrollY": "207px",
		"scrollCollapse": true,
		"paging": false,
		"bInfo" : false,
	});
});



// Row Selection
$(function(){
	$('#rowSelection').DataTable({
		'iDisplayLength': 4,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
			"info": "Showing Page _PAGE_ of _PAGES_",
		}
	});
	var table = $('#rowSelection').DataTable();

	$('#rowSelection tbody').on( 'click', 'tr', function () {
		$(this).toggleClass('selected');
	});

	$('#button').on('click', function () {
		alert( table.rows('.selected').data().length +' row(s) selected' );
	});
});



// Highlighting rows and columns
$(function(){
	$('#highlightRowColumn').DataTable({
		'iDisplayLength': 4,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
		}
	});
	var table = $('#highlightRowColumn').DataTable();  
	$('#highlightRowColumn tbody').on('mouseenter', 'td', function (){
		var colIdx = table.cell(this).index().column;
		$(table.cells().nodes()).removeClass('highlight');
		$(table.column(colIdx).nodes()).addClass('highlight');
	});
});



// Using API in callbacks
$(function(){
	$('#apiCallbacks').DataTable({
		'iDisplayLength': 4,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
		},
		"initComplete": function(){
			var api = this.api();
			api.$('td').on('click', function(){
			api.search(this.innerHTML).draw();
		});
		}
	});
});


// Hiding Search and Show entries
$(function(){
	$('#hideSearchExample').DataTable({
		'iDisplayLength': 4,
		"searching": false,
		"language": {
			"lengthMenu": "Display _MENU_ Records Per Page",
			"info": "Showing Page _PAGE_ of _PAGES_",
		}
	});
});
