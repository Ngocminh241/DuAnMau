//package com.example.duanmau.Adapter;
//
//import androidx.annotation.NonNull;
//import androidx.fragment.app.Fragment;
//import androidx.viewpager2.adapter.FragmentStateAdapter;
//
//import com.example.duanmau.fragment.Frag_kingdoanh;
//import com.example.duanmau.fragment.Frag_sp_ngungkinhdoanh;
//
//
//public class Adapter_tab_sp extends FragmentStateAdapter {
//    int page = 2;
//    Frag_kingdoanh frag_kingdoanh;
//    Frag_sp_ngungkinhdoanh frag_sp_ngungkinhdoanh;
//
//    public Adapter_tab_sp(@NonNull Fragment fragment) {
//        super(fragment);
//        frag_kingdoanh = new Frag_kingdoanh();
//        frag_sp_ngungkinhdoanh = new Frag_sp_ngungkinhdoanh();
//    }
//
//    @NonNull
//    @Override
//    public Fragment createFragment(int position) {
//        if (position == 0) {
//           return frag_kingdoanh;
//        } else {
//            return frag_sp_ngungkinhdoanh;
//        }
//    }
//
//    @Override
//    public int getItemCount() {
//        return page;
//    }
//
//    public void loadData(){
//        frag_kingdoanh.loadData();
//    }
//}
