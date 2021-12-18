package com.sylas.vvapp.domain.model

sealed class ViewType {
    object ErrorViewType:ViewType()
    object EditText : ViewType()
    object Button : ViewType()
    object ExpandableBanner : ViewType()
    object Banner : ViewType()

    //Text's
    object Text : ViewType()
    object ClickableText : ViewType()

    //Image's
    object Image : ViewType()
    object BadgedImage : ViewType()
    object ClickableImage : ViewType()
    //vector Image
    object Icon : ViewType()

    //List's
    object List: ViewType()
    object ViewPager: ViewType()

    //Top and Bottom Item
    object AppBar: ViewType()
    object BottomNavigation : ViewType()

    //Marking
    object Column : ViewType()
    object Row : ViewType()
    object Box : ViewType()
}
