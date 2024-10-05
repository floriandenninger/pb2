package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpu extends dgy {
    fpv a;
    private final String[] e = {"viewPositionTrackerProvider"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(fpu fpuVar, dhe dheVar, fpv fpvVar) {
        super.w(dheVar, fpvVar);
        fpuVar.a = fpvVar;
        fpuVar.d.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (fpv) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fpv a() {
        o(1, this.d, this.e);
        return this.a;
    }
}
