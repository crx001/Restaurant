// JavaScript Document
// ѡ�
$(function(){
	$(".tab dl dt>a:first").addClass("tabActive");
	$(".tab dl dd ul").not(":first").hide();
	$(".tab dl dt>a").unbind("click").bind("click", function(){
		$(this).siblings("a").removeClass("tabActive").end().addClass("tabActive");
		var index = $(".tab dl dt>a").index( $(this) );
		$(".tab dl dd ul").eq(index).siblings(".tab dl dd ul").hide().end().fadeIn("slow");
   });
});


