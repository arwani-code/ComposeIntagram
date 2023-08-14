package com.clone.composeintagram.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


@Composable
fun instagramVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 133.dp,
            defaultHeight = 35.dp,
            viewportWidth = 143f,
            viewportHeight = 36f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(37.82f, 4.11f)
                curveToRelative(-2.32f, 0.97f, -4.86f, 3.7f, -5.66f, 7.13f)
                curveToRelative(-1.02f, 4.34f, 3.21f, 6.17f, 3.56f, 5.57f)
                curveToRelative(0.4f, -0.7f, -0.76f, -0.94f, -1f, -3.2f)
                curveToRelative(-0.3f, -2.9f, 1.05f, -6.16f, 2.75f, -7.58f)
                curveToRelative(0.32f, -0.27f, 0.3f, 0.1f, 0.3f, 0.78f)
                lineToRelative(-0.06f, 14.46f)
                curveToRelative(0f, 3.1f, -0.13f, 4.07f, -0.36f, 5.04f)
                curveToRelative(-0.23f, 0.98f, -0.6f, 1.64f, -0.33f, 1.9f)
                curveToRelative(0.32f, 0.28f, 1.68f, -0.4f, 2.46f, -1.5f)
                arcToRelative(
                    8.13f,
                    8.13f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    1.33f,
                    -4.58f
                )
                curveToRelative(0.07f, -2.06f, 0.06f, -5.33f, 0.07f, -7.19f)
                curveToRelative(0f, -1.7f, 0.03f, -6.71f, -0.03f, -9.72f)
                curveToRelative(-0.02f, -0.74f, -2.07f, -1.51f, -3.03f, -1.1f)
                close()
                moveToRelative(82.13f, 14.48f)
                arcToRelative(
                    9.42f,
                    9.42f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.88f,
                    3.75f
                )
                curveToRelative(-0.85f, 1.72f, -2.63f, 2.25f, -3.39f, -0.22f)
                curveToRelative(-0.4f, -1.34f, -0.43f, -3.59f, -0.13f, -5.47f)
                curveToRelative(0.3f, -1.9f, 1.14f, -3.35f, 2.53f, -3.22f)
                curveToRelative(1.38f, 0.13f, 2.02f, 1.9f, 1.87f, 5.16f)
                close()
                moveTo(96.8f, 28.57f)
                curveToRelative(-0.02f, 2.67f, -0.44f, 5.01f, -1.34f, 5.7f)
                curveToRelative(-1.29f, 0.96f, -3f, 0.23f, -2.65f, -1.72f)
                curveToRelative(0.31f, -1.72f, 1.8f, -3.48f, 4f, -5.64f)
                lineToRelative(-0.01f, 1.66f)
                close()
                moveToRelative(-0.35f, -10f)
                arcToRelative(
                    10.56f,
                    10.56f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.88f,
                    3.77f
                )
                curveToRelative(-0.85f, 1.72f, -2.64f, 2.25f, -3.39f, -0.22f)
                curveToRelative(-0.5f, -1.69f, -0.38f, -3.87f, -0.13f, -5.25f)
                curveToRelative(0.33f, -1.78f, 1.12f, -3.44f, 2.53f, -3.44f)
                curveToRelative(1.38f, 0f, 2.06f, 1.5f, 1.87f, 5.14f)
                close()
                moveToRelative(-13.41f, -0.02f)
                arcToRelative(
                    9.54f,
                    9.54f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.87f,
                    3.8f
                )
                curveToRelative(-0.88f, 1.7f, -2.63f, 2.24f, -3.4f, -0.23f)
                curveToRelative(-0.55f, -1.77f, -0.36f, -4.2f, -0.13f, -5.5f)
                curveToRelative(0.34f, -1.95f, 1.2f, -3.32f, 2.53f, -3.2f)
                curveToRelative(1.38f, 0.14f, 2.04f, 1.9f, 1.87f, 5.13f)
                close()
                moveToRelative(61.45f, 1.81f)
                curveToRelative(-0.33f, 0f, -0.49f, 0.35f, -0.61f, 0.93f)
                curveToRelative(-0.44f, 2.02f, -0.9f, 2.48f, -1.5f, 2.48f)
                curveToRelative(-0.66f, 0f, -1.26f, -1f, -1.42f, -3f)
                curveToRelative(-0.12f, -1.58f, -0.1f, -4.48f, 0.06f, -7.37f)
                curveToRelative(0.03f, -0.59f, -0.14f, -1.17f, -1.73f, -1.75f)
                curveToRelative(-0.68f, -0.25f, -1.68f, -0.62f, -2.17f, 0.58f)
                arcToRelative(
                    29.65f,
                    29.65f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -2.08f,
                    7.14f
                )
                curveToRelative(0f, 0.06f, -0.08f, 0.07f, -0.1f, -0.06f)
                curveToRelative(-0.07f, -0.87f, -0.26f, -2.46f, -0.28f, -5.79f)
                curveToRelative(0f, -0.65f, -0.14f, -1.2f, -0.86f, -1.65f)
                curveToRelative(-0.47f, -0.3f, -1.88f, -0.81f, -2.4f, -0.2f)
                curveToRelative(-0.43f, 0.5f, -0.94f, 1.87f, -1.47f, 3.48f)
                lineToRelative(-0.74f, 2.2f)
                lineToRelative(0.01f, -4.88f)
                curveToRelative(0f, -0.5f, -0.34f, -0.67f, -0.45f, -0.7f)
                arcToRelative(
                    9.54f,
                    9.54f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.8f,
                    -0.37f
                )
                curveToRelative(-0.48f, 0f, -0.6f, 0.27f, -0.6f, 0.67f)
                curveToRelative(0f, 0.05f, -0.08f, 4.65f, -0.08f, 7.87f)
                verticalLineToRelative(0.46f)
                curveToRelative(-0.27f, 1.48f, -1.14f, 3.49f, -2.09f, 3.49f)
                reflectiveCurveToRelative(-1.4f, -0.84f, -1.4f, -4.68f)
                curveToRelative(0f, -2.24f, 0.07f, -3.21f, 0.1f, -4.83f)
                curveToRelative(0.02f, -0.94f, 0.06f, -1.65f, 0.06f, -1.81f)
                curveToRelative(-0.01f, -0.5f, -0.87f, -0.75f, -1.27f, -0.85f)
                curveToRelative(-0.4f, -0.09f, -0.76f, -0.13f, -1.03f, -0.11f)
                curveToRelative(-0.4f, 0.02f, -0.67f, 0.27f, -0.67f, 0.62f)
                verticalLineToRelative(0.55f)
                arcToRelative(
                    3.71f,
                    3.71f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.83f,
                    -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.94f, -0.05f, -4.07f, 1.53f)
                arcToRelative(
                    9.31f,
                    9.31f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.66f,
                    4.73f
                )
                curveToRelative(-0.16f, 1.5f, -0.1f, 3.01f, 0.17f, 4.3f)
                curveToRelative(-0.33f, 1.44f, -0.96f, 2.04f, -1.64f, 2.04f)
                curveToRelative(-0.99f, 0f, -1.7f, -1.62f, -1.62f, -4.4f)
                curveToRelative(0.06f, -1.84f, 0.42f, -3.13f, 0.82f, -4.99f)
                curveToRelative(0.17f, -0.8f, 0.04f, -1.2f, -0.31f, -1.6f)
                curveToRelative(-0.32f, -0.37f, -1f, -0.56f, -1.99f, -0.33f)
                curveToRelative(-0.7f, 0.16f, -1.7f, 0.34f, -2.6f, 0.47f)
                curveToRelative(0f, 0f, 0.05f, -0.21f, 0.1f, -0.6f)
                curveToRelative(0.23f, -2.03f, -1.98f, -1.87f, -2.69f, -1.22f)
                curveToRelative(-0.42f, 0.39f, -0.7f, 0.84f, -0.82f, 1.67f)
                curveToRelative(-0.17f, 1.3f, 0.9f, 1.91f, 0.9f, 1.91f)
                arcToRelative(
                    22.22f,
                    22.22f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -3.4f,
                    7.23f
                )
                verticalLineToRelative(-0.7f)
                curveToRelative(-0.01f, -3.36f, 0.03f, -6f, 0.05f, -6.95f)
                curveToRelative(0.02f, -0.94f, 0.06f, -1.63f, 0.06f, -1.8f)
                curveToRelative(0f, -0.36f, -0.22f, -0.5f, -0.66f, -0.67f)
                curveToRelative(-0.4f, -0.16f, -0.86f, -0.26f, -1.34f, -0.3f)
                curveToRelative(-0.6f, -0.05f, -0.97f, 0.27f, -0.96f, 0.65f)
                verticalLineToRelative(0.52f)
                arcToRelative(
                    3.7f,
                    3.7f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.84f,
                    -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.94f, -0.05f, -4.07f, 1.53f)
                arcToRelative(
                    10.1f,
                    10.1f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.66f,
                    4.72f
                )
                curveToRelative(-0.15f, 1.57f, -0.13f, 2.9f, 0.09f, 4.04f)
                curveToRelative(-0.23f, 1.13f, -0.89f, 2.3f, -1.63f, 2.3f)
                curveToRelative(-0.95f, 0f, -1.5f, -0.83f, -1.5f, -4.67f)
                curveToRelative(0f, -2.24f, 0.07f, -3.21f, 0.1f, -4.83f)
                curveToRelative(0.02f, -0.94f, 0.06f, -1.65f, 0.06f, -1.81f)
                curveToRelative(0f, -0.5f, -0.87f, -0.75f, -1.27f, -0.85f)
                curveToRelative(-0.42f, -0.1f, -0.79f, -0.13f, -1.06f, -0.1f)
                curveToRelative(-0.37f, 0.02f, -0.63f, 0.35f, -0.63f, 0.6f)
                verticalLineToRelative(0.56f)
                arcToRelative(
                    3.7f,
                    3.7f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.84f,
                    -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.93f, -0.04f, -4.07f, 1.53f)
                curveToRelative(-0.75f, 1.03f, -1.35f, 2.17f, -1.66f, 4.7f)
                arcToRelative(
                    15.8f,
                    15.8f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.12f,
                    2.04f
                )
                curveToRelative(-0.3f, 1.81f, -1.61f, 3.9f, -2.68f, 3.9f)
                curveToRelative(-0.63f, 0f, -1.23f, -1.21f, -1.23f, -3.8f)
                curveToRelative(0f, -3.45f, 0.22f, -8.36f, 0.25f, -8.83f)
                lineToRelative(1.62f, -0.03f)
                curveToRelative(0.68f, 0f, 1.29f, 0.01f, 2.19f, -0.04f)
                curveToRelative(0.45f, -0.02f, 0.88f, -1.64f, 0.42f, -1.84f)
                curveToRelative(-0.21f, -0.09f, -1.7f, -0.17f, -2.3f, -0.18f)
                curveToRelative(-0.5f, -0.01f, -1.88f, -0.11f, -1.88f, -0.11f)
                reflectiveCurveToRelative(0.13f, -3.26f, 0.16f, -3.6f)
                curveToRelative(0.02f, -0.3f, -0.35f, -0.44f, -0.57f, -0.53f)
                arcToRelative(
                    7.77f,
                    7.77f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.53f,
                    -0.44f
                )
                curveToRelative(-0.76f, -0.15f, -1.1f, 0f, -1.17f, 0.64f)
                curveToRelative(-0.1f, 0.97f, -0.15f, 3.82f, -0.15f, 3.82f)
                curveToRelative(-0.56f, 0f, -2.47f, -0.11f, -3.02f, -0.11f)
                curveToRelative(-0.52f, 0f, -1.08f, 2.22f, -0.36f, 2.25f)
                lineToRelative(3.2f, 0.09f)
                lineToRelative(-0.03f, 6.53f)
                verticalLineToRelative(0.47f)
                curveToRelative(-0.53f, 2.73f, -2.37f, 4.2f, -2.37f, 4.2f)
                curveToRelative(0.4f, -1.8f, -0.42f, -3.15f, -1.87f, -4.3f)
                curveToRelative(-0.54f, -0.42f, -1.6f, -1.22f, -2.79f, -2.1f)
                curveToRelative(0f, 0f, 0.69f, -0.68f, 1.3f, -2.04f)
                curveToRelative(0.43f, -0.96f, 0.45f, -2.06f, -0.61f, -2.3f)
                curveToRelative(-1.75f, -0.41f, -3.2f, 0.87f, -3.63f, 2.25f)
                arcToRelative(
                    2.61f,
                    2.61f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.5f,
                    2.66f
                )
                lineToRelative(0.15f, 0.19f)
                curveToRelative(-0.4f, 0.76f, -0.94f, 1.78f, -1.4f, 2.58f)
                curveToRelative(-1.27f, 2.2f, -2.24f, 3.95f, -2.97f, 3.95f)
                curveToRelative(-0.58f, 0f, -0.57f, -1.77f, -0.57f, -3.43f)
                curveToRelative(0f, -1.43f, 0.1f, -3.58f, 0.19f, -5.8f)
                curveToRelative(0.03f, -0.74f, -0.34f, -1.16f, -0.96f, -1.54f)
                arcToRelative(
                    4.33f,
                    4.33f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.64f,
                    -0.69f
                )
                curveToRelative(-0.7f, 0f, -2.7f, 0.1f, -4.6f, 5.57f)
                curveToRelative(-0.23f, 0.69f, -0.7f, 1.94f, -0.7f, 1.94f)
                lineToRelative(0.04f, -6.57f)
                curveToRelative(0f, -0.16f, -0.08f, -0.3f, -0.27f, -0.4f)
                arcToRelative(
                    4.68f,
                    4.68f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -1.93f,
                    -0.54f
                )
                curveToRelative(-0.36f, 0f, -0.54f, 0.17f, -0.54f, 0.5f)
                lineToRelative(-0.07f, 10.3f)
                curveToRelative(0f, 0.78f, 0.02f, 1.69f, 0.1f, 2.09f)
                curveToRelative(0.08f, 0.4f, 0.2f, 0.72f, 0.36f, 0.91f)
                curveToRelative(0.15f, 0.2f, 0.33f, 0.34f, 0.62f, 0.4f)
                curveToRelative(0.28f, 0.06f, 1.78f, 0.25f, 1.86f, -0.32f)
                curveToRelative(0.1f, -0.69f, 0.1f, -1.43f, 0.89f, -4.2f)
                curveToRelative(1.22f, -4.31f, 2.82f, -6.42f, 3.58f, -7.16f)
                curveToRelative(0.13f, -0.14f, 0.28f, -0.14f, 0.27f, 0.07f)
                lineToRelative(-0.22f, 5.32f)
                curveToRelative(-0.2f, 5.37f, 0.78f, 6.36f, 2.17f, 6.36f)
                curveToRelative(1.07f, 0f, 2.58f, -1.06f, 4.2f, -3.74f)
                lineToRelative(2.7f, -4.5f)
                lineToRelative(1.58f, 1.46f)
                curveToRelative(1.28f, 1.2f, 1.7f, 2.36f, 1.42f, 3.45f)
                curveToRelative(-0.21f, 0.83f, -1.02f, 1.7f, -2.44f, 0.86f)
                curveToRelative(-0.42f, -0.25f, -0.6f, -0.44f, -1.01f, -0.71f)
                curveToRelative(-0.23f, -0.15f, -0.57f, -0.2f, -0.78f, -0.04f)
                curveToRelative(-0.53f, 0.4f, -0.84f, 0.92f, -1.01f, 1.55f)
                curveToRelative(-0.17f, 0.61f, 0.45f, 0.94f, 1.09f, 1.22f)
                curveToRelative(0.55f, 0.25f, 1.74f, 0.47f, 2.5f, 0.5f)
                curveToRelative(2.94f, 0.1f, 5.3f, -1.42f, 6.94f, -5.34f)
                curveToRelative(0.3f, 3.38f, 1.55f, 5.3f, 3.72f, 5.3f)
                curveToRelative(1.45f, 0f, 2.91f, -1.88f, 3.55f, -3.72f)
                curveToRelative(0.18f, 0.75f, 0.45f, 1.4f, 0.8f, 1.96f)
                curveToRelative(1.68f, 2.65f, 4.93f, 2.07f, 6.56f, -0.18f)
                curveToRelative(0.5f, -0.69f, 0.58f, -0.94f, 0.58f, -0.94f)
                arcToRelative(
                    3.07f,
                    3.07f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    2.94f,
                    2.87f
                )
                curveToRelative(1.1f, 0f, 2.23f, -0.52f, 3.03f, -2.31f)
                curveToRelative(0.09f, 0.2f, 0.2f, 0.38f, 0.3f, 0.56f)
                curveToRelative(1.68f, 2.65f, 4.93f, 2.07f, 6.56f, -0.18f)
                lineToRelative(0.2f, -0.28f)
                lineToRelative(0.05f, 1.4f)
                lineToRelative(-1.5f, 1.37f)
                curveToRelative(-2.52f, 2.3f, -4.44f, 4.05f, -4.58f, 6.09f)
                curveToRelative(-0.18f, 2.6f, 1.93f, 3.56f, 3.53f, 3.69f)
                arcToRelative(
                    4.5f,
                    4.5f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    4.04f,
                    -2.11f
                )
                curveToRelative(0.78f, -1.15f, 1.3f, -3.63f, 1.26f, -6.08f)
                lineToRelative(-0.06f, -3.56f)
                arcToRelative(
                    28.55f,
                    28.55f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    5.42f,
                    -9.44f
                )
                reflectiveCurveToRelative(0.93f, 0.01f, 1.92f, -0.05f)
                curveToRelative(0.32f, -0.02f, 0.41f, 0.04f, 0.35f, 0.27f)
                curveToRelative(-0.07f, 0.28f, -1.25f, 4.84f, -0.17f, 7.88f)
                curveToRelative(0.74f, 2.08f, 2.4f, 2.75f, 3.4f, 2.75f)
                curveToRelative(1.15f, 0f, 2.26f, -0.87f, 2.85f, -2.17f)
                lineToRelative(0.23f, 0.42f)
                curveToRelative(1.68f, 2.65f, 4.92f, 2.07f, 6.56f, -0.18f)
                curveToRelative(0.37f, -0.5f, 0.58f, -0.94f, 0.58f, -0.94f)
                curveToRelative(0.36f, 2.2f, 2.07f, 2.88f, 3.05f, 2.88f)
                curveToRelative(1.02f, 0f, 2f, -0.42f, 2.78f, -2.28f)
                curveToRelative(0.03f, 0.82f, 0.08f, 1.49f, 0.16f, 1.7f)
                curveToRelative(0.05f, 0.13f, 0.34f, 0.3f, 0.56f, 0.37f)
                curveToRelative(0.93f, 0.34f, 1.88f, 0.18f, 2.24f, 0.11f)
                curveToRelative(0.24f, -0.05f, 0.43f, -0.25f, 0.46f, -0.75f)
                curveToRelative(0.07f, -1.33f, 0.03f, -3.56f, 0.43f, -5.21f)
                curveToRelative(0.67f, -2.79f, 1.3f, -3.87f, 1.6f, -4.4f)
                curveToRelative(0.17f, -0.3f, 0.36f, -0.35f, 0.37f, -0.03f)
                curveToRelative(0.01f, 0.64f, 0.04f, 2.52f, 0.3f, 5.05f)
                curveToRelative(0.2f, 1.86f, 0.46f, 2.96f, 0.65f, 3.3f)
                curveToRelative(0.57f, 1f, 1.27f, 1.05f, 1.83f, 1.05f)
                curveToRelative(0.36f, 0f, 1.12f, -0.1f, 1.05f, -0.73f)
                curveToRelative(-0.03f, -0.31f, 0.02f, -2.22f, 0.7f, -4.96f)
                curveToRelative(0.43f, -1.79f, 1.15f, -3.4f, 1.41f, -4f)
                curveToRelative(0.1f, -0.21f, 0.15f, -0.04f, 0.15f, 0f)
                curveToRelative(-0.06f, 1.22f, -0.18f, 5.25f, 0.32f, 7.46f)
                curveToRelative(0.68f, 2.98f, 2.65f, 3.32f, 3.34f, 3.32f)
                curveToRelative(1.47f, 0f, 2.67f, -1.12f, 3.07f, -4.05f)
                curveToRelative(0.1f, -0.7f, -0.05f, -1.25f, -0.48f, -1.25f)
                close()
            }
        }.build()
    }
}

