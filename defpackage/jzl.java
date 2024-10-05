package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.google.android.youtube.R;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function;
import j$.util.stream.Stream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class jzl extends ajvj implements ypd {
    private final jys G;
    private final jyy H;
    private final ayqi I;

    /* renamed from: J, reason: collision with root package name */
    private final ayqi f227J;
    private final jyu K;
    private final jok L;
    private ayqx M;
    private final ayqx N;
    private aqmy O;
    private final fiu P;
    public final fjs a;
    public String b;
    public ayqx c;
    public final acqy d;
    public final axzg e;
    public final axzf f;
    public final axzf g;
    private final Context n;
    private final jqj o;
    private final amnv p;
    private final jti q;
    private final Executor r;
    private final azrw s;
    private final ajpd t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jzl(defpackage.ajvb r16, defpackage.ypa r17, defpackage.zaw r18, defpackage.fjs r19, defpackage.jti r20, java.util.concurrent.Executor r21, defpackage.azrw r22, defpackage.ajfh r23, defpackage.ajfh r24, final defpackage.axzf r25, final defpackage.eys r26, defpackage.acqy r27, defpackage.fiu r28, defpackage.jyy r29, final defpackage.ayqi r30, final defpackage.ayqi r31, defpackage.jyu r32, defpackage.jok r33, defpackage.axzg r34, defpackage.axzf r35, android.app.Activity r36, defpackage.aasm r37, defpackage.acra r38, defpackage.ajxe r39, defpackage.jqj r40, defpackage.amnv r41, byte[] r42, byte[] r43, byte[] r44, byte[] r45, byte[] r46) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzl.<init>(ajvb, ypa, zaw, fjs, jti, java.util.concurrent.Executor, azrw, ajfh, ajfh, axzf, eys, acqy, fiu, jyy, ayqi, ayqi, jyu, jok, axzg, axzf, android.app.Activity, aasm, acra, ajxe, jqj, amnv, byte[], byte[], byte[], byte[], byte[]):void");
    }

    private final void n() {
        if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
            final int orElse = wbs.W(this.n, R.attr.ytGeneralBackgroundA).orElse(0);
            this.t.mK(new ajol() { // from class: glz
                @Override // defpackage.ajol
                public final void a(ajok ajokVar, ajng ajngVar, int i) {
                    etx.o(ajokVar, orElse);
                }
            });
            this.t.add(0, frd.b());
            fre freVar = new fre();
            freVar.a = true;
            this.t.mK(freVar);
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            this.t.mK(new jzd(this, 1));
            this.t.mK(new jzd(this, 0));
        }
    }

    private static final boolean o(Object obj) {
        awog d;
        if ((obj instanceof ajds) && (d = acqy.d((ajds) obj)) != null) {
            return d.pY(aqnz.b);
        }
        return false;
    }

    private static final boolean r(Object obj) {
        awog d;
        if ((obj instanceof ajds) && (d = acqy.d((ajds) obj)) != null) {
            return d.pY(aqnu.b);
        }
        return false;
    }

    private static final boolean s(Object obj) {
        awog d;
        if ((obj instanceof ajds) && (d = acqy.d((ajds) obj)) != null) {
            return d.pY(aqon.b);
        }
        return false;
    }

    public final void c() {
        int i = 0;
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            Object obj = this.i.get(i2);
            if ((obj instanceof apib) || (obj instanceof ajds)) {
                return;
            }
        }
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            if (this.a.k() || this.a.j()) {
                i = 1;
            } else {
                lD();
            }
            ajce ajceVar = this.C;
            aqnf aqnfVar = aqnf.FILTER_TYPE_UNSPECIFIED;
            if (ajceVar != null) {
                aqnfVar = mcy.al(ajceVar);
            }
            C(this.q.a(this.a, aqnfVar), i);
            return;
        }
        if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
            lD();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0261 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f5  */
    @Override // defpackage.ajvj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.aalz r15) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jzl.i(aalz):void");
    }

    @Override // defpackage.ajud, defpackage.ajtz, defpackage.zfk
    public final void j() {
        Object obj = this.c;
        if (obj != null) {
            ayrz.c((AtomicReference) obj);
        }
        Object obj2 = this.M;
        if (obj2 != null) {
            azqb.f((AtomicReference) obj2);
        }
        Object obj3 = this.N;
        if (obj3 != null) {
            ayrz.c((AtomicReference) obj3);
        }
        super.j();
    }

    public final void k() {
        this.r.execute(new Runnable() { // from class: jze
            @Override // java.lang.Runnable
            public final void run() {
                jzl jzlVar = jzl.this;
                jzlVar.K(false);
                jzlVar.af();
            }
        });
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (cls == jzl.class) {
            switch (i) {
                case -1:
                    return new Class[]{jqc.class, jqd.class, aacj.class, aacl.class, aaxa.class, agkp.class, aglb.class, ajvf.class};
                case 0:
                    final jqc jqcVar = (jqc) obj;
                    if (this.g.r() || this.e.n().booleanValue() || this.f.g().booleanValue()) {
                        k();
                        return null;
                    }
                    H(new ammy() { // from class: jzg
                        @Override // defpackage.ammy
                        public final boolean a(Object obj2) {
                            return jzl.this.m(jqcVar.a, obj2);
                        }
                    });
                    c();
                    return null;
                case 1:
                    if (this.g.r() || this.e.n().booleanValue() || this.f.g().booleanValue()) {
                        k();
                        return null;
                    }
                    l();
                    c();
                    return null;
                case 2:
                    nl((aacj) obj);
                    return null;
                case 3:
                    nm((aacl) obj);
                    return null;
                case 4:
                    N((aaxa) obj);
                    return null;
                case 5:
                    final agkp agkpVar = (agkp) obj;
                    if (this.g.r() || this.e.n().booleanValue() || this.f.g().booleanValue()) {
                        k();
                        return null;
                    }
                    H(new ammy() { // from class: jzh
                        @Override // defpackage.ammy
                        public final boolean a(Object obj2) {
                            return (obj2 instanceof ajds) && agkpVar.a.equals(jzl.this.d.b((ajds) obj2));
                        }
                    });
                    c();
                    return null;
                case 6:
                    final aglb aglbVar = (aglb) obj;
                    if (this.g.r() || this.e.n().booleanValue() || this.f.g().booleanValue()) {
                        return null;
                    }
                    H(new ammy() { // from class: jzi
                        @Override // defpackage.ammy
                        public final boolean a(Object obj2) {
                            return jzl.this.m(aglbVar.a, obj2);
                        }
                    });
                    c();
                    return null;
                case 7:
                    M((ajvf) obj);
                    return null;
                default:
                    StringBuilder sb = new StringBuilder(32);
                    sb.append("unsupported op code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
        }
        return super.kz(cls, obj, i);
    }

    public final void l() {
        amru q;
        anhy O;
        ayqj G;
        amru q2;
        anhy O2;
        HashSet hashSet = new HashSet();
        int i = 0;
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            Object obj = this.t.get(i2);
            if (s(obj)) {
                fjs fjsVar = this.a;
                String c = this.d.c((ajds) obj);
                if (!fjsVar.h() || ((agof) fjsVar.a.get()).a().m().e(c) == null) {
                    hashSet.add(obj);
                }
            } else if (o(obj)) {
                if (!this.a.g(fhe.v(this.d.c((ajds) obj)))) {
                    hashSet.add(obj);
                }
            } else if (r(obj) && !this.a.i(this.d.b((ajds) obj))) {
                hashSet.add(obj);
            }
        }
        this.t.removeAll(hashSet);
        HashSet hashSet2 = new HashSet();
        for (int i3 = 0; i3 < this.t.size(); i3++) {
            Object obj2 = this.t.get(i3);
            if (s(obj2) || o(obj2)) {
                hashSet2.add(this.d.c((ajds) obj2));
            } else if (r(obj2)) {
                hashSet2.add(this.d.b((ajds) obj2));
            }
        }
        int hashCode = hashSet2.hashCode();
        final HashSet hashSet3 = new HashSet();
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            jvc jvcVar = (jvc) this.s.get();
            if (!jvcVar.c()) {
                G = ayqj.F(amru.q());
            } else {
                aahu c2 = jvcVar.c.c();
                G = c2.f(fhe.i()).g(awiu.class).x(jtu.i).O(jtu.k).t(new fiy(c2, 4)).L(iub.q).av().G(jtu.j);
            }
            aypy Y = G.l().N(jtu.m).Y(jtu.n).L(iub.t).Y(jtu.o);
            aytu aytuVar = new aytu(new ayrs() { // from class: jza
                @Override // defpackage.ayrs
                public final void a(Object obj3) {
                    hashSet3.add((String) obj3);
                }
            }, aysu.e, aysu.c);
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            aytl aytlVar = new aytl(linkedBlockingQueue);
            ayrz.g(aytuVar, aytlVar);
            Y.aE(aytlVar);
            while (!aytlVar.e()) {
                Object poll = linkedBlockingQueue.poll();
                if (poll == null) {
                    try {
                        poll = linkedBlockingQueue.take();
                    } catch (InterruptedException e) {
                        aytlVar.qc();
                        aytuVar.b(e);
                    }
                }
                if (!aytlVar.e() && poll != aytl.a && !azqm.f(poll, aytuVar)) {
                }
            }
            try {
                if (jvcVar.a.j()) {
                    O2 = anfq.h(anht.q(((agof) jvcVar.b.get()).a().i().i()), jpt.l, angq.a);
                } else {
                    O2 = anaf.O(amru.q());
                }
                q2 = (amru) O2.get();
            } catch (InterruptedException | ExecutionException e2) {
                zga.d("Exception when trying to fetch playlist snapshots", e2);
                q2 = amru.q();
            }
            int size = q2.size();
            while (i < size) {
                hashSet3.add(((agni) q2.get(i)).a.a);
                i++;
            }
        } else if ("downloads_page_recommendations_item_section_identifier".equals(this.b)) {
            jvc jvcVar2 = (jvc) this.s.get();
            try {
                if (jvcVar2.a.e()) {
                    O = anfq.h(anht.q(((agof) jvcVar2.b.get()).a().k().c(jvd.a)), jpt.m, angq.a);
                } else {
                    O = anaf.O(amru.q());
                }
                q = (amru) O.get();
            } catch (InterruptedException | ExecutionException e3) {
                zga.d("Exception when trying to fetch recs video snapshots", e3);
                q = amru.q();
            }
            int size2 = q.size();
            while (i < size2) {
                hashSet3.add(((agnv) q.get(i)).m());
                i++;
            }
        }
        int hashCode2 = hashSet3.hashCode();
        if (this.t.size() == 1 || hashCode != hashCode2) {
            this.P.b().h(iub.s).z(this.I).U(new jzj(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajvj
    /* renamed from: lA */
    public final void lB(aalz aalzVar, ajcd ajcdVar) {
        List<zgg> list;
        float d;
        int i;
        zgf zgfVar;
        int i2 = 0;
        if ((!this.e.n().booleanValue() && !this.f.g().booleanValue()) || aalzVar != null) {
            if ((!this.g.r() && !this.e.n().booleanValue()) || ajcdVar != ajcd.RELOAD || aalzVar == null) {
                super.lB(aalzVar, ajcdVar);
            } else {
                final jys jysVar = this.G;
                askd askdVar = aalzVar.a;
                amru amruVar = (amru) Collection.EL.stream(jysVar.a).map(jyr.b).collect(ampm.a);
                askb askbVar = askdVar.d;
                if (askbVar == null) {
                    askbVar = askb.a;
                }
                amru amruVar2 = (amru) Stream.CC.concat(Stream.CC.of(whu.aa(askbVar)).map(jyr.c), Collection.EL.stream(askdVar.e).map(new Function() { // from class: jyq
                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function andThen(Function function) {
                        return Function.CC.$default$andThen(this, function);
                    }

                    @Override // j$.util.function.Function
                    public final Object apply(Object obj) {
                        jys jysVar2 = jys.this;
                        askg askgVar = (askg) obj;
                        if ((askgVar.h & 1048576) != 0) {
                            aqrf aqrfVar = askgVar.av;
                            if (aqrfVar == null) {
                                aqrfVar = aqrf.a;
                            }
                            return Optional.of(aqrfVar);
                        }
                        List a = jysVar2.b.a(amru.r(askgVar));
                        if (!a.isEmpty()) {
                            return Optional.of(a.get(0));
                        }
                        return Optional.empty();
                    }

                    @Override // j$.util.function.Function
                    public final /* synthetic */ Function compose(Function function) {
                        return Function.CC.$default$compose(this, function);
                    }
                })).filter(jzf.a).map(jyr.d).collect(ampm.a);
                amruVar.getClass();
                amruVar2.getClass();
                boolean isEmpty = amruVar.isEmpty();
                boolean isEmpty2 = amruVar2.isEmpty();
                if (isEmpty && isEmpty2) {
                    list = Collections.emptyList();
                } else if (isEmpty) {
                    list = Collections.singletonList(new zgh(3, amru.o(amruVar2)));
                } else {
                    int i3 = 4;
                    if (isEmpty2) {
                        list = Collections.singletonList(new zgh(4, amru.o(amruVar)));
                    } else if (amruVar.size() == 1 || amruVar2.size() == 1) {
                        int size = amruVar.size();
                        ArrayList arrayList = new ArrayList(size == 1 ? amruVar : amruVar2);
                        if (size == 1) {
                            amruVar = amruVar2;
                        }
                        ArrayList arrayList2 = new ArrayList(amruVar);
                        int indexOf = arrayList2.indexOf(arrayList.get(0));
                        ArrayList arrayList3 = new ArrayList(3);
                        if (indexOf != -1) {
                            int i4 = size == 1 ? 3 : 4;
                            if (indexOf > 0) {
                                arrayList3.add(new zgh(i4, arrayList2.subList(0, indexOf)));
                            }
                            arrayList3.add(new zgh(1, arrayList));
                            int i5 = indexOf + 1;
                            int size2 = arrayList2.size();
                            if (i5 < size2) {
                                arrayList3.add(new zgh(i4, arrayList2.subList(i5, size2)));
                            }
                        } else if (size == 1) {
                            arrayList3.add(new zgh(4, arrayList));
                            arrayList3.add(new zgh(3, arrayList2));
                        } else {
                            arrayList3.add(new zgh(4, arrayList2));
                            arrayList3.add(new zgh(3, arrayList));
                        }
                        list = arrayList3;
                    } else {
                        List C = yjk.C(amruVar);
                        List C2 = yjk.C(amruVar2);
                        int size3 = C.size();
                        int size4 = C2.size();
                        ArrayList arrayList4 = new ArrayList(size4);
                        arrayList4.add(null);
                        for (int i6 = 1; i6 < size4; i6++) {
                            arrayList4.add(new zgf(3, C2.get(i6), (zgf) arrayList4.get(i6 - 1)));
                        }
                        ArrayList arrayList5 = new ArrayList(size4);
                        int i7 = 1;
                        while (i7 < size3) {
                            arrayList5.clear();
                            zgf zgfVar2 = (zgf) arrayList4.get(i2);
                            Object obj = C.get(i7);
                            zgf zgfVar3 = new zgf(i3, obj, (zgf) arrayList4.get(i2));
                            arrayList5.add(zgfVar3);
                            int i8 = 1;
                            while (i8 < size4) {
                                zgf zgfVar4 = (zgf) arrayList4.get(i8);
                                if (amkq.b(obj, C2.get(i8))) {
                                    d = zgf.d(zgfVar2);
                                    i = 1;
                                } else {
                                    d = zgf.d(zgfVar2) + 1.5f;
                                    i = 2;
                                }
                                if (d > zgf.d(zgfVar3) + 1.0f) {
                                    d = zgf.d(zgfVar3) + 1.0f;
                                    i = 3;
                                }
                                if (d > zgf.d(zgfVar4) + 1.0f) {
                                    i = 4;
                                }
                                int i9 = i - 1;
                                if (i9 == 2) {
                                    zgfVar = new zgf(i, C2.get(i8), (zgf) arrayList5.get(i8 - 1));
                                } else if (i9 != 3) {
                                    zgfVar3 = new zgf(i, C2.get(i8), (zgf) arrayList4.get(i8 - 1));
                                    arrayList5.add(zgfVar3);
                                    i8++;
                                    zgfVar2 = zgfVar4;
                                } else {
                                    zgfVar = new zgf(i, C.get(i7), (zgf) arrayList4.get(i8));
                                }
                                zgfVar3 = zgfVar;
                                arrayList5.add(zgfVar3);
                                i8++;
                                zgfVar2 = zgfVar4;
                            }
                            i7++;
                            i2 = 0;
                            i3 = 4;
                            ArrayList arrayList6 = arrayList4;
                            arrayList4 = arrayList5;
                            arrayList5 = arrayList6;
                        }
                        zgf zgfVar5 = (zgf) arrayList4.get(size4 - 1);
                        if (zgfVar5 == null) {
                            list = Collections.emptyList();
                        } else {
                            ArrayDeque arrayDeque = new ArrayDeque();
                            int i10 = zgfVar5.a;
                            ArrayDeque arrayDeque2 = new ArrayDeque();
                            while (zgfVar5 != null) {
                                if (!arrayDeque2.isEmpty() && i10 != zgfVar5.a) {
                                    arrayDeque.addFirst(yjk.D(i10, arrayDeque2));
                                    arrayDeque2.clear();
                                }
                                i10 = zgfVar5.a;
                                arrayDeque2.addFirst(zgfVar5);
                                zgfVar5 = zgfVar5.c;
                            }
                            if (!arrayDeque2.isEmpty()) {
                                arrayDeque.addFirst(yjk.D(i10, arrayDeque2));
                            }
                            list = amru.o(arrayDeque);
                        }
                    }
                }
                int i11 = 0;
                for (zgg zggVar : list) {
                    int size5 = zggVar.e().size();
                    amru amruVar3 = (amru) Collection.EL.stream(zggVar.e()).map(jyr.a).collect(ampm.a);
                    int c = zggVar.c() - 1;
                    if (c == 1) {
                        for (int i12 = 0; i12 < amruVar3.size(); i12++) {
                            jysVar.a.n(i11 + i12, amruVar3.get(i12));
                        }
                    } else if (c == 2) {
                        jysVar.a.addAll(i11, amruVar3);
                    } else if (c == 3) {
                        jysVar.a.h(i11, size5);
                    }
                    i11 += zggVar.a();
                }
                aqmy aqmyVar = this.O;
                if (aqmyVar != null && aqmyVar.equals(aqmy.REQUEST_TYPE_EXPANSION)) {
                    acsx acsxVar = this.H.b;
                    acsxVar.getClass();
                    acsxVar.c("e_rd");
                }
                lu(aalzVar.a());
            }
        } else {
            lD();
        }
        ajce ajceVar = this.C;
        if ("downloads_page_downloads_item_section_identifier".equals(this.b) && ajcdVar == ajcd.RELOAD && ajceVar != null && ((aqmy) mcy.ap(ajceVar, jpt.r, aqmy.REQUEST_TYPE_UNSPECIFIED)).equals(aqmy.REQUEST_TYPE_FILTER_CHANGE)) {
            ((RecyclerView) this.p.get()).ak(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajvj, defpackage.ajtz
    public final /* bridge */ /* synthetic */ void lB(Object obj, ajcd ajcdVar) {
        lB((aalz) obj, ajcdVar);
    }

    @Override // defpackage.ajtz
    public final void lt(ajce ajceVar) {
        B();
        super.lt(ajceVar);
    }

    @Override // defpackage.ajvj, defpackage.ajth
    public final void lz(aulm aulmVar, apxf apxfVar) {
        aqmz aqmzVar;
        boolean z = false;
        if ("downloads_page_downloads_item_section_identifier".equals(this.b)) {
            if (this.g.r() || this.e.n().booleanValue()) {
                ajce o = ahbj.o(aulmVar);
                if (o != null) {
                    ammv ak = mcy.ak(o);
                    if (ak.h()) {
                        aqnd aqndVar = (aqnd) ak.c();
                        if (aqndVar.b == 2) {
                            aqmzVar = (aqmz) aqndVar.c;
                        } else {
                            aqmzVar = aqmz.a;
                        }
                        aqmy b = aqmy.b(aqmzVar.c);
                        if (b == null) {
                            b = aqmy.REQUEST_TYPE_UNSPECIFIED;
                        }
                        if (b.equals(aqmy.REQUEST_TYPE_EXPANSION)) {
                            jyy jyyVar = this.H;
                            acsx b2 = ((acsy) jyyVar.a.get()).b(asmn.LATENCY_ACTION_DOWNLOADS_EXPANSION);
                            b2.getClass();
                            jyyVar.b = b2;
                            jyyVar.b.c("e_rq");
                            H(new juz(2));
                            z = true;
                        }
                        this.O = b;
                    } else {
                        this.O = null;
                    }
                }
                K(z);
            } else if (!this.e.n().booleanValue()) {
                this.t.m(juz.c);
            }
            lt(ahbj.o(aulmVar));
            return;
        }
        if ("downloads_page_smart_downloads_item_section_identifier".equals(this.b)) {
            if (this.e.n().booleanValue()) {
                K(false);
            } else {
                ajce o2 = ahbj.o(aulmVar);
                if (o2 != null) {
                    if (aqnb.REQUEST_TYPE_LOADING.equals((aqnb) mcy.ap(o2, jpt.s, aqnb.REQUEST_TYPE_UNSPECIFIED))) {
                        this.t.clear();
                    } else {
                        Collection.EL.removeIf(this.t, new jzf(0));
                        K(false);
                    }
                }
            }
            lt(ahbj.o(aulmVar));
            return;
        }
        if (this.e.n().booleanValue()) {
            lt(ahbj.o(aulmVar));
        } else {
            super.lz(aulmVar, apxfVar);
        }
        ((RecyclerView) this.p.get()).aa(0);
    }

    public final boolean m(String str, Object obj) {
        return (obj instanceof ajds) && str.equals(this.d.c((ajds) obj));
    }

    @Override // defpackage.ajvj, defpackage.ajud, defpackage.ajtz, defpackage.ajvz
    public final ajxe ph() {
        ajxe ph = super.ph();
        String str = this.b;
        str.getClass();
        return new jzk(ph, str, this.t);
    }
}
