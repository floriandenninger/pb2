package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeis implements aeln, aejb {
    private final afhw A;
    private final aejn B;
    private final aejl C;
    private final ammv D;
    private final ammv E;
    private final amnv G;
    private final Set H;
    private aels I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f37J;
    private boolean K;
    private final afhs M;
    public final aeks a;
    public final ScheduledExecutorService b;
    public final aaea c;
    public final atse d;
    public final aeir e;
    public final anhy f;
    public final aeiz g;
    public final shf h;
    public boolean j;
    public aypz k;
    public Uri l;
    public final aelw m;
    public final afjf n;
    private final aaox o;
    private final adyj p;
    private final adxr q;
    private final atk r;
    private final ayqi s;
    private final ScheduledExecutorService t;
    private final aaoz u;
    private final aeie v;
    private final afhf w;
    private final aejq x;
    private final List y;
    private final StringBuilder z;
    private final AtomicBoolean F = new AtomicBoolean(false);
    public final AtomicLong i = new AtomicLong(0);
    private boolean L = false;

    public aeis(aaox aaoxVar, aeks aeksVar, adyj adyjVar, adxr adxrVar, atk atkVar, ScheduledExecutorService scheduledExecutorService, ayqi ayqiVar, ScheduledExecutorService scheduledExecutorService2, aaoz aaozVar, aeie aeieVar, afhf afhfVar, aejq aejqVar, aaea aaeaVar, aadw aadwVar, afhs afhsVar, afhw afhwVar, aejn aejnVar, amnv amnvVar, aelw aelwVar, afjf afjfVar, aeiz aeizVar, shf shfVar, aejl aejlVar, ammv ammvVar, ammv ammvVar2) {
        this.o = aaoxVar;
        afki.a(aeksVar);
        this.a = aeksVar;
        afki.a(adyjVar);
        this.p = adyjVar;
        afki.a(adxrVar);
        this.q = adxrVar;
        afki.a(atkVar);
        this.r = atkVar;
        afki.a(scheduledExecutorService);
        this.b = scheduledExecutorService;
        afki.a(ayqiVar);
        this.s = ayqiVar;
        afki.a(scheduledExecutorService2);
        this.t = scheduledExecutorService2;
        this.u = aaozVar;
        this.v = aeieVar;
        afki.a(afhfVar);
        this.w = afhfVar;
        afki.a(aaeaVar);
        this.c = aaeaVar;
        this.y = new ArrayList();
        this.z = new StringBuilder();
        afki.a(afhsVar);
        this.M = afhsVar;
        this.x = aejqVar;
        this.A = afhwVar;
        this.B = aejnVar;
        this.m = aelwVar;
        this.n = afjfVar;
        final aeir aeirVar = new aeir();
        this.e = aeirVar;
        this.f = aci.c(new aeu() { // from class: aeih
            @Override // defpackage.aeu
            public final Object a(aes aesVar) {
                aeir.this.a = aesVar;
                return "Onesie response future.";
            }
        });
        this.g = aeizVar;
        this.G = amnvVar;
        this.h = shfVar;
        this.H = new HashSet();
        this.C = aejlVar;
        this.D = ammvVar;
        this.E = ammvVar2;
        afki.a(aadwVar);
        atej atejVar = aadwVar.b().k;
        atse atseVar = (atejVar == null ? atej.a : atejVar).s;
        this.d = atseVar == null ? atse.b : atseVar;
    }

    private static Uri p(Uri uri, String str) {
        return !TextUtils.isEmpty(str) ? uri.buildUpon().appendQueryParameter("cpn", str).build() : uri;
    }

    private final aeio q(afhf afhfVar, Uri uri) {
        return new aeio(afhfVar, uri, this.u);
    }

    private final aomf r() {
        return s().k;
    }

    private final atsh s() {
        arfd a = this.c.a();
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

    private final String t(aeie aeieVar, aely aelyVar) {
        String str = aeieVar == null ? "1" : "0";
        String str2 = aelyVar != null ? "0" : "1";
        StringBuilder sb = new StringBuilder(str.length() + 15 + str2.length());
        sb.append("b.null:");
        sb.append(str);
        sb.append(";p.null:");
        sb.append(str2);
        String sb2 = sb.toString();
        if (aeieVar == null) {
            return sb2;
        }
        String str3 = aeieVar.l;
        long b = aeieVar.b();
        long d = this.h.d();
        long j = aeieVar.h;
        long d2 = this.h.d();
        long j2 = aeieVar.g;
        StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 76 + String.valueOf(str3).length());
        sb3.append(sb2);
        sb3.append(";sr:");
        sb3.append(str3);
        sb3.append(";bd.");
        sb3.append(b);
        sb3.append(";st.");
        sb3.append(d - j);
        sb3.append(";ct.");
        sb3.append(d2 - j2);
        return sb3.toString();
    }

    private final List u() {
        arfd a = this.c.a();
        if (a == null) {
            return amru.q();
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
        if (atsfVar == null) {
            atsfVar = atsf.b;
        }
        return atsfVar.e;
    }

    private static void v(atr atrVar, aaox aaoxVar) {
        atrVar.l();
        for (Map.Entry entry : aaoxVar.c.entrySet()) {
            atrVar.m((String) entry.getKey(), (String) entry.getValue());
        }
    }

    private final synchronized void w(Exception exc, boolean z) {
        if (!(exc instanceof aefs) || ((aefs) exc).a != 5) {
            this.m.c("response.parse", exc);
        } else {
            Throwable cause = exc.getCause();
            if (cause instanceof IOException) {
                this.m.b((IOException) cause);
            } else {
                this.m.c("net", exc);
            }
        }
        this.n.U();
        afic aficVar = afic.ONESIE;
        Object[] objArr = new Object[2];
        objArr[0] = true != z ? "Non-fatal" : "Fatal";
        objArr[1] = exc.toString();
        afid.c(aficVar, exc, "%s error occurred during Onesie request. Details: %s", objArr);
        if ((exc.getCause() instanceof atn) && (exc.getCause().getCause() instanceof SocketTimeoutException)) {
            aypz aypzVar = this.k;
            if (aypzVar != null) {
                aypzVar.g(exc);
            }
            j();
            return;
        }
        if (z) {
            aypz aypzVar2 = this.k;
            if (aypzVar2 != null) {
                aypzVar2.g(exc);
            }
            c();
        }
    }

    private static boolean x(adxr adxrVar, List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FormatStreamModel formatStreamModel = (FormatStreamModel) it.next();
            String str = formatStreamModel.b;
            if (TextUtils.isEmpty(str) || !adxrVar.g(str, formatStreamModel.e(), formatStreamModel.w(), TimeUnit.MILLISECONDS.toMicros(j), 1)) {
                return false;
            }
        }
        return true;
    }

    private final atr y(afhs afhsVar, aely aelyVar) {
        atr a = this.r.a();
        int i = afhsVar.q().o;
        aejv aejvVar = new aejv(a, this.r, new aeju(this.v, b()), this.b, this.n, aelyVar != null ? Math.max(i, (int) Math.ceil(afhsVar.q().p * aelyVar.b)) : i);
        if (!afhsVar.r().m) {
            return aejvVar;
        }
        final aejq aejqVar = this.x;
        return new aejr(aejvVar, this.m, this.n, aejqVar.a, aejqVar.b, aejqVar.c, aejqVar.d, new afjl(new amnv() { // from class: aejp
            @Override // defpackage.amnv
            public final Object get() {
                afhs afhsVar2 = aejq.this.e;
                if ((afhsVar2.r().b & 524288) != 0) {
                    aqvp aqvpVar = afhsVar2.r().n;
                    return aqvpVar == null ? aqvp.a : aqvpVar;
                }
                aone createBuilder = aqvp.a.createBuilder();
                createBuilder.copyOnWrite();
                aqvp aqvpVar2 = (aqvp) createBuilder.instance;
                aqvpVar2.b |= 1;
                aqvpVar2.c = 1000;
                createBuilder.copyOnWrite();
                aqvp aqvpVar3 = (aqvp) createBuilder.instance;
                aqvpVar3.b |= 2;
                aqvpVar3.d = 2.0f;
                createBuilder.copyOnWrite();
                aqvp aqvpVar4 = (aqvp) createBuilder.instance;
                aqvpVar4.b |= 8;
                aqvpVar4.f = 0.5f;
                return (aqvp) createBuilder.build();
            }
        }), aejqVar.e.r().o);
    }

    @Override // defpackage.aejb
    public final aypy a() {
        if (this.g != null) {
            final int i = 1;
            aypy M = aypy.v(new ayqa() { // from class: aeik
                @Override // defpackage.ayqa
                public final void a(aypz aypzVar) {
                    aeis aeisVar = aeis.this;
                    aeisVar.k = new azgb(aypzVar);
                    aeisVar.o();
                }
            }).E(new ayrm() { // from class: aeil
                @Override // defpackage.ayrm
                public final void a() {
                    aeis aeisVar = aeis.this;
                    aeisVar.n.Z();
                    aeisVar.c();
                }
            }).ab(this.s).M(new ayrv(this) { // from class: aeim
                public final /* synthetic */ aeis a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    if (i == 0) {
                        return wbs.J(this.a.g.b((arxk) obj)).l();
                    }
                    return wbs.J(this.a.g.a((aeip) obj)).l();
                }
            });
            final int i2 = 0;
            return M.M(new ayrv(this) { // from class: aeim
                public final /* synthetic */ aeis a;

                {
                    this.a = this;
                }

                @Override // defpackage.ayrv
                public final Object a(Object obj) {
                    if (i2 == 0) {
                        return wbs.J(this.a.g.b((arxk) obj)).l();
                    }
                    return wbs.J(this.a.g.a((aeip) obj)).l();
                }
            });
        }
        return aypy.K(aein.a);
    }

    public final List b() {
        atsg atsgVar = s().h;
        if (atsgVar == null) {
            atsgVar = atsg.a;
        }
        return atsgVar.c;
    }

    public final synchronized void c() {
        Iterable p;
        if (this.L) {
            return;
        }
        this.L = true;
        this.m.a();
        aels aelsVar = this.I;
        if (aelsVar != null) {
            aelsVar.a();
            this.I = null;
        }
        if (!this.j && !this.o.g()) {
            this.n.aa();
            this.e.a.b();
        }
        Iterator it = this.y.iterator();
        while (it.hasNext()) {
            ((Future) it.next()).cancel(true);
        }
        this.y.clear();
        Set set = this.a.h;
        if (set == null) {
            p = amvs.a;
        } else {
            p = amsx.p(set);
        }
        amxd listIterator = p.listIterator();
        while (listIterator.hasNext()) {
            this.B.a.remove((String) listIterator.next());
        }
        this.a.k();
        this.K = false;
        this.f37J = false;
    }

    @Override // defpackage.aeln
    public final synchronized void d(byte[] bArr) {
        if (this.f37J) {
            return;
        }
        this.n.W();
        try {
            this.a.q(bArr);
            this.f37J = true;
        } catch (aeld e) {
            String valueOf = String.valueOf(afhm.f(e, true, 1));
            String concat = valueOf.length() != 0 ? "OnesieControllerError;".concat(valueOf) : new String("OnesieControllerError;");
            afsi.e(2, 8, ammx.d(concat), 1.0d);
            afid.c(afic.ONESIE, e, "%s", concat);
        }
    }

    @Override // defpackage.aeln
    public final void e(Exception exc) {
        w(exc, true);
    }

    @Override // defpackage.aeln
    public final void f(String str, Set set) {
        this.p.b(str, set);
    }

    public final synchronized void g(String str) {
        if (this.H.contains(str)) {
            return;
        }
        this.H.add(str);
        aejn aejnVar = this.B;
        aeif aeifVar = new aeif(this);
        afhs afhsVar = aejnVar.b;
        int i = afhsVar.n().d;
        if (i <= 0) {
            i = afhsVar.q().E;
        }
        if (i > 0) {
            aejnVar.a.resize(i);
        }
        aejnVar.a.put(str, aeifVar);
    }

    public final synchronized void h() {
        aels aelsVar = this.I;
        if (aelsVar != null) {
            aelsVar.a();
            this.I = null;
        }
        this.a.l();
    }

    @Override // defpackage.aeln
    public final void i(Exception exc) {
        afid.c(afic.ONESIE, exc, "Onesie encountered a non-fatal error.", new Object[0]);
        w(exc, false);
    }

    @Override // defpackage.aeln
    public final synchronized void j() {
        this.n.ab();
        aypz aypzVar = this.k;
        if (aypzVar != null && !((azgb) aypzVar).a.e()) {
            aypz aypzVar2 = this.k;
            if (!((azgb) aypzVar2).a.e() && !((azgb) aypzVar2).d) {
                ((azgb) aypzVar2).d = true;
                ((azgb) aypzVar2).b();
            }
        }
        if (!this.j && !this.o.g() && this.o.b().equals(aosz.ONESIE_REQUEST_TARGET_ENCRYPTED_PLAYER_SERVICE)) {
            this.n.aa();
            this.n.U();
            IllegalStateException illegalStateException = new IllegalStateException("finished without player response");
            this.m.c("response.noplayerresponse", illegalStateException);
            this.e.qg(illegalStateException);
            afic aficVar = afic.ABR;
        }
        this.a.l();
        afic aficVar2 = afic.ABR;
    }

    @Override // defpackage.aeln
    public final synchronized void k(String str) {
        if (this.z.length() > 0) {
            this.z.append(",");
        }
        this.z.append(str);
        this.n.ai(this.z.toString());
    }

    @Override // defpackage.aeln
    public final synchronized void l(aelu aeluVar) {
        g(aeluVar.c);
        if (!aeluVar.g && aeluVar.b.length > 0 && !this.j && !this.K) {
            this.K = true;
            this.n.ah();
        }
        this.a.c(aeluVar);
    }

    public final boolean m() {
        afhs afhsVar = this.M;
        return new aonw(afhsVar.q().C, atsf.a).contains(apea.ANDROID_ONESIE_HOT_CONFIG_FEATURES_DISABLE_CANCEL_FROM_MEDIAPLAYER);
    }

    public final synchronized void n(Uri uri, long j) {
        for (int i = 0; i < 2; i++) {
            if (j > 0) {
                this.y.add(this.t.schedule(q(this.w, uri), j, TimeUnit.MILLISECONDS));
            } else {
                this.y.add(this.t.submit(q(this.w, uri)));
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:211|212|86|87|(1:89)(2:191|(3:195|91|(4:101|(2:104|(3:106|107|108))|141|572)(5:94|95|(2:97|98)|99|100)))|90|91|(0)|101|(2:104|(0))|141|572) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0632, code lost:
    
        r43.n.U();
        r2 = r43.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0639, code lost:
    
        if (r2 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x063b, code lost:
    
        r3 = new java.lang.IllegalStateException("Something went wrong with sending the Onesie request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x060d, code lost:
    
        r43.n.U();
        r2 = r43.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0614, code lost:
    
        if (r2 != null) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0616, code lost:
    
        r3 = new java.lang.IllegalStateException("Something went wrong with sending the Onesie request");
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0647, code lost:
    
        if (r7 == 0) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0649, code lost:
    
        r43.n.U();
        r3 = r43.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0650, code lost:
    
        if (r3 != null) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0652, code lost:
    
        r3.g(new java.lang.IllegalStateException("Something went wrong with sending the Onesie request"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x065c, code lost:
    
        r3 = defpackage.afic.ABR;
        c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0662, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:?, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x05f5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0625, code lost:
    
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05f3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0600, code lost:
    
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05f1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05fb, code lost:
    
        r2 = r0;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x021c, code lost:
    
        if (r6 == null) goto L121;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x054b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x055a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0630 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0644 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x060b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x061f A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0573 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04aa A[Catch: all -> 0x05f9, RuntimeException -> 0x05fe, aeew -> 0x0623, TRY_ENTER, TRY_LEAVE, TryCatch #13 {aeew -> 0x0623, RuntimeException -> 0x05fe, all -> 0x05f9, blocks: (B:7:0x000c, B:16:0x005b, B:21:0x006d, B:24:0x00a1, B:28:0x00c0, B:31:0x00ec, B:36:0x0105, B:39:0x0114, B:47:0x0139, B:87:0x03d2, B:90:0x04df, B:91:0x04e3, B:101:0x0545, B:142:0x0572, B:191:0x04aa, B:197:0x022f, B:200:0x0244, B:220:0x02dc, B:233:0x036d, B:248:0x03b2, B:259:0x0362, B:271:0x035a, B:273:0x0242, B:280:0x014a, B:282:0x012e, B:284:0x0101, B:286:0x00ac, B:289:0x00b9, B:290:0x00b7, B:291:0x009f, B:293:0x0044, B:296:0x004f), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x023f A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aeew -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #12 {aeew -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0027, B:15:0x002a, B:18:0x0063, B:20:0x0067, B:23:0x009c, B:26:0x00a7, B:30:0x00e2, B:35:0x00fc, B:41:0x011a, B:45:0x0125, B:49:0x013f, B:55:0x015f, B:57:0x017a, B:59:0x017e, B:60:0x0180, B:62:0x0184, B:63:0x0186, B:64:0x018d, B:66:0x019b, B:68:0x01b5, B:70:0x01c7, B:72:0x01d7, B:74:0x01db, B:75:0x01dd, B:77:0x01e1, B:78:0x01e3, B:79:0x01ea, B:81:0x01f3, B:84:0x01fa, B:89:0x04a0, B:94:0x0518, B:104:0x054d, B:193:0x04b0, B:195:0x04b6, B:199:0x023f, B:203:0x0274, B:206:0x027d, B:208:0x0283, B:212:0x0295, B:210:0x02c6, B:214:0x02cb, B:215:0x02cf, B:218:0x02d5, B:223:0x0300, B:225:0x0304, B:227:0x0310, B:232:0x0319, B:235:0x0373, B:237:0x038c, B:238:0x0390, B:240:0x0396, B:243:0x03ae, B:250:0x0322, B:252:0x0325, B:254:0x032d, B:256:0x0330, B:261:0x0368, B:262:0x033b, B:264:0x0346, B:266:0x0355, B:267:0x034e, B:275:0x01e6, B:278:0x0189, B:288:0x00b4, B:295:0x0048), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0396 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aeew -> 0x003f, TryCatch #12 {aeew -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0027, B:15:0x002a, B:18:0x0063, B:20:0x0067, B:23:0x009c, B:26:0x00a7, B:30:0x00e2, B:35:0x00fc, B:41:0x011a, B:45:0x0125, B:49:0x013f, B:55:0x015f, B:57:0x017a, B:59:0x017e, B:60:0x0180, B:62:0x0184, B:63:0x0186, B:64:0x018d, B:66:0x019b, B:68:0x01b5, B:70:0x01c7, B:72:0x01d7, B:74:0x01db, B:75:0x01dd, B:77:0x01e1, B:78:0x01e3, B:79:0x01ea, B:81:0x01f3, B:84:0x01fa, B:89:0x04a0, B:94:0x0518, B:104:0x054d, B:193:0x04b0, B:195:0x04b6, B:199:0x023f, B:203:0x0274, B:206:0x027d, B:208:0x0283, B:212:0x0295, B:210:0x02c6, B:214:0x02cb, B:215:0x02cf, B:218:0x02d5, B:223:0x0300, B:225:0x0304, B:227:0x0310, B:232:0x0319, B:235:0x0373, B:237:0x038c, B:238:0x0390, B:240:0x0396, B:243:0x03ae, B:250:0x0322, B:252:0x0325, B:254:0x032d, B:256:0x0330, B:261:0x0368, B:262:0x033b, B:264:0x0346, B:266:0x0355, B:267:0x034e, B:275:0x01e6, B:278:0x0189, B:288:0x00b4, B:295:0x0048), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0242 A[Catch: all -> 0x05f9, RuntimeException -> 0x05fe, aeew -> 0x0623, TRY_ENTER, TryCatch #13 {aeew -> 0x0623, RuntimeException -> 0x05fe, all -> 0x05f9, blocks: (B:7:0x000c, B:16:0x005b, B:21:0x006d, B:24:0x00a1, B:28:0x00c0, B:31:0x00ec, B:36:0x0105, B:39:0x0114, B:47:0x0139, B:87:0x03d2, B:90:0x04df, B:91:0x04e3, B:101:0x0545, B:142:0x0572, B:191:0x04aa, B:197:0x022f, B:200:0x0244, B:220:0x02dc, B:233:0x036d, B:248:0x03b2, B:259:0x0362, B:271:0x035a, B:273:0x0242, B:280:0x014a, B:282:0x012e, B:284:0x0101, B:286:0x00ac, B:289:0x00b9, B:290:0x00b7, B:291:0x009f, B:293:0x0044, B:296:0x004f), top: B:6:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x01e6 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aeew -> 0x003f, TryCatch #12 {aeew -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0027, B:15:0x002a, B:18:0x0063, B:20:0x0067, B:23:0x009c, B:26:0x00a7, B:30:0x00e2, B:35:0x00fc, B:41:0x011a, B:45:0x0125, B:49:0x013f, B:55:0x015f, B:57:0x017a, B:59:0x017e, B:60:0x0180, B:62:0x0184, B:63:0x0186, B:64:0x018d, B:66:0x019b, B:68:0x01b5, B:70:0x01c7, B:72:0x01d7, B:74:0x01db, B:75:0x01dd, B:77:0x01e1, B:78:0x01e3, B:79:0x01ea, B:81:0x01f3, B:84:0x01fa, B:89:0x04a0, B:94:0x0518, B:104:0x054d, B:193:0x04b0, B:195:0x04b6, B:199:0x023f, B:203:0x0274, B:206:0x027d, B:208:0x0283, B:212:0x0295, B:210:0x02c6, B:214:0x02cb, B:215:0x02cf, B:218:0x02d5, B:223:0x0300, B:225:0x0304, B:227:0x0310, B:232:0x0319, B:235:0x0373, B:237:0x038c, B:238:0x0390, B:240:0x0396, B:243:0x03ae, B:250:0x0322, B:252:0x0325, B:254:0x032d, B:256:0x0330, B:261:0x0368, B:262:0x033b, B:264:0x0346, B:266:0x0355, B:267:0x034e, B:275:0x01e6, B:278:0x0189, B:288:0x00b4, B:295:0x0048), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d7 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aeew -> 0x003f, TryCatch #12 {aeew -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0027, B:15:0x002a, B:18:0x0063, B:20:0x0067, B:23:0x009c, B:26:0x00a7, B:30:0x00e2, B:35:0x00fc, B:41:0x011a, B:45:0x0125, B:49:0x013f, B:55:0x015f, B:57:0x017a, B:59:0x017e, B:60:0x0180, B:62:0x0184, B:63:0x0186, B:64:0x018d, B:66:0x019b, B:68:0x01b5, B:70:0x01c7, B:72:0x01d7, B:74:0x01db, B:75:0x01dd, B:77:0x01e1, B:78:0x01e3, B:79:0x01ea, B:81:0x01f3, B:84:0x01fa, B:89:0x04a0, B:94:0x0518, B:104:0x054d, B:193:0x04b0, B:195:0x04b6, B:199:0x023f, B:203:0x0274, B:206:0x027d, B:208:0x0283, B:212:0x0295, B:210:0x02c6, B:214:0x02cb, B:215:0x02cf, B:218:0x02d5, B:223:0x0300, B:225:0x0304, B:227:0x0310, B:232:0x0319, B:235:0x0373, B:237:0x038c, B:238:0x0390, B:240:0x0396, B:243:0x03ae, B:250:0x0322, B:252:0x0325, B:254:0x032d, B:256:0x0330, B:261:0x0368, B:262:0x033b, B:264:0x0346, B:266:0x0355, B:267:0x034e, B:275:0x01e6, B:278:0x0189, B:288:0x00b4, B:295:0x0048), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04a0 A[Catch: all -> 0x0035, RuntimeException -> 0x003a, aeew -> 0x003f, TRY_ENTER, TRY_LEAVE, TryCatch #12 {aeew -> 0x003f, RuntimeException -> 0x003a, all -> 0x0035, blocks: (B:10:0x0019, B:12:0x0023, B:14:0x0027, B:15:0x002a, B:18:0x0063, B:20:0x0067, B:23:0x009c, B:26:0x00a7, B:30:0x00e2, B:35:0x00fc, B:41:0x011a, B:45:0x0125, B:49:0x013f, B:55:0x015f, B:57:0x017a, B:59:0x017e, B:60:0x0180, B:62:0x0184, B:63:0x0186, B:64:0x018d, B:66:0x019b, B:68:0x01b5, B:70:0x01c7, B:72:0x01d7, B:74:0x01db, B:75:0x01dd, B:77:0x01e1, B:78:0x01e3, B:79:0x01ea, B:81:0x01f3, B:84:0x01fa, B:89:0x04a0, B:94:0x0518, B:104:0x054d, B:193:0x04b0, B:195:0x04b6, B:199:0x023f, B:203:0x0274, B:206:0x027d, B:208:0x0283, B:212:0x0295, B:210:0x02c6, B:214:0x02cb, B:215:0x02cf, B:218:0x02d5, B:223:0x0300, B:225:0x0304, B:227:0x0310, B:232:0x0319, B:235:0x0373, B:237:0x038c, B:238:0x0390, B:240:0x0396, B:243:0x03ae, B:250:0x0322, B:252:0x0325, B:254:0x032d, B:256:0x0330, B:261:0x0368, B:262:0x033b, B:264:0x0346, B:266:0x0355, B:267:0x034e, B:275:0x01e6, B:278:0x0189, B:288:0x00b4, B:295:0x0048), top: B:8:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0516 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v30, types: [long] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v35 */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            Method dump skipped, instructions count: 1636
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeis.o():void");
    }
}
