package org.jetbrains.jewel.icons.allicons.diff

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.DiffGroup

public val DiffGroup.`GutterCheckBoxSelected@14x14`: IntellijIconData
    get() {
        if (`_gutterCheckBoxSelected@14x14` != null) {
            return `_gutterCheckBoxSelected@14x14`!!
        }
        `_gutterCheckBoxSelected@14x14` = IntellijIconData(imageVector = {
                `GutterCheckBoxSelected@14x14Composable`(it) })
        return `_gutterCheckBoxSelected@14x14`!!
    }

private var `_gutterCheckBoxSelected@14x14`: IntellijIconData? = null

private fun `GutterCheckBoxSelected@14x14Composable`(colorScheme: IntelliJIconColors): ImageVector =
        Builder(name = "GutterCheckBoxSelected@14x14", defaultWidth = 14.0.dp, defaultHeight =
        14.0.dp, viewportWidth = 14.0f, viewportHeight = 14.0f).apply {
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter =
            4.0f, pathFillType = NonZero) {
        moveTo(0.5f, 12.0f)
        verticalLineTo(2.0f)
        curveTo(0.5f, 1.1716f, 1.1716f, 0.5f, 2.0f, 0.5f)
        horizontalLineTo(12.0f)
        curveTo(12.8284f, 0.5f, 13.5f, 1.1716f, 13.5f, 2.0f)
        verticalLineTo(12.0f)
        curveTo(13.5f, 12.8284f, 12.8284f, 13.5f, 12.0f, 13.5f)
        horizontalLineTo(2.0f)
        curveTo(1.1716f, 13.5f, 0.5f, 12.8284f, 0.5f, 12.0f)
        close()
    }
    path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(colorScheme.generalStroke),
            strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
            StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
        moveTo(3.75f, 6.75f)
        lineTo(6.0f, 9.0f)
        lineTo(10.2422f, 4.7578f)
    }
}
.build()