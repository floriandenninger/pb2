package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pml {
    public boolean a;
    public pnt b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public pml(pnt pntVar) {
        this.b = pntVar;
    }

    public final void a(int i) {
        this.a = 1 == ((this.a ? 1 : 0) | i);
        this.c += i;
    }
}
