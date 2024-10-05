package defpackage;

import android.content.Context;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class spp implements axqr {
    public static sxy a(syk sykVar) {
        return sqb.b(sykVar, spa.b, 160982084, spo.a);
    }

    public static sot b(szj szjVar, sxd sxdVar, ammv ammvVar, syd sydVar, szc szcVar, axpg axpgVar, suz suzVar, azrw azrwVar, azrw azrwVar2, ammv ammvVar2, ammv ammvVar3, ammv ammvVar4, ammv ammvVar5, ammv ammvVar6, ammv ammvVar7, ammv ammvVar8, ammv ammvVar9) {
        return new sot(szjVar, sxdVar, ammvVar, sydVar, szcVar, axpgVar, suzVar, azrwVar, azrwVar2, ammvVar2, ammvVar3, ammvVar4, ammvVar5, ammvVar6, ammvVar7, ammvVar8, ammvVar9);
    }

    public static sxy c(syk sykVar, final sww swwVar, final stk stkVar, ammv ammvVar, final azrw azrwVar, final szz szzVar) {
        Boolean bool = true;
        final boolean booleanValue = ((Boolean) ammvVar.e(bool)).booleanValue();
        return sqb.c(sykVar, new spz() { // from class: snx
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                stk stkVar2 = stk.this;
                azrw azrwVar2 = azrwVar;
                boolean z = booleanValue;
                sww swwVar2 = swwVar;
                szz szzVar2 = szzVar;
                axol axolVar = (axol) obj;
                snu snuVar = new snu();
                snu.c(snuVar, dheVar, new snw());
                snuVar.a.A = stkVar2;
                snuVar.d.set(7);
                snuVar.a.d = sxcVar;
                snuVar.d.set(3);
                snuVar.a.b = axolVar;
                snuVar.d.set(1);
                snuVar.a.a = list;
                snuVar.d.set(0);
                if (sodVar != null) {
                    snuVar.a.E = sodVar;
                }
                if (z) {
                    AtomicReference atomicReference = sxcVar.w;
                    snw snwVar = snuVar.a;
                    snwVar.y = atomicReference;
                    snwVar.z = azrwVar2;
                }
                if (str != null) {
                    snuVar.a.e = str;
                }
                snuVar.a.c = swwVar2;
                snuVar.d.set(2);
                aoam aoamVar2 = new aoam();
                int b = axolVar.b(24);
                aoam aoamVar3 = null;
                if (b != 0) {
                    aoamVar2.f(axolVar.a(b + axolVar.a), axolVar.b);
                } else {
                    aoamVar2 = null;
                }
                snuVar.a.w = szzVar2.g(aoamVar2);
                snuVar.d.set(5);
                aoam aoamVar4 = new aoam();
                int b2 = axolVar.b(30);
                if (b2 != 0) {
                    aoamVar4.f(axolVar.a(b2 + axolVar.a), axolVar.b);
                } else {
                    aoamVar4 = null;
                }
                snuVar.a.v = szzVar2.g(aoamVar4);
                snuVar.d.set(4);
                aoam aoamVar5 = new aoam();
                int b3 = axolVar.b(32);
                if (b3 != 0) {
                    aoamVar5.f(axolVar.a(b3 + axolVar.a), axolVar.b);
                    aoamVar3 = aoamVar5;
                }
                snuVar.a.x = szzVar2.g(aoamVar3);
                snuVar.d.set(6);
                return snuVar;
            }
        }, 158796298, spo.c, bool.booleanValue());
    }

    public static sxy d(sot sotVar, syk sykVar) {
        return sqb.b(sykVar, sotVar, 168777401, spo.d);
    }

    public static sxy e(syk sykVar) {
        return sqb.b(sykVar, spb.a(), 158796327, spo.e);
    }

    public static sxh f(ammv ammvVar) {
        return (sxh) ammvVar.e(sxh.b);
    }

    public static sxy g(syk sykVar, final sww swwVar, final szl szlVar, final syd sydVar, final Map map) {
        final szz szzVar = new szz(sydVar);
        return sqb.b(sykVar, new spz() { // from class: spg
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                sww swwVar2 = sww.this;
                szz szzVar2 = szzVar;
                szl szlVar2 = szlVar;
                syd sydVar2 = sydVar;
                Map map2 = map;
                axos axosVar = (axos) obj;
                spd spdVar = new spd();
                spd.c(spdVar, dheVar, new spf());
                spdVar.a.a = swwVar2;
                spdVar.d.set(0);
                spdVar.a.c = axosVar;
                spdVar.d.set(2);
                aoam aoamVar2 = new aoam();
                int b = axosVar.b(12);
                aoam aoamVar3 = null;
                if (b != 0) {
                    aoamVar2.f(axosVar.a(b + axosVar.a), axosVar.b);
                } else {
                    aoamVar2 = null;
                }
                spdVar.a.g = szzVar2.g(aoamVar2);
                spdVar.d.set(5);
                aoam aoamVar4 = new aoam();
                int b2 = axosVar.b(14);
                if (b2 != 0) {
                    aoamVar4.f(axosVar.a(b2 + axosVar.a), axosVar.b);
                } else {
                    aoamVar4 = null;
                }
                spdVar.a.v = szzVar2.g(aoamVar4);
                spdVar.d.set(6);
                aoam aoamVar5 = new aoam();
                int b3 = axosVar.b(8);
                if (b3 != 0) {
                    aoamVar5.f(axosVar.a(b3 + axosVar.a), axosVar.b);
                } else {
                    aoamVar5 = null;
                }
                spdVar.a.w = szzVar2.g(aoamVar5);
                spdVar.d.set(7);
                aoam aoamVar6 = new aoam();
                int b4 = axosVar.b(10);
                if (b4 != 0) {
                    aoamVar6.f(axosVar.a(b4 + axosVar.a), axosVar.b);
                } else {
                    aoamVar6 = null;
                }
                spdVar.a.f = szzVar2.g(aoamVar6);
                spdVar.d.set(4);
                aoam aoamVar7 = new aoam();
                int b5 = axosVar.b(26);
                if (b5 != 0) {
                    aoamVar7.f(axosVar.a(b5 + axosVar.a), axosVar.b);
                    aoamVar3 = aoamVar7;
                }
                spdVar.a.x = szzVar2.g(aoamVar3);
                spdVar.d.set(8);
                spdVar.a.z = szlVar2;
                spdVar.d.set(10);
                spdVar.a.e = sydVar2;
                spdVar.d.set(3);
                spf spfVar = spdVar.a;
                spfVar.d = false;
                spfVar.b = sxcVar;
                spdVar.d.set(1);
                spdVar.a.y = map2;
                spdVar.d.set(9);
                return spdVar;
            }
        }, 191923252, spo.f);
    }

    public static sxy h(syk sykVar, final sww swwVar, final szl szlVar, final syd sydVar, final Map map, final sxh sxhVar) {
        final szz szzVar = new szz(sydVar);
        return sqb.b(sykVar, new spz() { // from class: sqn
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                szz szzVar2 = szz.this;
                sww swwVar2 = swwVar;
                szl szlVar2 = szlVar;
                syd sydVar2 = sydVar;
                sxh sxhVar2 = sxhVar;
                Map map2 = map;
                axot axotVar = (axot) obj;
                sqj sqjVar = new sqj();
                sqj.c(sqjVar, dheVar, new sql());
                aoam aoamVar2 = new aoam();
                int b = axotVar.b(28);
                aoam aoamVar3 = null;
                if (b != 0) {
                    aoamVar2.f(axotVar.a(b + axotVar.a), axotVar.b);
                } else {
                    aoamVar2 = null;
                }
                sqjVar.a.f = szzVar2.g(aoamVar2);
                sqjVar.d.set(5);
                aoam aoamVar4 = new aoam();
                int b2 = axotVar.b(30);
                if (b2 != 0) {
                    aoamVar4.f(axotVar.a(b2 + axotVar.a), axotVar.b);
                    aoamVar3 = aoamVar4;
                }
                sqjVar.a.a = szzVar2.g(aoamVar3);
                sqjVar.d.set(0);
                sqjVar.a.b = swwVar2;
                sqjVar.d.set(1);
                sqjVar.a.e = axotVar;
                sqjVar.d.set(4);
                sqjVar.a.w = szlVar2;
                sqjVar.d.set(8);
                sqjVar.a.g = sydVar2;
                sqjVar.d.set(6);
                sqjVar.a.c = sxcVar;
                sqjVar.d.set(2);
                sqjVar.a.d = sxhVar2.a();
                sqjVar.d.set(3);
                sqjVar.a.v = map2;
                sqjVar.d.set(7);
                return sqjVar;
            }
        }, 193805739, spo.g);
    }

    public static sxy i(sxy sxyVar, ammv ammvVar) {
        return (sxy) ammvVar.e(sxyVar);
    }

    public static sxy j(syk sykVar, final sww swwVar, final syd sydVar) {
        final szz szzVar = new szz(sydVar);
        return sqb.b(sykVar, new spz() { // from class: sqx
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                syd sydVar2 = syd.this;
                sww swwVar2 = swwVar;
                szz szzVar2 = szzVar;
                axpb axpbVar = (axpb) obj;
                sqs sqsVar = new sqs();
                sqs.c(sqsVar, dheVar, new sqt());
                sqsVar.a.f = spb.b(aoamVar);
                sqsVar.d.set(3);
                sqsVar.a.c = list;
                sqsVar.d.set(0);
                sqsVar.a.v = sydVar2;
                sqsVar.d.set(4);
                sqsVar.a.d = swwVar2;
                sqsVar.d.set(1);
                sqsVar.a.z = axpbVar;
                sqsVar.d.set(8);
                aoam aoamVar2 = new aoam();
                int b = axpbVar.b(14);
                aoam aoamVar3 = null;
                if (b != 0) {
                    aoamVar2.f(axpbVar.a(b + axpbVar.a), axpbVar.b);
                } else {
                    aoamVar2 = null;
                }
                sqsVar.a.x = szzVar2.g(aoamVar2);
                sqsVar.d.set(6);
                aoam aoamVar4 = new aoam();
                int b2 = axpbVar.b(16);
                if (b2 != 0) {
                    aoamVar4.f(axpbVar.a(b2 + axpbVar.a), axpbVar.b);
                } else {
                    aoamVar4 = null;
                }
                sqsVar.a.w = szzVar2.g(aoamVar4);
                sqsVar.d.set(5);
                aoam aoamVar5 = new aoam();
                int b3 = axpbVar.b(18);
                if (b3 != 0) {
                    aoamVar5.f(axpbVar.a(b3 + axpbVar.a), axpbVar.b);
                    aoamVar3 = aoamVar5;
                }
                sqsVar.a.y = szzVar2.g(aoamVar3);
                sqsVar.d.set(7);
                sqsVar.a.e = sxcVar;
                sqsVar.d.set(2);
                return sqsVar;
            }
        }, 197633010, spo.h);
    }

    public static sxy k(syk sykVar, final sww swwVar, final szl szlVar, final syd sydVar, final Map map, final sxh sxhVar, ammv ammvVar, ammv ammvVar2) {
        final boolean booleanValue = ((Boolean) ammvVar.e(false)).booleanValue();
        final boolean booleanValue2 = ((Boolean) ammvVar2.e(false)).booleanValue();
        return sqb.b(sykVar, new spz() { // from class: srg
            @Override // defpackage.spz
            public final dgy a(dhe dheVar, sxc sxcVar, Object obj, String str, aoam aoamVar, sod sodVar, List list) {
                sww swwVar2 = sww.this;
                szl szlVar2 = szlVar;
                syd sydVar2 = sydVar;
                Map map2 = map;
                sxh sxhVar2 = sxhVar;
                boolean z = booleanValue;
                boolean z2 = booleanValue2;
                sqy a = sra.a(dheVar);
                a.e(swwVar2);
                a.j((axpe) obj);
                a.k(szlVar2);
                a.h(sydVar2);
                a.a.e = false;
                a.f(sxcVar);
                a.i(map2);
                a.g(sxhVar2.a());
                sra sraVar = a.a;
                sraVar.f = z;
                sraVar.g = z2;
                ByteBuffer k = szz.k(aoamVar, 168774549);
                if (k != null) {
                    axpc aJ = axpc.aJ(k);
                    if (aoaj.r(aJ, 16)) {
                        a.a.a = Boolean.valueOf(aJ.aK());
                    }
                }
                return a;
            }
        }, 158796380, spo.i);
    }

    public static srj l(Context context, syd sydVar) {
        return new srj(context, sydVar);
    }

    public static srm m(Map map, Map map2, syd sydVar) {
        return new srm(map, map2, sydVar);
    }

    public static srq n(sww swwVar, szz szzVar) {
        return new srq(swwVar, szzVar, 0);
    }

    public static IntersectionEngine o(final syd sydVar) {
        IntersectionEngine intersectionEngine = (IntersectionEngine) srx.a.a(new syw() { // from class: srt
            @Override // defpackage.syw
            public final Object a() {
                syd sydVar2 = syd.this;
                IntersectionEngine create = IntersectionEngine.create();
                if (create != null) {
                    return create;
                }
                sydVar2.b(28, "Failed to create IntersectionEngine.");
                return new srw();
            }
        });
        ayaw.k(intersectionEngine);
        return intersectionEngine;
    }

    public static sys p(final azrw azrwVar) {
        sys sysVar = (sys) srx.b.a(new syw() { // from class: srv
            @Override // defpackage.syw
            public final Object a() {
                return new sys(azrw.this);
            }
        });
        ayaw.k(sysVar);
        return sysVar;
    }

    public static syu q(final Map map) {
        syu syuVar = (syu) srx.c.a(new syw() { // from class: sru
            @Override // defpackage.syw
            public final Object a() {
                return new ssa(map);
            }
        });
        ayaw.k(syuVar);
        return syuVar;
    }

    public static ssb r() {
        return new ssb();
    }

    public static ssg s(Map map, Set set, swy swyVar, syd sydVar, Object obj, azrw azrwVar, azrw azrwVar2, ammv ammvVar, ammv ammvVar2, ammv ammvVar3, ayqi ayqiVar, azrw azrwVar3) {
        return new ssg(map, set, swyVar, sydVar, (ssi) obj, azrwVar, azrwVar2, ammvVar, ammvVar2, ammvVar3, ayqiVar, azrwVar3);
    }

    public static ssi t(syd sydVar) {
        return new ssi(sydVar);
    }

    public static srq u(sww swwVar, szz szzVar) {
        return new srq(swwVar, szzVar, 1);
    }

    @Override // defpackage.azrw
    public final /* synthetic */ Object get() {
        throw null;
    }
}
