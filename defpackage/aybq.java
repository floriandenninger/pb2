package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybq {
    public final aybj a;
    public final aykk b;
    public final aybc c;
    public final ayfu d;
    final ayfv e;
    public ayjp f;
    public boolean g;
    public boolean h;
    aydg i;
    public final /* synthetic */ aykx j;

    public aybq() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aybq(aykx aykxVar, aybj aybjVar, aykk aykkVar) {
        this();
        this.j = aykxVar;
        this.a = aybjVar;
        this.b = aykkVar;
        aybc b = aybc.b("Subchannel", aykxVar.b());
        this.c = b;
        long a = aykxVar.n.a();
        String valueOf = String.valueOf(aybjVar.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Subchannel for ");
        sb.append(valueOf);
        ayfv ayfvVar = new ayfv(b, a, sb.toString());
        this.e = ayfvVar;
        this.d = new ayfu(ayfvVar, aykxVar.n);
    }

    public final void a() {
        this.j.o.d();
        amkq.O(this.g, "not started");
        this.f.a();
    }

    public final void b() {
        aydg aydgVar;
        this.j.o.d();
        if (this.f == null) {
            this.h = true;
            return;
        }
        if (!this.h) {
            this.h = true;
        } else {
            if (!this.j.C || (aydgVar = this.i) == null) {
                return;
            }
            aydgVar.a();
            this.i = null;
        }
        aykx aykxVar = this.j;
        if (!aykxVar.C) {
            this.i = aykxVar.o.a(new ayjs(new aykv(this)), 5L, TimeUnit.SECONDS, this.j.j.b());
        } else {
            this.f.g(aykx.d);
        }
    }

    public final String toString() {
        return this.c.toString();
    }
}