@Composable
fun arrowDown(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12f, 17.502f)
                arcToRelative(
                    1f,
                    1f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.707f,
                    -0.293f
                )
                lineToRelative(-9f, -9.004f)
                arcToRelative(
                    1f,
                    1f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    1.414f,
                    -1.414f
                )
                lineTo(12f, 15.087f)
                lineToRelative(8.293f, -8.296f)
                arcToRelative(
                    1f,
                    1f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    1.414f,
                    1.414f
                )
                lineToRelative(-9f, 9.004f)
                arcToRelative(
                    1f,
                    1f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.707f,
                    0.293f
                )
                close()
            }
        }.build()
    }
}

@Composable
fun addPostVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(2f, 12f)
                verticalLineToRelative(3.45f)
                curveToRelative(0f, 2.849f, 0.698f, 4.005f, 1.606f, 4.944f)
                curveToRelative(0.94f, 0.909f, 2.098f, 1.608f, 4.946f, 1.608f)
                horizontalLineToRelative(6.896f)
                curveToRelative(2.848f, 0f, 4.006f, -0.7f, 4.946f, -1.608f)
                curveTo(21.302f, 19.455f, 22f, 18.3f, 22f, 15.45f)
                verticalLineTo(8.552f)
                curveToRelative(0f, -2.849f, -0.698f, -4.006f, -1.606f, -4.945f)
                curveTo(19.454f, 2.7f, 18.296f, 2f, 15.448f, 2f)
                horizontalLineTo(8.552f)
                curveToRelative(-2.848f, 0f, -4.006f, 0.699f, -4.946f, 1.607f)
                curveTo(2.698f, 4.547f, 2f, 5.703f, 2f, 8.552f)
                close()
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(6.545f, 12.001f)
                lineTo(17.455f, 12.001f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.003f, 6.545f)
                lineTo(12.003f, 17.455f)
            }
        }.build()
    }
}

