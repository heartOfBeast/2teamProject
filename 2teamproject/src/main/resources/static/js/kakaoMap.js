var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
	mapOption = { 
	    center: new kakao.maps.LatLng(36.35111, 127.68500), // 지도의 중심좌표
	    level: 13// 지도의 확대 레벨
	};

	var map = new kakao.maps.Map(mapContainer, mapOption); // 지도를 생성합니다
	var positions = [];
	
	$.ajax({
		url: "/getWarehouseLocation",
		method: "POST",
		dataType: "json",
		async: false,
		success: function(data){
			
			for (var i = 0; i < data.length; i++){
				positions.push({
					title: data[i].warehouseName,
					address: data[i].warehouseAddr,
					phone: data[i].warehousePhone,
					cate: data[i].warehouseCate,
					latlng: new kakao.maps.LatLng(data[i].warehouseLat, data[i].warehouseLon),
				});
			}
//			console.log(data);
			for(var i = 0; i < positions.length; i++){
				var locations = positions[i];
				displayMarker(locations);
			}
		},
		error: function(request, status, error){
			console.log('error');
		}
	});
	
	function displayMarker(locations) { 
		
	    var marker = new kakao.maps.Marker({
	        map: map,
	        position: locations.latlng
	    });
	    
	    var addContent = 	'    <div class="info">' + 
					        '        <div class="title">' + 
					        			locations.title +  
					        '        </div>' + 
					        '        <div class="body">' + 
					        '            <div class="img">' +
					        '                <img src="https://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
					        '           </div>' + 
					        '           <div class="desc">' + 
					        '                <div class="ellipsis">' + locations.cate + '창고' + '</div>' +
					        '                <div class="jibun ellipsis">' + locations.address + '</div>' +
					        '                <div class="jibun ellipsis">' + locations.phone + '</div>' + 
					        '                <div><a href="https://www.nlic.go.kr/nlic/marketWareSearch.action" target="_blank" class="link">홈페이지</a></div>' + 
					        '            </div>' + 
					        '        </div>' + 
					        '    </div>';
	    
        var overlay = new kakao.maps.CustomOverlay({
						   map: map,
						   position: marker.getPosition() 
					 });
	    
	    var content = document.createElement('div');
	    content.className = 'wrap';
	    
	    $(content).html(addContent);
	    
	    var titleObj = $(content).find('div .title');
	    
	    var closeBtn = document.createElement('button');
	    closeBtn.className = 'close';
	    closeBtn.onclick = function () {
	        overlay.setMap(null);
	    };
	    
	    $(titleObj).append(closeBtn);
	    
	    overlay.setContent(content);

	    kakao.maps.event.addListener(marker, 'click', function() {
	        overlay.setMap(map);
	    });
	    
	    $(content).find('button').click();
	}