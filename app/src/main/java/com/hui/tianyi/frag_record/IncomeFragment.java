package com.hui.tianyi.frag_record;
import com.hui.tally.R;
import com.hui.tianyi.db.DBManager;
import com.hui.tianyi.db.TypeBean;

import java.util.List;
/**
 * 收入记录页面
 */
public class IncomeFragment extends BaseRecordFragment {


    @Override
    public void loadDataToGV() {
        super.loadDataToGV();
        //获取数据库当中的数据源
        List<TypeBean> inlist = DBManager.getTypeList(1);
        typeList.addAll(inlist);
        adapter.notifyDataSetChanged();
        typeTv.setText("Other");
        typeIv.setImageResource(R.mipmap.in_qt_fs);
    }

    @Override
    public void saveAccountToDB() {
        accountBean.setKind(1);
        DBManager.insertItemToAccounttb(accountBean);
    }
}