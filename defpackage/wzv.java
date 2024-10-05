package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wzv extends dgy {
    wzw a;
    private final String[] e = {"activeViewDisplayContainerType", "activeViewMonitor", "child", "commandExtensionResolver"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(wzv wzvVar, dhe dheVar, wzw wzwVar) {
        super.w(dheVar, wzwVar);
        wzvVar.a = wzwVar;
        wzvVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (wzw) dhaVar;
    }
}
