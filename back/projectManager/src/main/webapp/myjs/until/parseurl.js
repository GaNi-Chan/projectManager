/**
 *@author Veng Su
 *@date 2018/4/5 21:20
 *方法作用：url解析get参数
 **/
function parseUrl(){
    var url=location.href;
    var i=url.indexOf('?');
    if(i==-1)return;
    var querystr=url.substr(i+1);
    var arr1=querystr.split('&');
    var arr2=new Object();
    for  (i in arr1){
        var ta=arr1[i].split('=');
        arr2[ta[0]]=ta[1];
    }
    return arr2;
}