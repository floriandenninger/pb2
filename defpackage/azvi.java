package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvi {
    private final azvm[] a;

    public azvi(int i) {
        azvm[] azvmVarArr = new azvm[i];
        for (int i2 = 0; i2 < i; i2++) {
            azvmVarArr[i2] = azth.o(null);
        }
        this.a = azvmVarArr;
    }

    public final azvm a(int i) {
        return this.a[i];
    }
}
