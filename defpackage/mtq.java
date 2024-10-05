package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.GradientDrawable;
import com.google.android.youtube.R;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mtq implements ykl {
    final /* synthetic */ mts a;

    public mtq(mts mtsVar) {
        this.a = mtsVar;
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        this.a.h.post(new Runnable() { // from class: mto
            @Override // java.lang.Runnable
            public final void run() {
                mtq mtqVar = mtq.this;
                mtqVar.a.h.setImageResource(R.drawable.missing_avatar);
                mtqVar.a.h.invalidate();
            }
        });
    }

    @Override // defpackage.ykl
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        final Bitmap bitmap = (Bitmap) obj2;
        if (bitmap != null) {
            this.a.h.post(new Runnable() { // from class: mtp
                @Override // java.lang.Runnable
                public final void run() {
                    mtq mtqVar = mtq.this;
                    mtqVar.a.h.setImageBitmap(bitmap);
                    mtqVar.a.h.invalidate();
                }
            });
            final mts mtsVar = this.a;
            int min = Math.min(4, bitmap.getHeight());
            brg brgVar = new brg(bitmap);
            brgVar.c(0, bitmap.getWidth(), min);
            final int a = brgVar.b().a(mtsVar.i);
            brg brgVar2 = new brg(bitmap);
            brgVar2.c(bitmap.getHeight() - min, bitmap.getWidth(), bitmap.getHeight());
            final int a2 = brgVar2.b().a(mtsVar.i);
            mtsVar.g.post(new Runnable() { // from class: mtn
                @Override // java.lang.Runnable
                public final void run() {
                    mts mtsVar2 = mts.this;
                    int i = a;
                    int i2 = a2;
                    GradientDrawable gradientDrawable = new GradientDrawable();
                    gradientDrawable.setColors(new int[]{i, i2});
                    mtsVar2.g.setBackground(gradientDrawable);
                }
            });
        }
    }
}
