package org.jetbrains.jewel.icons.allicons.actions

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
import org.jetbrains.jewel.icons.allicons.ActionsGroup

public val ActionsGroup.MoveToRightTop: IntellijIconData
    get() {
        if (_moveToRightTop != null) {
            return _moveToRightTop!!
        }
        _moveToRightTop = IntellijIconData(imageVector = { MoveToRightTopComposable(it) })
        return _moveToRightTop!!
    }

private var _moveToRightTop: IntellijIconData? = null

private fun MoveToRightTopComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "MoveToRightTop", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(12.0f, 2.0f)
        curveTo(13.1046f, 2.0f, 14.0f, 2.8954f, 14.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(14.0f, 13.1046f, 13.1046f, 14.0f, 12.0f, 14.0f)
        horizontalLineTo(4.0f)
        curveTo(2.8954f, 14.0f, 2.0f, 13.1046f, 2.0f, 12.0f)
        verticalLineTo(4.0f)
        curveTo(2.0f, 2.8954f, 2.8954f, 2.0f, 4.0f, 2.0f)
        horizontalLineTo(12.0f)
        close()
        moveTo(10.0f, 3.0f)
        verticalLineTo(8.0f)
        horizontalLineTo(13.0f)
        verticalLineTo(4.0f)
        curveTo(13.0f, 3.4477f, 12.5523f, 3.0f, 12.0f, 3.0f)
        horizontalLineTo(10.0f)
        close()
        moveTo(13.0f, 9.0f)
        horizontalLineTo(10.0f)
        curveTo(9.4477f, 9.0f, 9.0f, 8.5523f, 9.0f, 8.0f)
        verticalLineTo(3.0f)
        horizontalLineTo(4.0f)
        curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
        verticalLineTo(12.0f)
        curveTo(3.0f, 12.5523f, 3.4477f, 13.0f, 4.0f, 13.0f)
        horizontalLineTo(12.0f)
        curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
        verticalLineTo(9.0f)
        close()
    }
}
.build()