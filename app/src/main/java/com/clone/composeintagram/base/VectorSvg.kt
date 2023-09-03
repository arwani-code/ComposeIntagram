package com.clone.composeintagram.base

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
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
                    8.13f, 8.13f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.33f, -4.58f
                )
                curveToRelative(0.07f, -2.06f, 0.06f, -5.33f, 0.07f, -7.19f)
                curveToRelative(0f, -1.7f, 0.03f, -6.71f, -0.03f, -9.72f)
                curveToRelative(-0.02f, -0.74f, -2.07f, -1.51f, -3.03f, -1.1f)
                close()
                moveToRelative(82.13f, 14.48f)
                arcToRelative(
                    9.42f, 9.42f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 3.75f
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
                    10.56f, 10.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.88f, 3.77f
                )
                curveToRelative(-0.85f, 1.72f, -2.64f, 2.25f, -3.39f, -0.22f)
                curveToRelative(-0.5f, -1.69f, -0.38f, -3.87f, -0.13f, -5.25f)
                curveToRelative(0.33f, -1.78f, 1.12f, -3.44f, 2.53f, -3.44f)
                curveToRelative(1.38f, 0f, 2.06f, 1.5f, 1.87f, 5.14f)
                close()
                moveToRelative(-13.41f, -0.02f)
                arcToRelative(
                    9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.87f, 3.8f
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
                    29.65f, 29.65f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.08f, 7.14f
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
                    9.54f, 9.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.8f, -0.37f
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
                    3.71f, 3.71f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.83f, -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.94f, -0.05f, -4.07f, 1.53f)
                arcToRelative(
                    9.31f, 9.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 4.73f
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
                    22.22f, 22.22f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.4f, 7.23f
                )
                verticalLineToRelative(-0.7f)
                curveToRelative(-0.01f, -3.36f, 0.03f, -6f, 0.05f, -6.95f)
                curveToRelative(0.02f, -0.94f, 0.06f, -1.63f, 0.06f, -1.8f)
                curveToRelative(0f, -0.36f, -0.22f, -0.5f, -0.66f, -0.67f)
                curveToRelative(-0.4f, -0.16f, -0.86f, -0.26f, -1.34f, -0.3f)
                curveToRelative(-0.6f, -0.05f, -0.97f, 0.27f, -0.96f, 0.65f)
                verticalLineToRelative(0.52f)
                arcToRelative(
                    3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.94f, -0.05f, -4.07f, 1.53f)
                arcToRelative(
                    10.1f, 10.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.66f, 4.72f
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
                    3.7f, 3.7f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.84f, -1.49f
                )
                curveToRelative(-1.44f, -0.43f, -2.93f, -0.04f, -4.07f, 1.53f)
                curveToRelative(-0.75f, 1.03f, -1.35f, 2.17f, -1.66f, 4.7f)
                arcToRelative(
                    15.8f, 15.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.12f, 2.04f
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
                    7.77f, 7.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.53f, -0.44f
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
                    2.61f, 2.61f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 2.66f
                )
                lineToRelative(0.15f, 0.19f)
                curveToRelative(-0.4f, 0.76f, -0.94f, 1.78f, -1.4f, 2.58f)
                curveToRelative(-1.27f, 2.2f, -2.24f, 3.95f, -2.97f, 3.95f)
                curveToRelative(-0.58f, 0f, -0.57f, -1.77f, -0.57f, -3.43f)
                curveToRelative(0f, -1.43f, 0.1f, -3.58f, 0.19f, -5.8f)
                curveToRelative(0.03f, -0.74f, -0.34f, -1.16f, -0.96f, -1.54f)
                arcToRelative(
                    4.33f, 4.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.64f, -0.69f
                )
                curveToRelative(-0.7f, 0f, -2.7f, 0.1f, -4.6f, 5.57f)
                curveToRelative(-0.23f, 0.69f, -0.7f, 1.94f, -0.7f, 1.94f)
                lineToRelative(0.04f, -6.57f)
                curveToRelative(0f, -0.16f, -0.08f, -0.3f, -0.27f, -0.4f)
                arcToRelative(
                    4.68f, 4.68f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.93f, -0.54f
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
                    3.07f, 3.07f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.94f, 2.87f
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
                    4.5f, 4.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.04f, -2.11f
                )
                curveToRelative(0.78f, -1.15f, 1.3f, -3.63f, 1.26f, -6.08f)
                lineToRelative(-0.06f, -3.56f)
                arcToRelative(
                    28.55f, 28.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5.42f, -9.44f
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
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.707f, -0.293f
                )
                lineToRelative(-9f, -9.004f)
                arcToRelative(
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, -1.414f
                )
                lineTo(12f, 15.087f)
                lineToRelative(8.293f, -8.296f)
                arcToRelative(
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.414f, 1.414f
                )
                lineToRelative(-9f, 9.004f)
                arcToRelative(
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.707f, 0.293f
                )
                close()
            }
        }.build()
    }
}

