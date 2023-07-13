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

public val BreakpointsGroup.BreakpointMethod: IntellijIconData
    get() {
        if (_breakpointMethod != null) {
            return _breakpointMethod!!
        }
        _breakpointMethod = IntellijIconData(imageVector = { BreakpointMethodComposable(it) })
        return _breakpointMethod!!
    }

private var _breakpointMethod: IntellijIconData? = null

private fun BreakpointMethodComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name
        = "BreakpointMethod", defaultWidth = 14.0.dp, defaultHeight = 14.0.dp, viewportWidth =
        14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0xFFE55765)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(6.2927f, 0.7071f)
        curveTo(6.6833f, 0.3166f, 7.3164f, 0.3166f, 7.707f, 0.7071f)
        lineTo(13.2927f, 6.2929f)
        curveTo(13.6833f, 6.6834f, 13.6833f, 7.3165f, 13.2927f, 7.7071f)
        lineTo(7.707f, 13.2929f)
        curveTo(7.3164f, 13.6834f, 6.6833f, 13.6834f, 6.2927f, 13.2929f)
        lineTo(0.707f, 7.7071f)
        curveTo(0.3164f, 7.3165f, 0.3164f, 6.6834f, 0.707f, 6.2929f)
        lineTo(6.2927f, 0.7071f)
        close()
    }
}
.build()