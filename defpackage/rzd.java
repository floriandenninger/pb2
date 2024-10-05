package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rzd {
    public static final rzd a = new rzd(0.0f);
    private final float b;

    static {
        new rzd(0.5f);
        new rzd(-0.5f);
    }

    public rzd(float f) {
        boolean z = false;
        if (f >= -1.0f && f <= 1.0f) {
            z = true;
        }
        sbt.a(z, "rangeBandConfigPercent needs to be between -1 and 1");
        this.b = f;
    }

    public final float a(rze rzeVar, Object obj) {
        return rzeVar.a(obj) + (rzeVar.c() * this.b);
    }
}
