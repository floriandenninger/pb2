package defpackage;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Property;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigationbar.NavigationBarDividerLayout;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
import com.google.android.apps.youtube.app.watchwhile.MdxMainController;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
import com.google.android.libraries.quantum.fab.FloatingActionButton;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.libraries.youtube.account.identity.C$AutoValue_AccountIdentity;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class omq extends omr implements gbf, fxl, ooq, alxs, ypd {
    public ViewGroup A;
    public axpg B;
    public azrw C;
    public gbh D;
    public azrw E;
    public akxw F;
    public azrw G;
    public xoh H;
    public azrw I;

    /* renamed from: J, reason: collision with root package name */
    public azrw f250J;
    public azrw K;
    public azrw L;
    public nnb M;
    public azrw N;
    public okf O;
    public azrw P;
    public lrx Q;
    public aieu R;
    public oso S;
    public azrw T;
    public lyj U;
    public AccessibilityStateReceiver V;
    public azrw W;
    public lwt X;
    public ScheduledExecutorService Y;
    public ayqi Z;
    public final WatchWhileActivity a;
    public aczi aA;
    public oki aB;
    public adla aC;
    public Set aD;
    public ool aE;
    public gni aF;
    public gnf aG;
    public ajdh aH;
    public yys aI;
    public fgb aJ;
    public onv aK;
    public ond aL;
    public final eni aM;
    public final yxx aN;
    public final ypa aO;
    public final ayqw aP;
    public final azrw aQ;
    public final yyr aR;
    public final ajti aS;
    public boolean aT;
    public lso aU;
    public final aadw aV;
    public nbm aW;
    public rxm aX;
    public esv aY;
    public axzg aZ;
    public env aa;
    public lrr ab;
    public azrw ac;
    public fxb ad;
    public fcw ae;
    public agdi af;
    public axpg ag;
    public onr ah;
    public nmt ai;
    public onk aj;
    public ony ak;
    public ook al;
    public ooc am;
    public onm an;
    public omy ao;
    public oom ap;
    public ont aq;
    public ong ar;
    public nys as;
    public omw at;
    public nka au;
    public ooh av;
    public lut aw;
    public zaz ax;
    public lwy ay;
    public lyo az;
    public long b;
    public lkb ba;
    private final aaea bc;
    private final ymp bd;
    private final gng be;
    private final alwk bf;
    private final wjz bg;
    private final azrw bh;
    private final azrw bi;
    private final boolean bj;
    private final axpg bk;
    public fxj c;
    public SharedPreferences d;
    public String e;
    public azrw f;
    public fma g;
    public akhk h;
    public wyz i;
    public wzq j;
    public oor k;
    public fxn l;
    public mkb m;
    public lza n;
    public gfi o;
    public axpg p;
    public fzj q;
    public oeu r;
    public ydq s;
    public aahd t;
    public azrw u;
    public azrw v;
    public axpg w;
    public boolean x;
    public boolean y;
    public axpg z;

    public omq(WatchWhileActivity watchWhileActivity, aadw aadwVar, aaea aaeaVar, ymp ympVar, eni eniVar, yxx yxxVar, gni gniVar, final shf shfVar, ypa ypaVar, alwk alwkVar, wjz wjzVar, azrw azrwVar, azrw azrwVar2, azrw azrwVar3, axpg axpgVar, ajti ajtiVar) {
        usw uswVar = usw.a;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (uqq.n() && uswVar.c > 0 && elapsedRealtime <= SystemClock.elapsedRealtime() && ((uswVar.n.b == null || elapsedRealtime <= uswVar.n.b.longValue()) && uswVar.f == 0)) {
            uswVar.f = elapsedRealtime;
            uswVar.m.f = true;
        }
        watchWhileActivity.addOnContextAvailableListener(new aab() { // from class: omg
            @Override // defpackage.aab
            public final void a(Context context) {
                omq.this.b = shfVar.d();
            }
        });
        this.a = watchWhileActivity;
        this.aV = aadwVar;
        this.bc = aaeaVar;
        this.bd = ympVar;
        this.aM = eniVar;
        this.aN = yxxVar;
        this.aO = ypaVar;
        gng a = gniVar.a();
        this.be = a;
        this.bf = alwkVar;
        this.bg = wjzVar;
        this.bh = azrwVar;
        this.bi = azrwVar2;
        this.aQ = azrwVar3;
        this.bk = axpgVar;
        this.aS = ajtiVar;
        this.aP = new ayqw();
        if (!alyh.c()) {
            Intent intent = watchWhileActivity.getIntent();
            if (!intent.hasCategory("android.intent.category.LAUNCHER") && (intent.getFlags() & 268468224) == 0 && intent.getExtras() != null && !intent.getExtras().isEmpty()) {
                ((amxh) ((amxh) alyh.a.g()).i("com/google/apps/tiktok/account/api/controller/Config", "forLauncherActivity", 58, "Config.java")).s("Launcher config used on invalid activity: %s", watchWhileActivity.getClass());
            }
        }
        alyg a2 = alyh.a();
        a2.c(true);
        a2.b(wkc.class);
        alwkVar.a(a2.a()).c(this);
        watchWhileActivity.supportRequestWindowFeature(9);
        boolean aB = evr.aB(aadwVar);
        boolean ag = evr.ag(aaeaVar.a());
        gng gngVar = gng.LIGHT;
        int ordinal = a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (ag && aB) {
                    watchWhileActivity.setTheme(R.style.Theme_YouTube_Dark_Home_RemoveStatusBackground_WithTouchFeedback);
                } else if (ag) {
                    watchWhileActivity.setTheme(R.style.Theme_YouTube_Dark_Home_RemoveStatusBackground);
                } else if (aB) {
                    watchWhileActivity.setTheme(R.style.Theme_YouTube_Dark_Home_TouchFeedback);
                } else {
                    watchWhileActivity.setTheme(R.style.Theme_YouTube_Dark_Home);
                }
            }
        } else if (ag && aB) {
            watchWhileActivity.setTheme(R.style.Theme_YouTube_Home_RemoveStatusBackground_WithTouchFeedback);
        } else if (ag) {
            watchWhileActivity.setTheme(R.style.Theme_YouTube_Home_RemoveStatusBackground);
        } else if (aB) {
            watchWhileActivity.setTheme(R.style.Theme_YouTube_Home_TouchFeedback);
        } else {
            watchWhileActivity.setTheme(R.style.Theme_YouTube_Home);
        }
        h();
        boolean z = (yxxVar.f(yxx.E) & 4194304) != 0;
        this.bj = z;
        this.aR = z ? eniVar.h : null;
    }

    private final void H() {
        Intent a;
        avdj avdjVar = this.aV.b().u;
        if (avdjVar == null) {
            avdjVar = avdj.a;
        }
        long j = avdjVar.t;
        if (j != 1) {
            if (j == 2) {
                ayqw ayqwVar = this.aP;
                final enp enpVar = (enp) this.aQ.get();
                if (!enpVar.e) {
                    enpVar.f = ayqj.p(new ayql() { // from class: eno
                        @Override // defpackage.ayql
                        public final void a(final azmi azmiVar) {
                            final enp enpVar2 = enp.this;
                            if (!((zfy) enpVar2.d.get()).e("failsafe_enable_gms_device_compliance_check", true)) {
                                azmiVar.c(false);
                                return;
                            }
                            avdj avdjVar2 = enpVar2.g.b().u;
                            if (avdjVar2 == null) {
                                avdjVar2 = avdj.a;
                            }
                            if (!avdjVar2.p) {
                                azmiVar.c(false);
                                return;
                            }
                            rpt b = ((qyk) enpVar2.a.get()).b();
                            b.o(enpVar2.b, new rpl() { // from class: enm
                                @Override // defpackage.rpl
                                public final void c(Exception exc) {
                                    enp enpVar3 = enp.this;
                                    azmiVar.c(false);
                                    afsi.c(2, 27, "Failed GmsDeviceCompliance check", exc);
                                    enpVar3.a(arbx.GMS_DEVICE_CHECK_TYPE_FAILED);
                                }
                            });
                            b.p(enpVar2.b, new rpo() { // from class: enn
                                @Override // defpackage.rpo
                                public final void d(Object obj) {
                                    enp enpVar3 = enp.this;
                                    qyf qyfVar = (qyf) obj;
                                    azmiVar.c(Boolean.valueOf(qyfVar.a()));
                                    if (qyfVar.a()) {
                                        enpVar3.a(arbx.GMS_DEVICE_CHECK_TYPE_SUCCESS);
                                    }
                                }
                            });
                        }
                    }).M(enpVar.c).m();
                    enpVar.e = true;
                }
                ayqwVar.d(enpVar.f.I((ayqi) this.bh.get()).V(new ayrs() { // from class: omi
                    @Override // defpackage.ayrs
                    public final void a(Object obj) {
                        Intent intent;
                        Intent a2;
                        omq omqVar = omq.this;
                        if (((Boolean) obj).booleanValue()) {
                            enp enpVar2 = (enp) omqVar.aQ.get();
                            WatchWhileActivity watchWhileActivity = omqVar.a;
                            qyu a3 = UncertifiedDeviceActivity.a(watchWhileActivity);
                            Uri parse = Uri.parse("https://m.youtube.com");
                            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
                            intent2.addCategory("android.intent.category.BROWSABLE");
                            String packageName = watchWhileActivity.getPackageName();
                            Iterator<ResolveInfo> it = watchWhileActivity.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    intent = null;
                                    break;
                                }
                                ActivityInfo activityInfo = it.next().activityInfo;
                                if (!packageName.equals(activityInfo.packageName)) {
                                    intent = new Intent("android.intent.action.VIEW", parse);
                                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                                    break;
                                }
                            }
                            if (intent != null) {
                                a3.b(watchWhileActivity.getString(R.string.redirect_to_mobile_web), intent);
                                a2 = a3.a();
                                a2.putExtra("ShowMwebButton", true);
                            } else {
                                afsi.b(1, 27, "No Browser to handle MWEB url");
                                enpVar2.a(arbx.GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER);
                                a2 = a3.a();
                                a2.putExtra("ShowMwebButton", false);
                            }
                            a2.setFlags(268468224);
                            ((ainy) omqVar.f250J.get()).J();
                            omqVar.a.moveTaskToBack(true);
                            omqVar.a.startActivity(a2);
                            omqVar.a.finish();
                        }
                    }
                }));
                return;
            }
            return;
        }
        enl enlVar = (enl) this.bi.get();
        WatchWhileActivity watchWhileActivity = this.a;
        Intent intent = null;
        if (enlVar.a.get()) {
            qyu a2 = UncertifiedDeviceActivity.a(watchWhileActivity);
            Uri parse = Uri.parse("https://m.youtube.com");
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://*"));
            intent2.addCategory("android.intent.category.BROWSABLE");
            String packageName = watchWhileActivity.getPackageName();
            Iterator<ResolveInfo> it = watchWhileActivity.getPackageManager().queryIntentActivities(intent2, 65536).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (!packageName.equals(activityInfo.packageName)) {
                    intent = new Intent("android.intent.action.VIEW", parse);
                    intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
                    break;
                }
            }
            if (intent != null) {
                a2.b(watchWhileActivity.getString(R.string.redirect_to_mobile_web), intent);
                a = a2.a();
                a.putExtra("ShowMwebButton", true);
            } else {
                afsi.b(1, 27, "No Browser to handle MWEB url");
                enlVar.b(arbx.GMS_DEVICE_CHECK_TYPE_SUCCESS_NO_BROWSER);
                a = a2.a();
                a.putExtra("ShowMwebButton", false);
            }
            intent = a;
            intent.setFlags(268435456);
        }
        if (intent != null) {
            ((ainy) this.f250J.get()).J();
            this.a.startActivity(intent);
            this.a.finish();
        }
    }

    public final void A() {
        asvu asvuVar = this.aZ.b.b().e;
        if (asvuVar == null) {
            asvuVar = asvu.a;
        }
        if (asvuVar.ck) {
            ((jnr) this.I.get()).a();
        }
    }

    public final void C() {
        AccountIdentity accountIdentity;
        String string;
        this.aW.a(false);
        if (this.ak.r() == null && !this.aX.a) {
            ony onyVar = this.ak;
            lkb lkbVar = this.ba;
            Bundle a = PaneDescriptor.a();
            a.putInt("network_connectivity_requirement", 1);
            onyVar.v(new PaneDescriptor(lkbVar.a, a), 2);
        }
        h();
        ook ookVar = this.al;
        String d = ookVar.d.c().d();
        String str = ookVar.m;
        boolean z = (str == null || str.equals(d)) ? false : true;
        ookVar.m = d;
        if (!ookVar.d(z, null)) {
            wdj wdjVar = ookVar.e;
            if (!wdjVar.a.t()) {
                wdd wddVar = wdjVar.a;
                if (wddVar instanceof wcx) {
                    wcx wcxVar = (wcx) wddVar;
                    if (wcxVar.e() == 1) {
                        if (wcxVar.e() != 1 || (string = wcxVar.a.getString(wcy.ACCOUNT_NAME, null)) == null) {
                            accountIdentity = null;
                        } else {
                            String string2 = wcxVar.a.getString(wcy.PAGE_ID, null);
                            StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            if (string2 != null) {
                                sb.append(":");
                                sb.append(string2);
                            }
                            String sb2 = sb.toString();
                            if (true == "No +Page Delegate".equals(string2)) {
                                string2 = "";
                            }
                            accountIdentity = AccountIdentity.n(sb2, string, string2, null);
                        }
                        if (accountIdentity != null) {
                            wdjVar.c.a(accountIdentity, new wdi(accountIdentity, new wdf(wdjVar, accountIdentity)), ((C$AutoValue_AccountIdentity) accountIdentity).b, 6);
                        }
                    }
                }
            }
            ookVar.l = 0;
            ((fzb) ookVar.k.get()).j();
            if (!evr.aT(ookVar.o)) {
                ookVar.c.c(ookVar.a, null, null);
            } else {
                ((ejl) ookVar.i.get()).e();
            }
        }
        if (ookVar.e.a()) {
            wdj wdjVar2 = ookVar.e;
            if (wdjVar2.a()) {
                AccountIdentity accountIdentity2 = (AccountIdentity) wdjVar2.a.c();
                String d2 = accountIdentity2.d();
                String a2 = accountIdentity2.a();
                wdjVar2.c.a(AccountIdentity.t(a2), new wdh(d2, new wdg(wdjVar2)), a2, 6);
            }
        }
        final wdj wdjVar3 = ookVar.e;
        if (wdjVar3.a.t()) {
            wdjVar3.e.execute(new Runnable() { // from class: wde
                @Override // java.lang.Runnable
                public final void run() {
                    wdj wdjVar4 = wdj.this;
                    afsx c = wdjVar4.a.c();
                    if (c instanceof AccountIdentity) {
                        try {
                            if (wkk.c(((AccountIdentity) c).a(), wdjVar4.f.h())) {
                            } else {
                                wdjVar4.g.l("Current signed in account not available on device anymore", false);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            });
        }
        if (ookVar.d.c().g()) {
            aswb aswbVar = ookVar.h.a().e;
            if (aswbVar == null) {
                aswbVar = aswb.a;
            }
            if (aswbVar.o) {
                ookVar.f.e(null);
            }
        }
        ookVar.j.a();
        String str2 = (String) this.f.get();
        boolean b = amkq.b(this.e, str2);
        this.e = str2;
        if (!b) {
            this.ak.o();
        }
        ((fzb) this.p.get()).j();
        this.c.e();
        h();
        ooc oocVar = this.am;
        ((jgb) oocVar.n.get()).e();
        fhd fhdVar = oocVar.B;
        if (fhdVar != null) {
            oocVar.g(fhdVar);
        }
    }

    public final void D() {
        ((fzb) this.p.get()).o();
    }

    public final boolean E() {
        return this.aW.b();
    }

    @Override // defpackage.ooq
    public final void F() {
        this.ak.a.z();
    }

    public final void G() {
        this.q.a();
    }

    @Override // defpackage.alxs
    public final void a(alxq alxqVar) {
        this.bg.b(2, 2, 2);
    }

    @Override // defpackage.alxs
    public final void b(Throwable th) {
        if ((th instanceof alwx) && (th.getCause() instanceof wkd)) {
            this.bg.b(2, 3, 8);
            this.bf.b(amru.r(wkc.class));
        }
        if (th instanceof alww) {
            this.bg.b(2, 3, 9);
            this.bf.b(amru.r(wkc.class));
        }
        if (th instanceof alwy) {
            afsi.c(2, 25, "[Clockwork][WatchWhileActivityPeer] onAccountError()", th);
            final wjz wjzVar = this.bg;
            wjzVar.c.execute(new Runnable() { // from class: wjy
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    wjz wjzVar2 = wjz.this;
                    afsx c = wjzVar2.a.c();
                    amru w = wjzVar2.b.w();
                    if ("youtube-direct".equals(whu.i(c))) {
                        amvj amvjVar = (amvj) w;
                        int i2 = amvjVar.c;
                        boolean z = false;
                        for (int i3 = 0; i3 < i2; i3++) {
                            z |= c.b().equals(((alym) w.get(i3)).c);
                        }
                        if (z) {
                            i = 13;
                        } else if (w.isEmpty()) {
                            i = 10;
                        } else {
                            i = amvjVar.c == 1 ? 11 : 12;
                        }
                    } else if ("youtube-delegated".equals(whu.i(c))) {
                        i = 14;
                    } else {
                        i = "youtube-incognito".equals(whu.i(c)) ? 15 : 16;
                    }
                    wjzVar2.b(2, 3, i);
                }
            });
        }
        this.bg.c(2, th);
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void c() {
    }

    @Override // defpackage.alxs
    public final /* synthetic */ void d() {
        alta.y(this);
    }

    @Override // defpackage.fxl
    public final void e(int i) {
        if (this.x) {
            return;
        }
        this.D.h(i);
        this.o.h(0, i);
        this.O.s(0, -i);
        ViewGroup viewGroup = this.A;
        if (viewGroup != null && viewGroup.getPaddingBottom() != i) {
            ViewGroup viewGroup2 = this.A;
            viewGroup2.setPadding(viewGroup2.getPaddingLeft(), this.A.getPaddingTop(), this.A.getPaddingRight(), i);
        }
        ((jgb) this.B.get()).f(i);
    }

    public final acra g() {
        gir l;
        return this.am.i() ? this.am.m : (this.ak.m() == null || (l = this.ak.l()) == null) ? acra.l : l.mM();
    }

    public final void h() {
        this.bd.a();
    }

    public final void i() {
        if (this.be != this.aF.a()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final WatchWhileActivity watchWhileActivity = this.a;
            watchWhileActivity.getClass();
            handler.postAtFrontOfQueue(new Runnable() { // from class: omj
                @Override // java.lang.Runnable
                public final void run() {
                    WatchWhileActivity.this.recreate();
                }
            });
        }
    }

    public final void j() {
        Iterator it = frx.a.keySet().iterator();
        while (it.hasNext()) {
            ((frx) it.next()).a();
        }
        ((lyp) this.u.get()).h();
        ((lyp) this.v.get()).h();
        this.aU.a();
        this.af.a();
        this.a.closeOptionsMenu();
    }

    public final void k() {
        this.D.d((BottomUiContainer) this.a.findViewById(R.id.bottom_ui_container));
        this.D.i(this);
        final fxn fxnVar = this.l;
        View findViewById = this.a.findViewById(R.id.bottom_bar_container);
        findViewById.getClass();
        fxnVar.b = findViewById;
        fxnVar.b.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: fxm
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                fxn fxnVar2 = fxn.this;
                int i9 = i4 - i2;
                if (i9 == i8 - i6 || fxnVar2.b == null) {
                    return;
                }
                Iterator it = fxnVar2.a.iterator();
                while (it.hasNext()) {
                    ((fxl) it.next()).e(i9);
                }
            }
        });
        this.l.a(this);
        fav.u(this.a, true);
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{fdl.class, izk.class, yro.class, afto.class, ahcu.class};
        }
        if (i == 0) {
            if (!this.y) {
                return null;
            }
            this.a.getWindow().getDecorView().requestLayout();
            this.y = false;
            return null;
        }
        if (i == 1) {
            izk izkVar = (izk) obj;
            autq autqVar = izkVar.b().b;
            if (autqVar == null) {
                autqVar = autq.a;
            }
            if ((autqVar.b & 1) == 0) {
                return null;
            }
            WatchWhileActivity watchWhileActivity = this.a;
            autq autqVar2 = izkVar.b().b;
            if (autqVar2 == null) {
                autqVar2 = autq.a;
            }
            aqdt aqdtVar = autqVar2.c;
            if (aqdtVar == null) {
                aqdtVar = aqdt.a;
            }
            ajdf.m(watchWhileActivity, aqdtVar, this.t, g(), this.aH);
            return null;
        }
        if (i == 2) {
            ((fzb) this.p.get()).j();
            return null;
        }
        if (i == 3) {
            this.D.c(true);
            return null;
        }
        if (i == 4) {
            if (!((ahcu) obj).a()) {
                return null;
            }
            hd.d(this.a, ((hn) this.K.get()).c);
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final void l() {
        this.H.h = new omn(this);
    }

    public final void m() {
        gfi gfiVar = this.o;
        View findViewById = this.a.findViewById(R.id.accessibility_layer_container);
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.a.findViewById(R.id.fab);
        if (gfiVar.l) {
            return;
        }
        gfiVar.l = true;
        amkq.N(whu.M(findViewById, floatingActionButton));
        gfiVar.i = new gey(gfiVar.a, floatingActionButton, gfiVar);
        gfl gflVar = new gfl(floatingActionButton, findViewById, gfiVar);
        gflVar.a.c = gflVar;
        gfiVar.j = gflVar;
        floatingActionButton.getClass();
        gfiVar.d = floatingActionButton;
        gfiVar.d.setOnClickListener(gfiVar);
        ObjectAnimator duration = ObjectAnimator.ofPropertyValuesHolder(gfiVar.d, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f)).setDuration(150L);
        duration.addListener(new gff(gfiVar));
        gfiVar.g = duration;
        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(gfiVar.d, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 0.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 0.0f)).setDuration(150L);
        duration2.addListener(new gfg(gfiVar));
        gfiVar.h = duration2;
        gfiVar.e();
    }

    public final void n() {
        ong ongVar = this.ar;
        ongVar.b = ongVar.a.getWindow().getAttributes().softInputMode;
        ongVar.c = true;
    }

    public final void o() {
        this.k.e(this);
        PivotBar pivotBar = (PivotBar) this.a.findViewById(R.id.pivot_bar);
        pivotBar.g = this.m;
        this.k.j(pivotBar);
    }

    public final void p() {
        lwt lwtVar = this.X;
        lwtVar.b.addObserver(lwtVar.f);
    }

    public final void q() {
        this.a.setDefaultKeyMode(0);
    }

    public final void r() {
        ((akcy) this.bk.get()).g(this.a.findViewById(android.R.id.content));
    }

    public final void s() {
        this.a.setContentView((View) this.z.get());
        this.ax.h((View) this.z.get(), 7);
        this.a.findViewById(R.id.slim_status_bar_player_container).setBackground(this.at.a);
        View findViewById = ((ViewGroup) this.z.get()).findViewById(R.id.next_gen_watch_container_layout);
        WatchWhileActivity watchWhileActivity = this.a;
        watchWhileActivity.getClass();
        AccessibilityLayerLayout q = fav.q(watchWhileActivity);
        if (q != null) {
            if (findViewById == null || !whu.M(q, findViewById)) {
                q.b(false);
            } else {
                q.a = findViewById.getId();
                q.c = findViewById;
                q.b(true);
            }
        }
        this.a.getWindow().setBackgroundDrawable(null);
        final onr onrVar = this.ah;
        if (!onrVar.i) {
            onrVar.i = true;
            onrVar.e.b = (NavigationBarDividerLayout) onrVar.a.findViewById(R.id.navigation_bar_divider_frame);
            gjl gjlVar = onrVar.e;
            if (gjl.a) {
                onrVar.g.f(new Callable() { // from class: onq
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        final onr onrVar2 = onr.this;
                        aypy h = onrVar2.c.h();
                        aypy aj = onrVar2.b.h().aj(ohs.f);
                        azrh a = onrVar2.d.a();
                        aypy d = ((nka) onrVar2.f.get()).d();
                        aypy aypyVar = onrVar2.j.a;
                        aysw.b(h, "source1 is null");
                        aysw.b(a, "source3 is null");
                        return aypy.n(new ayqb[]{h, aj, a, d, aypyVar}, new aysh(1), aypn.a).ax(new ayrs() { // from class: onp
                            @Override // defpackage.ayrs
                            public final void a(Object obj) {
                                onr onrVar3 = onr.this;
                                gaj gajVar = gaj.ACTIVITY_DEFAULT;
                                int ordinal = ((gaj) obj).ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        return;
                                    }
                                    if (evr.ae(onrVar3.h.a())) {
                                        onrVar3.e.b(onrVar3.a, R.style.NavigationBar_Dark_RemoveNavDivider);
                                        return;
                                    } else {
                                        onrVar3.e.b(onrVar3.a, R.style.NavigationBar_Dark);
                                        return;
                                    }
                                }
                                if (evr.ae(onrVar3.h.a())) {
                                    gni K = ((gnj) alta.t(onrVar3.a, gnj.class)).K();
                                    if (K.a() == gng.LIGHT) {
                                        onrVar3.e.b(onrVar3.a, R.style.NavigationBar_Light_RemoveNavDivider);
                                        return;
                                    } else {
                                        if (K.a() == gng.DARK) {
                                            onrVar3.e.b(onrVar3.a, R.style.NavigationBar_Dark_RemoveNavDivider);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                gjl gjlVar2 = onrVar3.e;
                                Activity activity = onrVar3.a;
                                if (gjl.a) {
                                    TypedArray obtainStyledAttributes = activity.obtainStyledAttributes(null, gjm.b, R.attr.navigationBarStyle, R.style.NavigationBar);
                                    gjlVar2.a(obtainStyledAttributes);
                                    obtainStyledAttributes.recycle();
                                }
                            }
                        });
                    }
                });
            }
        }
        lut lutVar = this.aw;
        View view = (View) this.z.get();
        nka nkaVar = this.au;
        lutVar.c = view;
        lutVar.d = nkaVar;
        WatchWhileActivity watchWhileActivity2 = this.a;
        View view2 = (View) this.z.get();
        view2.getViewTreeObserver().addOnPreDrawListener(new omp(watchWhileActivity2, view2));
    }

    public final void t(Bundle bundle, long j) {
        fcw fcwVar = this.ae;
        if (bundle != null) {
            fcwVar.b();
        } else {
            fcwVar.a.d(new feo(j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void u() {
        super.x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void v() {
        super.y();
    }

    public final void w() {
        ojb ojbVar;
        nqp nqpVar;
        final onm onmVar = this.an;
        if (((nko) onmVar.b.get()).e() || onmVar.b().k()) {
            return;
        }
        if (onmVar.h.j()) {
            mwt mwtVar = onmVar.h;
            if (mwtVar.e) {
                mwtVar.a();
                return;
            }
        }
        if (onmVar.a instanceof oon) {
            KeyEvent.Callback findViewById = ((euc) ((MdxMainController) onmVar.n.get()).l.get()).findViewById(R.id.mdx_drawer_layout);
            if (findViewById instanceof jfr) {
                jfr jfrVar = (jfr) findViewById;
                if (jfrVar.a().a()) {
                    jfrVar.c();
                    return;
                }
            }
        }
        onmVar.r.a();
        boolean z = onmVar.p;
        fhg g = onmVar.g.g();
        if (g.g()) {
            ((ahos) onmVar.c.get()).c();
            return;
        }
        if (g == fhg.WATCH_WHILE_MAXIMIZED && (ojbVar = onmVar.d.a) != null && (nqpVar = ((DefaultWatchPanelViewController) ojbVar).e) != null && nqpVar.x()) {
            nqpVar.l();
            return;
        }
        if (g.i() && z) {
            onmVar.a.finish();
            return;
        }
        final int i = 1;
        if (g.b()) {
            onmVar.f.j(true);
            return;
        }
        if (g == fhg.WATCH_WHILE_MAXIMIZED) {
            onmVar.f.m(true);
            return;
        }
        if (onmVar.o.h()) {
            return;
        }
        gir m = onmVar.c().m();
        if (m == null || !m.bf()) {
            if (onmVar.p) {
                onmVar.a.finish();
                return;
            }
            int i2 = onmVar.c().c;
            final int i3 = 0;
            onmVar.c().t(4);
            boolean I = onmVar.i.I();
            onmVar.c().c = i2;
            if (I) {
                return;
            }
            if (!onmVar.j.l()) {
                ynm.n(onmVar.a, onmVar.j.g(((kcz) onmVar.q.get()).aT, onmVar.g.g()), new zfi() { // from class: onl
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i3 == 0) {
                            onm onmVar2 = onmVar;
                            zga.d("Picture-in-picture mode request failed. Finishing the app.", (Throwable) obj);
                            onmVar2.d();
                        } else {
                            onm onmVar3 = onmVar;
                            if (((Boolean) obj).booleanValue()) {
                                return;
                            }
                            onmVar3.d();
                        }
                    }
                }, new zfi() { // from class: onl
                    @Override // defpackage.zfi
                    public final void a(Object obj) {
                        if (i == 0) {
                            onm onmVar2 = onmVar;
                            zga.d("Picture-in-picture mode request failed. Finishing the app.", (Throwable) obj);
                            onmVar2.d();
                        } else {
                            onm onmVar3 = onmVar;
                            if (((Boolean) obj).booleanValue()) {
                                return;
                            }
                            onmVar3.d();
                        }
                    }
                });
            } else {
                onmVar.j.h();
                onmVar.d();
            }
        }
    }

    @Override // defpackage.omr
    public final void x() {
        yyr yyrVar;
        this.aI.h(4);
        try {
            if (!this.bj || (yyrVar = this.aR) == null) {
                this.as.i(this.aT);
                this.aT = false;
                this.ae.c();
                super.x();
                if (!evr.bA()) {
                    B();
                }
                this.j.a();
                this.am.v();
            } else {
                ayqi ayqiVar = this.Z;
                yyq b = yyr.b(6);
                b.a("bfa", new omh(this, 9));
                yyrVar.n(ayqiVar, b);
                this.aT = false;
                yyr yyrVar2 = this.aR;
                ayqi ayqiVar2 = this.Z;
                yyq b2 = yyr.b(6);
                b2.a("ior", new omh(this, 10));
                b2.a("sor", new omh(this, 11));
                b2.c("ros", new omk(this, 6), true ^ evr.bA());
                b2.a("cdb", new omh(this, 12));
                b2.a("wpr", new omh(this, 13));
                yyrVar2.n(ayqiVar2, b2);
            }
        } finally {
            this.aI.d(4);
        }
    }

    @Override // defpackage.omr
    public final void y() {
        yys yysVar;
        yyr yyrVar;
        this.aI.h(3);
        try {
            if (!this.bj || (yyrVar = this.aR) == null) {
                this.as.i(this.aT);
                this.ae.d();
                h();
                super.y();
                h();
                H();
                Intent b = this.aa.b(null);
                if (b != null) {
                    ((ainy) this.f250J.get()).J();
                    this.a.startActivity(b);
                    if (env.a(b)) {
                        this.a.finish();
                        yysVar = this.aI;
                    }
                }
                gfo.a();
                if (evr.bA()) {
                    B();
                    C();
                }
                yysVar = this.aI;
            } else {
                ayqi ayqiVar = this.Z;
                int i = 6;
                yyq b2 = yyr.b(6);
                b2.a("bfa", new omh(this, 14));
                b2.a("ios", new omh(this, 15));
                int i2 = 9;
                b2.a("bcf", new omk(this, i2));
                b2.a("sos", new omh(this, 16));
                b2.a("bcf", new omk(this, i2));
                yyrVar.n(ayqiVar, b2);
                H();
                Intent b3 = this.aa.b(null);
                if (b3 != null) {
                    ((ainy) this.f250J.get()).J();
                    this.a.startActivity(b3);
                    if (env.a(b3)) {
                        this.a.finish();
                        yysVar = this.aI;
                    }
                }
                yyr yyrVar2 = this.aR;
                ayqi ayqiVar2 = this.Z;
                yyq b4 = yyr.b(6);
                b4.a("ftr", omm.a);
                b4.c("ros", new omk(this, i), evr.bA());
                b4.c("rfs", new omk(this, 7), evr.bA());
                yyrVar2.n(ayqiVar2, b4);
                yysVar = this.aI;
            }
            yysVar.d(3);
        } catch (Throwable th) {
            this.aI.d(3);
            throw th;
        }
    }

    public final void z() {
        this.aW.a(true);
        lwy lwyVar = this.ay;
        if (lwyVar.e) {
            lwyVar.a.unregisterReceiver(lwyVar);
            lwyVar.e = false;
        }
        ooc oocVar = this.am;
        oocVar.w.c();
        oocVar.j.m(oocVar.c);
        if (oocVar.C != null && !evr.au(oocVar.D)) {
            oocVar.j.m(oocVar.C);
        }
        oocVar.j.m(oocVar.k);
        InlinePlaybackController inlinePlaybackController = oocVar.C;
        if (inlinePlaybackController != null) {
            inlinePlaybackController.d.removeMessages(1);
        }
        ((jgb) oocVar.n.get()).d();
        ont ontVar = this.aq;
        ontVar.a.m(ontVar.d.get());
        ontVar.a.m(ontVar.j.get());
        ((jhn) ontVar.i.get()).e();
        zbi zbiVar = ontVar.b;
        if (zbiVar instanceof lrw) {
            lrw lrwVar = (lrw) zbiVar;
            lrwVar.b = null;
            lrwVar.a = null;
            ontVar.a.m(zbiVar);
        }
        this.aO.m(this);
        this.aO.m(this.ap);
        this.aO.m(this.al);
        this.aO.m(this.C.get());
        this.aO.m(this.G.get());
        this.aO.m(this.E.get());
        this.aO.m(this.k);
        this.aO.m(this.ab);
        this.aO.m(this.P.get());
        this.aO.m(this.aB);
        nmt nmtVar = this.ai;
        if (nmtVar.c()) {
            if (nmtVar.d) {
                nmtVar.d = false;
                nmtVar.b.unregisterReceiver(nmtVar.a);
            }
            nmtVar.a();
        }
        gnx gnxVar = (gnx) this.L.get();
        gnxVar.a.h(gnxVar.d);
        this.an.p = false;
        akxw akxwVar = this.F;
        akxwVar.d.execute(new akxo(akxwVar, 0));
        j();
        this.U.g.c();
        this.c.b();
        ook ookVar = this.al;
        ookVar.m = ookVar.d.c().d();
        aieu aieuVar = this.R;
        aieuVar.a.c();
        aieuVar.a();
        ((acop) this.w.get()).d();
        aczi acziVar = this.aA;
        acziVar.a.k(acziVar);
    }

    public final void B() {
        lwy lwyVar = this.ay;
        char c = 1;
        if (!lwyVar.e) {
            asvu asvuVar = lwyVar.h.b().e;
            if (asvuVar == null) {
                asvuVar = asvu.a;
            }
            if (asvuVar.N && Build.VERSION.SDK_INT < 29) {
                lwyVar.f = (PowerManager) lwyVar.a.getSystemService("power");
                lwyVar.a.registerReceiver(lwyVar, new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED"));
                lwyVar.e = true;
            }
        }
        anhy anhyVar = lwyVar.g;
        if (anhyVar != null) {
            ynm.n(lwyVar.a, anhyVar, llq.j, new lwx(lwyVar, c == true ? 1 : 0));
        }
        i();
        h();
        ooc oocVar = this.am;
        if (aij.b()) {
            oocVar.t(oocVar.u.isInMultiWindowMode());
        }
        oocVar.j.g(oocVar.c);
        if (oocVar.C != null) {
            if (evr.au(oocVar.D)) {
                oocVar.w.g(oocVar.C.kI(oocVar.p));
            } else {
                oocVar.j.g(oocVar.C);
            }
        }
        oocVar.j.g(oocVar.k);
        ((eva) oocVar.o.get()).a();
        this.i.b.e(this.Y);
        D();
        nmt nmtVar = this.ai;
        if (nmtVar.c() && !nmtVar.d) {
            nmtVar.d = true;
            nmtVar.b();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentFilter.addDataScheme("package");
            nmtVar.b.registerReceiver(nmtVar.a, intentFilter);
        }
        ont ontVar = this.aq;
        jjo jjoVar = (jjo) ontVar.e.get();
        jjoVar.d.execute(new jiz(jjoVar));
        ((jih) ontVar.f.get()).b();
        ((jhn) ontVar.i.get()).d();
        ontVar.a.g(ontVar.d.get());
        ontVar.a.g(ontVar.j.get());
        final jvh jvhVar = ontVar.h;
        ynm.j(anfq.i(jvhVar.b.a.a(), new anfz() { // from class: jvf
            @Override // defpackage.anfz
            public final anhy a(Object obj) {
                fkh fkhVar = (fkh) obj;
                return (fkhVar.b & 1) != 0 ? jvh.this.b(fkhVar.c) : anaf.O(null);
            }
        }, angq.a), angq.a, lra.h);
        zbi zbiVar = ontVar.b;
        if (zbiVar instanceof lrw) {
            lrw lrwVar = (lrw) zbiVar;
            kbv kbvVar = ontVar.c;
            acqz acqzVar = ontVar.k;
            kbvVar.getClass();
            lrwVar.b = kbvVar;
            lrwVar.a = acqzVar;
            ontVar.a.g(zbiVar);
        }
        ontVar.c.m(true);
        final jvt jvtVar = (jvt) ontVar.g.get();
        ynm.i(jvtVar.d.b(), new ynl() { // from class: jvs
            @Override // defpackage.ynl, defpackage.zfi
            public final void a(Object obj) {
                jvt jvtVar2 = jvt.this;
                if (((Boolean) obj).booleanValue()) {
                    if (!jvtVar2.c(jvt.a) && ((agof) jvtVar2.e.get()).h()) {
                        ((agto) jvtVar2.f.get()).a();
                    }
                    jvtVar2.b(jvt.b);
                }
            }
        });
        this.aO.h(this, omq.class);
        this.aO.g(this.ap);
        this.aO.g(this.al);
        this.aO.g(this.C.get());
        this.aO.g(this.G.get());
        this.aO.g(this.E.get());
        this.aO.g(this.ab);
        this.aO.g(this.P.get());
        this.aO.g(this.aB);
        akxw akxwVar = this.F;
        akxwVar.d.execute(new akxo(akxwVar, 2));
        gnx gnxVar = (gnx) this.L.get();
        gnxVar.a.f(gnxVar.d);
        ((gnx) this.L.get()).b = this.M;
        this.Y.execute(new omh(this, 20));
        ainy ainyVar = (ainy) this.f250J.get();
        if (ainyVar.q() != null) {
            lrx lrxVar = this.Q;
            if (!ainyVar.O() && lrxVar.c.s.b()) {
                akbz akbzVar = lrxVar.b;
                akca m = akbzVar.m();
                m.k(lrxVar.a.getString(R.string.error_audio_cast_background));
                m.j(false);
                akbzVar.o(m.b());
            }
        }
        ((agcf) this.W.get()).e();
        lyj lyjVar = this.U;
        lyjVar.g.g(lyjVar.kI(lyjVar.f));
        AccessibilityStateReceiver accessibilityStateReceiver = this.V;
        accessibilityStateReceiver.j();
        accessibilityStateReceiver.l();
        h();
        if (mcy.M(this.aV)) {
            this.d.edit().putInt("searchbox_hint_rotation_state", (this.d.getInt("searchbox_hint_rotation_state", 0) + 1) % 3).apply();
        }
        if (this.aj.e) {
            G();
            this.aj.h();
        }
        aieu aieuVar = this.R;
        aieuVar.a.c();
        aieuVar.a.g(aieuVar.kI(aieuVar.b));
        ((acop) this.w.get()).e();
        aczi acziVar = this.aA;
        acziVar.a.i(acziVar);
        acziVar.a(acziVar.a.g() != null);
        this.az.b(this.be);
        this.aG.e(this.be.d);
    }
}
