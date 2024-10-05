package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdRequest;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlq extends qob implements rlv {
    private static final qnw a;
    private static final pse e;
    private static final qar f;
    private String b;
    private String c;
    private int d;

    static {
        pse pseVar = new pse();
        e = pseVar;
        rlo rloVar = new rlo();
        f = rloVar;
        a = new qnw("MobileDataPlan.API", rloVar, pseVar, null, null, null, null);
    }

    public rlq(Context context, rlu rluVar) {
        super(context, a, rluVar, qoa.a);
        String packageName = context.getApplicationContext().getPackageName();
        this.b = packageName;
        try {
            if (packageName == null) {
                throw new PackageManager.NameNotFoundException();
            }
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(this.b, 0);
            this.c = packageInfo.versionName;
            this.d = packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            this.b = "PACKAGE_NAME_NOT_FOUND";
            this.c = "PACKAGE_VERSION_NOT_FOUND";
            this.d = -1;
        }
    }

    @Override // defpackage.rlv
    public final rpt a(MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest) {
        qip.ap(true, "getCarrierPlanId needs a non-null valid API key provided by GTAF team.");
        qip.ay(mdpCarrierPlanIdRequest.a, "getCarrierPlanId needs a valid API key provided by GTAF team.");
        final rlr rlrVar = new rlr(mdpCarrierPlanIdRequest);
        Bundle bundle = mdpCarrierPlanIdRequest.b;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("client_package_name", this.b);
        bundle.putString("client_version_name", this.c);
        bundle.putLong("client_version_code", this.d);
        rlrVar.a.b = bundle;
        qrd b = qre.b();
        b.c = 16201;
        b.a = new qqu() { // from class: rln
            @Override // defpackage.qqu
            public final void a(Object obj, Object obj2) {
                rlr rlrVar2 = rlr.this;
                rlp rlpVar = new rlp((rpv) obj2);
                rlx rlxVar = (rlx) ((rly) obj).D();
                MdpCarrierPlanIdRequest mdpCarrierPlanIdRequest2 = rlrVar2.a;
                Parcel pn = rlxVar.pn();
                ecr.i(pn, rlpVar);
                ecr.g(pn, mdpCarrierPlanIdRequest2);
                rlxVar.pp(1, pn);
            }
        };
        return w(b.a());
    }
}
