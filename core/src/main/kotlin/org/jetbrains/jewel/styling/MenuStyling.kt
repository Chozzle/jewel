package org.jetbrains.jewel.styling

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.DpOffset
import org.jetbrains.jewel.MenuItemState

@Stable
interface MenuStyle {

    val colors: MenuColors
    val metrics: MenuMetrics
    val icons: MenuIcons
}

@Immutable
interface MenuColors {

    val background: Brush
    val border: Color
    val shadow: Color
    val itemColors: MenuItemColors
}

@Stable
interface MenuMetrics {

    val cornerSize: CornerSize
    val margin: PaddingValues
    val padding: PaddingValues
    val contentPadding: PaddingValues
    val offset: DpOffset
    val shadowSize: Dp
    val borderWidth: Dp
    val itemMetrics: MenuItemMetrics
    val submenuMetrics: SubmenuMetrics
}

@Stable
interface MenuItemMetrics {

    val cornerSize: CornerSize
    val padding: PaddingValues
    val contentPadding: PaddingValues
    val separatorPadding: PaddingValues
}

@Stable
interface SubmenuMetrics {

    val offset: DpOffset
    val itemPadding: PaddingValues
}

@Immutable
interface MenuItemColors {

    val background: Color
    val backgroundDisabled: Color
    val backgroundFocused: Color
    val backgroundPressed: Color
    val backgroundHovered: Color

    @Composable
    fun backgroundFor(state: MenuItemState) = rememberUpdatedState(
        state.chooseValue(background, backgroundDisabled, backgroundFocused, backgroundPressed, backgroundHovered)
    )

    val content: Color
    val contentDisabled: Color
    val contentFocused: Color
    val contentPressed: Color
    val contentHovered: Color

    @Composable
    fun contentFor(state: MenuItemState) = rememberUpdatedState(
        state.chooseValue(content, contentDisabled, contentFocused, contentPressed, contentHovered)
    )

    val iconTint: Color
    val iconTintDisabled: Color
    val iconTintFocused: Color
    val iconTintPressed: Color
    val iconTintHovered: Color

    @Composable
    fun iconTintFor(state: MenuItemState) = rememberUpdatedState(
        state.chooseValue(iconTint, iconTintDisabled, iconTintFocused, iconTintPressed, iconTintHovered)
    )

    val separator: Color
}

@Immutable
interface MenuIcons {
    val submenuChevron: String
}

val LocalMenuStyle = staticCompositionLocalOf<MenuStyle> {
    error("No MenuStyle provided")
}