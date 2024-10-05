package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daw implements Handler.Callback {
    private static final dav c = new dau(0);
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile cor d;
    private final Handler e;
    private final dav f;
    private final dao g;

    public daw(dav davVar, amsj amsjVar, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        dao dagVar;
        new adz();
        new adz();
        new Bundle();
        this.f = davVar == null ? c : davVar;
        this.e = new Handler(Looper.getMainLooper(), this);
        if (!cyd.b || !cyd.a) {
            dagVar = new dag();
        } else if (amsjVar.C(cob.class)) {
            dagVar = new dak();
        } else {
            dagVar = new dan();
        }
        this.g = dagVar;
    }

    private static Activity e(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    private static void f(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    private static boolean g(Context context) {
        Activity e = e(context);
        return e == null || !e.isFinishing();
    }

    public final cor b(ci ciVar) {
        if (ddn.n()) {
            return a(ciVar.getApplicationContext());
        }
        f(ciVar);
        this.g.a(ciVar);
        dd supportFragmentManager = ciVar.getSupportFragmentManager();
        boolean g = g(ciVar);
        dbc d = d(supportFragmentManager);
        cor corVar = d.c;
        if (corVar == null) {
            corVar = this.f.a(cnv.b(ciVar), d.a, d.b, ciVar);
            if (g) {
                corVar.l();
            }
            d.c = corVar;
        }
        return corVar;
    }

    public final dat c(FragmentManager fragmentManager) {
        dat datVar = (dat) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (datVar != null) {
            return datVar;
        }
        dat datVar2 = (dat) this.a.get(fragmentManager);
        if (datVar2 != null) {
            return datVar2;
        }
        dat datVar3 = new dat();
        this.a.put(fragmentManager, datVar3);
        fragmentManager.beginTransaction().add(datVar3, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e.obtainMessage(1, fragmentManager).sendToTarget();
        return datVar3;
    }

    public final dbc d(dd ddVar) {
        dbc dbcVar = (dbc) ddVar.f("com.bumptech.glide.manager");
        if (dbcVar != null) {
            return dbcVar;
        }
        dbc dbcVar2 = (dbc) this.b.get(ddVar);
        if (dbcVar2 != null) {
            return dbcVar2;
        }
        dbc dbcVar3 = new dbc();
        this.b.put(ddVar, dbcVar3);
        dn k = ddVar.k();
        k.r(dbcVar3, "com.bumptech.glide.manager");
        k.k();
        this.e.obtainMessage(2, ddVar).sendToTarget();
        return dbcVar3;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object remove;
        Object obj2;
        boolean z;
        int i = message.what;
        Object obj3 = null;
        if (i == 1) {
            obj = (FragmentManager) message.obj;
            remove = this.a.remove(obj);
        } else {
            if (i != 2) {
                z = false;
                obj2 = null;
                if (z || obj3 != null || !Log.isLoggable("RMRetriever", 5)) {
                    return z;
                }
                String valueOf = String.valueOf(obj2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                sb.append("Failed to remove expected request manager fragment, manager: ");
                sb.append(valueOf);
                Log.w("RMRetriever", sb.toString());
                return true;
            }
            obj = (dd) message.obj;
            remove = this.b.remove(obj);
        }
        obj2 = obj;
        obj3 = remove;
        z = true;
        if (z) {
        }
        return z;
    }

    public final cor a(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (ddn.o() && !(context instanceof Application)) {
            if (context instanceof ci) {
                return b((ci) context);
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (ddn.n()) {
                    return a(activity.getApplicationContext());
                }
                if (activity instanceof ci) {
                    return b((ci) activity);
                }
                f(activity);
                this.g.a(activity);
                FragmentManager fragmentManager = activity.getFragmentManager();
                boolean g = g(activity);
                dat c2 = c(fragmentManager);
                cor corVar = c2.c;
                if (corVar != null) {
                    return corVar;
                }
                cor a = this.f.a(cnv.b(activity), c2.a, c2.b, activity);
                if (g) {
                    a.l();
                }
                c2.c = a;
                return a;
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return a(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = this.f.a(cnv.b(context.getApplicationContext()), new dad(), new dah(), context.getApplicationContext());
                }
            }
        }
        return this.d;
    }
}
