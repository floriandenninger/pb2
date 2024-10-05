package defpackage;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class st {
    private static final int[] b = {R.attr.indeterminateDrawable, R.attr.progressDrawable};
    public Bitmap a;
    private final ProgressBar c;

    public st(ProgressBar progressBar) {
        this.c = progressBar;
    }

    private final Drawable b(Drawable drawable, boolean z) {
        if (drawable instanceof gc) {
            gc gcVar = (gc) drawable;
            Drawable drawable2 = gcVar.c;
            if (drawable2 != null) {
                gcVar.a(b(drawable2, z));
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i = 0; i < numberOfLayers; i++) {
                    int id = layerDrawable.getId(i);
                    drawableArr[i] = b(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i2 = 0; i2 < numberOfLayers; i2++) {
                    layerDrawable2.setId(i2, layerDrawable.getId(i2));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.a == null) {
                    this.a = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }

    public void a(AttributeSet attributeSet, int i) {
        yk l = yk.l(this.c.getContext(), attributeSet, b, i, 0);
        Drawable i2 = l.i(0);
        if (i2 != null) {
            ProgressBar progressBar = this.c;
            if (i2 instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) i2;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i3 = 0; i3 < numberOfFrames; i3++) {
                    Drawable b2 = b(animationDrawable.getFrame(i3), true);
                    b2.setLevel(10000);
                    animationDrawable2.addFrame(b2, animationDrawable.getDuration(i3));
                }
                animationDrawable2.setLevel(10000);
                i2 = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(i2);
        }
        Drawable i4 = l.i(1);
        if (i4 != null) {
            this.c.setProgressDrawable(b(i4, false));
        }
        l.o();
    }
}
