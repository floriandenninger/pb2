package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class nrn {
    static final String a = aalt.f(asyt.b.a(), "sync_model");
    public static final /* synthetic */ int c = 0;
    public final long b;
    private final aahv d;
    private final ayqi e;

    public nrn(aahv aahvVar, aadw aadwVar, ayqi ayqiVar) {
        this.d = aahvVar;
        this.b = (aadwVar.b().e == null ? asvu.a : r1).bo;
        this.e = ayqiVar;
    }

    public static String c(auov auovVar) {
        return (auovVar == null || (auovVar.c & 32768) == 0) ? a : aalt.f(asyt.b.a(), auovVar.p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aypy a(aqts aqtsVar) {
        String str;
        auov auovVar;
        if ((aqtsVar.c & 16) != 0) {
            aqtq aqtqVar = aqtsVar.g;
            if (aqtqVar == null) {
                aqtqVar = aqtq.a;
            }
            if (aqtqVar.b == 49399797) {
                aqtq aqtqVar2 = aqtsVar.g;
                if (aqtqVar2 == null) {
                    aqtqVar2 = aqtq.a;
                }
                if (aqtqVar2.b == 49399797) {
                    auovVar = (auov) aqtqVar2.c;
                } else {
                    auovVar = auov.a;
                }
                str = c(auovVar);
                return b(str);
            }
        }
        str = a;
        return b(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aypy b(String str) {
        return this.d.c().h(str, true).L(niy.e).Y(mmt.j).k(asyr.class).L(niy.f).p(new ayqc() { // from class: nrm
            @Override // defpackage.ayqc
            public final ayqb a(aypy aypyVar) {
                long j = nrn.this.b;
                return j > 0 ? aypyVar.w(j, TimeUnit.MILLISECONDS) : aypyVar;
            }
        }).Y(mmt.k).ab(this.e);
    }
}
