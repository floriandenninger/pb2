package com.google.android.apps.youtube.app.application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.apps.youtube.app.watchwhile.WatchWhileActivity;
import defpackage.aloh;
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
import defpackage.elp;
import defpackage.eme;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class Shell_MediaSearchActivity extends elp implements amei {
    private eme l;
    private final amhn m = amhn.a(this);
    private boolean n;
    private Context o;
    private aom p;
    private boolean q;

    public Shell_MediaSearchActivity() {
        SystemClock.elapsedRealtime();
    }

    private final eme o() {
        p();
        return this.l;
    }

    private final void p() {
        if (this.l == null) {
            if (!this.n) {
                throw new IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.q && !isFinishing()) {
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
                        aloh li = ((eed) lM).a.li();
                        Activity a = ((eed) lM).a();
                        if (a instanceof Shell_MediaSearchActivity) {
                            this.l = new eme(li, (Shell_MediaSearchActivity) a, (alwk) ((eed) lM).e.get(), ((eed) lM).a.bj(), null, null, null, null);
                            l.close();
                            return;
                        }
                        String valueOf = String.valueOf(eme.class);
                        String valueOf2 = String.valueOf(a.getClass());
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 158 + String.valueOf(valueOf2).length());
                        sb.append("Attempt to inject a Activity wrapper of type ");
                        sb.append(valueOf);
                        sb.append(", but the wrapper available is of type: ");
                        sb.append(valueOf2);
                        sb.append(". Does your peer's @Inject constructor reference the wrong wrapper class?");
                        throw new IllegalStateException(sb.toString());
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
            baseContext = this.o;
        }
        amkq.i(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ml, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        this.o = context;
        amkq.h(context);
        super.attachBaseContext(context);
        this.o = null;
    }

    @Override // defpackage.elj
    public final /* synthetic */ axps b() {
        return amel.a(this);
    }

    @Override // defpackage.emb
    protected final int f() {
        return 5;
    }

    @Override // defpackage.emb
    protected final int g() {
        o();
        return 67108864;
    }

    @Override // defpackage.zv, defpackage.er, defpackage.aok
    public final aof getLifecycle() {
        if (this.p == null) {
            this.p = new amej(this);
        }
        return this.p;
    }

    @Override // defpackage.emb
    protected final int h() {
        return 0;
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

    @Override // defpackage.emb
    protected final Class j() {
        aloh alohVar = o().a;
        return WatchWhileActivity.class;
    }

    @Override // defpackage.emb
    protected final boolean l(boolean z) {
        return true;
    }

    @Override // defpackage.emb
    protected final boolean m() {
        return true;
    }

    @Override // defpackage.emb
    protected final void n() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.vcc, defpackage.ci, defpackage.zv, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        amis p = this.m.p();
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
        amis b = this.m.b();
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
    @Override // defpackage.emb, defpackage.vcc, defpackage.ci, defpackage.zv, defpackage.er, android.app.Activity
    public final void onCreate(Bundle bundle) {
        amis q = this.m.q();
        try {
            this.n = true;
            p();
            ((amej) getLifecycle()).h(this.m);
            lM().kb().a();
            super.onCreate(bundle);
            this.n = false;
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
        amis r = this.m.r();
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
        amis c = this.m.c();
        try {
            super.onDestroy();
            this.q = true;
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
        amis d = this.m.d(intent);
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

    @Override // defpackage.vcc, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        amis s = this.m.s();
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
        amis e = this.m.e();
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
        amis t = this.m.t();
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
        amis f = this.m.f();
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
        amis u = this.m.u();
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
        amis g = this.m.g();
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
    @Override // defpackage.vcc, defpackage.zv, defpackage.er, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        amis v = this.m.v();
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
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStart() {
        amis h = this.m.h();
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
    @Override // defpackage.vcc, defpackage.ml, defpackage.ci, android.app.Activity
    public final void onStop() {
        amis i = this.m.i();
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
        amis j = this.m.j();
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
        amis k = this.m.k();
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
