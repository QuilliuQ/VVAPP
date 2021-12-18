package com.sylas.vvapp.repository.model

import com.sylas.vvapp.domain.model.Content
import com.sylas.vvapp.domain.model.ViewType
import com.sylas.vvapp.domain.model.args.ViewTypeArgs

data class ContentDto(
    val viewType: String,
    val viewTypeArgs: ViewTypeArgsDto,
    val children: List<ContentDto>?=null
)

fun ContentDto.toContent() : Content = Content(
    viewType = getViewType(viewType),
    viewTypeArgs = viewTypeArgs,
    children = children?.map {
        it.toContent()
    } as ArrayList<Content>

)

fun getViewType(viewType: String):ViewType{
    return when(viewType){
      "Text"-> ViewType.Text
      "ClickableText"-> ViewType.ClickableText
      "Image"-> ViewType.Image
      "ClickableImage"-> ViewType.ClickableImage
      "Icon"-> ViewType.Icon
      "BadgedImage"-> ViewType.BadgedImage
      "Button"->ViewType.Button
      "EditText"->ViewType.EditText
      "ExpandableBanner"->ViewType.ExpandableBanner
      "Banner"->ViewType.Banner
      "List"->ViewType.List
      "ViewPager"->ViewType.ViewPager
      "AppBar"->ViewType.AppBar
      "BottomNavigation"->ViewType.BottomNavigation
      "Column"-> ViewType.Column
      "Row"->ViewType.Row
      "Box"->ViewType.Box
        else -> ViewType.ErrorViewType
    }
}

