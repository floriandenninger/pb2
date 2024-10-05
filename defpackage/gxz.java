package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxz extends dgy {
    public gya a;
    private final String[] e = {"clipCreationScrubberViewController", "clipsEnableDragToScroll", "storyboardClient", "vodDurationMs", "windowSizeMs"};
    public final BitSet d = new BitSet(5);

    public static /* bridge */ /* synthetic */ void c(gxz gxzVar, dhe dheVar, gya gyaVar) {
        super.w(dheVar, gyaVar);
        gxzVar.a = gyaVar;
        gxzVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(5, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (gya) dhaVar;
    }
}
