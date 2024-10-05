package defpackage;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class agd {
    public static int a;
    agg b;
    final ArrayList c = new ArrayList();

    public agd(agg aggVar) {
        this.b = null;
        a++;
        this.b = aggVar;
    }

    public final long a(afx afxVar, long j) {
        agg aggVar = afxVar.d;
        if (aggVar instanceof agb) {
            return j;
        }
        int size = afxVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            afv afvVar = (afv) afxVar.j.get(i);
            if (afvVar instanceof afx) {
                afx afxVar2 = (afx) afvVar;
                if (afxVar2.d != aggVar) {
                    j2 = Math.min(j2, a(afxVar2, afxVar2.e + j));
                }
            }
        }
        if (afxVar != aggVar.j) {
            return j2;
        }
        long a2 = j - aggVar.a();
        return Math.min(Math.min(j2, a(aggVar.i, a2)), a2 - aggVar.i.e);
    }

    public final long b(afx afxVar, long j) {
        agg aggVar = afxVar.d;
        if (aggVar instanceof agb) {
            return j;
        }
        int size = afxVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            afv afvVar = (afv) afxVar.j.get(i);
            if (afvVar instanceof afx) {
                afx afxVar2 = (afx) afvVar;
                if (afxVar2.d != aggVar) {
                    j2 = Math.max(j2, b(afxVar2, afxVar2.e + j));
                }
            }
        }
        if (afxVar != aggVar.i) {
            return j2;
        }
        long a2 = j + aggVar.a();
        return Math.max(Math.max(j2, b(aggVar.j, a2)), a2 - aggVar.j.e);
    }
}
