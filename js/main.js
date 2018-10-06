!function(o) {
    "use strict";
    o(".animsition").animsition( {
    inClass: "fade-in", outClass:"fade-out", inDuration:1500, outDuration:800, linkElement:".animsition-link", loading:!0, loadingParentElement:"html", loadingClass:"animsition-loading-1", loadingInner:'<div data-loader="ball-scale"></div>', timeout:!1, timeoutCountdown:5e3, onLoadEvent:!0, browser:["animation-duration", "-webkit-animation-duration"], overlay:!1, overlayClass:"animsition-overlay-slide", overlayParentElement:"html", transition:function(o) {
    window.location.href=o;
}
});
    var e=o(window).height()/2;
    o(window).on("scroll", function() {
    o(this).scrollTop()>e?o("#myBtn").css("display", "flex"): o("#myBtn").css("display", "none");
}
), o("#myBtn").on("click", function() {
    o("html,  body").animate( {
    scrollTop: 0;
}
, 300);
}), o(".js-show-header-dropdown").on("click", function() {
    o(this).parent().find(".header-dropdown");
}
);
    for(var n=o(".js-show-header-dropdown"), i=-1, t=0;
    t<n.length;
    t++)o(n[t]).on("click", function() {
    if(jQuery.inArray(this, n)==i)o(this).parent().find(".header-dropdown").toggleClass("show-header-dropdown"), i=-1;
    else {
    for(var e=0;
    e<n.length;
    e++)o(n[e]).parent().find(".header-dropdown").removeClass("show-header-dropdown");
    o(this).parent().find(".header-dropdown").toggleClass("show-header-dropdown"), i=jQuery.inArray(this, n);
}
});
    o(".js-show-header-dropdown,  .header-dropdown").click(function(o) {
    o.stopPropagation();
}
), o(window).on("click", function() {
    for(var e=0;
    e<n.length;
    e++)o(n[e]).parent().find(".header-dropdown").removeClass("show-header-dropdown");
    i=-1;
}
);
    var s=o(".topbar").height(), d=o(".container-menu-header");
    o(window).on("scroll", function() {
    if(o(this).scrollTop()>=s)o(".header1").addClass("fixed-header"), o(d).css("top", -s);
    else {
    var e=-o(this).scrollTop();
    o(d).css("top", e), o(".header1").removeClass("fixed-header");
}
o(this).scrollTop()>=200&&o(window).width()>992?(o(".fixed-header2").addClass("show-fixed-header2"), o(".header2").css("visibility", "hidden"), o(".header2").find(".header-dropdown").removeClass("show-header-dropdown")): (o(".fixed-header2").removeClass("show-fixed-header2"), o(".header2").css("visibility", "visible"), o(".fixed-header2").find(".header-dropdown").removeClass("show-header-dropdown"));
}), o(".btn-show-menu-mobile").on("click", function() {
    o(this).toggleClass("is-active"), o(".wrap-side-menu").slideToggle();
}
);
    for(var a=o(".arrow-main-menu"), t=0;
    t<a.length;
    t++)o(a[t]).on("click", function() {
    o(this).parent().find(".sub-menu").slideToggle(), o(this).toggleClass("turn-arrow");
}
);
    o(window).resize(function() {
    o(window).width()>=992&&("block"==o(".wrap-side-menu").css("display")&&(o(".wrap-side-menu").css("display", "none"), o(".btn-show-menu-mobile").toggleClass("is-active")), "block"==o(".sub-menu").css("display")&&(o(".sub-menu").css("display", "none"), o(".arrow-main-menu").removeClass("turn-arrow")));
}
), o(".btn-romove-top-noti").on("click", function() {
    o(this).parent().remove();
}
), o(".block2-btn-addwishlist").on("click", function(e) {
    e.preventDefault(), o(this).addClass("block2-btn-towishlist"), o(this).removeClass("block2-btn-addwishlist"), o(this).off("click");
}
), o(".btn-num-product-down").on("click", function(e) {
    e.preventDefault();
    var n=Number(o(this).next().val());
    n>1&&o(this).next().val(n-1);
}
), o(".btn-num-product-up").on("click", function(e) {
    e.preventDefault();
    var n=Number(o(this).prev().val());
    o(this).prev().val(n+1);
}
), o(".active-dropdown-content .js-toggle-dropdown-content").toggleClass("show-dropdown-content"), o(".active-dropdown-content .dropdown-content").slideToggle("fast"), o(".js-toggle-dropdown-content").on("click", function() {
    o(this).toggleClass("show-dropdown-content"), o(this).parent().find(".dropdown-content").slideToggle("fast");
}
);
    var r=o(".video-mo-01").children("iframe").attr("src");
    o('[data-target="#modal-video-01"]').on("click", function() {
    o(".video-mo-01").children("iframe")[0].src+="&autoplay=1", setTimeout(function() {
    o(".video-mo-01").css("opacity", "1");
}
, 300);
}), o('[data-dismiss="modal"]').on("click", function() {
    o(".video-mo-01").children("iframe")[0].src=r, o(".video-mo-01").css("opacity", "0");
}
);
}(jQuery);
    
