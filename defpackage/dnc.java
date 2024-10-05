package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dnc extends dgy {
    private static final String[] a = {"delegate"};
    private final BitSet d = new BitSet(1);
    private dnd e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(dnc dncVar, dhe dheVar, dnd dndVar) {
        super.w(dheVar, dndVar);
        dncVar.e = dndVar;
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.e = (dnd) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dnd a() {
        o(1, this.d, a);
        return this.e;
    }

    public final void e(dha dhaVar) {
        this.d.set(0);
        this.e.a = dhaVar;
    }
}
