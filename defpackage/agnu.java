package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agnu {
    private static final long f = TimeUnit.HOURS.toMillis(12);
    private static final long g = TimeUnit.DAYS.toMillis(30);
    public final String a;
    public final atqq b;
    public final long c;
    public final long d;
    public final shf e;

    public agnu(String str, atqq atqqVar, long j, long j2, shf shfVar) {
        str.getClass();
        this.a = str;
        atqqVar.getClass();
        this.b = atqqVar;
        this.c = j;
        this.d = j2;
        this.e = shfVar;
    }

    public final long a() {
        return this.b.g;
    }

    public final long b() {
        return this.d + (this.b.g * 1000);
    }

    public final agnt c() {
        agnt agntVar = new agnt();
        agntVar.a = this.a;
        agntVar.b = this.b;
        agntVar.c = this.c;
        agntVar.d = this.d;
        agntVar.e = this.e;
        return agntVar;
    }

    public final Object d() {
        atqq atqqVar = this.b;
        if (atqqVar.c != 7) {
            return null;
        }
        atqo atqoVar = (atqo) atqqVar.d;
        int i = atqoVar.b;
        if (i == 53345347) {
            return (aqkv) atqoVar.c;
        }
        if (i != 64099105) {
            return null;
        }
        if (atqoVar.b == 64099105) {
            return (aqdt) atqoVar.c;
        }
        return aqdt.a;
    }

    public final String e() {
        atqq atqqVar = this.b;
        if ((atqqVar.b & 1) != 0) {
            return atqqVar.e;
        }
        return null;
    }

    public final boolean f() {
        if (!h()) {
            return false;
        }
        return b() <= this.e.c() || this.e.c() < this.d - f;
    }

    public final boolean g() {
        return f() && b() + g <= this.e.c();
    }

    public final boolean h() {
        int bO;
        int bO2 = anaf.bO(this.b.h);
        if (bO2 != 0 && bO2 == 3) {
            return false;
        }
        int bO3 = anaf.bO(this.b.h);
        return ((bO3 != 0 && bO3 == 4) || (bO = anaf.bO(this.b.h)) == 0 || bO == 1) ? false : true;
    }

    public final boolean i() {
        return h() && !f();
    }
}
