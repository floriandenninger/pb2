package com.google.android.apps.youtube.app.extensions.accountlinking;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
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
import defpackage.axps;
import defpackage.eed;
import defpackage.gwo;
import defpackage.gwt;
import defpackage.gwu;
import defpackage.zga;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class UriFlowActivity extends gwo implements amei {
    private gwu b;
    private final amhn c = amhn.a(this);
    private boolean d;
    private Context e;
    private aom f;
    private boolean g;

    public UriFlowActivity() {
        SystemClock.elapsedRealtime();
    }

    private final gwu c() {
        f();
        return this.b;
    }

    private final void f() {
        if (this.b == null) {
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
                        this.b = new gwu(((eed) lM).bW(), (gwt) ((eed) lM).a.a.j.get(), (alwk) ((eed) lM).e.get(), ((eed) lM).bW(), ((eed) lM).a.bj());
                        l.close();
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

    @Override // defpackage.gwo
    public final /* synthetic */ axps b() {
        return amel.a(this);
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
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, amek] */
    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amis q = this.c.q();
        try {
            this.d = true;
            f();
            ((amej) getLifecycle()).h(this.c);
            lM().kb().a();
            super.onCreate(bundle);
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
            gwu c = c();
            if (c.c == 3) {
                c.g(c.b.e(intent));
            } else {
                zga.b("Unexpected intent received.");
                c.e();
            }
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
    @Override // defpackage.vcc, defpackage.ci, android.app.Activity
    public final void onPause() {
        amis e = this.c.e();
        try {
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, android.app.Activity
    public final void onResume() {
        amis g = this.c.g();
        try {
            super.onResume();
            gwu c = c();
            if (c.c == 3) {
                c.e();
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
    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[Catch: all -> 0x0075, TRY_LEAVE, TryCatch #0 {all -> 0x0075, blocks: (B:3:0x0006, B:11:0x0013, B:13:0x0020, B:15:0x0026, B:17:0x0049, B:19:0x0051, B:20:0x0055, B:21:0x002b, B:23:0x003d, B:27:0x005c, B:29:0x0063, B:31:0x006d), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0071  */
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onStart() {
        /*
            r8 = this;
            amhn r0 = r8.c
            amis r0 = r0.h()
            super.onStart()     // Catch: java.lang.Throwable -> L75
            gwu r1 = r8.c()     // Catch: java.lang.Throwable -> L75
            int r2 = r1.c     // Catch: java.lang.Throwable -> L75
            r3 = 1
            if (r2 == r3) goto L13
            goto L6f
        L13:
            com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity r2 = r1.a     // Catch: java.lang.Throwable -> L75
            android.content.Intent r2 = r2.getIntent()     // Catch: java.lang.Throwable -> L75
            android.net.Uri r3 = r2.getData()     // Catch: java.lang.Throwable -> L75
            r4 = 2
            if (r3 == 0) goto L63
            gwt r5 = r1.b     // Catch: java.lang.Throwable -> L75
            java.lang.String r6 = r5.b     // Catch: java.lang.Throwable -> L75
            if (r6 == 0) goto L2b
            boolean r3 = r5.c(r3)     // Catch: java.lang.Throwable -> L75
            goto L47
        L2b:
            vgz r3 = r5.g     // Catch: java.lang.Throwable -> L75
            anhy r3 = r3.a()     // Catch: java.lang.Throwable -> L75
            gws r6 = new gws     // Catch: java.lang.Throwable -> L75
            r7 = 0
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> L75
            angq r5 = defpackage.angq.a     // Catch: java.lang.Throwable -> L75
            anhy r3 = defpackage.anfq.h(r3, r6, r5)     // Catch: java.lang.Throwable -> L75
            java.lang.Object r3 = r3.get()     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.Throwable -> L75
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.Throwable -> L75
            boolean r3 = r3.booleanValue()     // Catch: java.lang.InterruptedException -> L59 java.util.concurrent.ExecutionException -> L5b java.lang.Throwable -> L75
        L47:
            if (r3 == 0) goto L63
            gwt r3 = r1.b     // Catch: java.lang.Throwable -> L75
            int r2 = r3.e(r2)     // Catch: java.lang.Throwable -> L75
            if (r2 != r4) goto L55
            r1.g(r4)     // Catch: java.lang.Throwable -> L75
            goto L6f
        L55:
            r1.f()     // Catch: java.lang.Throwable -> L75
            goto L6f
        L59:
            r2 = move-exception
            goto L5c
        L5b:
            r2 = move-exception
        L5c:
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L75
            defpackage.zga.b(r2)     // Catch: java.lang.Throwable -> L75
        L63:
            gwt r2 = r1.b     // Catch: java.lang.Throwable -> L75
            com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity r3 = r1.a     // Catch: java.lang.Throwable -> L75
            boolean r2 = r2.d(r3)     // Catch: java.lang.Throwable -> L75
            if (r2 == 0) goto L55
            r1.c = r4     // Catch: java.lang.Throwable -> L75
        L6f:
            if (r0 == 0) goto L74
            r0.close()
        L74:
            return
        L75:
            r1 = move-exception
            if (r0 == 0) goto L7b
            r0.close()     // Catch: java.lang.Throwable -> L7b
        L7b:
            goto L7d
        L7c:
            throw r1
        L7d:
            goto L7c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.app.extensions.accountlinking.UriFlowActivity.onStart():void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        amis i = this.c.i();
        try {
            super.onStop();
            gwu c = c();
            if (c.c == 2) {
                c.c = 3;
            }
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
}