@Composable
fun loveVector(contentFavorite: Boolean = false): ImageVector = if (contentFavorite) remember {
    ImageVector.Builder(
        name = "vector",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 48f,
        viewportHeight = 48f,
    ).apply {
        path(
            fill = SolidColor(Color(0xFFFF3040)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(34.6f, 3.1f)
            curveToRelative(-4.5f, 0f, -7.9f, 1.8f, -10.6f, 5.6f)
            curveToRelative(-2.7f, -3.7f, -6.1f, -5.5f, -10.6f, -5.5f)
            curveTo(6f, 3.1f, 0f, 9.6f, 0f, 17.6f)
            curveToRelative(0f, 7.3f, 5.4f, 12f, 10.6f, 16.5f)
            curveToRelative(0.6f, 0.5f, 1.3f, 1.1f, 1.9f, 1.7f)
            lineToRelative(2.3f, 2f)
            curveToRelative(4.4f, 3.9f, 6.6f, 5.9f, 7.6f, 6.5f)
            curveToRelative(0.5f, 0.3f, 1.1f, 0.5f, 1.6f, 0.5f)
            reflectiveCurveToRelative(1.1f, -0.2f, 1.6f, -0.5f)
            curveToRelative(1f, -0.6f, 2.8f, -2.2f, 7.8f, -6.8f)
            lineToRelative(2f, -1.8f)
            curveToRelative(0.7f, -0.6f, 1.3f, -1.2f, 2f, -1.7f)
            curveTo(42.7f, 29.6f, 48f, 25f, 48f, 17.6f)
            curveToRelative(0f, -8f, -6f, -14.5f, -13.4f, -14.5f)
            close()
        }
    }.build()
} else remember {
    ImageVector.Builder(
        name = "vector",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFF5F5F5)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(16.792f, 3.904f)
            arcTo(
                4.989f,
                4.989f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                21.5f,
                9.122f
            )
            curveToRelative(0f, 3.072f, -2.652f, 4.959f, -5.197f, 7.222f)
            curveToRelative(-2.512f, 2.243f, -3.865f, 3.469f, -4.303f, 3.752f)
            curveToRelative(-0.477f, -0.309f, -2.143f, -1.823f, -4.303f, -3.752f)
            curveTo(5.141f, 14.072f, 2.5f, 12.167f, 2.5f, 9.122f)
            arcToRelative(
                4.989f,
                4.989f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                4.708f,
                -5.218f
            )
            arcToRelative(
                4.21f,
                4.21f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                3.675f,
                1.941f
            )
            curveToRelative(0.84f, 1.175f, 0.98f, 1.763f, 1.12f, 1.763f)
            reflectiveCurveToRelative(0.278f, -0.588f, 1.11f, -1.766f)
            arcToRelative(
                4.17f,
                4.17f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                3.679f,
                -1.938f
            )
            moveToRelative(0f, -2f)
            arcToRelative(
                6.04f,
                6.04f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                -4.797f,
                2.127f
            )
            arcToRelative(
                6.052f,
                6.052f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                -4.787f,
                -2.127f
            )
            arcTo(
                6.985f,
                6.985f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                0.5f,
                9.122f
            )
            curveToRelative(0f, 3.61f, 2.55f, 5.827f, 5.015f, 7.97f)
            curveToRelative(0.283f, 0.246f, 0.569f, 0.494f, 0.853f, 0.747f)
            lineToRelative(1.027f, 0.918f)
            arcToRelative(
                44.998f,
                44.998f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                3.518f,
                3.018f
            )
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.174f, 0f)
            arcToRelative(
                45.263f,
                45.263f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                3.626f,
                -3.115f
            )
            lineToRelative(0.922f, -0.824f)
            curveToRelative(0.293f, -0.26f, 0.59f, -0.519f, 0.885f, -0.774f)
            curveToRelative(2.334f, -2.025f, 4.98f, -4.32f, 4.98f, -7.94f)
            arcToRelative(
                6.985f,
                6.985f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = false,
                -6.708f,
                -7.218f
            )
            close()
        }
    }.build()
}


