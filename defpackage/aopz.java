package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aopz implements aoov {
    public final aoph a;
    public final int[] b;
    public final aomy[] c;
    public final aooy d;
    private final boolean e;

    public aopz(aoph aophVar, boolean z, int[] iArr, aomy[] aomyVarArr, Object obj) {
        this.a = aophVar;
        this.e = z;
        this.b = iArr;
        this.c = aomyVarArr;
        aonz.i(obj, "defaultInstance");
        this.d = (aooy) obj;
    }

    @Override // defpackage.aoov
    public final aooy a() {
        return this.d;
    }

    @Override // defpackage.aoov
    public final aoph b() {
        return this.a;
    }

    @Override // defpackage.aoov
    public final boolean c() {
        return this.e;
    }
}
