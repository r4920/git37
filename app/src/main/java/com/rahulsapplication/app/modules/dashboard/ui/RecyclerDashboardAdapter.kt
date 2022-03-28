package com.rahulsapplication.app.modules.dashboard.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rahulsapplication.app.R
import com.rahulsapplication.app.databinding.RowDashboard4Binding
import com.rahulsapplication.app.modules.dashboard.`data`.model.Dashboard4RowModel
import kotlin.Int
import kotlin.Unit
import kotlin.collections.List

public class RecyclerDashboardAdapter(
  public var list: List<Dashboard4RowModel>
) : RecyclerView.Adapter<RecyclerDashboardAdapter.RowDashboard4VH>() {
  private var clickListener: OnItemClickListener? = null

  public override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowDashboard4VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_dashboard4,parent,false)
    return RowDashboard4VH(view)
  }

  public override fun onBindViewHolder(holder: RowDashboard4VH, position: Int): Unit {
    val dashboard4RowModel = Dashboard4RowModel()
    // TODO uncomment following line after integration with data source
    // val dashboard4RowModel = list[position]
    holder.binding.dashboard4RowModel = dashboard4RowModel
  }

  public override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Dashboard4RowModel>): Unit {
    list = newData
    notifyDataSetChanged()
  }

  public fun setOnItemClickListener(clickListener: OnItemClickListener): Unit {
    this.clickListener = clickListener
  }

  public interface OnItemClickListener {
    public fun onItemClick(
      view: View,
      position: Int,
      item: Dashboard4RowModel
    ): Unit {
    }
  }

  public inner class RowDashboard4VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    public val binding: RowDashboard4Binding = RowDashboard4Binding.bind(itemView)
  }
}