@Composable
fun messengerVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.739f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 10f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.003f, 2.001f)
                arcToRelative(
                    9.705f,
                    9.705f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    0f,
                    19.4f
                )
                arcToRelative(
                    10.876f,
                    10.876f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -2.895f,
                    -0.384f
                )
                arcToRelative(
                    0.798f,
                    0.798f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.533f,
                    0.04f
                )
                lineToRelative(-1.984f, 0.876f)
                arcToRelative(
                    0.801f,
                    0.801f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -1.123f,
                    -0.708f
                )
                lineToRelative(-0.054f, -1.78f)
                arcToRelative(
                    0.806f,
                    0.806f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.27f,
                    -0.569f
                )
                arcToRelative(
                    9.49f,
                    9.49f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -3.14f,
                    -7.175f
                )
                arcToRelative(
                    9.65f,
                    9.65f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    10f,
                    -9.7f
                )
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(17.79f, 10.132f)
                arcToRelative(
                    0.659f,
                    0.659f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.962f,
                    -0.873f
                )
                lineToRelative(-2.556f, 2.05f)
                arcToRelative(
                    0.63f,
                    0.63f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -0.758f,
                    0.002f
                )
                lineTo(11.06f, 9.47f)
                arcToRelative(
                    1.576f,
                    1.576f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -2.277f,
                    0.42f
                )
                lineToRelative(-2.567f, 3.98f)
                arcToRelative(
                    0.659f,
                    0.659f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    0.961f,
                    0.875f
                )
                lineToRelative(2.556f, -2.049f)
                arcToRelative(
                    0.63f,
                    0.63f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    0.759f,
                    -0.002f
                )
                lineToRelative(2.452f, 1.84f)
                arcToRelative(
                    1.576f,
                    1.576f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    2.278f,
                    -0.42f
                )
                close()
            }
        }.build()
    }
}

