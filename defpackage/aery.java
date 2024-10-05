package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aery implements aesa {
    private final afgs b;
    private final aeru c;
    private final Handler d;

    private aery(Handler handler, afgs afgsVar, aeru aeruVar) {
        this.d = handler;
        this.b = afgsVar;
        this.c = aeruVar;
    }

    public static aesa b(Handler handler, afgs afgsVar, aeru aeruVar) {
        if (afgsVar == null) {
            afie afieVar = new afie("invalid.parameter", 0L);
            afieVar.b = "c.QoeLogger";
            afieVar.c = new Throwable();
            aeruVar.g(afieVar.a());
            return a;
        }
        return new aery(handler, afgsVar, aeruVar);
    }

    @Override // defpackage.aesa
    public final aesa a(aeru aeruVar) {
        return b(this.d, this.b, aeruVar);
    }

    @Override // defpackage.aesa
    public final void c(String str) {
        this.b.e.a("drm_system", "1");
    }

    @Override // defpackage.aesa
    public final void d(int i, boolean z) {
        afgs afgsVar = this.b;
        if (z) {
            afgsVar.k = i;
        } else {
            afgsVar.l(afgsVar.e(), i);
        }
    }

    @Override // defpackage.aesa
    public final void e(final afih afihVar) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new Runnable() { // from class: aerw
                @Override // java.lang.Runnable
                public final void run() {
                    aery.this.e(afihVar);
                }
            });
        } else if (afihVar.n() || afih.p(afihVar.i())) {
            this.c.g(afihVar);
        } else {
            this.b.v(afihVar);
        }
    }

    @Override // defpackage.aesa
    public final void f(final String str, final String str2) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            this.d.post(new Runnable() { // from class: aerx
                @Override // java.lang.Runnable
                public final void run() {
                    aery.this.f(str, str2);
                }
            });
        } else {
            this.b.C(str, adyu.bM(str2));
        }
    }

    @Override // defpackage.aesa
    public final void g(boolean z, boolean z2) {
        afgs afgsVar = this.b;
        String e = afgsVar.e();
        afgq afgqVar = afgsVar.e;
        String str = true != z ? "0" : "1";
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 1 + str.length());
        sb.append(e);
        sb.append(":");
        sb.append(str);
        afgqVar.a("is_offline", sb.toString());
        if (z2) {
            afgsVar.e.a("cat", "partial_playback");
        }
    }

    @Override // defpackage.aesa
    public final void h(aupb aupbVar) {
        afgs afgsVar = this.b;
        if (aupbVar == aupb.SEEK_SOURCE_UNKNOWN) {
            return;
        }
        String e = afgsVar.e();
        List list = afgsVar.s;
        int i = aupbVar.n;
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 15);
        sb.append("ss.");
        sb.append(i);
        sb.append("|");
        sb.append(e);
        list.add(sb.toString());
    }

    @Override // defpackage.aesa
    public final void i(int i) {
        this.b.D(i);
    }

    @Override // defpackage.aesa
    public final void j(String str, String str2) {
        String e = this.b.e();
        String d = ammx.d(str2);
        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 4 + d.length());
        sb.append("rt.");
        sb.append(e);
        sb.append(";");
        sb.append(d);
        f(str, sb.toString());
    }
}
