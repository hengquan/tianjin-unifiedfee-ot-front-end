
$(function () {
    $.ajax({
        type: "Post",
        url: "http://localhost:8084/rest/classification/getTreeList",
        // url: "",
        dataType: "json",
        success: function (result) {
            alert(result.length);
            var data = JSON.stringify(result);
            alert(data);
            $('#pt-tree').treeview({
                data: data,

                showCheckbox: true,   //是否显示复选框

                multiSelect: false,    //多选
                levels: 1,
                onNodeChecked: function (event,data) {

                    alert(data.nodeId);
                    alert(data.id);
                },
                onNodeSelected: function (event, data) {
                    alert(data.nodeId);
                    // alert(data.id);
                }
            });
        },
        error: function () {
            alert("树形结构加载失败！")
        }
    });
})
