package defpackage;

import android.text.TextUtils;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acyc {
    public final shf b;
    public final acpl c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final double h;
    public final boolean i;
    public final vgz j;
    private static final String k = zga.a("MDX.devicemanager");
    public static final long a = TimeUnit.HOURS.toMillis(24);
    private static final long l = TimeUnit.DAYS.toMillis(31);

    public acyc(vgz vgzVar, shf shfVar, acun acunVar, acpl acplVar) {
        this.j = vgzVar;
        this.b = shfVar;
        this.c = acplVar;
        int i = acunVar.aa;
        this.d = i > 0 ? i : l;
        this.e = acunVar.aj > 0 ? TimeUnit.HOURS.toMillis(acunVar.aj) : 0L;
        this.f = acunVar.ak > 0 ? TimeUnit.HOURS.toMillis(acunVar.ak) : 0L;
        this.g = Math.max(acunVar.al, 0L);
        this.h = Math.max(acunVar.am, 0.0d);
        this.i = acunVar.at;
        ynm.j(vgzVar.b(new amml() { // from class: acxy
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                Iterator it;
                int i2;
                acyc acycVar = acyc.this;
                awva awvaVar = (awva) obj;
                long j = awvaVar.d;
                Map map = (Map) Collection.EL.stream(Collections.unmodifiableMap(awvaVar.c).entrySet()).sorted(unt.i).limit(100L).map(opb.u).collect(Collectors.toMap(opb.s, opb.t));
                aone createBuilder = awva.a.createBuilder();
                createBuilder.copyOnWrite();
                ((awva) createBuilder.instance).a().putAll(map);
                long c = acycVar.b.c();
                if (acycVar.e > 0) {
                    if (acyc.a + j >= c || c <= acycVar.e) {
                        createBuilder.copyOnWrite();
                        awva awvaVar2 = (awva) createBuilder.instance;
                        awvaVar2.b |= 1;
                        awvaVar2.d = j;
                    } else {
                        java.util.Collection values = map.values();
                        long j2 = c - acycVar.e;
                        aszx a2 = aszy.a();
                        Iterator it2 = values.iterator();
                        while (it2.hasNext()) {
                            int i3 = 0;
                            int i4 = 0;
                            int i5 = 0;
                            int i6 = 0;
                            int i7 = 0;
                            int i8 = 0;
                            for (awvb awvbVar : Collections.unmodifiableMap(((awux) it2.next()).e).values()) {
                                long j3 = c;
                                if (awvbVar.e >= j2) {
                                    int n = awxr.n(awvbVar.c);
                                    if (n == 0) {
                                        n = 1;
                                    }
                                    int i9 = n - 1;
                                    if (i9 == 1) {
                                        i2 = i8;
                                        i3++;
                                        int o = awxr.o(awvbVar.d);
                                        if (o != 0 && o == 3) {
                                            i4++;
                                        }
                                    } else if (i9 == 2) {
                                        i2 = i8;
                                        i5++;
                                        int o2 = awxr.o(awvbVar.d);
                                        if (o2 != 0 && o2 == 3) {
                                            i6++;
                                        }
                                    } else if (i9 == 3) {
                                        i7++;
                                        int o3 = awxr.o(awvbVar.d);
                                        if (o3 != 0 && o3 == 3) {
                                            i8++;
                                        } else {
                                            i2 = i8;
                                        }
                                    }
                                    i8 = i2;
                                }
                                c = j3;
                            }
                            long j4 = c;
                            int i10 = i8;
                            aone createBuilder2 = aszw.a.createBuilder();
                            if (i3 > 0) {
                                aone createBuilder3 = aszz.a.createBuilder();
                                createBuilder3.copyOnWrite();
                                aszz aszzVar = (aszz) createBuilder3.instance;
                                aszzVar.c = 1;
                                it = it2;
                                aszzVar.b |= 1;
                                createBuilder3.copyOnWrite();
                                aszz aszzVar2 = (aszz) createBuilder3.instance;
                                aszzVar2.b |= 2;
                                aszzVar2.d = i3;
                                createBuilder3.copyOnWrite();
                                aszz aszzVar3 = (aszz) createBuilder3.instance;
                                aszzVar3.b |= 4;
                                aszzVar3.e = i4;
                                createBuilder2.ax((aszz) createBuilder3.build());
                            } else {
                                it = it2;
                            }
                            if (i5 > 0) {
                                aone createBuilder4 = aszz.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                aszz aszzVar4 = (aszz) createBuilder4.instance;
                                aszzVar4.c = 2;
                                aszzVar4.b |= 1;
                                createBuilder4.copyOnWrite();
                                aszz aszzVar5 = (aszz) createBuilder4.instance;
                                aszzVar5.b |= 2;
                                aszzVar5.d = i5;
                                createBuilder4.copyOnWrite();
                                aszz aszzVar6 = (aszz) createBuilder4.instance;
                                aszzVar6.b |= 4;
                                aszzVar6.e = i6;
                                createBuilder2.ax((aszz) createBuilder4.build());
                            }
                            if (i7 > 0) {
                                aone createBuilder5 = aszz.a.createBuilder();
                                createBuilder5.copyOnWrite();
                                aszz aszzVar7 = (aszz) createBuilder5.instance;
                                aszzVar7.c = 5;
                                aszzVar7.b |= 1;
                                createBuilder5.copyOnWrite();
                                aszz aszzVar8 = (aszz) createBuilder5.instance;
                                aszzVar8.b |= 2;
                                aszzVar8.d = i7;
                                createBuilder5.copyOnWrite();
                                aszz aszzVar9 = (aszz) createBuilder5.instance;
                                aszzVar9.b |= 4;
                                aszzVar9.e = i10;
                                createBuilder2.ax((aszz) createBuilder5.build());
                            }
                            aszw aszwVar = (aszw) createBuilder2.build();
                            a2.copyOnWrite();
                            aszy.d((aszy) a2.instance, aszwVar);
                            it2 = it;
                            c = j4;
                        }
                        long hours = TimeUnit.MILLISECONDS.toHours(acycVar.e);
                        a2.copyOnWrite();
                        aszy.c((aszy) a2.instance, (int) hours);
                        acpl acplVar2 = acycVar.c;
                        arpn a3 = arpp.a();
                        a3.copyOnWrite();
                        ((arpp) a3.instance).cX((aszy) a2.build());
                        acplVar2.c((arpp) a3.build());
                        createBuilder.copyOnWrite();
                        awva awvaVar3 = (awva) createBuilder.instance;
                        awvaVar3.b |= 1;
                        awvaVar3.d = c;
                    }
                }
                return (awva) createBuilder.build();
            }
        }, angq.a), angq.a, abbr.n);
    }

    public final void d(final adgb adgbVar) {
        ynm.j(this.j.b(new amml() { // from class: acxz
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                acyc acycVar = acyc.this;
                adgb adgbVar2 = adgbVar;
                awva awvaVar = (awva) obj;
                String h = adgbVar2.h();
                awux awuxVar = awux.a;
                aoot aootVar = awvaVar.c;
                if (aootVar.containsKey(h)) {
                    awuxVar = (awux) aootVar.get(h);
                }
                aone builder = awuxVar.toBuilder();
                builder.copyOnWrite();
                awux awuxVar2 = (awux) builder.instance;
                awuxVar2.b |= 1;
                awuxVar2.c = h;
                awuy awuyVar = awuxVar2.d;
                if (awuyVar == null) {
                    awuyVar = awuy.a;
                }
                aone builder2 = awuyVar.toBuilder();
                String c = adgbVar2.c();
                builder2.copyOnWrite();
                awuy awuyVar2 = (awuy) builder2.instance;
                c.getClass();
                awuyVar2.b |= 8;
                awuyVar2.f = c;
                long c2 = acycVar.b.c();
                builder2.copyOnWrite();
                awuy awuyVar3 = (awuy) builder2.instance;
                awuyVar3.b |= 32;
                awuyVar3.h = c2;
                if (adgbVar2 instanceof adfu) {
                    builder2.copyOnWrite();
                    awuy awuyVar4 = (awuy) builder2.instance;
                    awuyVar4.g = 1;
                    awuyVar4.b |= 16;
                    String str = ((adfu) adgbVar2).a.e;
                    builder2.copyOnWrite();
                    awuy awuyVar5 = (awuy) builder2.instance;
                    str.getClass();
                    awuyVar5.b |= 2;
                    awuyVar5.d = str;
                } else if (adgbVar2 instanceof adfy) {
                    adfy adfyVar = (adfy) adgbVar2;
                    builder2.copyOnWrite();
                    awuy awuyVar6 = (awuy) builder2.instance;
                    awuyVar6.g = 2;
                    awuyVar6.b |= 16;
                    String str2 = adfyVar.d;
                    builder2.copyOnWrite();
                    awuy awuyVar7 = (awuy) builder2.instance;
                    str2.getClass();
                    awuyVar7.b |= 4;
                    awuyVar7.e = str2;
                    String str3 = adfyVar.g;
                    builder2.copyOnWrite();
                    awuy awuyVar8 = (awuy) builder2.instance;
                    str3.getClass();
                    awuyVar8.b |= 2;
                    awuyVar8.d = str3;
                    String str4 = adfyVar.f;
                    builder2.copyOnWrite();
                    awuy awuyVar9 = (awuy) builder2.instance;
                    str4.getClass();
                    awuyVar9.b |= 1;
                    awuyVar9.c = str4;
                    Map m = adfyVar.m();
                    if (m != null) {
                        String str5 = (String) m.get("brand");
                        if (!TextUtils.isEmpty(str5)) {
                            builder2.copyOnWrite();
                            awuy awuyVar10 = (awuy) builder2.instance;
                            str5.getClass();
                            awuyVar10.b |= 128;
                            awuyVar10.j = str5;
                        }
                        String str6 = (String) m.get("model");
                        if (!TextUtils.isEmpty(str6)) {
                            builder2.copyOnWrite();
                            awuy awuyVar11 = (awuy) builder2.instance;
                            str6.getClass();
                            awuyVar11.b |= 256;
                            awuyVar11.k = str6;
                        }
                    }
                    if (!adfyVar.p()) {
                        builder2.copyOnWrite();
                        awuy awuyVar12 = (awuy) builder2.instance;
                        awuyVar12.i = null;
                        awuyVar12.b &= -65;
                    } else {
                        awvc awvcVar = ((awuy) builder2.instance).i;
                        if (awvcVar == null) {
                            awvcVar = awvc.a;
                        }
                        aone builder3 = awvcVar.toBuilder();
                        String str7 = adfyVar.e;
                        builder3.copyOnWrite();
                        awvc awvcVar2 = (awvc) builder3.instance;
                        str7.getClass();
                        awvcVar2.b = 1 | awvcVar2.b;
                        awvcVar2.c = str7;
                        String str8 = adfyVar.j;
                        builder3.copyOnWrite();
                        awvc awvcVar3 = (awvc) builder3.instance;
                        str8.getClass();
                        awvcVar3.b |= 2;
                        awvcVar3.d = str8;
                        long j = adfyVar.k;
                        builder3.copyOnWrite();
                        awvc awvcVar4 = (awvc) builder3.instance;
                        awvcVar4.b |= 4;
                        awvcVar4.e = j;
                        long c3 = acycVar.b.c();
                        builder3.copyOnWrite();
                        awvc awvcVar5 = (awvc) builder3.instance;
                        awvcVar5.b |= 8;
                        awvcVar5.f = c3;
                        builder2.copyOnWrite();
                        awuy awuyVar13 = (awuy) builder2.instance;
                        awvc awvcVar6 = (awvc) builder3.build();
                        awvcVar6.getClass();
                        awuyVar13.i = awvcVar6;
                        awuyVar13.b |= 64;
                    }
                }
                builder.copyOnWrite();
                awux awuxVar3 = (awux) builder.instance;
                awuy awuyVar14 = (awuy) builder2.build();
                awuyVar14.getClass();
                awuxVar3.d = awuyVar14;
                awuxVar3.b |= 2;
                aone builder4 = awvaVar.toBuilder();
                builder4.bf(h, (awux) builder.build());
                return (awva) builder4.build();
            }
        }, angq.a), angq.a, abbr.o);
    }
}
