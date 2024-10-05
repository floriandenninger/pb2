package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tac extends dgy {
    tae a;
    private final String[] d = {"componentCallable"};
    private final BitSet e = new BitSet(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void d(tac tacVar, dhe dheVar, tae taeVar) {
        super.w(dheVar, taeVar);
        tacVar.a = taeVar;
        tacVar.e.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (tae) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final tae a() {
        o(1, this.e, this.d);
        return this.a;
    }

    public final void e(szo szoVar) {
        this.a.a = szoVar;
        this.e.set(0);
    }

    public final void f(sxc sxcVar) {
        this.a.b = sxcVar;
    }
}
