package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class nyv implements nzo {
    public final int a;
    private final amvf b;

    public nyv(int i, float f, float f2) {
        this.a = i;
        if (f > f2) {
            afsi.b(2, 25, String.format("Flexy FixedRangeResizeConstraint cannot have minAspectRatio=%s > maxAspectRatio=%s", Float.valueOf(f), Float.valueOf(f2)));
            f2 = f;
        }
        boolean z = f >= 0.0f;
        Float valueOf = Float.valueOf(f);
        amkq.J(z, "Invalid minAspectRatio=%s", valueOf);
        this.b = amvf.d(valueOf, Float.valueOf(f2));
    }

    @Override // defpackage.nzo
    public final int a() {
        return this.a;
    }

    @Override // defpackage.nzo
    public final amvf b(float f) {
        amkq.E(f >= 0.0f);
        return this.b;
    }
}
