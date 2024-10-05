package com.google.android.apps.youtube.app.watchwhile;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.application.Shell_HomeActivity;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
import defpackage.aadw;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.acra;
import defpackage.acxi;
import defpackage.aczi;
import defpackage.adfa;
import defpackage.adla;
import defpackage.adlm;
import defpackage.adlt;
import defpackage.adly;
import defpackage.afte;
import defpackage.agdi;
import defpackage.ahtp;
import defpackage.ahyo;
import defpackage.aieu;
import defpackage.aij;
import defpackage.ainy;
import defpackage.aivo;
import defpackage.ajdf;
import defpackage.ajdh;
import defpackage.ajti;
import defpackage.akhj;
import defpackage.akhk;
import defpackage.akkw;
import defpackage.akpx;
import defpackage.akxw;
import defpackage.alwk;
import defpackage.amei;
import defpackage.amej;
import defpackage.amel;
import defpackage.amhn;
import defpackage.amil;
import defpackage.amis;
import defpackage.amjw;
import defpackage.amkq;
import defpackage.amsx;
import defpackage.aof;
import defpackage.aom;
import defpackage.apwy;
import defpackage.asvu;
import defpackage.aswb;
import defpackage.atua;
import defpackage.auxs;
import defpackage.axpg;
import defpackage.axps;
import defpackage.axqq;
import defpackage.axzg;
import defpackage.aypy;
import defpackage.ayqi;
import defpackage.ayqw;
import defpackage.ayrs;
import defpackage.ayrw;
import defpackage.ayrz;
import defpackage.bog;
import defpackage.bue;
import defpackage.ce;
import defpackage.dd;
import defpackage.eed;
import defpackage.efz;
import defpackage.eni;
import defpackage.env;
import defpackage.esv;
import defpackage.euc;
import defpackage.evr;
import defpackage.fcw;
import defpackage.fep;
import defpackage.feq;
import defpackage.fgb;
import defpackage.fll;
import defpackage.fma;
import defpackage.fxb;
import defpackage.fxj;
import defpackage.fxn;
import defpackage.fzb;
import defpackage.fzj;
import defpackage.gfi;
import defpackage.gfo;
import defpackage.gfw;
import defpackage.gir;
import defpackage.gnf;
import defpackage.gng;
import defpackage.gni;
import defpackage.goe;
import defpackage.jgb;
import defpackage.kch;
import defpackage.kcz;
import defpackage.llq;
import defpackage.lrr;
import defpackage.lrx;
import defpackage.lso;
import defpackage.ltw;
import defpackage.lut;
import defpackage.lwt;
import defpackage.lwy;
import defpackage.lyj;
import defpackage.lyo;
import defpackage.lza;
import defpackage.miz;
import defpackage.mja;
import defpackage.mjc;
import defpackage.mkb;
import defpackage.nbm;
import defpackage.nka;
import defpackage.nmt;
import defpackage.nnb;
import defpackage.nys;
import defpackage.oeu;
import defpackage.okf;
import defpackage.oki;
import defpackage.okl;
import defpackage.okq;
import defpackage.okt;
import defpackage.olr;
import defpackage.omh;
import defpackage.omk;
import defpackage.omq;
import defpackage.omw;
import defpackage.omy;
import defpackage.ond;
import defpackage.ong;
import defpackage.onk;
import defpackage.onm;
import defpackage.onr;
import defpackage.ont;
import defpackage.onv;
import defpackage.ony;
import defpackage.ooc;
import defpackage.ooh;
import defpackage.ook;
import defpackage.ool;
import defpackage.oom;
import defpackage.oor;
import defpackage.ort;
import defpackage.orx;
import defpackage.oso;
import defpackage.rxm;
import defpackage.shf;
import defpackage.wbs;
import defpackage.wjz;
import defpackage.wyz;
import defpackage.wzq;
import defpackage.xoh;
import defpackage.ydq;
import defpackage.yjk;
import defpackage.ymp;
import defpackage.ynm;
import defpackage.ypa;
import defpackage.yqw;
import defpackage.yxx;
import defpackage.yyq;
import defpackage.yyr;
import defpackage.yys;
import defpackage.zaz;
import defpackage.zbl;
import defpackage.zfi;
import defpackage.zga;
import j$.util.function.Consumer;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WatchWhileActivity extends okt implements amei {
    private omq j;
    private final amhn k = amhn.a(this);
    private boolean l;
    private Context m;
    private aom n;
    private boolean o;

    public WatchWhileActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new olr(this));
    }

    private final omq v() {
        q();
        return this.j;
    }

    @Override // defpackage.euc
    protected final Dialog a(int i) {
        return null;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.m;
        }
        amkq.i(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.m = context;
        amkq.h(context);
        super.attachBaseContext(context);
        this.m = null;
    }

    @Override // defpackage.zv, defpackage.er, defpackage.aok
    public final aof getLifecycle() {
        if (this.n == null) {
            this.n = new amej(this);
        }
        return this.n;
    }

    @Override // defpackage.euc
    protected final void h(gng gngVar) {
    }

    @Override // defpackage.ml, android.app.Activity
    public final void invalidateOptionsMenu() {
        amis p = amjw.p();
        try {
            super.invalidateOptionsMenu();
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean isInPictureInPictureMode() {
        ooc oocVar = v().am;
        if (!aij.c()) {
            return false;
        }
        if (oocVar.z && !oocVar.A && !oocVar.G.u() && !oocVar.u.isInMultiWindowMode()) {
            oocVar.A = true;
            oocVar.c.p();
            oocVar.s.c(false);
            oocVar.A = false;
        }
        return oocVar.z;
    }

    @Override // defpackage.euc
    public final void j() {
        omq v = v();
        if (v.aj.h) {
            v.w();
            return;
        }
        if (((fzb) v.p.get()).f() != 1) {
            return;
        }
        v.an.p = false;
        if (v.ak.a.F()) {
            v.D();
            return;
        }
        if (v.a.isTaskRoot() || v.aj.f) {
            if (v.k.m()) {
                return;
            }
            ony onyVar = v.ak;
            int i = onyVar.c;
            v.ak.v(onyVar.k(), i | 2);
            return;
        }
        esv esvVar = v.aY;
        Intent flags = new Intent(v.a, (Class<?>) Shell_HomeActivity.class).setFlags(335544320);
        flags.setAction("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER");
        v.a.startActivity(flags);
    }

    @Override // defpackage.euc
    protected final Dialog k(int i) {
        omq v = v();
        if (i != 1032) {
            WatchWhileActivity watchWhileActivity = v.bb;
            return null;
        }
        ook ookVar = v.al;
        if (ookVar.n == null) {
            ookVar.n = new ProgressDialog(ookVar.a);
            ookVar.n.setMessage(ookVar.a.getString(R.string.sign_in_progress));
            ookVar.n.setCancelable(false);
            ookVar.n.setCanceledOnTouchOutside(false);
        }
        return ookVar.n;
    }

    @Override // defpackage.okv
    public final /* synthetic */ axps m() {
        return amel.a(this);
    }

    @Override // defpackage.euc
    protected final void mE() {
        omq v = v();
        onk onkVar = v.aj;
        if (onkVar.e) {
            onkVar.h();
            v.G();
        }
    }

    @Override // defpackage.euc
    public final void mF() {
        v().D();
    }

    @Override // defpackage.euc, defpackage.acqz
    public final acra mM() {
        return v().g();
    }

    @Override // defpackage.omx
    protected final goe n() {
        String q = ((ainy) v().f250J.get()).q();
        JSONObject jSONObject = null;
        if (q == null) {
            return null;
        }
        try {
            jSONObject = new JSONObject().put("@videoId", q);
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 43);
            sb.append("Failed to form the JSON for the assistant: ");
            sb.append(valueOf);
            zga.b(sb.toString());
        }
        return new goe(jSONObject.toString(), wbs.ah(q));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        omq v = v();
        if (fzb.a == actionMode.getTag() || Build.VERSION.SDK_INT >= 23) {
            return;
        }
        ((fzb) v.p.get()).l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        omq v = v();
        if (fzb.a == actionMode.getTag() || Build.VERSION.SDK_INT >= 23) {
            return;
        }
        ((fzb) v.p.get()).h();
    }

    @Override // defpackage.euc, defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amis p = this.k.p();
        try {
            super.onActivityResult(i, i2, intent);
            v().aJ.g(i, i2);
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        amis b = this.k.b();
        try {
            v().w();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        omq v = v();
        apwy b = v.aV.b();
        if (b != null) {
            asvu asvuVar = b.e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.as) {
                v.i();
            }
        }
        v.aE.a(configuration);
        ooc oocVar = v.am;
        oocVar.A = false;
        oocVar.i.b(oocVar.a);
        yjk.U(v.a.getApplicationContext());
        v.aS.b();
        ((fzb) v.p.get()).j();
        v.j();
        v.c.c(configuration);
        ajdf ajdfVar = v.h.b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.euc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(final Bundle bundle) {
        yyr yyrVar;
        amis q = this.k.q();
        final int i = 1;
        try {
            this.l = true;
            ((amej) getLifecycle()).h(this.k);
            super.onCreate(bundle);
            final omq v = v();
            final int i2 = 2;
            v.aI.h(2);
            final int i3 = 0;
            if (bundle != null) {
                try {
                    v.aT = bundle.getBoolean("IS_BACKING_FROM_OTHER_ACTIVITY", false);
                } catch (Throwable th) {
                    v.aI.d(2);
                    throw th;
                }
            }
            if ((v.aN.f(yxx.E) & 4194304) == 0 || (yyrVar = v.aR) == null) {
                v.h();
                v.az.c(bundle);
                v.t(bundle, v.b);
                v.ai = new nmt(v.a.getApplicationContext());
                v.h();
                v.aW.a(true);
                v.al.c(bundle);
                v.s();
                v.r();
                v.q();
                v.n();
                v.A = (ViewGroup) v.a.findViewById(R.id.pane_fragment_container);
                v.ak.u(v.n, (fzb) v.p.get());
                v.k();
                v.o();
                v.au.e();
                v.am.s((View) v.z.get(), v.A, v.l, bundle);
                v.r.b = v.k;
                v.aq.a();
                v.m();
                v.p();
                v.ap.a();
                v.l();
                v.A();
                v.Y.execute(new omk(v, 12));
                ((ltw) v.T.get()).a();
                v.Y.execute(new omk(v, i2));
                if (evr.aS(v.aV)) {
                    v.c.g(v.ad);
                }
                v.c.a();
                v.S.a();
                v.av.a();
                v.av.c(v.a, v.t);
                v.a.getSupportFragmentManager().ai(new akpx(), true);
                v.aC.a();
                v.f250J.get();
            } else {
                ayqi ayqiVar = v.Z;
                yyq b = yyr.b(6);
                int i4 = 9;
                b.a("bcf", new omk(v, i4));
                b.a("dtc", new Runnable() { // from class: oml
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i;
                        if (i5 == 0) {
                            omq omqVar = v;
                            omqVar.t(bundle, omqVar.b);
                            return;
                        }
                        if (i5 == 1) {
                            omq omqVar2 = v;
                            omqVar2.az.c(bundle);
                        } else if (i5 == 2) {
                            omq omqVar3 = v;
                            omqVar3.al.c(bundle);
                        } else {
                            omq omqVar4 = v;
                            omqVar4.am.s((View) omqVar4.z.get(), omqVar4.A, omqVar4.l, bundle);
                        }
                    }
                });
                b.a("ioc", new Runnable() { // from class: oml
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i5 = i3;
                        if (i5 == 0) {
                            omq omqVar = v;
                            omqVar.t(bundle, omqVar.b);
                            return;
                        }
                        if (i5 == 1) {
                            omq omqVar2 = v;
                            omqVar2.az.c(bundle);
                        } else if (i5 == 2) {
                            omq omqVar3 = v;
                            omqVar3.al.c(bundle);
                        } else {
                            omq omqVar4 = v;
                            omqVar4.am.s((View) omqVar4.z.get(), omqVar4.A, omqVar4.l, bundle);
                        }
                    }
                });
                b.a("adh", new omk(v, 13));
                b.a("bcf", new omk(v, i4));
                int i5 = 4;
                b.a("wwp", new omh(v, i5));
                b.a("wws", new Runnable() { // from class: oml
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i52 = i2;
                        if (i52 == 0) {
                            omq omqVar = v;
                            omqVar.t(bundle, omqVar.b);
                            return;
                        }
                        if (i52 == 1) {
                            omq omqVar2 = v;
                            omqVar2.az.c(bundle);
                        } else if (i52 == 2) {
                            omq omqVar3 = v;
                            omqVar3.al.c(bundle);
                        } else {
                            omq omqVar4 = v;
                            omqVar4.am.s((View) omqVar4.z.get(), omqVar4.A, omqVar4.l, bundle);
                        }
                    }
                });
                b.a("inu", new omk(v, i3));
                int i6 = 5;
                b.a("ttc", new omk(v, i6));
                b.a("svc", new omh(v, 18));
                b.a("imc", new omk(v, 11));
                b.a("apc", new omk(v, i5));
                b.a("pnc", new omh(v, i6));
                int i7 = 19;
                b.a("btu", new omh(v, i7));
                int i8 = 8;
                b.a("pbc", new omk(v, i8));
                b.a("scc", new omh(v, 6));
                final int i9 = 3;
                b.a("wpc", new Runnable() { // from class: oml
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i52 = i9;
                        if (i52 == 0) {
                            omq omqVar = v;
                            omqVar.t(bundle, omqVar.b);
                            return;
                        }
                        if (i52 == 1) {
                            omq omqVar2 = v;
                            omqVar2.az.c(bundle);
                        } else if (i52 == 2) {
                            omq omqVar3 = v;
                            omqVar3.al.c(bundle);
                        } else {
                            omq omqVar4 = v;
                            omqVar4.am.s((View) omqVar4.z.get(), omqVar4.A, omqVar4.l, bundle);
                        }
                    }
                });
                b.a("lss", new omh(v, 7));
                b.a("woc", new omh(v, i8));
                b.a("fab", new omk(v, i9));
                b.a("pcc", new omk(v, 10));
                b.a("wyc", new omk(v, 14));
                int i10 = 17;
                b.a("cdc", new omh(v, i10));
                b.a("dec", new omk(v, i));
                yyrVar.n(ayqiVar, b);
                yyr yyrVar2 = v.aR;
                ayqi ayqiVar2 = v.Z;
                yyq b2 = yyr.b(0);
                b2.a("imm", new omk(v, 12));
                yyrVar2.n(ayqiVar2, b2);
                yyr yyrVar3 = v.aR;
                ayqi ayqiVar3 = v.Z;
                yyq b3 = yyr.b(6);
                b3.a("ill", new omk(v, 15));
                yyrVar3.n(ayqiVar3, b3);
                yyr yyrVar4 = v.aR;
                ayqi ayqiVar4 = v.Z;
                yyq b4 = yyr.b(0);
                b4.a("scm", new omk(v, i2));
                yyrVar4.n(ayqiVar4, b4);
                boolean aS = evr.aS(v.aV);
                yyr yyrVar5 = v.aR;
                ayqi ayqiVar5 = v.Z;
                yyq b5 = yyr.b(6);
                b5.c("rtc", new omk(v, 16), aS);
                b5.a("ilc", new omk(v, i10));
                b5.a("bsc", new omk(v, 18));
                b5.a("crc", new omk(v, i7));
                b5.a("src", new omh(v, i));
                b5.a("rfl", new omh(v, i3));
                b5.a("ifl", new omh(v, i2));
                b5.a("psp", new omh(v, i9));
                yyrVar5.n(ayqiVar5, b5);
            }
            v.aI.d(2);
            this.l = false;
            if (q != null) {
                q.close();
            }
        } catch (Throwable th2) {
            if (q != null) {
                try {
                    q.close();
                } catch (Throwable unused) {
                }
            }
            throw th2;
        }
    }

    @Override // defpackage.ci, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amis r = this.k.r();
        try {
            boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
            r.close();
            return onCreatePanelMenu;
        } catch (Throwable th) {
            try {
                r.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        amis c = this.k.c();
        try {
            super.onDestroy();
            omq v = v();
            v.x = true;
            ooc oocVar = v.am;
            oocVar.l.n();
            oocVar.r.b(oocVar);
            oocVar.y.c();
            oocVar.x.c();
            oocVar.q.i();
            ((jgb) oocVar.n.get()).c();
            oocVar.e.i();
            v.ap.close();
            ook ookVar = v.al;
            ookVar.f.j(ookVar);
            ookVar.g.i(ookVar);
            lwt lwtVar = v.X;
            lwtVar.b.deleteObserver(lwtVar.f);
            AccessibilityStateReceiver accessibilityStateReceiver = v.V;
            accessibilityStateReceiver.a.clear();
            accessibilityStateReceiver.g();
            accessibilityStateReceiver.b.clear();
            accessibilityStateReceiver.h();
            v.c.d();
            ((ltw) v.T.get()).b();
            v.aq.c.i();
            oso osoVar = v.S;
            if (evr.bf(osoVar.f)) {
                ayrz.c((AtomicReference) osoVar.e);
                if (osoVar.a.g()) {
                    ((orx) osoVar.c.get()).b();
                    if (osoVar.b.k) {
                        final ort ortVar = (ort) osoVar.d.get();
                        if (!ortVar.e) {
                            ortVar.e = true;
                            ortVar.f = false;
                            ortVar.a.a();
                            ortVar.b.g(ortVar);
                            ortVar.g = ortVar.a.a.ax(new ayrs() { // from class: ors
                                @Override // defpackage.ayrs
                                public final void a(Object obj) {
                                    ort ortVar2 = ort.this;
                                    ortVar2.d.a();
                                    ortVar2.f = true;
                                }
                            });
                            if (ortVar.d.d() && ortVar.c.o()) {
                                ortVar.a.d();
                            }
                        }
                    }
                }
            }
            ooh oohVar = v.av;
            oohVar.c.m(oohVar.d);
            adla adlaVar = v.aC;
            adlaVar.a.j(adlaVar);
            v.s.d();
            v.aP.c();
            this.o = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ml, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        gir m;
        omq v = v();
        onm onmVar = v.an;
        aswb aswbVar = onmVar.l.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        final int i2 = 0;
        final int i3 = 1;
        if (aswbVar.br) {
            final mja mjaVar = onmVar.m;
            if (mjaVar.a.e() || mjaVar.a.d()) {
                if (i != 21) {
                    if (i != 22) {
                        if (i == 31) {
                            ((ainy) mjaVar.c.get()).C(new miz(mjaVar));
                        } else if (i != 62) {
                            if (i == 113 || i == 114) {
                                Bundle bundle = new Bundle();
                                bundle.putInt("KeyPress", i);
                                mjc mjcVar = new mjc();
                                mjcVar.af(bundle);
                                mjcVar.qh(mjaVar.g.getSupportFragmentManager(), "KeyboardShortcutsDialogFragment");
                            }
                        } else if (((ainy) mjaVar.c.get()).d()) {
                            ((aivo) mjaVar.b.get()).c();
                        } else {
                            ((aivo) mjaVar.b.get()).d();
                        }
                    } else if (keyEvent.isAltPressed()) {
                        ((ahtp) mjaVar.f.get()).b(ahyo.CHAPTER).ifPresent(new Consumer() { // from class: miy
                            @Override // j$.util.function.Consumer
                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return i3 != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
                            }

                            @Override // j$.util.function.Consumer
                            public final void accept(Object obj) {
                                if (i3 == 0) {
                                    ((aivo) mjaVar.b.get()).i(((TimelineMarker) obj).a);
                                } else {
                                    ((aivo) mjaVar.b.get()).i(((TimelineMarker) obj).a);
                                }
                            }
                        });
                    } else {
                        ((aivo) mjaVar.b.get()).g(10000L);
                    }
                } else if (keyEvent.isAltPressed()) {
                    ((ahtp) mjaVar.f.get()).c(ahyo.CHAPTER).ifPresent(new Consumer() { // from class: miy
                        @Override // j$.util.function.Consumer
                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return i2 != 0 ? Consumer.CC.$default$andThen(this, consumer) : Consumer.CC.$default$andThen(this, consumer);
                        }

                        @Override // j$.util.function.Consumer
                        public final void accept(Object obj) {
                            if (i2 == 0) {
                                ((aivo) mjaVar.b.get()).i(((TimelineMarker) obj).a);
                            } else {
                                ((aivo) mjaVar.b.get()).i(((TimelineMarker) obj).a);
                            }
                        }
                    });
                } else {
                    ((aivo) mjaVar.b.get()).g(-10000L);
                }
                return true;
            }
        }
        if (onmVar.a.hasWindowFocus()) {
            adly adlyVar = onmVar.k;
            final dd supportFragmentManager = onmVar.a.getSupportFragmentManager();
            adlm g = ((adlt) adlyVar.b.get()).g();
            if (g != null && g.a() == 1 && (i == 24 || i == 25 || i == 164)) {
                adfa adfaVar = adlyVar.c;
                ce f = supportFragmentManager.f("MdxMediaRouteControllerDialogFragment");
                if (f == null || !f.av()) {
                    final bog b = adfaVar.b();
                    adfaVar.b.post(new Runnable() { // from class: adfb
                        @Override // java.lang.Runnable
                        public final void run() {
                            bog.this.qh(supportFragmentManager, "MdxMediaRouteControllerDialogFragment");
                        }
                    });
                    return true;
                }
                return true;
            }
        }
        if (!onmVar.b().l(i, keyEvent) && (!onmVar.a().k() || !onmVar.e(i))) {
            Iterator it = ((Set) onmVar.e.get()).iterator();
            while (it.hasNext()) {
                i2 |= ((fll) it.next()).onKeyDown(i, keyEvent) ? 1 : 0;
            }
            if (i2 == 0 && ((m = onmVar.c().m()) == null || !(m instanceof KeyEvent.Callback) || !((KeyEvent.Callback) m).onKeyDown(i, keyEvent))) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        return true;
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        omq v = v();
        if (v.an.b().m(i)) {
            return true;
        }
        return super.onKeyLongPress(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        omq v = v();
        onm onmVar = v.an;
        if (onmVar.b().p(i)) {
            return true;
        }
        if (onmVar.a().k() && onmVar.e(i)) {
            return true;
        }
        Iterator it = ((Set) onmVar.e.get()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= ((fll) it.next()).onKeyUp(i, keyEvent);
        }
        if (z) {
            return true;
        }
        bue m = onmVar.c().m();
        if (m != null && (m instanceof KeyEvent.Callback) && ((KeyEvent.Callback) m).onKeyUp(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.omx, defpackage.ci, android.app.Activity
    public final void onMultiWindowModeChanged(boolean z) {
        super.onMultiWindowModeChanged(z);
        v().am.t(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amis d = this.k.d(intent);
        try {
            super.onNewIntent(intent);
            v().aj.d(intent);
            if (d != null) {
                d.close();
            }
        } catch (Throwable th) {
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml
    public final void onNightModeChanged(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.ci, android.app.Activity
    public final void onPause() {
        amis e = this.k.e();
        try {
            super.onPause();
            omq v = v();
            v.ae.a();
            okq okqVar = v.ao.a;
            if (!evr.bA()) {
                v.z();
            }
            if (e != null) {
                e.close();
            }
        } catch (Throwable th) {
            if (e != null) {
                try {
                    e.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ci, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z) {
        super.onPictureInPictureModeChanged(z);
        v().am.u(z);
    }

    @Override // defpackage.euc, defpackage.ml, android.app.Activity
    protected final void onPostCreate(Bundle bundle) {
        amis t = this.k.t();
        try {
            super.onPostCreate(bundle);
            omq v = v();
            ooc oocVar = v.am;
            kch kchVar = oocVar.F;
            euc eucVar = oocVar.a;
            View view = ((ce) kchVar.get()).O;
            if (view != null && view.getParent() == null) {
                ((ViewGroup) eucVar.findViewById(R.id.player_fragment_container)).addView(view, -1, -1);
            }
            if (oocVar.z) {
                oocVar.s.c(true);
                oocVar.A = true;
                oocVar.y(true);
                oocVar.A = false;
            }
            v.aj.c(v.a.getIntent(), bundle);
            if (t != null) {
                t.close();
            }
        } catch (Throwable th) {
            if (t != null) {
                try {
                    t.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onPostResume() {
        amis f = this.k.f();
        try {
            omq v = v();
            v.aO.d(new fep());
            super.onPostResume();
            final onv onvVar = v.aK;
            asvu asvuVar = onvVar.e.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.ci && onvVar.a.compareAndSet(false, true)) {
                asvu asvuVar2 = onvVar.e.b().e;
                if (asvuVar2 == null) {
                    asvuVar2 = asvu.a;
                }
                int i = asvuVar2.cQ;
                if (i > 0) {
                    aypy.W(1).p(wbs.K(onvVar.b.a())).z(i, TimeUnit.MILLISECONDS).ak(1L).ab(onvVar.c).ax(new ayrs() { // from class: onu
                        @Override // defpackage.ayrs
                        public final void a(Object obj) {
                            onv.this.d.h(auxs.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED);
                        }
                    });
                } else {
                    onvVar.d.h(auxs.STARTUP_SIGNAL_ACTIVITY_ONRESUME_LOADED);
                }
            }
            v.aO.d(new feq());
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        akhj a;
        akkw akkwVar;
        amis u = this.k.u();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            akhk akhkVar = v().h;
            atua b = atua.b(i);
            if (akhk.a.containsKey(b) && (akkwVar = (a = akhkVar.a(b)).d) != null) {
                if (iArr.length <= 0 || iArr[0] != 0) {
                    akkwVar.b();
                    if (!a.a.shouldShowRequestPermissionRationale(a.c)) {
                        a.d.a();
                    }
                } else {
                    akkwVar.c();
                }
                a.d = null;
            }
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.euc, defpackage.ci, android.app.Activity
    public final void onResume() {
        amis g = this.k.g();
        try {
            v().x();
            if (g != null) {
                g.close();
            }
        } catch (Throwable th) {
            if (g != null) {
                try {
                    g.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci
    public final void onResumeFragments() {
        super.onResumeFragments();
        omq v = v();
        if (evr.bA()) {
            return;
        }
        v.C();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:3:0x0006, B:5:0x0011, B:8:0x0025, B:9:0x0044, B:11:0x005a, B:12:0x0063, B:19:0x0018, B:21:0x001c, B:24:0x0039, B:27:0x003f), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(android.os.Bundle r8) {
        /*
            r7 = this;
            amhn r0 = r7.k
            amis r0 = r0.v()
            omq r1 = r7.v()     // Catch: java.lang.Throwable -> L84
            ooc r2 = r1.am     // Catch: java.lang.Throwable -> L84
            boolean r3 = r2.z     // Catch: java.lang.Throwable -> L84
            r4 = 1
            if (r3 == 0) goto L39
            boolean r3 = defpackage.aij.c()     // Catch: java.lang.Throwable -> L84
            if (r3 != 0) goto L18
            goto L25
        L18:
            boolean r3 = r2.z     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L25
            omx r3 = r2.G     // Catch: java.lang.Throwable -> L84
            boolean r3 = r3.u()     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L25
            goto L39
        L25:
            azrs r3 = r2.s     // Catch: java.lang.Throwable -> L84
            r5 = 0
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Throwable -> L84
            r3.c(r6)     // Catch: java.lang.Throwable -> L84
            r2.A = r4     // Catch: java.lang.Throwable -> L84
            okf r3 = r2.c     // Catch: java.lang.Throwable -> L84
            r3.p()     // Catch: java.lang.Throwable -> L84
            r2.A = r5     // Catch: java.lang.Throwable -> L84
            goto L44
        L39:
            boolean r2 = r2.z     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L44
            if (r8 == 0) goto L44
            java.lang.String r2 = "IS_IN_PICTURE_IN_PICTURE"
            r8.putBoolean(r2, r4)     // Catch: java.lang.Throwable -> L84
        L44:
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.bb     // Catch: java.lang.Throwable -> L84
            super.onSaveInstanceState(r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "has_handled_intent"
            onk r3 = r1.aj     // Catch: java.lang.Throwable -> L84
            boolean r3 = r3.g     // Catch: java.lang.Throwable -> L84
            r8.putBoolean(r2, r3)     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.a     // Catch: java.lang.Throwable -> L84
            boolean r2 = r2.isChangingConfigurations()     // Catch: java.lang.Throwable -> L84
            if (r2 == 0) goto L63
            java.lang.String r2 = "recreate_signed_in_state"
            ook r3 = r1.al     // Catch: java.lang.Throwable -> L84
            int r3 = r3.l     // Catch: java.lang.Throwable -> L84
            r8.putInt(r2, r3)     // Catch: java.lang.Throwable -> L84
        L63:
            lyo r2 = r1.az     // Catch: java.lang.Throwable -> L84
            r2.d(r8)     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r2 = r1.a     // Catch: java.lang.Throwable -> L84
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = r2.getSimpleName()     // Catch: java.lang.Throwable -> L84
            com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity r3 = r1.a     // Catch: java.lang.Throwable -> L84
            defpackage.akbc.w(r2, r8)     // Catch: java.lang.Throwable -> L84
            java.lang.String r2 = "IS_BACKING_FROM_OTHER_ACTIVITY"
            boolean r1 = r1.aT     // Catch: java.lang.Throwable -> L84
            r8.putBoolean(r2, r1)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L83
            r0.close()
        L83:
            return
        L84:
            r8 = move-exception
            if (r0 == 0) goto L8a
            r0.close()     // Catch: java.lang.Throwable -> L8a
        L8a:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // defpackage.euc, android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        v().G();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.euc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        amis h = this.k.h();
        try {
            v().y();
            if (h != null) {
                h.close();
            }
        } catch (Throwable th) {
            if (h != null) {
                try {
                    h.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.oon, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        amis i = this.k.i();
        try {
            super.onStop();
            omq v = v();
            v.am.q.k(1);
            v.ae.a();
            if (evr.bA()) {
                v.z();
            }
            gfo.b();
            if (i != null) {
                i.close();
            }
        } catch (Throwable th) {
            if (i != null) {
                try {
                    i.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ml
    public final boolean onSupportNavigateUp() {
        amis j = this.k.j();
        try {
            boolean onSupportNavigateUp = super.onSupportNavigateUp();
            j.close();
            return onSupportNavigateUp;
        } catch (Throwable th) {
            try {
                j.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.euc, android.app.Activity
    public final void onUserInteraction() {
        amis k = this.k.k();
        try {
            super.onUserInteraction();
            k.close();
        } catch (Throwable th) {
            try {
                k.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        final ooc oocVar = v().am;
        if (oocVar.g.l()) {
            oocVar.g.h();
        } else {
            ynm.n(oocVar.a, oocVar.g.g(((kcz) oocVar.F.get()).aT, oocVar.d.g()), llq.u, new zfi() { // from class: onz
                @Override // defpackage.zfi
                public final void a(Object obj) {
                    ooc oocVar2 = ooc.this;
                    Boolean bool = (Boolean) obj;
                    if (bool != null && bool.booleanValue() && evr.M(oocVar2.f)) {
                        oocVar2.A = true;
                        oocVar2.s.c(true);
                        oocVar2.c.i();
                        oocVar2.h.c();
                        oocVar2.v.a();
                    }
                }
            });
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Iterator it = v().aD.iterator();
        while (it.hasNext()) {
            ((zbl) it.next()).b(z);
        }
    }

    public final omq p() {
        omq omqVar = this.j;
        if (omqVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return omqVar;
    }

    public final void q() {
        if (this.j != null) {
            return;
        }
        if (!this.l) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.o && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        amil l = amjw.l("CreateComponent");
        try {
            lM();
            l.close();
            amil l2 = amjw.l("CreatePeer");
            try {
                try {
                    try {
                        Object lM = lM();
                        WatchWhileActivity fq = ((eed) lM).fq();
                        aadw aadwVar = (aadw) ((eed) lM).a.D.get();
                        aaea aaeaVar = (aaea) ((eed) lM).a.K.get();
                        ymp ympVar = (ymp) ((eed) lM).a.V.get();
                        eni eniVar = (eni) ((eed) lM).a.cL.get();
                        yxx yxxVar = (yxx) ((eed) lM).a.k.get();
                        gni gniVar = (gni) ((eed) lM).a.eA.get();
                        shf shfVar = (shf) ((eed) lM).a.g.get();
                        ypa ypaVar = (ypa) ((eed) lM).a.B.get();
                        alwk alwkVar = (alwk) ((eed) lM).e.get();
                        wjz bj = ((eed) lM).a.bj();
                        efz efzVar = ((eed) lM).a;
                        omq omqVar = new omq(fq, aadwVar, aaeaVar, ympVar, eniVar, yxxVar, gniVar, shfVar, ypaVar, alwkVar, bj, efzVar.im, efzVar.rs, efzVar.a.bu, axqq.a(((eed) lM).aj), (ajti) ((eed) lM).kg.get());
                        omqVar.c = (fxj) ((eed) lM).f196J.get();
                        omqVar.d = (SharedPreferences) ((eed) lM).a.z.get();
                        omqVar.e = ((eed) lM).a.a.P();
                        efz efzVar2 = ((eed) lM).a;
                        omqVar.f = efzVar2.a.bv;
                        omqVar.g = (fma) efzVar2.wk.get();
                        omqVar.h = (akhk) ((eed) lM).f12if.get();
                        omqVar.i = (wyz) ((eed) lM).a.eH.get();
                        omqVar.j = (wzq) ((eed) lM).a.rQ.get();
                        omqVar.k = (oor) ((eed) lM).iZ.get();
                        omqVar.l = (fxn) ((eed) lM).kh.get();
                        omqVar.m = (mkb) ((eed) lM).ki.get();
                        omqVar.n = (lza) ((eed) lM).eu.get();
                        omqVar.o = (gfi) ((eed) lM).kj.get();
                        omqVar.p = axqq.a(((eed) lM).et);
                        omqVar.q = (fzj) ((eed) lM).ej.get();
                        omqVar.r = (oeu) ((eed) lM).w.get();
                        omqVar.s = (ydq) ((eed) lM).ie.get();
                        omqVar.t = (aahd) ((eed) lM).I.get();
                        omqVar.u = ((eed) lM).hl;
                        omqVar.v = ((eed) lM).kl;
                        omqVar.w = axqq.a(((eed) lM).a.H);
                        omqVar.aW = (nbm) ((eed) lM).gh.get();
                        omqVar.z = axqq.a(((eed) lM).aG);
                        omqVar.B = axqq.a(((eed) lM).eU);
                        omqVar.C = ((eed) lM).km;
                        omqVar.D = ((eed) lM).aE();
                        omqVar.E = ((eed) lM).kn;
                        omqVar.F = (akxw) ((eed) lM).a.wb.get();
                        omqVar.G = ((eed) lM).dq;
                        omqVar.H = (xoh) ((eed) lM).gV.get();
                        omqVar.aZ = (axzg) ((eed) lM).a.kK.get();
                        efz efzVar3 = ((eed) lM).a;
                        omqVar.I = efzVar3.nz;
                        omqVar.f250J = ((eed) lM).o;
                        omqVar.K = efzVar3.jo;
                        omqVar.L = ((eed) lM).au;
                        omqVar.M = (nnb) ((eed) lM).af.get();
                        omqVar.N = ((eed) lM).a.us;
                        omqVar.O = (okf) ((eed) lM).ao.get();
                        omqVar.aX = (rxm) ((eed) lM).ei.get();
                        omqVar.P = ((eed) lM).a.a.E;
                        omqVar.Q = (lrx) ((eed) lM).ko.get();
                        omqVar.R = (aieu) ((eed) lM).gz.get();
                        omqVar.S = (oso) ((eed) lM).kq.get();
                        omqVar.T = ((eed) lM).kr;
                        omqVar.U = (lyj) ((eed) lM).ks.get();
                        omqVar.V = (AccessibilityStateReceiver) ((eed) lM).an.get();
                        omqVar.W = ((eed) lM).a.lF;
                        omqVar.X = (lwt) ((eed) lM).kt.get();
                        omqVar.Y = (ScheduledExecutorService) ((eed) lM).a.f.get();
                        omqVar.Z = (ayqi) ((eed) lM).a.aq.get();
                        omqVar.aa = (env) ((eed) lM).a.wr.get();
                        omqVar.ab = (lrr) ((eed) lM).ku.get();
                        omqVar.ac = ((eed) lM).a.kp;
                        omqVar.ad = (fxb) ((eed) lM).kw.get();
                        omqVar.ae = (fcw) ((eed) lM).iW.get();
                        omqVar.aU = (lso) ((eed) lM).dS.get();
                        omqVar.af = (agdi) ((eed) lM).dE.get();
                        omqVar.ag = axqq.a(((eed) lM).a.wz);
                        omqVar.ah = (onr) ((eed) lM).ky.get();
                        omqVar.aj = (onk) ((eed) lM).je.get();
                        omqVar.ak = (ony) ((eed) lM).E.get();
                        omqVar.al = (ook) ((eed) lM).jb.get();
                        omqVar.am = (ooc) ((eed) lM).af.get();
                        omqVar.an = (onm) ((eed) lM).eN.get();
                        omqVar.ao = (omy) ((eed) lM).iX.get();
                        omqVar.ap = (oom) ((eed) lM).kz.get();
                        omqVar.aq = (ont) ((eed) lM).kB.get();
                        omqVar.ar = (ong) ((eed) lM).ga.get();
                        omqVar.as = (nys) ((eed) lM).dX.get();
                        omqVar.at = (omw) ((eed) lM).ex.get();
                        omqVar.au = (nka) ((eed) lM).aH.get();
                        omqVar.av = (ooh) ((eed) lM).kC.get();
                        omqVar.aw = (lut) ((eed) lM).aE.get();
                        omqVar.ax = (zaz) ((eed) lM).B.get();
                        omqVar.ay = (lwy) ((eed) lM).kD.get();
                        omqVar.az = (lyo) ((eed) lM).kE.get();
                        omqVar.aA = (aczi) ((eed) lM).a.a.bE.get();
                        ((eed) lM).D();
                        omqVar.aB = (oki) ((eed) lM).kF.get();
                        omqVar.aC = new adla((afte) ((eed) lM).a.dx.get(), (adlt) ((eed) lM).a.ja.get(), (acxi) ((eed) lM).a.bg.get());
                        omqVar.aD = amsx.s((zbl) ((eed) lM).B.get(), (zbl) ((eed) lM).ap.get());
                        omqVar.aE = (ool) ((eed) lM).ar.get();
                        omqVar.aF = (gni) ((eed) lM).a.eA.get();
                        omqVar.aG = (gnf) ((eed) lM).a.ny.get();
                        omqVar.aH = (ajdh) ((eed) lM).cG.get();
                        omqVar.ba = gfw.E();
                        omqVar.aY = new esv();
                        omqVar.aI = (yys) ((eed) lM).a.X.get();
                        omqVar.aJ = (fgb) ((eed) lM).hL.get();
                        axpg a = axqq.a(((eed) lM).jz);
                        axpg a2 = axqq.a(((eed) lM).iE);
                        axpg a3 = axqq.a(((eed) lM).kI);
                        aadw aadwVar2 = (aadw) ((eed) lM).a.D.get();
                        ayqi ayqiVar = (ayqi) ((eed) lM).a.im.get();
                        asvu asvuVar = aadwVar2.b().e;
                        if (asvuVar == null) {
                            asvuVar = asvu.a;
                        }
                        if (asvuVar.cd) {
                            StartupSignalStream startupSignalStream = (StartupSignalStream) a.get();
                            yqw yqwVar = (yqw) a2.get();
                            Set<okl> set = (Set) a3.get();
                            ayqw ayqwVar = new ayqw();
                            EnumMap enumMap = new EnumMap(auxs.class);
                            for (okl oklVar : set) {
                                Set set2 = (Set) enumMap.get(auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED);
                                if (set2 == null) {
                                    set2 = new HashSet();
                                    enumMap.put((EnumMap) auxs.STARTUP_SIGNAL_FIRST_THUMBNAIL_LOADED, (auxs) set2);
                                }
                                set2.add(oklVar);
                            }
                            for (final Map.Entry entry : enumMap.entrySet()) {
                                ayqwVar.d(startupSignalStream.g().p(wbs.K(yqwVar.a())).L(new ayrw() { // from class: okk
                                    @Override // defpackage.ayrw
                                    public final boolean a(Object obj) {
                                        return ((auxs) obj).equals(entry.getKey());
                                    }
                                }).j().z(ayqiVar).U(new ayrs() { // from class: okj
                                    @Override // defpackage.ayrs
                                    public final void a(Object obj) {
                                        for (okl oklVar2 : (Set) entry.getValue()) {
                                            asvu asvuVar2 = oklVar2.c.b().e;
                                            if (asvuVar2 == null) {
                                                asvuVar2 = asvu.a;
                                            }
                                            if (asvuVar2.cd) {
                                                oklVar2.a.pE((aivf[]) oklVar2.b.get());
                                            }
                                        }
                                    }
                                }));
                            }
                        }
                        axqq.a(((eed) lM).a.xR);
                        omqVar.aK = (onv) ((eed) lM).kJ.get();
                        omqVar.aL = (ond) ((eed) lM).jy.get();
                        this.j = omqVar;
                        l2.close();
                        this.j.bb = this;
                    } catch (Throwable th) {
                        th = th;
                        Throwable th2 = th;
                        try {
                            l2.close();
                            throw th2;
                        } catch (Throwable unused) {
                            throw th2;
                        }
                    }
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } finally {
        }
    }

    @Override // defpackage.omx
    protected final void r(boolean z) {
        v().am.g.j(z);
    }

    public final void s() {
        super.onResume();
    }

    @Override // defpackage.euc, defpackage.zv, android.app.Activity
    public final void startActivityForResult(Intent intent, int i, Bundle bundle) {
        super.startActivityForResult(intent, i, bundle);
        v().aT = true;
    }

    public final void t() {
        super.onStart();
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, Configuration configuration) {
        omq v = v();
        v.aE.a(configuration);
        v.am.u(z);
    }
}
