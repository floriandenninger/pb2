package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.mobiledataplan.MdpCarrierPlanIdResponse;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class qxc implements rox {
    private final /* synthetic */ int g;
    public static final /* synthetic */ qxc f = new qxc(6);
    public static final /* synthetic */ qxc e = new qxc(5);
    public static final /* synthetic */ qxc d = new qxc(4);
    public static final /* synthetic */ qxc c = new qxc(2);
    public static final /* synthetic */ qxc b = new qxc(1);
    public static final /* synthetic */ qxc a = new qxc(0);

    public /* synthetic */ qxc(int i) {
        this.g = i;
    }

    @Override // defpackage.rox
    public final Object a(rpt rptVar) {
        switch (this.g) {
            case 0:
                return Boolean.valueOf(rptVar.k());
            case 1:
                Executor executor = qms.a;
                if (!rptVar.k()) {
                    throw new IOException("SERVICE_NOT_AVAILABLE", rptVar.f());
                }
                return (Bundle) rptVar.g();
            case 2:
                int i = zjt.c;
                if (!rptVar.k() || ((MdpCarrierPlanIdResponse) rptVar.g()).f == null) {
                    throw new zjs(rptVar.f());
                }
                String.valueOf(String.valueOf(rptVar.g())).length();
                return new zjp(((MdpCarrierPlanIdResponse) rptVar.g()).e, ((MdpCarrierPlanIdResponse) rptVar.g()).f);
            case 3:
                Bundle bundle = (Bundle) rptVar.h(IOException.class);
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                String valueOf = String.valueOf(bundle);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                sb.append("Unexpected response: ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            case 4:
                return ((ammr) rptVar.g()).b;
            case 5:
                return -1;
            case 6:
                return 403;
            default:
                Bundle bundle2 = (Bundle) rptVar.h(IOException.class);
                if (bundle2 == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string3 = bundle2.getString("registration_id");
                if (string3 != null || (string3 = bundle2.getString("unregistered")) != null) {
                    return string3;
                }
                String string4 = bundle2.getString("error");
                if ("RST".equals(string4)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string4 != null) {
                    throw new IOException(string4);
                }
                String valueOf2 = String.valueOf(bundle2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21);
                sb2.append("Unexpected response: ");
                sb2.append(valueOf2);
                Log.w("FirebaseMessaging", sb2.toString(), new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }
}
