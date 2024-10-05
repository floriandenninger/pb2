package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qth extends qob implements qtb {
    public static final /* synthetic */ int a = 0;
    private static final qnw b;
    private static final pse c;
    private static final qar d;

    static {
        pse pseVar = new pse();
        c = pseVar;
        qtg qtgVar = new qtg();
        d = qtgVar;
        b = new qnw("ClientTelemetry.API", qtgVar, pseVar, null, null, null, null);
    }

    public qth(Context context, qtc qtcVar) {
        super(context, b, qtcVar, qoa.a);
    }

    @Override // defpackage.qtb
    public final void a(final TelemetryData telemetryData) {
        qrd b2 = qre.b();
        b2.b = new Feature[]{qlx.a};
        b2.b();
        b2.a = new qqu() { // from class: qtf
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                TelemetryData telemetryData2 = TelemetryData.this;
                int i = qth.a;
                qte qteVar = (qte) ((qti) obj).D();
                Parcel pn = qteVar.pn();
                ecr.g(pn, telemetryData2);
                qteVar.pq(1, pn);
                ((rpv) obj2).b(null);
            }
        };
        s(b2.a());
    }
}
