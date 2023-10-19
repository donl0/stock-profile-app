package com.example.mvp_example.code.asset_table.model

import com.example.mvp_example.R
import com.example.mvp_example.code.asset_table.model.objects.AssetTable

class StocksTableModel: IAssetTableModel {
    override fun takeData(): ArrayList<AssetTable> {
        val items: ArrayList<AssetTable> = arrayListOf(
            AssetTable(R.drawable.hsy, "The Hershey\nCompany", "HSY", 26f, 18717.38f, -22188.98f, -4.80f),
            AssetTable(R.drawable.mnst, "Monster\nBeverage\nCorporation", "MNST", 0f, 4856.85f, 207.41f, 14.43f),
            AssetTable(R.drawable.anet, "Arista\nNetwork Inc.", "ANET", 0f, 18836.79f, 12145.60f, 14.43f),
        )

        return items;
    }
}