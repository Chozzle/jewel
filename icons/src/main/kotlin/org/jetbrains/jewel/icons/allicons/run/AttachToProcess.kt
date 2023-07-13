package org.jetbrains.jewel.icons.allicons.run

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import org.jetbrains.jewel.IntelliJIconColors
import org.jetbrains.jewel.icons.IntellijIconData
import org.jetbrains.jewel.icons.allicons.RunGroup

public val RunGroup.AttachToProcess: IntellijIconData
    get() {
        if (_attachToProcess != null) {
            return _attachToProcess!!
        }
        _attachToProcess = IntellijIconData(imageVector = { AttachToProcessComposable(it) })
        return _attachToProcess!!
    }

private var _attachToProcess: IntellijIconData? = null

private fun AttachToProcessComposable(colorScheme: IntelliJIconColors): ImageVector = Builder(name =
        "AttachToProcess", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f,
        viewportHeight = 16.0f).apply {
    path(fill = SolidColor(Color(0xFF3574F0)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap
            = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
        moveTo(12.5f, 11.0f)
        curveTo(12.2239f, 11.0f, 12.0f, 11.2239f, 12.0f, 11.5f)
        curveTo(12.0f, 11.7761f, 12.2239f, 12.0f, 12.5f, 12.0f)
        horizontalLineTo(14.2929f)
        lineTo(11.1464f, 15.1464f)
        curveTo(10.9512f, 15.3417f, 10.9512f, 15.6583f, 11.1464f, 15.8535f)
        curveTo(11.3417f, 16.0488f, 11.6583f, 16.0488f, 11.8536f, 15.8535f)
        lineTo(15.0f, 12.7071f)
        verticalLineTo(14.5f)
        curveTo(15.0f, 14.7761f, 15.2239f, 15.0f, 15.5f, 15.0f)
        curveTo(15.7761f, 15.0f, 16.0f, 14.7761f, 16.0f, 14.5f)
        verticalLineTo(11.5f)
        curveTo(16.0f, 11.2239f, 15.7761f, 11.0f, 15.5f, 11.0f)
        horizontalLineTo(12.5f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalStroke), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            EvenOdd) {
        moveTo(10.7008f, 4.2f)
        curveTo(10.7008f, 4.279f, 10.6974f, 4.3573f, 10.6907f, 4.4347f)
        curveTo(11.1618f, 4.6951f, 11.5665f, 5.0609f, 11.8729f, 5.5004f)
        lineTo(13.9791f, 4.3604f)
        curveTo(14.222f, 4.2289f, 14.5254f, 4.3192f, 14.6569f, 4.5621f)
        curveTo(14.7883f, 4.8049f, 14.698f, 5.1083f, 14.4551f, 5.2398f)
        lineTo(12.3218f, 6.3945f)
        curveTo(12.4374f, 6.742f, 12.5f, 7.1137f, 12.5f, 7.5f)
        verticalLineTo(8.4998f)
        horizontalLineTo(15.0f)
        curveTo(15.2761f, 8.4998f, 15.5f, 8.7237f, 15.5f, 8.9998f)
        curveTo(15.5f, 9.276f, 15.2761f, 9.4998f, 15.0f, 9.4998f)
        horizontalLineTo(12.5f)
        verticalLineTo(10.0f)
        curveTo(12.1046f, 10.0f, 11.745f, 10.153f, 11.4771f, 10.4029f)
        curveTo(11.4922f, 10.2707f, 11.5f, 10.1363f, 11.5f, 10.0f)
        verticalLineTo(7.5f)
        curveTo(11.5f, 6.1193f, 10.3807f, 5.0f, 9.0f, 5.0f)
        horizontalLineTo(7.0f)
        curveTo(5.6193f, 5.0f, 4.5f, 6.1193f, 4.5f, 7.5f)
        verticalLineTo(10.0f)
        curveTo(4.5f, 11.933f, 6.067f, 13.5f, 8.0f, 13.5f)
        curveTo(9.2895f, 13.5f, 10.416f, 12.8027f, 11.0233f, 11.7646f)
        curveTo(11.0911f, 12.1457f, 11.3028f, 12.4769f, 11.6002f, 12.7002f)
        curveTo(10.7792f, 13.7931f, 9.4721f, 14.5f, 8.0f, 14.5f)
        curveTo(6.3612f, 14.5f, 4.927f, 13.624f, 4.1402f, 12.3147f)
        lineTo(2.0299f, 13.5331f)
        curveTo(1.7908f, 13.6711f, 1.4849f, 13.5892f, 1.3469f, 13.3501f)
        curveTo(1.2088f, 13.1109f, 1.2908f, 12.8051f, 1.5299f, 12.667f)
        lineTo(3.7224f, 11.4012f)
        curveTo(3.5781f, 10.9602f, 3.5f, 10.4892f, 3.5f, 10.0f)
        verticalLineTo(9.5001f)
        horizontalLineTo(1.0f)
        curveTo(0.7239f, 9.5001f, 0.5f, 9.2762f, 0.5f, 9.0001f)
        curveTo(0.5f, 8.7239f, 0.7239f, 8.5001f, 1.0f, 8.5001f)
        horizontalLineTo(3.5f)
        verticalLineTo(7.5f)
        curveTo(3.5f, 7.1136f, 3.5626f, 6.7419f, 3.6782f, 6.3944f)
        lineTo(1.5423f, 5.2399f)
        curveTo(1.2994f, 5.1086f, 1.2089f, 4.8052f, 1.3402f, 4.5623f)
        curveTo(1.4715f, 4.3194f, 1.7749f, 4.2289f, 2.0178f, 4.3602f)
        lineTo(4.1271f, 5.5003f)
        curveTo(4.4339f, 5.0604f, 4.8391f, 4.6943f, 5.3108f, 4.4339f)
        curveTo(5.3042f, 4.3567f, 5.3008f, 4.2787f, 5.3008f, 4.2f)
        curveTo(5.3008f, 2.7088f, 6.5096f, 1.5f, 8.0008f, 1.5f)
        curveTo(9.492f, 1.5f, 10.7008f, 2.7088f, 10.7008f, 4.2f)
        close()
        moveTo(7.0f, 4.0f)
        curveTo(6.7623f, 4.0f, 6.5301f, 4.0237f, 6.3058f, 4.0689f)
        curveTo(6.3727f, 3.1913f, 7.106f, 2.5f, 8.0008f, 2.5f)
        curveTo(8.8956f, 2.5f, 9.629f, 3.1914f, 9.6958f, 4.0692f)
        curveTo(9.4709f, 4.0238f, 9.2382f, 4.0f, 9.0f, 4.0f)
        horizontalLineTo(7.0f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(6.3058f, 4.0689f)
        curveTo(6.5301f, 4.0237f, 6.7623f, 4.0f, 7.0f, 4.0f)
        horizontalLineTo(9.0f)
        curveTo(9.2382f, 4.0f, 9.4709f, 4.0238f, 9.6958f, 4.0692f)
        curveTo(9.629f, 3.1914f, 8.8956f, 2.5f, 8.0008f, 2.5f)
        curveTo(7.106f, 2.5f, 6.3727f, 3.1913f, 6.3058f, 4.0689f)
        close()
    }
    path(fill = SolidColor(colorScheme.generalFill), stroke = null, strokeLineWidth = 0.0f,
            strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
            NonZero) {
        moveTo(4.5f, 7.5f)
        curveTo(4.5f, 6.1193f, 5.6193f, 5.0f, 7.0f, 5.0f)
        horizontalLineTo(9.0f)
        curveTo(10.3807f, 5.0f, 11.5f, 6.1193f, 11.5f, 7.5f)
        verticalLineTo(10.0f)
        curveTo(11.5f, 10.1363f, 11.4922f, 10.2707f, 11.4771f, 10.4029f)
        curveTo(11.1835f, 10.6767f, 11.0f, 11.0669f, 11.0f, 11.5f)
        curveTo(11.0f, 11.5903f, 11.008f, 11.6787f, 11.0233f, 11.7646f)
        curveTo(10.416f, 12.8027f, 9.2895f, 13.5f, 8.0f, 13.5f)
        curveTo(6.067f, 13.5f, 4.5f, 11.933f, 4.5f, 10.0f)
        verticalLineTo(7.5f)
        close()
    }
}
.build()