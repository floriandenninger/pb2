package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afqr implements afql {
    private static final int a = (int) TimeUnit.DAYS.toHours(30);
    private static final amru b = amru.q();
    private final atvr c;
    private afqm d;
    private afqm e;

    public afqr(ynx ynxVar) {
        atej atejVar = ynxVar.a().k;
        atvr atvrVar = (atejVar == null ? atej.a : atejVar).i;
        this.c = atvrVar == null ? atvr.a : atvrVar;
    }

    @Override // defpackage.afql
    public final int a() {
        atvr atvrVar = this.c;
        if ((atvrVar.b & 2) != 0) {
            return atvrVar.d;
        }
        return 100;
    }

    @Override // defpackage.afql
    public final int b() {
        atvr atvrVar = this.c;
        return (atvrVar.b & 32) != 0 ? atvrVar.f : a;
    }

    @Override // defpackage.afql
    public final int c() {
        atvr atvrVar = this.c;
        if ((atvrVar.b & 1) != 0) {
            return atvrVar.c;
        }
        return 1000;
    }

    @Override // defpackage.afql
    public final int d() {
        atvr atvrVar = this.c;
        if ((atvrVar.b & 16) != 0) {
            return atvrVar.e;
        }
        return 60;
    }

    @Override // defpackage.afql
    public final boolean g() {
        atvr atvrVar = this.c;
        if ((atvrVar.b & 512) != 0) {
            return atvrVar.g;
        }
        return true;
    }

    @Override // defpackage.afql
    public final boolean h() {
        return this.c.h;
    }

    @Override // defpackage.afql
    public final boolean i() {
        atvr atvrVar = this.c;
        if ((atvrVar.b & 131072) != 0) {
            return atvrVar.k;
        }
        return false;
    }

    @Override // defpackage.afql
    public final afqm e() {
        afqs afqsVar;
        if (this.e == null) {
            atvr atvrVar = this.c;
            if ((atvrVar.b & 4096) == 0) {
                afqsVar = new afqs(a, b);
            } else {
                atvs atvsVar = atvrVar.j;
                if (atvsVar == null) {
                    atvsVar = atvs.a;
                }
                afqsVar = new afqs(atvsVar);
            }
            this.e = afqsVar;
        }
        return this.e;
    }

    @Override // defpackage.afql
    public final afqm f() {
        afqs afqsVar;
        if (this.d == null) {
            atvr atvrVar = this.c;
            if ((atvrVar.b & 2048) == 0) {
                afqsVar = new afqs(a, b);
            } else {
                atvs atvsVar = atvrVar.i;
                if (atvsVar == null) {
                    atvsVar = atvs.a;
                }
                afqsVar = new afqs(atvsVar);
            }
            this.d = afqsVar;
        }
        return this.d;
    }
}
