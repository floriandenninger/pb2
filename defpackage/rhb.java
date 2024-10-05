package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.measurement.internal.EventParcel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rhb implements Callable {
    final /* synthetic */ EventParcel a;
    final /* synthetic */ String b;
    final /* synthetic */ rff c;

    public rhb(rff rffVar, EventParcel eventParcel, String str) {
        this.c = rffVar;
        this.a = eventParcel;
        this.b = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        rkk rkkVar;
        rev c;
        long j;
        byte[] bArr;
        this.c.a.w();
        rii riiVar = this.c.a.f;
        rki.R(riiVar);
        EventParcel eventParcel = this.a;
        String str = this.b;
        riiVar.n();
        rgt.A();
        qip.an(eventParcel);
        qip.ax(str);
        if (!riiVar.J().p(str, rfd.V)) {
            riiVar.aF().j.b("Generating ScionPayload disabled. packageName", str);
            bArr = new byte[0];
        } else {
            if (!"_iap".equals(eventParcel.a) && !"_iapx".equals(eventParcel.a)) {
                riiVar.aF().j.c("Generating a payload for this event is not available. package_name, event_name", str, eventParcel.a);
                return null;
            }
            aone createBuilder = rlc.a.createBuilder();
            riiVar.R().s();
            try {
                rdw f = riiVar.R().f(str);
                if (f == null) {
                    riiVar.aF().j.b("Log and bundle not available. package_name", str);
                    bArr = new byte[0];
                } else {
                    if (f.S()) {
                        aone createBuilder2 = rld.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        rld.d((rld) createBuilder2.instance);
                        createBuilder2.copyOnWrite();
                        rld.c((rld) createBuilder2.instance);
                        if (!TextUtils.isEmpty(f.m())) {
                            String m = f.m();
                            createBuilder2.copyOnWrite();
                            rld rldVar = (rld) createBuilder2.instance;
                            m.getClass();
                            rldVar.b |= 4096;
                            rldVar.r = m;
                        }
                        if (!TextUtils.isEmpty(f.o())) {
                            String o = f.o();
                            qip.an(o);
                            createBuilder2.copyOnWrite();
                            rld rldVar2 = (rld) createBuilder2.instance;
                            rldVar2.b |= 2048;
                            rldVar2.q = o;
                        }
                        if (!TextUtils.isEmpty(f.p())) {
                            String p = f.p();
                            qip.an(p);
                            createBuilder2.copyOnWrite();
                            rld rldVar3 = (rld) createBuilder2.instance;
                            rldVar3.b |= 8192;
                            rldVar3.s = p;
                        }
                        if (f.b() != -2147483648L) {
                            int b = (int) f.b();
                            createBuilder2.copyOnWrite();
                            rld rldVar4 = (rld) createBuilder2.instance;
                            rldVar4.b |= 33554432;
                            rldVar4.F = b;
                        }
                        long g = f.g();
                        createBuilder2.copyOnWrite();
                        rld rldVar5 = (rld) createBuilder2.instance;
                        rldVar5.b |= 16384;
                        rldVar5.t = g;
                        long e = f.e();
                        createBuilder2.copyOnWrite();
                        rld rldVar6 = (rld) createBuilder2.instance;
                        rldVar6.c |= 16;
                        rldVar6.O = e;
                        String s = f.s();
                        String l = f.l();
                        axve.b();
                        if (riiVar.J().p(f.m(), rfd.ae)) {
                            String r = f.r();
                            if (!TextUtils.isEmpty(s)) {
                                createBuilder2.copyOnWrite();
                                rld rldVar7 = (rld) createBuilder2.instance;
                                s.getClass();
                                rldVar7.b |= 4194304;
                                rldVar7.B = s;
                            } else if (!TextUtils.isEmpty(r)) {
                                createBuilder2.copyOnWrite();
                                rld rldVar8 = (rld) createBuilder2.instance;
                                r.getClass();
                                rldVar8.c |= 64;
                                rldVar8.Q = r;
                            } else if (!TextUtils.isEmpty(l)) {
                                createBuilder2.copyOnWrite();
                                rld rldVar9 = (rld) createBuilder2.instance;
                                l.getClass();
                                rldVar9.c |= 4;
                                rldVar9.L = l;
                            }
                        } else if (!TextUtils.isEmpty(s)) {
                            createBuilder2.copyOnWrite();
                            rld rldVar10 = (rld) createBuilder2.instance;
                            s.getClass();
                            rldVar10.b |= 4194304;
                            rldVar10.B = s;
                        } else if (!TextUtils.isEmpty(l)) {
                            createBuilder2.copyOnWrite();
                            rld rldVar11 = (rld) createBuilder2.instance;
                            l.getClass();
                            rldVar11.c |= 4;
                            rldVar11.L = l;
                        }
                        ren i = riiVar.j.i(str);
                        long d = f.d();
                        createBuilder2.copyOnWrite();
                        rld rldVar12 = (rld) createBuilder2.instance;
                        rldVar12.b |= 524288;
                        rldVar12.y = d;
                        if (riiVar.w.v() && riiVar.J().q(((rld) createBuilder2.instance).r) && i.g() && !TextUtils.isEmpty(null)) {
                            createBuilder2.copyOnWrite();
                            throw null;
                        }
                        String f2 = i.f();
                        createBuilder2.copyOnWrite();
                        rld rldVar13 = (rld) createBuilder2.instance;
                        f2.getClass();
                        rldVar13.c |= 128;
                        rldVar13.R = f2;
                        if (i.g()) {
                            Pair c2 = riiVar.T().c(f.m(), i);
                            if (f.R() && !TextUtils.isEmpty((CharSequence) c2.first)) {
                                try {
                                    Long.toString(eventParcel.d);
                                    String a = rii.a();
                                    createBuilder2.copyOnWrite();
                                    rld rldVar14 = (rld) createBuilder2.instance;
                                    a.getClass();
                                    rldVar14.b |= 65536;
                                    rldVar14.v = a;
                                    if (c2.second != null) {
                                        boolean booleanValue = ((Boolean) c2.second).booleanValue();
                                        createBuilder2.copyOnWrite();
                                        rld rldVar15 = (rld) createBuilder2.instance;
                                        rldVar15.b |= 131072;
                                        rldVar15.w = booleanValue;
                                    }
                                } catch (SecurityException e2) {
                                    riiVar.aF().j.b("Resettable device id encryption failed", e2.getMessage());
                                    bArr = new byte[0];
                                }
                            }
                        }
                        String b2 = riiVar.K().b();
                        createBuilder2.copyOnWrite();
                        rld rldVar16 = (rld) createBuilder2.instance;
                        b2.getClass();
                        rldVar16.b |= 256;
                        rldVar16.n = b2;
                        String c3 = riiVar.K().c();
                        createBuilder2.copyOnWrite();
                        rld rldVar17 = (rld) createBuilder2.instance;
                        c3.getClass();
                        rldVar17.b |= 128;
                        rldVar17.m = c3;
                        int a2 = (int) riiVar.K().a();
                        createBuilder2.copyOnWrite();
                        rld rldVar18 = (rld) createBuilder2.instance;
                        rldVar18.b |= 1024;
                        rldVar18.p = a2;
                        String d2 = riiVar.K().d();
                        createBuilder2.copyOnWrite();
                        rld rldVar19 = (rld) createBuilder2.instance;
                        d2.getClass();
                        rldVar19.b |= 512;
                        rldVar19.o = d2;
                        try {
                            if (i.h() && f.n() != null) {
                                qip.an(f.n());
                                Long.toString(eventParcel.d);
                                String a3 = rii.a();
                                createBuilder2.copyOnWrite();
                                rld rldVar20 = (rld) createBuilder2.instance;
                                a3.getClass();
                                rldVar20.b |= 262144;
                                rldVar20.x = a3;
                            }
                            if (!TextUtils.isEmpty(f.q())) {
                                String q = f.q();
                                qip.an(q);
                                createBuilder2.copyOnWrite();
                                rld rldVar21 = (rld) createBuilder2.instance;
                                rldVar21.b |= 16777216;
                                rldVar21.E = q;
                            }
                            String m2 = f.m();
                            List q2 = riiVar.R().q(m2);
                            Iterator it = q2.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    rkkVar = null;
                                    break;
                                }
                                rkkVar = (rkk) it.next();
                                if ("_lte".equals(rkkVar.c)) {
                                    break;
                                }
                            }
                            if (rkkVar == null) {
                                riiVar.Q();
                                rkk rkkVar2 = new rkk(m2, "auto", "_lte", System.currentTimeMillis(), 0L);
                                q2.add(rkkVar2);
                                riiVar.R().C(rkkVar2);
                            }
                            rkj U = riiVar.U();
                            U.aF().k.a("Checking account type status for ad personalization signals");
                            if (U.K().e()) {
                                String m3 = f.m();
                                qip.an(m3);
                                if (f.R() && U.S().f(m3)) {
                                    U.aF().j.a("Turning off ad personalization due to account type");
                                    Iterator it2 = q2.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if ("_npa".equals(((rkk) it2.next()).c)) {
                                            it2.remove();
                                            break;
                                        }
                                    }
                                    U.Q();
                                    q2.add(new rkk(m3, "auto", "_npa", System.currentTimeMillis(), 1L));
                                }
                            }
                            rlh[] rlhVarArr = new rlh[q2.size()];
                            for (int i2 = 0; i2 < q2.size(); i2++) {
                                aone createBuilder3 = rlh.a.createBuilder();
                                String str2 = ((rkk) q2.get(i2)).c;
                                createBuilder3.copyOnWrite();
                                rlh rlhVar = (rlh) createBuilder3.instance;
                                str2.getClass();
                                rlhVar.b |= 2;
                                rlhVar.d = str2;
                                long j2 = ((rkk) q2.get(i2)).d;
                                createBuilder3.copyOnWrite();
                                rlh rlhVar2 = (rlh) createBuilder3.instance;
                                rlhVar2.b |= 1;
                                rlhVar2.c = j2;
                                riiVar.U().B(createBuilder3, ((rkk) q2.get(i2)).e);
                                rlhVarArr[i2] = (rlh) createBuilder3.build();
                            }
                            List asList = Arrays.asList(rlhVarArr);
                            createBuilder2.copyOnWrite();
                            rld rldVar22 = (rld) createBuilder2.instance;
                            rldVar22.b();
                            aolo.addAll((Iterable) asList, (List) rldVar22.f);
                            rfq b3 = rfq.b(eventParcel);
                            riiVar.N().E(b3.d, riiVar.R().e(str));
                            riiVar.N().F(b3, riiVar.J().c(str));
                            Bundle bundle = b3.d;
                            bundle.putLong("_c", 1L);
                            riiVar.aF().j.a("Marking in-app purchase as real-time");
                            bundle.putLong("_r", 1L);
                            bundle.putString("_o", eventParcel.c);
                            if (riiVar.N().ai(((rld) createBuilder2.instance).r)) {
                                riiVar.N().R(bundle, "_dbg", 1L);
                                riiVar.N().R(bundle, "_r", 1L);
                            }
                            rev i3 = riiVar.R().i(str, eventParcel.a);
                            if (i3 == null) {
                                c = new rev(str, eventParcel.a, eventParcel.d);
                                j = 0;
                            } else {
                                long j3 = i3.f;
                                c = i3.c(eventParcel.d);
                                j = j3;
                            }
                            riiVar.R().y(c);
                            reu reuVar = new reu(riiVar.w, eventParcel.c, str, eventParcel.a, eventParcel.d, j, bundle);
                            rky e3 = rkz.e();
                            long j4 = reuVar.d;
                            e3.copyOnWrite();
                            ((rkz) e3.instance).C(j4);
                            String str3 = reuVar.b;
                            e3.copyOnWrite();
                            ((rkz) e3.instance).z(str3);
                            long j5 = reuVar.e;
                            e3.copyOnWrite();
                            ((rkz) e3.instance).B(j5);
                            Iterator it3 = reuVar.f.iterator();
                            while (it3.hasNext()) {
                                String next = ((rew) it3).next();
                                aone createBuilder4 = rlb.a.createBuilder();
                                createBuilder4.copyOnWrite();
                                rlb rlbVar = (rlb) createBuilder4.instance;
                                next.getClass();
                                rlbVar.b |= 1;
                                rlbVar.c = next;
                                Object b4 = reuVar.f.b(next);
                                if (b4 != null) {
                                    riiVar.U().A(createBuilder4, b4);
                                    e3.e(createBuilder4);
                                }
                            }
                            createBuilder2.q(e3);
                            aone createBuilder5 = rle.a.createBuilder();
                            aone createBuilder6 = rla.a.createBuilder();
                            long j6 = c.c;
                            createBuilder6.copyOnWrite();
                            rla rlaVar = (rla) createBuilder6.instance;
                            rlaVar.b |= 2;
                            rlaVar.d = j6;
                            String str4 = eventParcel.a;
                            createBuilder6.copyOnWrite();
                            rla rlaVar2 = (rla) createBuilder6.instance;
                            str4.getClass();
                            rlaVar2.b |= 1;
                            rlaVar2.c = str4;
                            createBuilder5.copyOnWrite();
                            rle rleVar = (rle) createBuilder5.instance;
                            rla rlaVar3 = (rla) createBuilder6.build();
                            rlaVar3.getClass();
                            aony aonyVar = rleVar.b;
                            if (!aonyVar.c()) {
                                rleVar.b = aonm.mutableCopy(aonyVar);
                            }
                            rleVar.b.add(rlaVar3);
                            createBuilder2.copyOnWrite();
                            rld rldVar23 = (rld) createBuilder2.instance;
                            rle rleVar2 = (rle) createBuilder5.build();
                            rleVar2.getClass();
                            rldVar23.M = rleVar2;
                            rldVar23.c |= 8;
                            createBuilder2.p(riiVar.j.e().a(f.m(), Collections.emptyList(), Collections.unmodifiableList(((rld) createBuilder2.instance).f), Long.valueOf(((rkz) e3.instance).d()), Long.valueOf(((rkz) e3.instance).d())));
                            if (((rkz) e3.instance).t()) {
                                long d3 = ((rkz) e3.instance).d();
                                createBuilder2.copyOnWrite();
                                rld rldVar24 = (rld) createBuilder2.instance;
                                rldVar24.b |= 4;
                                rldVar24.h = d3;
                                long d4 = ((rkz) e3.instance).d();
                                createBuilder2.copyOnWrite();
                                rld rldVar25 = (rld) createBuilder2.instance;
                                rldVar25.b |= 8;
                                rldVar25.i = d4;
                            }
                            long h = f.h();
                            if (h != 0) {
                                createBuilder2.copyOnWrite();
                                rld rldVar26 = (rld) createBuilder2.instance;
                                rldVar26.b |= 32;
                                rldVar26.k = h;
                            }
                            long j7 = f.j();
                            if (j7 != 0) {
                                createBuilder2.copyOnWrite();
                                rld rldVar27 = (rld) createBuilder2.instance;
                                rldVar27.b |= 16;
                                rldVar27.j = j7;
                            } else if (h != 0) {
                                createBuilder2.copyOnWrite();
                                rld rldVar28 = (rld) createBuilder2.instance;
                                rldVar28.b |= 16;
                                rldVar28.j = h;
                            }
                            f.v();
                            int i4 = (int) f.i();
                            createBuilder2.copyOnWrite();
                            rld rldVar29 = (rld) createBuilder2.instance;
                            rldVar29.b |= 1048576;
                            rldVar29.z = i4;
                            riiVar.J().y();
                            createBuilder2.copyOnWrite();
                            rld rldVar30 = (rld) createBuilder2.instance;
                            rldVar30.b |= 32768;
                            rldVar30.u = 44000L;
                            riiVar.Q();
                            long currentTimeMillis = System.currentTimeMillis();
                            createBuilder2.copyOnWrite();
                            rld rldVar31 = (rld) createBuilder2.instance;
                            rldVar31.b |= 2;
                            rldVar31.g = currentTimeMillis;
                            boolean booleanValue2 = Boolean.TRUE.booleanValue();
                            createBuilder2.copyOnWrite();
                            rld rldVar32 = (rld) createBuilder2.instance;
                            rldVar32.b |= 8388608;
                            rldVar32.C = booleanValue2;
                            createBuilder.Z(createBuilder2);
                            f.O(((rld) createBuilder2.instance).h);
                            f.M(((rld) createBuilder2.instance).i);
                            riiVar.R().x(f);
                            riiVar.R().w();
                            riiVar.R().t();
                            try {
                                return riiVar.U().t(((rlc) createBuilder.build()).toByteArray());
                            } catch (IOException e4) {
                                riiVar.aF().c.c("Data loss. Failed to bundle and serialize. appId", rfp.a(str), e4);
                                return null;
                            }
                        } catch (SecurityException e5) {
                            riiVar.aF().j.b("app instance id encryption failed", e5.getMessage());
                            byte[] bArr2 = new byte[0];
                            riiVar.R().t();
                            return bArr2;
                        }
                    }
                    riiVar.aF().j.b("Log and bundle disabled. package_name", str);
                    bArr = new byte[0];
                }
                riiVar.R().t();
            } catch (Throwable th) {
                riiVar.R().t();
                throw th;
            }
        }
        return bArr;
    }
}
