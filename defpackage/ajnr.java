package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajnr {
    private static final ajnr b = new ajnr(0, 1);
    public final int a;

    public ajnr(int i, int i2) {
        amkq.E(i >= 0);
        amkq.E(i2 > i);
        this.a = i2;
    }

    public static final ajnr a(ajok ajokVar) {
        Object c = ajokVar.c("rowData");
        return c instanceof ajnr ? (ajnr) c : b;
    }

    public final boolean b() {
        return this.a == 1;
    }
}
