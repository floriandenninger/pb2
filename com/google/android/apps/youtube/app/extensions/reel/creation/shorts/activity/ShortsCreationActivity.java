package com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.youtube.R;
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
import defpackage.avtp;
import defpackage.axps;
import defpackage.ce;
import defpackage.dd;
import defpackage.eed;
import defpackage.fkc;
import defpackage.hcj;
import defpackage.hck;
import defpackage.hcm;
import defpackage.hdx;
import defpackage.hei;
import defpackage.hel;
import defpackage.hfa;
import defpackage.hhd;
import defpackage.hli;
import defpackage.hlz;
import defpackage.hmb;
import defpackage.hmc;
import defpackage.hqw;
import defpackage.hrq;
import defpackage.hrv;
import defpackage.jqr;
import defpackage.shf;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ShortsCreationActivity extends hcj implements amei {
    public hcm b;
    public boolean c;
    private final amhn d = amhn.a(this);
    private boolean e;
    private Context f;
    private aom g;

    public ShortsCreationActivity() {
        SystemClock.elapsedRealtime();
        addOnContextAvailableListener(new hck(this));
    }

    private final hcm g() {
        c();
        return this.b;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(Configuration configuration) {
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.f;
        }
        amkq.i(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.f = context;
        amkq.h(context);
        super.attachBaseContext(context);
        this.f = null;
    }

    @Override // defpackage.hcj
    public final /* synthetic */ axps b() {
        return amel.a(this);
    }

    public final void c() {
        if (this.b == null) {
            if (!this.e) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.c && !isFinishing()) {
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
                        ShortsCreationActivity cj = ((eed) lM).cj();
                        hrq hrqVar = (hrq) ((eed) lM).jq.get();
                        shf shfVar = (shf) ((eed) lM).a.g.get();
                        this.b = new hcm(cj, hrqVar, shfVar, (hrv) ((eed) lM).a.a.S.get(), (alwk) ((eed) lM).e.get());
                        l.close();
                        this.b.h = this;
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            } finally {
                try {
                    l.close();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public final boolean f(int i, KeyEvent keyEvent) {
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.zv, defpackage.er, defpackage.aok
    public final aof getLifecycle() {
        if (this.g == null) {
            this.g = new amej(this);
        }
        return this.g;
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
        amis p = this.d.p();
        try {
            hcm g = g();
            if (intent == null || !intent.getBooleanExtra("close_gallery_on_successful_upload", false) || i2 != -1) {
                super.onActivityResult(i, i2, intent);
            } else {
                g.c.setResult(-1, intent);
                g.c.finish();
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
        amis b = this.d.b();
        try {
            hcm g = g();
            hmc hmcVar = ((hlz) g.a.am).a;
            dd supportFragmentManager = hmcVar.C().getSupportFragmentManager();
            if (supportFragmentManager.a() > 0) {
                supportFragmentManager.K();
            } else {
                ce e = hmcVar.mN().e(R.id.reel_container);
                if (e instanceof hli) {
                    if (hmcVar.aw) {
                        hmb hmbVar = hmcVar.an;
                        if (hmbVar != null) {
                            hmbVar.f(false);
                        }
                    } else {
                        hmcVar.aS(false, jqr.c(hmcVar.q(), hmcVar.ao, 22156));
                    }
                } else if (e instanceof hel) {
                    hel helVar = (hel) e;
                    if (fkc.D(helVar.aK)) {
                        hei heiVar = helVar.e;
                        hdx hdxVar = new hdx(helVar, 3);
                        if (((hmc) heiVar).aw) {
                            hdxVar.run();
                            ((hmc) heiVar).aM(jqr.c(((hmc) heiVar).q(), ((hmc) heiVar).ao, 22156));
                        }
                    }
                    helVar.aH();
                } else if (e instanceof hhd) {
                    ((hhd) e).aJ();
                } else if (!(e instanceof hqw)) {
                    super.onBackPressed();
                } else {
                    ((hqw) e).aG();
                }
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

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0096 A[Catch: all -> 0x00d0, TryCatch #0 {all -> 0x00d0, blocks: (B:3:0x0007, B:5:0x0020, B:6:0x0025, B:8:0x0031, B:9:0x003a, B:11:0x003e, B:13:0x004c, B:15:0x005c, B:16:0x008a, B:18:0x0096, B:20:0x00ae, B:22:0x00b3, B:23:0x00b6, B:25:0x00bc, B:26:0x00bf, B:33:0x005f, B:34:0x0062, B:36:0x0066, B:37:0x0078), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            amhn r0 = r9.d
            amis r0 = r0.q()
            r1 = 1
            r9.e = r1     // Catch: java.lang.Throwable -> Ld0
            aof r1 = r9.getLifecycle()     // Catch: java.lang.Throwable -> Ld0
            amhn r2 = r9.d     // Catch: java.lang.Throwable -> Ld0
            amej r1 = (defpackage.amej) r1     // Catch: java.lang.Throwable -> Ld0
            r1.h(r2)     // Catch: java.lang.Throwable -> Ld0
            hcm r1 = r9.g()     // Catch: java.lang.Throwable -> Ld0
            hrv r2 = r1.f     // Catch: java.lang.Throwable -> Ld0
            boolean r2 = r2.n()     // Catch: java.lang.Throwable -> Ld0
            if (r2 == 0) goto L25
            alwk r2 = r1.g     // Catch: java.lang.Throwable -> Ld0
            r2.c(r1)     // Catch: java.lang.Throwable -> Ld0
        L25:
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r2 = r1.c     // Catch: java.lang.Throwable -> Ld0
            defpackage.etx.h(r2)     // Catch: java.lang.Throwable -> Ld0
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r2 = r1.h     // Catch: java.lang.Throwable -> Ld0
            super.onCreate(r10)     // Catch: java.lang.Throwable -> Ld0
            if (r10 != 0) goto L38
            shf r2 = r1.e     // Catch: java.lang.Throwable -> Ld0
            long r2 = r2.c()     // Catch: java.lang.Throwable -> Ld0
            goto L3a
        L38:
            r2 = 0
        L3a:
            hrq r4 = r1.d     // Catch: java.lang.Throwable -> Ld0
            if (r10 == 0) goto L62
            java.lang.String r5 = "frontend_id_key"
            java.lang.String r5 = r10.getString(r5)     // Catch: java.lang.Throwable -> Ld0
            boolean r6 = defpackage.akwd.f(r5)     // Catch: java.lang.Throwable -> Ld0
            r4.f = r6     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L5f
            akvf r6 = r4.d     // Catch: java.lang.Throwable -> Ld0
            anhy r6 = r6.j(r5)     // Catch: java.lang.Throwable -> Ld0
            ammv r6 = r4.a(r6)     // Catch: java.lang.Throwable -> Ld0
            boolean r6 = r6.h()     // Catch: java.lang.Throwable -> Ld0
            if (r6 == 0) goto L62
            r4.e = r5     // Catch: java.lang.Throwable -> Ld0
            goto L8a
        L5f:
            r4.e = r5     // Catch: java.lang.Throwable -> Ld0
            goto L8a
        L62:
            boolean r5 = r4.f     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto L78
            akvf r5 = r4.d     // Catch: java.lang.Throwable -> Ld0
            avtl r6 = defpackage.avtl.UPLOAD_CREATION_FLOW_SHORTS     // Catch: java.lang.Throwable -> Ld0
            hrp r7 = defpackage.hrq.a     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.s(r6, r7)     // Catch: java.lang.Throwable -> Ld0
            r4.e = r5     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "Upload Client API in use."
            defpackage.zga.l(r5)     // Catch: java.lang.Throwable -> Ld0
            goto L8a
        L78:
            akwd r5 = r4.b     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = r5.b()     // Catch: java.lang.Throwable -> Ld0
            r4.e = r5     // Catch: java.lang.Throwable -> Ld0
            akyb r5 = r4.c     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = r4.e     // Catch: java.lang.Throwable -> Ld0
            r7 = 0
            avto r8 = defpackage.avto.UPLOAD_FRONTEND_EVENT_TYPE_CLIENT_UPLOAD_CREATION_STARTED     // Catch: java.lang.Throwable -> Ld0
            r5.d(r6, r7, r8)     // Catch: java.lang.Throwable -> Ld0
        L8a:
            java.lang.String r4 = r4.e     // Catch: java.lang.Throwable -> Ld0
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r4 = r1.c     // Catch: java.lang.Throwable -> Ld0
            r5 = 2131625113(0x7f0e0499, float:1.8877425E38)
            r4.setContentView(r5)     // Catch: java.lang.Throwable -> Ld0
            if (r10 == 0) goto Lbf
            com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity r10 = r1.c     // Catch: java.lang.Throwable -> Ld0
            dd r10 = r10.getSupportFragmentManager()     // Catch: java.lang.Throwable -> Ld0
            dn r4 = r10.k()     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r5 = "ReelBrowseFragmentTag"
            ce r5 = r10.f(r5)     // Catch: java.lang.Throwable -> Ld0
            java.lang.String r6 = "SFV_AUDIO_SEARCH_FRAGMENT_TAG"
            ce r10 = r10.f(r6)     // Catch: java.lang.Throwable -> Ld0
            if (r5 == 0) goto Lb1
            r4.m(r5)     // Catch: java.lang.Throwable -> Ld0
        Lb1:
            if (r10 == 0) goto Lb6
            r4.m(r10)     // Catch: java.lang.Throwable -> Ld0
        Lb6:
            boolean r10 = r4.j()     // Catch: java.lang.Throwable -> Ld0
            if (r10 != 0) goto Lbf
            r4.a()     // Catch: java.lang.Throwable -> Ld0
        Lbf:
            r1.e(r2)     // Catch: java.lang.Throwable -> Ld0
            hrv r10 = r1.f     // Catch: java.lang.Throwable -> Ld0
            r10.q()     // Catch: java.lang.Throwable -> Ld0
            r10 = 0
            r9.e = r10     // Catch: java.lang.Throwable -> Ld0
            if (r0 == 0) goto Lcf
            r0.close()
        Lcf:
            return
        Ld0:
            r10 = move-exception
            if (r0 == 0) goto Ld6
            r0.close()     // Catch: java.lang.Throwable -> Ld6
        Ld6:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.reel.creation.shorts.activity.ShortsCreationActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ci, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, Menu menu) {
        amis r = this.d.r();
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
        amis c = this.d.c();
        try {
            super.onDestroy();
            hcm g = g();
            if (g.c.isFinishing() && !g.b) {
                hrq hrqVar = g.d;
                if (hrqVar.f) {
                    hrqVar.c("Failure while abandoning upload.", hrqVar.d.c(hrqVar.e, avtp.UPLOAD_PROCESSOR_ABANDONMENT_REASON_CANCELLED_CREATION));
                    hrqVar.d.B(hrq.a);
                }
            }
            this.c = true;
            c.close();
        } catch (Throwable th) {
            try {
                c.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // defpackage.ml, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return g().g(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyLongPress(int i, KeyEvent keyEvent) {
        return g().h(i, keyEvent);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        hcm g = g();
        hmc hmcVar = ((hlz) g.a.am).a;
        ce e = hmcVar.mN().e(R.id.reel_container);
        if (hmcVar.aO(e)) {
            hfa hfaVar = ((hel) e).aI;
            if (!hfaVar.d && hfaVar.a.h(i)) {
                return true;
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ci, android.app.Activity
    public final void onNewIntent(Intent intent) {
        amis d = this.d.d(intent);
        try {
            super.onNewIntent(intent);
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
        amis s = this.d.s();
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
        amis e = this.d.e();
        try {
            hcm g = g();
            if (g.c.isFinishing()) {
                g.c.setRequestedOrientation(-1);
            }
            super.onPause();
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
        amis t = this.d.t();
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
        amis f = this.d.f();
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
        amis u = this.d.u();
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
        amis g = this.d.g();
        try {
            super.onResume();
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
        amis v = this.d.v();
        try {
            super.onSaveInstanceState(bundle);
            bundle.putString("frontend_id_key", g().d.e);
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
        amis h = this.d.h();
        try {
            super.onStart();
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
        amis i = this.d.i();
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
        amis j = this.d.j();
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
        amis k = this.d.k();
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
