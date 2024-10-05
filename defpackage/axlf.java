package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axlf implements axlg {
    private static final Logger e = Logger.getLogger(axlf.class.getName());
    final Set a = new HashSet();
    final Set b = new HashSet();
    final HashMap c = new HashMap();
    final HashMap d = new HashMap();
    private axlh f;

    public static long a(long j, long j2) {
        return j2 == 0 ? j : a(j2, j % j2);
    }

    protected static long b(axlc axlcVar) {
        List e2 = axlcVar.e();
        if (e2.size() <= 0) {
            return axlcVar.a();
        }
        Iterator it = e2.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += ((axky) it.next()).b;
        }
        double d2 = axlcVar.j().b;
        Double.isNaN(d2);
        return Math.round(d * d2);
    }

    public static final long d(axkz axkzVar) {
        long j = ((axlc) axkzVar.d.iterator().next()).j().b;
        Iterator it = axkzVar.d.iterator();
        while (it.hasNext()) {
            j = a(((axlc) it.next()).j().b, j);
        }
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r27v0, types: [axku] */
    /* JADX WARN: Type inference failed for: r29v0, types: [deb, axku] */
    /* JADX WARN: Type inference failed for: r2v16, types: [des, axku] */
    /* JADX WARN: Type inference failed for: r3v41, types: [deb, axkr, axku] */
    /* JADX WARN: Type inference failed for: r5v12, types: [deg] */
    @Override // defpackage.axlg
    public final deg c(axkz axkzVar) {
        int i;
        deb debVar;
        deb debVar2;
        det detVar;
        Iterator it;
        HashMap hashMap;
        String str;
        dfk dfkVar;
        axkr axkrVar;
        dfm dfmVar;
        axku axkuVar;
        String str2;
        int i2;
        deq deqVar;
        int[] iArr;
        long j;
        dfe dfeVar;
        dfa dfaVar;
        String str3;
        HashMap hashMap2;
        Object obj;
        axkz axkzVar2 = axkzVar;
        if (this.f == null) {
            this.f = new axlh(axkzVar2);
        }
        Logger logger = e;
        Level level = Level.FINE;
        String valueOf = String.valueOf(axkzVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 15);
        sb.append("Creating movie ");
        sb.append(valueOf);
        String str4 = "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder";
        logger.logp(level, "com.googlecode.mp4parser.authoring.builder.DefaultMp4Builder", "build", sb.toString());
        Iterator it2 = axkzVar2.d.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            axlc axlcVar = (axlc) it2.next();
            List l = axlcVar.l();
            int size = l.size();
            long[] jArr = new long[size];
            while (i < size) {
                jArr[i] = ((axlb) l.get(i)).a();
                i++;
            }
            this.d.put(axlcVar, jArr);
        }
        axku axkuVar2 = new axku();
        LinkedList linkedList = new LinkedList();
        linkedList.add("isom");
        linkedList.add("iso2");
        linkedList.add("avc1");
        axkuVar2.w(new del("isom", 0L, linkedList));
        HashMap hashMap3 = new HashMap();
        for (axlc axlcVar2 : axkzVar2.d) {
            axlh axlhVar = this.f;
            double d = 0.0d;
            for (axlc axlcVar3 : axlhVar.b.d) {
                double a = axlcVar3.a() / axlcVar3.j().b;
                if (d < a) {
                    d = a;
                }
            }
            int i3 = axlhVar.a;
            int min = Math.min(((int) Math.ceil(d / 2.0d)) - 1, axlcVar2.l().size());
            if (min <= 0) {
                min = 1;
            }
            long[] jArr2 = new long[min];
            Arrays.fill(jArr2, -1L);
            jArr2[i] = 1;
            long[] m = axlcVar2.m();
            int i4 = 0;
            long j2 = 0;
            for (int length = m.length; i < length; length = length) {
                long j3 = m[i];
                long j4 = j2 / axlcVar2.j().b;
                int i5 = axlhVar.a;
                int i6 = ((int) (j4 / 2)) + 1;
                if (i6 >= min) {
                    break;
                }
                int i7 = i4 + 1;
                jArr2[i6] = i7;
                j2 += j3;
                i++;
                i4 = i7;
                m = m;
            }
            long j5 = i4 + 1;
            for (int i8 = min - 1; i8 >= 0; i8--) {
                long j6 = jArr2[i8];
                if (j6 == -1) {
                    jArr2[i8] = j5;
                } else {
                    j5 = j6;
                }
            }
            int[] iArr2 = new int[min];
            int i9 = 0;
            while (i9 < min) {
                long j7 = jArr2[i9] - 1;
                int i10 = i9 + 1;
                iArr2[i9] = awxt.g((min == i10 ? axlcVar2.l().size() : jArr2[i10] - 1) - j7);
                i9 = i10;
            }
            hashMap3.put(axlcVar2, iArr2);
            i = 0;
        }
        det detVar2 = new det();
        deu deuVar = new deu();
        deuVar.k(axkzVar2.c);
        deuVar.m(axkzVar2.b);
        deuVar.d = axkzVar2.a;
        long d2 = d(axkzVar);
        long j8 = 0;
        for (axlc axlcVar4 : axkzVar2.d) {
            long b = (b(axlcVar4) * d2) / axlcVar4.j().b;
            if (b > j8) {
                j8 = b;
            }
        }
        deuVar.l(j8);
        deuVar.c = d2;
        long j9 = 0;
        for (axlc axlcVar5 : axkzVar2.d) {
            if (j9 < axlcVar5.j().i) {
                j9 = axlcVar5.j().i;
            }
        }
        deuVar.e = j9 + 1;
        detVar2.w(deuVar);
        Iterator it3 = axkzVar2.d.iterator();
        while (it3.hasNext()) {
            axlc axlcVar6 = (axlc) it3.next();
            dfm dfmVar2 = new dfm();
            dfn dfnVar = new dfn();
            dfnVar.m(true);
            dfnVar.n(true);
            dfnVar.r = dfnVar.r() | 4;
            dfnVar.r = dfnVar.r() | 8;
            dfnVar.e = axlcVar6.j().e;
            axlcVar6.j();
            dfnVar.c = 0;
            dfnVar.k(axlcVar6.j().d);
            dfnVar.l((b(axlcVar6) * d(axkzVar)) / axlcVar6.j().b);
            dfnVar.g = axlcVar6.j().g;
            dfnVar.f = axlcVar6.j().f;
            dfnVar.b = axlcVar6.j().j;
            dfnVar.o(axlcVar6.j().c);
            dfnVar.a = axlcVar6.j().i;
            dfnVar.d = axlcVar6.j().h;
            dfmVar2.w(dfnVar);
            axlcVar6.e();
            if (axlcVar6.e().size() > 0) {
                dek dekVar = new dek();
                ArrayList arrayList = new ArrayList();
                int i11 = 0;
                for (axky axkyVar : axlcVar6.e()) {
                    double d3 = axkyVar.b;
                    Iterator it4 = it3;
                    det detVar3 = detVar2;
                    long j10 = ((axlc) axkzVar2.d.iterator().next()).j().b;
                    Iterator it5 = axkzVar2.d.iterator();
                    long j11 = j10;
                    while (it5.hasNext()) {
                        j11 = axkz.a(((axlc) it5.next()).j().b, j11);
                        it5 = it5;
                        str4 = str4;
                        hashMap3 = hashMap3;
                    }
                    HashMap hashMap4 = hashMap3;
                    String str5 = str4;
                    double d4 = j11;
                    Double.isNaN(d4);
                    long round = Math.round(d3 * d4);
                    long j12 = (axkyVar.c * axlcVar6.j().b) / axkyVar.a;
                    if (round >= 4294967296L || j12 > 2147483647L) {
                        i11 = 1;
                    }
                    arrayList.add(new dej(dekVar, round, j12, axkyVar.d));
                    axkzVar2 = axkzVar;
                    it3 = it4;
                    detVar2 = detVar3;
                    str4 = str5;
                    hashMap3 = hashMap4;
                }
                detVar = detVar2;
                it = it3;
                hashMap = hashMap3;
                str = str4;
                dekVar.a = arrayList;
                dekVar.q = i11;
                dfkVar = null;
                axkrVar = new axkr((byte[]) null);
                axkrVar.w(dekVar);
            } else {
                detVar = detVar2;
                it = it3;
                hashMap = hashMap3;
                str = str4;
                dfkVar = null;
                axkrVar = null;
            }
            dfmVar2.w(axkrVar);
            deq deqVar2 = new deq();
            dfmVar2.w(deqVar2);
            der derVar = new der();
            derVar.a = axlcVar6.j().d;
            derVar.b = axlcVar6.j().c;
            derVar.d = axlcVar6.a();
            derVar.c = axlcVar6.j().b;
            derVar.e = axlcVar6.j().a;
            deqVar2.w(derVar);
            deo deoVar = new deo();
            deqVar2.w(deoVar);
            deoVar.a = axlcVar6.k();
            ?? desVar = new des();
            if (axlcVar6.k().equals("vide")) {
                desVar.w(new dfq());
            } else if (axlcVar6.k().equals("soun")) {
                desVar.w(new dfd());
            } else if (axlcVar6.k().equals("text")) {
                desVar.w(new dev());
            } else if (axlcVar6.k().equals("subt")) {
                desVar.w(new dfi());
            } else if (axlcVar6.k().equals("hint")) {
                desVar.w(new dep());
            } else if (axlcVar6.k().equals("sbtl")) {
                desVar.w(new dev());
            }
            ?? axkrVar2 = new axkr();
            dei deiVar = new dei();
            axkrVar2.w(deiVar);
            deh dehVar = new deh();
            dehVar.r = 1;
            deiVar.w(dehVar);
            desVar.w(axkrVar2);
            dfa dfaVar2 = new dfa();
            dfaVar2.w(axlcVar6.i());
            ArrayList arrayList2 = new ArrayList();
            long[] m2 = axlcVar6.m();
            int length2 = m2.length;
            dfk dfkVar2 = dfkVar;
            int i12 = 0;
            Object obj2 = desVar;
            while (i12 < length2) {
                long j13 = m2[i12];
                Object obj3 = obj2;
                if (dfkVar2 == null || dfkVar2.b != j13) {
                    dfkVar2 = new dfk(1L, j13);
                    arrayList2.add(dfkVar2);
                } else {
                    dfkVar2.a++;
                }
                i12++;
                obj2 = obj3;
            }
            Object obj4 = obj2;
            dfl dflVar = new dfl();
            dflVar.b = arrayList2;
            dfaVar2.w(dflVar);
            List d5 = axlcVar6.d();
            if (d5 != null && !d5.isEmpty()) {
                def defVar = new def();
                defVar.a = d5;
                dfaVar2.w(defVar);
            }
            long[] h = axlcVar6.h();
            if (h != null && h.length > 0) {
                dfj dfjVar = new dfj();
                dfjVar.a = h;
                dfaVar2.w(dfjVar);
            }
            if (axlcVar6.f() != null && !axlcVar6.f().isEmpty()) {
                dex dexVar = new dex();
                dexVar.a = axlcVar6.f();
                dfaVar2.w(dexVar);
            }
            HashMap hashMap5 = hashMap;
            int[] iArr3 = (int[]) hashMap5.get(axlcVar6);
            dfc dfcVar = new dfc();
            dfcVar.a = new LinkedList();
            long j14 = -2147483648L;
            int i13 = 0;
            while (i13 < iArr3.length) {
                long j15 = iArr3[i13];
                if (j14 != j15) {
                    obj = obj4;
                    dfcVar.a.add(new dfb(i13 + 1, j15, 1L));
                    j14 = iArr3[i13];
                } else {
                    obj = obj4;
                }
                i13++;
                obj4 = obj;
            }
            ?? r29 = obj4;
            dfaVar2.w(dfcVar);
            dez dezVar = new dez();
            dezVar.a = (long[]) this.d.get(axlcVar6);
            dfaVar2.w(dezVar);
            int[] iArr4 = (int[]) hashMap5.get(axlcVar6);
            dfe dfeVar2 = new dfe();
            this.a.add(dfeVar2);
            long[] jArr3 = new long[iArr4.length];
            Logger logger2 = e;
            String str6 = "Calculating chunk offsets for track_";
            if (logger2.isLoggable(Level.FINE)) {
                Level level2 = Level.FINE;
                long j16 = axlcVar6.j().i;
                axkuVar = axkuVar2;
                dfmVar = dfmVar2;
                StringBuilder sb2 = new StringBuilder(56);
                sb2.append("Calculating chunk offsets for track_");
                sb2.append(j16);
                String sb3 = sb2.toString();
                str2 = str;
                logger2.logp(level2, str2, "createStco", sb3);
            } else {
                dfmVar = dfmVar2;
                axkuVar = axkuVar2;
                str2 = str;
            }
            int i14 = 0;
            long j17 = 0;
            while (i14 < iArr4.length) {
                Logger logger3 = e;
                if (logger3.isLoggable(Level.FINER)) {
                    Level level3 = Level.FINER;
                    iArr = iArr4;
                    j = j17;
                    long j18 = axlcVar6.j().i;
                    deqVar = deqVar2;
                    StringBuilder sb4 = new StringBuilder(74);
                    sb4.append(str6);
                    sb4.append(j18);
                    sb4.append(" chunk ");
                    sb4.append(i14);
                    logger3.logp(level3, str2, "createStco", sb4.toString());
                } else {
                    deqVar = deqVar2;
                    iArr = iArr4;
                    j = j17;
                }
                Iterator it6 = axkzVar.d.iterator();
                j17 = j;
                while (it6.hasNext()) {
                    axlc axlcVar7 = (axlc) it6.next();
                    Logger logger4 = e;
                    Iterator it7 = it6;
                    if (logger4.isLoggable(Level.FINEST)) {
                        Level level4 = Level.FINEST;
                        dfeVar = dfeVar2;
                        dfaVar = dfaVar2;
                        long j19 = axlcVar7.j().i;
                        str3 = str6;
                        StringBuilder sb5 = new StringBuilder(44);
                        sb5.append("Adding offsets of track_");
                        sb5.append(j19);
                        logger4.logp(level4, str2, "createStco", sb5.toString());
                    } else {
                        dfeVar = dfeVar2;
                        dfaVar = dfaVar2;
                        str3 = str6;
                    }
                    int[] iArr5 = (int[]) hashMap5.get(axlcVar7);
                    int i15 = 0;
                    long j20 = 0;
                    while (i15 < i14) {
                        j20 += iArr5[i15];
                        i15++;
                        str2 = str2;
                    }
                    String str7 = str2;
                    if (axlcVar7 == axlcVar6) {
                        jArr3[i14] = j17;
                    }
                    int g = awxt.g(j20);
                    while (true) {
                        hashMap2 = hashMap5;
                        if (g < iArr5[i14] + j20) {
                            j17 += ((long[]) this.d.get(axlcVar7))[g];
                            g++;
                            hashMap5 = hashMap2;
                        }
                    }
                    it6 = it7;
                    dfaVar2 = dfaVar;
                    dfeVar2 = dfeVar;
                    str6 = str3;
                    str2 = str7;
                    hashMap5 = hashMap2;
                }
                i14++;
                iArr4 = iArr;
                deqVar2 = deqVar;
            }
            ?? r27 = deqVar2;
            dfe dfeVar3 = dfeVar2;
            dfa dfaVar3 = dfaVar2;
            HashMap hashMap6 = hashMap5;
            String str8 = str2;
            dfeVar3.a = jArr3;
            dfaVar3.w(dfeVar3);
            HashMap hashMap7 = new HashMap();
            for (Map.Entry entry : axlcVar6.g().entrySet()) {
                String a2 = ((axml) entry.getKey()).a();
                List list = (List) hashMap7.get(a2);
                if (list == null) {
                    list = new ArrayList();
                    hashMap7.put(a2, list);
                }
                list.add((axml) entry.getKey());
            }
            for (Map.Entry entry2 : hashMap7.entrySet()) {
                axmp axmpVar = new axmp();
                String str9 = (String) entry2.getKey();
                axmpVar.a = (List) entry2.getValue();
                axmr axmrVar = new axmr();
                axmrVar.a = str9;
                axmq axmqVar = null;
                for (int i16 = 0; i16 < axlcVar6.l().size(); i16++) {
                    int i17 = 0;
                    for (int i18 = 0; i18 < ((List) entry2.getValue()).size(); i18++) {
                        if (Arrays.binarySearch((long[]) axlcVar6.g().get((axml) ((List) entry2.getValue()).get(i18)), i16) >= 0) {
                            i17 = i18 + 1;
                        }
                    }
                    if (axmqVar == null || axmqVar.b != i17) {
                        axmqVar = new axmq(1L, i17);
                        axmrVar.b.add(axmqVar);
                    } else {
                        axmqVar.a++;
                    }
                }
                dfaVar3.w(axmpVar);
                dfaVar3.w(axmrVar);
            }
            if (axlcVar6 instanceof axlq) {
                axlq axlqVar = (axlq) axlcVar6;
                hashMap3 = hashMap6;
                int[] iArr6 = (int[]) hashMap3.get(axlcVar6);
                axnh axnhVar = new axnh();
                axnhVar.d = "cenc";
                axnhVar.r = 1;
                List n = axlqVar.n();
                if (axlqVar.o()) {
                    int size2 = n.size();
                    short[] sArr = new short[size2];
                    for (int i19 = 0; i19 < size2; i19++) {
                        sArr[i19] = (short) ((axob) n.get(i19)).a();
                    }
                    axnhVar.b = Arrays.copyOf(sArr, size2);
                } else {
                    axnhVar.a = (short) 8;
                    axnhVar.c = axlqVar.l().size();
                }
                axng axngVar = new axng();
                axls axlsVar = new axls();
                if (axlqVar.o()) {
                    axlsVar.r = axlsVar.r() | 2;
                } else {
                    axlsVar.r = axlsVar.r() & 16777213;
                }
                axlsVar.d = n;
                int i20 = axlsVar.b() > 4294967296L ? 16 : 8;
                if (axlsVar.k()) {
                    int length3 = axlsVar.c.length;
                    i2 = 20;
                } else {
                    i2 = 0;
                }
                long j21 = i20 + i2 + 4;
                long[] jArr4 = new long[iArr6.length];
                long j22 = j21;
                int i21 = 0;
                int i22 = 0;
                while (i21 < iArr6.length) {
                    jArr4[i21] = j22;
                    int i23 = i22;
                    int i24 = 0;
                    while (i24 < iArr6[i21]) {
                        j22 += ((axob) n.get(i23)).a();
                        i24++;
                        i23++;
                    }
                    i21++;
                    i22 = i23;
                }
                axngVar.a = jArr4;
                dfaVar3.w(axnhVar);
                dfaVar3.w(axngVar);
                dfaVar3.w(axlsVar);
                this.b.add(axngVar);
            } else {
                hashMap3 = hashMap6;
            }
            if (axlcVar6.b() != null) {
                dfaVar3.w(axlcVar6.b());
            }
            r29.w(dfaVar3);
            r27.w(r29);
            detVar2 = detVar;
            detVar2.w(dfmVar);
            axkzVar2 = axkzVar;
            it3 = it;
            axkuVar2 = axkuVar;
            str4 = str8;
        }
        axku axkuVar3 = axkuVar2;
        axkuVar3.w(detVar2);
        Iterator it8 = axnc.c(detVar2, "trak/mdia/minf/stbl/stsz", false).iterator();
        long j23 = 0;
        while (it8.hasNext()) {
            long j24 = 0;
            for (long j25 : ((dez) it8.next()).a) {
                j24 += j25;
            }
            j23 += j24;
        }
        axle axleVar = new axle(this, axkzVar, hashMap3, j23);
        axkuVar3.w(axleVar);
        long j26 = 16;
        Object obj5 = axleVar;
        while (obj5 instanceof deb) {
            axle axleVar2 = (deb) obj5;
            Iterator it9 = axleVar2.c().i().iterator();
            while (it9.hasNext() && obj5 != (debVar2 = (deb) it9.next())) {
                j26 += debVar2.b();
            }
            obj5 = axleVar2.c();
        }
        Iterator it10 = this.a.iterator();
        while (it10.hasNext()) {
            long[] jArr5 = ((dfe) it10.next()).a;
            for (int i25 = 0; i25 < jArr5.length; i25++) {
                jArr5[i25] = jArr5[i25] + j26;
            }
        }
        for (axng axngVar2 : this.b) {
            long b2 = axngVar2.b() + 44;
            axng axngVar3 = axngVar2;
            while (true) {
                ?? c = axngVar3.c();
                Iterator it11 = c.i().iterator();
                while (it11.hasNext() && (debVar = (deb) it11.next()) != axngVar3) {
                    b2 += debVar.b();
                }
                if (!(c instanceof deb)) {
                    break;
                }
                axngVar3 = c;
            }
            long[] jArr6 = axngVar2.a;
            for (int i26 = 0; i26 < jArr6.length; i26++) {
                jArr6[i26] = jArr6[i26] + b2;
            }
            axngVar2.a = jArr6;
        }
        return axkuVar3;
    }
}