fun addPostVector(selected: Boolean = false): ImageVector = if (selected) ImageVector.Builder(
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
        moveTo(12.003f, 5.545f)
        lineToRelative(-0.117f, 0.006f)
        lineToRelative(-0.112f, 0.02f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.764f, 0.857f)
        lineToRelative(-0.007f, 0.117f)
        verticalLineTo(11f)
        horizontalLineTo(6.544f)
        lineToRelative(-0.116f, 0.007f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.877f, 0.876f)
        lineTo(5.545f, 12f)
        lineToRelative(0.007f, 0.117f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.877f, 0.876f)
        lineToRelative(0.116f, 0.007f)
        horizontalLineToRelative(4.457f)
        lineToRelative(0.001f, 4.454f)
        lineToRelative(0.007f, 0.116f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.876f, 0.877f)
        lineToRelative(0.117f, 0.007f)
        lineToRelative(0.117f, -0.007f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.876f, -0.877f)
        lineToRelative(0.007f, -0.116f)
        verticalLineTo(13f)
        horizontalLineToRelative(4.452f)
        lineToRelative(0.116f, -0.007f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.877f, -0.876f)
        lineToRelative(0.007f, -0.117f)
        lineToRelative(-0.007f, -0.117f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.877f, -0.876f)
        lineTo(17.455f, 11f)
        horizontalLineToRelative(-4.453f)
        lineToRelative(0.001f, -4.455f)
        lineToRelative(-0.007f, -0.117f)
        arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.876f, -0.877f)
        close()
        moveTo(8.552f, 0.999f)
        horizontalLineToRelative(6.896f)
        curveToRelative(2.754f, 0f, 4.285f, 0.579f, 5.664f, 1.912f)
        curveToRelative(1.255f, 1.297f, 1.838f, 2.758f, 1.885f, 5.302f)
        lineTo(23f, 8.55f)
        verticalLineToRelative(6.898f)
        curveToRelative(0f, 2.755f, -0.578f, 4.286f, -1.912f, 5.664f)
        curveToRelative(-1.298f, 1.255f, -2.759f, 1.838f, -5.302f, 1.885f)
        lineToRelative(-0.338f, 0.003f)
        horizontalLineTo(8.552f)
        curveToRelative(-2.754f, 0f, -4.285f, -0.579f, -5.664f, -1.912f)
        curveToRelative(-1.255f, -1.297f, -1.839f, -2.758f, -1.885f, -5.302f)
        lineTo(1f, 15.45f)
        verticalLineTo(8.551f)
        curveToRelative(0f, -2.754f, 0.579f, -4.286f, 1.912f, -5.664f)
        curveTo(4.21f, 1.633f, 5.67f, 1.05f, 8.214f, 1.002f)
        lineTo(8.552f, 1f)
        close()
    }
}.build() else ImageVector.Builder(
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

fun rememberVectorSearch(): ImageVector = ImageVector.Builder(
    name = "vector",
    defaultWidth = 16.dp,
    defaultHeight = 16.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
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
        moveTo(20.53f, 19.46f)
        lineToRelative(-4.4f, -4.4f)
        arcToRelative(
            7.33f, 7.33f, 0f, isMoreThanHalf = true, isPositiveArc = false, -1.07f, 1.06f
        )
        lineToRelative(4.41f, 4.41f)
        arcToRelative(
            0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.06f, 0f
        )
        arcToRelative(
            0.77f, 0.77f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -1.07f
        )
        close()
        moveToRelative(-15.78f, -9f)
        arcToRelative(
            5.75f, 5.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 5.75f, 5.75f
        )
        arcToRelative(
            5.76f, 5.76f, 0f, isMoreThanHalf = false, isPositiveArc = true, -5.75f, -5.72f
        )
        verticalLineToRelative(-0.03f)
        close()
    }
}.build()

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
                4.989f, 4.989f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21.5f, 9.122f
            )
            curveToRelative(0f, 3.072f, -2.652f, 4.959f, -5.197f, 7.222f)
            curveToRelative(-2.512f, 2.243f, -3.865f, 3.469f, -4.303f, 3.752f)
            curveToRelative(-0.477f, -0.309f, -2.143f, -1.823f, -4.303f, -3.752f)
            curveTo(5.141f, 14.072f, 2.5f, 12.167f, 2.5f, 9.122f)
            arcToRelative(
                4.989f, 4.989f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.708f, -5.218f
            )
            arcToRelative(
                4.21f, 4.21f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.675f, 1.941f
            )
            curveToRelative(0.84f, 1.175f, 0.98f, 1.763f, 1.12f, 1.763f)
            reflectiveCurveToRelative(0.278f, -0.588f, 1.11f, -1.766f)
            arcToRelative(
                4.17f, 4.17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.679f, -1.938f
            )
            moveToRelative(0f, -2f)
            arcToRelative(
                6.04f, 6.04f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.797f, 2.127f
            )
            arcToRelative(
                6.052f, 6.052f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.787f, -2.127f
            )
            arcTo(
                6.985f, 6.985f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.5f, 9.122f
            )
            curveToRelative(0f, 3.61f, 2.55f, 5.827f, 5.015f, 7.97f)
            curveToRelative(0.283f, 0.246f, 0.569f, 0.494f, 0.853f, 0.747f)
            lineToRelative(1.027f, 0.918f)
            arcToRelative(
                44.998f, 44.998f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.518f, 3.018f
            )
            arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.174f, 0f)
            arcToRelative(
                45.263f, 45.263f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.626f, -3.115f
            )
            lineToRelative(0.922f, -0.824f)
            curveToRelative(0.293f, -0.26f, 0.59f, -0.519f, 0.885f, -0.774f)
            curveToRelative(2.334f, -2.025f, 4.98f, -4.32f, 4.98f, -7.94f)
            arcToRelative(
                6.985f, 6.985f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.708f, -7.218f
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
                    9.705f, 9.705f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 19.4f
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
                    9.49f, 9.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3.14f, -7.175f
                )
                arcToRelative(
                    9.65f, 9.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, -9.7f
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
                    0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.758f, 0.002f
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
                    0.63f, 0.63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.759f, -0.002f
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
                    11.5f, 11.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 11.5f, 11.5f
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
fun moreVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF2E3137)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(13.48f, 5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 0f)
                close()
                moveToRelative(-1.5f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                close()
                moveToRelative(0f, 7f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
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
                    9.993f, 9.993f, 0f, isMoreThanHalf = true, isPositiveArc = false, -3.59f, 3.615f
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
                0.999f, 0.999f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.687f, -0.273f
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


@Composable
fun cameraVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 16.dp,
            defaultHeight = 16.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
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
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(15f, 12f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, -1f)
                horizontalLineToRelative(1.172f)
                arcToRelative(
                    3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -0.879f
                )
                lineToRelative(0.83f, -0.828f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.827f, 3f)
                horizontalLineToRelative(2.344f)
                arcToRelative(
                    1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.707f, 0.293f
                )
                lineToRelative(0.828f, 0.828f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.828f, 5f)
                horizontalLineTo(14f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 1f)
                verticalLineToRelative(6f)
                close()
                moveTo(2f, 4f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, -2f)
                verticalLineTo(6f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                horizontalLineToRelative(-1.172f)
                arcToRelative(
                    2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.414f, -0.586f
                )
                lineToRelative(-0.828f, -0.828f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.172f, 2f)
                horizontalLineTo(6.828f)
                arcToRelative(
                    2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -1.414f, 0.586f
                )
                lineToRelative(-0.828f, 0.828f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.172f, 4f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(8f, 11f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -5f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 5f)
                close()
                moveToRelative(0f, 1f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 7f)
                close()
                moveTo(3f, 6.5f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 0f)
                close()
            }
        }.build()
    }
}


