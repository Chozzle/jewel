package org.jetbrains.jewel.theme.intellij.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.awt.SwingPanel
import org.jetbrains.jewel.Orientation
import org.jetbrains.jewel.theme.intellij.styles.LocalSliderStyle
import org.jetbrains.jewel.theme.intellij.styles.SliderAppearance
import org.jetbrains.jewel.theme.intellij.styles.SliderStyle
import org.jetbrains.jewel.theme.intellij.styles.appearance
import org.jetbrains.jewel.toAwtColor
import javax.swing.JSlider
import javax.swing.SwingConstants

// TODO pull out state (min, max, value)
@Composable
fun Slider(
    value: Int,
    modifier: Modifier = Modifier,
    style: SliderStyle = LocalSliderStyle.current,
    min: Int = 0,
    max: Int = 100,
    snapToTicks: Boolean = false,
    onValueChange: (Int) -> Unit
) {
    SwingPanel(
        background = style.appearance().background,
        modifier = modifier.fillMaxSize(),
        factory = {
            jSlider(
                onValueChange = onValueChange,
                min = min,
                max = max,
                snapToTicks = snapToTicks,
                appearance = style.appearance()
            )
        },
        update = {
            it.value = value
        }
    )
}

// TODO: add labels support
private fun jSlider(
    onValueChange: (Int) -> Unit,
    min: Int,
    max: Int,
    snapToTicks: Boolean,
    appearance: SliderAppearance
) = JSlider(appearance.orientation.toSwingInt(), min, max, min).apply {
    addChangeListener { onValueChange(this@apply.value) }
    background = appearance.background.toAwtColor()
    paintTrack = appearance.paintTrack
    paintTicks = appearance.paintTicks
    inverted = appearance.inverted
    setSnapToTicks(snapToTicks)
    majorTickSpacing = appearance.majorTickSpacing
    minorTickSpacing = appearance.minorTickSpacing
}

private fun Orientation.toSwingInt() = when (this) {
    Orientation.Horizontal -> SwingConstants.HORIZONTAL
    Orientation.Vertical -> SwingConstants.VERTICAL
}
