package defpackage;

import android.view.SurfaceHolder;

/* compiled from: PG */
/* loaded from: classes.dex */
final class acla implements Runnable {
    final /* synthetic */ SurfaceHolder a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ acle d;

    public acla(acle acleVar, SurfaceHolder surfaceHolder, int i, int i2) {
        this.d = acleVar;
        this.a = surfaceHolder;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abrv abrvVar = this.d.e;
        SurfaceHolder surfaceHolder = this.a;
        int i = this.b;
        int i2 = this.c;
        synchronized (abrvVar.b) {
            abrvVar.d = i;
            abrvVar.e = i2;
            abrvVar.c = surfaceHolder;
        }
        abrvVar.a.a();
    }
}
