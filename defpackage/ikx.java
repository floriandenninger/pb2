package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ikx extends yzw {
    final /* synthetic */ ilb a;
    private final Rect b = new Rect();

    public ikx(ilb ilbVar) {
        this.a = ilbVar;
    }

    @Override // defpackage.yzw, defpackage.zab
    public final void a(ImageView imageView, Bitmap bitmap) {
        avgg avggVar;
        int i;
        int i2;
        ilb ilbVar = this.a;
        if (imageView != ilbVar.f && ((avggVar = ilbVar.i) == null || !avggVar.f)) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (d3 < 0.5625d) {
                Double.isNaN(d);
                i2 = (int) (d / 0.5625d);
                i = width;
            } else {
                if (d3 > 0.5625d) {
                    Double.isNaN(d2);
                    i = (int) (d2 * 0.5625d);
                } else {
                    i = width;
                }
                i2 = height;
            }
            int i3 = (width - i) / 2;
            int i4 = (height - i2) / 2;
            if (i != width || i2 != height) {
                bitmap = Bitmap.createBitmap(bitmap, i3, i4, i, i2);
            }
        }
        imageView.setImageBitmap(bitmap);
        double height2 = bitmap.getHeight();
        double width2 = bitmap.getWidth();
        Double.isNaN(height2);
        Double.isNaN(width2);
        double d4 = height2 / width2;
        imageView.getWindowVisibleDisplayFrame(this.b);
        double height3 = this.b.height();
        double width3 = this.b.width();
        Double.isNaN(height3);
        Double.isNaN(width3);
        double d5 = height3 / width3;
        ilb ilbVar2 = this.a;
        if (ilbVar2.k) {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return;
        }
        Object obj = ilbVar2.c.get();
        if (obj != null) {
            aujz aujzVar = (aujz) obj;
            if ((aujzVar.b & 268435456) != 0 && aujzVar.v && this.a.j && d4 > 1.5d) {
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                return;
            }
        }
        if (!this.a.j || d4 >= d5) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }
}