@Composable
fun rememberShareVector(): ImageVector {
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
fun audioVector(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(21.002f, 16.972f)
                verticalLineTo(2.044f)
                arcToRelative(
                    0.999f,
                    0.999f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.36f,
                    -0.769f
                )
                arcToRelative(
                    1.012f,
                    1.012f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -0.823f,
                    -0.214f
                )
                lineTo(6.816f, 3.479f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 4.462f)
                verticalLineToRelative(10.864f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 19f)
                verticalLineTo(9.56f)
                lineToRelative(9.003f, -1.675f)
                verticalLineToRelative(5.442f)
                arcTo(3.75f, 3.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 21.005f, 17f)
                curveToRelative(0f, -0.01f, -0.003f, -0.02f, -0.003f, -0.029f)
                close()
            }
        }.build()
    }
}

@Composable
fun vectorLocation(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 12.dp,
            defaultHeight = 12.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF)),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1.0f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(12.053f, 1f)
                arcToRelative(
                    8.684f,
                    8.684f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    -8.708f,
                    8.66f
                )
                curveToRelative(0f, 5.699f, 6.14f, 11.495f, 8.108f, 13.123f)
                arcToRelative(
                    0.939f, 0.939f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.2f, 0f
                )
                curveToRelative(1.969f, -1.628f, 8.109f, -7.424f, 8.109f, -13.123f)
                arcTo(
                    8.684f, 8.684f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12.053f, 1f
                )
                close()
                moveToRelative(0f, 10.313f)
                arcToRelative(
                    1.604f, 1.604f, 0f, isMoreThanHalf = true, isPositiveArc = true, 1.604f, -1.604f
                )
                arcToRelative(
                    1.604f,
                    1.604f,
                    0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    -1.604f,
                    1.604f
                )
                close()
            }
        }.build()
    }
}

