package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtg implements ykl {
    final /* synthetic */ boolean a;
    final /* synthetic */ mti b;

    public mtg(mti mtiVar, boolean z) {
        this.b = mtiVar;
        this.a = z;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.b.b.post(new Runnable() { // from class: mte
            @Override // java.lang.Runnable
            public final void run() {
                mtg mtgVar = mtg.this;
                mti mtiVar = mtgVar.b;
                ajjv ajjvVar = mtiVar.c;
                if (ajjvVar != null) {
                    mtiVar.b.setImageResource(ajjvVar.e);
                } else {
                    mtiVar.b.setImageDrawable(new ColorDrawable(wbs.W(mtiVar.a, R.attr.ytIcon1).orElse(0)));
                }
                mtgVar.b.b.invalidate();
            }
        });
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        int i;
        int i2;
        final Bitmap bitmap = (Bitmap) obj2;
        if (this.a) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            double d = width;
            double d2 = height;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            if (d3 < 0.5625d) {
                Double.isNaN(d);
                i2 = (int) Math.round((d / 0.5625d) - 1.0d);
                i = width;
            } else {
                if (d3 > 0.5625d) {
                    Double.isNaN(d2);
                    i = (int) Math.round((d2 * 0.5625d) - 1.0d);
                } else {
                    i = width;
                }
                i2 = height;
            }
            double d4 = width - i;
            Double.isNaN(d4);
            int round = (int) Math.round(d4 / 2.0d);
            double d5 = height - i2;
            Double.isNaN(d5);
            int round2 = (int) Math.round(d5 / 2.0d);
            if ((i != width || i2 != height) && i > 0 && i2 > 0) {
                bitmap = Bitmap.createBitmap(bitmap, round, round2, i, i2);
            }
        }
        this.b.b.post(new Runnable() { // from class: mtf
            @Override // java.lang.Runnable
            public final void run() {
                mtg mtgVar = mtg.this;
                mtgVar.b.b.setImageBitmap(bitmap);
                mtgVar.b.b.invalidate();
            }
        });
    }
}
