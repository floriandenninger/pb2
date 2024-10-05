package defpackage;

import android.content.Context;
import android.text.Spanned;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jln implements agzk, agys {
    public final ci a;
    public final jkv b;
    public final slv c;
    public final slr d;
    private final Context e;
    private final agzf f;
    private final jup g;
    private final fka h;
    private final azrw i;
    private final azrw j;
    private final jng k;
    private final fjs l;
    private final zgj m;
    private final axzg n;
    private final axzf o;

    public jln(Context context, ci ciVar, agzf agzfVar, jup jupVar, fka fkaVar, azrw azrwVar, azrw azrwVar2, axzf axzfVar, jng jngVar, jkv jkvVar, slv slvVar, slr slrVar, fjs fjsVar, zgj zgjVar, axzg axzgVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.e = context;
        this.a = ciVar;
        this.f = agzfVar;
        this.g = jupVar;
        this.h = fkaVar;
        this.i = azrwVar;
        this.j = azrwVar2;
        this.o = axzfVar;
        this.k = jngVar;
        this.b = jkvVar;
        this.c = slvVar;
        this.d = slrVar;
        this.l = fjsVar;
        this.m = zgjVar;
        this.n = axzgVar;
    }

    public static void a(atsb atsbVar, acra acraVar) {
        if (acraVar == null) {
            return;
        }
        acraVar.n(new acqx(acrb.DOWNLOAD_QUALITY_SELECTION_DIALOG));
        ahbj.l(atsbVar, acraVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void d(aok aokVar, anhy anhyVar, zfi zfiVar, zfi zfiVar2) {
        Boolean bool;
        aqvj aqvjVar = this.n.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45354988L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45354988L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45354988L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        if (bool.booleanValue()) {
            ynm.p(aokVar, anhyVar, zfiVar, zfiVar2);
        } else {
            ynm.n(aokVar, anhyVar, zfiVar, zfiVar2);
        }
    }

    private final void f(String str, String str2, atsb atsbVar, acra acraVar) {
        aqyg aqygVar;
        aqyg aqygVar2;
        agzf agzfVar = this.f;
        List<aqll> c = agnc.c(atsbVar);
        amru s = agzfVar.a.s();
        ArrayList arrayList = new ArrayList();
        for (aqll aqllVar : c) {
            if ((aqllVar.b & 2) != 0) {
                atrx b = atrx.b(aqllVar.d);
                if (b == null) {
                    b = atrx.UNKNOWN_FORMAT_TYPE;
                }
                if (s.contains(b)) {
                    arrayList.add(aqllVar);
                }
            }
        }
        Collections.sort(arrayList, agzfVar.a.e());
        amru o = amru.o(arrayList);
        aony aonyVar = atsbVar.f;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = aonyVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            atry atryVar = (atry) it.next();
            if ((atryVar.b & 2) != 0) {
                aqygVar = atryVar.d;
                if (aqygVar == null) {
                    aqygVar = aqyg.a;
                }
            } else {
                aqygVar = null;
            }
            Spanned b2 = ajcq.b(aqygVar);
            String obj = b2 != null ? b2.toString() : null;
            String str3 = atryVar.c;
            if (!ammx.e(obj) && !ammx.e(str3)) {
                aone createBuilder = aqli.a.createBuilder();
                createBuilder.copyOnWrite();
                aqli aqliVar = (aqli) createBuilder.instance;
                obj.getClass();
                aqliVar.b |= 2;
                aqliVar.d = obj;
                createBuilder.copyOnWrite();
                aqli aqliVar2 = (aqli) createBuilder.instance;
                str3.getClass();
                aqliVar2.b = 1 | aqliVar2.b;
                aqliVar2.c = str3;
                if ((atryVar.b & 4) != 0) {
                    aqygVar2 = atryVar.e;
                    if (aqygVar2 == null) {
                        aqygVar2 = aqyg.a;
                    }
                } else {
                    aqygVar2 = null;
                }
                Spanned b3 = ajcq.b(aqygVar2);
                String obj2 = b3 != null ? b3.toString() : null;
                if (!ammx.e(obj2)) {
                    createBuilder.copyOnWrite();
                    aqli aqliVar3 = (aqli) createBuilder.instance;
                    obj2.getClass();
                    aqliVar3.b |= 4;
                    aqliVar3.e = obj2;
                }
                arrayList2.add((aqli) createBuilder.build());
            }
        }
        amru o2 = amru.o(arrayList2);
        if (o.isEmpty()) {
            return;
        }
        if (ammx.e(str)) {
            c(atsbVar, o, o2, str, str2);
            a(atsbVar, acraVar);
            return;
        }
        agnv e = ((agof) this.i.get()).a().m().e(str);
        boolean z = e != null && e.s();
        boolean g = this.l.g(fhe.v(str));
        if ((!z && !g) || ((ysy) this.j.get()).o()) {
            str.getClass();
            this.f.b(this.a, atsbVar, str, o, new jlm(this, atsbVar, o2, str, str2, acraVar, o));
        } else {
            c(atsbVar, o, o2, str, str2);
            a(atsbVar, acraVar);
        }
    }

    public final void b(amru amruVar, final amru amruVar2, final String str, final String str2, final boolean z, final String str3, final ammv ammvVar) {
        final amru amruVar3;
        final ammv ammvVar2;
        amru g;
        final int i = 1;
        int lastIndexOf = ((List) Collection.EL.stream(amruVar).map(iur.o).collect(Collectors.toList())).lastIndexOf(atrv.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) + 1;
        final int i2 = 0;
        if (this.o.p()) {
            ArrayList arrayList = new ArrayList(amruVar);
            amrp f = amru.f();
            f.j(arrayList.subList(lastIndexOf, arrayList.size()));
            f.j(arrayList.subList(0, lastIndexOf));
            amruVar3 = f.g();
        } else {
            amruVar3 = amruVar;
        }
        atrx v = this.g.v(atrx.UNKNOWN_FORMAT_TYPE);
        Comparator comparator = ahab.f;
        ammv ammvVar3 = amlr.a;
        int size = amruVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                ammvVar2 = ammvVar3;
                break;
            }
            aqll aqllVar = (aqll) amruVar.get(i3);
            atrv b = atrv.b(aqllVar.f);
            if (b == null) {
                b = atrv.OFFLINEABILITY_AVAILABILITY_TYPE_UNKNOWN;
            }
            if (b != atrv.OFFLINEABILITY_AVAILABILITY_TYPE_PREMIUM_LOCKED) {
                if (v != atrx.UNKNOWN_FORMAT_TYPE) {
                    atrx b2 = atrx.b(aqllVar.d);
                    if (b2 == null) {
                        b2 = atrx.UNKNOWN_FORMAT_TYPE;
                    }
                    if (v == b2) {
                        ammvVar2 = ammv.j(aqllVar);
                        break;
                    }
                }
                if (!ammvVar3.h() || comparator.compare((aqll) ammvVar3.c(), aqllVar) > 0) {
                    ammvVar3 = ammv.j(aqllVar);
                }
            }
            i3++;
        }
        if (lastIndexOf == 0) {
            g = amru.q();
        } else if (!this.o.p()) {
            amrp f2 = amru.f();
            aone createBuilder = aqln.a.createBuilder();
            createBuilder.copyOnWrite();
            aqln aqlnVar = (aqln) createBuilder.instance;
            aqlnVar.c = 1;
            aqlnVar.b |= 1;
            createBuilder.copyOnWrite();
            aqln aqlnVar2 = (aqln) createBuilder.instance;
            aqlnVar2.b |= 2;
            aqlnVar2.d = lastIndexOf;
            f2.h((aqln) createBuilder.build());
            aone createBuilder2 = aqln.a.createBuilder();
            createBuilder2.copyOnWrite();
            aqln aqlnVar3 = (aqln) createBuilder2.instance;
            aqlnVar3.c = 2;
            aqlnVar3.b |= 1;
            createBuilder2.copyOnWrite();
            aqln aqlnVar4 = (aqln) createBuilder2.instance;
            aqlnVar4.b = 2 | aqlnVar4.b;
            aqlnVar4.d = 0;
            f2.h((aqln) createBuilder2.build());
            g = f2.g();
        } else {
            amrp f3 = amru.f();
            aone createBuilder3 = aqln.a.createBuilder();
            createBuilder3.copyOnWrite();
            aqln aqlnVar5 = (aqln) createBuilder3.instance;
            aqlnVar5.c = 2;
            aqlnVar5.b |= 1;
            int size2 = amruVar.size();
            createBuilder3.copyOnWrite();
            aqln aqlnVar6 = (aqln) createBuilder3.instance;
            aqlnVar6.b = 2 | aqlnVar6.b;
            aqlnVar6.d = size2 - lastIndexOf;
            f3.h((aqln) createBuilder3.build());
            g = f3.g();
        }
        final amru amruVar4 = g;
        final int o = this.o.o();
        if (!yjk.aa(this.e)) {
            ci ciVar = this.a;
            final jng jngVar = this.k;
            final int i4 = 1;
            d(ciVar, jngVar.c.submit(new Callable() { // from class: jnf
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    aone aoneVar;
                    if (i4 == 0) {
                        jng jngVar2 = jngVar;
                        amru amruVar5 = amruVar3;
                        ammv ammvVar4 = ammvVar2;
                        amru amruVar6 = amruVar2;
                        String str4 = str;
                        String str5 = str2;
                        boolean z2 = z;
                        String str6 = str3;
                        amru amruVar7 = amruVar4;
                        int i5 = o;
                        ammv ammvVar5 = ammvVar;
                        aone createBuilder4 = aqlu.a.createBuilder();
                        aone createBuilder5 = aqlv.a.createBuilder();
                        boolean isEmpty = amruVar6.isEmpty();
                        aqlp a = jngVar2.a(amruVar5, amruVar6, amruVar7, i5, null, isEmpty);
                        aqls b3 = jngVar2.b(amruVar5, str4, str5, new int[]{1, 2, 3}[1], ammvVar5, null, isEmpty);
                        if (amruVar5.isEmpty()) {
                            aoneVar = createBuilder5;
                        } else {
                            aqll aqllVar2 = (aqll) ammvVar4.c();
                            createBuilder5.copyOnWrite();
                            aoneVar = createBuilder5;
                            aqlv aqlvVar = (aqlv) aoneVar.instance;
                            aqlvVar.d = aqllVar2;
                            aqlvVar.b |= 2;
                        }
                        if (!amruVar6.isEmpty()) {
                            aqli aqliVar = (aqli) amruVar6.get(0);
                            aoneVar.copyOnWrite();
                            aqlv aqlvVar2 = (aqlv) aoneVar.instance;
                            aqliVar.getClass();
                            aqlvVar2.e = aqliVar;
                            aqlvVar2.b |= 4;
                        }
                        aone createBuilder6 = aqlr.a.createBuilder();
                        createBuilder6.copyOnWrite();
                        aqlr aqlrVar = (aqlr) createBuilder6.instance;
                        aqlrVar.b |= 2;
                        aqlrVar.c = true;
                        createBuilder4.copyOnWrite();
                        aqlu aqluVar = (aqlu) createBuilder4.instance;
                        aqlr aqlrVar2 = (aqlr) createBuilder6.build();
                        aqlrVar2.getClass();
                        aqluVar.d = aqlrVar2;
                        aqluVar.c |= 2048;
                        createBuilder4.copyOnWrite();
                        aqlu aqluVar2 = (aqlu) createBuilder4.instance;
                        a.getClass();
                        aqluVar2.g = a;
                        aqluVar2.c |= 536870912;
                        createBuilder4.copyOnWrite();
                        aqlu aqluVar3 = (aqlu) createBuilder4.instance;
                        b3.getClass();
                        aqluVar3.h = b3;
                        aqluVar3.c |= 1073741824;
                        aoneVar.copyOnWrite();
                        aqlv aqlvVar3 = (aqlv) aoneVar.instance;
                        aqlvVar3.b = 1 | aqlvVar3.b;
                        aqlvVar3.c = z2;
                        aqlv aqlvVar4 = (aqlv) aoneVar.build();
                        createBuilder4.copyOnWrite();
                        aqlu aqluVar4 = (aqlu) createBuilder4.instance;
                        aqlvVar4.getClass();
                        aqluVar4.e = aqlvVar4;
                        aqluVar4.c |= 131072;
                        createBuilder4.copyOnWrite();
                        aqlu aqluVar5 = (aqlu) createBuilder4.instance;
                        str6.getClass();
                        aqluVar5.c |= 262144;
                        aqluVar5.f = str6;
                        return jngVar2.d.a(R.raw.download_options_picker_element_android, aqlu.b, (aqlu) createBuilder4.build()).b(icu.n);
                    }
                    jng jngVar3 = jngVar;
                    amru amruVar8 = amruVar3;
                    ammv ammvVar6 = ammvVar2;
                    amru amruVar9 = amruVar2;
                    String str7 = str;
                    String str8 = str2;
                    boolean z3 = z;
                    String str9 = str3;
                    amru amruVar10 = amruVar4;
                    int i6 = o;
                    ammv ammvVar7 = ammvVar;
                    String concat = str9.concat("_selected_values");
                    aone createBuilder7 = aqlv.a.createBuilder();
                    createBuilder7.copyOnWrite();
                    aqlv aqlvVar5 = (aqlv) createBuilder7.instance;
                    aqlvVar5.b |= 1;
                    aqlvVar5.c = z3;
                    if (!amruVar8.isEmpty()) {
                        aqll aqllVar3 = (aqll) ammvVar6.c();
                        createBuilder7.copyOnWrite();
                        aqlv aqlvVar6 = (aqlv) createBuilder7.instance;
                        aqlvVar6.d = aqllVar3;
                        aqlvVar6.b |= 2;
                    }
                    if (!amruVar9.isEmpty()) {
                        aqli aqliVar2 = (aqli) amruVar9.get(0);
                        createBuilder7.copyOnWrite();
                        aqlv aqlvVar7 = (aqlv) createBuilder7.instance;
                        aqliVar2.getClass();
                        aqlvVar7.e = aqliVar2;
                        aqlvVar7.b |= 4;
                    }
                    aqlv aqlvVar8 = (aqlv) createBuilder7.build();
                    boolean isEmpty2 = amruVar9.isEmpty();
                    aqlp a2 = jngVar3.a(amruVar8, amruVar9, amruVar10, i6, concat, isEmpty2);
                    jni jniVar = jngVar3.d;
                    aonk aonkVar = aqlq.b;
                    aone createBuilder8 = aqlq.a.createBuilder();
                    createBuilder8.copyOnWrite();
                    aqlq aqlqVar = (aqlq) createBuilder8.instance;
                    a2.getClass();
                    aqlqVar.d = a2;
                    aqlqVar.c |= 1;
                    createBuilder8.copyOnWrite();
                    aqlq aqlqVar2 = (aqlq) createBuilder8.instance;
                    aqlvVar8.getClass();
                    aqlqVar2.e = aqlvVar8;
                    aqlqVar2.c |= 2;
                    createBuilder8.copyOnWrite();
                    aqlq aqlqVar3 = (aqlq) createBuilder8.instance;
                    str9.getClass();
                    aqlqVar3.c |= 64;
                    aqlqVar3.f = str9;
                    ammv a3 = jniVar.a(R.raw.download_options_picker_body_element_android, aonkVar, (aqlq) createBuilder8.build());
                    if (!a3.h()) {
                        return amlr.a;
                    }
                    aqls b4 = jngVar3.b(amruVar8, str7, str8, 3, ammvVar7, concat, isEmpty2);
                    jni jniVar2 = jngVar3.d;
                    aonk aonkVar2 = aqlt.b;
                    aone createBuilder9 = aqlt.a.createBuilder();
                    createBuilder9.copyOnWrite();
                    aqlt aqltVar = (aqlt) createBuilder9.instance;
                    b4.getClass();
                    aqltVar.d = b4;
                    aqltVar.c = 1 | aqltVar.c;
                    createBuilder9.copyOnWrite();
                    aqlt aqltVar2 = (aqlt) createBuilder9.instance;
                    aqlvVar8.getClass();
                    aqltVar2.e = aqlvVar8;
                    aqltVar2.c |= 2;
                    ammv a4 = jniVar2.a(R.raw.download_options_picker_footer_element_android, aonkVar2, (aqlt) createBuilder9.build());
                    if (!a4.h()) {
                        return amlr.a;
                    }
                    aong aongVar = (aong) awty.a.createBuilder();
                    awos awosVar = (awos) a3.c();
                    aongVar.copyOnWrite();
                    awty awtyVar = (awty) aongVar.instance;
                    aony aonyVar = awtyVar.f;
                    if (!aonyVar.c()) {
                        awtyVar.f = aonm.mutableCopy(aonyVar);
                    }
                    awtyVar.f.add(awosVar);
                    awos awosVar2 = (awos) a4.c();
                    aongVar.copyOnWrite();
                    awty awtyVar2 = (awty) aongVar.instance;
                    awtyVar2.e = awosVar2;
                    awtyVar2.c |= 2;
                    return ammv.j((awty) aongVar.build());
                }
            }), hue.u, new zfi(this) { // from class: jlk
                public final /* synthetic */ jln a;

                {
                    this.a = this;
                }

                @Override // defpackage.zfi
                public final void a(Object obj) {
                    if (i != 0) {
                        jln jlnVar = this.a;
                        ammv ammvVar4 = (ammv) obj;
                        if (ammvVar4 == null || !ammvVar4.h()) {
                            return;
                        }
                        jlnVar.d.d((awty) ammvVar4.c(), swu.a().a());
                        return;
                    }
                    jln jlnVar2 = this.a;
                    ammv ammvVar5 = (ammv) obj;
                    if (ammvVar5 == null || !ammvVar5.h()) {
                        return;
                    }
                    slv slvVar = jlnVar2.c;
                    awos awosVar = ((aqkj) ammvVar5.c()).h;
                    if (awosVar == null) {
                        awosVar = awos.a;
                    }
                    slvVar.b(awosVar, slu.a().a());
                }
            });
            return;
        }
        ci ciVar2 = this.a;
        final jng jngVar2 = this.k;
        final int i5 = 0;
        d(ciVar2, jngVar2.c.submit(new Callable() { // from class: jnf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aone aoneVar;
                if (i5 == 0) {
                    jng jngVar22 = jngVar2;
                    amru amruVar5 = amruVar3;
                    ammv ammvVar4 = ammvVar2;
                    amru amruVar6 = amruVar2;
                    String str4 = str;
                    String str5 = str2;
                    boolean z2 = z;
                    String str6 = str3;
                    amru amruVar7 = amruVar4;
                    int i52 = o;
                    ammv ammvVar5 = ammvVar;
                    aone createBuilder4 = aqlu.a.createBuilder();
                    aone createBuilder5 = aqlv.a.createBuilder();
                    boolean isEmpty = amruVar6.isEmpty();
                    aqlp a = jngVar22.a(amruVar5, amruVar6, amruVar7, i52, null, isEmpty);
                    aqls b3 = jngVar22.b(amruVar5, str4, str5, new int[]{1, 2, 3}[1], ammvVar5, null, isEmpty);
                    if (amruVar5.isEmpty()) {
                        aoneVar = createBuilder5;
                    } else {
                        aqll aqllVar2 = (aqll) ammvVar4.c();
                        createBuilder5.copyOnWrite();
                        aoneVar = createBuilder5;
                        aqlv aqlvVar = (aqlv) aoneVar.instance;
                        aqlvVar.d = aqllVar2;
                        aqlvVar.b |= 2;
                    }
                    if (!amruVar6.isEmpty()) {
                        aqli aqliVar = (aqli) amruVar6.get(0);
                        aoneVar.copyOnWrite();
                        aqlv aqlvVar2 = (aqlv) aoneVar.instance;
                        aqliVar.getClass();
                        aqlvVar2.e = aqliVar;
                        aqlvVar2.b |= 4;
                    }
                    aone createBuilder6 = aqlr.a.createBuilder();
                    createBuilder6.copyOnWrite();
                    aqlr aqlrVar = (aqlr) createBuilder6.instance;
                    aqlrVar.b |= 2;
                    aqlrVar.c = true;
                    createBuilder4.copyOnWrite();
                    aqlu aqluVar = (aqlu) createBuilder4.instance;
                    aqlr aqlrVar2 = (aqlr) createBuilder6.build();
                    aqlrVar2.getClass();
                    aqluVar.d = aqlrVar2;
                    aqluVar.c |= 2048;
                    createBuilder4.copyOnWrite();
                    aqlu aqluVar2 = (aqlu) createBuilder4.instance;
                    a.getClass();
                    aqluVar2.g = a;
                    aqluVar2.c |= 536870912;
                    createBuilder4.copyOnWrite();
                    aqlu aqluVar3 = (aqlu) createBuilder4.instance;
                    b3.getClass();
                    aqluVar3.h = b3;
                    aqluVar3.c |= 1073741824;
                    aoneVar.copyOnWrite();
                    aqlv aqlvVar3 = (aqlv) aoneVar.instance;
                    aqlvVar3.b = 1 | aqlvVar3.b;
                    aqlvVar3.c = z2;
                    aqlv aqlvVar4 = (aqlv) aoneVar.build();
                    createBuilder4.copyOnWrite();
                    aqlu aqluVar4 = (aqlu) createBuilder4.instance;
                    aqlvVar4.getClass();
                    aqluVar4.e = aqlvVar4;
                    aqluVar4.c |= 131072;
                    createBuilder4.copyOnWrite();
                    aqlu aqluVar5 = (aqlu) createBuilder4.instance;
                    str6.getClass();
                    aqluVar5.c |= 262144;
                    aqluVar5.f = str6;
                    return jngVar22.d.a(R.raw.download_options_picker_element_android, aqlu.b, (aqlu) createBuilder4.build()).b(icu.n);
                }
                jng jngVar3 = jngVar2;
                amru amruVar8 = amruVar3;
                ammv ammvVar6 = ammvVar2;
                amru amruVar9 = amruVar2;
                String str7 = str;
                String str8 = str2;
                boolean z3 = z;
                String str9 = str3;
                amru amruVar10 = amruVar4;
                int i6 = o;
                ammv ammvVar7 = ammvVar;
                String concat = str9.concat("_selected_values");
                aone createBuilder7 = aqlv.a.createBuilder();
                createBuilder7.copyOnWrite();
                aqlv aqlvVar5 = (aqlv) createBuilder7.instance;
                aqlvVar5.b |= 1;
                aqlvVar5.c = z3;
                if (!amruVar8.isEmpty()) {
                    aqll aqllVar3 = (aqll) ammvVar6.c();
                    createBuilder7.copyOnWrite();
                    aqlv aqlvVar6 = (aqlv) createBuilder7.instance;
                    aqlvVar6.d = aqllVar3;
                    aqlvVar6.b |= 2;
                }
                if (!amruVar9.isEmpty()) {
                    aqli aqliVar2 = (aqli) amruVar9.get(0);
                    createBuilder7.copyOnWrite();
                    aqlv aqlvVar7 = (aqlv) createBuilder7.instance;
                    aqliVar2.getClass();
                    aqlvVar7.e = aqliVar2;
                    aqlvVar7.b |= 4;
                }
                aqlv aqlvVar8 = (aqlv) createBuilder7.build();
                boolean isEmpty2 = amruVar9.isEmpty();
                aqlp a2 = jngVar3.a(amruVar8, amruVar9, amruVar10, i6, concat, isEmpty2);
                jni jniVar = jngVar3.d;
                aonk aonkVar = aqlq.b;
                aone createBuilder8 = aqlq.a.createBuilder();
                createBuilder8.copyOnWrite();
                aqlq aqlqVar = (aqlq) createBuilder8.instance;
                a2.getClass();
                aqlqVar.d = a2;
                aqlqVar.c |= 1;
                createBuilder8.copyOnWrite();
                aqlq aqlqVar2 = (aqlq) createBuilder8.instance;
                aqlvVar8.getClass();
                aqlqVar2.e = aqlvVar8;
                aqlqVar2.c |= 2;
                createBuilder8.copyOnWrite();
                aqlq aqlqVar3 = (aqlq) createBuilder8.instance;
                str9.getClass();
                aqlqVar3.c |= 64;
                aqlqVar3.f = str9;
                ammv a3 = jniVar.a(R.raw.download_options_picker_body_element_android, aonkVar, (aqlq) createBuilder8.build());
                if (!a3.h()) {
                    return amlr.a;
                }
                aqls b4 = jngVar3.b(amruVar8, str7, str8, 3, ammvVar7, concat, isEmpty2);
                jni jniVar2 = jngVar3.d;
                aonk aonkVar2 = aqlt.b;
                aone createBuilder9 = aqlt.a.createBuilder();
                createBuilder9.copyOnWrite();
                aqlt aqltVar = (aqlt) createBuilder9.instance;
                b4.getClass();
                aqltVar.d = b4;
                aqltVar.c = 1 | aqltVar.c;
                createBuilder9.copyOnWrite();
                aqlt aqltVar2 = (aqlt) createBuilder9.instance;
                aqlvVar8.getClass();
                aqltVar2.e = aqlvVar8;
                aqltVar2.c |= 2;
                ammv a4 = jniVar2.a(R.raw.download_options_picker_footer_element_android, aonkVar2, (aqlt) createBuilder9.build());
                if (!a4.h()) {
                    return amlr.a;
                }
                aong aongVar = (aong) awty.a.createBuilder();
                awos awosVar = (awos) a3.c();
                aongVar.copyOnWrite();
                awty awtyVar = (awty) aongVar.instance;
                aony aonyVar = awtyVar.f;
                if (!aonyVar.c()) {
                    awtyVar.f = aonm.mutableCopy(aonyVar);
                }
                awtyVar.f.add(awosVar);
                awos awosVar2 = (awos) a4.c();
                aongVar.copyOnWrite();
                awty awtyVar2 = (awty) aongVar.instance;
                awtyVar2.e = awosVar2;
                awtyVar2.c |= 2;
                return ammv.j((awty) aongVar.build());
            }
        }), jnh.a, new zfi(this) { // from class: jlk
            public final /* synthetic */ jln a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 != 0) {
                    jln jlnVar = this.a;
                    ammv ammvVar4 = (ammv) obj;
                    if (ammvVar4 == null || !ammvVar4.h()) {
                        return;
                    }
                    jlnVar.d.d((awty) ammvVar4.c(), swu.a().a());
                    return;
                }
                jln jlnVar2 = this.a;
                ammv ammvVar5 = (ammv) obj;
                if (ammvVar5 == null || !ammvVar5.h()) {
                    return;
                }
                slv slvVar = jlnVar2.c;
                awos awosVar = ((aqkj) ammvVar5.c()).h;
                if (awosVar == null) {
                    awosVar = awos.a;
                }
                slvVar.b(awosVar, slu.a().a());
            }
        });
    }

    public final void c(atsb atsbVar, final amru amruVar, final amru amruVar2, final String str, final String str2) {
        ammv ammvVar;
        final String a = this.m.a();
        if ((atsbVar.b & 128) != 0 && atsbVar.i.d() > 0) {
            ammvVar = ammv.j(atsbVar.i);
        } else {
            ammvVar = amlr.a;
        }
        final ammv ammvVar2 = ammvVar;
        ci ciVar = this.a;
        anhy a2 = this.h.a();
        final int i = 0;
        zfi zfiVar = new zfi(this) { // from class: jll
            public final /* synthetic */ jln a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i == 0) {
                    jln jlnVar = this.a;
                    amru amruVar3 = amruVar;
                    amru amruVar4 = amruVar2;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = a;
                    ammv ammvVar3 = ammvVar2;
                    String valueOf = String.valueOf((Throwable) obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Failed to read the offlineStreamSelection value.");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                    jlnVar.b(amruVar3, amruVar4, str3, str4, false, str5, ammvVar3);
                    return;
                }
                this.a.b(amruVar, amruVar2, str, str2, Boolean.TRUE.equals((Boolean) obj), a, ammvVar2);
            }
        };
        final int i2 = 1;
        d(ciVar, a2, zfiVar, new zfi(this) { // from class: jll
            public final /* synthetic */ jln a;

            {
                this.a = this;
            }

            @Override // defpackage.zfi
            public final void a(Object obj) {
                if (i2 == 0) {
                    jln jlnVar = this.a;
                    amru amruVar3 = amruVar;
                    amru amruVar4 = amruVar2;
                    String str3 = str;
                    String str4 = str2;
                    String str5 = a;
                    ammv ammvVar3 = ammvVar2;
                    String valueOf = String.valueOf((Throwable) obj);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                    sb.append("Failed to read the offlineStreamSelection value.");
                    sb.append(valueOf);
                    zga.b(sb.toString());
                    jlnVar.b(amruVar3, amruVar4, str3, str4, false, str5, ammvVar3);
                    return;
                }
                this.a.b(amruVar, amruVar2, str, str2, Boolean.TRUE.equals((Boolean) obj), a, ammvVar2);
            }
        });
    }

    @Override // defpackage.agys
    public final void e(atsb atsbVar, acra acraVar, agzo agzoVar, String str) {
        f(null, str, atsbVar, acraVar);
    }

    @Override // defpackage.agzk
    public final void g(agzm agzmVar) {
        this.b.g(agzmVar);
    }

    @Override // defpackage.agzk
    public final void h(String str, atsb atsbVar, acra acraVar, agzo agzoVar) {
        f(str, null, atsbVar, acraVar);
    }

    @Override // defpackage.agys
    public final void i(agzm agzmVar) {
        this.b.i(agzmVar);
    }

    @Override // defpackage.agys
    public final void j(agzm agzmVar, agyg agygVar) {
        this.b.j(agzmVar, agygVar);
    }

    @Override // defpackage.agzk
    public final void k(agzm agzmVar) {
        this.b.k(agzmVar);
    }

    @Override // defpackage.agzk
    public final void l(agzm agzmVar, String str, String str2) {
        this.b.l(agzmVar, str, str2);
    }

    @Override // defpackage.agzk
    public final void m(agzn agznVar) {
        this.b.m(agznVar);
    }

    @Override // defpackage.agzk
    public final void n(agzn agznVar) {
        this.b.n(agznVar);
    }

    @Override // defpackage.agzk
    public final void o(agzn agznVar, String str) {
        this.b.o(agznVar, str);
    }

    @Override // defpackage.agzk
    public final void p(agzn agznVar) {
        this.b.p(agznVar);
    }

    @Override // defpackage.agys
    public final void q(agzm agzmVar, agyg agygVar) {
        this.b.j(agzmVar, agygVar);
    }

    @Override // defpackage.agzk
    public final void r(agzm agzmVar) {
        this.b.r(agzmVar);
    }

    @Override // defpackage.agys
    public final void s(agxm agxmVar) {
        this.b.s(agxmVar);
    }

    @Override // defpackage.agys
    public final void u(agxm agxmVar) {
        this.b.u(agxmVar);
    }
}
