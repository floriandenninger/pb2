package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zpt {
    public Bitmap a;
    public Bitmap b;
    public long c = -1;
    final Runnable d = new zps(this);
    final /* synthetic */ zpw e;

    public zpt(zpw zpwVar) {
        this.e = zpwVar;
    }

    public final void a(Bitmap bitmap) {
        this.a = bitmap;
        this.d.run();
    }
}
