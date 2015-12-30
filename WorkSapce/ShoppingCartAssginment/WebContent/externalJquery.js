$(document).ready(function() {
	$(document).on('click','.addToCart',function() {
		$("#dialog").dialog({height:200, width:300});
		var id = $(this).closest('table').attr('id');
        var cell1 = document.getElementById(id).rows[1].cells[0].innerHTML;
        var cell2 = document.getElementById(id).rows[3].cells[0].innerHTML;
        
         var product = document.getElementById("product");
         product.value=cell1;
         
         var price = document.getElementById("price");
         price.value=cell2;
	});
});

$(document).ready(function() {
	$('#mensButton').click(function() {
		$("#mensProduct").toggle();
		$("#womensProduct").hide();
		$("#kidsProduct").hide();
	});
	$('#womensButton').click(function() {
		$("#mensProduct").hide();
		$("#womensProduct").toggle();
		$("#kidsProduct").hide();
	});
	$('#kidsButton').click(function() {
		$("#mensProduct").hide();
		$("#womensProduct").hide();
		$("#kidsProduct").toggle();
	});
});
