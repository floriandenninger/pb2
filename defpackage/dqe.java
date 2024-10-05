package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dqe extends dgy {
    public dqg a;
    dhe d;
    private final String[] f = {"section"};
    public final BitSet e = new BitSet(1);

    public static /* bridge */ /* synthetic */ void d(dqe dqeVar, dhe dheVar, dqg dqgVar) {
        super.w(dheVar, dqgVar);
        dqeVar.a = dqgVar;
        dqeVar.d = dheVar;
        dqeVar.e.clear();
    }

    @Override // defpackage.dgy
    protected final void b(dha dhaVar) {
        this.a = (dqg) dhaVar;
    }

    @Override // defpackage.dgy
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dqg a() {
        o(1, this.e, this.f);
        dqg dqgVar = this.a;
        int i = dqg.M;
        String n = dqgVar.n();
        ammr ammrVar = this.a.K;
        if (ammrVar == null) {
            ammrVar = dqg.as(this.d, n, -1505688212);
        }
        dqg dqgVar2 = this.a;
        dqgVar2.K = ammrVar;
        ammr ammrVar2 = dqgVar2.L;
        if (ammrVar2 == null) {
            ammrVar2 = dqg.as(this.d, n, -238194236);
        }
        dqg dqgVar3 = this.a;
        dqgVar3.L = ammrVar2;
        return dqgVar3;
    }

    public final void e(float f) {
        this.a.a = this.b.a(f);
    }

    @Override // defpackage.dgy
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void s(boolean z) {
        this.a.c = z;
    }

    public final void g(wh whVar) {
        this.a.y = whVar;
    }

    public final void h(float f) {
        this.a.z = this.b.a(f);
    }

    public final void i(float f) {
        this.a.E = this.b.a(f);
    }

    public final void j(float f) {
        this.a.G = this.b.a(f);
    }
}
