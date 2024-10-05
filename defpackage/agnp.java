package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnp {
    public final agnb a;
    public final aami b;
    public final boolean c;
    public final Date d;
    public final atqx e;

    public agnp(atqx atqxVar, boolean z, aami aamiVar, agnb agnbVar) {
        atqxVar.getClass();
        this.e = atqxVar;
        this.c = z;
        this.b = aamiVar;
        this.a = agnbVar;
        if (!atqxVar.j.isEmpty()) {
            Uri.parse(atqxVar.j);
        }
        this.d = new Date(TimeUnit.SECONDS.toMillis(atqxVar.h));
    }

    public static agnp c(atqx atqxVar) {
        avgg avggVar = atqxVar.d;
        if (avggVar == null) {
            avggVar = avgg.a;
        }
        aami aamiVar = new aami(avggVar);
        atot atotVar = atqxVar.e;
        if (atotVar == null) {
            atotVar = atot.a;
        }
        return new agnp(atqxVar, false, aamiVar, agnb.a(atotVar));
    }

    public final long a() {
        return this.e.o;
    }

    public final long b() {
        return this.e.i;
    }

    public final avgg d() {
        aami aamiVar = this.b;
        if (aamiVar != null) {
            return aamiVar.e();
        }
        return null;
    }

    public final String e() {
        return this.e.n;
    }

    public final String f() {
        return this.e.c;
    }

    public final String g() {
        return this.e.g;
    }

    public final String h() {
        return this.e.m;
    }

    public final String i() {
        return this.e.l;
    }

    public final String j() {
        return this.e.f;
    }
}
