package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qyk {
    public final qyc a;
    public final Executor b;
    public final qyl c;

    public qyk(Context context, Executor executor) {
        qyl qylVar = new qyl(context.getApplicationContext());
        qyq qyqVar = new qyq(context);
        this.c = qylVar;
        this.a = qyqVar;
        this.b = executor;
    }

    public static qyf a(GmsDeviceComplianceResponse gmsDeviceComplianceResponse) {
        int i = 1;
        if (gmsDeviceComplianceResponse == null) {
            i = 3;
        } else if (true == gmsDeviceComplianceResponse.b) {
            i = 4;
        }
        return new qyf(i);
    }

    public final rpt b() {
        final rpv rpvVar = new rpv();
        this.b.execute(new Runnable() { // from class: qyj
            @Override // java.lang.Runnable
            public final void run() {
                final qyk qykVar = qyk.this;
                rpv rpvVar2 = rpvVar;
                System.nanoTime();
                qyf a = qyk.a(qykVar.c.a());
                System.nanoTime();
                if (a.a()) {
                    rpvVar2.d(a);
                }
                qog qogVar = qykVar.a;
                qrd b = qre.b();
                b.a = new qes(4);
                b.b = new Feature[]{qyb.a};
                b.b();
                b.c = 13801;
                rpt e = ((qob) qogVar).t(b.a()).e(qykVar.b, new rps() { // from class: qyi
                    @Override // defpackage.rps
                    public final rpt a(Object obj) {
                        GmsDeviceComplianceResponse gmsDeviceComplianceResponse = (GmsDeviceComplianceResponse) obj;
                        qyk.this.c.b(gmsDeviceComplianceResponse);
                        return rqr.c(qyk.a(gmsDeviceComplianceResponse));
                    }
                });
                e.p(qykVar.b, new qyh(rpvVar2, 0));
                e.o(qykVar.b, new qyg(rpvVar2, 0));
            }
        });
        return rpvVar.a;
    }
}