@Composable
fun rememberVectorMenu(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
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
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(5f, 6.75f)
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f
                )
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 1.5f
                )
                close()
                moveToRelative(14f, 4.5f)
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, 1.5f
                )
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = false, 0f, -1.5f
                )
                close()
                moveToRelative(-14f, 6f)
                horizontalLineToRelative(14f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, 1.5f
                )
                horizontalLineTo(5f)
                arcToRelative(
                    0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, 0f, -1.5f
                )
                close()
            }
        }.build()
    }
}

@Composable
fun threadsLogo(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 15.dp,
            defaultHeight = 15.dp,
            viewportWidth = 192f,
            viewportHeight = 192f
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
                moveTo(141.537f, 88.9883f)
                curveTo(140.71f, 88.5919f, 139.87f, 88.2104f, 139.019f, 87.8451f)
                curveTo(137.537f, 60.5382f, 122.616f, 44.905f, 97.5619f, 44.745f)
                curveTo(97.4484f, 44.7443f, 97.3355f, 44.7443f, 97.222f, 44.7443f)
                curveTo(82.2364f, 44.7443f, 69.7731f, 51.1409f, 62.102f, 62.7807f)
                lineTo(75.881f, 72.2328f)
                curveTo(81.6116f, 63.5383f, 90.6052f, 61.6848f, 97.2286f, 61.6848f)
                curveTo(97.3051f, 61.6848f, 97.3819f, 61.6848f, 97.4576f, 61.6855f)
                curveTo(105.707f, 61.7381f, 111.932f, 64.1366f, 115.961f, 68.814f)
                curveTo(118.893f, 72.2193f, 120.854f, 76.925f, 121.825f, 82.8638f)
                curveTo(114.511f, 81.6207f, 106.601f, 81.2385f, 98.145f, 81.7233f)
                curveTo(74.3247f, 83.0954f, 59.0111f, 96.9879f, 60.0396f, 116.292f)
                curveTo(60.5615f, 126.084f, 65.4397f, 134.508f, 73.775f, 140.011f)
                curveTo(80.8224f, 144.663f, 89.899f, 146.938f, 99.3323f, 146.423f)
                curveTo(111.79f, 145.74f, 121.563f, 140.987f, 128.381f, 132.296f)
                curveTo(133.559f, 125.696f, 136.834f, 117.143f, 138.28f, 106.366f)
                curveTo(144.217f, 109.949f, 148.617f, 114.664f, 151.047f, 120.332f)
                curveTo(155.179f, 129.967f, 155.42f, 145.8f, 142.501f, 158.708f)
                curveTo(131.182f, 170.016f, 117.576f, 174.908f, 97.0135f, 175.059f)
                curveTo(74.2042f, 174.89f, 56.9538f, 167.575f, 45.7381f, 153.317f)
                curveTo(35.2355f, 139.966f, 29.8077f, 120.682f, 29.6052f, 96f)
                curveTo(29.8077f, 71.3178f, 35.2355f, 52.0336f, 45.7381f, 38.6827f)
                curveTo(56.9538f, 24.4249f, 74.2039f, 17.11f, 97.0132f, 16.9405f)
                curveTo(119.988f, 17.1113f, 137.539f, 24.4614f, 149.184f, 38.788f)
                curveTo(154.894f, 45.8136f, 159.199f, 54.6488f, 162.037f, 64.9503f)
                lineTo(178.184f, 60.6422f)
                curveTo(174.744f, 47.9622f, 169.331f, 37.0357f, 161.965f, 27.974f)
                curveTo(147.036f, 9.6067f, 125.202f, 0.1951f, 97.0695f, 0f)
                horizontalLineTo(96.9569f)
                curveTo(68.8816f, 0.1945f, 47.2921f, 9.6418f, 32.7883f, 28.0793f)
                curveTo(19.8819f, 44.4864f, 13.2244f, 67.3157f, 13.0007f, 95.9325f)
                lineTo(13f, 96f)
                lineTo(13.0007f, 96.0675f)
                curveTo(13.2244f, 124.684f, 19.8819f, 147.514f, 32.7883f, 163.921f)
                curveTo(47.2921f, 182.358f, 68.8816f, 191.806f, 96.9569f, 192f)
                horizontalLineTo(97.0695f)
                curveTo(122.03f, 191.827f, 139.624f, 185.292f, 154.118f, 170.811f)
                curveTo(173.081f, 151.866f, 172.51f, 128.119f, 166.26f, 113.541f)
                curveTo(161.776f, 103.087f, 153.227f, 94.5962f, 141.537f, 88.9883f)
                close()
                moveTo(98.4405f, 129.507f)
                curveTo(88.0005f, 130.095f, 77.1544f, 125.409f, 76.6196f, 115.372f)
                curveTo(76.2232f, 107.93f, 81.9158f, 99.626f, 99.0812f, 98.6368f)
                curveTo(101.047f, 98.5234f, 102.976f, 98.468f, 104.871f, 98.468f)
                curveTo(111.106f, 98.468f, 116.939f, 99.0737f, 122.242f, 100.233f)
                curveTo(120.264f, 124.935f, 108.662f, 128.946f, 98.4405f, 129.507f)
                close()
            }
        }.build()
    }
}

