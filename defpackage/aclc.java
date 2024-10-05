package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aclc implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ acld b;

    public aclc(acld acldVar, Bitmap bitmap) {
        this.b = acldVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abqg abqgVar = this.b.e;
        ((aceo) abqgVar).a.a.aJ(this.a);
    }
}
