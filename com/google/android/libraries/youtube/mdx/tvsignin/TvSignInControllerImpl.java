package com.google.android.libraries.youtube.mdx.tvsignin;

import android.content.Intent;
import android.text.TextUtils;
import androidx.activity.result.ActivityResult;
import com.google.android.libraries.youtube.mdx.model.ScreenId;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInActivity;
import com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl;
import com.google.android.youtube.R;
import defpackage.aac;
import defpackage.aae;
import defpackage.aap;
import defpackage.acpl;
import defpackage.acun;
import defpackage.acyp;
import defpackage.acys;
import defpackage.adfs;
import defpackage.adgb;
import defpackage.adlh;
import defpackage.adlm;
import defpackage.adlt;
import defpackage.adpt;
import defpackage.adsq;
import defpackage.adsv;
import defpackage.adsw;
import defpackage.adtg;
import defpackage.adti;
import defpackage.afsy;
import defpackage.aok;
import defpackage.aynu;
import defpackage.ayph;
import defpackage.aypj;
import defpackage.aypy;
import defpackage.ayqi;
import defpackage.ayqr;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ayrv;
import defpackage.aysw;
import defpackage.azld;
import defpackage.azre;
import defpackage.azrw;
import defpackage.ci;
import defpackage.jdz;
import defpackage.vgz;
import defpackage.wdm;
import defpackage.yjk;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.ypd;
import defpackage.zfi;
import defpackage.zga;
import j$.time.Duration;
import j$.util.Optional;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class TvSignInControllerImpl implements adsw, ypd {
    public static final /* synthetic */ int o = 0;
    public final ypa b;
    public final acpl c;
    public final wdm d;
    public final afsy e;
    public final azrw f;
    public final ci g;
    public final ScheduledExecutorService h;
    public adsv k;
    public aae m;
    public final adti n;
    private final acys p;
    private final acyp q;
    private final adlt r;
    private final adsq s;
    private final Executor t;
    final adtg i = new adtg(this);
    public final ayqw j = new ayqw();
    public boolean l = false;

    public TvSignInControllerImpl(acys acysVar, final ypa ypaVar, acpl acplVar, final String str, wdm wdmVar, afsy afsyVar, final acun acunVar, azrw azrwVar, ci ciVar, adti adtiVar, adlt adltVar, adsq adsqVar, final Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.p = acysVar;
        this.b = ypaVar;
        this.c = acplVar;
        this.d = wdmVar;
        this.e = afsyVar;
        this.f = azrwVar;
        this.g = ciVar;
        this.n = adtiVar;
        this.r = adltVar;
        this.s = adsqVar;
        this.h = scheduledExecutorService;
        this.t = executor;
        this.q = new acyp() { // from class: adtd
            /* JADX WARN: Removed duplicated region for block: B:23:0x00ba  */
            /* JADX WARN: Removed duplicated region for block: B:5:0x007a  */
            @Override // defpackage.acyp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a(defpackage.adfy r15) {
                /*
                    r14 = this;
                    com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl r0 = com.google.android.libraries.youtube.mdx.tvsignin.TvSignInControllerImpl.this
                    java.lang.String r1 = r2
                    acun r2 = r3
                    java.util.concurrent.Executor r3 = r4
                    ypa r4 = r5
                    boolean r2 = r2.y
                    java.util.Map r5 = r15.m()
                    r6 = 0
                    if (r5 != 0) goto L15
                L13:
                    r1 = r6
                    goto L78
                L15:
                    java.lang.String r7 = "theme"
                    java.lang.Object r7 = r5.get(r7)
                    boolean r1 = r1.equals(r7)
                    if (r1 != 0) goto L22
                    goto L13
                L22:
                    com.google.android.libraries.youtube.mdx.model.ScreenId r9 = r15.b()
                    adfs r10 = r15.g()
                    java.lang.String r1 = "authCode"
                    java.lang.Object r1 = r5.get(r1)
                    r13 = r1
                    java.lang.String r13 = (java.lang.String) r13
                    java.lang.String r1 = "signInSessionId"
                    java.lang.Object r1 = r5.get(r1)
                    r8 = r1
                    java.lang.String r8 = (java.lang.String) r8
                    java.lang.String r1 = "passiveAuthCode"
                    java.lang.Object r1 = r5.get(r1)
                    java.lang.String r1 = (java.lang.String) r1
                    java.lang.String r7 = "passiveSessionId"
                    java.lang.Object r5 = r5.get(r7)
                    java.lang.String r5 = (java.lang.String) r5
                    if (r9 == 0) goto L13
                    if (r10 == 0) goto L13
                    boolean r7 = android.text.TextUtils.isEmpty(r13)
                    if (r7 != 0) goto L65
                    boolean r7 = android.text.TextUtils.isEmpty(r8)
                    if (r7 != 0) goto L65
                    adsv r1 = new adsv
                    r12 = 0
                    r7 = r1
                    r11 = r15
                    r7.<init>(r8, r9, r10, r11, r12, r13)
                    goto L78
                L65:
                    boolean r7 = android.text.TextUtils.isEmpty(r5)
                    if (r7 != 0) goto L13
                    if (r2 == 0) goto L13
                    adsv r2 = new adsv
                    r12 = 1
                    r7 = r2
                    r8 = r5
                    r11 = r15
                    r13 = r1
                    r7.<init>(r8, r9, r10, r11, r12, r13)
                    r1 = r2
                L78:
                    if (r1 != 0) goto Lba
                    adsv r1 = r0.k
                    if (r1 == 0) goto Lb9
                    int r1 = r1.e
                    r2 = 2
                    if (r1 == r2) goto Lb9
                    r2 = 3
                    if (r1 == r2) goto Lb9
                    adfs r1 = r15.g()
                    if (r1 != 0) goto L8d
                    goto Lb9
                L8d:
                    adfs r15 = r15.g()
                    java.lang.String r15 = r15.c
                    adsv r1 = r0.k
                    adfs r1 = r1.c
                    java.lang.String r1 = r1.c
                    boolean r15 = android.text.TextUtils.equals(r15, r1)
                    if (r15 == 0) goto Lb9
                    adsu r15 = new adsu
                    adsv r1 = r0.k
                    r8 = 0
                    int r9 = r1.e
                    com.google.android.libraries.youtube.mdx.model.ScreenId r10 = r1.b
                    adfs r11 = r1.c
                    adgb r1 = r1.d
                    java.lang.String r12 = r1.c()
                    r7 = r15
                    r7.<init>(r8, r9, r10, r11, r12)
                    r4.d(r15)
                    r0.k = r6
                Lb9:
                    return
                Lba:
                    adsy r15 = new adsy
                    r15.<init>()
                    r3.execute(r15)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.adtd.a(adfy):void");
            }

            @Override // defpackage.acyp
            public final /* synthetic */ void b() {
            }
        };
        this.m = ciVar.registerForActivityResult(new aap(), new aac() { // from class: adsx
            @Override // defpackage.aac
            public final void a(Object obj) {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                Intent intent = activityResult.b;
                if (i == -1) {
                    int intExtra = intent.getIntExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyExitType", 2);
                    if (intExtra == 0) {
                        adti adtiVar2 = tvSignInControllerImpl.n;
                        adtiVar2.b(adtiVar2.a.getString(R.string.mdx_tv_signin_connecting_snackbar_message), acrb.MDX_TV_SIGN_IN_SNACKBAR_CONNECTING);
                    } else if (intExtra == 1) {
                        adti adtiVar3 = tvSignInControllerImpl.n;
                        adtiVar3.b(adtiVar3.a.getString(R.string.mdx_tv_signin_cancel_snackbar_message), acrb.MDX_TV_SIGN_IN_SNACKBAR_CANCELED);
                    } else if (intExtra == 2) {
                        if (TextUtils.isEmpty(intent.getStringExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyError"))) {
                            tvSignInControllerImpl.g.getString(R.string.mdx_tv_signin_error_snackbar_message);
                        }
                        tvSignInControllerImpl.n.a();
                    }
                } else if (i == 0) {
                    tvSignInControllerImpl.l = true;
                }
                tvSignInControllerImpl.k = null;
            }
        });
    }

    public static /* synthetic */ void m(Throwable th) {
        zga.f(a, "Failed to store passive last time shown.", th);
    }

    @Override // defpackage.adsw
    public final adsv g() {
        return this.k;
    }

    @Override // defpackage.adsw
    public final void h() {
        this.j.c();
        o();
    }

    @Override // defpackage.adsw
    public final void i() {
        yjk.f();
        this.k = null;
    }

    @Override // defpackage.adsw
    public final void j(final jdz jdzVar, Duration duration) {
        final adlm g = this.r.g();
        if (g != null) {
            final int i = 1;
            if (g.a() == 1 && g.n() != null) {
                ayqi b = azre.b(this.h);
                final String uuid = UUID.randomUUID().toString();
                aypy ak = ayph.j(new aypj() { // from class: adte
                    @Override // defpackage.aypj
                    public final void a(final ayue ayueVar) {
                        ynm.k(g.r(uuid), TvSignInControllerImpl.this.h, new ynk() { // from class: adta
                            @Override // defpackage.zfi
                            /* renamed from: b */
                            public final void a(Throwable th) {
                                ayue.this.c(th);
                            }
                        }, new ynl() { // from class: adtb
                            @Override // defpackage.ynl, defpackage.zfi
                            public final void a(Object obj) {
                                ayue ayueVar2 = ayue.this;
                                int i2 = TvSignInControllerImpl.o;
                                if (((Boolean) obj).booleanValue()) {
                                    ayueVar2.a();
                                } else {
                                    ayueVar2.c(new Exception("MdxSession.sendStartSignIn returned false."));
                                }
                            }
                        });
                    }
                }).M(g.n().c()).ak(1L);
                long millis = duration.toMillis();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                aysw.b(timeUnit, "timeUnit is null");
                azld azldVar = new azld(ak, millis, timeUnit, b);
                ayrv ayrvVar = aynu.l;
                aypy ab = azldVar.ab(ayqr.a());
                ayrs ayrsVar = new ayrs(this) { // from class: adtf
                    public final /* synthetic */ TvSignInControllerImpl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i == 0) {
                            TvSignInControllerImpl tvSignInControllerImpl = this.a;
                            jdz jdzVar2 = jdzVar;
                            String str = TvSignInControllerImpl.a;
                            String valueOf = String.valueOf((Throwable) obj);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                            sb.append("Failed to start MDx message sign in: ");
                            sb.append(valueOf);
                            zga.c(str, sb.toString());
                            jdzVar2.a();
                            tvSignInControllerImpl.o();
                            return;
                        }
                        TvSignInControllerImpl tvSignInControllerImpl2 = this.a;
                        jdz jdzVar3 = jdzVar;
                        Optional optional = (Optional) obj;
                        tvSignInControllerImpl2.j.c();
                        if (!optional.isPresent()) {
                            zga.c(TvSignInControllerImpl.a, "SignInRequest from onSignInStarted MDx message is empty. Not proceeding with sign in flow.");
                            jdzVar3.a();
                            tvSignInControllerImpl2.o();
                            return;
                        }
                        tvSignInControllerImpl2.k = (adsv) optional.get();
                        jdzVar3.a.ag = null;
                        jdzVar3.a.ac.post(new jdy(jdzVar3, 0));
                        if (!tvSignInControllerImpl2.e.t() || tvSignInControllerImpl2.d.a() == null || tvSignInControllerImpl2.d.a().b == null || TextUtils.isEmpty(tvSignInControllerImpl2.d.a().b)) {
                            tvSignInControllerImpl2.p(tvSignInControllerImpl2.k, null);
                        } else {
                            tvSignInControllerImpl2.p(tvSignInControllerImpl2.k, tvSignInControllerImpl2.d.a().b);
                        }
                    }
                };
                final int i2 = 0;
                this.j.d(ab.ay(ayrsVar, new ayrs(this) { // from class: adtf
                    public final /* synthetic */ TvSignInControllerImpl a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        if (i2 == 0) {
                            TvSignInControllerImpl tvSignInControllerImpl = this.a;
                            jdz jdzVar2 = jdzVar;
                            String str = TvSignInControllerImpl.a;
                            String valueOf = String.valueOf((Throwable) obj);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                            sb.append("Failed to start MDx message sign in: ");
                            sb.append(valueOf);
                            zga.c(str, sb.toString());
                            jdzVar2.a();
                            tvSignInControllerImpl.o();
                            return;
                        }
                        TvSignInControllerImpl tvSignInControllerImpl2 = this.a;
                        jdz jdzVar3 = jdzVar;
                        Optional optional = (Optional) obj;
                        tvSignInControllerImpl2.j.c();
                        if (!optional.isPresent()) {
                            zga.c(TvSignInControllerImpl.a, "SignInRequest from onSignInStarted MDx message is empty. Not proceeding with sign in flow.");
                            jdzVar3.a();
                            tvSignInControllerImpl2.o();
                            return;
                        }
                        tvSignInControllerImpl2.k = (adsv) optional.get();
                        jdzVar3.a.ag = null;
                        jdzVar3.a.ac.post(new jdy(jdzVar3, 0));
                        if (!tvSignInControllerImpl2.e.t() || tvSignInControllerImpl2.d.a() == null || tvSignInControllerImpl2.d.a().b == null || TextUtils.isEmpty(tvSignInControllerImpl2.d.a().b)) {
                            tvSignInControllerImpl2.p(tvSignInControllerImpl2.k, null);
                        } else {
                            tvSignInControllerImpl2.p(tvSignInControllerImpl2.k, tvSignInControllerImpl2.d.a().b);
                        }
                    }
                }));
                return;
            }
        }
        zga.c(a, "startMdxMessageSignIn failed before sending MDx message as MDx session state is invalid.");
        jdzVar.a();
    }

    @Override // defpackage.adsw
    public final void k() {
        p(this.k, null);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        ScreenId screenId;
        adfs adfsVar;
        if (i == -1) {
            return new Class[]{adlh.class};
        }
        if (i == 0) {
            adlh adlhVar = (adlh) obj;
            adgb adgbVar = adlhVar.e;
            if (adgbVar == null || (screenId = adlhVar.a) == null || (adfsVar = adlhVar.b) == null) {
                zga.m(a, "Got a null MDX screen or screenID when processing MdxRequestAssistedSignInEvent.");
                return null;
            }
            Optional a = adsv.a(adlhVar.c, adlhVar.d, screenId, adfsVar, adgbVar, 2);
            if (!a.isPresent()) {
                return null;
            }
            n((adsv) a.get());
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    @Override // defpackage.adsw
    public final void l(adsv adsvVar, String str) {
        p(adsvVar, str);
    }

    @Override // defpackage.aoa
    public final /* synthetic */ void lc(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lg(aok aokVar) {
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void lh(aok aokVar) {
    }

    public final void n(final adsv adsvVar) {
        this.k = adsvVar;
        final String str = adsvVar.a;
        ynm.n(this.g, ((vgz) this.f.get()).a(), adpt.d, new zfi() { // from class: adtc
            @Override // defpackage.zfi
            public final void a(Object obj) {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                String str2 = str;
                adsv adsvVar2 = adsvVar;
                if (!((awvi) obj).b.contains(str2) || tvSignInControllerImpl.l) {
                    tvSignInControllerImpl.l = false;
                    String.format("Processing sign in request for signInSessionId=%s on screen=%s", str2, adsvVar2.d.c());
                    aone createBuilder = atat.a.createBuilder();
                    createBuilder.copyOnWrite();
                    atat atatVar = (atat) createBuilder.instance;
                    atatVar.c = 2;
                    atatVar.b = 1 | atatVar.b;
                    createBuilder.copyOnWrite();
                    atat atatVar2 = (atat) createBuilder.instance;
                    str2.getClass();
                    atatVar2.b = 2 | atatVar2.b;
                    atatVar2.d = str2;
                    atat atatVar3 = (atat) createBuilder.build();
                    arpn a = arpp.a();
                    a.copyOnWrite();
                    ((arpp) a.instance).dh(atatVar3);
                    tvSignInControllerImpl.c.c((arpp) a.build());
                    tvSignInControllerImpl.b.d(new adsu(true, adsvVar2.e, adsvVar2.b, adsvVar2.c, adsvVar2.d.c()));
                    ynm.m(((vgz) tvSignInControllerImpl.f.get()).b(new wgs(str2, 15), angq.a), adha.o);
                }
            }
        });
    }

    @Override // defpackage.any, defpackage.aoa
    public final /* synthetic */ void nu(aok aokVar) {
    }

    @Override // defpackage.aoa
    public final void nv(aok aokVar) {
        this.b.m(this);
        this.p.f(this.q);
        this.k = null;
        this.j.c();
        this.r.k(this.i);
    }

    public final void o() {
        adlm g = this.r.g();
        if (g == null || g.l() == null) {
            return;
        }
        this.s.a(g.l(), "canceled");
    }

    @Override // defpackage.any, defpackage.aoa
    public final void ot(aok aokVar) {
        this.p.c(this.q, false);
        this.b.g(this);
        this.r.i(this.i);
    }

    public final void p(final adsv adsvVar, final String str) {
        if (this.g == null || adsvVar == null) {
            return;
        }
        this.t.execute(new Runnable() { // from class: adsz
            @Override // java.lang.Runnable
            public final void run() {
                TvSignInControllerImpl tvSignInControllerImpl = TvSignInControllerImpl.this;
                adsv adsvVar2 = adsvVar;
                String str2 = str;
                adti adtiVar = tvSignInControllerImpl.n;
                akcb akcbVar = adtiVar.d;
                if (akcbVar != null) {
                    adtiVar.b.n(akcbVar);
                }
                Intent intent = new Intent(tvSignInControllerImpl.g, (Class<?>) TvSignInActivity.class);
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAccountEmail", str2);
                }
                String b = adsvVar2.b() != null ? adsvVar2.b() : "";
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAuthCode", adsvVar2.f);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyScreenId", adsvVar2.b.c);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.keyAppStatusUri", b);
                intent.putExtra("com.google.android.libraries.youtube.mdx.tvsignin.requestType", adsvVar2.e);
                tvSignInControllerImpl.m.b(intent);
            }
        });
    }
}
