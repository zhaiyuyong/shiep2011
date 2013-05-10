function changimg(){
  var imgSrc = $("#result2");
    var src = imgSrc.attr("src");
    imgSrc.attr("src",chgUrl(src));

}

function chgUrl(url){
    //获取时间戳
    var timstamp = (new Date()).valueOf();
    //将时间戳信息拼接到url上
    //url = "AJAXServer"
    if (url.indexOf("?") >= 0) {
        url = url + "&t=" + timstamp;
    } else {
        url = url + "?t=" + timstamp;
    }
    return url;
}