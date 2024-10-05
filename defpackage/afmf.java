package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afmf extends dgy {
    afmh a;
    private final String[] e = {"asyncImageLoader", "commandResolver", "conversionContext", "entityStoreFactory", "identityProvider", "innerTubeIconResolver", "interactionLogger", "logger", "onBlurCommand", "onChangeCommand", "onFocusCommand", "suggestBottomSheetControllerFactory", "suggestControllerFactory", "suggestEditableTextType", "suggestFetcherFactory", "typefaceProvider", "uiScheduler"};
    public final BitSet d = new BitSet(17);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(afmf afmfVar, dhe dheVar, afmh afmhVar) {
        super.w(dheVar, afmhVar);
        afmfVar.a = afmhVar;
        afmfVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(17, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (afmh) dhaVar;
    }
}
