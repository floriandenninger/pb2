package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzl extends dgy {
    ajzn a;
    private final String[] e = {"componentCallable"};
    public final BitSet d = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(ajzl ajzlVar, dhe dheVar, ajzn ajznVar) {
        super.w(dheVar, ajznVar);
        ajzlVar.a = ajznVar;
        ajzlVar.d.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (ajzn) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ajzn a() {
        o(1, this.d, this.e);
        return this.a;
    }
}
