/**
 * bootstrap3的树表格(treeGrid)封装的外壳
 * 这里仅支持，一个dom对象中仅出现一个树表格
 */

//1.页面加载后，初始化一个treeTable
$(function () {
  var treeTable=new tt_shell();
  treeTable.Init();
}

var tt_shell=function() {
  var o_treeTabel=new Object();//返回的对象

  //初始化treeTable
  o_treeTabel.Init=function(domId, getDataUrl, tColumns) {
    if ((!domId)||(!getDataUrl)||(!tColumns)) return 1;

    var $tree_Table=$('#'+domId);
    if (!$tree_Table) return 2;

    $table.bootstrapTable({
      url: getDataUrl,
      striped: true,
      sidePagenation: 'server',
      idField: 'id',
      columns: tColumns,
      treeShowField: 'name',
      parentIdField: 'pid',
      onLoadSuccess: function(data) {
        $table.treegrid({
          initialState: 'collapsed',//收缩
          treeColumn: 1,//指明第几列数据改为树形
          expanderExpandedClass: 'glyphicon glyphicon-triangle-bottom',
          expanderCollapsedClass: 'glyphicon glyphicon-triangle-right',
          onChange: function() {
            $table.bootstrapTable('resetWidth');
          }
        });
      }
    )};

    //得到查询的参数
    o_treeTabel.queryParams=function (params) {
      var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
        limit: params.limit,   //页面大小
        offset: params.offset,  //页码
      };
      return temp;
    };
    return o_treeTable;
  };
}
