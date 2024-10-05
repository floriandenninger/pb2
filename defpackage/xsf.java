package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class xsf implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ xsg b;

    public xsf(xsg xsgVar, Bitmap bitmap) {
        this.b = xsgVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xsj xsjVar = this.b.a;
        Bitmap bitmap = this.a;
        xsjVar.a.setImageBitmap(bitmap);
        if (xsjVar.d.b == xsjVar.b) {
            xsjVar.c.setImageBitmap(bitmap);
        }
    }
}
