package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class hmg implements hmi {
    public final Context a;
    public final pny b = new hmd();
    public final avm c = new hme(this);
    public boolean d;
    public boolean e;
    public hmf f;
    public long g;
    public long h;
    public final hmj i;
    public final hrv j;
    public pom k;
    private final atd l;

    public hmg(Context context, hmj hmjVar, hrv hrvVar) {
        this.a = context;
        this.j = hrvVar;
        this.l = new bfl(context, pts.J(context, "AudioMPEG"));
        this.i = hmjVar;
    }

    public final long a() {
        return this.g + this.h;
    }

    public final void b() {
        pom pomVar = this.k;
        if (pomVar != null) {
            pomVar.z(false);
        }
    }

    public final void c(long j) {
        amkq.E(this.e);
        if (this.d) {
            this.k.c(j);
        }
    }

    public final void d() {
        this.k.c(a());
    }

    public final void e(float f) {
        this.k.B(new pnu(f));
    }

    public final void f(boolean z) {
        pom pomVar = this.k;
        if (pomVar == null) {
            return;
        }
        if (z) {
            pomVar.K(1);
        } else {
            pomVar.K(0);
        }
    }

    public final void g(boolean z) {
        this.i.a = z;
    }

    public final void h(Uri uri) {
        pmx pmxVar = new pmx();
        pmxVar.a = uri;
        pmxVar.b(uri.toString());
        this.k.f(new bcq(this.l).a(pmxVar.a()));
        this.k.v();
        d();
        this.d = true;
    }

    public final void i() {
        amkq.E(this.e);
        if (this.d) {
            this.k.z(true);
        }
    }

    @Override // defpackage.hmi
    public final long j() {
        amkq.E(this.e);
        if (this.d) {
            return this.k.p();
        }
        return 0L;
    }
}
