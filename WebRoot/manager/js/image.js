function changimg(){
  var imgSrc = $("#result2");
    var src = imgSrc.attr("src");
    imgSrc.attr("src",chgUrl(src));

}

function chgUrl(url){
    //��ȡʱ���
    var timstamp = (new Date()).valueOf();
    //��ʱ�����Ϣƴ�ӵ�url��
    //url = "AJAXServer"
    if (url.indexOf("?") >= 0) {
        url = url + "&t=" + timstamp;
    } else {
        url = url + "?t=" + timstamp;
    }
    return url;
}