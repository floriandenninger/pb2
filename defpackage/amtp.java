package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class amtp extends amxe {
    static final amxe a = new amtp(new Object[0]);
    private final Object[] b;

    public amtp(Object[] objArr) {
        super(0, 0);
        this.b = objArr;
    }

    @Override // defpackage.amxe
    protected final Object a(int i) {
        return this.b[i];
    }
}
