package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpc extends dgy {
    fpe a;
    private final String[] e = {"clock", "commandResolver", "conversionContext", "executor", "imageCaches", "imageManager", "imagePrefetchRangeRatio", "logger", "zoomType"};
    public final BitSet d = new BitSet(9);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fpc fpcVar, dhe dheVar, fpe fpeVar) {
        super.w(dheVar, fpeVar);
        fpcVar.a = fpeVar;
        fpcVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(9, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (fpe) dhaVar;
    }
}
