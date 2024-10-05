package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import j$.util.function.Function;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeut implements Observer, afbu, aetx, aeze, aevk, afdx, poh {
    final afeu A;
    public final afgb B;
    public final aeyr C;
    afiy[] D;
    public bbr E;
    public float F;
    public int G;
    protected boolean H;
    final afdf I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f38J;
    public final boolean K;
    public boolean L;
    public final boolean M;
    public int N;
    final axfg O;
    private final aeqg P;
    private final shf Q;
    private boolean R;
    private final aety S;
    private aevq T;
    private aevo U;
    private aud V;
    private aud W;
    private auc X;
    private poe[] Y;
    private final pot Z;
    public final aflh a;
    private final afgx aa;
    private final ptk ab;
    private final aexv ac;
    private final aeyb ad;
    private final aexw ae;
    private float af;
    private boolean ag;
    private aedn ah;
    private final aedn ai;
    avk b;
    public final aeua c;
    public final aenf d;
    public final psf e;
    final afix f;
    public plr g;
    final aevh h;
    final aetw i;
    final afcu j;
    public final Handler k;
    Handler l;
    public aevr m;
    final aevi n;
    public final afhw o;
    public final aejn p;
    final aeha q;
    final azrw r;
    final aewb s;
    public final adxr t;
    public String u;
    public final azrw v;
    public final aevl w;
    public final aett x;
    public final aetv y;
    final azx z;

    /* JADX WARN: Multi-variable type inference failed */
    public aeut(aenf aenfVar, shf shfVar, psf psfVar, afix afixVar, aeve aeveVar, axpg axpgVar, afhs afhsVar, ysy ysyVar, Context context, ptk ptkVar, aeez aeezVar, aehs aehsVar, afkn afknVar, aeqg aeqgVar, afdf afdfVar, amnv amnvVar, amnv amnvVar2, adxr adxrVar, azrw azrwVar, axfg axfgVar, afhw afhwVar, aejn aejnVar, afcu afcuVar, azrw azrwVar2, aexw aexwVar, afeu afeuVar, yss yssVar, afgb afgbVar, afgx afgxVar) {
        Boolean bool;
        azx azxVar;
        Handler handler;
        pkv pkvVar;
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.k = handler2;
        aedn aednVar = new aedn();
        this.ai = aednVar;
        this.Z = new pot();
        this.N = 1;
        this.ah = aednVar;
        this.af = 1.0f;
        this.F = 1.0f;
        this.aa = afgxVar;
        this.Q = shfVar;
        this.e = psfVar;
        this.b = aeve.d(psfVar);
        this.d = aenfVar;
        this.f = afixVar;
        this.p = aejnVar;
        this.q = new aeha(context, shfVar, afhsVar, handler2, ysyVar);
        this.t = adxrVar;
        this.P = aeqgVar;
        this.r = azrwVar2;
        this.A = afeuVar;
        final aetw aetwVar = new aetw(aeveVar, aeveVar.i(this, aeqgVar, new aeuu(this, null), afhsVar), new afdt(afdfVar, handler2, this, afqu.ANDROID_EXOPLAYER_V2, afhsVar), afhsVar, ysyVar, aeezVar, afknVar, aehsVar, aenfVar, amnvVar, amnvVar2, afcuVar);
        this.i = aetwVar;
        aewb aewbVar = new aewb(aetwVar, handler2);
        this.s = aewbVar;
        this.n = new aevi(aetwVar);
        this.I = afdfVar;
        this.O = axfgVar;
        this.ae = aexwVar;
        this.j = afcuVar;
        this.B = afgbVar;
        final int i = 0;
        aeua aeuaVar = new aeua(adxrVar, afhsVar, handler2, aetwVar, new amnv(this) { // from class: aeuj
            public final /* synthetic */ aeut a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i2 = i;
                if (i2 != 0) {
                    return i2 != 1 ? this.a.l : Long.valueOf(this.a.f());
                }
                return Long.valueOf(this.a.g());
            }
        });
        this.c = aeuaVar;
        aqvj aqvjVar = afhsVar.p.b.b().C;
        aqvjVar = aqvjVar == null ? aqvj.a : aqvjVar;
        if (aqvjVar.a(45352483L)) {
            aoot aootVar = aqvjVar.b;
            if (!aootVar.containsKey(45352483L)) {
                throw new IllegalArgumentException();
            }
            aqvk aqvkVar = (aqvk) aootVar.get(45352483L);
            bool = Boolean.valueOf(aqvkVar.b == 1 ? ((Boolean) aqvkVar.c).booleanValue() : false);
        } else {
            bool = false;
        }
        final int i2 = 2;
        if (bool.booleanValue()) {
            azxVar = new pkv(aeveVar.b, context, aeuaVar, afhsVar, new amnv(this) { // from class: aeuj
                public final /* synthetic */ aeut a;

                {
                    this.a = this;
                }

                @Override // defpackage.amnv
                public final Object get() {
                    int i22 = i2;
                    if (i22 != 0) {
                        return i22 != 1 ? this.a.l : Long.valueOf(this.a.f());
                    }
                    return Long.valueOf(this.a.g());
                }
            });
        } else {
            azxVar = azx.a;
        }
        this.z = azxVar;
        aevh aevhVar = new aevh(aetwVar, afhsVar, yssVar, afcuVar);
        this.h = aevhVar;
        aeyb aeybVar = new aeyb(aevhVar);
        this.ad = aeybVar;
        this.ab = ptkVar;
        this.g = aeveVar.a(this, aeybVar, ptkVar);
        afki.a(this.T);
        afki.a(this.m);
        afki.a(this.U);
        afki.a(this.V);
        afki.a(this.W);
        afki.a(this.X);
        afki.a(this.Y);
        aety aetyVar = new aety(this, aetwVar, afeuVar);
        this.S = aetyVar;
        this.b.b(aetyVar);
        aetwVar.s.addObserver(this);
        aetwVar.f.addObserver(this);
        this.l = new Handler(this.g.b());
        this.ac = new aexv(new amnv() { // from class: aeui
            @Override // defpackage.amnv
            public final Object get() {
                return aetw.this.a();
            }
        });
        this.C = new aeyr(this.g, aetwVar.b.k(), handler2, this.l, new aeuu(this), afcuVar, afixVar, aeveVar.b, aeveVar.e, aeveVar.f, aetwVar.f, afeuVar, aetwVar.s, new aeuy(this, 2), new Function() { // from class: aeuz
            @Override // j$.util.function.Function
            public final /* synthetic */ Function andThen(Function function) {
                return Function.CC.$default$andThen(this, function);
            }

            @Override // j$.util.function.Function
            public final Object apply(Object obj) {
                aeut aeutVar = aeut.this;
                String str = (String) obj;
                aetw aetwVar2 = aeutVar.i;
                long g = aeutVar.g();
                aehc aehcVar = (aehc) aetwVar2.o.get(str);
                if (aehcVar != null) {
                    return aehcVar;
                }
                afid.e(afic.QOE, "Cannot find PlaybackMappedData for cpn %s", str);
                aesa c = aetwVar2.c();
                afie afieVar = new afie("invalid.parameter", g);
                String valueOf = String.valueOf(str);
                afieVar.b = valueOf.length() != 0 ? "No PlaybackMappedData ".concat(valueOf) : new String("No PlaybackMappedData ");
                c.e(afieVar.a());
                return aehc.a(aesa.a, PlayerConfigModel.b, afjf.a);
            }

            @Override // j$.util.function.Function
            public final /* synthetic */ Function compose(Function function) {
                return Function.CC.$default$compose(this, function);
            }
        });
        this.f38J = afhsVar.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_STOP_VIDEO);
        this.K = afhsVar.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_RESET_EXOV2_ON_BLOCKING_STOP_VIDEO);
        this.M = afhsVar.T();
        this.H = false;
        this.v = azrwVar;
        if (azxVar instanceof pkv) {
            pkvVar = (pkv) azxVar;
            handler = handler2;
        } else {
            handler = handler2;
            pkvVar = null;
        }
        aetv aetvVar = new aetv(aetwVar, handler, pkvVar);
        this.y = aetvVar;
        Handler handler3 = handler;
        this.w = new aevl(this.g, aetwVar, aeveVar.b, afdfVar, aewbVar, this.m, this.U, this.X, this, aetvVar, azxVar instanceof pkv ? (pkv) azxVar : null);
        if (afhsVar.N()) {
            ((pom) this.g).c.t(new aeul(this));
        }
        this.o = afhwVar;
        if (afhsVar.p().an && Build.VERSION.SDK_INT >= 24) {
            this.a = new aflh(aeveVar.b, axpgVar, afhsVar, new aeuu(this, null, null), new zih() { // from class: aeug
                @Override // defpackage.zih
                public final Object a() {
                    aezf aezfVar = aeut.this.i.n;
                    return Boolean.valueOf(aezfVar == null ? false : aezfVar.c.f);
                }
            }, new zih() { // from class: aeub
                @Override // defpackage.zih
                public final Object a() {
                    return aetw.this.m;
                }
            }, null, null);
        } else {
            this.a = null;
        }
        final int i3 = 1;
        final int i4 = 0;
        this.x = new aett(handler3, aetwVar, new amnv(this) { // from class: aeuj
            public final /* synthetic */ aeut a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i22 = i3;
                if (i22 != 0) {
                    return i22 != 1 ? this.a.l : Long.valueOf(this.a.f());
                }
                return Long.valueOf(this.a.g());
            }
        }, new amnv(this) { // from class: aeuj
            public final /* synthetic */ aeut a;

            {
                this.a = this;
            }

            @Override // defpackage.amnv
            public final Object get() {
                int i22 = i4;
                if (i22 != 0) {
                    return i22 != 1 ? this.a.l : Long.valueOf(this.a.f());
                }
                return Long.valueOf(this.a.g());
            }
        });
    }

    private final boolean aA(long j) {
        aezf aezfVar = this.i.n;
        if (aezfVar == null) {
            return false;
        }
        if (aezfVar.b().G() || j == 0) {
            aezfVar.g = 0;
            aezfVar.f = j;
            this.h.m();
            return true;
        }
        if (this.i.s.x()) {
            aezfVar.K.f("ivsk", afhm.c());
        }
        return false;
    }

    private static boolean aB(afhs afhsVar, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, amnv amnvVar, boolean z) {
        if (z || playerConfigModel.aR()) {
            Iterator it = aaoq.b().iterator();
            while (it.hasNext()) {
                if (videoStreamingData.u(((Integer) it.next()).intValue())) {
                    return true;
                }
            }
        }
        if (videoStreamingData.y()) {
            return false;
        }
        return afje.a(playerConfigModel, videoStreamingData, afje.c) || afje.g(videoStreamingData, playerConfigModel, afhsVar) || afje.j(videoStreamingData, playerConfigModel, afhsVar, amnvVar) || afje.k(videoStreamingData, playerConfigModel, afhsVar, amnvVar);
    }

    private final synchronized long as() {
        long j;
        afeb S = S();
        j = -1;
        if (S != null) {
            long j2 = S.a;
            if (j2 == -1) {
                j2 = i();
            }
            long g = g();
            if (j2 != -1 && g != -1) {
                j = j2 - g;
            }
        }
        return j;
    }

    private final pot at() {
        pou s = this.g.s();
        if (s.z()) {
            return null;
        }
        s.y(this.g.k(), this.Z);
        pot potVar = this.Z;
        Object obj = potVar.c;
        return obj instanceof aevu ? ((aevu) obj).c.y(0, potVar) : potVar;
    }

    private final aeeu au(VideoStreamingData videoStreamingData, String str, PlayerConfigModel playerConfigModel, aeru aeruVar, afjd afjdVar, afjc afjcVar, aesa aesaVar) {
        amsx amsxVar = aeez.a;
        aeeu c = this.i.e.c(playerConfigModel, videoStreamingData.p, null, afjdVar.a, afjcVar.a, adyu.bK(afjdVar.c == 3, 16) | 4, aear.q(videoStreamingData, this.i.b.o() && playerConfigModel.Z()), str, aesaVar, afkj.a(this.p, videoStreamingData.c));
        if (c.h) {
            aear.s(aeruVar, this.i.s.ao());
        }
        return c;
    }

    private final synchronized void av(final aeus aeusVar) {
        this.N = 2;
        this.ah = aeusVar;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            aeut aeutVar = aeusVar.c;
            if (!aeutVar.f38J && !aeutVar.K) {
                if (aeusVar.a.compareAndSet(false, true)) {
                    aeusVar.W();
                }
                aeusVar.c.k.post(new Runnable() { // from class: aeur
                    @Override // java.lang.Runnable
                    public final void run() {
                        aeus.this.V();
                    }
                });
                return;
            }
            aeutVar.k.post(new Runnable() { // from class: aeur
                @Override // java.lang.Runnable
                public final void run() {
                    aeus.this.V();
                }
            });
            return;
        }
        aeusVar.V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7.d < r7.b.get()) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aw(boolean r18, defpackage.aupb r19) {
        /*
            Method dump skipped, instructions count: 683
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeut.aw(boolean, aupb):void");
    }

    private final synchronized boolean ax() {
        boolean z;
        afeb S = S();
        if (S != null) {
            z = g() >= S.a;
        }
        return z;
    }

    private final synchronized boolean ay(aezf aezfVar) {
        boolean z = true;
        if (aezfVar.z != null && this.N == 3) {
            if (g() == -1) {
                return z;
            }
            if (ax()) {
                return true;
            }
        }
        z = false;
        return z;
    }

    private final synchronized boolean az(aezf aezfVar, aezf aezfVar2) {
        boolean z;
        aezf aezfVar3;
        if (this.N == 3 && !aezfVar.equals(aezfVar2) && (aezfVar3 = aezfVar.z) != null) {
            z = amkq.b(aezfVar3, aezfVar2);
        }
        return z;
    }

    @Override // defpackage.aetx
    public final void A(aeru aeruVar, afif afifVar, String str, String str2) {
        u(aeruVar, new afih(afifVar, str, g(), str2));
    }

    @Override // defpackage.afcx
    public final synchronized void B(long j, aupb aupbVar) {
        if (this.N != 3) {
            return;
        }
        if (aA(j)) {
            aw(false, aupbVar);
        }
        aetw aetwVar = this.i;
        if (aetwVar.j) {
            al(true, false);
        } else if (aetwVar.i) {
            this.w.k(true);
        }
    }

    @Override // defpackage.afcx
    public final synchronized void C(float f) {
        am(f, false);
    }

    @Override // defpackage.afcx
    public final synchronized void D(float f) {
        float f2;
        FormatStreamModel formatStreamModel;
        aezf aezfVar = this.i.n;
        if (aezfVar == null || !aezfVar.a().ah()) {
            f2 = f;
        } else {
            FormatStreamModel[] formatStreamModelArr = aezfVar.c().b;
            float c = aezfVar.a().c();
            float l = (formatStreamModelArr.length <= 0 || (formatStreamModel = formatStreamModelArr[0]) == null || !formatStreamModel.x()) ? c : aedn.l(formatStreamModelArr[0].b());
            if (Math.abs(l - c) > 0.001f) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("afmt.");
                sb.append(l);
                sb.append(";acfg.");
                sb.append(c);
                aezfVar.b.w("vmdiff", sb.toString());
            }
            f2 = aedn.n(f, l);
        }
        if (f2 != this.af) {
            afic aficVar = afic.ABR;
            plr plrVar = this.g;
            ((pom) plrVar).Q();
            float a = pts.a(f2, 0.0f, 1.0f);
            if (((pom) plrVar).l != a) {
                ((pom) plrVar).l = a;
                ((pom) plrVar).H();
                ((pom) plrVar).e.aq();
                Iterator it = ((pom) plrVar).d.iterator();
                while (it.hasNext()) {
                    ((pny) it.next()).aq();
                }
            }
            this.af = f2;
        }
        this.F = f;
    }

    @Override // defpackage.aetx
    public final synchronized void E(aeru aeruVar, afih afihVar, aezf aezfVar, plp plpVar) {
        aezf aezfVar2 = aezfVar.z;
        aezf aezfVar3 = this.i.n;
        boolean z = this.H;
        if (this.i.s.ac()) {
            z = aezfVar3 != null && aezfVar3.s;
        }
        if (afihVar.i().equals("fmt.decode") && !z && az(aezfVar, aezfVar3)) {
            aezfVar.b.g(afihVar.d());
            aezfVar3.b.g(afihVar);
            return;
        }
        if (aezfVar2 == null || !afihVar.i().equals("fmt.decode") || !aezfVar.equals(aezfVar3) || (!z && !ay(aezfVar))) {
            if (afihVar.i().equals("offline.partial.nocontent")) {
                aeruVar.g(afihVar);
                return;
            }
            if (afihVar.i().equals("player.timeout")) {
                if (!amkq.b(aezfVar, aezfVar3)) {
                    aezfVar.b.g(afihVar.d());
                    return;
                } else {
                    aeruVar.g(afihVar);
                    return;
                }
            }
            if (!afihVar.i().equals("staleconfig")) {
                afihVar.f();
            }
            if (afihVar.i().equals("fmt.decode")) {
                this.I.p(afde.DECODER_ERROR, afqu.ANDROID_EXOPLAYER_V2, 0, aflb.NONE, plpVar, null);
                this.I.a(aeruVar);
            }
            aeruVar.g(afihVar);
            if (aeruVar.equals(this.i.b())) {
                an(false, false);
                return;
            }
            return;
        }
        aezfVar.b.g(afihVar.d());
        long j = aezfVar.k;
        if (j != -1) {
            aezfVar.b.y(j);
        } else {
            aezfVar.b.y(aezfVar.b().d);
        }
        aerv aervVar = new aerv();
        aervVar.b = aezfVar2.b();
        aervVar.c = new aeqr(0L);
        aervVar.d = aezfVar2.a;
        aervVar.e = aezfVar2.a();
        aervVar.f = null;
        aervVar.g = aezfVar2.b;
        aervVar.h = aezfVar2.d();
        aervVar.u(Float.valueOf(this.F));
        aervVar.t(Float.valueOf(a()));
        aervVar.s(2);
        aervVar.l = aezfVar2.b.a();
        aervVar.a = aezfVar2.K;
        aedn.g(aervVar, true, -1L);
        K(aervVar);
    }

    @Override // defpackage.afec
    public final void F(boolean z) {
        amnp b = amnp.b(amlo.a);
        this.I.j(afqu.ANDROID_EXOPLAYER_V2);
        aeru b2 = this.i.b();
        if (z) {
            b2.v();
        }
        this.y.c(5, 24);
        this.S.c.clear();
        V();
        an(false, false);
        b2.i("lsv", new aeqs(Long.toString(b.a(TimeUnit.MILLISECONDS))));
    }

    @Override // defpackage.afcx
    public final boolean G() {
        return this.g.l() == 2;
    }

    @Override // defpackage.afbu
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afhs afhsVar = this.i.s;
        boolean D = videoStreamingData.D();
        if (!afhsVar.V(afhsVar.p.a.a.Y(axzc.s).B()) || !D) {
            aquz aquzVar = playerConfigModel.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            if (!aquzVar.g) {
                return false;
            }
        }
        return aB(afhsVar, videoStreamingData, playerConfigModel, this.i.h, z);
    }

    @Override // defpackage.afcx
    public final boolean I() {
        if (!this.g.E()) {
            return false;
        }
        int l = this.g.l();
        return l == 2 || l == 3;
    }

    @Override // defpackage.afec
    public final synchronized boolean J(afeb afebVar) {
        boolean aB;
        afeb afebVar2;
        Double d;
        aear.d(afebVar.b);
        boolean h = aedn.h(afebVar.b, 8);
        if (this.i.s.E()) {
            aetw aetwVar = this.i;
            afhs afhsVar = aetwVar.s;
            aerv aervVar = afebVar.b;
            aB = aB(afhsVar, aervVar.b, aervVar.e, aetwVar.h, h);
        } else {
            aerv aervVar2 = afebVar.b;
            aB = H(aervVar2.b, aervVar2.e, h);
        }
        aezf aezfVar = this.i.n;
        if (aB && aezfVar != null && aezfVar.j == null && ((afebVar.b.e.af() || this.i.s.E()) && (this.E instanceof aevy) && (aezfVar.b().v == afebVar.b.b.v || this.i.s.al()))) {
            try {
                aerv aervVar3 = afebVar.b;
                aeum R = R(aervVar3.d, aervVar3.b, aervVar3.e, aervVar3.a(), aedn.v(aezfVar.l, 16), afebVar.b.a);
                aerv aervVar4 = afebVar.b;
                String str = aervVar4.d;
                PlayerConfigModel playerConfigModel = aervVar4.e;
                aeru a = aervVar4.a();
                aerv aervVar5 = afebVar.b;
                VideoStreamingData videoStreamingData = aervVar5.b;
                aeuh aeuhVar = new aeuh(aervVar5);
                aeve aeveVar = this.i.a;
                aerv aervVar6 = afebVar.b;
                affc e = aeve.e(this, aervVar6.e, aervVar6.b);
                afjd afjdVar = R.c;
                afjc afjcVar = R.b;
                aeeu aeeuVar = R.a;
                afhs afhsVar2 = this.i.s;
                aerv aervVar7 = afebVar.b;
                aezf aezfVar2 = new aezf(this, str, playerConfigModel, a, videoStreamingData, aeuhVar, e, afjdVar, afjcVar, aeeuVar, afhsVar2, aervVar7.a, aervVar7.m);
                if (aezfVar2.F) {
                    afebVar2 = afebVar;
                    aezfVar2.f = afebVar2.b.c.a;
                    aeyr aeyrVar = this.C;
                    long j = afebVar2.a;
                    synchronized (aeyrVar.e) {
                        if (aeyrVar.q(aezfVar2)) {
                            if (!aeyrVar.d.isEmpty()) {
                                String b = aeyr.b(((aeyk) amkq.bj(aeyrVar.d)).c);
                                if (j != -1) {
                                    double d2 = j;
                                    Double.isNaN(d2);
                                    d = Double.valueOf(d2 / 1000.0d);
                                } else {
                                    d = null;
                                }
                                try {
                                    affg affgVar = aeyrVar.f;
                                    afki.d(affgVar.d == 3);
                                    aone createBuilder = adxd.a.createBuilder();
                                    createBuilder.copyOnWrite();
                                    adxd adxdVar = (adxd) createBuilder.instance;
                                    b.getClass();
                                    adxdVar.b |= 1;
                                    adxdVar.c = b;
                                    if (d != null) {
                                        double doubleValue = d.doubleValue();
                                        createBuilder.copyOnWrite();
                                        adxd adxdVar2 = (adxd) createBuilder.instance;
                                        adxdVar2.b |= 2;
                                        adxdVar2.d = doubleValue;
                                    }
                                    try {
                                        try {
                                        } catch (aoob e2) {
                                            throw new RuntimeException("Unexpected protobuf error", e2);
                                        }
                                    } catch (RuntimeException e3) {
                                        throw new afet(5, "Unexpected error calling into JS.", e3);
                                    }
                                } catch (afet e4) {
                                    aeyrVar.g(e4, aezfVar2);
                                }
                            }
                            aeyrVar.k(aezfVar2);
                        }
                    }
                } else {
                    afebVar2 = afebVar;
                }
                aezfVar.i = P(aezfVar2);
                aezfVar.j = afebVar2;
                aezfVar.z = aezfVar2;
                ap(aezfVar);
                return true;
            } catch (aeew e5) {
                u(afebVar.b.a(), afeu.d(afif.DEFAULT, e5, afebVar.b.b, g()));
            }
        }
        return false;
    }

    @Override // defpackage.afec
    public final synchronized afqu K(aerv aervVar) {
        afqu i;
        aeru aeruVar;
        aeuq aeuqVar;
        boolean z;
        aerv aervVar2 = aervVar;
        synchronized (this) {
            aear.d(aervVar);
            VideoStreamingData videoStreamingData = aervVar2.b;
            String str = aervVar2.d;
            PlayerConfigModel playerConfigModel = aervVar2.e;
            aeru a = aervVar.a();
            int i2 = aervVar2.k;
            this.i.g.b(a, str);
            this.I.a = this.i.s.O();
            this.I.e(afqu.ANDROID_EXOPLAYER_V2);
            a.c(((pom) this.g).j);
            aezf d = this.ah.d(str, playerConfigModel, a, videoStreamingData, i2);
            afqu afquVar = afqu.ANDROID_EXOPLAYER_V2;
            if (d == null) {
                try {
                    aeum R = R(str, videoStreamingData, playerConfigModel, a, aedn.v(i2, 16), aervVar2.a);
                    aervVar.getClass();
                    aeuh aeuhVar = new aeuh(aervVar2);
                    aeve aeveVar = this.i.a;
                    aezf aezfVar = new aezf(this, str, playerConfigModel, a, videoStreamingData, aeuhVar, aeve.e(this, playerConfigModel, videoStreamingData), R.c, R.b, R.a, this.i.s, aervVar2.a, aervVar2.m);
                    i = aezfVar.i();
                    aeruVar = a;
                    aeruVar.j(i);
                    if (R.a.f()) {
                        ((pld) this.g).J();
                    }
                    aervVar2 = aervVar;
                    z = false;
                    aeuqVar = new aeuq(this, aervVar2, aezfVar, false);
                } catch (aeew e) {
                    a.j(afquVar);
                    u(a, afeu.d(afif.DEFAULT, e, videoStreamingData, g()));
                    return afquVar;
                }
            } else {
                i = d.i();
                a.j(i);
                d.K = aervVar2.a;
                d.G = aervVar2.m;
                this.i.k = true;
                aeuqVar = new aeuq(this, aervVar2, d, true);
                aeruVar = a;
                z = false;
            }
            this.g.g(z);
            this.i.i = aedn.v(aervVar2.k, 2);
            U(aeuqVar);
            this.q.b(aeruVar);
        }
        return i;
    }

    @Override // defpackage.aetx
    public final synchronized void L(aezf aezfVar, int i) {
        this.ag = 1 == i;
        if (i != 0 && aezfVar != null && aezfVar.equals(this.i.n)) {
            pot at = at();
            if (at != null && at.n != -9223372036854775807L) {
                long c = at.c();
                aezfVar.b.k(c, pts.u(at.n) + c);
            }
            ak(false);
        }
    }

    @Override // defpackage.afcx
    public final void M() {
        this.I.c(afqu.ANDROID_EXOPLAYER_V2);
        this.y.c(5, 24);
        this.i.b().v();
        if (this.K) {
            ai();
        }
        an(true, false);
    }

    @Override // defpackage.afec
    public final void N(boolean z, int i) {
        if (i == 19) {
            if (z) {
                this.y.a();
            } else {
                this.y.c(6, 19);
            }
        } else if (z) {
            this.y.d(3);
        } else {
            this.y.c(3, i);
        }
        if (this.i.s.N()) {
            this.g.e(!z);
        }
    }

    @Override // defpackage.aetx
    public final synchronized void O(avl avlVar) {
        this.ah.f(avlVar);
    }

    public final bbr P(aezf aezfVar) {
        PlayerConfigModel a;
        VideoStreamingData b;
        aesm d;
        affc g;
        aeve aeveVar = this.i.a;
        int i = 2;
        int i2 = 0;
        if (aezfVar.b().C()) {
            synchronized (aezfVar) {
                a = aezfVar.a();
                b = aezfVar.b();
                d = aezfVar.d();
                g = aezfVar.g();
            }
            afhf a2 = afiy.a(this.f, new aeuw(aezfVar, i2), new aeuw(aezfVar, i), false, 5);
            ayr k = this.i.b.k();
            Handler handler = this.k;
            Handler handler2 = this.l;
            aewj h = aeve.h(this, aezfVar.b);
            String str = aezfVar.a;
            aezm aezmVar = aeveVar.g;
            aevc[] aevcVarArr = {aeveVar.f(this.h)};
            aetw aetwVar = this.i;
            aexj aexjVar = new aexj(a2, k, handler, handler2, a, b, d, g, h, str, aezfVar, aezmVar, aevcVarArr, aetwVar.d, aetwVar.s);
            aexjVar.jI(this.k, this.i.b);
            return aexjVar;
        }
        if (aezfVar.b().w) {
            return new aexs(aezfVar, afiy.a(this.f, new aeuw(aezfVar, 0), new aeuw(aezfVar, i), false, 5), aeveVar.b(this, aezfVar), this.i.b.k(), this.k, this.l, aeve.h(this, aezfVar.b), aeveVar.g);
        }
        if (!aezfVar.F) {
            afan afanVar = new afan(aeveVar.b, this.i.b.k(), aeveVar.b(this, aezfVar), this.l, aezfVar, aezfVar.b.a(), aeveVar.g);
            afanVar.jI(this.k, this.i.b);
            return afanVar;
        }
        bbr a3 = this.C.a(aezfVar);
        afki.a(a3);
        return a3;
    }

    public final aeeu Q(aezf aezfVar) {
        try {
            aeeu au = au(aezfVar.b(), aezfVar.a, aezfVar.a(), aezfVar.b, aezfVar.h(), aezfVar.o, aezfVar.K);
            aezfVar.t(au);
            return au;
        } catch (aeew e) {
            u(aezfVar.b, afeu.d(afif.DEFAULT, e, aezfVar.b(), g()));
            return null;
        }
    }

    public final aeum R(String str, VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, aeru aeruVar, boolean z, aesa aesaVar) {
        VideoStreamingData videoStreamingData2;
        VideoStreamingData videoStreamingData3;
        afjc b;
        if (!this.i.s.q().r || (this.i.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_CLIENT_FORMAT_SELECTION_FOR_OFFLINE) && videoStreamingData.D())) {
            videoStreamingData2 = videoStreamingData;
            videoStreamingData3 = videoStreamingData2;
        } else {
            Integer num = null;
            Integer num2 = null;
            for (Integer num3 : afkj.a(this.p, videoStreamingData.c)) {
                if (num3 != null) {
                    if (num == null && aaoq.c().contains(num3)) {
                        num = num3;
                    } else if (num2 == null && aaoq.b().contains(num3)) {
                        num2 = num3;
                    }
                }
            }
            videoStreamingData2 = (num == null || videoStreamingData.g(num.intValue()) == null) ? videoStreamingData : aapf.b(num.intValue());
            videoStreamingData3 = (num2 == null || videoStreamingData.g(num2.intValue()) == null) ? videoStreamingData : aapf.b(num2.intValue());
        }
        aetw aetwVar = this.i;
        afjd c = afje.c(videoStreamingData2, playerConfigModel, aetwVar.s, aetwVar.h);
        if (z && this.i.s.ai() && !videoStreamingData.C()) {
            b = afje.f;
        } else {
            aetw aetwVar2 = this.i;
            b = afje.b(videoStreamingData3, playerConfigModel, aetwVar2.s, aetwVar2.d(playerConfigModel));
        }
        afjc afjcVar = b;
        return new aeum(au(videoStreamingData, str, playerConfigModel, aeruVar, c, afjcVar, aesaVar), afjcVar, c);
    }

    final afeb S() {
        if (this.i.n != null) {
            return this.i.n.j;
        }
        return null;
    }

    @Override // defpackage.afdx
    public final afky T() {
        return this.i.m;
    }

    public final synchronized void U(aeuq aeuqVar) {
        this.N = 3;
        this.ah = aeuqVar;
        aeuqVar.V();
    }

    public final void V() {
        this.ad.a = this.h;
        this.C.e();
    }

    public final void W() {
        this.ad.a = this.ac;
        this.C.f();
    }

    @Override // defpackage.aeze
    public final synchronized void X(aezf aezfVar) {
        if (aezfVar.equals(this.i.n)) {
            B(0L, aupb.SEEK_SOURCE_UNKNOWN);
        }
    }

    public final void Y(aezf aezfVar, boolean z) {
        int b = b();
        if (aezfVar.y != b) {
            aezfVar.y = b;
        }
        aezfVar.K.d(b, z);
    }

    @Override // defpackage.aeze
    public final synchronized void Z(aezf aezfVar, boolean z) {
        this.w.k(false);
        if (z) {
            aetw aetwVar = this.i;
            aetwVar.i = false;
            aetwVar.j = true;
            return;
        }
        ab(aezfVar);
    }

    @Override // defpackage.afcx
    public final float a() {
        pom pomVar = (pom) this.g;
        pomVar.Q();
        return pomVar.c.u.l.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void aa() {
        if (this.N == 2) {
            aedn aednVar = this.ah;
            if (aednVar instanceof aeus) {
                aeus aeusVar = (aeus) aednVar;
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    aeusVar.V();
                } else {
                    this.k.post(new aeuy(this, 1));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ab(aezf aezfVar) {
        aflh aflhVar;
        if (Build.VERSION.SDK_INT >= 24 && (aflhVar = this.a) != null) {
            String a = aflhVar.a();
            if (!a.isEmpty()) {
                aezfVar.b.i("scd", new aeqs(a));
            }
        }
        if (this.I.b) {
            this.I.a(aezfVar.b);
        }
        Y(aezfVar, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void ac(int i) {
        aezf aezfVar = this.i.n;
        if (aezfVar == null) {
            return;
        }
        long g = g();
        StringBuilder sb = new StringBuilder(30);
        sb.append("pixelCopyErrorCode.");
        sb.append(i);
        u(aezfVar.b, new afih("player.exception", g, sb.toString()));
    }

    public final void ad(aezf aezfVar) {
        Object obj = this.i.f.get();
        this.s.c(this.g, obj, 10001);
        afkm afkmVar = (afkm) obj;
        if (afkmVar.d > 0 || afkmVar.c > 0) {
            aetw aetwVar = this.i;
            aezfVar.y(aetwVar.s, aetwVar.d, afkmVar, 10001, aetwVar.g());
        }
    }

    public final synchronized void ae(bbr bbrVar, long j, afjf afjfVar) {
        this.E = bbrVar;
        aud audVar = this.V;
        if (audVar instanceof aevm) {
            pod d = this.g.d(audVar);
            d.f(10001);
            d.e(new aetj(afjfVar, 1, 0L));
            d.d();
        }
        aud audVar2 = this.W;
        if (audVar2 instanceof aevm) {
            pod d2 = this.g.d(audVar2);
            d2.f(10001);
            d2.e(new aetj(afjfVar, 1, 0L));
            d2.d();
        }
        pod d3 = this.g.d(this.T);
        d3.f(10001);
        d3.e(new aetj(afjfVar, 1, 0L));
        d3.d();
        pod d4 = this.g.d(this.U);
        d4.f(10001);
        d4.e(new aetj(afjfVar, 2, 0L));
        d4.d();
        pod d5 = this.g.d(this.m);
        d5.f(10001);
        d5.e(new aetj(afjfVar, 2, 0L));
        d5.d();
        if (j > 0) {
            plr plrVar = this.g;
            ((pom) plrVar).Q();
            ((pom) plrVar).c.y(Collections.singletonList(bbrVar), 0, j, false);
        } else {
            this.g.f(bbrVar);
        }
        afjfVar.A();
        this.g.v();
        this.R = true;
    }

    public final void af(aezf aezfVar, int i) {
        this.s.f(this.g, aezfVar.c().f);
        aetw aetwVar = this.i;
        aezfVar.y(aetwVar.s, aetwVar.d, (afkm) aetwVar.f.get(), i, this.i.g());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0115 A[Catch: all -> 0x011c, TryCatch #5 {, blocks: (B:20:0x004b, B:21:0x0054, B:23:0x005a, B:25:0x0062, B:30:0x006c, B:34:0x0080, B:36:0x0088, B:39:0x0091, B:42:0x00ac, B:44:0x00bd, B:45:0x00c3, B:47:0x00de, B:49:0x00e0, B:51:0x0115, B:52:0x011a, B:56:0x00fa, B:57:0x0101, B:60:0x0103, B:61:0x010a, B:64:0x0110), top: B:19:0x004b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ag(boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeut.ag(boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void ah() {
        aewe aeweVar;
        aze azeVar;
        if (this.i.s.p().Z && this.i.b != null && (azeVar = (aeweVar = this.i.b).b) != null) {
            aeweVar.m(azeVar);
        }
        aetw aetwVar = this.i;
        aetwVar.b = aetwVar.a.i(this, this.P, new aeuu(this, null), this.i.s);
    }

    public final void ai() {
        aj(null, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b6  */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void aj(defpackage.aezf r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeut.aj(aezf, boolean):void");
    }

    public final void ak(boolean z) {
        aw(z, aupb.SEEK_SOURCE_UNKNOWN);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void al(boolean z, boolean z2) {
        aetw aetwVar = this.i;
        if (aetwVar.i != z || z2) {
            aetwVar.i = z;
            if (z) {
                aetwVar.j = false;
                aetwVar.b().a().F();
            }
            this.g.z(z);
            this.w.k(z);
            if (this.i.s.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
                aesa c = this.i.c();
                String str = true != z ? "pauseVideo." : "playVideo.";
                String valueOf = String.valueOf(afhm.c());
                c.j("pdl", valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        }
    }

    public final void am(float f, boolean z) {
        aezf aezfVar = this.i.n;
        if (aezfVar == null) {
            return;
        }
        if (f != a()) {
            this.g.B(new pnu(f));
            this.s.e(this.g, f);
        } else if (z) {
            aezfVar.b.p(f);
            if (f != 1.0d) {
                this.s.e(this.g, f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:7:0x003b, B:9:0x0047, B:11:0x004b, B:13:0x0050, B:14:0x0053, B:16:0x005a, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:28:0x0015, B:30:0x001e, B:32:0x0022, B:34:0x0031, B:35:0x0034, B:37:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:7:0x003b, B:9:0x0047, B:11:0x004b, B:13:0x0050, B:14:0x0053, B:16:0x005a, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:28:0x0015, B:30:0x001e, B:32:0x0022, B:34:0x0031, B:35:0x0034, B:37:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:7:0x003b, B:9:0x0047, B:11:0x004b, B:13:0x0050, B:14:0x0053, B:16:0x005a, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:28:0x0015, B:30:0x001e, B:32:0x0022, B:34:0x0031, B:35:0x0034, B:37:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a A[Catch: all -> 0x0081, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x000b, B:7:0x003b, B:9:0x0047, B:11:0x004b, B:13:0x0050, B:14:0x0053, B:16:0x005a, B:18:0x0062, B:20:0x006a, B:21:0x006d, B:28:0x0015, B:30:0x001e, B:32:0x0022, B:34:0x0031, B:35:0x0034, B:37:0x0038), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void an(boolean r6, boolean r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            aetw r0 = r5.i     // Catch: java.lang.Throwable -> L81
            aezf r0 = r0.n     // Catch: java.lang.Throwable -> L81
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L13
            if (r7 != 0) goto L3b
            aevl r6 = r5.w     // Catch: java.lang.Throwable -> L81
            boolean r6 = r6.m()     // Catch: java.lang.Throwable -> L81
            r7 = r6 ^ 1
        L13:
            if (r7 != 0) goto L3b
            plr r6 = r5.g     // Catch: java.lang.Throwable -> L81
            pld r6 = (defpackage.pld) r6     // Catch: java.lang.Throwable -> L81
            r6.J()     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L34
            boolean r6 = r0.F     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L34
            aeyr r6 = r5.C     // Catch: java.lang.Throwable -> L81
            plr r7 = r6.a     // Catch: java.lang.Throwable -> L81
            r3 = 0
            r7.c(r3)     // Catch: java.lang.Throwable -> L81
            boolean r7 = r6.q(r2)     // Catch: java.lang.Throwable -> L81
            if (r7 == 0) goto L34
            r6.m(r2)     // Catch: java.lang.Throwable -> L81
        L34:
            boolean r6 = r5.f38J     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L3b
            r5.ai()     // Catch: java.lang.Throwable -> L81
        L3b:
            r5.u = r2     // Catch: java.lang.Throwable -> L81
            aevl r6 = r5.w     // Catch: java.lang.Throwable -> L81
            r7 = 0
            r6.k(r7)     // Catch: java.lang.Throwable -> L81
            r5.E = r2     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L4e
            aelf r6 = r0.d     // Catch: java.lang.Throwable -> L81
            if (r6 == 0) goto L4e
            r6.d()     // Catch: java.lang.Throwable -> L81
        L4e:
            if (r0 == 0) goto L53
            r5.ab(r0)     // Catch: java.lang.Throwable -> L81
        L53:
            aetw r6 = r5.i     // Catch: java.lang.Throwable -> L81
            r6.f(r2)     // Catch: java.lang.Throwable -> L81
            if (r0 == 0) goto L5f
            java.lang.String r6 = r0.l()     // Catch: java.lang.Throwable -> L81
            goto L60
        L5f:
            r6 = r2
        L60:
            if (r6 == 0) goto L68
            aejn r7 = r5.p     // Catch: java.lang.Throwable -> L81
            aejc r2 = r7.b(r6)     // Catch: java.lang.Throwable -> L81
        L68:
            if (r2 == 0) goto L6d
            r2.f()     // Catch: java.lang.Throwable -> L81
        L6d:
            aetw r6 = r5.i     // Catch: java.lang.Throwable -> L81
            afdt r6 = r6.c     // Catch: java.lang.Throwable -> L81
            r6.c()     // Catch: java.lang.Throwable -> L81
            afgb r6 = r5.B     // Catch: java.lang.Throwable -> L81
            r6.c()     // Catch: java.lang.Throwable -> L81
            r5.N = r1     // Catch: java.lang.Throwable -> L81
            aedn r6 = r5.ai     // Catch: java.lang.Throwable -> L81
            r5.ah = r6     // Catch: java.lang.Throwable -> L81
            monitor-exit(r5)
            return
        L81:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeut.an(boolean, boolean):void");
    }

    @Override // defpackage.afdx
    public final void ao() {
        this.i.p = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void ap(aezf aezfVar) {
        bbr bbrVar = this.E;
        if (bbrVar instanceof aevy) {
            aevy aevyVar = (aevy) bbrVar;
            if (this.i.l) {
                aevyVar.C();
                this.i.l = false;
            } else {
                if (aezfVar.i == null) {
                    aevyVar.B();
                    return;
                }
                afeb afebVar = aezfVar.j;
                afki.a(afebVar);
                aevyVar.D(aezfVar.i, afebVar.a, afebVar.b.c.a);
                boolean h = aedn.h(afebVar.b, 4);
                this.g.g(h);
                aezfVar.c.i = h;
            }
        }
    }

    @Override // defpackage.afdx
    public final /* synthetic */ boolean aq() {
        return false;
    }

    @Override // defpackage.aevk
    public final synchronized void ar() {
        aezf aezfVar = this.i.n;
        if (aezfVar != null) {
            u(aezfVar.b, new afih("gl", g()));
        }
    }

    @Override // defpackage.afcx
    public final int b() {
        return this.S.aq();
    }

    @Override // defpackage.afec
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        afhs afhsVar = this.i.s;
        int i = true != aear.m(videoStreamingData, playerConfigModel.g) ? 4 : 5;
        if (afhsVar.D()) {
            i |= 16;
        }
        if (playerConfigModel.aF()) {
            i |= 2;
        }
        return (playerConfigModel.aw() && videoStreamingData.r()) ? i | 8 : i;
    }

    @Override // defpackage.afcx
    public final int e() {
        aety aetyVar = this.S;
        auj aujVar = aetyVar.b;
        int i = aetyVar.a;
        return aujVar != null ? i + aujVar.e : i;
    }

    @Override // defpackage.afec
    public final long f() {
        long d;
        pot at = at();
        if (at == null) {
            return -1L;
        }
        long c = at.c();
        pom pomVar = (pom) this.g;
        pomVar.Q();
        pme pmeVar = pomVar.c;
        if (pmeVar.G()) {
            pnt pntVar = pmeVar.u;
            d = pntVar.t.equals(pntVar.s) ? plh.d(pmeVar.u.o) : pmeVar.q();
        } else if (pmeVar.u.a.z()) {
            d = pmeVar.w;
        } else {
            pnt pntVar2 = pmeVar.u;
            if (pntVar2.t.d != pntVar2.s.d) {
                d = pntVar2.a.y(pmeVar.k(), pmeVar.a).b();
            } else {
                long j = pntVar2.o;
                if (pmeVar.u.t.a()) {
                    pnt pntVar3 = pmeVar.u;
                    pntVar3.a.jH(pntVar3.t.a, pmeVar.g).f(pmeVar.u.t.b);
                    j = 0;
                }
                pnt pntVar4 = pmeVar.u;
                d = plh.d(pmeVar.H(pntVar4.a, pntVar4.t, j));
            }
        }
        return c + d;
    }

    @Override // defpackage.afec
    public final long g() {
        pot at = at();
        if (at == null) {
            return -1L;
        }
        return at.c() + this.g.p();
    }

    @Override // defpackage.afec
    public final long h() {
        pot at = at();
        if (at == null) {
            return -1L;
        }
        long j = at.f;
        if (j == -9223372036854775807L) {
            return -1L;
        }
        return j + this.g.p();
    }

    @Override // defpackage.afec
    public final long i() {
        pot at = at();
        if (at == null || at.n == -9223372036854775807L) {
            return -1L;
        }
        return at.c() + (at.n / 1000);
    }

    @Override // defpackage.afcx
    public final long j(long j) {
        bbr bbrVar = this.E;
        if (bbrVar instanceof aewk) {
            return ((aewk) bbrVar).A(pts.r(j));
        }
        return -1L;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel k() {
        aezf aezfVar = this.i.n;
        if (aezfVar != null) {
            return aezfVar.m;
        }
        return null;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel l() {
        aezf aezfVar = this.i.n;
        if (aezfVar != null) {
            return aezfVar.x;
        }
        return null;
    }

    @Override // defpackage.afec
    public final aeeu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        aetw aetwVar = this.i;
        afjd c = afje.c(videoStreamingData, playerConfigModel, aetwVar.s, aetwVar.h);
        HashSet hashSet = new HashSet(c.a);
        aetw aetwVar2 = this.i;
        HashSet hashSet2 = new HashSet(afje.b(videoStreamingData, playerConfigModel, aetwVar2.s, aetwVar2.d(playerConfigModel)).a);
        if (this.i.s.p().W) {
            hashSet.removeAll(aaoq.w());
            hashSet2.removeAll((Set) aaoq.bv.get());
        }
        return this.i.e.c(playerConfigModel, videoStreamingData.p, aeesVar, hashSet, hashSet2, adyu.bJ(z, 2) | 5 | adyu.bK(c.c == 3, 16), i, null, aesa.a, afkj.a);
    }

    @Override // defpackage.afcx
    public final synchronized aeou n() {
        aetw aetwVar;
        boolean z;
        boolean z2 = S() != null;
        long as = as();
        aetwVar = this.i;
        if (aetwVar.p == null) {
            aezf aezfVar = aetwVar.n;
            aetwVar.p = new aeou(aezfVar != null ? aezfVar.i() : afqu.ANDROID_EXOPLAYER_V2);
            aetwVar.r = true;
        }
        if (aetwVar.b != null) {
            aewe aeweVar = aetwVar.b;
            aeou aeouVar = aetwVar.p;
            if (aeweVar.c != 0) {
                boolean z3 = aeweVar.e;
                int j = aeweVar.j();
                int i = aeweVar.c;
                aeouVar.a(z3, j, i != 1, i == 2, aeweVar.d, false);
            }
        }
        if (aetwVar.r) {
            z = z2;
        } else {
            if (z2) {
                z = true;
            }
        }
        aeou aeouVar2 = aetwVar.p;
        VideoStreamingData b = aetwVar.n != null ? aetwVar.n.b() : null;
        afdt afdtVar = aetwVar.c;
        aeouVar2.b(b, z, as, afdtVar.b, afdtVar.c, aetwVar.q, aetwVar.a().aT());
        aetwVar.r = false;
        return aetwVar.p;
    }

    @Override // defpackage.afcx
    public final String o() {
        if (this.i.s.p().P) {
            return this.u;
        }
        aezf aezfVar = this.i.n;
        if (aezfVar != null) {
            return aezfVar.a;
        }
        return null;
    }

    @Override // defpackage.afec
    public final synchronized void p(afky afkyVar) {
        aflh aflhVar;
        this.h.e = true;
        this.y.d(4);
        this.I.b(afqu.ANDROID_EXOPLAYER_V2);
        if (this.w.o(afkyVar, this.i.n, this.i.i && this.N == 3)) {
            this.ah.e(afkyVar);
            this.C.o(true);
            if (Build.VERSION.SDK_INT < 24 || (aflhVar = this.a) == null) {
                return;
            }
            aflhVar.d();
            return;
        }
        an(false, true);
    }

    @Override // defpackage.afcx
    public final synchronized void q() {
        if (this.N != 3) {
            return;
        }
        this.i.s.aF();
        aezf aezfVar = this.i.n;
        if (aezfVar == null || aezfVar.j == null) {
            return;
        }
        aezfVar.i = null;
        aezfVar.z = null;
        aezfVar.j = null;
        ap(aezfVar);
    }

    @Override // defpackage.afcx
    public final void r() {
        afky afkyVar = this.i.m;
        if (afkyVar != null) {
            afkyVar.k();
        }
    }

    @Override // defpackage.poh
    public final poe[] rl(Handler handler, bhn bhnVar, awb awbVar, pqb pqbVar, ppa ppaVar) {
        awx awxVar;
        aetw aetwVar = this.i;
        aeve aeveVar = aetwVar.a;
        boolean N = aetwVar.s.N();
        boolean T = this.i.s.T();
        if (N) {
            awxVar = new awx(null, new awr(new avr[0]), true != T ? 1 : 2);
        } else {
            awxVar = new awx(null, aeve.a);
        }
        aevq aevqVar = new aevq(aeveVar.e, awbVar, this.i, handler, this.n, awxVar);
        aeve.c(aevqVar, this);
        this.T = aevqVar;
        aevr aevrVar = new aevr(aeveVar.e, bhnVar, this.i, handler, this.n, this.I, r4.s.e(), this.z);
        aeve.c(aevrVar, this);
        this.m = aevrVar;
        afhs afhsVar = this.i.s;
        this.U = new aevo(handler, bhnVar, afhsVar.ap(), afhsVar.c(), afhsVar.d(), this.i.c, afhsVar.e());
        this.V = new aevm(awbVar, handler, new avr[0]);
        this.W = new aevm(awbVar, handler, new aetr(this.O, this.i));
        auc aucVar = new auc(5000L, handler, bhnVar, 50);
        this.X = aucVar;
        poe[] poeVarArr = {this.T, this.m, this.U, this.V, this.W, aucVar};
        this.Y = poeVarArr;
        return poeVarArr;
    }

    @Override // defpackage.afcx
    public final synchronized void s() {
        amnp b = amnp.b(amlo.a);
        this.h.e = false;
        this.y.c(4, 17);
        this.I.d(afqu.ANDROID_EXOPLAYER_V2);
        this.w.o(null, this.i.n, false);
        this.ah.e(null);
        this.C.o(false);
        this.i.b().i("ldm", new aeqs(Long.toString(b.a(TimeUnit.MILLISECONDS))));
    }

    @Override // defpackage.afec
    public final void t(aaox aaoxVar, aeru aeruVar) {
        aesa b = aery.b(this.k, this.aa.c(aaoxVar.b), aeruVar);
        aeua aeuaVar = this.c;
        String str = aaoxVar.b;
        PlayerConfigModel playerConfigModel = aaoxVar.f;
        aeuaVar.d = b;
        if (aeuaVar.e.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_PLAYER_DEBUG_LOGGING)) {
            String valueOf = String.valueOf(str);
            b.j("pdl", valueOf.length() != 0 ? "loadOnesieVideo.".concat(valueOf) : new String("loadOnesieVideo."));
        }
        if (aeuaVar.e.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_AV1_DEBUG_LOGGING)) {
            b.f("swpres", true != playerConfigModel.X().contains("c2.android.av1.decoder") ? "abs" : "pres");
        }
        this.i.e(aaoxVar.b, b, aaoxVar.f, ((aemt) aeruVar).a);
        this.i.g.b(aeruVar, aaoxVar.b);
        if (this.i.s.aF() && this.i.s.ag()) {
            this.ae.a = this.C;
        } else {
            this.ae.a = null;
        }
        if (this.i.s.ag()) {
            synchronized (this) {
                av(new aeus(this, aaoxVar, this.i.s.q().f, aeruVar, b));
            }
        }
    }

    @Override // defpackage.aetx
    public final void u(aeru aeruVar, afih afihVar) {
        aeruVar.g(afihVar);
        if (aeruVar.equals(this.i.b()) && afihVar.n()) {
            an(false, false);
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        aezf aezfVar;
        if (observable instanceof afhs) {
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 2) {
                synchronized (this) {
                    if (this.N == 3 && this.w.n(this.i.n)) {
                        this.w.o(this.i.m, this.i.n, this.i.i);
                    }
                }
                return;
            }
            return;
        }
        aetw aetwVar = this.i;
        if (observable != aetwVar.f || (aezfVar = aetwVar.n) == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            ad(aezfVar);
        } else {
            this.k.post(new aeud(this, aezfVar, 0));
        }
    }

    @Override // defpackage.afcx
    public final synchronized void v() {
        if (this.N != 3) {
            return;
        }
        al(false, false);
    }

    @Override // defpackage.afcx
    public final synchronized void w() {
        aezf aezfVar = this.i.n;
        if (aezfVar != null && this.N == 3) {
            aezf aezfVar2 = aezfVar.z;
            boolean ac = this.i.s.ac();
            if (ac && aezfVar2 == null) {
                return;
            }
            try {
                this.H = true;
                if (aezfVar2 != null) {
                    aezfVar2.s = true;
                }
                aezfVar.k = g();
                if (ac) {
                    this.i.f(aezfVar2);
                }
                plr plrVar = this.g;
                plrVar.x(plrVar.a(), 0L);
                this.g.g(false);
                if (this.i.s.x()) {
                    aezfVar.K.f("seek", afhm.c());
                }
            } catch (pmu unused) {
                this.H = false;
                if (aezfVar2 != null) {
                    aezfVar2.s = false;
                }
                aezfVar.k = -1L;
                afeb afebVar = aezfVar.j;
                this.i.b().g(new afih("gapless.seek.next", g(), afebVar == null ? "queuedVideo.null" : "queuedVideo.valid"));
                if (afebVar != null) {
                    aerv aervVar = new aerv(afebVar.b);
                    aervVar.f = this.i.m;
                    aervVar.r(2);
                    K(aervVar);
                }
            }
        }
    }

    @Override // defpackage.afcx
    public final synchronized void x() {
        if (this.N != 3) {
            return;
        }
        if (this.g.l() == 4) {
            aA(0L);
        }
        al(true, false);
    }

    @Override // defpackage.afec
    public final void y() {
        this.w.i();
    }

    @Override // defpackage.afcx
    public final void z() {
        ag(false, true);
    }

    @Override // defpackage.afec
    public final int d() {
        aezf aezfVar = this.i.n;
        return (aezfVar != null ? aezfVar.g() : affc.a).a(h(), this.Q.c());
    }
}
