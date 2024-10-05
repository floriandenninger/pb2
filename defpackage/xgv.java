package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgv implements Comparable {
    public final int a;
    public final xgx b;
    public final xgh c;
    public final xev d;
    public final xcp e;

    public xgv(int i, xgx xgxVar, xgh xghVar, xev xevVar) {
        this.a = i;
        this.b = xgxVar;
        this.c = xghVar;
        this.d = xevVar;
        this.e = xcp.b(new xcy[0]);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xgv xgvVar = (xgv) obj;
        int i = this.a;
        int i2 = xgvVar.a;
        return i == i2 ? this.b.c().compareTo(xgvVar.b.c()) : i - i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xgv)) {
            return false;
        }
        xgv xgvVar = (xgv) obj;
        return this.a == xgvVar.a && amkq.b(this.b, xgvVar.b) && amkq.b(this.c, xgvVar.c) && amkq.b(this.d, xgvVar.d) && amkq.b(this.e, xgvVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public xgv(xgv xgvVar, xcp xcpVar) {
        this.a = xgvVar.a;
        this.b = xgvVar.b;
        this.c = xgvVar.c;
        this.d = xgvVar.d;
        this.e = xcpVar;
    }
}
