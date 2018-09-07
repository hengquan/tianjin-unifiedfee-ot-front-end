package cn.tianjin.unifiedfee.ot.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiritdata.framework.core.model.tree.TreeNode;
import com.spiritdata.framework.core.model.tree.TreeNodeBean;
import com.spiritdata.framework.ext.spring.SpringGetBean;
import com.spiritdata.framework.ui.tree.ZTree;
import com.spiritdata.framework.util.TreeUtils;

import cn.tianjin.unifiedfee.ot.entity.Category;
import cn.tianjin.unifiedfee.ot.mapper.CategoryMapper;
import cn.tianjin.unifiedfee.ot.model.CategoryNode;

@Service
public class CatagoryServer {
    @Autowired
    private CategoryMapper categoryDao;

    @SuppressWarnings("unchecked")
    public Map<String, Object> getDeepTreeList() {
        List<Category> cList=categoryDao.getAllList();
        if (cList==null||cList.isEmpty()) return null;
        List<CategoryNode> cTreeNodeList=new ArrayList<CategoryNode>();
        for (Category c: cList) {
            CategoryNode cn=new CategoryNode();
            cn.buildFromPo(c);
            cTreeNodeList.add(cn);
        }
        Map<String, Object> m=TreeUtils.convertFromList(cTreeNodeList);
        List<TreeNode<? extends TreeNodeBean>> l=(List<TreeNode<? extends TreeNodeBean>>) m.get("forest");
        List<Map<String, Object>> ret=new ArrayList<Map<String, Object>>();
//        for (TreeNode<? extends TreeNodeBean> cn : l) {
//            ret.add((CategoryNode)cn.toMap());
//            if (!isn.isLeaf()) deepAdd(isn.getChildren(), ret);
//        }
//        Map<String, Object> retM=new HashMap<String, Object>();
//        retM.put("DataList", ret);
//        IndustrySpaceNode isRootNode=new IndustrySpaceNode();
//        isRootNode.setId("0");
//        isRootNode.setParentId("-1");
//        isRootNode.setNodeName("空间分类根节点");
//        TreeNode<IndustrySpaceNode> isRoot=new TreeNode<IndustrySpaceNode>(isRootNode);
//        isRoot.setChildren(l);
//        retM.put("DataTree", (new ZTree<IndustrySpaceNode>(isRoot)).toTreeMap());
        return null;
    }
}