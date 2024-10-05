package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aixg implements aixt {
    private static long f;
    public final ajbl a;
    public final aiws b;
    public final aiwl c;
    public final aisa d;
    public final aadw e;
    private final aixe g;
    private final aifs h;
    private final aemv i;
    private final aiwt j;
    private final aigt k;
    private final shf l;
    private final aifk m;
    private final aaea n;
    private final Handler o = new Handler(Looper.getMainLooper());
    private boolean p = false;
    private final aiwo q;

    public aixg(aemv aemvVar, aixe aixeVar, aiwl aiwlVar, aifs aifsVar, aiwt aiwtVar, aigt aigtVar, aiws aiwsVar, shf shfVar, ajbl ajblVar, aiwo aiwoVar, aifk aifkVar, aadw aadwVar, aaea aaeaVar) {
        final int i = 0;
        this.a = ajblVar;
        this.b = aiwsVar;
        this.g = aixeVar;
        this.h = aifsVar;
        this.q = aiwoVar;
        this.c = aiwlVar;
        this.i = aemvVar;
        this.j = aiwtVar;
        this.k = aigtVar;
        this.l = shfVar;
        this.m = aifkVar;
        this.e = aadwVar;
        this.n = aaeaVar;
        aiwsVar.b = new WeakReference(ajblVar);
        final aisa l = ajblVar.l();
        this.d = l;
        if (aifk.G(aadwVar)) {
            final int i2 = 14;
            final int i3 = 6;
            l.t.d(l.f.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i4 = 0;
                    switch (i2) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final char c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i4 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i4 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i4 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i4 = 1;
            l.t.d(l.g.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i4) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i5 = 7;
            l.t.d(l.h.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i5) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            l.t.d(l.i.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i6 = 8;
            l.t.d(l.j.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i6) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i7 = 3;
            l.t.d(l.m.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i7) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i8 = 2;
            l.t.d(l.l.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i8) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i9 = 12;
            l.t.d(l.d.b.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i9) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i10 = 10;
            l.t.d(l.k.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i10) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i11 = 9;
            l.t.d(l.n.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i11) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i12 = 11;
            l.t.d(l.o.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i12) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            final int i13 = 13;
            l.t.d(l.p.F().Y(new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i13) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }, new ayrs() { // from class: airy
                @Override // defpackage.ayrs
                public final void a(Object obj) {
                    char c = 1;
                    final int i42 = 0;
                    switch (i3) {
                        case 0:
                            ahej ahejVar = (ahej) obj;
                            afgs afgsVar = l.s;
                            if (afgsVar != null) {
                                int a = ahejVar.a();
                                if (a == 2) {
                                    afgsVar.A();
                                    return;
                                }
                                if (a == 3) {
                                    afgsVar.w();
                                    return;
                                }
                                if (a == 5) {
                                    afgsVar.o();
                                    return;
                                }
                                if (a == 6) {
                                    afgsVar.x();
                                    return;
                                }
                                if (a == 7) {
                                    afgsVar.q();
                                    return;
                                } else {
                                    if (a == 9 || a == 10) {
                                        afgsVar.B();
                                        return;
                                    }
                                    return;
                                }
                            }
                            return;
                        case 1:
                            aheg ahegVar = (aheg) obj;
                            afgs afgsVar2 = l.s;
                            if (afgsVar2 != null) {
                                afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                return;
                            }
                            return;
                        case 2:
                            aisa aisaVar = l;
                            aigr aigrVar = (aigr) obj;
                            auij b = aisa.b(aisaVar.e);
                            afgs afgsVar3 = aisaVar.s;
                            if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                return;
                            }
                            afgsVar3.z(aigrVar.g, aigrVar.f);
                            return;
                        case 3:
                            aisa aisaVar2 = l;
                            aigr aigrVar2 = (aigr) obj;
                            auij b2 = aisa.b(aisaVar2.e);
                            afgs afgsVar4 = aisaVar2.s;
                            if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                return;
                            }
                            afgsVar4.z(aigrVar2.g, aigrVar2.f);
                            return;
                        case 4:
                            atwo atwoVar = (atwo) obj;
                            afgs afgsVar5 = l.s;
                            if (afgsVar5 != null) {
                                afgsVar5.H(atwoVar.n);
                                return;
                            }
                            return;
                        case 5:
                            Integer num = (Integer) obj;
                            afgs afgsVar6 = l.s;
                            if (afgsVar6 != null) {
                                afgsVar6.i(num.intValue());
                                return;
                            }
                            return;
                        case 6:
                            Throwable th = (Throwable) obj;
                            afgs afgsVar7 = l.s;
                            if (afgsVar7 != null) {
                                afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                return;
                            } else {
                                afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                return;
                            }
                        case 7:
                            aeqq aeqqVar = (aeqq) obj;
                            afgs afgsVar8 = l.s;
                            if (afgsVar8 != null) {
                                afgsVar8.r(aeqqVar);
                                return;
                            }
                            return;
                        case 8:
                            afih afihVar = (afih) obj;
                            afgs afgsVar9 = l.s;
                            if (afgsVar9 != null) {
                                afgsVar9.v(afihVar);
                                return;
                            }
                            return;
                        case 9:
                            ahco ahcoVar = (ahco) obj;
                            afgs afgsVar10 = l.s;
                            if (ahcoVar.c() && afgsVar10 != null) {
                                afgsVar10.E(ahcoVar.b());
                                return;
                            } else {
                                if (afgsVar10 != null) {
                                    afgsVar10.t(ahcoVar.b());
                                    return;
                                }
                                return;
                            }
                        case 10:
                            ahcr ahcrVar = (ahcr) obj;
                            afgs afgsVar11 = l.s;
                            if (afgsVar11 != null) {
                                afgsVar11.j(ahcrVar.a());
                                return;
                            }
                            return;
                        case 11:
                            final aisa aisaVar3 = l;
                            afgs afgsVar12 = aisaVar3.s;
                            if (afgsVar12 != null) {
                                if (aisaVar3.d()) {
                                    final int c2 = c == true ? 1 : 0;
                                    afgsVar12.s("dedi", new afgj() { // from class: airz
                                        @Override // defpackage.afgj
                                        public final String a(long j) {
                                            if (c2 != 0) {
                                                long d = aisaVar3.c.d();
                                                StringBuilder sb = new StringBuilder(27);
                                                double d2 = d - j;
                                                Double.isNaN(d2);
                                                sb.append(d2 / 1000.0d);
                                                sb.append(";su");
                                                return sb.toString();
                                            }
                                            long d3 = aisaVar3.c.d();
                                            StringBuilder sb2 = new StringBuilder(27);
                                            double d4 = d3 - j;
                                            Double.isNaN(d4);
                                            sb2.append(d4 / 1000.0d);
                                            sb2.append(";pi");
                                            return sb2.toString();
                                        }
                                    });
                                }
                                afgsVar12.y();
                                return;
                            }
                            return;
                        case 12:
                            ahcx ahcxVar = (ahcx) obj;
                            afgs afgsVar13 = l.s;
                            if (afgsVar13 != null) {
                                afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                return;
                            }
                            return;
                        case 13:
                            ahdx ahdxVar = (ahdx) obj;
                            afgs afgsVar14 = l.s;
                            if (afgsVar14 != null) {
                                afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                return;
                            }
                            return;
                        default:
                            final aisa aisaVar4 = l;
                            ahef ahefVar = (ahef) obj;
                            PlayerResponseModel b3 = ahefVar.b();
                            String e = ahefVar.e();
                            PlayerResponseModel a2 = ahefVar.a();
                            String k = ahefVar.k();
                            aign aignVar = aign.NEW;
                            int ordinal = ahefVar.c().ordinal();
                            if (ordinal == 3) {
                                afgs afgsVar15 = aisaVar4.s;
                                if (afgsVar15 != null) {
                                    if (aisaVar4.d()) {
                                        afgsVar15.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (i42 != 0) {
                                                    long d = aisaVar4.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar4.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar15.y();
                                    return;
                                }
                                return;
                            }
                            if (ordinal == 4 || ordinal == 5) {
                                if (a2 == null || b3 == null || k == null) {
                                    return;
                                }
                                aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                return;
                            }
                            if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                return;
                            }
                            aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                            return;
                    }
                }
            }));
            apep apepVar = aisa.b(l.e).C;
            if ((apepVar == null ? apep.a : apepVar).b) {
                final int i14 = 4;
                l.t.d(l.d.a().F().Y(new ayrs() { // from class: airy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        char c = 1;
                        final int i42 = 0;
                        switch (i14) {
                            case 0:
                                ahej ahejVar = (ahej) obj;
                                afgs afgsVar = l.s;
                                if (afgsVar != null) {
                                    int a = ahejVar.a();
                                    if (a == 2) {
                                        afgsVar.A();
                                        return;
                                    }
                                    if (a == 3) {
                                        afgsVar.w();
                                        return;
                                    }
                                    if (a == 5) {
                                        afgsVar.o();
                                        return;
                                    }
                                    if (a == 6) {
                                        afgsVar.x();
                                        return;
                                    }
                                    if (a == 7) {
                                        afgsVar.q();
                                        return;
                                    } else {
                                        if (a == 9 || a == 10) {
                                            afgsVar.B();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            case 1:
                                aheg ahegVar = (aheg) obj;
                                afgs afgsVar2 = l.s;
                                if (afgsVar2 != null) {
                                    afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                    return;
                                }
                                return;
                            case 2:
                                aisa aisaVar = l;
                                aigr aigrVar = (aigr) obj;
                                auij b = aisa.b(aisaVar.e);
                                afgs afgsVar3 = aisaVar.s;
                                if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                    return;
                                }
                                afgsVar3.z(aigrVar.g, aigrVar.f);
                                return;
                            case 3:
                                aisa aisaVar2 = l;
                                aigr aigrVar2 = (aigr) obj;
                                auij b2 = aisa.b(aisaVar2.e);
                                afgs afgsVar4 = aisaVar2.s;
                                if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                    return;
                                }
                                afgsVar4.z(aigrVar2.g, aigrVar2.f);
                                return;
                            case 4:
                                atwo atwoVar = (atwo) obj;
                                afgs afgsVar5 = l.s;
                                if (afgsVar5 != null) {
                                    afgsVar5.H(atwoVar.n);
                                    return;
                                }
                                return;
                            case 5:
                                Integer num = (Integer) obj;
                                afgs afgsVar6 = l.s;
                                if (afgsVar6 != null) {
                                    afgsVar6.i(num.intValue());
                                    return;
                                }
                                return;
                            case 6:
                                Throwable th = (Throwable) obj;
                                afgs afgsVar7 = l.s;
                                if (afgsVar7 != null) {
                                    afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                    return;
                                } else {
                                    afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                    return;
                                }
                            case 7:
                                aeqq aeqqVar = (aeqq) obj;
                                afgs afgsVar8 = l.s;
                                if (afgsVar8 != null) {
                                    afgsVar8.r(aeqqVar);
                                    return;
                                }
                                return;
                            case 8:
                                afih afihVar = (afih) obj;
                                afgs afgsVar9 = l.s;
                                if (afgsVar9 != null) {
                                    afgsVar9.v(afihVar);
                                    return;
                                }
                                return;
                            case 9:
                                ahco ahcoVar = (ahco) obj;
                                afgs afgsVar10 = l.s;
                                if (ahcoVar.c() && afgsVar10 != null) {
                                    afgsVar10.E(ahcoVar.b());
                                    return;
                                } else {
                                    if (afgsVar10 != null) {
                                        afgsVar10.t(ahcoVar.b());
                                        return;
                                    }
                                    return;
                                }
                            case 10:
                                ahcr ahcrVar = (ahcr) obj;
                                afgs afgsVar11 = l.s;
                                if (afgsVar11 != null) {
                                    afgsVar11.j(ahcrVar.a());
                                    return;
                                }
                                return;
                            case 11:
                                final aisa aisaVar3 = l;
                                afgs afgsVar12 = aisaVar3.s;
                                if (afgsVar12 != null) {
                                    if (aisaVar3.d()) {
                                        final int c2 = c == true ? 1 : 0;
                                        afgsVar12.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (c2 != 0) {
                                                    long d = aisaVar3.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar3.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar12.y();
                                    return;
                                }
                                return;
                            case 12:
                                ahcx ahcxVar = (ahcx) obj;
                                afgs afgsVar13 = l.s;
                                if (afgsVar13 != null) {
                                    afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                    return;
                                }
                                return;
                            case 13:
                                ahdx ahdxVar = (ahdx) obj;
                                afgs afgsVar14 = l.s;
                                if (afgsVar14 != null) {
                                    afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                    return;
                                }
                                return;
                            default:
                                final aisa aisaVar4 = l;
                                ahef ahefVar = (ahef) obj;
                                PlayerResponseModel b3 = ahefVar.b();
                                String e = ahefVar.e();
                                PlayerResponseModel a2 = ahefVar.a();
                                String k = ahefVar.k();
                                aign aignVar = aign.NEW;
                                int ordinal = ahefVar.c().ordinal();
                                if (ordinal == 3) {
                                    afgs afgsVar15 = aisaVar4.s;
                                    if (afgsVar15 != null) {
                                        if (aisaVar4.d()) {
                                            afgsVar15.s("dedi", new afgj() { // from class: airz
                                                @Override // defpackage.afgj
                                                public final String a(long j) {
                                                    if (i42 != 0) {
                                                        long d = aisaVar4.c.d();
                                                        StringBuilder sb = new StringBuilder(27);
                                                        double d2 = d - j;
                                                        Double.isNaN(d2);
                                                        sb.append(d2 / 1000.0d);
                                                        sb.append(";su");
                                                        return sb.toString();
                                                    }
                                                    long d3 = aisaVar4.c.d();
                                                    StringBuilder sb2 = new StringBuilder(27);
                                                    double d4 = d3 - j;
                                                    Double.isNaN(d4);
                                                    sb2.append(d4 / 1000.0d);
                                                    sb2.append(";pi");
                                                    return sb2.toString();
                                                }
                                            });
                                        }
                                        afgsVar15.y();
                                        return;
                                    }
                                    return;
                                }
                                if (ordinal == 4 || ordinal == 5) {
                                    if (a2 == null || b3 == null || k == null) {
                                        return;
                                    }
                                    aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                    return;
                                }
                                if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                    return;
                                }
                                aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                                return;
                        }
                    }
                }, new ayrs() { // from class: airy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        char c = 1;
                        final int i42 = 0;
                        switch (i3) {
                            case 0:
                                ahej ahejVar = (ahej) obj;
                                afgs afgsVar = l.s;
                                if (afgsVar != null) {
                                    int a = ahejVar.a();
                                    if (a == 2) {
                                        afgsVar.A();
                                        return;
                                    }
                                    if (a == 3) {
                                        afgsVar.w();
                                        return;
                                    }
                                    if (a == 5) {
                                        afgsVar.o();
                                        return;
                                    }
                                    if (a == 6) {
                                        afgsVar.x();
                                        return;
                                    }
                                    if (a == 7) {
                                        afgsVar.q();
                                        return;
                                    } else {
                                        if (a == 9 || a == 10) {
                                            afgsVar.B();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            case 1:
                                aheg ahegVar = (aheg) obj;
                                afgs afgsVar2 = l.s;
                                if (afgsVar2 != null) {
                                    afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                    return;
                                }
                                return;
                            case 2:
                                aisa aisaVar = l;
                                aigr aigrVar = (aigr) obj;
                                auij b = aisa.b(aisaVar.e);
                                afgs afgsVar3 = aisaVar.s;
                                if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                    return;
                                }
                                afgsVar3.z(aigrVar.g, aigrVar.f);
                                return;
                            case 3:
                                aisa aisaVar2 = l;
                                aigr aigrVar2 = (aigr) obj;
                                auij b2 = aisa.b(aisaVar2.e);
                                afgs afgsVar4 = aisaVar2.s;
                                if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                    return;
                                }
                                afgsVar4.z(aigrVar2.g, aigrVar2.f);
                                return;
                            case 4:
                                atwo atwoVar = (atwo) obj;
                                afgs afgsVar5 = l.s;
                                if (afgsVar5 != null) {
                                    afgsVar5.H(atwoVar.n);
                                    return;
                                }
                                return;
                            case 5:
                                Integer num = (Integer) obj;
                                afgs afgsVar6 = l.s;
                                if (afgsVar6 != null) {
                                    afgsVar6.i(num.intValue());
                                    return;
                                }
                                return;
                            case 6:
                                Throwable th = (Throwable) obj;
                                afgs afgsVar7 = l.s;
                                if (afgsVar7 != null) {
                                    afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                    return;
                                } else {
                                    afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                    return;
                                }
                            case 7:
                                aeqq aeqqVar = (aeqq) obj;
                                afgs afgsVar8 = l.s;
                                if (afgsVar8 != null) {
                                    afgsVar8.r(aeqqVar);
                                    return;
                                }
                                return;
                            case 8:
                                afih afihVar = (afih) obj;
                                afgs afgsVar9 = l.s;
                                if (afgsVar9 != null) {
                                    afgsVar9.v(afihVar);
                                    return;
                                }
                                return;
                            case 9:
                                ahco ahcoVar = (ahco) obj;
                                afgs afgsVar10 = l.s;
                                if (ahcoVar.c() && afgsVar10 != null) {
                                    afgsVar10.E(ahcoVar.b());
                                    return;
                                } else {
                                    if (afgsVar10 != null) {
                                        afgsVar10.t(ahcoVar.b());
                                        return;
                                    }
                                    return;
                                }
                            case 10:
                                ahcr ahcrVar = (ahcr) obj;
                                afgs afgsVar11 = l.s;
                                if (afgsVar11 != null) {
                                    afgsVar11.j(ahcrVar.a());
                                    return;
                                }
                                return;
                            case 11:
                                final aisa aisaVar3 = l;
                                afgs afgsVar12 = aisaVar3.s;
                                if (afgsVar12 != null) {
                                    if (aisaVar3.d()) {
                                        final int c2 = c == true ? 1 : 0;
                                        afgsVar12.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (c2 != 0) {
                                                    long d = aisaVar3.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar3.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar12.y();
                                    return;
                                }
                                return;
                            case 12:
                                ahcx ahcxVar = (ahcx) obj;
                                afgs afgsVar13 = l.s;
                                if (afgsVar13 != null) {
                                    afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                    return;
                                }
                                return;
                            case 13:
                                ahdx ahdxVar = (ahdx) obj;
                                afgs afgsVar14 = l.s;
                                if (afgsVar14 != null) {
                                    afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                    return;
                                }
                                return;
                            default:
                                final aisa aisaVar4 = l;
                                ahef ahefVar = (ahef) obj;
                                PlayerResponseModel b3 = ahefVar.b();
                                String e = ahefVar.e();
                                PlayerResponseModel a2 = ahefVar.a();
                                String k = ahefVar.k();
                                aign aignVar = aign.NEW;
                                int ordinal = ahefVar.c().ordinal();
                                if (ordinal == 3) {
                                    afgs afgsVar15 = aisaVar4.s;
                                    if (afgsVar15 != null) {
                                        if (aisaVar4.d()) {
                                            afgsVar15.s("dedi", new afgj() { // from class: airz
                                                @Override // defpackage.afgj
                                                public final String a(long j) {
                                                    if (i42 != 0) {
                                                        long d = aisaVar4.c.d();
                                                        StringBuilder sb = new StringBuilder(27);
                                                        double d2 = d - j;
                                                        Double.isNaN(d2);
                                                        sb.append(d2 / 1000.0d);
                                                        sb.append(";su");
                                                        return sb.toString();
                                                    }
                                                    long d3 = aisaVar4.c.d();
                                                    StringBuilder sb2 = new StringBuilder(27);
                                                    double d4 = d3 - j;
                                                    Double.isNaN(d4);
                                                    sb2.append(d4 / 1000.0d);
                                                    sb2.append(";pi");
                                                    return sb2.toString();
                                                }
                                            });
                                        }
                                        afgsVar15.y();
                                        return;
                                    }
                                    return;
                                }
                                if (ordinal == 4 || ordinal == 5) {
                                    if (a2 == null || b3 == null || k == null) {
                                        return;
                                    }
                                    aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                    return;
                                }
                                if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                    return;
                                }
                                aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                                return;
                        }
                    }
                }));
            }
            apep apepVar2 = aisa.b(l.e).C;
            if ((apepVar2 == null ? apep.a : apepVar2).h) {
                final int i15 = 5;
                l.t.d(l.r.F().Y(new ayrs() { // from class: airy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        char c = 1;
                        final int i42 = 0;
                        switch (i15) {
                            case 0:
                                ahej ahejVar = (ahej) obj;
                                afgs afgsVar = l.s;
                                if (afgsVar != null) {
                                    int a = ahejVar.a();
                                    if (a == 2) {
                                        afgsVar.A();
                                        return;
                                    }
                                    if (a == 3) {
                                        afgsVar.w();
                                        return;
                                    }
                                    if (a == 5) {
                                        afgsVar.o();
                                        return;
                                    }
                                    if (a == 6) {
                                        afgsVar.x();
                                        return;
                                    }
                                    if (a == 7) {
                                        afgsVar.q();
                                        return;
                                    } else {
                                        if (a == 9 || a == 10) {
                                            afgsVar.B();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            case 1:
                                aheg ahegVar = (aheg) obj;
                                afgs afgsVar2 = l.s;
                                if (afgsVar2 != null) {
                                    afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                    return;
                                }
                                return;
                            case 2:
                                aisa aisaVar = l;
                                aigr aigrVar = (aigr) obj;
                                auij b = aisa.b(aisaVar.e);
                                afgs afgsVar3 = aisaVar.s;
                                if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                    return;
                                }
                                afgsVar3.z(aigrVar.g, aigrVar.f);
                                return;
                            case 3:
                                aisa aisaVar2 = l;
                                aigr aigrVar2 = (aigr) obj;
                                auij b2 = aisa.b(aisaVar2.e);
                                afgs afgsVar4 = aisaVar2.s;
                                if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                    return;
                                }
                                afgsVar4.z(aigrVar2.g, aigrVar2.f);
                                return;
                            case 4:
                                atwo atwoVar = (atwo) obj;
                                afgs afgsVar5 = l.s;
                                if (afgsVar5 != null) {
                                    afgsVar5.H(atwoVar.n);
                                    return;
                                }
                                return;
                            case 5:
                                Integer num = (Integer) obj;
                                afgs afgsVar6 = l.s;
                                if (afgsVar6 != null) {
                                    afgsVar6.i(num.intValue());
                                    return;
                                }
                                return;
                            case 6:
                                Throwable th = (Throwable) obj;
                                afgs afgsVar7 = l.s;
                                if (afgsVar7 != null) {
                                    afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                    return;
                                } else {
                                    afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                    return;
                                }
                            case 7:
                                aeqq aeqqVar = (aeqq) obj;
                                afgs afgsVar8 = l.s;
                                if (afgsVar8 != null) {
                                    afgsVar8.r(aeqqVar);
                                    return;
                                }
                                return;
                            case 8:
                                afih afihVar = (afih) obj;
                                afgs afgsVar9 = l.s;
                                if (afgsVar9 != null) {
                                    afgsVar9.v(afihVar);
                                    return;
                                }
                                return;
                            case 9:
                                ahco ahcoVar = (ahco) obj;
                                afgs afgsVar10 = l.s;
                                if (ahcoVar.c() && afgsVar10 != null) {
                                    afgsVar10.E(ahcoVar.b());
                                    return;
                                } else {
                                    if (afgsVar10 != null) {
                                        afgsVar10.t(ahcoVar.b());
                                        return;
                                    }
                                    return;
                                }
                            case 10:
                                ahcr ahcrVar = (ahcr) obj;
                                afgs afgsVar11 = l.s;
                                if (afgsVar11 != null) {
                                    afgsVar11.j(ahcrVar.a());
                                    return;
                                }
                                return;
                            case 11:
                                final aisa aisaVar3 = l;
                                afgs afgsVar12 = aisaVar3.s;
                                if (afgsVar12 != null) {
                                    if (aisaVar3.d()) {
                                        final int c2 = c == true ? 1 : 0;
                                        afgsVar12.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (c2 != 0) {
                                                    long d = aisaVar3.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar3.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar12.y();
                                    return;
                                }
                                return;
                            case 12:
                                ahcx ahcxVar = (ahcx) obj;
                                afgs afgsVar13 = l.s;
                                if (afgsVar13 != null) {
                                    afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                    return;
                                }
                                return;
                            case 13:
                                ahdx ahdxVar = (ahdx) obj;
                                afgs afgsVar14 = l.s;
                                if (afgsVar14 != null) {
                                    afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                    return;
                                }
                                return;
                            default:
                                final aisa aisaVar4 = l;
                                ahef ahefVar = (ahef) obj;
                                PlayerResponseModel b3 = ahefVar.b();
                                String e = ahefVar.e();
                                PlayerResponseModel a2 = ahefVar.a();
                                String k = ahefVar.k();
                                aign aignVar = aign.NEW;
                                int ordinal = ahefVar.c().ordinal();
                                if (ordinal == 3) {
                                    afgs afgsVar15 = aisaVar4.s;
                                    if (afgsVar15 != null) {
                                        if (aisaVar4.d()) {
                                            afgsVar15.s("dedi", new afgj() { // from class: airz
                                                @Override // defpackage.afgj
                                                public final String a(long j) {
                                                    if (i42 != 0) {
                                                        long d = aisaVar4.c.d();
                                                        StringBuilder sb = new StringBuilder(27);
                                                        double d2 = d - j;
                                                        Double.isNaN(d2);
                                                        sb.append(d2 / 1000.0d);
                                                        sb.append(";su");
                                                        return sb.toString();
                                                    }
                                                    long d3 = aisaVar4.c.d();
                                                    StringBuilder sb2 = new StringBuilder(27);
                                                    double d4 = d3 - j;
                                                    Double.isNaN(d4);
                                                    sb2.append(d4 / 1000.0d);
                                                    sb2.append(";pi");
                                                    return sb2.toString();
                                                }
                                            });
                                        }
                                        afgsVar15.y();
                                        return;
                                    }
                                    return;
                                }
                                if (ordinal == 4 || ordinal == 5) {
                                    if (a2 == null || b3 == null || k == null) {
                                        return;
                                    }
                                    aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                    return;
                                }
                                if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                    return;
                                }
                                aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                                return;
                        }
                    }
                }, new ayrs() { // from class: airy
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        char c = 1;
                        final int i42 = 0;
                        switch (i3) {
                            case 0:
                                ahej ahejVar = (ahej) obj;
                                afgs afgsVar = l.s;
                                if (afgsVar != null) {
                                    int a = ahejVar.a();
                                    if (a == 2) {
                                        afgsVar.A();
                                        return;
                                    }
                                    if (a == 3) {
                                        afgsVar.w();
                                        return;
                                    }
                                    if (a == 5) {
                                        afgsVar.o();
                                        return;
                                    }
                                    if (a == 6) {
                                        afgsVar.x();
                                        return;
                                    }
                                    if (a == 7) {
                                        afgsVar.q();
                                        return;
                                    } else {
                                        if (a == 9 || a == 10) {
                                            afgsVar.B();
                                            return;
                                        }
                                        return;
                                    }
                                }
                                return;
                            case 1:
                                aheg ahegVar = (aheg) obj;
                                afgs afgsVar2 = l.s;
                                if (afgsVar2 != null) {
                                    afgsVar2.F(ahegVar.j(), ahegVar.g(), ahegVar.a());
                                    return;
                                }
                                return;
                            case 2:
                                aisa aisaVar = l;
                                aigr aigrVar = (aigr) obj;
                                auij b = aisa.b(aisaVar.e);
                                afgs afgsVar3 = aisaVar.s;
                                if (aigrVar.i != 4 || aisaVar.a == null || afgsVar3 == null || !b.e) {
                                    return;
                                }
                                afgsVar3.z(aigrVar.g, aigrVar.f);
                                return;
                            case 3:
                                aisa aisaVar2 = l;
                                aigr aigrVar2 = (aigr) obj;
                                auij b2 = aisa.b(aisaVar2.e);
                                afgs afgsVar4 = aisaVar2.s;
                                if (aigrVar2.i != 4 || aisaVar2.a == null || afgsVar4 == null || !b2.e) {
                                    return;
                                }
                                afgsVar4.z(aigrVar2.g, aigrVar2.f);
                                return;
                            case 4:
                                atwo atwoVar = (atwo) obj;
                                afgs afgsVar5 = l.s;
                                if (afgsVar5 != null) {
                                    afgsVar5.H(atwoVar.n);
                                    return;
                                }
                                return;
                            case 5:
                                Integer num = (Integer) obj;
                                afgs afgsVar6 = l.s;
                                if (afgsVar6 != null) {
                                    afgsVar6.i(num.intValue());
                                    return;
                                }
                                return;
                            case 6:
                                Throwable th = (Throwable) obj;
                                afgs afgsVar7 = l.s;
                                if (afgsVar7 != null) {
                                    afgsVar7.v(new afih(afif.DEFAULT, "rx", 0L, th));
                                    return;
                                } else {
                                    afsi.c(2, 10, "QoeStatsMonitor failed unexpectedly.", th);
                                    return;
                                }
                            case 7:
                                aeqq aeqqVar = (aeqq) obj;
                                afgs afgsVar8 = l.s;
                                if (afgsVar8 != null) {
                                    afgsVar8.r(aeqqVar);
                                    return;
                                }
                                return;
                            case 8:
                                afih afihVar = (afih) obj;
                                afgs afgsVar9 = l.s;
                                if (afgsVar9 != null) {
                                    afgsVar9.v(afihVar);
                                    return;
                                }
                                return;
                            case 9:
                                ahco ahcoVar = (ahco) obj;
                                afgs afgsVar10 = l.s;
                                if (ahcoVar.c() && afgsVar10 != null) {
                                    afgsVar10.E(ahcoVar.b());
                                    return;
                                } else {
                                    if (afgsVar10 != null) {
                                        afgsVar10.t(ahcoVar.b());
                                        return;
                                    }
                                    return;
                                }
                            case 10:
                                ahcr ahcrVar = (ahcr) obj;
                                afgs afgsVar11 = l.s;
                                if (afgsVar11 != null) {
                                    afgsVar11.j(ahcrVar.a());
                                    return;
                                }
                                return;
                            case 11:
                                final aisa aisaVar3 = l;
                                afgs afgsVar12 = aisaVar3.s;
                                if (afgsVar12 != null) {
                                    if (aisaVar3.d()) {
                                        final int c2 = c == true ? 1 : 0;
                                        afgsVar12.s("dedi", new afgj() { // from class: airz
                                            @Override // defpackage.afgj
                                            public final String a(long j) {
                                                if (c2 != 0) {
                                                    long d = aisaVar3.c.d();
                                                    StringBuilder sb = new StringBuilder(27);
                                                    double d2 = d - j;
                                                    Double.isNaN(d2);
                                                    sb.append(d2 / 1000.0d);
                                                    sb.append(";su");
                                                    return sb.toString();
                                                }
                                                long d3 = aisaVar3.c.d();
                                                StringBuilder sb2 = new StringBuilder(27);
                                                double d4 = d3 - j;
                                                Double.isNaN(d4);
                                                sb2.append(d4 / 1000.0d);
                                                sb2.append(";pi");
                                                return sb2.toString();
                                            }
                                        });
                                    }
                                    afgsVar12.y();
                                    return;
                                }
                                return;
                            case 12:
                                ahcx ahcxVar = (ahcx) obj;
                                afgs afgsVar13 = l.s;
                                if (afgsVar13 != null) {
                                    afgsVar13.k(ahcxVar.d() == null ? -1 : ahcxVar.d().i, ahcxVar.d() != null && ahcxVar.d().b(), ahcxVar.b(), ahcxVar.a());
                                    return;
                                }
                                return;
                            case 13:
                                ahdx ahdxVar = (ahdx) obj;
                                afgs afgsVar14 = l.s;
                                if (afgsVar14 != null) {
                                    afgsVar14.p(ahdxVar.b(), ahdxVar.i(), ahdxVar.j(), ahdxVar.e(), ahdxVar.f(), ahdxVar.g(), ahdxVar.h());
                                    return;
                                }
                                return;
                            default:
                                final aisa aisaVar4 = l;
                                ahef ahefVar = (ahef) obj;
                                PlayerResponseModel b3 = ahefVar.b();
                                String e = ahefVar.e();
                                PlayerResponseModel a2 = ahefVar.a();
                                String k = ahefVar.k();
                                aign aignVar = aign.NEW;
                                int ordinal = ahefVar.c().ordinal();
                                if (ordinal == 3) {
                                    afgs afgsVar15 = aisaVar4.s;
                                    if (afgsVar15 != null) {
                                        if (aisaVar4.d()) {
                                            afgsVar15.s("dedi", new afgj() { // from class: airz
                                                @Override // defpackage.afgj
                                                public final String a(long j) {
                                                    if (i42 != 0) {
                                                        long d = aisaVar4.c.d();
                                                        StringBuilder sb = new StringBuilder(27);
                                                        double d2 = d - j;
                                                        Double.isNaN(d2);
                                                        sb.append(d2 / 1000.0d);
                                                        sb.append(";su");
                                                        return sb.toString();
                                                    }
                                                    long d3 = aisaVar4.c.d();
                                                    StringBuilder sb2 = new StringBuilder(27);
                                                    double d4 = d3 - j;
                                                    Double.isNaN(d4);
                                                    sb2.append(d4 / 1000.0d);
                                                    sb2.append(";pi");
                                                    return sb2.toString();
                                                }
                                            });
                                        }
                                        afgsVar15.y();
                                        return;
                                    }
                                    return;
                                }
                                if (ordinal == 4 || ordinal == 5) {
                                    if (a2 == null || b3 == null || k == null) {
                                        return;
                                    }
                                    aisaVar4.c(a2.y(), k, aisaVar4.b, b3.c, a2.f().e, a2.c());
                                    return;
                                }
                                if ((ordinal != 7 && ordinal != 8) || b3 == null || e == null) {
                                    return;
                                }
                                aisaVar4.c(b3.y(), e, aisaVar4.b, b3.c, b3.f().e, b3.c());
                                return;
                        }
                    }
                }));
            }
        }
    }

    private final void E(int i) {
        ahbj.A(this.a, i);
        this.q.g(this.a, 4);
    }

    private final boolean F() {
        atyg F = aifk.F(this.e);
        return (F == null || !F.k) ? this.q.a().e() || (ahbj.B(this.q.b()) && this.q.a().a(aign.PLAYBACK_INTERRUPTED)) : !this.p;
    }

    @Override // defpackage.aixt
    public final String A() {
        return this.a.Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void B(boolean z) {
        if (!z) {
            this.c.l(new ahcv(this.a.Z()), this.a);
        }
        this.a.i().i();
    }

    public final void C() {
        aiws aiwsVar = this.b;
        aiwsVar.a.clear();
        aiwsVar.b.clear();
        this.a.m().k();
        this.a.o().e(false);
        this.a.o().d();
        this.a.i().g();
        this.a.i().l();
        ajbq p = this.a.p();
        p.e = 0L;
        p.f = -1L;
        p.g = 0L;
        p.h = 0L;
        p.i = 0L;
        p.k = 4;
        this.a.p().l = null;
        if (aifk.G(this.e)) {
            aisa aisaVar = this.d;
            afgs afgsVar = aisaVar.s;
            if (afgsVar != null) {
                aisaVar.q.deleteObserver(afgsVar);
                afgsVar.g();
            }
            aisaVar.t.qc();
        }
        this.p = true;
    }

    public final void D(int i) {
        aefq i2 = this.i.i();
        this.q.e(this.a, i, i2.c, i2.b, i2.e, i2.f);
    }

    @Override // defpackage.aixt
    public final PlayerResponseModel a() {
        return this.a.c();
    }

    @Override // defpackage.aixt
    public final aigd b() {
        return this.a.h();
    }

    @Override // defpackage.aixw
    public final aixx c() {
        return this.a.p();
    }

    @Override // defpackage.aesn
    public final void d() {
        if (F()) {
            if (aifk.z(this.n)) {
                D(4);
            }
            E(5);
        }
    }

    @Override // defpackage.aesn
    public final void e(FormatStreamModel formatStreamModel, long j, long j2, aesh[] aeshVarArr) {
        final aesg d;
        for (aesh aeshVar : aeshVarArr) {
            if (ahbj.B(this.q.b()) && aeshVar.a.equals("http://youtube.com/streaming/metadata/segment/102015") && formatStreamModel.C() && (d = aesg.d(j2, aeshVar)) != null) {
                this.o.post(new Runnable() { // from class: aixf
                    @Override // java.lang.Runnable
                    public final void run() {
                        aixg aixgVar = aixg.this;
                        aesg aesgVar = d;
                        aiwl aiwlVar = aixgVar.c;
                        ahcm ahcmVar = new ahcm(aesgVar, aixgVar.A());
                        ajbl ajblVar = aixgVar.a;
                        for (ajbh ajbhVar : aiwlVar.b) {
                        }
                        ajblVar.af().c(ahcmVar);
                    }
                });
            }
        }
        PlayerResponseModel a = a();
        if (a == null || a.c() == null || !a.c().aj()) {
            return;
        }
        ahcl ahclVar = new ahcl(aeshVarArr, formatStreamModel, j, j2);
        this.a.f().a(ahclVar, this.a.q());
        this.a.ab().c(ahclVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d0, code lost:
    
        if (r0.I() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        if (r12.a.q().h(r12.a.Z()) == false) goto L36;
     */
    @Override // defpackage.aesn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r12 = this;
            boolean r0 = r12.F()
            if (r0 == 0) goto Lee
            aixe r0 = r12.g
            r0.b()
            aiwo r1 = r12.q
            ajbl r2 = r12.a
            r3 = 4
            r4 = -1
            long r6 = defpackage.ahbj.v(r2)
            ajbl r0 = r12.a
            long r8 = defpackage.ahbj.v(r0)
            r10 = -1
            r1.e(r2, r3, r4, r6, r8, r10)
            ajbl r0 = r12.a
            aiqc r0 = r0.i()
            aiqm r1 = r0.b
            if (r1 == 0) goto L32
            boolean r2 = r0.f
            if (r2 == 0) goto L32
            r1.i()
        L32:
            aiqy r1 = r0.d
            if (r1 == 0) goto L39
            r1.b()
        L39:
            aiqs r0 = r0.c
            r1 = 7
            r2 = 0
            if (r0 == 0) goto L4f
            r0.i = r2
            r0.C = r1
            shf r3 = r0.d
            long r3 = r3.d()
            r0.b(r2, r3)
            r0.a()
        L4f:
            ajbl r0 = r12.a
            aixl r0 = r0.m()
            r0.g()
            aiwo r0 = r12.q
            aign r0 = r0.a()
            boolean r0 = r0.h()
            if (r0 == 0) goto L92
            ajbl r0 = r12.a
            defpackage.ahbj.A(r0, r1)
            aiwo r0 = r12.q
            ajbl r1 = r12.a
            r3 = 2
            r0.g(r1, r3)
            aiwo r0 = r12.q
            r0.c(r2)
            aiwo r0 = r12.q
            ajbl r1 = r12.a
            r2 = 3
            r0.g(r1, r2)
            aiwo r0 = r12.q
            ajbl r0 = r0.b()
            boolean r0 = defpackage.ahbj.B(r0)
            if (r0 != 0) goto Lee
            aiwl r0 = r12.c
            ajbl r1 = r12.a
            r0.i(r1)
            return
        L92:
            aiwo r0 = r12.q
            aign r0 = r0.a()
            aign r3 = defpackage.aign.PLAYBACK_INTERRUPTED
            if (r0 != r3) goto La8
            aiwo r0 = r12.q
            aiwq r0 = r0.a
            r3 = 1
            ajbr r2 = r0.az(r2, r2, r3)
            r0.j = r2
            goto Leb
        La8:
            ajbl r0 = r12.a
            ajbv r0 = r0.q()
            boolean r0 = r0.i()
            if (r0 == 0) goto Le4
            ajbl r0 = r12.a
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r0.c()
            aiwo r2 = r12.q
            ajbl r2 = r2.b()
            boolean r2 = defpackage.ahbj.B(r2)
            if (r2 == 0) goto Ld2
            if (r0 == 0) goto Leb
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r0 = r0.c
            if (r0 == 0) goto Leb
            boolean r0 = r0.I()
            if (r0 == 0) goto Leb
        Ld2:
            ajbl r0 = r12.a
            ajbv r0 = r0.q()
            ajbl r2 = r12.a
            java.lang.String r2 = r2.Z()
            boolean r0 = r0.h(r2)
            if (r0 == 0) goto Leb
        Le4:
            aiwo r0 = r12.q
            aiwq r0 = r0.a
            r0.S()
        Leb:
            r12.E(r1)
        Lee:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixg.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0210  */
    @Override // defpackage.aesn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.afih r14) {
        /*
            Method dump skipped, instructions count: 623
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixg.g(afih):void");
    }

    @Override // defpackage.aesn
    public final void h(aeqq aeqqVar) {
        this.a.i().c(aeqqVar);
        aiwl aiwlVar = this.c;
        ajbl ajblVar = this.a;
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).i(aeqqVar, ajblVar.Z());
        }
        ajblVar.ac().c(aeqqVar);
        afgs afgsVar = this.d.s;
        if (afgsVar == null || !aifk.G(this.e)) {
            return;
        }
        afgsVar.r(aeqqVar);
    }

    @Override // defpackage.aesn
    public final void i(String str, afgj afgjVar) {
        aiwl aiwlVar = this.c;
        String A = A();
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).j(str, afgjVar, A);
        }
        afgs afgsVar = this.d.s;
        if (afgsVar == null || !aifk.G(this.e)) {
            return;
        }
        afgsVar.s(str, afgjVar);
    }

    @Override // defpackage.aesn
    public final void j(afqu afquVar) {
        aiwl aiwlVar = this.c;
        String Z = this.a.Z();
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).m(Z);
        }
        afgs afgsVar = this.d.s;
        if (afgsVar == null || !aifk.G(this.e)) {
            return;
        }
        afgsVar.u();
    }

    @Override // defpackage.aesn
    public final void k(long j, long j2) {
        ahbj.y(this.a, j2);
        this.a.p().g = j;
    }

    @Override // defpackage.aesn
    public final void l(String str) {
        this.a.ah().c(ahcn.b(str));
    }

    @Override // defpackage.aesn
    public final void m() {
        long c = this.l.c();
        if (F()) {
            ahdb ahdbVar = new ahdb();
            ahdbVar.b(c);
            this.a.ak().c(ahdbVar);
            aiqc i = this.a.i();
            aiqm aiqmVar = i.b;
            if (aiqmVar != null && i.f) {
                aiqmVar.k();
            }
            aiqs aiqsVar = i.c;
            if (aiqsVar != null && aiqsVar.i) {
                aiqsVar.C = 3;
                aiqsVar.b(false, aiqsVar.d.d());
                aiqsVar.i = false;
            }
            this.a.m().h();
            E(3);
        }
    }

    @Override // defpackage.aesn
    public final void n() {
        if (F()) {
            if (aifk.z(this.n)) {
                D(4);
            }
            E(6);
        }
    }

    @Override // defpackage.aesn
    public final void o(long j) {
        if (F()) {
            this.a.ao().c(new ahct(ahbj.x(this.i), j));
            this.a.i().j(j);
            this.g.e = this.a.m().b(j, false);
            E(10);
        }
    }

    @Override // defpackage.aesn
    public final void p(float f2) {
        PlayerResponseModel c = this.q.b().c();
        aiwl aiwlVar = this.c;
        ahcr ahcrVar = new ahcr(ahbj.I(this.i, c).a(), c, f2);
        ajbl ajblVar = this.a;
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).ak(ahcrVar);
        }
        ajblVar.al().c(ahcrVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    @Override // defpackage.aesn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aixg.q():void");
    }

    @Override // defpackage.aesn
    public final void r() {
        this.q.f(2);
    }

    @Override // defpackage.aesn
    public final void s(long j) {
        if (aifk.s(this.n) && this.q.a().d()) {
            ahde ahdeVar = new ahde(ahbj.x(this.i), this.q.a().a(aign.INTERSTITIAL_PLAYING));
            if (j >= 0) {
                ahdeVar.i((j - this.l.c()) + this.l.d());
                ahdeVar.b(j);
            } else {
                ahdeVar.b(this.l.c());
            }
            aiwl.x(ahdeVar, this.a);
        }
    }

    @Override // defpackage.aesn
    public final void t(long j) {
        if (F()) {
            this.a.ao().c(new ahct(ahbj.x(this.i), j));
            this.a.i().j(j);
            this.g.e = this.a.m().b(j, false);
            E(9);
        }
    }

    @Override // defpackage.aesn
    public final void u(long j) {
        t(j);
    }

    @Override // defpackage.aesn
    public final void v() {
        if (this.q.a.as()) {
            this.q.f(1);
            if (F()) {
                aiqc i = this.a.i();
                aiqm aiqmVar = i.b;
                if (aiqmVar != null && i.f) {
                    aiqmVar.n();
                }
                aiqs aiqsVar = i.c;
                if (aiqsVar != null && aiqsVar.i) {
                    aiqsVar.C = 9;
                    aiqsVar.b(false, aiqsVar.d.d());
                    aiqsVar.i = false;
                }
                this.g.b();
                E(4);
            }
        }
    }

    @Override // defpackage.aesn
    public final void w(String str, String str2) {
        aiwl aiwlVar = this.c;
        String A = A();
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).s(str, str2, A);
        }
        afgs afgsVar = this.d.s;
        if (afgsVar == null || !aifk.G(this.e)) {
            return;
        }
        afgsVar.C(str, str2);
    }

    @Override // defpackage.aesn
    public final void x(int i) {
        this.h.i();
        this.a.aC().c(new ahea(i));
        aiwo aiwoVar = this.q;
        String Z = this.a.Z();
        aiwl aiwlVar = aiwoVar.a.b;
        aifb aifbVar = new aifb(15, i, Z);
        Iterator it = aiwlVar.b.iterator();
        while (it.hasNext()) {
            ((ajbh) it.next()).u(aifbVar);
        }
        afgs afgsVar = this.d.s;
        if (afgsVar == null || !aifk.G(this.e)) {
            return;
        }
        afgsVar.D(i);
    }

    @Override // defpackage.aesn
    public final void y(long j) {
        long c = this.l.c();
        if (F() && ahbj.B(this.q.b())) {
            this.a.i().i();
            this.c.e(this.a.Z());
            this.q.d(aign.PLAYBACK_INTERRUPTED);
        }
        aiwo aiwoVar = this.q;
        ajbl ajblVar = this.a;
        aiwoVar.e(ajblVar, 4, ajblVar.p().f, j, j, -1L);
        ajbu p = this.a.q().p(this.a.Z(), this.a.p().e);
        if (p != null) {
            this.a.au().c(new ahdq(p.e, c));
        }
    }

    @Override // defpackage.aesn
    public final void z(avzr avzrVar) {
        this.c.d(new ahco(avzrVar, false), this.a);
    }
}
