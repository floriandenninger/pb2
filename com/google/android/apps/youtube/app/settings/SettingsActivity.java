package com.google.android.apps.youtube.app.settings;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.preference.Preference;
import com.google.android.apps.youtube.app.common.ui.bottomui.BottomUiContainer;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelFragmentDescriptor;
import com.google.android.apps.youtube.app.settings.SettingsActivity;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.UrlEndpointOuterClass;
import defpackage.aac;
import defpackage.aae;
import defpackage.aaea;
import defpackage.aahd;
import defpackage.aap;
import defpackage.acqx;
import defpackage.acra;
import defpackage.acsb;
import defpackage.adyu;
import defpackage.alwk;
import defpackage.amei;
import defpackage.amej;
import defpackage.amel;
import defpackage.amhn;
import defpackage.amil;
import defpackage.amis;
import defpackage.amjw;
import defpackage.amkq;
import defpackage.aof;
import defpackage.aom;
import defpackage.aone;
import defpackage.apui;
import defpackage.apuj;
import defpackage.apuo;
import defpackage.apup;
import defpackage.apuq;
import defpackage.apur;
import defpackage.apxf;
import defpackage.avuo;
import defpackage.axps;
import defpackage.axqq;
import defpackage.ayqi;
import defpackage.bsd;
import defpackage.eed;
import defpackage.evh;
import defpackage.evr;
import defpackage.fav;
import defpackage.fxj;
import defpackage.gjk;
import defpackage.gjl;
import defpackage.gng;
import defpackage.gni;
import defpackage.iwu;
import defpackage.lkv;
import defpackage.llq;
import defpackage.lmi;
import defpackage.lmm;
import defpackage.lms;
import defpackage.lmt;
import defpackage.lnh;
import defpackage.lnv;
import defpackage.lnw;
import defpackage.low;
import defpackage.mcy;
import defpackage.wbs;
import defpackage.wju;
import defpackage.ynm;
import defpackage.yqw;
import defpackage.yxe;
import defpackage.zau;
import defpackage.zaz;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SettingsActivity extends lkv implements amei {
    private lmi b;
    private final amhn c = amhn.a(this);
    private boolean d;
    private Context e;
    private aom f;
    private boolean g;

    public SettingsActivity() {
        SystemClock.elapsedRealtime();
    }

    private final lmi i() {
        j();
        return this.b;
    }

    private final void j() {
        if (this.b != null) {
            return;
        }
        if (!this.d) {
            throw new IllegalStateException("createPeer() called outside of onCreate");
        }
        if (this.g && !isFinishing()) {
            throw new IllegalStateException("createPeer() called after destroyed.");
        }
        amil l = amjw.l("CreateComponent");
        try {
            lM();
            l.close();
            l = amjw.l("CreatePeer");
            try {
                try {
                    Object lM = lM();
                    Activity a = ((eed) lM).a();
                    if (!(a instanceof SettingsActivity)) {
                        String valueOf = String.valueOf(lmi.class);
                        String valueOf2 = String.valueOf(a.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(valueOf2).length());
                        sb.append("Attempt to inject a Activity wrapper of type ");
                        sb.append(valueOf);
                        sb.append(", but the wrapper available is of type: ");
                        sb.append(valueOf2);
                        sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        throw new IllegalStateException(sb.toString());
                    }
                    final lmi lmiVar = new lmi((SettingsActivity) a, (gni) ((eed) lM).a.eA.get(), (fxj) ((eed) lM).f196J.get(), axqq.a(((eed) lM).a.yw), (Executor) ((eed) lM).a.f.get(), ((eed) lM).a.cz(), (Handler) ((eed) lM).a.an.get(), (yxe) ((eed) lM).jU.get(), axqq.a(((eed) lM).ke), axqq.a(((eed) lM).kd), ((eed) lM).aE(), (low) ((eed) lM).kf.get(), axqq.a(((eed) lM).B), (aaea) ((eed) lM).a.K.get(), (wju) ((eed) lM).en.get(), ((eed) lM).a.bj());
                    alwk alwkVar = (alwk) ((eed) lM).e.get();
                    final ayqi ayqiVar = (ayqi) ((eed) lM).a.im.get();
                    yqw gR = ((eed) lM).gR();
                    alwkVar.c(lmiVar);
                    gR.f(new Callable() { // from class: lme
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            final lmi lmiVar2 = lmi.this;
                            return lmiVar2.m.a.Y(khe.n).Y(new ayrv() { // from class: lmc
                                @Override // defpackage.ayrv
                                public final Object a(Object obj) {
                                    return Integer.valueOf(yjk.K(lmi.this.a.getResources().getDisplayMetrics(), true != ((Boolean) obj).booleanValue() ? 4 : 0));
                                }
                            }).ab(ayqiVar).ax(new ayrs() { // from class: lmb
                                @Override // defpackage.ayrs
                                public final void a(Object obj) {
                                    final Integer num = (Integer) obj;
                                    Optional.ofNullable(lmi.this.a.findViewById(R.id.settings_toolbar_layout)).filter(new han(Toolbar.class, 3)).map(new hau(Toolbar.class, 3)).ifPresent(new Consumer() { // from class: lmg
                                        @Override // j$.util.function.Consumer
                                        public final void accept(Object obj2) {
                                            ((Toolbar) obj2).setElevation(num.intValue());
                                        }

                                        @Override // j$.util.function.Consumer
                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer.CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                            });
                        }
                    });
                    this.b = lmiVar;
                    l.close();
                    this.b.t = this;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                }
            } catch (Throwable th) {
            }
        } finally {
            try {
                l.close();
            } catch (Throwable unused) {
                throw th;
            }
        }
    }

    @Override // defpackage.bsh
    public final boolean a(Preference preference) {
        lmi i = i();
        if (!"accessibility_hide_player_controls_setting_key".equals(preference.s)) {
            return false;
        }
        if (i.a.getSupportFragmentManager().f("PREF_DIALOG") != null) {
            return true;
        }
        lnh aM = lnh.aM(preference.s);
        aM.aE(i.a.getSupportFragmentManager().e(R.id.settings_detail_container));
        aM.qh(i.a.getSupportFragmentManager(), "PREF_DIALOG");
        return true;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.e;
        }
        amkq.i(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.e = context;
        amkq.h(context);
        super.attachBaseContext(context);
        this.e = null;
    }

    @Override // defpackage.bsi
    public final boolean b(Preference preference) {
        lmi i = i();
        lmt lmtVar = i.e().ak;
        String str = preference.s;
        if (lmtVar.a(R.string.captions_key).equals(str)) {
            lmtVar.a.startActivity(new Intent("android.settings.CAPTIONING_SETTINGS"));
            return true;
        }
        apxf apxfVar = null;
        if (lmtVar.a(R.string.subscription_product_setting_key).equals(str)) {
            Intent r = lmtVar.e.r();
            for (Object obj : lmtVar.c.h()) {
                if (apup.class.isInstance(obj)) {
                    apup apupVar = (apup) obj;
                    if ((apupVar.b & 1) != 0 && (apxfVar = apupVar.c) == null) {
                        apxfVar = apxf.a;
                    }
                    r.putExtra("navigation_endpoint", lmtVar.d.h(apxfVar).toByteArray());
                    lmtVar.a.startActivity(r);
                    return true;
                }
            }
            return true;
        }
        if (lmtVar.a(R.string.connected_accounts_browse_page_key).equals(str)) {
            Intent r2 = lmtVar.e.r();
            for (Object obj2 : lmtVar.c.h()) {
                if (obj2 instanceof apui) {
                    apui apuiVar = (apui) obj2;
                    if ((apuiVar.b & 1) != 0 && (apxfVar = apuiVar.c) == null) {
                        apxfVar = apxf.a;
                    }
                    r2.putExtra("navigation_endpoint", lmtVar.d.h(apxfVar).toByteArray());
                    lmtVar.a.startActivity(r2);
                    return true;
                }
            }
            return true;
        }
        int i2 = 0;
        if (lmtVar.a(R.string.yt_unlimited_post_purchase_key).equals(str) || lmtVar.a(R.string.yt_unlimited_pre_purchase_key).equals(str)) {
            Intent r3 = lmtVar.e.r();
            while (true) {
                if (i2 >= lmtVar.c.h().size()) {
                    break;
                }
                Object obj3 = lmtVar.c.h().get(i2);
                if (obj3 instanceof apuq) {
                    apuq apuqVar = (apuq) obj3;
                    if ((apuqVar.b & 1) != 0) {
                        aone builder = apuqVar.toBuilder();
                        acra acraVar = lmtVar.d;
                        apxf apxfVar2 = apuqVar.c;
                        if (apxfVar2 == null) {
                            apxfVar2 = apxf.a;
                        }
                        apxf h = acraVar.h(apxfVar2);
                        builder.copyOnWrite();
                        apuq apuqVar2 = (apuq) builder.instance;
                        h.getClass();
                        apuqVar2.c = h;
                        apuqVar2.b |= 1;
                        apuq apuqVar3 = (apuq) builder.build();
                        apxf apxfVar3 = apuqVar3.c;
                        if (apxfVar3 == null) {
                            apxfVar3 = apxf.a;
                        }
                        r3.putExtra("navigation_endpoint", apxfVar3.toByteArray());
                        lmtVar.c.h().set(i2, apuqVar3);
                    }
                } else {
                    i2++;
                }
            }
            lmtVar.a.startActivity(r3);
            return true;
        }
        if (lmtVar.a(R.string.yt_unplugged_pref_key).equals(str)) {
            for (Object obj4 : lmtVar.c.h()) {
                if (apur.class.isInstance(obj4)) {
                    apxf apxfVar4 = ((apur) obj4).c;
                    if (apxfVar4 == null) {
                        apxfVar4 = apxf.a;
                    }
                    lmtVar.d.I(3, new acqx(apxfVar4.c), null);
                    lmtVar.a.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(((avuo) apxfVar4.pX(UrlEndpointOuterClass.urlEndpoint)).c)));
                    return true;
                }
            }
            return true;
        }
        if (lmtVar.a(R.string.history_key).equals(str)) {
            for (Object obj5 : lmtVar.c.i()) {
                if (obj5 instanceof apuj) {
                    apuj apujVar = (apuj) obj5;
                    if ((apujVar.b & 4) == 0) {
                        return true;
                    }
                    aahd aahdVar = lmtVar.b;
                    apxf apxfVar5 = apujVar.d;
                    if (apxfVar5 == null) {
                        apxfVar5 = apxf.a;
                    }
                    aahdVar.a(apxfVar5);
                }
            }
            return true;
        }
        if (lmtVar.a(R.string.premium_early_access_browse_page_key).equals(str)) {
            Intent r4 = lmtVar.e.r();
            for (Object obj6 : lmtVar.c.i()) {
                if (obj6 instanceof apuo) {
                    apuo apuoVar = (apuo) obj6;
                    if ((apuoVar.b & 1) != 0 && (apxfVar = apuoVar.c) == null) {
                        apxfVar = apxf.a;
                    }
                    r4.putExtra("navigation_endpoint", lmtVar.d.h(apxfVar).toByteArray());
                    lmtVar.a.startActivity(r4);
                    return true;
                }
            }
            return true;
        }
        String str2 = preference.s;
        if (i.a.getString(R.string.refresh_config_key).equals(str2)) {
            lnw lnwVar = new lnw(i.a, i.e, i.f, i.g);
            mcy.t(lnwVar.d, lnwVar.a, "Refreshing...", false);
            lnwVar.b.execute(new lnv(lnwVar));
            return true;
        }
        if (!i.a.getString(R.string.pair_with_tv_key).equals(str2)) {
            String str3 = preference.u;
            i.q = str3;
            return i.j(str3);
        }
        aae aaeVar = i.s;
        if (aaeVar == null) {
            return true;
        }
        aaeVar.b(adyu.bZ(i.a, i.b.a() == gng.DARK));
        return true;
    }

    @Override // defpackage.lkv
    public final /* synthetic */ axps f() {
        return amel.a(this);
    }

    public final lmi g() {
        lmi lmiVar = this.b;
        if (lmiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.g) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return lmiVar;
    }

    @Override // defpackage.zv, defpackage.er, defpackage.aok
    public final aof getLifecycle() {
        if (this.f == null) {
            this.f = new amej(this);
        }
        return this.f;
    }

    public final void h(CharSequence charSequence) {
        super.setTitle(charSequence);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amis p = this.c.p();
        try {
            super.onActivityResult(i, i2, intent);
            p.close();
        } catch (Throwable th) {
            try {
                p.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.vcc, defpackage.zv, android.app.Activity
    public final void onBackPressed() {
        amis b = this.c.b();
        try {
            super.onBackPressed();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, amek] */
    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amis q = this.c.q();
        try {
            this.d = true;
            j();
            ((amej) getLifecycle()).h(this.c);
            lM().kb().a();
            super.onCreate(bundle);
            final lmi i = i();
            i.a.setContentView((View) i.j.get());
            i.n.d((BottomUiContainer) i.a.findViewById(R.id.bottom_ui_container));
            i.h.a();
            gjl gjlVar = new gjl(i.a);
            if (evr.ae(i.m.a())) {
                if (i.p == gng.LIGHT) {
                    gjlVar.b(i.a, R.style.NavigationBar_Light_RemoveNavDivider);
                } else if (i.b.a() == gng.DARK) {
                    gjlVar.b(i.a, R.style.NavigationBar_Dark_RemoveNavDivider);
                }
            }
            Intent intent = i.a.getIntent();
            if ("android.intent.action.MANAGE_NETWORK_USAGE".equals(intent.getAction())) {
                intent.putExtra(":android:no_headers", true);
                intent.putExtra(":android:show_fragment", GeneralPrefsFragment.class.getName());
            }
            Toolbar toolbar = (Toolbar) i.a.findViewById(R.id.toolbar);
            Drawable mutate = i.a.getResources().getDrawable(R.drawable.yt_outline_arrow_left_black_24).mutate();
            zau.e(mutate, wbs.W(i.a, R.attr.ytTextPrimary).orElse(0), PorterDuff.Mode.SRC_IN);
            toolbar.q(mutate);
            i.a.setSupportActionBar(toolbar);
            Optional.ofNullable(i.a.getSupportActionBar()).ifPresent(iwu.f);
            if (intent.getBooleanExtra("background_settings", false)) {
                ynm.n(i.a, ((evh) i.d.get()).a(), llq.c, ynm.b);
            }
            i.c.a();
            if (bundle == null || !bundle.containsKey("CONFIGURATION_CHANGE_KEY")) {
                if (!i.l.a()) {
                    ((gjk) i.i.get()).b(PanelsConfiguration.c(PanelFragmentDescriptor.e(lmm.class), PanelFragmentDescriptor.e(GeneralPrefsFragment.class)));
                    i.a.getOnBackPressedDispatcher().b(i.a, i.o);
                }
                ((zaz) i.k.get()).h(i.a.findViewById(R.id.settings_root_container), 0);
                i.s = i.a.registerForActivityResult(new aap(), new aac() { // from class: lma
                    @Override // defpackage.aac
                    public final void a(Object obj) {
                        lmi lmiVar = lmi.this;
                        if (((ActivityResult) obj).a == 2) {
                            lmiVar.a.finish();
                        }
                    }
                });
            } else {
                i.q = bundle.getString("LAST_SHOWN_FRAGMENT_KEY", i.q);
                i.r = true;
                i.a.getOnBackPressedDispatcher().b(i.a, i.o);
            }
            this.d = false;
            if (q != null) {
                q.close();
            }
        } catch (Throwable th) {
            if (q != null) {
                try {
                    q.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ci, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amis r = this.c.r();
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
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        amis c = this.c.c();
        try {
            super.onDestroy();
            i().h.b();
            this.g = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amis d = this.c.d(intent);
        try {
            super.onNewIntent(intent);
            i().g(intent);
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

    @Override // defpackage.vcc, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        boolean onOptionsItemSelected;
        amis s = this.c.s();
        try {
            lmi i = i();
            if (menuItem.getItemId() != 16908332) {
                onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            } else {
                i.a.getOnBackPressedDispatcher().c();
                onOptionsItemSelected = true;
            }
            s.close();
            return onOptionsItemSelected;
        } catch (Throwable th) {
            try {
                s.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, android.app.Activity
    public final void onPause() {
        amis e = this.c.e();
        try {
            super.onPause();
            i().c.b();
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ml, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        amis t = this.c.t();
        try {
            super.onPostCreate(bundle);
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
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onPostResume() {
        amis f = this.c.f();
        try {
            super.onPostResume();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        amis u = this.c.u();
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            u.close();
        } catch (Throwable th) {
            try {
                u.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        lmi i = i();
        if (i.p != i.b.a()) {
            Handler handler = new Handler(Looper.getMainLooper());
            final SettingsActivity settingsActivity = i.a;
            settingsActivity.getClass();
            handler.postAtFrontOfQueue(new Runnable() { // from class: lmd
                @Override // java.lang.Runnable
                public final void run() {
                    SettingsActivity.this.recreate();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, android.app.Activity
    public final void onResume() {
        amis g = this.c.g();
        try {
            super.onResume();
            lmi i = i();
            i.c.e();
            i.h(i.a.getString(R.string.settings));
            lms lmsVar = (lms) i.a.getSupportFragmentManager().f(i.f());
            if (lmsVar != null) {
                lmsVar.e.d(acsb.b(12924), null, null);
            }
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
    @Override // defpackage.vcc, defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amis v = this.c.v();
        try {
            super.onSaveInstanceState(bundle);
            lmi i = i();
            bundle.putBoolean("CONFIGURATION_CHANGE_KEY", true);
            bundle.putString("LAST_SHOWN_FRAGMENT_KEY", i.q);
            if (v != null) {
                v.close();
            }
        } catch (Throwable th) {
            if (v != null) {
                try {
                    v.close();
                } catch (Throwable unused) {
                }
            }
            throw th;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onSearchRequested() {
        super.onSearchRequested();
        i();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        amis h = this.c.h();
        try {
            super.onStart();
            lmi i = i();
            if (!i.l.a()) {
                i.g(i.a.getIntent());
            }
            if (i.r) {
                i.r = false;
                bsd bsdVar = (bsd) i.a.getSupportFragmentManager().f("androidx.preference.PreferenceFragment.DIALOG");
                if (bsdVar != null && bsdVar.aK() != null) {
                    String str = bsdVar.aK().s;
                    if (fav.COUNTRY.equals(str)) {
                        bsdVar.dismiss();
                    } else if ("voice_language".equals(str)) {
                        bsdVar.dismiss();
                    }
                }
            }
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
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        amis i = this.c.i();
        try {
            super.onStop();
            i();
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
        amis j = this.c.j();
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

    @Override // defpackage.vcc, android.app.Activity
    public final void onUserInteraction() {
        amis k = this.c.k();
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
    public final void setTitle(CharSequence charSequence) {
        i().h(charSequence);
    }
}
