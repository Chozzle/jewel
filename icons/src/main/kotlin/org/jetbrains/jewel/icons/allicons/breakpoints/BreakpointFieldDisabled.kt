package org.jetbrains.jewel.icons.allicons.breakpoints

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.BreakpointsGroup

public val BreakpointsGroup.BreakpointFieldDisabled: IntellijIconData
    get() {
        if (_breakpointFieldDisabled != null) {
            return _breakpointFieldDisabled!!
        }
        _breakpointFieldDisabled = IntellijIconData(imageVector = {
                BreakpointFieldDisabledComposable(it) })
        return _breakpointFieldDisabled!!
    }

private var _breakpointFieldDisabled: IntellijIconData? = null

private fun BreakpointFieldDisabledComposable(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "BreakpointFieldDisabled", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp,
        viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(0.0f, 7.0f)
        curveTo(0.75f, 4.3282f, 3.6406f, 2.0f, 7.0f, 2.0f)
        curveTo(10.3594f, 2.0f, 13.25f, 4.3282f, 14.0f, 7.0f)
        curveTo(13.25f, 9.6718f, 10.3594f, 12.0f, 7.0f, 12.0f)
        curveTo(3.6406f, 12.0f, 0.75f, 9.6718f, 0.0f, 7.0f)
        close()
        moveTo(7.0f, 10.5f)
        curveTo(8.933f, 10.5f, 10.5f, 8.933f, 10.5f, 7.0f)
        curveTo(10.5f, 5.067f, 8.933f, 3.5f, 7.0f, 3.5f)
        curveTo(5.067f, 3.5f, 3.5f, 5.067f, 3.5f, 7.0f)
        curveTo(3.5f, 8.933f, 5.067f, 10.5f, 7.0f, 10.5f)
        close()
    }
}
.build()