@Composable
fun addPeople(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "vector",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 48f,
            viewportHeight = 48f
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
                moveTo(32f, 25.5f)
                curveToRelative(5.2f, 0f, 9.5f, -4.3f, 9.5f, -9.5f)
                reflectiveCurveTo(37.2f, 6.5f, 32f, 6.5f)
                reflectiveCurveToRelative(-9.5f, 4.3f, -9.5f, 9.5f)
                reflectiveCurveToRelative(4.3f, 9.5f, 9.5f, 9.5f)
                close()
                moveToRelative(0f, -16f)
                curveToRelative(3.6f, 0f, 6.5f, 2.9f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.9f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.9f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.9f, -6.5f, 6.5f, -6.5f)
                close()
                moveToRelative(5.5f, 19f)
                horizontalLineToRelative(-11f)
                curveToRelative(-5.5f, 0f, -10f, 4.5f, -10f, 10f)
                verticalLineTo(40f)
                curveToRelative(0f, 0.8f, 0.7f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.9f, 3.1f, -7f, 7f, -7f)
                horizontalLineToRelative(11f)
                curveToRelative(3.9f, 0f, 7f, 3.1f, 7f, 7f)
                verticalLineTo(40f)
                curveToRelative(0f, 0.8f, 0.7f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -5.5f, -4.5f, -10f, -10f, -10f)
                close()
                moveToRelative(-20f, -4.5f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(17f)
                curveToRelative(0f, -0.8f, -0.7f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.7f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineTo(2f)
                curveToRelative(-0.8f, 0f, -1.5f, 0.7f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.7f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(31f)
                curveToRelative(0f, 0.8f, 0.7f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.7f, 1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(16f)
                curveToRelative(0.8f, 0f, 1.5f, -0.7f, 1.5f, -1.5f)
                close()
            }
        }.build()
    }
}

fun homeIcon(selected: Boolean): ImageVector = if (selected) {
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
            moveTo(22f, 23f)
            horizontalLineToRelative(-6.001f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            verticalLineToRelative(-5.455f)
            arcToRelative(
                2.997f, 2.997f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5.993f, 0f
            )
            verticalLineTo(22f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            horizontalLineTo(2f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, -1f)
            verticalLineTo(11.543f)
            arcToRelative(
                1.002f, 1.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.31f, -0.724f
            )
            lineToRelative(10f, -9.543f)
            arcToRelative(
                1.001f, 1.001f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.38f, 0f
            )
            lineToRelative(10f, 9.543f)
            arcToRelative(
                1.002f, 1.002f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.31f, 0.724f
            )
            verticalLineTo(22f)
            arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1f, 1f)
            close()
        }
    }.build()
} else {
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
            moveTo(9.005f, 16.545f)
            arcToRelative(
                2.997f, 2.997f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.997f, -2.997f
            )
            arcTo(2.997f, 2.997f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 16.545f)
            verticalLineTo(22f)
            horizontalLineToRelative(7f)
            verticalLineTo(11.543f)
            lineTo(12f, 2f)
            lineTo(2f, 11.543f)
            verticalLineTo(22f)
            horizontalLineToRelative(7.005f)
            close()
        }
    }.build()
}

