package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fqe extends dgy {
    fqf a;
    private final String[] e = {"commandResolver", "currentProgress", "logger", "maxIndex"};
    public final BitSet d = new BitSet(4);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fqe fqeVar, dhe dheVar, fqf fqfVar) {
        super.w(dheVar, fqfVar);
        fqeVar.a = fqfVar;
        fqeVar.d.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(4, this.d, this.e);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (fqf) dhaVar;
    }
}
