/**
 *  获取url传参工具类
 *  @date 2018-08-30
 *
 */

var QueryUtils = {
    GetQueryString: function (name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return unescape(r[2]);
        return null;
    }
};
