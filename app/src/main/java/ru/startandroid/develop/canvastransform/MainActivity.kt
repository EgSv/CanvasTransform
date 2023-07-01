package ru.startandroid.develop.canvastransform

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.RectF
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(DrawView(this))
    }

    /*internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint()
        private var matriX: Matrix
        private var rectf: RectF
        private var path: Path

        init {
            p = Paint()
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            rectf = RectF(100f, 100f, 200f, 200f)
            matriX = Matrix()
            path = Path()
        }

        /*
        override fun onDraw(canvas: Canvas?) {

            canvas!!.drawARGB(80, 102, 204, 255)

            path.reset()
            path.addRect(rectf, Path.Direction.CW)
            p.color = Color.BLACK
            canvas.drawPath(path, p)

            matriX.reset()
            matriX.preRotate(30f)
            matriX.preTranslate(500f, 0f)
            path.transform(matriX)
            canvas.drawPath(path, p)
        }

         */

        override fun onDraw(canvas: Canvas?) {

            canvas!!.drawARGB(80, 102, 204, 255)

            p.color = Color.BLACK
            canvas.drawRect(rectf, p)

            canvas.rotate(30f)
            canvas.translate(500f, 000f)
            p.color = Color.GREEN
            canvas.drawRect(rectf, p)
        }
    }
     */

    internal inner class DrawView(context: Context): View(context) {
        private var p: Paint = Paint()
        private var rectf1: RectF
        private var rectf2: RectF

        init {
            p.strokeWidth = 3f
            p.style = Paint.Style.STROKE
            rectf1 = RectF(50f, 50f, 100f, 100f)
            rectf2 = RectF(50f, 150f, 100f, 200f)
        }

        /*override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            p.color = Color.GREEN
            canvas.drawRect(rectf1, p)

            p.color = Color.BLUE
            canvas.drawRect(rectf2, p)
        }*/

        /*override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            p.color = Color.GREEN
            canvas.drawRect(rectf1, p)

            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            //canvas.restore()

            p.color = Color.BLUE
            canvas.drawRect(rectf2, p)
        }*/

        /*override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            p.color = Color.GREEN
            canvas.drawRect(rectf1, p)

            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.save()

            p.color = Color.RED
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.restore()

            p.color = Color.BLUE
            canvas.drawRect(rectf2, p)
        }

         */

        /*override fun onDraw(canvas: Canvas?) {
            canvas!!.drawARGB(80, 102, 204, 255)

            p.color = Color.GREEN
            canvas.drawRect(rectf1, p)

            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.save()

            p.color = Color.YELLOW
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.save()

            p.color = Color.RED
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.restore()

            p.color = Color.BLUE
            canvas.drawRect(rectf2, p)

            canvas.restore()

            p.color = Color.BLACK
            canvas.drawRect(rectf2, p)

            //canvas.restore()

            p.color = Color.MAGENTA
            canvas.drawRect(rectf2, p)
        }  */

        override fun onDraw(canvas: Canvas) {
            canvas.drawARGB(80, 102, 204, 255)

            val initSave = canvas.save()

            p.color = Color.GREEN
            canvas.drawRect(rectf1, p)

            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.save()

            p.color = Color.YELLOW
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            val needSave = canvas.save()

            p.color = Color.RED
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.save()

            p.color = Color.BLUE
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)
            canvas.translate(100f, 0f)
            canvas.drawRect(rectf1, p)

            canvas.restoreToCount(needSave)

            p.color = Color.BLACK
            canvas.drawRect(rectf2, p)

            canvas.restoreToCount(initSave)

            p.color = Color.MAGENTA
            canvas.drawRect(rectf2, p)
        }
    }
}