@Composable
fun addRoundedVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0095F6)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.001f, 0.504f)
                arcToRelative(
                    11.5f,
                    11.5f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    11.5f,
                    11.5f
                )
                arcToRelative(
                    11.513f,
                    11.513f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -11.5f,
                    -11.5f
                )
                close()
                moveToRelative(5f, 12.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2f, 0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = true, isPositiveArc = true, 2f, 0f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2f)
                close()
            }
        }.build()
    }
}

@Composable
fun moreOptionVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(7.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.5f, 12f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFF5F5F5)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(19.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19.5f, 12f)
                close()
            }
        }.build()
    }
}

@Composable
fun moreVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 48.dp,
            defaultHeight = 48.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(479.858f, -160f)
                quadTo(460f, -160f, 446f, -174.142f)
                quadToRelative(-14f, -14.141f, -14f, -34f)
                quadTo(432f, -228f, 446.142f, -242f)
                quadToRelative(14.141f, -14f, 34f, -14f)
                quadTo(500f, -256f, 514f, -241.858f)
                quadToRelative(14f, 14.141f, 14f, 34f)
                quadTo(528f, -188f, 513.858f, -174f)
                quadToRelative(-14.141f, 14f, -34f, 14f)
                close()
                moveToRelative(0f, -272f)
                quadTo(460f, -432f, 446f, -446.142f)
                quadToRelative(-14f, -14.141f, -14f, -34f)
                quadTo(432f, -500f, 446.142f, -514f)
                quadToRelative(14.141f, -14f, 34f, -14f)
                quadTo(500f, -528f, 514f, -513.858f)
                quadToRelative(14f, 14.141f, 14f, 34f)
                quadTo(528f, -460f, 513.858f, -446f)
                quadToRelative(-14.141f, 14f, -34f, 14f)
                close()
                moveToRelative(0f, -272f)
                quadTo(460f, -704f, 446f, -718.142f)
                quadToRelative(-14f, -14.141f, -14f, -34f)
                quadTo(432f, -772f, 446.142f, -786f)
                quadToRelative(14.141f, -14f, 34f, -14f)
                quadTo(500f, -800f, 514f, -785.858f)
                quadToRelative(14f, 14.141f, 14f, 34f)
                quadTo(528f, -732f, 513.858f, -718f)
                quadToRelative(-14.141f, 14f, -34f, 14f)
                close()
            }
        }.build()
    }
}

