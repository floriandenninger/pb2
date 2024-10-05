package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gyd extends dgy {
    gye a;
    private final String[] e = {"clipCreationScrubberViewController", "clipsEnableDragToScroll"};
    public final BitSet d = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gyd gydVar, dhe dheVar, gye gyeVar) {
        super.w(dheVar, gyeVar);
        gydVar.a = gyeVar;
        gydVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(2, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (gye) dhaVar;
    }
}
