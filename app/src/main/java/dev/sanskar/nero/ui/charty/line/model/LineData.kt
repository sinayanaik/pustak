package dev.sanskar.nero.ui.charty.line.model

data class LineData(val xValue: Any, val yValue: Float)

fun List<LineData>.maxYValue() = maxOf {
    it.yValue
}
