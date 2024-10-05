package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class gxv extends dgy {
    gxw a;
    private final String[] e = {"clipCreationScrubberViewController"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(gxv gxvVar, dhe dheVar, gxw gxwVar) {
        super.w(dheVar, gxwVar);
        gxvVar.a = gxwVar;
        gxvVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(1, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (gxw) dhaVar;
    }
}
