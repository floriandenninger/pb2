package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fpz extends dgy {
    fqa a;
    private final String[] d = {"commandResolver", "playbackServiceComponent"};
    private final BitSet e = new BitSet(2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void c(fpz fpzVar, dhe dheVar, fqa fqaVar) {
        super.w(dheVar, fqaVar);
        fpzVar.a = fqaVar;
        fpzVar.e.clear();
    }

    @Override // defpackage.dgy
    public final /* bridge */ /* synthetic */ dha a() {
        o(2, this.e, this.d);
        return this.a;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (fqa) dhaVar;
    }

    public final void d(axpg axpgVar) {
        this.a.a = axpgVar;
        this.e.set(0);
    }

    public final void e(aioc aiocVar) {
        this.a.d = aiocVar;
        this.e.set(1);
    }
}
