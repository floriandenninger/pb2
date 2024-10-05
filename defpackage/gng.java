package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public enum gng {
    LIGHT(1, 2),
    DARK(2, 3);

    public final int c;
    public final int d;

    gng(int i, int i2) {
        this.c = i;
        this.d = i2;
    }

    public static ammv a(int i) {
        for (gng gngVar : values()) {
            if (gngVar.c == i) {
                return ammv.j(gngVar);
            }
        }
        return amlr.a;
    }

    public final String b() {
        int i = this.d;
        String aZ = anaf.aZ(i);
        if (i != 0) {
            return aZ;
        }
        throw null;
    }
}
