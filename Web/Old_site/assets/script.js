$(document).ready(function(){

	var pcounter = true;
	var ecounter = true;
	var ncounter = true;
	var sucounter = true;
	var spcounter = true;
	var icounter = true;

	var bcounter1 = true;
	var bcounter2 = true;
	var tcounter1 = true;
	var tcounter2 = true;

	$('.patton').click(function(){
		if(pcounter){
		  $('.patton').addClass("active1");
	      $('.patton_content').slideDown('slow');
	      pcounter=!pcounter;
		}
		else {
		  $('.patton').removeClass("active1");
	      $('.patton_content').slideUp('slow');
	      pcounter=!pcounter;
		}
	});

	$('.ericsson').click(function(){
		if(ecounter){
		  $('.ericsson').addClass("active1");
	      $('.ericsson_content').slideDown('slow');
	      ecounter=!ecounter;
		}
		else {
		  $('.ericsson').removeClass("active1");
	      $('.ericsson_content').slideUp('slow');
	      ecounter=!ecounter;
		}
	});

	$('.nokia').click(function(){
		if(ncounter){
		  $('.nokia').addClass("active1");
	      $('.nokia_content').slideDown('slow');
	      ncounter=!ncounter;
		}
		else {
		  $('.nokia').removeClass("active1");
	      $('.nokia_content').slideUp('slow');
	      ncounter=!ncounter;
		}
	});

	$('#Sudan').click(function(){
		if(sucounter){
		  $('#Sudan').addClass("active1");
	      $('#Sudan_content').slideDown('slow');
	      sucounter=!sucounter;
		}
		else {
		  $('#Sudan').removeClass("active1");
	      $('#Sudan_content').slideUp('slow');
	      sucounter=!sucounter;
		}
	});

	$('#Spain').click(function(){
		if(spcounter){
		  $('#Spain').addClass("active1");
	      $('#Spain_content').slideDown('slow');
	      spcounter=!spcounter;
		}
		else {
		  $('#Spain').removeClass("active1");
	      $('#Spain_content').slideUp('slow');
	      spcounter=!spcounter;
		}
	});

	$('#Jakarta').click(function(){
		if(icounter){
		  $('#Jakarta').addClass("active1");
	      $('#Jakarta_content').slideDown('slow');
	      icounter=!icounter;
		}
		else {
		  $('#Jakarta').removeClass("active1");
	      $('#Jakarta_content').slideUp('slow');
	      icounter=!icounter;
		}
	});

	$('.bexus_proj').click(function(){
		if(bcounter1){
		  $('.bexus_proj').addClass("active2");
	      $('.bexus_proj_content').slideDown('slow');
	      bcounter1=!bcounter1;
		}
		else {
		  $('.bexus_proj').removeClass("active2");
	      $('.bexus_proj_content').slideUp('slow');
	      bcounter1=!bcounter1;
		}
	});

	$('.bexus_conf').click(function(){
		if(bcounter2){
		  $('.bexus_conf').addClass("active2");
	      $('.bexus_conf_content').slideDown('slow');
	      bcounter2=!bcounter2;
		}
		else {
		  $('.bexus_conf').removeClass("active2");
	      $('.bexus_conf_content').slideUp('slow');
	      bcounter2=!bcounter2;
		}
	});

	$('.tdk_bme').click(function(){
		if(tcounter1){
		  $('.tdk_bme').addClass("active2");
	      $('.tdk_bme_content').slideDown('slow');
	      tcounter1=!tcounter1;
		}
		else {
		  $('.tdk_bme').removeClass("active2");
	      $('.tdk_bme_content').slideUp('slow');
	      tcounter1=!tcounter1;
		}
	});

	$('.tdk_sote').click(function(){
		if(tcounter2){
		  $('.tdk_sote').addClass("active2");
	      $('.tdk_sote_content').slideDown('slow');
	      tcounter2=!tcounter2;
		}
		else {
		  $('.tdk_sote').removeClass("active2");
	      $('.tdk_sote_content').slideUp('slow');
	      tcounter2=!tcounter2;
		}
	});

	
  	$(".navbar a, footer a[href='#myPage']").on('click', function(event) {
	  	event.preventDefault();
	  	var hash = this.hash;

	  	$('html, body').animate({
	   	 scrollTop: $(hash).offset().top
	  	}, 900, function(){
   	 		window.location.hash = hash;
   		 });
 	});
});