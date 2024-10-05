package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxi implements qro, qrp {
    public final LinkedBlockingQueue a;
    protected final pvj b;
    private final String c;
    private final String d;
    private final HandlerThread e;

    public qxi(Context context, String str, String str2) {
        this.c = str;
        this.d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        pvj pvjVar = new pvj(context, handlerThread.getLooper(), this, this, 9200000);
        this.b = pvjVar;
        this.a = new LinkedBlockingQueue();
        pvjVar.G();
    }

    public static dvo d() {
        aone createBuilder = dvo.a.createBuilder();
        createBuilder.copyOnWrite();
        dvo dvoVar = (dvo) createBuilder.instance;
        dvoVar.b |= 524288;
        dvoVar.p = 32768L;
        return (dvo) createBuilder.build();
    }

    @Override // defpackage.qro
    public final void a(int i) {
        try {
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.qro
    public final void b() {
        qxr f = f();
        if (f != null) {
            try {
                try {
                    GassRequestParcel gassRequestParcel = new GassRequestParcel(1, this.c, this.d);
                    Parcel pn = f.pn();
                    ecr.g(pn, gassRequestParcel);
                    Parcel po = f.po(1, pn);
                    GassResponseParcel gassResponseParcel = (GassResponseParcel) ecr.a(po, GassResponseParcel.CREATOR);
                    po.recycle();
                    if (gassResponseParcel.b == null) {
                        try {
                            gassResponseParcel.b = (dvo) aonm.parseFrom(dvo.a, gassResponseParcel.c, aomw.a());
                            gassResponseParcel.c = null;
                        } catch (aoob | NullPointerException e) {
                            throw new IllegalStateException(e);
                        }
                    }
                    gassResponseParcel.a();
                    this.a.put(gassResponseParcel.b);
                } catch (Throwable unused) {
                    this.a.put(d());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th) {
                e();
                this.e.quit();
                throw th;
            }
            e();
            this.e.quit();
        }
    }

    @Override // defpackage.qrp
    public final void c(ConnectionResult connectionResult) {
        try {
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        pvj pvjVar = this.b;
        if (pvjVar != null) {
            if (pvjVar.w() || this.b.x()) {
                this.b.l();
            }
        }
    }

    protected final qxr f() {
        try {
            return this.b.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
