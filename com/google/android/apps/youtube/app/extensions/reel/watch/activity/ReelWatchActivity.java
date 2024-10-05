package com.google.android.apps.youtube.app.extensions.reel.watch.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelWatchActivity;
import com.google.android.youtube.R;
import defpackage.aadw;
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
import defpackage.aujl;
import defpackage.axps;
import defpackage.azrw;
import defpackage.dn;
import defpackage.eed;
import defpackage.etx;
import defpackage.fxj;
import defpackage.gfw;
import defpackage.ham;
import defpackage.han;
import defpackage.hau;
import defpackage.hav;
import defpackage.hax;
import defpackage.idt;
import defpackage.idv;
import defpackage.idy;
import defpackage.iek;
import defpackage.ifw;
import defpackage.ihn;
import defpackage.iml;
import defpackage.sus;
import defpackage.ykk;
import defpackage.yxe;
import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReelWatchActivity extends idt implements amei {
    private iek b;
    private final amhn c = amhn.a(this);
    private boolean d;
    private Context e;
    private aom f;
    private boolean g;

    public ReelWatchActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new idy(this));
    }

    private final iek f() {
        c();
        return this.b;
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

    @Override // defpackage.idt
    public final /* synthetic */ axps b() {
        return amel.a(this);
    }

    public final void c() {
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
                    if (!(a instanceof ReelWatchActivity)) {
                        String valueOf = String.valueOf(iek.class);
                        String valueOf2 = String.valueOf(a.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(valueOf2).length());
                        sb.append("Attempt to inject a Activity wrapper of type ");
                        sb.append(valueOf);
                        sb.append(", but the wrapper available is of type: ");
                        sb.append(valueOf2);
                        sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        throw new IllegalStateException(sb.toString());
                    }
                    ReelWatchActivity reelWatchActivity = (ReelWatchActivity) a;
                    gfw gfwVar = (gfw) ((eed) lM).jr.get();
                    ihn ihnVar = (ihn) ((eed) lM).a.lM.get();
                    azrw azrwVar = ((eed) lM).he;
                    iml imlVar = (iml) ((eed) lM).a.lL.get();
                    aadw aadwVar = (aadw) ((eed) lM).a.D.get();
                    this.b = new iek(reelWatchActivity, gfwVar, ihnVar, azrwVar, imlVar, aadwVar, (fxj) ((eed) lM).f196J.get(), (ykk) ((eed) lM).gA.get(), (ifw) ((eed) lM).a.a.aZ.get(), ((eed) lM).gR(), (yxe) ((eed) lM).jU.get(), (sus) ((eed) lM).ik.get(), null, null);
                    l.close();
                    this.b.l = this;
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

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        iek f = f();
        aujl aujlVar = f.k.b().E;
        if (aujlVar == null) {
            aujlVar = aujl.a;
        }
        if (aujlVar.b) {
            ReelWatchActivity reelWatchActivity = f.a;
            reelWatchActivity.overridePendingTransition(0, true != ((Boolean) iek.a(reelWatchActivity.getIntent()).map(ham.i).map(ham.j).orElse(false)).booleanValue() ? R.anim.reel_activity_slide_down : R.anim.reel_activity_slide_out_right);
        }
    }

    @Override // defpackage.zv, defpackage.er, defpackage.aok
    public final aof getLifecycle() {
        if (this.f == null) {
            this.f = new amej(this);
        }
        return this.f;
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
    @Override // defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amis p = this.c.p();
        try {
            iek f = f();
            if (!f.f.b(i, i2, intent)) {
                super.onActivityResult(i, i2, intent);
            }
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
        amis b = this.c.b();
        try {
            iek f = f();
            aujl aujlVar = f.k.b().E;
            if (aujlVar == null) {
                aujlVar = aujl.a;
            }
            if (aujlVar.b) {
                hav havVar = (hav) f.c.get();
                int i = 0;
                if (!((Boolean) Optional.ofNullable(havVar.a()).filter(new han(hax.class, i)).map(new hau(hax.class, i)).map(ham.c).orElse(false)).booleanValue() && !havVar.h()) {
                    f.a.finishAfterTransition();
                }
            } else if (!((hav) f.c.get()).g()) {
                ((hav) f.c.get()).h();
            }
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.ml, defpackage.ci, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        f().e.c(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amis q = this.c.q();
        try {
            this.d = true;
            ((amej) getLifecycle()).h(this.c);
            final iek f = f();
            long currentTimeMillis = System.currentTimeMillis();
            etx.h(f.a);
            super.onCreate(bundle);
            f.a.setContentView(R.layout.reel_watch_activity);
            idv idvVar = (idv) f.a.getSupportFragmentManager().f("ProcessDeathDetectorFragmentTag");
            if (bundle != null && idvVar != null && idvVar.a) {
                f.a.finish();
            } else {
                dn k = f.a.getSupportFragmentManager().k();
                idv idvVar2 = new idv();
                idvVar2.a = false;
                idvVar2.al(true);
                k.r(idvVar2, "ProcessDeathDetectorFragmentTag");
                k.a();
                f.b.d("r_ac", currentTimeMillis);
                f.a.postponeEnterTransition();
                f.b();
                f.e.a();
                f.i.a();
                aujl aujlVar = f.k.b().E;
                if (aujlVar == null) {
                    aujlVar = aujl.a;
                }
                if (aujlVar.b) {
                    f.h.g(new Callable() { // from class: iei
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            iek iekVar = iek.this;
                            ayph ayphVar = ((hav) iekVar.c.get()).e;
                            final ReelWatchActivity reelWatchActivity = iekVar.a;
                            return ayphVar.R(new ayrm() { // from class: ieh
                                @Override // defpackage.ayrm
                                public final void a() {
                                    ReelWatchActivity.this.finishAfterTransition();
                                }
                            });
                        }
                    });
                }
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
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onDestroy() {
        amis c = this.c.c();
        try {
            super.onDestroy();
            iek f = f();
            f.i.b();
            iml imlVar = f.d;
            synchronized (imlVar.b) {
                imlVar.b.clear();
            }
            f.e.d();
            f.g.b();
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
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amis d = this.c.d(intent);
        try {
            super.onNewIntent(intent);
            iek f = f();
            f.a.setIntent(intent);
            f.b();
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amis s = this.c.s();
        try {
            boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
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
    @Override // defpackage.ci, android.app.Activity
    public final void onPause() {
        amis e = this.c.e();
        try {
            iek f = f();
            if (f.a.isFinishing()) {
                f.a.setRequestedOrientation(-1);
            }
            super.onPause();
            f.e.b();
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
    @Override // defpackage.ml, android.app.Activity
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
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
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

    @Override // defpackage.ci, defpackage.zv, android.app.Activity, defpackage.ahn
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onResume() {
        amis g = this.c.g();
        try {
            super.onResume();
            f().e.e();
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
    @Override // defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amis v = this.c.v();
        try {
            super.onSaveInstanceState(bundle);
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        amis h = this.c.h();
        try {
            super.onStart();
            iek f = f();
            f.j.a(f.a.getResources().getConfiguration(), f.a);
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
    @Override // defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        amis i = this.c.i();
        try {
            super.onStop();
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

    @Override // android.app.Activity
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
}
