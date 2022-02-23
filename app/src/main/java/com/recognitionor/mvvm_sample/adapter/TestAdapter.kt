package com.recognitionor.mvvm_sample.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recognitionor.mvvm_sample.R
import com.recognitionor.mvvm_sample.data.model.Test

class TestAdapter(
    private val users: ArrayList<Test>
) : RecyclerView.Adapter<TestAdapter.TestViewHolder>() {

    class TestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): TestViewHolder {
        return TestViewHolder(
            LayoutInflater.from(parent.context)
            .inflate(R.layout.view_holder_layout, parent, false))
    }

    override fun onBindViewHolder(holder: TestViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 3
    }
}