@Composable
fun verifiedVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 40f,
            viewportHeight = 40f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF0095F6)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(19.998f, 3.094f)
                lineTo(14.638f, 0f)
                lineToRelative(-2.972f, 5.15f)
                horizontalLineTo(5.432f)
                verticalLineToRelative(6.354f)
                lineTo(0f, 14.64f)
                lineTo(3.094f, 20f)
                lineTo(0f, 25.359f)
                lineToRelative(5.432f, 3.137f)
                verticalLineToRelative(5.905f)
                horizontalLineToRelative(5.975f)
                lineTo(14.638f, 40f)
                lineToRelative(5.36f, -3.094f)
                lineTo(25.358f, 40f)
                lineToRelative(3.232f, -5.6f)
                horizontalLineToRelative(6.162f)
                verticalLineToRelative(-6.01f)
                lineTo(40f, 25.359f)
                lineTo(36.905f, 20f)
                lineTo(40f, 14.641f)
                lineToRelative(-5.248f, -3.03f)
                verticalLineToRelative(-6.46f)
                horizontalLineToRelative(-6.419f)
                lineTo(25.358f, 0f)
                lineToRelative(-5.36f, 3.094f)
                close()
                moveToRelative(7.415f, 11.225f)
                lineToRelative(2.254f, 2.287f)
                lineToRelative(-11.43f, 11.5f)
                lineToRelative(-6.835f, -6.93f)
                lineToRelative(2.244f, -2.258f)
                lineToRelative(4.587f, 4.581f)
                lineToRelative(9.18f, -9.18f)
                close()
            }
        }.build()
    }
}

