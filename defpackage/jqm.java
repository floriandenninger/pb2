package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jqm {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    private jqm(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
    }

    public static jqm a(agnj agnjVar) {
        return new jqm(agnjVar == null, agnjVar != null && agnjVar.e(), true, true, false, agnjVar == null ? 0 : agnjVar.b());
    }

    public static jqm b(agnv agnvVar) {
        return new jqm(agnvVar == null || agnvVar.s(), agnvVar != null && agnvVar.i() == agnq.PLAYABLE, (agnvVar == null || agnvVar.s() || (!agnvVar.D() && agnvVar.C())) ? false : true, agnvVar != null && agnvVar.B(), agnvVar != null && agnvVar.C(), agnvVar == null ? 0 : agnvVar.c());
    }
}
