package defpackage;

import android.graphics.Bitmap;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.animation.Animation;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xzq implements zab {
    private final int a;
    private final int b;

    public xzq(int i, int i2) {
        amkq.E(i > 0);
        amkq.E(i2 > 0);
        this.a = i;
        this.b = i2;
    }

    private static final void d(ImageView imageView, int i) {
        imageView.getLayoutParams().width = -1;
        imageView.getLayoutParams().height = i;
        imageView.requestLayout();
    }

    @Override // defpackage.zab
    public final void a(ImageView imageView, Bitmap bitmap) {
        if (bitmap == null || bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            return;
        }
        int width = (this.b * bitmap.getWidth()) / bitmap.getHeight();
        if (width < this.a) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), Bitmap.createScaledBitmap(bitmap, width, this.b, true));
            bitmapDrawable.setTileModeX(Shader.TileMode.REPEAT);
            imageView.setBackground(bitmapDrawable);
            d(imageView, this.b);
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageBitmap(bitmap);
        d(imageView, (this.a * bitmap.getHeight()) / bitmap.getWidth());
    }

    @Override // defpackage.zab
    public final Animation b() {
        return null;
    }

    @Override // defpackage.zab
    public final boolean c() {
        return false;
    }
}
