package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ber {
    public final int a;
    public final pog[] b;
    public final bel[] c;
    public final Object d;

    public ber(pog[] pogVarArr, bel[] belVarArr, Object obj) {
        this.b = pogVarArr;
        this.c = (bel[]) belVarArr.clone();
        this.d = obj;
        this.a = pogVarArr.length;
    }

    public final boolean a(ber berVar, int i) {
        return berVar != null && pts.R(this.b[i], berVar.b[i]) && pts.R(this.c[i], berVar.c[i]);
    }

    public final boolean b(int i) {
        return this.b[i] != null;
    }
}
