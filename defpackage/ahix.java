package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahix {
    public final Handler a;
    public final ahiw b;
    public float c;
    public float d;
    public final boolean e;
    public final afgr f;

    public ahix(afgr afgrVar, afgr afgrVar2, boolean z, byte[] bArr) {
        this.f = afgrVar;
        this.e = z;
        Handler handler = new Handler(Looper.getMainLooper());
        this.a = handler;
        if (z) {
            this.b = new ahiw(handler, afgrVar2);
        } else {
            this.b = null;
        }
    }

    public final void a() {
        if (this.e) {
            ahiw ahiwVar = this.b;
            Handler handler = ahiwVar.a;
            if (handler != null) {
                handler.removeCallbacks(ahiwVar.h);
            }
            ahiwVar.i = true;
            ahiwVar.c(0L);
        }
    }
}
