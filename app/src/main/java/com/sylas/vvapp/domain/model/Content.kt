package com.sylas.vvapp.domain.model

import com.sylas.vvapp.domain.model.args.EditTextArgs
import com.sylas.vvapp.domain.model.args.ViewTypeArgs
import com.sylas.vvapp.repository.model.ViewTypeArgsDto

class Content(val viewType: ViewType,val viewTypeArgs: ViewTypeArgsDto,val children:ArrayList<Content>) {


}

fun getViewTypeArgs(viewType: ViewType,viewTypeArgsTemp: ViewTypeArgsDto):ViewTypeArgs{
    return when(viewType){
        ViewType.AppBar -> TODO()
        ViewType.BadgedImage -> TODO()
        ViewType.Banner -> TODO()
        ViewType.BottomNavigation -> TODO()
        ViewType.Box -> TODO()
        ViewType.Button -> TODO()
        ViewType.ClickableImage -> TODO()
        ViewType.ClickableText -> TODO()
        ViewType.Column -> TODO()
        ViewType.EditText -> EditTextArgs(viewTypeArgsTemp)
        ViewType.ErrorViewType -> TODO()
        ViewType.ExpandableBanner -> TODO()
        ViewType.Icon -> TODO()
        ViewType.Image -> TODO()
        ViewType.List -> TODO()
        ViewType.Row -> TODO()
        ViewType.Text -> TODO()
        ViewType.ViewPager -> TODO()
    }
}

fun ViewTypeArgsDto.toViewType(){

}