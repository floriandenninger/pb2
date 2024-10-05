package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.os.Parcel;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.util.concurrent.LinkedBlockingQueue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qxj implements qro, qrp {
    public final LinkedBlockingQueue a;
    public final long b;
    protected final pvj c;
    private final String d;
    private final String e;
    private final HandlerThread f;
    private final qxe g;
    private final int h;

    public qxj(Context context, int i, String str, String str2, qxe qxeVar) {
        this.d = str;
        this.h = i;
        this.e = str2;
        this.g = qxeVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.f = handlerThread;
        handlerThread.start();
        this.b = System.currentTimeMillis();
        pvj pvjVar = new pvj(context, handlerThread.getLooper(), this, this, 19621000);
        this.c = pvjVar;
        this.a = new LinkedBlockingQueue();
        pvjVar.G();
    }

    public static ProgramResponse d() {
        return new ProgramResponse(1, null, 1);
    }

    @Override // defpackage.qro
    public final void a(int i) {
        try {
            f(4011, this.b);
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    @Override // defpackage.qro
    public final void b() {
        qxr h = h();
        if (h != null) {
            try {
                ProgramRequest programRequest = new ProgramRequest(1, 1, this.h - 1, this.d, this.e);
                Parcel pn = h.pn();
                ecr.g(pn, programRequest);
                Parcel po = h.po(3, pn);
                ProgramResponse programResponse = (ProgramResponse) ecr.a(po, ProgramResponse.CREATOR);
                po.recycle();
                f(5011, this.b);
                this.a.put(programResponse);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // defpackage.qrp
    public final void c(ConnectionResult connectionResult) {
        try {
            f(4012, this.b);
            this.a.put(d());
        } catch (InterruptedException unused) {
        }
    }

    public final void e() {
        pvj pvjVar = this.c;
        if (pvjVar != null) {
            if (pvjVar.w() || this.c.x()) {
                this.c.l();
            }
        }
    }

    public final void f(int i, long j) {
        g(i, j, null);
    }

    public final void g(int i, long j, Exception exc) {
        this.g.c(i, System.currentTimeMillis() - j, exc);
    }

    protected final qxr h() {
        try {
            return this.c.e();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
