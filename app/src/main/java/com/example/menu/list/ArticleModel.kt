package com.example.menu.list

import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize data class ArticleModel(
    val image: String,
    val title: String,
    val ingredients: String,
    val price: String
) : Parcelable {
    companion object {

        fun createDefultData(): List<ArticleModel> {
            val list = ArrayList<ArticleModel>()
            list.add(ArticleModel("https://sushi-point.com.ua/uploads/product/big/salat-s-pikantnoj-svininoj.jpg","САЛАТ ІЗ ПІКАНТНОЮ СВИНИНОЮ","Свиняча вирізка, Салат Айсберг, Огірок, Помідор Чері, Болгарський перець, Крохмаль, Sous and Sold, Перець Чилі","99 грн"))
            list.add(ArticleModel("https://sushi-point.com.ua/uploads/product/big/salat-s-pryanim-tofu.jpg","САЛАТ ІЗ ПРЯНИМ ТОФУ","Тофу, Салат Айсберг, Помідор Чері, Огірок, Перець болгарський, Орегано, Sous and Sold","105 грн"))
            list.add(ArticleModel("https://sushi-point.com.ua/uploads/product/big/salat-s-nezhnimi-krevetkami.jpg","САЛАТ ІЗ НІЖНИМИ КРЕВЕТКАМИ","Креветка тигрова, Салат айсберг, Огірок, Помідор, Болгарський перець, Часник, Sous and Sold","129 грн"))
            list.add(ArticleModel("https://sushi-point.com.ua/uploads/product/big/salat-chuka.jpg","САЛАТ ЧУКА","Водорості Хіяші, горіховий соус, кунжут","89 грн"))
            return list
        }
    }
}
