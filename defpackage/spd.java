package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spd extends dgy {
    spf a;
    private final String[] e = {"commandResolver", "conversionContext", "editableTextType", "logger", "onBlurCommandFuture", "onChangeCommandFuture", "onClearCommandFuture", "onFocusCommandFuture", "onTextInputActionCommandFuture", "styleRunExtensionConverters", "typefaceProvider"};
    public final BitSet d = new BitSet(11);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(spd spdVar, dhe dheVar, spf spfVar) {
        super.w(dheVar, spfVar);
        spdVar.a = spfVar;
        spdVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(11, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (spf) dhaVar;
    }
}
