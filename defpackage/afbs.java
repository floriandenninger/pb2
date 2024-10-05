package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.youtube.libvpx.VpxDecoder;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData;
import com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afbs implements WidevineHelper$Listener, Observer, afbu, oxj, pac, aesw, afdx {
    private static final afaw aC = afaw.a;
    int A;
    public volatile Object B;
    public afbw C;
    public long D;
    public oyw E;
    public affc F;
    public aeeu G;
    public FormatStreamModel H;
    public FormatStreamModel I;

    /* renamed from: J, reason: collision with root package name */
    public aenk f42J;
    public FormatStreamModel K;
    public aeex L;
    public int M;
    public int N;
    public final afhs O;
    public final muf P;
    private final Context Q;
    private final adxr R;
    private final afix S;
    private final aehs T;
    private final aeha U;
    private final afdu V;
    private afbe W;
    private final aeez X;
    private final afbf Y;
    private final afkn Z;
    public final amnv a;
    private int aA;
    private aeti aB;
    private final afax aD;
    private final axfg aE;
    private afdm aF;
    private final AtomicInteger aa;
    private final afhf ab;
    private final afbi ac;
    private final ptk ad;
    private final afhw ae;
    private final aejn af;
    private final shf ag;
    private afed ah;
    private oyx ai;
    private oyx aj;
    private Surface ak;
    private pkd al;
    private aepe am;
    private float an;
    private boolean ao;
    private boolean ap;
    private String aq;
    private aepx ar;
    private boolean as;
    private float at;
    private int au;
    private boolean av;
    private ScheduledFuture aw;
    private afkm ax;
    private boolean ay;
    private aeou az;
    public final ysy b;
    public final ScheduledExecutorService c;
    public final aenf d;
    public final afdf e;
    public aeru f;
    public aesa g;
    final afbr h;
    public final afbq i;
    public final Handler j;
    final afbk k;
    public final afdq l;
    public final afdp m;
    public final afep n;
    public final afdt o;
    afky p;
    afbl q;
    public oxk r;
    public afef s;
    public VideoStreamingData t;
    public afbm u;
    public int v;
    public int w;
    public PlayerConfigModel x;
    public boolean y;
    public Future z;

    public afbs(Context context, ysy ysyVar, adxr adxrVar, ScheduledExecutorService scheduledExecutorService, afix afixVar, aenf aenfVar, aehs aehsVar, aeez aeezVar, aeqg aeqgVar, afhs afhsVar, afkn afknVar, axfg axfgVar, shf shfVar, azrw azrwVar, afhf afhfVar, ptk ptkVar, afdf afdfVar, afhw afhwVar, aejn aejnVar, afdq afdqVar) {
        muf mufVar = adyv.a;
        afax afaxVar = new afax(context, azrwVar, aeqgVar);
        afaw afawVar = aC;
        amnv amnvVar = afje.a;
        Handler handler = new Handler(Looper.getMainLooper());
        this.aa = new AtomicInteger();
        this.ac = new afbi();
        this.m = new afdp();
        this.E = new oyv(0L, 0L);
        this.L = aeex.a;
        this.M = 0;
        this.aA = 0;
        this.Q = context.getApplicationContext();
        afki.a(ysyVar);
        this.b = ysyVar;
        afki.a(adxrVar);
        this.R = adxrVar;
        afki.a(scheduledExecutorService);
        this.c = scheduledExecutorService;
        afki.a(afixVar);
        this.S = afixVar;
        afki.a(aenfVar);
        this.d = aenfVar;
        afki.a(aehsVar);
        this.T = aehsVar;
        afki.a(aeezVar);
        this.X = aeezVar;
        afki.a(afhsVar);
        this.O = afhsVar;
        afki.a(afknVar);
        this.Z = afknVar;
        afki.a(axfgVar);
        this.aE = axfgVar;
        afki.a(mufVar);
        this.P = mufVar;
        afki.a(shfVar);
        this.ag = shfVar;
        this.F = affc.a;
        afki.a(afaxVar);
        this.aD = afaxVar;
        afki.a(afhfVar);
        this.ab = afhfVar;
        afki.a(afawVar);
        afki.a(amnvVar);
        this.a = amnvVar;
        afki.a(ptkVar);
        this.ad = ptkVar;
        this.e = afdfVar;
        this.U = new aeha(context, shfVar, afhsVar, handler, ysyVar);
        this.j = handler;
        this.aB = aeti.b;
        this.V = new afdu(adxrVar, afhsVar);
        this.k = new afbk(this);
        this.f = aeru.c;
        this.g = aesa.a;
        this.h = new afbr(this);
        this.W = new afbe(new afaq(this, 5), this.f);
        this.Y = new afbf(this);
        this.i = new afbq(this);
        this.o = new afdt(afdfVar, handler, this, afqu.ANDROID_EXOPLAYER, afhsVar);
        this.n = new afep();
        this.at = 1.0f;
        this.av = true;
        this.ae = afhwVar;
        this.af = aejnVar;
        this.l = afdqVar;
    }

    public static long A(VideoStreamingData videoStreamingData) {
        try {
            int i = videoStreamingData.g;
            pah h = ((pav) ((pal) ((pao) videoStreamingData.k.l).b(((pao) r9).a() - 1).b.get(0)).b.get(0)).h();
            int a = h.a();
            int b = h.b(0L);
            long j = 0;
            for (int max = Math.max(a, (b - i) + 1); max <= b; max++) {
                j += h.d(max, 0L);
            }
            return j / 1000;
        } catch (IndexOutOfBoundsException | NullPointerException e) {
            throw new afbh(e);
        }
    }

    private final void aA() {
        this.r.n();
        aepe aepeVar = this.am;
        if (aepeVar != null) {
            aepeVar.l();
        }
    }

    private final void aB(aeeu aeeuVar) {
        afki.a(this.r);
        afki.a(this.x);
        if (this.x.au() && aeeuVar.a.length > 1) {
            this.r.k(this.s, 1, aeeuVar.f);
        }
        aD(aeeuVar);
    }

    private final void aC() {
        this.au = e();
        this.A = b();
    }

    private final void aD(aeeu aeeuVar) {
        PlayerConfigModel playerConfigModel;
        if (this.r == null || (playerConfigModel = this.x) == null || aeeuVar == null || !this.ap || !playerConfigModel.au() || aeeuVar.b.length <= 1) {
            return;
        }
        String c = aeeuVar.c();
        int b = this.r.b(0);
        FormatStreamModel[] formatStreamModelArr = aeeuVar.b;
        int length = formatStreamModelArr.length;
        String str = null;
        String str2 = null;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            FormatStreamModel formatStreamModel = formatStreamModelArr[i];
            if (c != null && c.equals(formatStreamModel.q())) {
                str = formatStreamModel.e;
                break;
            }
            if (str2 == null && formatStreamModel.E()) {
                str2 = formatStreamModel.e;
            }
            i++;
        }
        if (str != null || str2 == null) {
            str2 = str;
        }
        if (str2 != null) {
            MediaFormat[] mediaFormatArr = ((oxm) this.r).c[0];
            int length2 = mediaFormatArr != null ? mediaFormatArr.length : 0;
            for (int i2 = 0; i2 < length2; i2++) {
                if (str2.equals(((oxm) this.r).c[0][i2].a)) {
                    if (i2 != b) {
                        this.r.m(0, i2);
                        oxk oxkVar = this.r;
                        oxkVar.j(oxkVar.c() + 1);
                        if (this.O.x()) {
                            this.f.i("seek", new aeqs(afjz.a(Thread.currentThread().getStackTrace())));
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
        this.r.m(0, 0);
    }

    private final boolean aF() {
        return this.x.Y() || Float.compare(this.at, 1.0f) != 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean aG(int r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.aG(int):boolean");
    }

    private final boolean aH(aflb aflbVar, boolean z) {
        if (this.p == null) {
            return false;
        }
        try {
            this.e.g(aflbVar, afqu.ANDROID_EXOPLAYER);
            this.p.t(aflbVar);
            if (this.p.C().equals(aflb.GL_GVR)) {
                ((afko) this.p.h()).F(true != aI() ? 1 : 2);
            }
            return true;
        } catch (IllegalStateException e) {
            ar(e, z);
            return false;
        } catch (UnsupportedOperationException e2) {
            if (aflbVar.equals(aflb.GL_GVR)) {
                this.e.g(aflb.SURFACE, afqu.ANDROID_EXOPLAYER);
                return aH(aflb.SURFACE, z);
            }
            ar(e2, z);
            return false;
        }
    }

    private final boolean aI() {
        return this.N == 4;
    }

    private final oyx[] aJ(VideoStreamingData videoStreamingData, FormatStreamModel[] formatStreamModelArr, FormatStreamModel[] formatStreamModelArr2, aeex aeexVar, boolean z, aeru aeruVar) {
        int i;
        boolean z2;
        final int i2 = 0;
        if (videoStreamingData.y()) {
            aaos aaosVar = videoStreamingData.k;
            afjf a = aeruVar.a();
            this.s = am(formatStreamModelArr2[0].f, aeexVar);
            afdw aL = aL(aN());
            long A = A(this.t);
            Handler handler = this.j;
            afbb afbbVar = new afbb(this);
            aaosVar.o = handler;
            aaosVar.p = afbbVar;
            afed afedVar = new afed(new aesr(aaosVar, aS(formatStreamModelArr), ak(this.x, aeru.c), this.s, A, this.j, this, u()), aL, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), this.am, aF());
            this.ah = afedVar;
            return new oyx[]{new aetc(new afdy(new aesr(aaosVar, aR(formatStreamModelArr2), ak(this.x, aeru.c), null, A, this.j, this, u()), aL, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), this.am), this.ac, this.am, this.j, this.W, new aetj(a, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aF()), aj(afedVar, aI(), a)};
        }
        if (!videoStreamingData.C()) {
            long j = videoStreamingData.d;
            afdw aL2 = aL(aN());
            int length = formatStreamModelArr.length;
            oyx[] oyxVarArr = new oyx[length > 0 ? 2 : 1];
            int i3 = true != this.x.au() ? 1 : Integer.MAX_VALUE;
            if (aQ(this.x, this.t)) {
                i = (formatStreamModelArr2.length > 0 && aaoq.s().contains(Integer.valueOf(formatStreamModelArr2[0].e())) && this.x.aC() && ((Boolean) afje.d.get()).booleanValue()) ? 6 : 7;
            } else {
                i = 2;
            }
            int i4 = i3;
            oyxVarArr[0] = aO(aL2, an(aR(formatStreamModelArr2), null, j, 1, aK(formatStreamModelArr2, this.aq, i3), aedn.t(this.x), null, aeruVar), i, aeruVar.a());
            if (length > 0) {
                this.s = am(formatStreamModelArr2[0].f, aeexVar);
                oyxVarArr[1] = aM(aL2, an(aS(formatStreamModelArr), this.s, j, 0, aK(formatStreamModelArr, this.aq, i4), aedn.u(this.x, this.d), null, aeruVar), this.x.aU(), z, aeruVar.a());
            }
            return oyxVarArr;
        }
        boolean G = videoStreamingData.G();
        afjf a2 = aeruVar.a();
        this.s = am(formatStreamModelArr2[0].f, aeexVar);
        afdw aL3 = aL(aN());
        Exchanger exchanger = new Exchanger();
        int ag = ag();
        if (!G) {
            aquz aquzVar = this.x.c.e;
            if (aquzVar == null) {
                aquzVar = aquz.b;
            }
            if (!aquzVar.aP) {
                z2 = false;
                final PlayerConfigModel playerConfigModel = this.x;
                Arrays.sort(formatStreamModelArr, new uo(13));
                final int i5 = 1;
                afed afedVar2 = new afed(new aesy(this.aq, formatStreamModelArr, afiy.a(this.S, new amnv() { // from class: afaz
                    @Override // defpackage.amnv
                    public final Object get() {
                        return i5 != 0 ? playerConfigModel : playerConfigModel;
                    }
                }, new afaq(this, 4), false, 5), this.s, this.F, this.P, z2, ag, exchanger, this.j, null, u(), this.x, this.t.E(), this.b, null, null, null, null), aL3, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
                this.ah = afedVar2;
                return new oyx[]{new aetc(new afdy(new aesy(this.aq, formatStreamModelArr2, afiy.a(this.S, new amnv() { // from class: afaz
                    @Override // defpackage.amnv
                    public final Object get() {
                        return i2 != 0 ? playerConfigModel : playerConfigModel;
                    }
                }, new afaq(this, 4), false, 5), null, this.F, this.P, G, ag, exchanger, this.j, this, u(), this.x, this.t.E(), this.b, null, null, null, null), aL3, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), null), this.ac, this.am, this.j, this.W, new aetj(a2, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aF()), aj(afedVar2, aI(), a2)};
            }
        }
        z2 = true;
        final PlayerConfigModel playerConfigModel2 = this.x;
        Arrays.sort(formatStreamModelArr, new uo(13));
        final int i52 = 1;
        afed afedVar22 = new afed(new aesy(this.aq, formatStreamModelArr, afiy.a(this.S, new amnv() { // from class: afaz
            @Override // defpackage.amnv
            public final Object get() {
                return i52 != 0 ? playerConfigModel2 : playerConfigModel2;
            }
        }, new afaq(this, 4), false, 5), this.s, this.F, this.P, z2, ag, exchanger, this.j, null, u(), this.x, this.t.E(), this.b, null, null, null, null), aL3, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
        this.ah = afedVar22;
        return new oyx[]{new aetc(new afdy(new aesy(this.aq, formatStreamModelArr2, afiy.a(this.S, new amnv() { // from class: afaz
            @Override // defpackage.amnv
            public final Object get() {
                return i2 != 0 ? playerConfigModel2 : playerConfigModel2;
            }
        }, new afaq(this, 4), false, 5), null, this.F, this.P, G, ag, exchanger, this.j, this, u(), this.x, this.t.E(), this.b, null, null, null, null), aL3, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y(), null), this.ac, this.am, this.j, this.W, new aetj(a2, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aF()), aj(afedVar22, aI(), a2)};
    }

    private final pau[] aK(FormatStreamModel[] formatStreamModelArr, String str, int i) {
        FormatStreamModel[] formatStreamModelArr2 = formatStreamModelArr;
        int min = Math.min(formatStreamModelArr2.length, i);
        pau[] pauVarArr = new pau[min];
        int i2 = 0;
        while (i2 < min) {
            FormatStreamModel formatStreamModel = formatStreamModelArr2[i2];
            PlayerConfigModel playerConfigModel = this.x;
            aane n = formatStreamModel.n();
            n.c(str);
            n.e(adyu.N(formatStreamModel, playerConfigModel));
            Uri a = n.a();
            aqxz aqxzVar = formatStreamModel.a;
            String str2 = formatStreamModel.b;
            long k = formatStreamModel.k();
            ozv d = ozv.d(formatStreamModel);
            String uri = a.toString();
            aqya aqyaVar = aqxzVar.m;
            if (aqyaVar == null) {
                aqyaVar = aqya.a;
            }
            long j = aqyaVar.c;
            aqya aqyaVar2 = aqxzVar.m;
            if (aqyaVar2 == null) {
                aqyaVar2 = aqya.a;
            }
            int i3 = min;
            long j2 = aqyaVar2.d;
            aqya aqyaVar3 = aqxzVar.n;
            if (aqyaVar3 == null) {
                aqyaVar3 = aqya.a;
            }
            long j3 = aqyaVar3.c;
            aqya aqyaVar4 = aqxzVar.n;
            if (aqyaVar4 == null) {
                aqyaVar4 = aqya.a;
            }
            long j4 = aqyaVar4.d;
            pauVarArr[i2] = new pau(str2, k, d, new pba(new pas("", j, (j2 - j) + 1), 1L, 0L, j3, (j4 - j3) + 1), formatStreamModel.g, formatStreamModel.j(), uri);
            i2++;
            formatStreamModelArr2 = formatStreamModelArr;
            min = i3;
        }
        return pauVarArr;
    }

    private final afdw aL(afdm afdmVar) {
        this.aF = afdmVar;
        return new afdw(new pft(this.x.h() * 1024), this.ad, this.t.D(), afdmVar);
    }

    private final oyx aM(afdw afdwVar, ozt oztVar, boolean z, boolean z2, afjf afjfVar) {
        afky afkyVar;
        if (!z2 && (afkyVar = this.p) != null) {
            afkyVar.q();
        }
        afed afedVar = new afed(oztVar, afdwVar, this.x.D() * this.x.h() * 1024, this.j, this.i, u(), this.x.y(), null, aF());
        this.ah = afedVar;
        if (z2) {
            return ai(afedVar);
        }
        return new aete(this.Q, this.ah, this.ac, this.am, this.j, this.h, new aetj(afjfVar, 2, TimeUnit.MILLISECONDS.toMicros(this.x.t())), z, O().l, this.x.p());
    }

    private final afdm aN() {
        afaq afaqVar;
        VideoStreamingData videoStreamingData = this.t;
        if (videoStreamingData == null || !videoStreamingData.B() || this.t.G() || !this.t.C() || this.x.Q() == assy.LIVE_ONLY_PEG_STRATEGY_DO_NOT_PEG) {
            afaqVar = new afaq(this, 1);
        } else {
            afaqVar = new afaq(this, 6);
        }
        return new afdm(afaqVar, new afaq(this, 0), new afaq(this, 2), this.O.o().A, psf.a);
    }

    private final oyx aO(afdw afdwVar, ozt oztVar, int i, afjf afjfVar) {
        ozs ozsVar = new ozs(oztVar, afdwVar, this.x.g() * this.x.h() * 1024, this.j, this.Y, u(), this.x.y());
        if (i == 7) {
            return new axfm(ozsVar, this.j, this.W, this.aE);
        }
        if (i == 6) {
            Handler handler = this.j;
            afbe afbeVar = this.W;
            axfg axfgVar = this.aE;
            opn.h(axfgVar);
            return new pbt(ozsVar, handler, afbeVar, new axfl(handler, afbeVar, new axez(axfgVar)));
        }
        return new aetc(ozsVar, this.ac, this.am, this.j, this.W, new aetj(afjfVar, 1, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aF());
    }

    private final void aP(oyx[] oyxVarArr) {
        aC();
        this.ai = null;
        this.aj = oyxVarArr[0];
        if (oyxVarArr.length > 1) {
            this.ai = oyxVarArr[1];
        }
    }

    private static final boolean aQ(PlayerConfigModel playerConfigModel, VideoStreamingData videoStreamingData) {
        if (playerConfigModel != null && videoStreamingData != null && playerConfigModel.av()) {
            if (videoStreamingData.v()) {
                return true;
            }
            if (playerConfigModel.aD() && videoStreamingData.r()) {
                return true;
            }
        }
        return false;
    }

    private static final paj aR(FormatStreamModel[] formatStreamModelArr) {
        int i = 1;
        if (formatStreamModelArr.length != 1) {
            int e = formatStreamModelArr[0].e();
            ArrayList arrayList = new ArrayList();
            arrayList.add(formatStreamModelArr[0]);
            for (int i2 = 1; i2 < formatStreamModelArr.length; i2++) {
                if (e == formatStreamModelArr[i2].e()) {
                    arrayList.add(formatStreamModelArr[i2]);
                }
            }
            formatStreamModelArr = (FormatStreamModel[]) arrayList.toArray(new FormatStreamModel[arrayList.size()]);
        }
        return new afav(formatStreamModelArr, i);
    }

    private static final paj aS(FormatStreamModel[] formatStreamModelArr) {
        return new afav(formatStreamModelArr, 0);
    }

    public static final int[] af(FormatStreamModel[] formatStreamModelArr, pal palVar) {
        ArrayList arrayList = new ArrayList(formatStreamModelArr.length);
        for (FormatStreamModel formatStreamModel : formatStreamModelArr) {
            String str = formatStreamModel.e;
            for (int i = 0; i < palVar.b.size(); i++) {
                if (str.equals(((pav) palVar.b.get(i)).e.a)) {
                    if (formatStreamModel.E()) {
                        arrayList.add(0, Integer.valueOf(i));
                    } else {
                        arrayList.add(Integer.valueOf(i));
                    }
                }
            }
        }
        return anaf.aj(arrayList);
    }

    private final int ag() {
        FormatStreamModel formatStreamModel = this.H;
        if (formatStreamModel != null) {
            return formatStreamModel.h();
        }
        VideoStreamingData videoStreamingData = this.t;
        if (videoStreamingData == null) {
            return 0;
        }
        return videoStreamingData.b();
    }

    private final oxd ah() {
        oyx oyxVar = this.ai;
        if (oyxVar instanceof oym) {
            return ((oym) oyxVar).b;
        }
        if (oyxVar instanceof pka) {
            return ((pka) oyxVar).a;
        }
        return null;
    }

    private final oyx ai(oyr oyrVar) {
        String l = pka.l();
        String libvpxConfig = VpxDecoder.a ? VpxDecoder.getLibvpxConfig() : null;
        StringBuilder sb = new StringBuilder(String.valueOf(l).length() + 40 + String.valueOf(libvpxConfig).length());
        sb.append("[INFO] Using libvpx ");
        sb.append(l);
        sb.append(" built with config: ");
        sb.append(libvpxConfig);
        zga.l(sb.toString());
        Handler handler = this.j;
        afbr afbrVar = this.h;
        aquz aquzVar = this.x.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        return new pka(oyrVar, handler, afbrVar, aquzVar.aJ, this.x.aH(), this.O.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_LIBVPX_ZERO_COPY), this.O.ap(), this.O.c(), this.O.d());
    }

    private final pfq ak(PlayerConfigModel playerConfigModel, aeru aeruVar) {
        afix afixVar = this.S;
        afiv a = afiw.a(playerConfigModel);
        a.b = new afaq(this, 4);
        a.d = aeruVar.a();
        a.h = this.g;
        a.a = this.aq;
        a.g = ammv.i(this.t.c);
        return new afjg(afixVar.a(a.a(), 5).a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        if (r1.y != 3) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.afbg al(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r15, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r16, defpackage.aees r17, boolean r18, boolean r19, int r20, java.lang.String r21, defpackage.afjd r22) {
        /*
            r14 = this;
            r0 = r14
            r2 = r16
            r1 = r15
            r3 = r22
            boolean r4 = r1.s
            if (r4 == 0) goto Le
            com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r1 = r15.m()
        Le:
            if (r3 == 0) goto L37
            java.util.Set r4 = r3.a
            java.util.List r5 = r1.r
            java.util.Iterator r5 = r5.iterator()
        L18:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L37
            java.lang.Object r6 = r5.next()
            com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel r6 = (com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel) r6
            int r6 = r6.e()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            boolean r6 = r4.contains(r6)
            if (r6 == 0) goto L18
            int r4 = r1.y
            r5 = 3
            if (r4 == r5) goto L3f
        L37:
            afhs r3 = r0.O
            amnv r4 = r0.a
            afjd r3 = defpackage.afje.c(r1, r2, r3, r4)
        L3f:
            r12 = r3
            afhs r3 = r0.O
            amnv r4 = defpackage.afje.d
            afjc r3 = defpackage.afje.b(r1, r2, r3, r4)
            boolean r4 = r16.au()
            r5 = 4
            int r4 = defpackage.adyu.bK(r4, r5)
            boolean r5 = r16.au()
            r6 = 1
            r7 = 0
            if (r5 == 0) goto L5c
            if (r18 == 0) goto L5c
            r7 = 1
        L5c:
            r5 = 8
            int r5 = defpackage.adyu.bK(r7, r5)
            r4 = r4 | r5
            r5 = 2
            r7 = r19
            int r5 = defpackage.adyu.bJ(r7, r5)
            r4 = r4 | r5
            r7 = r4 | 1
            afbg r13 = new afbg
            aeez r4 = r0.X
            java.util.List r5 = r1.p
            java.util.Set r6 = r12.a
            java.util.Set r8 = r3.a
            boolean r3 = r1.v
            r9 = 480(0x1e0, float:6.73E-43)
            if (r3 == 0) goto L92
            boolean r1 = r1.D()
            if (r1 != 0) goto L92
            aepx r1 = r0.ar
            if (r1 == 0) goto L94
            boolean r1 = r1.g
            if (r1 == 0) goto L94
            boolean r1 = r16.Z()
            if (r1 != 0) goto L92
            goto L94
        L92:
            r9 = r20
        L94:
            aesa r10 = defpackage.aesa.a
            amsx r11 = defpackage.afkj.a
            r1 = r4
            r2 = r16
            r3 = r5
            r4 = r17
            r5 = r6
            r6 = r8
            r8 = r9
            r9 = r21
            aeeu r1 = r1.c(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            int r2 = r12.c
            r13.<init>(r1, r2)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.al(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, aees, boolean, boolean, int, java.lang.String, afjd):afbg");
    }

    private final afef am(int i, aeex aeexVar) {
        afcr afdlVar;
        final int u = u();
        if (this.O.aJ()) {
            afdlVar = new afcy(this.O, this.g);
        } else {
            aenf aenfVar = this.d;
            ysy ysyVar = this.b;
            PlayerConfigModel playerConfigModel = this.x;
            afdlVar = new afdl(aenfVar, ysyVar, playerConfigModel, this.R, playerConfigModel.aM(), this.Z, aeexVar, new azl(i, 2), this.x.e(), this.x.d(), this.t.c, this.aq, this.O, new afaq(this, 3), new afig() { // from class: afay
                @Override // defpackage.afig
                public final void a(final afih afihVar) {
                    final afbs afbsVar = afbs.this;
                    final int i2 = u;
                    final Runnable runnable = new Runnable() { // from class: afau
                        @Override // java.lang.Runnable
                        public final void run() {
                            afbs afbsVar2 = afbs.this;
                            afih afihVar2 = afihVar;
                            afbsVar2.F(true);
                            afbsVar2.V(afihVar2);
                        }
                    };
                    afbsVar.j.post(new Runnable() { // from class: afat
                        @Override // java.lang.Runnable
                        public final void run() {
                            afbs afbsVar2 = afbs.this;
                            int i3 = i2;
                            Runnable runnable2 = runnable;
                            if (afbsVar2.u() == i3) {
                                runnable2.run();
                            }
                        }
                    });
                }
            }, this.g, this.f);
        }
        return new afef(afdlVar, this.m);
    }

    private final afei an(paj pajVar, ozx ozxVar, long j, int i, pau[] pauVarArr, afel afelVar, afiy afiyVar, aeru aeruVar) {
        return new afei(pajVar, afiyVar != null ? new afjg(afiyVar.a) : ak(this.x, aeruVar), ozxVar, j, i, pauVarArr, afelVar, i == 0 && this.x.aU(), this.j, new afdz(this.o), this.x.ae(), this.O);
    }

    private final void ap() {
        this.q = null;
        VideoStreamingData videoStreamingData = this.t;
        String str = videoStreamingData != null ? videoStreamingData.c : null;
        aejc b = str != null ? this.af.b(str) : null;
        if (b != null) {
            b.f();
        }
    }

    private final void ar(Exception exc, boolean z) {
        if (z) {
            M();
        }
        if (afdq.e(exc)) {
            aeru aeruVar = this.f;
            IllegalStateException illegalStateException = (IllegalStateException) exc;
            long g = g();
            afky afkyVar = this.p;
            aeruVar.g(afdq.b(illegalStateException, g, afkyVar == null ? null : afkyVar.A()));
            return;
        }
        this.f.g(new afih("player.fatalexception", g(), exc));
    }

    private final void as() {
        aeeu aeeuVar;
        boolean z = true;
        if (!this.O.l && ((aeeuVar = this.G) == null || this.x == null || !aeeuVar.e() || !this.x.ae())) {
            z = false;
        }
        if (this.as != z) {
            aflb O = O();
            this.as = z;
            if (this.p == null || O == O()) {
                return;
            }
            p(this.p);
        }
    }

    private final void at() {
        if (this.ap) {
            return;
        }
        this.ap = true;
        aD(this.G);
    }

    private final void au(afjf afjfVar) {
        if (this.r != null) {
            P();
            if (this.av) {
                afjfVar.F();
                this.r.l(true);
            }
        }
    }

    private final void av(oyx[] oyxVarArr, long j) {
        this.r.j(j);
        if (this.O.x()) {
            this.f.i("seek", new aeqs(afjz.a(Thread.currentThread().getStackTrace())));
        }
        az(this.an);
        Z(this.aA);
        P();
        this.r.g(oyxVarArr);
        if (!this.y || this.ai == null) {
            return;
        }
        this.r.m(1, -1);
    }

    private final void aw() {
        if (this.r != null) {
            S();
            this.r.h();
            aepe aepeVar = this.am;
            if (aepeVar != null) {
                aepeVar.l();
                this.am = null;
            }
            this.r = null;
            this.C = null;
            this.B = null;
        }
    }

    private final void ax() {
        R();
        aC();
        this.d.k();
        this.ai = null;
        this.ah = null;
        this.aj = null;
        this.t = null;
        this.u = null;
        this.aB.a();
        ay();
        this.aa.incrementAndGet();
        this.Z.deleteObserver(this);
        this.O.deleteObserver(this);
        this.D = 0L;
        this.E = new oyv(0L, 0L);
        Future future = this.z;
        if (future != null) {
            future.cancel(true);
            this.z = null;
        }
        this.m.c();
        this.ap = false;
        this.aq = null;
        this.o.c();
    }

    private final void ay() {
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.f42J = aenk.a;
        this.L = aeex.a;
        this.M = 0;
    }

    private final void az(float f) {
        oyx oyxVar;
        this.an = f;
        oxk oxkVar = this.r;
        if (oxkVar == null || (oyxVar = this.aj) == null) {
            return;
        }
        oxkVar.k(oyxVar, 1, Float.valueOf(f));
        if (this.O.Z(aqva.EXO_PLAYER_HOT_CONFIG_FEATURES_LOG_VOLUME)) {
            aeru aeruVar = this.f;
            StringBuilder sb = new StringBuilder(17);
            sb.append("v=");
            sb.append(f);
            aeruVar.w("sv", sb.toString());
        }
    }

    @Override // defpackage.afcx
    public final void B(long j, aupb aupbVar) {
        if (this.r != null) {
            VideoStreamingData videoStreamingData = this.t;
            if (videoStreamingData == null || videoStreamingData.G() || j == 0) {
                if (((oxm) this.r).d) {
                    this.f.t(j);
                } else {
                    this.f.o(j);
                }
                VideoStreamingData videoStreamingData2 = this.t;
                if (videoStreamingData2 != null && videoStreamingData2.B()) {
                    long max = Math.max(0L, Math.max(0L, E() - this.F.j) - ag());
                    boolean z = j == 0 || (max > 0 && j >= max);
                    this.F.h(z);
                    if (z) {
                        aeru aeruVar = this.f;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i = this.F.j;
                        StringBuilder sb = new StringBuilder(14);
                        sb.append("ms.");
                        sb.append(i);
                        aeruVar.i("sklv", new aesd(elapsedRealtime, sb.toString()));
                    }
                }
                this.ao = true;
                afdt afdtVar = this.o;
                int binarySearch = Arrays.binarySearch(afdtVar.h.toArray(), Long.valueOf(1000 * j));
                afdtVar.j = binarySearch;
                if (binarySearch < 0) {
                    if (binarySearch == -1) {
                        afdtVar.d();
                    }
                    afdtVar.j = Math.max((-afdtVar.j) - 2, 0);
                }
                this.r.j(j);
                afdm afdmVar = this.aF;
                psf psfVar = afdmVar.a;
                afdmVar.b = SystemClock.elapsedRealtime();
                if (this.O.x()) {
                    this.f.i("seek", new aeqs(afjz.a(Thread.currentThread().getStackTrace())));
                }
            }
        }
    }

    @Override // defpackage.afcx
    public final void C(float f) {
        oxk oxkVar = this.r;
        if (oxkVar != null) {
            this.at = f;
            oyx oyxVar = this.aj;
            if (oyxVar != null) {
                oxkVar.k(oyxVar, 100, Float.valueOf(f));
            }
            oyx oyxVar2 = this.ai;
            if (oyxVar2 != null) {
                this.r.k(oyxVar2, 100, Float.valueOf(f));
            }
            afef afefVar = this.s;
            if (afefVar != null) {
                this.r.k(afefVar, 4, Float.valueOf(f));
            }
            this.f.p(f);
            afed afedVar = this.ah;
            if (afedVar != null) {
                afedVar.d = aF();
            }
        }
    }

    @Override // defpackage.afcx
    public final void D(float f) {
        az(aedn.m(this.x, f));
    }

    public final long E() {
        return this.E.b()[1];
    }

    @Override // defpackage.afec
    public final void F(boolean z) {
        this.e.j(afqu.ANDROID_EXOPLAYER);
        R();
        this.g.d(b(), false);
        if (this.r != null) {
            aA();
            ap();
            ax();
            if (z) {
                this.f.v();
            }
        }
    }

    @Override // defpackage.afcx
    public final boolean G() {
        oxk oxkVar = this.r;
        return oxkVar != null && ((oxm) oxkVar).e == 3;
    }

    @Override // defpackage.afbu
    public final boolean H(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z) {
        afhs afhsVar = this.O;
        if (afhsVar.V(afhsVar.p.a.a.Y(axzc.f).B())) {
            return false;
        }
        if (videoStreamingData.x()) {
            return z || playerConfigModel.aR();
        }
        if (videoStreamingData.y() || videoStreamingData.C()) {
            return true;
        }
        if (!playerConfigModel.aA()) {
            return false;
        }
        boolean aK = this.O.aK(playerConfigModel.W());
        boolean j = afje.j(videoStreamingData, playerConfigModel, this.O, this.a);
        boolean k = afje.k(videoStreamingData, playerConfigModel, this.O, this.a);
        if (!aK && !j && !k) {
            return false;
        }
        Set p = aaoq.p();
        Set y = aaoq.y();
        Set z2 = aaoq.z();
        Set b = aaoq.b();
        Set v = aaoq.v();
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        for (FormatStreamModel formatStreamModel : videoStreamingData.n) {
            int e = formatStreamModel.e();
            if (formatStreamModel.P()) {
                if (!z5) {
                    z5 = (aK && p.contains(Integer.valueOf(e))) || (j && y.contains(Integer.valueOf(e))) || (k && z2.contains(Integer.valueOf(e)));
                }
                if (!z4) {
                    z4 = v.contains(Integer.valueOf(e));
                }
            }
            if (formatStreamModel.C() && !z3) {
                z3 = b.contains(Integer.valueOf(e));
            }
            if (z3 && z5) {
                return true;
            }
        }
        return z3 && !z4;
    }

    @Override // defpackage.afcx
    public final boolean I() {
        oxk oxkVar = this.r;
        if (oxkVar != null) {
            oxm oxmVar = (oxm) oxkVar;
            if (oxmVar.d) {
                int i = oxmVar.e;
                return i == 3 || i == 4;
            }
        }
        return false;
    }

    @Override // defpackage.afec
    public final boolean J(afeb afebVar) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dd, code lost:
    
        if ((android.os.SystemClock.elapsedRealtime() - r0.n) > r1.d) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0123  */
    @Override // defpackage.afec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.afqu K(defpackage.aerv r17) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.K(aerv):afqu");
    }

    public final aeiw L(String str, ExecutorService executorService) {
        return new aeiw(str, executorService, this.O.L());
    }

    @Override // defpackage.afcx
    public final void M() {
        this.e.c(afqu.ANDROID_EXOPLAYER);
        R();
        this.g.d(b(), false);
        if (this.r != null) {
            aA();
            aw();
            ap();
            ax();
            this.f.v();
        }
    }

    @Override // defpackage.afec
    public final /* synthetic */ void N(boolean z, int i) {
    }

    final aflb O() {
        VideoStreamingData videoStreamingData = this.t;
        afky afkyVar = this.p;
        PlayerConfigModel playerConfigModel = this.x;
        afhs afhsVar = this.O;
        int i = this.N;
        boolean z = this.ay;
        boolean z2 = this.as;
        boolean z3 = false;
        if (videoStreamingData != null && videoStreamingData.equals(VideoStreamingData.a)) {
            z3 = true;
        }
        return aear.n(videoStreamingData, afkyVar, playerConfigModel, afhsVar, i, z, z2, z3);
    }

    public final void P() {
        Q(false);
    }

    public final void Q(boolean z) {
        afky afkyVar = this.p;
        Surface A = (afkyVar == null || !afkyVar.E()) ? null : this.p.A();
        afky afkyVar2 = this.p;
        pkd j = afkyVar2 != null ? afkyVar2.j() : null;
        String valueOf = String.valueOf(A);
        String valueOf2 = String.valueOf(j);
        String.valueOf(valueOf).length();
        String.valueOf(valueOf2).length();
        if (this.r != null && this.ai != null && ((A != null || j != null) && (this.ak != A || this.al != j))) {
            W();
            if (z) {
                if (A != null) {
                    this.e.i(A, afqu.ANDROID_EXOPLAYER);
                    this.r.f(this.ai, 1, A);
                } else {
                    this.r.f(this.ai, 2, j);
                }
            } else if (A != null) {
                this.e.i(A, afqu.ANDROID_EXOPLAYER);
                this.r.k(this.ai, 1, A);
            } else {
                this.r.k(this.ai, 2, j);
            }
            this.r.m(1, 0);
            this.ak = A;
            this.al = j;
        }
        aeru aeruVar = this.f;
        afky afkyVar3 = this.p;
        aeruVar.x((afkyVar3 != null ? afkyVar3.C() : aflb.NONE).m);
        aE();
    }

    public final synchronized void R() {
        ScheduledFuture scheduledFuture = this.aw;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.aw = null;
        }
    }

    public final void S() {
        if (this.r != null && this.ai != null && this.p != null) {
            this.e.i(null, afqu.ANDROID_EXOPLAYER);
            this.r.f(this.ai, 1, null);
        }
        this.ak = null;
        this.al = null;
        aE();
        this.f.x(aflb.NONE.m);
    }

    @Override // defpackage.afdx
    public final afky T() {
        return this.p;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x023f A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x009a A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00fc A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010b A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x013b A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0152 A[Catch: aeew -> 0x0523, all -> 0x0538, Merged into TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d5 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0215 A[Catch: all -> 0x0538, TRY_LEAVE, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0490 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0497 A[Catch: all -> 0x0538, TryCatch #1 {all -> 0x0538, afbh -> 0x0510, aeew -> 0x0523, blocks: (B:3:0x000b, B:5:0x0020, B:9:0x002a, B:11:0x002f, B:13:0x0035, B:15:0x0039, B:17:0x003f, B:21:0x0065, B:24:0x00db, B:26:0x00fc, B:27:0x0105, B:29:0x010b, B:30:0x0113, B:32:0x013b, B:34:0x013e, B:36:0x0152, B:38:0x0156, B:41:0x015d, B:43:0x0161, B:45:0x0167, B:47:0x016d, B:49:0x0173, B:51:0x0179, B:54:0x017e, B:56:0x0184, B:59:0x018d, B:60:0x0193, B:61:0x01a0, B:63:0x01bc, B:64:0x01ce, B:66:0x01d5, B:67:0x01e5, B:69:0x01ed, B:72:0x01f8, B:77:0x020f, B:79:0x0215, B:83:0x022e, B:86:0x048c, B:88:0x0490, B:89:0x0493, B:91:0x0497, B:92:0x04a8, B:97:0x04b9, B:98:0x04d0, B:99:0x04f0, B:103:0x0510, B:106:0x023f, B:108:0x024f, B:110:0x0255, B:112:0x025d, B:114:0x0265, B:116:0x026d, B:118:0x0273, B:120:0x0279, B:122:0x027f, B:124:0x0282, B:126:0x0286, B:128:0x028a, B:130:0x0298, B:132:0x02a0, B:134:0x02a8, B:136:0x02b0, B:138:0x02be, B:140:0x02cd, B:143:0x02e5, B:145:0x02fd, B:147:0x0305, B:148:0x030b, B:149:0x0326, B:151:0x0340, B:152:0x0345, B:154:0x0380, B:155:0x0386, B:157:0x03a3, B:159:0x03a7, B:160:0x03ad, B:162:0x03b1, B:164:0x03bb, B:165:0x03bd, B:166:0x03c8, B:169:0x047f, B:170:0x03d6, B:172:0x03dc, B:179:0x0446, B:181:0x0453, B:184:0x046f, B:186:0x03e5, B:189:0x03ee, B:191:0x0404, B:193:0x040d, B:195:0x0411, B:201:0x0427, B:203:0x0436, B:215:0x0524, B:218:0x0080, B:221:0x0085, B:224:0x008f, B:227:0x009a, B:230:0x00a4, B:233:0x00ad, B:236:0x00be, B:239:0x00cd), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x04b4 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x04b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData r29, defpackage.aeqr r30, java.lang.String r31, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel r32, defpackage.afjf r33) {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.U(com.google.android.libraries.youtube.innertube.model.media.VideoStreamingData, aeqr, java.lang.String, com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel, afjf):void");
    }

    public final void V(afih afihVar) {
        afihVar.l();
        this.f.g(afihVar);
        VideoStreamingData videoStreamingData = this.t;
        String str = videoStreamingData != null ? videoStreamingData.c : null;
        aejc b = str != null ? this.af.b(str) : null;
        if (b != null) {
            b.f();
        }
        ax();
    }

    public final void W() {
        if (this.p == null || this.s == null || this.r == null) {
            return;
        }
        Object obj = this.Z.get();
        afkm afkmVar = (afkm) obj;
        if (afkmVar.equals(this.ax)) {
            return;
        }
        this.ax = afkmVar;
        this.r.k(this.s, 0, obj);
        if (this.t == null || this.x == null || this.G == null) {
            return;
        }
        int a = this.b.a();
        List asList = Arrays.asList(this.G.a);
        aeeu aeeuVar = this.G;
        aeex aeexVar = aeeuVar.f;
        ysy ysyVar = this.b;
        PlayerConfigModel playerConfigModel = this.x;
        FormatStreamModel j = aeez.j(asList, aeexVar, ysyVar, playerConfigModel, this.O, aeeuVar.b[0].f, afkmVar.c, afkmVar.d, playerConfigModel.e(), this.x.d(), a, this.O.h.b(this.aq));
        if (this.K != null && j != null && j.e() != this.K.e()) {
            aeru aeruVar = this.f;
            FormatStreamModel formatStreamModel = this.H;
            FormatStreamModel formatStreamModel2 = this.I;
            aeeu aeeuVar2 = this.G;
            aeruVar.h(new aeqq(formatStreamModel, formatStreamModel2, j, aeeuVar2.d, aeeuVar2.e, aeeuVar2.f, 10001, -1L, 0, aeqp.a(f(), g(), b())));
        }
        this.K = j;
    }

    public final void X() {
        afky afkyVar = this.p;
        if (afkyVar != null) {
            afkyVar.k();
            this.p.s(null);
            this.e.f(null, afqu.ANDROID_EXOPLAYER);
            S();
            this.p = null;
        }
    }

    public final synchronized void Y(long j, String str) {
        R();
        this.aw = this.c.schedule(new afbd(this, str), j, TimeUnit.MILLISECONDS);
    }

    public final void Z(int i) {
        oyx oyxVar;
        this.aA = i;
        oxk oxkVar = this.r;
        if (oxkVar == null || (oyxVar = this.aj) == null) {
            return;
        }
        oxkVar.k(oyxVar, 3, Integer.valueOf(1 != (i & 1) ? 3 : 4));
    }

    @Override // defpackage.afcx
    public final float a() {
        return this.at;
    }

    public final boolean aa() {
        return this.C != null;
    }

    public final boolean ab() {
        return (this.ak == null && this.al == null) ? false : true;
    }

    public final void ac(aaox aaoxVar, afbl afblVar, VideoStreamingData videoStreamingData, int i, int i2, afjf afjfVar) {
        yjk.f();
        ax();
        this.x = aaoxVar.f;
        this.t = videoStreamingData;
        if (aG(i2)) {
            this.N = i;
            this.ac.b(i, this.x.X(), this.x.W(), false, aeev.NONE);
            aH(O(), false);
            this.q = afblVar;
            afdw aL = aL(aN());
            oyx[] oyxVarArr = new oyx[2];
            int i3 = 4;
            oyxVarArr[1] = aM(aL, afblVar.a, this.x.aU(), i == 4, afjfVar);
            oyxVarArr[0] = aO(aL, afblVar.b, 2, afjfVar);
            aP(oyxVarArr);
            av(oyxVarArr, 0L);
            afix afixVar = this.S;
            afiv a = afiw.a(this.x);
            a.b = new afaq(this, i3);
            a.a = this.aq;
            a.g = ammv.i(aaoxVar.g);
            afix afixVar2 = this.S;
            afiv a2 = afiw.a(this.x);
            a2.b = new afaq(this, i3);
            a2.a = this.aq;
            a2.g = ammv.i(aaoxVar.g);
            this.C = new afbw(aaoxVar.g, oyxVarArr, new afiy[]{afixVar.a(a.a(), 5), afixVar2.a(a2.a(), 5)});
        }
    }

    @Override // defpackage.afdx
    public final void ao() {
        this.az = null;
    }

    @Override // defpackage.afdx
    public final boolean aq() {
        return this.ao;
    }

    @Override // defpackage.afcx
    public final int b() {
        afed afedVar;
        oxd ah = ah();
        return (ah == null || (afedVar = this.ah) == null) ? this.A : ((int) afedVar.e) + this.A + ah.h;
    }

    @Override // defpackage.afec
    public final int c(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel) {
        int i = true != aear.m(videoStreamingData, this.ay || playerConfigModel.g) ? 4 : 5;
        boolean aQ = aQ(playerConfigModel, videoStreamingData);
        if (aQ) {
            i |= 8;
        }
        if (playerConfigModel.aF() && !aQ && !videoStreamingData.B()) {
            avvf avvfVar = playerConfigModel.c.t;
            if (avvfVar == null) {
                avvfVar = avvf.a;
            }
            if (avvfVar.e || !videoStreamingData.y()) {
                i |= 2;
            }
        }
        return this.O.D() ? i | 16 : i;
    }

    @Override // defpackage.afec
    public final int d() {
        return this.F.a(h(), this.ag.c());
    }

    @Override // defpackage.afcx
    public final int e() {
        oxd ah = ah();
        return ah != null ? this.au + ah.f : this.au;
    }

    @Override // defpackage.afec
    public final long f() {
        oxk oxkVar = this.r;
        if (oxkVar == null) {
            return 0L;
        }
        oxn oxnVar = ((oxm) oxkVar).a;
        if (oxnVar.h == -1) {
            return -1L;
        }
        return oxnVar.h / 1000;
    }

    @Override // defpackage.afec
    public final long g() {
        oxk oxkVar = this.r;
        if (oxkVar != null) {
            return oxkVar.c();
        }
        return 0L;
    }

    @Override // defpackage.afec
    public final long h() {
        long g = g();
        if (g < 0) {
            return -1L;
        }
        long j = this.D;
        if (j != 0) {
            return g + j;
        }
        return -1L;
    }

    @Override // defpackage.afec
    public final long i() {
        oxk oxkVar = this.r;
        if (oxkVar != null) {
            return oxkVar.d();
        }
        return 0L;
    }

    @Override // defpackage.afcx
    public final long j(long j) {
        return -1L;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel k() {
        return this.I;
    }

    @Override // defpackage.afcx
    public final FormatStreamModel l() {
        return this.H;
    }

    @Override // defpackage.afec
    public final aeeu m(VideoStreamingData videoStreamingData, PlayerConfigModel playerConfigModel, boolean z, aees aeesVar, int i) {
        return al(videoStreamingData, playerConfigModel, aeesVar, false, z, i, null, null).a;
    }

    @Override // defpackage.afcx
    public final aeou n() {
        if (this.az == null) {
            aeou aeouVar = new aeou(afqu.ANDROID_EXOPLAYER);
            this.az = aeouVar;
            VideoStreamingData videoStreamingData = this.t;
            boolean z = this.o.b;
            PlayerConfigModel playerConfigModel = this.x;
            aeouVar.b(videoStreamingData, false, -1L, z, false, false, playerConfigModel != null && playerConfigModel.aT());
        }
        aepx aepxVar = this.ar;
        if (aepxVar != null) {
            aepe aepeVar = this.am;
            aeou aeouVar2 = this.az;
            if (aepeVar != null) {
                aeouVar2.a(aepxVar.c.aX(), aepxVar.a(), aepxVar.h, aepxVar.g, aepxVar.j, aepeVar instanceof aepd);
            }
        }
        return this.az;
    }

    @Override // defpackage.afcx
    public final String o() {
        return this.aq;
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onDrmError(int i, Exception exc) {
        yjk.f();
        if (i != u()) {
            return;
        }
        F(true);
        V(afeu.a(exc, g(), afif.DRM, "keyerror", null, false));
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onHdDrmPlayable(int i) {
        VideoStreamingData videoStreamingData;
        yjk.f();
        boolean z = true;
        if (i == u() && ((videoStreamingData = this.t) == null || !videoStreamingData.v)) {
            z = false;
        }
        afki.d(z);
        if (i != u()) {
            return;
        }
        z();
        this.M = 0;
        this.i.g();
    }

    @Override // com.google.android.libraries.youtube.media.player.drm.WidevineHelper$Listener
    public final void onHdDrmUnavailable(int i, String str) {
        VideoStreamingData videoStreamingData;
        yjk.f();
        boolean z = false;
        if (i != u() || ((videoStreamingData = this.t) != null && videoStreamingData.v)) {
            z = true;
        }
        afki.d(z);
        if (i != u()) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "Stale HdDrmUnavailable notification received - ignored ".concat(valueOf);
                return;
            }
            return;
        }
        this.f.g(new afih(afif.DRM, "hdunavailable", g(), str));
    }

    @Override // defpackage.afec
    public final void p(afky afkyVar) {
        this.e.b(afqu.ANDROID_EXOPLAYER);
        this.y = false;
        X();
        this.p = afkyVar;
        afkyVar.s(this.k);
        this.e.f(this.k, afqu.ANDROID_EXOPLAYER);
        afkyVar.z();
        this.o.f(this.x, this.t);
        if (aH(O(), true)) {
            P();
        }
    }

    @Override // defpackage.afcx
    public final void q() {
    }

    @Override // defpackage.afcx
    public final void r() {
        afky afkyVar = this.p;
        if (afkyVar != null) {
            afkyVar.k();
        }
    }

    @Override // defpackage.oxj
    public final void rB() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0449  */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [aejc] */
    @Override // defpackage.oxj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void rC(defpackage.oxh r18) {
        /*
            Method dump skipped, instructions count: 1143
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afbs.rC(oxh):void");
    }

    @Override // defpackage.oxj
    public final void rD(boolean z, int i) {
        yjk.f();
        if (this.t == null) {
            return;
        }
        this.ao = false;
        if (i == 2) {
            this.f.r();
        } else if (i == 3) {
            at();
            if (z) {
                this.f.d();
            } else {
                this.f.n();
            }
            long j = this.H != null ? r0.f : 0L;
            if (this.I != null) {
                j += r0.f;
            }
            if (this.F.l(g(), this.d.e(), j)) {
                B(0L, aupb.SEEK_SOURCE_UNKNOWN);
            }
        } else if (i == 4) {
            at();
            if (z) {
                if (this.F.m()) {
                    B(0L, aupb.SEEK_SOURCE_UNKNOWN);
                } else {
                    this.f.q();
                    this.f.s(-1L);
                }
            } else {
                this.f.m();
                this.F.g();
            }
        } else if (i == 5) {
            this.f.f();
        }
        if (i != 4 || !z || this.F.m()) {
            this.aB.d();
        } else {
            this.aB.c();
        }
        aE();
    }

    @Override // defpackage.afcx
    public final void s() {
        this.e.d(afqu.ANDROID_EXOPLAYER);
        this.y = true;
        R();
        this.u = null;
        oxk oxkVar = this.r;
        if (oxkVar != null && this.ai != null) {
            oxkVar.m(1, -1);
            afbq afbqVar = this.i;
            afbs afbsVar = afbqVar.b;
            afbsVar.H = null;
            afbsVar.M = 10002;
            afbqVar.g();
        }
        X();
    }

    @Override // defpackage.afec
    public final void t(final aaox aaoxVar, final aeru aeruVar) {
        aemt aemtVar = (aemt) aeruVar;
        this.W.c = aemtVar.a;
        this.h.a = aemtVar.a;
        this.T.b(aeruVar, aaoxVar.b);
        if (!aaoxVar.j) {
            this.f = aeru.c;
            this.g = aesa.a;
        }
        String str = aaoxVar.g;
        aejc b = str != null ? this.af.b(str) : null;
        if (b == null) {
            return;
        }
        final int incrementAndGet = this.aa.incrementAndGet();
        final VideoStreamingData videoStreamingData = aaoxVar.g() ? aaoxVar.h : VideoStreamingData.a;
        final afbl afblVar = new afbl(L("video/x-unknown", this.c), L("audio/x-unknown", this.c));
        final Object obj = new Object();
        this.B = obj;
        aekh afbpVar = new afbp(this, aaoxVar, afblVar, videoStreamingData, this.B, aeruVar);
        final int k = b.k();
        if (k == 0) {
            return;
        }
        if (true != this.O.p().i) {
            afbpVar = afblVar;
        }
        b.h(afbpVar);
        this.j.post(new Runnable() { // from class: afas
            @Override // java.lang.Runnable
            public final void run() {
                afbs afbsVar = afbs.this;
                int i = incrementAndGet;
                aaox aaoxVar2 = aaoxVar;
                afbl afblVar2 = afblVar;
                VideoStreamingData videoStreamingData2 = videoStreamingData;
                int i2 = k;
                aeru aeruVar2 = aeruVar;
                Object obj2 = obj;
                if (afbsVar.u() != i) {
                    return;
                }
                afbsVar.ac(aaoxVar2, afblVar2, videoStreamingData2, i2, aaoxVar2.f.t(), ((aemt) aeruVar2).a);
                afbsVar.B = obj2;
            }
        });
    }

    public final int u() {
        return this.aa.get();
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        oxk oxkVar;
        if (observable == this.Z) {
            W();
            return;
        }
        if (observable == this.O && (obj instanceof Integer)) {
            int intValue = ((Integer) obj).intValue();
            if (intValue != 1) {
                if (intValue != 2) {
                    return;
                }
                as();
            } else {
                afef afefVar = this.s;
                if (afefVar != null && (oxkVar = this.r) != null) {
                    oxkVar.k(afefVar, 3, false);
                }
                z();
            }
        }
    }

    @Override // defpackage.afcx
    public final void v() {
        oxk oxkVar = this.r;
        if (oxkVar != null) {
            oxkVar.l(false);
        }
    }

    @Override // defpackage.afcx
    public final void w() {
    }

    @Override // defpackage.afcx
    public final void x() {
        oxk oxkVar = this.r;
        if (oxkVar != null && ((oxm) oxkVar).e == 5 && !this.ao) {
            oxkVar.j(0L);
            if (this.O.x()) {
                this.f.i("seek", new aeqs(afjz.a(Thread.currentThread().getStackTrace())));
            }
        }
        this.av = true;
        au(this.f.a());
    }

    @Override // defpackage.afec
    public final /* synthetic */ void y() {
    }

    @Override // defpackage.afcx
    public final void z() {
        VideoStreamingData videoStreamingData;
        if (this.r != null && (videoStreamingData = this.t) != null && this.ai != null) {
            try {
                PlayerConfigModel playerConfigModel = this.x;
                amsx amsxVar = aeez.a;
                afbg al = al(videoStreamingData, playerConfigModel, null, true, this.y, Integer.MAX_VALUE, this.aq, null);
                aeeu aeeuVar = al.a;
                if (aeeuVar.f.d()) {
                    aeru aeruVar = this.f;
                    FormatStreamModel formatStreamModel = this.H;
                    String valueOf = String.valueOf(formatStreamModel != null ? Integer.valueOf(formatStreamModel.f()) : "none");
                    int a = aeeuVar.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("curr.");
                    sb.append(valueOf);
                    sb.append(";new.");
                    sb.append(a);
                    aeruVar.i("mqs", new aeqs(sb.toString()));
                }
                this.G = aeeuVar;
                this.K = aeeuVar.c;
                if (!this.x.au()) {
                    FormatStreamModel formatStreamModel2 = aeeuVar.a[0];
                    FormatStreamModel formatStreamModel3 = aeeuVar.b[0];
                    if (!(formatStreamModel2.equals(this.H) && formatStreamModel3.equals(this.I)) && aG(this.x.t())) {
                        FormatStreamModel[] formatStreamModelArr = {formatStreamModel2};
                        this.N = al.b;
                        try {
                            oyx[] aJ = aJ(this.t, formatStreamModelArr, aeeuVar.b, aeeuVar.f, aI(), this.f);
                            aP(aJ);
                            av(aJ, g());
                            C(this.at);
                            au(this.f.a());
                            return;
                        } catch (afbh unused) {
                            V(new afih("manifest.unparseable", g()));
                            return;
                        }
                    }
                    return;
                }
                aB(aeeuVar);
            } catch (aeew unused2) {
            }
        }
    }

    private final void aE() {
        if (this.p != null) {
            if (ab() && I()) {
                this.p.g(1);
            } else {
                this.p.rE(1);
            }
        }
    }

    private final oyx aj(ozs ozsVar, boolean z, afjf afjfVar) {
        if (z) {
            return ai(ozsVar);
        }
        afky afkyVar = this.p;
        if (afkyVar != null) {
            afkyVar.q();
        }
        aquz aquzVar = this.x.c.e;
        if (aquzVar == null) {
            aquzVar = aquz.b;
        }
        if (aquzVar.aK) {
            return new aete(this.Q, ozsVar, this.ac, this.am, this.j, this.h, new aetj(afjfVar, 2, TimeUnit.MILLISECONDS.toMicros(this.x.t())), this.x.aU(), O().l, this.x.p());
        }
        return new oym(this.Q, ozsVar, this.ac, 5000L, this.am, true, this.j, this.h, 10);
    }
}
