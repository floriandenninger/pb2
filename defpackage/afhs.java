package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afhs extends Observable implements afht {
    private final axzg A;
    public final aaea a;
    protected final ysy b;
    public final aadw c;
    public final Context d;
    public final Resources e;
    public final ywr f;
    public final ammv g;
    public final afkg h;
    public final afjv i;
    public volatile amsx j;
    public final boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final afqi o;
    public final axzg p;
    public final axzg q;
    private final AtomicBoolean r = new AtomicBoolean();
    private final anhy s;
    private String t;
    private String u;
    private final Set v;
    private boolean w;
    private String x;
    private String y;
    private final axzg z;

    public afhs(Context context, ywr ywrVar, ammv ammvVar, ysy ysyVar, aaea aaeaVar, aadw aadwVar, afkg afkgVar, afjv afjvVar, afqp afqpVar, axzg axzgVar, axzg axzgVar2, axzg axzgVar3, axzg axzgVar4, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        this.a = aaeaVar;
        this.c = aadwVar;
        this.p = axzgVar;
        this.q = axzgVar2;
        this.z = axzgVar3;
        this.A = axzgVar4;
        this.b = ysyVar;
        aaeaVar.a.ax(new ayrs() { // from class: afhq
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                afhs afhsVar = afhs.this;
                afhsVar.j = amsx.p(afhsVar.o().K);
            }
        });
        this.v = Collections.newSetFromMap(new ConcurrentHashMap());
        this.y = null;
        this.d = context;
        this.e = context.getResources();
        this.f = ywrVar;
        this.g = ammvVar;
        this.h = afkgVar;
        this.i = afjvVar;
        anhy i = anfq.i(ywrVar.a(), new anfz() { // from class: afjq
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                afhs afhsVar = afhs.this;
                awvr awvrVar = (awvr) obj;
                String valueOf = String.valueOf(Build.ID);
                String valueOf2 = String.valueOf(Build.VERSION.INCREMENTAL);
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                if (!concat.equals(awvrVar.p) || afhsVar.n().b) {
                    return afhsVar.f.b(new wgs(concat, 16));
                }
                return anhv.a;
            }
        }, angq.a);
        this.s = i;
        this.o = afqpVar.b;
        this.j = amvs.a;
        this.k = zgx.f(context);
        ynm.m(i, adha.u);
    }

    public static boolean aS(int i, Display display) {
        Display.HdrCapabilities hdrCapabilities = display.getHdrCapabilities();
        if (hdrCapabilities != null) {
            for (int i2 : hdrCapabilities.getSupportedHdrTypes()) {
                if (i2 == i) {
                    return true;
                }
            }
        }
        return false;
    }

    private final void aU() {
        String str = Build.HARDWARE;
        String a = zhs.a("ro.board.platform");
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(a).length());
        sb.append(str);
        sb.append(";");
        sb.append(a);
        this.u = sb.toString();
        this.t = zhs.a("ro.board.platform");
    }

    public static auij t(aaea aaeaVar) {
        if (aaeaVar == null || aaeaVar.a() == null) {
            return auij.b;
        }
        atcl atclVar = aaeaVar.a().i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auij auijVar = atclVar.f;
        return auijVar == null ? auij.b : auijVar;
    }

    public final boolean A() {
        return B() || o().j == -1;
    }

    public final boolean B() {
        return o().j > 0;
    }

    public final boolean C() {
        return p().aI;
    }

    public final boolean D() {
        int bb = aocz.bb(o().d);
        return bb != 0 && bb == 4;
    }

    public final boolean E() {
        return p().M;
    }

    public final boolean F() {
        return o().E;
    }

    public final boolean G() {
        if (I()) {
            return (p().R && this.b.r()) ? false : true;
        }
        return false;
    }

    public final boolean H() {
        return p().al;
    }

    public final boolean I() {
        if (H() || K()) {
            return u().isEmpty() || u().contains(Integer.valueOf(this.b.a()));
        }
        return false;
    }

    public final boolean J() {
        if (I()) {
            return p().K;
        }
        return false;
    }

    public final boolean K() {
        return p().am;
    }

    public final boolean L() {
        return p().N;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean M() {
        Boolean bool;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352577L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352577L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352577L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean N() {
        return p().ay;
    }

    public final boolean O() {
        return o().i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean P() {
        Boolean bool;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352576L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352576L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352576L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean Q() {
        return V(this.p.a.a.Y(axzc.q).B());
    }

    public final boolean R() {
        return p().ab;
    }

    public final boolean S() {
        return V(this.z.a.a.Y(axzd.b).B());
    }

    public final boolean T() {
        return p().aC;
    }

    public final boolean U() {
        auml aumlVar;
        arfd a = this.a.a();
        if (a != null) {
            atcl atclVar = a.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            aumlVar = atclVar.n;
            if (aumlVar == null) {
                aumlVar = auml.a;
            }
        } else {
            aumlVar = auml.a;
        }
        return aumlVar.b;
    }

    public final synchronized boolean V(aypy aypyVar) {
        AtomicBoolean atomicBoolean = this.r;
        atomicBoolean.getClass();
        ayrz.c((AtomicReference) aypyVar.ax(new lgx(atomicBoolean, 8)));
        return this.r.get();
    }

    public final boolean W() {
        return V(this.p.a.a.Y(axzc.h).B());
    }

    public final boolean X() {
        return a() > 0 || aj();
    }

    public final boolean Y() {
        return an() != 2;
    }

    public final boolean Z(aqva aqvaVar) {
        return new aonw(p().s, aqvb.a).contains(aqvaVar);
    }

    public final int a() {
        return p().z;
    }

    public final synchronized void aA(String str) {
        this.x = str;
    }

    @Override // defpackage.afht
    public final void aB(boolean z) {
        if (this.l != z) {
            this.l = z;
            setChanged();
            notifyObservers(2);
        }
    }

    public final synchronized void aC(String str) {
        this.y = str;
    }

    public final void aD(FormatStreamModel formatStreamModel) {
        afir bG;
        if (ao() != 3 || (bG = adyu.bG(formatStreamModel)) == afir.NO_FALLBACK) {
            return;
        }
        this.v.add(bG);
    }

    public final synchronized boolean aE() {
        return this.w;
    }

    public final boolean aF() {
        return p().ai && !this.n;
    }

    public final boolean aG(Set set) {
        return aH(set, amvs.a);
    }

    public final boolean aH(Set set, Set set2) {
        return aI("av1_supported", "video/av01", false, set, set2, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean aI(String str, String str2, boolean z, Set set, Set set2, int i) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(Build.VERSION.RELEASE);
        int i2 = 2;
        Set[] setArr = {set, set2};
        HashSet hashSet = new HashSet();
        int i3 = 0;
        for (int i4 = 0; i4 < 2; i4++) {
            Iterator it = setArr[i4].iterator();
            while (it.hasNext()) {
                int hashCode = ((String) it.next()).hashCode();
                Integer valueOf = Integer.valueOf(hashCode);
                if (!hashSet.contains(valueOf)) {
                    i3 ^= hashCode;
                    hashSet.add(valueOf);
                }
            }
        }
        if (i3 != 0) {
            sb.append("_");
            sb.append(i3);
        }
        String sb2 = sb.toString();
        awvr awvrVar = (awvr) this.f.c();
        sb2.getClass();
        if (!awvrVar.l.containsKey(sb2)) {
            try {
                r4 = adyu.M(str2, z, set, set2, i) != null;
                ynm.m(this.f.b(new fju(sb2, r4, i2)), adha.t);
            } catch (oyd unused) {
            }
            return r4;
        }
        sb2.getClass();
        aoot aootVar = awvrVar.l;
        if (aootVar.containsKey(sb2)) {
            return ((Boolean) aootVar.get(sb2)).booleanValue();
        }
        return false;
    }

    public final boolean aJ() {
        return this.g.h() && ((awvs) ((ywr) this.g.c()).c()).b;
    }

    public final boolean aK(Set set) {
        return aI("h264_main_profile_supported", "video/avc", false, set, amvs.a, 0);
    }

    public final boolean aL() {
        return p().ai;
    }

    public final boolean aM(Set set) {
        return aI("opus_supported", "audio/opus", false, set, amvs.a, 0);
    }

    public final boolean aN(Set set, Set set2) {
        return aP(au(), av()) && aI("vp9_secure_supported", "video/x-vnd.on2.vp9", true, set, set2, 0);
    }

    public final boolean aO(Set set, Set set2) {
        return aI("vp9_profile_2_supported", "video/x-vnd.on2.vp9", false, set, set2, 4096);
    }

    public final boolean aP(String str, String str2) {
        return (this.j.contains(str) || this.j.contains(str2)) ? false : true;
    }

    public final boolean aQ(Set set, Set set2) {
        return aP(au(), av()) && aI("vp9_supported", "video/x-vnd.on2.vp9", false, set, set2, 0);
    }

    public final boolean aR() {
        return !this.m;
    }

    public final boolean aT(int i) {
        int i2;
        WindowManager windowManager = (WindowManager) this.d.getSystemService("window");
        if (windowManager == null || Build.VERSION.SDK_INT < 24) {
            return false;
        }
        int i3 = i - 1;
        if (i3 == 16) {
            i2 = 2;
        } else {
            if (i3 != 18) {
                return false;
            }
            i2 = 3;
        }
        return aS(i2, windowManager.getDefaultDisplay());
    }

    public final boolean aa() {
        return o().x;
    }

    public final boolean ab() {
        return V(this.p.a.a.Y(axzc.u).B());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ac() {
        Boolean bool;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352655L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352655L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352655L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ad() {
        Boolean bool;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45353051L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45353051L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45353051L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        return bool.booleanValue();
    }

    public final boolean ae() {
        return p().C;
    }

    public final boolean af() {
        return p().aF;
    }

    public final boolean ag() {
        return q().d;
    }

    public final boolean ah() {
        return q().x;
    }

    public final boolean ai() {
        return p().V;
    }

    public final boolean aj() {
        return p().O;
    }

    public final boolean ak() {
        return p().S;
    }

    public final boolean al() {
        return o().f;
    }

    public final boolean am() {
        return o().r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int an() {
        Long l;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352575L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352575L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352575L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        int intValue = Long.valueOf(l.longValue()).intValue();
        int i = 5;
        if (intValue == 0) {
            i = 2;
        } else if (intValue == 1) {
            i = 3;
        } else if (intValue == 2) {
            i = 4;
        } else if (intValue != 3) {
            i = intValue != 4 ? intValue != 5 ? 0 : 7 : 6;
        }
        if (i == 0) {
            return 2;
        }
        return i;
    }

    public final int ao() {
        int aZ = aocz.aZ(p().F);
        if (aZ == 0) {
            return 2;
        }
        return aZ;
    }

    public final int ap() {
        if (yjj.a == 0) {
            yjj.a = yjk.o();
        }
        return Math.max(yjj.a + p().m, 1);
    }

    public final int aq() {
        if (this.h.f()) {
            return Integer.MAX_VALUE;
        }
        avzr b = avzr.b(((awvr) this.f.c()).m);
        if (b == null) {
            b = avzr.VIDEO_QUALITY_SETTING_UNKNOWN;
        }
        return b.equals(avzr.VIDEO_QUALITY_SETTING_DATA_SAVER) ? 480 : Integer.MAX_VALUE;
    }

    public final aapa ar() {
        adpv adpvVar = adpv.o;
        Enum r1 = aapa.DEFAULT;
        if (this.g.h()) {
            try {
                r1 = Enum.valueOf(aapa.class, (String) adpvVar.apply((awvs) ((ywr) this.g.c()).c()));
            } catch (IllegalArgumentException | NullPointerException unused) {
            }
        }
        return (aapa) r1;
    }

    public final synchronized String as() {
        return this.x;
    }

    public final synchronized String at() {
        return this.y;
    }

    public final String au() {
        if (this.u == null) {
            aU();
        }
        return this.u;
    }

    public final String av() {
        if (this.t == null) {
            aU();
        }
        return this.t;
    }

    public final Set aw() {
        if (ao() == 3) {
            return amsx.p(this.v);
        }
        return EnumSet.noneOf(afir.class);
    }

    public final synchronized void ax() {
        this.w = true;
    }

    public final int b() {
        atcm atcmVar;
        arfd a = this.a.a();
        if (a != null) {
            atcl atclVar = a.i;
            if (atclVar == null) {
                atclVar = atcl.a;
            }
            atcmVar = atclVar.k;
            if (atcmVar == null) {
                atcmVar = atcm.a;
            }
        } else {
            atcmVar = atcm.a;
        }
        int i = atcmVar.d;
        if (i == 0) {
            return 360;
        }
        return i;
    }

    public final int c() {
        return p().n;
    }

    public final int d() {
        return p().o;
    }

    public final int e() {
        return p().ax * 1000;
    }

    public final int f() {
        return p().h;
    }

    public final int g() {
        return p().aj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int h() {
        Long l;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352578L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352578L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352578L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        return (int) l.longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long i() {
        Long l;
        aqvj aqvjVar = this.p.b.b().C;
        if (aqvjVar == null) {
            aqvjVar = aqvj.a;
        }
        if (aqvjVar.a(45352579L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352579L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352579L);
            l = Long.valueOf(aqvkVar.b == 2 ? ((Long) aqvkVar.c).longValue() : 0L);
        } else {
            l = 0L;
        }
        return l.longValue();
    }

    public final long j() {
        long j = p().D;
        if (j > 0) {
            return j;
        }
        return 1000L;
    }

    public final long k() {
        long j = p().E;
        if (j > 0) {
            return j;
        }
        return 1000L;
    }

    public final long l() {
        return p().L;
    }

    public final ammv m() {
        final AtomicReference atomicReference = new AtomicReference();
        ayrz.c((AtomicReference) this.A.a.a.Y(axzc.e).B().ax(new ayrs() { // from class: afhr
            @Override // defpackage.ayrs
            public final void a(Object obj) {
                atomicReference.set((String) obj);
            }
        }));
        String str = (String) atomicReference.get();
        return TextUtils.isEmpty(str) ? amlr.a : ammv.j(str);
    }

    public final apdi n() {
        apwy b = this.c.b();
        if (b == null) {
            return apdi.a;
        }
        atck atckVar = b.q;
        if (atckVar == null) {
            atckVar = atck.a;
        }
        apdi apdiVar = atckVar.b;
        return apdiVar == null ? apdi.a : apdiVar;
    }

    public final apdj o() {
        arfd a = this.a.a();
        if (a == null) {
            return apdj.a;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        apdj apdjVar = atclVar.i;
        return apdjVar == null ? apdj.a : apdjVar;
    }

    public final aqvb p() {
        arfd a = this.a.a();
        if (a == null) {
            return aqvb.b;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        aqvb aqvbVar = atclVar.h;
        return aqvbVar == null ? aqvb.b : aqvbVar;
    }

    public final atsf q() {
        arfd a = this.a.a();
        if (a == null) {
            return atsf.b;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atsh atshVar = atclVar.d;
        if (atshVar == null) {
            atshVar = atsh.a;
        }
        atsf atsfVar = atshVar.g;
        return atsfVar == null ? atsf.b : atsfVar;
    }

    public final atsh r() {
        arfd a = this.a.a();
        if (a == null) {
            return atsh.a;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        atsh atshVar = atclVar.d;
        return atshVar == null ? atsh.a : atshVar;
    }

    public final auic s() {
        arfd a = this.a.a();
        if (a == null) {
            return auic.a;
        }
        atcl atclVar = a.i;
        if (atclVar == null) {
            atclVar = atcl.a;
        }
        auic auicVar = atclVar.m;
        return auicVar == null ? auic.a : auicVar;
    }

    public final List u() {
        return p().ak;
    }

    public final boolean v() {
        return p().aH;
    }

    public final boolean w() {
        return p().aE;
    }

    public final boolean x() {
        return p().A;
    }

    public final boolean y() {
        return p().G;
    }

    public final boolean z() {
        return p().H;
    }
}
