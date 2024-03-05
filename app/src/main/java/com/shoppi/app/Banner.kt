package com.shoppi.app

import java.io.StringBufferInputStream

data class Banner(
    val backgroundImageUrl: String,
    val badge: BannerBadge,
    val label: String,
    val productDetail: ProductDetail
)

data class BannerBadge(
    val label: String,
    val backgroundColor: StringBufferInputStream,
)

data class ProductDetail(
    val brandName: String,
    val label: String,
    val discountRate: Int,
    val price: Int,
    val thumbnailImageUrl: String,
    val productId: String
)