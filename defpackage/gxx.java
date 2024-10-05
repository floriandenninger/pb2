package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxx extends dgy {
    gxy a;
    private final String[] e = {"clipCreationScrubberViewController", "clipsEnableDragToScroll"};
    public final BitSet d = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gxx gxxVar, dhe dheVar, gxy gxyVar) {
        super.w(dheVar, gxyVar);
        gxxVar.a = gxyVar;
        gxxVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(2, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (gxy) dhaVar;
    }
}
