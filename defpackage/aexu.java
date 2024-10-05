package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aexu implements bdr {
    private final bel a;
    private final bdr[] b;
    private bdr c;

    public aexu(bel belVar, bdr[] bdrVarArr) {
        amkq.E(belVar.d() == bdrVarArr.length);
        this.a = belVar;
        this.b = bdrVarArr;
        this.c = bdrVarArr[belVar.h()];
    }

    @Override // defpackage.bdr
    public final int a(long j, List list) {
        return this.a.g(j, list);
    }

    @Override // defpackage.bdr
    public final long b(long j, poi poiVar) {
        return j;
    }

    @Override // defpackage.bdr
    public final void c(long j, long j2, List list, bdp bdpVar) {
        bdu bduVar = list.isEmpty() ? null : (bdu) amkq.bj(list);
        bdw[] bdwVarArr = new bdw[this.a.d()];
        for (int i = 0; i < this.a.d(); i++) {
            bdr bdrVar = this.b[i];
            if (bdrVar instanceof aezd) {
                bdwVarArr[i] = ((aezd) bdrVar).i(this.a, i, j2, bduVar);
            } else {
                bdwVarArr[i] = bdw.b;
            }
        }
        this.a.o(j, j2 - j, -9223372036854775807L, list, bdwVarArr);
        bdr bdrVar2 = this.b[this.a.h()];
        this.c = bdrVar2;
        bdrVar2.c(j, j2, list, bdpVar);
    }

    @Override // defpackage.bdr
    public final void d() {
    }

    @Override // defpackage.bdr
    public final void e(bdn bdnVar) {
        this.c.e(bdnVar);
    }

    @Override // defpackage.bdr
    public final void f() {
        for (bdr bdrVar : this.b) {
            bdrVar.f();
        }
    }

    @Override // defpackage.bdr
    public final boolean g(bdn bdnVar, boolean z, bfr bfrVar, bfs bfsVar) {
        return this.c.g(bdnVar, z, bfrVar, bfsVar);
    }

    @Override // defpackage.bdr
    public final void h() {
    }
}
