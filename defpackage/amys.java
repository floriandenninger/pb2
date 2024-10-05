package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amys extends amyt {
    public static final amys a = new amys();

    private amys() {
    }

    @Override // defpackage.amyt
    public final int b() {
        return 0;
    }

    @Override // defpackage.amyt
    public final amyc c(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }

    @Override // defpackage.amyt
    public final Object d(amyc amycVar) {
        return null;
    }

    @Override // defpackage.amyt
    public final Object e(int i) {
        throw new IndexOutOfBoundsException("cannot read from empty metadata");
    }
}
