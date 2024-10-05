package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rnk extends qsg {
    private static volatile Bundle c;
    private static volatile Bundle d;
    public final String a;
    public final String b;
    private final HashMap e;

    public rnk(Context context, Looper looper, qod qodVar, qoe qoeVar, String str, qrz qrzVar) {
        super(context.getApplicationContext(), looper, 5, qrzVar, qodVar, qoeVar);
        this.e = new HashMap();
        this.a = str;
        this.b = qrzVar.e;
    }

    @Override // defpackage.qrx
    public final boolean R() {
        return true;
    }

    @Override // defpackage.qsg, defpackage.qrx, defpackage.qnv
    public final int a() {
        return 12451000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof rnd) {
            return (rnd) queryLocalInterface;
        }
        return new rnd(iBinder);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final String c() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    @Override // defpackage.qrx
    protected final String d() {
        return "com.google.android.gms.people.service.START";
    }

    @Override // defpackage.qrx
    public final Feature[] h() {
        return rmr.n;
    }

    @Override // defpackage.qrx
    protected final Bundle i() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.b);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    public final synchronized void k(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        rnl.a = bundle.getBoolean("use_contactables_api", true);
        rnr.a.b(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
        c = bundle.getBundle("config.email_type_map");
        d = bundle.getBundle("config.phone_type_map");
    }

    @Override // defpackage.qrx, defpackage.qnv
    public final void l() {
        synchronized (this.e) {
            if (w()) {
                for (rnf rnfVar : this.e.values()) {
                    rnfVar.a.a();
                    try {
                        try {
                            p().a(rnfVar, false, 0);
                        } catch (RemoteException e) {
                            rqr.j("Failed to unregister listener", e);
                        }
                    } catch (IllegalStateException e2) {
                        rqr.j("PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.e.clear();
        }
        super.l();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.qrx
    public final void m(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (i == 0) {
            if (bundle != null) {
                k(bundle.getBundle("post_init_configuration"));
            }
            i = 0;
        }
        super.m(i, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i2);
    }

    public final void o(qpc qpcVar, int i) {
        super.H();
        rng rngVar = new rng(qpcVar);
        try {
            rnd p = p();
            Parcel pn = p.pn();
            ecr.i(pn, rngVar);
            ecr.e(pn, false);
            ecr.e(pn, false);
            pn.writeString(null);
            pn.writeString(null);
            pn.writeInt(i);
            p.pp(305, pn);
        } catch (RemoteException unused) {
            rngVar.a(8, null, null);
        }
    }

    public final rnd p() {
        return (rnd) super.D();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ Status n(int i, Bundle bundle) {
        return new Status(i, (String) null, bundle == null ? null : (PendingIntent) bundle.getParcelable("pendingIntent"));
    }
}
