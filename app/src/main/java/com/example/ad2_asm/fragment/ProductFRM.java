package com.example.ad2_asm.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ad2_asm.R;
import com.example.ad2_asm.adapter.ProductAdapter;
import com.example.ad2_asm.dao.SanPhamDAO;
import com.example.ad2_asm.model.Product;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class ProductFRM extends Fragment {
    private RecyclerView recyclerView;
    private FloatingActionButton floatAdd;
    private SanPhamDAO sanPhamDAO;



//    @Nullable
//    @Override
//    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.fragment_product, container, false);
//            recyclerView = view.findViewById(R.id.recycle);
//            floatAdd = view.findViewById(R.id.floatAdd);
//
//            sanPhamDAO = new SanPhamDAO(getContext());
//        ArrayList<Product> list = sanPhamDAO.getDS();
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);
//        ProductAdapter adapter = new ProductAdapter(getContext(), list);
//        recyclerView.setAdapter(adapter);
//        return view;
//    }
}
