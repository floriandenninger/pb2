package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class swf extends dgy {
    swg a;
    private final String[] e = {"image", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources"};
    public final BitSet d = new BitSet(6);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(swf swfVar, dhe dheVar, swg swgVar) {
        super.w(dheVar, swgVar);
        swfVar.a = swgVar;
        swfVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(6, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (swg) dhaVar;
    }
}
