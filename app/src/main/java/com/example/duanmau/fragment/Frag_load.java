package com.example.duanmau.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.duanmau.QuanLyKhoHang;
import com.example.duanmau.R;


public class Frag_load extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.frag_load, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        QuanLyKhoHang quanLyKhoHang = (QuanLyKhoHang) getActivity();
        FragmentManager manager = quanLyKhoHang.getSupportFragmentManager();
        manager.beginTransaction().replace(R.id.framelayout, new qlNhanSuFragment()).commit();
    }
}
