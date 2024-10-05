package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wns {
    public final xgh a;
    public xev b;
    public int c;

    public wns(xgh xghVar) {
        this.a = xghVar;
    }

    public final String a() {
        int i = this.c;
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "RENDERING" : "ENTERED" : "ENTER_REQUESTED" : "SCHEDULED" : "NOT_SCHEDULED";
    }

    public final boolean b() {
        int i = this.c;
        return i == 2 || i == 3 || i == 4;
    }

    public final boolean c() {
        return this.c == 4;
    }
}
