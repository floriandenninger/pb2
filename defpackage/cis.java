package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cis implements ciw {
    private final cil a;
    private final cil b;

    public cis(cil cilVar, cil cilVar2) {
        this.a = cilVar;
        this.b = cilVar2;
    }

    @Override // defpackage.ciw
    public final chk a() {
        return new chw(this.a.a(), this.b.a());
    }

    @Override // defpackage.ciw
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // defpackage.ciw
    public final boolean c() {
        return this.a.c() && this.b.c();
    }
}
