package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class ctn implements ctm {
    @Override // defpackage.ctm
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ctm
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.ctm
    public final void c() {
    }

    @Override // defpackage.ctm
    public void d(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.ctm
    public final void e(int i) {
    }
}
