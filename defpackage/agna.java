package defpackage;

import java.io.File;
import java.util.NavigableSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agna implements phg {
    public final String a;
    private final phg b;
    private final atd c;

    public agna(phg phgVar, String str) {
        agmz agmzVar = new agmz();
        amkq.E(phgVar != null);
        this.b = phgVar;
        this.a = str;
        this.c = agmzVar;
    }

    @Override // defpackage.phg
    public final long a() {
        return this.b.a();
    }

    @Override // defpackage.phg
    public final phl b(String str, long j) {
        return this.b.b(str, j);
    }

    @Override // defpackage.phg
    public final phl c(String str, long j) {
        try {
            return this.b.c(str, j);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    @Override // defpackage.phg
    public final phq d(String str) {
        return this.b.d(str);
    }

    @Override // defpackage.phg
    public final File e(String str, long j, long j2) {
        return this.b.e(str, j, j2);
    }

    @Override // defpackage.phg
    public final NavigableSet f(String str) {
        return this.b.f(str);
    }

    @Override // defpackage.phg
    public final Set g() {
        return this.b.g();
    }

    @Override // defpackage.phg
    public final void h(File file, long j) {
        this.b.h(file, j);
    }

    @Override // defpackage.phg
    public final void i() {
        this.b.i();
    }

    @Override // defpackage.phg
    public final void j(phl phlVar) {
        this.b.j(phlVar);
    }

    @Override // defpackage.phg
    public final void k(phl phlVar) {
        this.b.k(phlVar);
    }

    @Override // defpackage.phg
    public final boolean l(String str, long j, long j2) {
        return this.b.l(str, j, j2);
    }

    @Override // defpackage.phg
    public final void m(String str, rzb rzbVar) {
        this.b.m(str, rzbVar);
    }

    public final ate n() {
        return this.c.a();
    }

    public final boolean o() {
        phg phgVar = this.b;
        if (!(phgVar instanceof phy)) {
            return true;
        }
        try {
            ((phy) phgVar).p();
            return true;
        } catch (phe unused) {
            return false;
        }
    }
}