@Composable
fun commentVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(20.656f, 17.008f)
                arcToRelative(
                    9.993f,
                    9.993f,
                    0f,
                    isMoreThanHalf = true,
                    isPositiveArc = false,
                    -3.59f,
                    3.615f
                )
                lineTo(22f, 22f)
                close()
            }
        }.build()
    }
}

@Composable
fun postCommentVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(22f, 3f)
                lineTo(9.218f, 10.083f)
            }
            path(
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(11.698f, 20.334f)
                lineTo(22f, 3.001f)
                lineTo(2f, 3.001f)
                lineTo(9.218f, 10.084f)
                lineTo(11.698f, 20.334f)
                close()
            }
        }.build()
    }
}

@Composable
fun saveVector(saveContent: Boolean): ImageVector = if (saveContent) remember {
    ImageVector.Builder(
        name = "vector",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = SolidColor(Color(0xFFF5F5F5)),
            fillAlpha = 1.0f,
            stroke = null,
            strokeAlpha = 1.0f,
            strokeLineWidth = 1.0f,
            strokeLineCap = StrokeCap.Butt,
            strokeLineJoin = StrokeJoin.Miter,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 22f)
            arcToRelative(
                0.999f,
                0.999f,
                0f,
                isMoreThanHalf = false,
                isPositiveArc = true,
                -0.687f,
                -0.273f
            )
            lineTo(12f, 14.815f)
            lineToRelative(-7.313f, 6.912f)
            arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 21f)
            verticalLineTo(3f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
            horizontalLineToRelative(16f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
            verticalLineToRelative(18f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            close()
        }
    }.build()
} else remember {
    ImageVector.Builder(
        name = "vector",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = null,
            fillAlpha = 1.0f,
            stroke = SolidColor(Color(0xFF000000)),
            strokeAlpha = 1.0f,
            strokeLineWidth = 2f,
            strokeLineCap = StrokeCap.Round,
            strokeLineJoin = StrokeJoin.Round,
            strokeLineMiter = 1.0f,
            pathFillType = PathFillType.NonZero
        ) {
            moveTo(20f, 21f)
            lineTo(12f, 13.44f)
            lineTo(4f, 21f)
            lineTo(4f, 3f)
            lineTo(20f, 3f)
            lineTo(20f, 21f)
            close()
        }
    }.build()
}