fun bottomIconSearch(selected: Boolean): ImageVector = if (selected) ImageVector.Builder(
    name = "vector",
    defaultWidth = 24.dp,
    defaultHeight = 24.dp,
    viewportWidth = 24f,
    viewportHeight = 24f
).apply {
    path(
        fill = null,
        fillAlpha = 2.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 10f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
        strokeLineMiter = 1.0f,
        pathFillType = PathFillType.NonZero
    ) {
        moveTo(18.5f, 10.5f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = true, isPositiveArc = true, -8f, -8f)
        arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8f, 8f)
        close()
    }
    path(
        fill = null,
        fillAlpha = 2.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 10f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
        strokeLineMiter = 1.0f,
        pathFillType = PathFillType.NonZero
    ) {
        moveTo(16.511f, 16.511f)
        lineTo(21.643f, 21.643f)
    }
}.build() else ImageVector.Builder(
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
        moveTo(19f, 10.5f)
        arcTo(8.5f, 8.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 10.5f, 2f)
        arcToRelative(8.5f, 8.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 8.5f)
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
        moveTo(16.511f, 16.511f)
        lineTo(22f, 22f)
    }
}.build()

fun reelsBottomIcon(selected: Boolean): ImageVector = if (selected) ImageVector.Builder(
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
        pathFillType = PathFillType.EvenOdd
    ) {
        moveTo(12.823f, 1f)
        lineToRelative(2.974f, 5.002f)
        horizontalLineToRelative(-5.58f)
        lineToRelative(-2.65f, -4.971f)
        curveToRelative(0.206f, -0.013f, 0.419f, -0.022f, 0.642f, -0.027f)
        lineTo(8.55f, 1f)
        close()
        moveToRelative(2.327f, 0f)
        horizontalLineToRelative(0.298f)
        curveToRelative(3.06f, 0f, 4.468f, 0.754f, 5.64f, 1.887f)
        arcToRelative(
            6.007f,
            6.007f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            1.596f,
            2.82f
        )
        lineToRelative(0.07f, 0.295f)
        horizontalLineToRelative(-4.629f)
        lineTo(15.15f, 1f)
        close()
        moveToRelative(-9.667f, 0.377f)
        lineTo(7.95f, 6.002f)
        horizontalLineTo(1.244f)
        arcToRelative(
            6.01f,
            6.01f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            3.942f,
            -4.53f
        )
        close()
        moveToRelative(9.735f, 12.834f)
        lineToRelative(-4.545f, -2.624f)
        arcToRelative(
            0.909f,
            0.909f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            -1.356f,
            0.668f
        )
        lineToRelative(-0.008f, 0.12f)
        verticalLineToRelative(5.248f)
        arcToRelative(
            0.91f,
            0.91f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            1.255f,
            0.84f
        )
        lineToRelative(0.109f, -0.053f)
        lineToRelative(4.545f, -2.624f)
        arcToRelative(
            0.909f,
            0.909f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            0.1f,
            -1.507f
        )
        lineToRelative(-0.1f, -0.068f)
        lineToRelative(-4.545f, -2.624f)
        close()
        moveToRelative(-14.2f, -6.209f)
        horizontalLineToRelative(21.964f)
        lineToRelative(0.015f, 0.36f)
        lineToRelative(0.003f, 0.189f)
        verticalLineToRelative(6.899f)
        curveToRelative(0f, 3.061f, -0.755f, 4.469f, -1.888f, 5.64f)
        curveToRelative(-1.151f, 1.114f, -2.5f, 1.856f, -5.33f, 1.909f)
        lineToRelative(-0.334f, 0.003f)
        horizontalLineTo(8.551f)
        curveToRelative(-3.06f, 0f, -4.467f, -0.755f, -5.64f, -1.889f)
        curveToRelative(-1.114f, -1.15f, -1.854f, -2.498f, -1.908f, -5.33f)
        lineTo(1f, 15.45f)
        verticalLineTo(8.551f)
        lineToRelative(0.003f, -0.189f)
        close()
    }
}.build() else ImageVector.Builder(
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
        moveTo(2.049f, 7.002f)
        lineTo(21.95f, 7.002f)
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
        moveTo(13.504f, 2.001f)
        lineTo(16.362f, 7.002f)
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
        moveTo(7.207f, 2.11f)
        lineTo(10.002f, 7.002f)
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
        moveTo(2f, 12.001f)
        verticalLineToRelative(3.449f)
        curveToRelative(0f, 2.849f, 0.698f, 4.006f, 1.606f, 4.945f)
        curveToRelative(0.94f, 0.908f, 2.098f, 1.607f, 4.946f, 1.607f)
        horizontalLineToRelative(6.896f)
        curveToRelative(2.848f, 0f, 4.006f, -0.699f, 4.946f, -1.607f)
        curveToRelative(0.908f, -0.939f, 1.606f, -2.096f, 1.606f, -4.945f)
        verticalLineTo(8.552f)
        curveToRelative(0f, -2.848f, -0.698f, -4.006f, -1.606f, -4.945f)
        curveTo(19.454f, 2.699f, 18.296f, 2f, 15.448f, 2f)
        horizontalLineTo(8.552f)
        curveToRelative(-2.848f, 0f, -4.006f, 0.699f, -4.946f, 1.607f)
        curveTo(2.698f, 4.546f, 2f, 5.704f, 2f, 8.552f)
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
        moveTo(9.763f, 17.664f)
        arcToRelative(
            0.908f,
            0.908f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            -0.454f,
            -0.787f
        )
        verticalLineTo(11.63f)
        arcToRelative(
            0.909f,
            0.909f,
            0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            1.364f,
            -0.788f
        )
        lineToRelative(4.545f, 2.624f)
        arcToRelative(0.909f, 0.909f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.575f)
        lineToRelative(-4.545f, 2.624f)
        arcToRelative(0.91f, 0.91f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.91f, 0f)
        close()
    }
}.build()