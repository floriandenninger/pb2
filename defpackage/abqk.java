package defpackage;

import android.os.Handler;
import android.view.Surface;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class abqk implements acap {
    public acao a;
    public Handler b;
    public boolean c;
    public final Runnable d = new abqi(this);
    private final abrt e;
    private boolean f;

    public abqk(abrt abrtVar) {
        abrtVar.getClass();
        this.e = abrtVar;
    }

    @Override // defpackage.acap
    public final void a(Surface surface, long j) {
        if (this.c) {
            this.e.e(surface);
            this.e.a(j);
        }
    }

    @Override // defpackage.acap
    public final void c(acao acaoVar, Handler handler) {
        this.a = acaoVar;
        this.b = handler;
    }

    @Override // defpackage.acap
    public final void d(Surface surface) {
        this.e.e(surface);
    }

    @Override // defpackage.acap
    public final boolean e() {
        if (!this.c) {
            zga.b("Cannot pause when video source not started.");
            return false;
        }
        if (this.f) {
            return true;
        }
        this.e.c(true);
        this.f = true;
        return true;
    }

    @Override // defpackage.acap
    public final boolean f() {
        return true;
    }

    @Override // defpackage.acap
    public final boolean g() {
        if (!this.c) {
            zga.b("Cannot resume when video source not started.");
            return false;
        }
        if (!this.f) {
            return true;
        }
        this.e.c(false);
        this.f = false;
        return true;
    }

    @Override // defpackage.acap
    public final boolean h() {
        if (this.c) {
            return true;
        }
        this.e.b(true);
        this.c = true;
        return true;
    }

    @Override // defpackage.acap
    public final void i() {
        if (this.c) {
            j();
        }
    }

    @Override // defpackage.acap
    public final void j() {
        if (this.c) {
            this.e.b(false);
            this.c = false;
            this.f = false;
        }
    }

    @Override // defpackage.acap
    public final void b(acan acanVar, Handler handler) {
        this.e.d(acanVar == null ? null : new abqj(acanVar), handler);
    }
}
