package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqn implements rpi {
    private final qpy a;
    private final int b;
    private final qox c;
    private final long d;
    private final long e;

    public qqn(qpy qpyVar, int i, qox qoxVar, long j, long j2) {
        this.a = qpyVar;
        this.b = i;
        this.c = qoxVar;
        this.d = j;
        this.e = j2;
    }

    public static ConnectionTelemetryConfiguration b(qpu qpuVar, qrx qrxVar, int i) {
        int[] iArr;
        int[] iArr2;
        ConnectionInfo connectionInfo = qrxVar.E;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = connectionInfo == null ? null : connectionInfo.d;
        if (connectionTelemetryConfiguration == null || !connectionTelemetryConfiguration.b || ((iArr = connectionTelemetryConfiguration.d) != null ? !oba.ai(iArr, i) : !((iArr2 = connectionTelemetryConfiguration.f) == null || !oba.ai(iArr2, i))) || qpuVar.k >= connectionTelemetryConfiguration.e) {
            return null;
        }
        return connectionTelemetryConfiguration;
    }

    @Override // defpackage.rpi
    public final void a(rpt rptVar) {
        qpu b;
        int i;
        int i2;
        int i3;
        int i4;
        long j;
        long j2;
        int i5;
        if (this.a.h()) {
            RootTelemetryConfiguration rootTelemetryConfiguration = qta.a().a;
            if ((rootTelemetryConfiguration == null || rootTelemetryConfiguration.b) && (b = this.a.b(this.c)) != null) {
                Object obj = b.b;
                if (obj instanceof qrx) {
                    int i6 = 0;
                    boolean z = this.d > 0;
                    qrx qrxVar = (qrx) obj;
                    int i7 = qrxVar.A;
                    if (rootTelemetryConfiguration != null) {
                        z &= rootTelemetryConfiguration.c;
                        int i8 = rootTelemetryConfiguration.d;
                        int i9 = rootTelemetryConfiguration.e;
                        i = rootTelemetryConfiguration.a;
                        if (qrxVar.K() && !qrxVar.x()) {
                            ConnectionTelemetryConfiguration b2 = b(b, qrxVar, this.b);
                            if (b2 == null) {
                                return;
                            }
                            boolean z2 = b2.c && this.d > 0;
                            i9 = b2.e;
                            z = z2;
                        }
                        i2 = i8;
                        i3 = i9;
                    } else {
                        i = 0;
                        i2 = 5000;
                        i3 = 100;
                    }
                    qpy qpyVar = this.a;
                    if (rptVar.k()) {
                        i4 = 0;
                    } else {
                        if (((rpx) rptVar).c) {
                            i6 = 100;
                        } else {
                            Exception f = rptVar.f();
                            if (f instanceof qnx) {
                                Status status = ((qnx) f).a;
                                int i10 = status.g;
                                ConnectionResult connectionResult = status.j;
                                i4 = connectionResult == null ? -1 : connectionResult.c;
                                i6 = i10;
                            } else {
                                i6 = 101;
                            }
                        }
                        i4 = -1;
                    }
                    if (z) {
                        long j3 = this.d;
                        long currentTimeMillis = System.currentTimeMillis();
                        i5 = (int) (SystemClock.elapsedRealtime() - this.e);
                        j = j3;
                        j2 = currentTimeMillis;
                    } else {
                        j = 0;
                        j2 = 0;
                        i5 = -1;
                    }
                    MethodInvocation methodInvocation = new MethodInvocation(this.b, i6, i4, j, j2, null, null, i7, i5);
                    Handler handler = qpyVar.o;
                    handler.sendMessage(handler.obtainMessage(18, new qqo(methodInvocation, i, i2, i3)));
                }
            }
        }
    }
}
