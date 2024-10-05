package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyb extends dgy {
    gyc a;
    private final String[] e = {"clipsEnableDragToScroll", "onScrollListener", "storyboardClient", "totalTimeWindowMs", "vodDurationMs"};
    public final BitSet d = new BitSet(5);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gyb gybVar, dhe dheVar, gyc gycVar) {
        super.w(dheVar, gycVar);
        gybVar.a = gycVar;
        gybVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(5, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (gyc) dhaVar;
    }
}
