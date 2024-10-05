package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajht extends dgy {
    ajhv a;
    private final String[] e = {"clock", "conversionContext", "executor", "image", "imageCaches", "imageManager", "imagePrefetchRangeRatio", "imageProcessorExtensionResolver", "imageTransitionType", "logger", "reportMissingImageSources", "thumbnailResolutionType"};
    public final BitSet d = new BitSet(12);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(ajht ajhtVar, dhe dheVar, ajhv ajhvVar) {
        super.w(dheVar, ajhvVar);
        ajhtVar.a = ajhvVar;
        ajhtVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(12, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (ajhv) dhaVar;
    }
}
