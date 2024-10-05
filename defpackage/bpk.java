package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bpk {
    final /* synthetic */ bpp a;

    public bpk() {
    }

    public bpk(bpp bppVar) {
        this.a = bppVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public bpk(bpp bppVar, byte[] bArr) {
        this();
        this.a = bppVar;
    }

    public bpk(bpp bppVar, byte[] bArr, byte[] bArr2) {
        this.a = bppVar;
    }

    public final void b(int i) {
        bpv c = this.a.c();
        if (this.a.e() != c) {
            this.a.k(c, i);
        }
    }

    public final void a(boz bozVar, bou bouVar, Collection collection) {
        bpp bppVar = this.a;
        if (bozVar != bppVar.v || bouVar == null) {
            if (bozVar == bppVar.t) {
                if (bouVar != null) {
                    bppVar.a(bppVar.s, bouVar);
                }
                this.a.s.h(collection);
                return;
            }
            return;
        }
        bpu bpuVar = bppVar.u.a;
        String n = bouVar.n();
        bpv bpvVar = new bpv(bpuVar, n, this.a.f(bpuVar, n));
        bpvVar.b(bouVar);
        bpp bppVar2 = this.a;
        if (bppVar2.s == bpvVar) {
            return;
        }
        bppVar2.i(bppVar2, bpvVar, bppVar2.v, 3, bppVar2.u, collection);
        bpp bppVar3 = this.a;
        bppVar3.u = null;
        bppVar3.v = null;
    }
}
