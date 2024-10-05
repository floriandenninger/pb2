package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.common.Feature;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qft {
    public static final qkw a = new qkw("CastContext");
    public static final Object b = new Object();
    public static qft c;
    public final Context d;
    public final qgd e;
    public final qgw f;
    public final qfz g;
    public final CastOptions h;
    private final List i;
    private final qhk j;
    private qgy k;

    public qft(Context context, CastOptions castOptions, List list, qhk qhkVar) {
        this.d = context.getApplicationContext();
        this.h = castOptions;
        this.j = qhkVar;
        this.i = list;
        g();
        HashMap hashMap = new HashMap();
        qgy qgyVar = this.k;
        if (qgyVar != null) {
            hashMap.put(qgyVar.b, qgyVar.d);
        }
        int i = 0;
        int i2 = 1;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qgy qgyVar2 = (qgy) it.next();
                qip.az(qgyVar2, "Additional SessionProvider must not be null.");
                String str = qgyVar2.b;
                qip.ay(str, "Category for SessionProvider must not be null or empty string.");
                qip.ap(!hashMap.containsKey(str), String.format("SessionProvider for category %s already added", str));
                hashMap.put(str, qgyVar2.d);
            }
        }
        try {
            Context context2 = this.d;
            qgd a2 = qhh.c(context2).a(qve.a(context2.getApplicationContext()), castOptions, qhkVar, hashMap);
            this.e = a2;
            try {
                this.g = new qfz(a2.a());
                try {
                    qgw qgwVar = new qgw(a2.f(), this.d);
                    this.f = qgwVar;
                    e(this.d);
                    new qkw("PrecacheManager");
                    qhy qhyVar = qhkVar.b;
                    if (qhyVar != null) {
                        qhyVar.d = qgwVar;
                    }
                    qkd e = e(this.d);
                    qrd b2 = qre.b();
                    b2.a = new qjy(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}, i2);
                    b2.b = new Feature[]{qer.d};
                    b2.b();
                    b2.c = 8425;
                    e.t(b2.a()).r(new rpo() { // from class: qfq
                        @Override // defpackage.rpo
                        public final void d(Object obj) {
                            final qft qftVar = qft.this;
                            Bundle bundle = (Bundle) obj;
                            boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED");
                            boolean z2 = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED");
                            if (!z) {
                                if (!z2) {
                                    return;
                                } else {
                                    z2 = true;
                                }
                            }
                            String packageName = qftVar.d.getPackageName();
                            String format = String.format(Locale.ROOT, "%s.%s", qftVar.d.getPackageName(), "client_cast_analytics_data");
                            oxa.b(qftVar.d);
                            owy a3 = oxa.a().c().a("CAST_SENDER_SDK", anyv.b);
                            long j = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE");
                            final SharedPreferences sharedPreferences = qftVar.d.getApplicationContext().getSharedPreferences(format, 0);
                            final qgz qgzVar = new qgz(sharedPreferences, a3, j);
                            if (z) {
                                qkd e2 = qft.e(qftVar.d);
                                qrd b3 = qre.b();
                                b3.a = new qjy(new String[]{"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"}, 2);
                                b3.b = new Feature[]{qer.g};
                                b3.b();
                                b3.c = 8426;
                                e2.t(b3.a()).r(new rpo() { // from class: qfr
                                    @Override // defpackage.rpo
                                    public final void d(Object obj2) {
                                        qft qftVar2 = qft.this;
                                        qftVar2.f.c(new qhb(new qhc(sharedPreferences, qgzVar, (Bundle) obj2, qftVar2.d.getPackageName())), qfy.class);
                                    }
                                });
                            }
                            if (z2) {
                                qip.an(sharedPreferences);
                                qhg.e(sharedPreferences, qgzVar, packageName);
                                qhg.d(andg.CAST_CONTEXT);
                            }
                        }
                    });
                    qkd e2 = e(this.d);
                    qrd b3 = qre.b();
                    b3.a = new qjy(new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, i);
                    b3.b = new Feature[]{qer.h};
                    b3.b();
                    b3.c = 8427;
                    e2.t(b3.a()).r(new rpo() { // from class: qfp
                        @Override // defpackage.rpo
                        public final void d(Object obj) {
                            qip.k((Bundle) obj, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
                        }
                    });
                } catch (RemoteException e3) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e3);
                }
            } catch (RemoteException e4) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e4);
            }
        } catch (RemoteException e5) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e5);
        }
    }

    public static qft a() {
        qip.as("Must be called from the main thread.");
        return c;
    }

    public static qft b(Context context) {
        qip.as("Must be called from the main thread.");
        if (c == null) {
            synchronized (b) {
                if (c == null) {
                    qgs h = h(context.getApplicationContext());
                    CastOptions castOptions = h.getCastOptions(context.getApplicationContext());
                    try {
                        c = new qft(context, castOptions, h.getAdditionalSessionProviders(context.getApplicationContext()), new qhk(bpw.b(context), castOptions));
                    } catch (qgr e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return c;
    }

    public static qkd e(Context context) {
        return new qkd(context);
    }

    public static rpt f(final Context context, Executor executor) {
        qip.as("Must be called from the main thread.");
        qft qftVar = c;
        if (qftVar == null) {
            final qgs h = h(context.getApplicationContext());
            final CastOptions castOptions = h.getCastOptions(context.getApplicationContext());
            final qhk qhkVar = new qhk(bpw.b(context), castOptions);
            return rqr.a(executor, new Callable() { // from class: qfs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Context context2 = context;
                    CastOptions castOptions2 = castOptions;
                    qgs qgsVar = h;
                    qhk qhkVar2 = qhkVar;
                    synchronized (qft.b) {
                        if (qft.c == null) {
                            qft.c = new qft(context2, castOptions2, qgsVar.getAdditionalSessionProviders(context2.getApplicationContext()), qhkVar2);
                        }
                    }
                    return qft.c;
                }
            });
        }
        return rqr.c(qftVar);
    }

    private static qgs h(Context context) {
        try {
            Bundle bundle = qtu.b(context).c(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                a.b("Bundle is null", new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string == null) {
                throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
            }
            return (qgs) Class.forName(string).asSubclass(qgs.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final CastOptions c() {
        qip.as("Must be called from the main thread.");
        return this.h;
    }

    public final qgw d() {
        qip.as("Must be called from the main thread.");
        return this.f;
    }

    public final void g() {
        this.k = !TextUtils.isEmpty(this.h.a) ? new qgy(this.d, this.h, this.j) : null;
    }
}
