package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xcl {
    public int a;
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public int f;

    public final synchronized void a(aoyk aoykVar) {
        if (aoykVar == null) {
            return;
        }
        this.a = aoykVar.b;
        this.b = aoykVar.c;
        int bV = amkq.bV(aoykVar.d);
        if (bV == 0) {
            bV = 1;
        }
        this.f = bV;
        this.c = aoykVar.e;
        this.d = aoykVar.f;
        this.e = aoykVar.g;
    }
}
