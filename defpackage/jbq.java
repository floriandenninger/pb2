package defpackage;

import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jbq implements adjm {
    private final fwn a;
    private final adgd b;
    private final fwo c;
    private final Handler d;
    private final adjs e;
    private final adkb f;

    public jbq(adkb adkbVar, fwn fwnVar, adgd adgdVar, fwo fwoVar, Handler handler, adjs adjsVar) {
        this.f = adkbVar;
        fwnVar.getClass();
        this.a = fwnVar;
        this.b = adgdVar;
        fwoVar.getClass();
        this.c = fwoVar;
        handler.getClass();
        this.d = handler;
        this.e = adjsVar;
    }

    @Override // defpackage.adjm
    public final adgd a() {
        return this.b;
    }

    @Override // defpackage.adjm
    public final adkb b() {
        return this.f;
    }

    @Override // defpackage.adjm
    public final void c() {
        if (this.f.g) {
            return;
        }
        this.a.d();
    }

    @Override // defpackage.adjm
    public final void d(Runnable runnable) {
        yjk.f();
        this.e.b(this.f.h);
        if (this.f.g) {
            runnable.run();
        } else {
            this.c.b(this.a);
            this.d.postDelayed(runnable, 10000L);
        }
    }

    @Override // defpackage.adjm
    public final boolean e() {
        return this.a.f();
    }
}
