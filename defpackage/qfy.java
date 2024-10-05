package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.media.CastMediaOptions;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.youtube.R;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qfy extends qgv {
    public static final /* synthetic */ int f = 0;
    public final Set a;
    public final qgf b;
    public qep c;
    public qjk d;
    public qhy e;
    private final Context h;
    private final CastOptions i;
    private final qju j;
    private CastDevice k;

    static {
        new qkw("CastSession");
    }

    public qfy(Context context, String str, String str2, CastOptions castOptions, qju qjuVar) {
        super(context, str, str2);
        this.a = new HashSet();
        this.h = context.getApplicationContext();
        this.i = castOptions;
        this.j = qjuVar;
        this.b = qhh.a(context, castOptions, m(), new qga(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void p(Bundle bundle) {
        CastDevice a = CastDevice.a(bundle);
        this.k = a;
        if (a == null) {
            qip.as("Must be called from the main thread.");
            qgl qglVar = this.g;
            if (qglVar != null) {
                try {
                    if (qglVar.j()) {
                        qgl qglVar2 = this.g;
                        if (qglVar2 != null) {
                            try {
                                qglVar2.k();
                                return;
                            } catch (RemoteException unused) {
                                return;
                            }
                        }
                        return;
                    }
                } catch (RemoteException unused2) {
                }
            }
            qgl qglVar3 = this.g;
            if (qglVar3 == null) {
                return;
            }
            try {
                qglVar3.l();
                return;
            } catch (RemoteException unused3) {
                return;
            }
        }
        qep qepVar = this.c;
        if (qepVar != null) {
            qepVar.b();
            this.c = null;
        }
        CastDevice castDevice = this.k;
        qip.an(castDevice);
        Bundle bundle2 = new Bundle();
        CastOptions castOptions = this.i;
        CastMediaOptions castMediaOptions = castOptions == null ? null : castOptions.e;
        NotificationOptions notificationOptions = castMediaOptions != null ? castMediaOptions.c : null;
        boolean z = castMediaOptions != null && castMediaOptions.d;
        Intent intent = new Intent(this.h, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(this.h.getPackageName());
        boolean z2 = !this.h.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_FRAMEWORK_NOTIFICATION_ENABLED", notificationOptions != null);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_REMOTE_CONTROL_NOTIFICATION_ENABLED", z);
        bundle2.putBoolean("com.google.android.gms.cast.EXTRA_CAST_ALWAYS_FOLLOW_SESSION_ENABLED", z2);
        qel qelVar = new qel(castDevice, new qfw(this), null, null, null);
        qelVar.b = bundle2;
        qep a2 = qeo.a(this.h, new qem(qelVar));
        ((qfe) a2).t.add(new qfx(this));
        this.c = a2;
        final qfe qfeVar = (qfe) a2;
        qob qobVar = (qob) a2;
        qql q = qobVar.q(qfeVar.b, "castDeviceControllerListenerKey");
        qqs a3 = qqt.a();
        qqu qquVar = new qqu() { // from class: qet
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                qfe qfeVar2 = qfe.this;
                qkn qknVar = (qkn) obj;
                qkr qkrVar = (qkr) qknVar.D();
                qfd qfdVar = qfeVar2.b;
                Parcel pn = qkrVar.pn();
                ecr.i(pn, qfdVar);
                qkrVar.pq(18, pn);
                qkr qkrVar2 = (qkr) qknVar.D();
                qkrVar2.pq(17, qkrVar2.pn());
                ((rpv) obj2).b(null);
            }
        };
        qes qesVar = qes.a;
        a3.c = q;
        a3.a = qquVar;
        a3.b = qesVar;
        a3.d = new Feature[]{qer.b};
        a3.e = 8428;
        qobVar.u(a3.a());
    }

    @Override // defpackage.qgv
    public final long a() {
        long g;
        qip.as("Must be called from the main thread.");
        qjk qjkVar = this.d;
        if (qjkVar == null) {
            return 0L;
        }
        synchronized (qjkVar.a) {
            qip.as("Must be called from the main thread.");
            g = qjkVar.b.g();
        }
        return g - this.d.c();
    }

    public final CastDevice b() {
        qip.as("Must be called from the main thread.");
        return this.k;
    }

    public final qjk c() {
        qip.as("Must be called from the main thread.");
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void e(boolean z) {
        qgf qgfVar = this.b;
        if (qgfVar != null) {
            try {
                qgfVar.j(z);
            } catch (RemoteException unused) {
            }
            n(0);
            qhy qhyVar = this.e;
            if (qhyVar == null || qhyVar.c == 0 || qhyVar.f == null) {
                return;
            }
            Iterator it = new HashSet(qhyVar.b).iterator();
            if (it.hasNext()) {
                throw null;
            }
            qhyVar.c = 0;
            qhyVar.f = null;
            qhyVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void f(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void g(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void h(Bundle bundle) {
        p(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void i(Bundle bundle) {
        p(bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qgv
    public final void j(Bundle bundle) {
        this.k = CastDevice.a(bundle);
    }

    public final void k(String str, String str2) {
        qip.as("Must be called from the main thread.");
        qep qepVar = this.c;
        if (qepVar == null) {
            new qqz(Looper.getMainLooper()).n(new Status(17));
        } else {
            rpt a = qepVar.a(str, str2);
            final qhv qhvVar = new qhv();
            a.r(new rpo() { // from class: qhu
                @Override // defpackage.rpo
                public final void d(Object obj) {
                    qhv.this.n(new Status(0));
                }
            });
            a.n(new rpl() { // from class: qht
                @Override // defpackage.rpl
                public final void c(Exception exc) {
                    qhv qhvVar2 = qhv.this;
                    Status status = new Status(8, "unknown error");
                    if (exc instanceof qnx) {
                        qnx qnxVar = (qnx) exc;
                        status = new Status(qnxVar.a(), qnxVar.getMessage());
                    }
                    int i = qfy.f;
                    qhvVar2.n(status);
                }
            });
        }
    }

    public final void l(rpt rptVar) {
        CastOptions castOptions;
        if (this.b == null) {
            return;
        }
        try {
            if (!rptVar.k()) {
                Exception f2 = rptVar.f();
                if (f2 instanceof qnx) {
                    this.b.f(((qnx) f2).a());
                    return;
                } else {
                    this.b.f(2476);
                    return;
                }
            }
            qkg qkgVar = (qkg) rptVar.g();
            if (!qkgVar.a.c()) {
                this.b.f(qkgVar.a.g);
                return;
            }
            qjk qjkVar = new qjk(new qla());
            this.d = qjkVar;
            qjkVar.j(this.c);
            this.d.i();
            qju qjuVar = this.j;
            qjk qjkVar2 = this.d;
            CastDevice b = b();
            if (!qjuVar.i && (castOptions = qjuVar.b) != null && castOptions.e != null && qjkVar2 != null && b != null) {
                qjuVar.e = qjkVar2;
                qjk qjkVar3 = qjuVar.e;
                qip.as("Must be called from the main thread.");
                qjkVar3.c.add(qjuVar);
                qjuVar.f = b;
                ComponentName componentName = new ComponentName(qjuVar.a, qjuVar.b.e.a);
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setComponent(componentName);
                PendingIntent b2 = rai.b(qjuVar.a, 0, intent, rai.a);
                if (qjuVar.b.e.e) {
                    qjuVar.g = new hn(qjuVar.a, "CastMediaSession", componentName, b2);
                    qjuVar.l(0, null);
                    CastDevice castDevice = qjuVar.f;
                    if (castDevice != null && !TextUtils.isEmpty(castDevice.d)) {
                        hn hnVar = qjuVar.g;
                        anyx anyxVar = new anyx((byte[]) null);
                        anyxVar.r("android.media.metadata.ALBUM_ARTIST", qjuVar.a.getResources().getString(R.string.cast_casting_to_device, qjuVar.f.d));
                        hnVar.h(anyxVar.o());
                    }
                    qjuVar.h = new qjt(qjuVar);
                    qjuVar.g.f(qjuVar.h);
                    qjuVar.g.e(true);
                    qhk qhkVar = qjuVar.j;
                    bpw.m(qjuVar.g);
                }
                qjuVar.i = true;
                qjuVar.m();
            }
            qgf qgfVar = this.b;
            ApplicationMetadata applicationMetadata = qkgVar.b;
            qip.an(applicationMetadata);
            String str = qkgVar.c;
            String str2 = qkgVar.d;
            qip.an(str2);
            qgfVar.a(applicationMetadata, str, str2, qkgVar.e);
        } catch (RemoteException unused) {
        }
    }

    public final void d(int i) {
        qju qjuVar = this.j;
        if (qjuVar.i) {
            qjuVar.i = false;
            qjk qjkVar = qjuVar.e;
            if (qjkVar != null) {
                qip.as("Must be called from the main thread.");
                qjkVar.c.remove(qjuVar);
            }
            qhk qhkVar = qjuVar.j;
            bpw.m(null);
            qjuVar.c.a();
            qjm qjmVar = qjuVar.d;
            if (qjmVar != null) {
                qjmVar.a();
            }
            hn hnVar = qjuVar.g;
            if (hnVar != null) {
                hnVar.j(null);
                qjuVar.g.f(null);
                qjuVar.g.h(new anyx((byte[]) null).o());
                qjuVar.l(0, null);
                qjuVar.g.e(false);
                qjuVar.g.d();
                qjuVar.g = null;
            }
            qjuVar.e = null;
            qjuVar.f = null;
            qjuVar.h = null;
            qjuVar.j();
            if (i == 0) {
                qjuVar.k();
            }
        }
        qep qepVar = this.c;
        if (qepVar != null) {
            qepVar.b();
            this.c = null;
        }
        this.k = null;
        qjk qjkVar2 = this.d;
        if (qjkVar2 != null) {
            qjkVar2.j(null);
            this.d = null;
        }
    }
}
