package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ajsb implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ ajsc b;

    public ajsb(ajsc ajscVar, Bitmap bitmap) {
        this.b = ajscVar;
        this.a = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ajsc ajscVar = this.b;
        ajscVar.c.d(ajscVar.a, this.a);
    }
}
