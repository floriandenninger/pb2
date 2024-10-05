package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class uax implements uat {
    private final Context a;
    private final uds b;
    private final txa c;
    private final axpg d;
    private final axpg e;
    private final axpg f;
    private final axpg g;
    private final axpg h;

    static {
        Charset.forName("UTF-8");
    }

    public uax(Context context, uds udsVar, txa txaVar, axpg axpgVar, axpg axpgVar2, axpg axpgVar3, axpg axpgVar4, axpg axpgVar5) {
        this.a = context;
        this.b = udsVar;
        this.c = txaVar;
        this.d = axpgVar;
        this.e = axpgVar2;
        this.f = axpgVar3;
        this.g = axpgVar4;
        this.h = axpgVar5;
    }

    @Override // defpackage.uat
    public final void a(twu twuVar, long j, aokf aokfVar) {
        boolean z = twuVar != null;
        uqq.i();
        amkq.E(z);
        String str = twuVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aokfVar.j);
        ubb ubbVar = (ubb) this.e.get();
        if (!tyo.m(this.a)) {
            tzk.e("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_UPDATED_THREADS");
            ubbVar.e(bundle);
        } else {
            try {
                this.b.a(twuVar, 2, ubbVar, bundle);
            } catch (udq unused) {
                tzk.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_UPDATED_THREADS");
                ubbVar.e(bundle);
            }
        }
    }

    @Override // defpackage.uat
    public final void b(twu twuVar, aokw aokwVar, String str, tys tysVar, List list) {
        boolean z = twuVar != null;
        uqq.i();
        amkq.E(z);
        amkq.E(!list.isEmpty());
        String str2 = twuVar.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aojv aojvVar = (aojv) it.next();
            aone createBuilder = ucy.a.createBuilder();
            createBuilder.copyOnWrite();
            ucy ucyVar = (ucy) createBuilder.instance;
            aojvVar.getClass();
            ucyVar.a();
            ucyVar.c.add(aojvVar);
            createBuilder.copyOnWrite();
            ucy ucyVar2 = (ucy) createBuilder.instance;
            aokwVar.getClass();
            ucyVar2.d = aokwVar;
            ucyVar2.b |= 1;
            createBuilder.copyOnWrite();
            ucy ucyVar3 = (ucy) createBuilder.instance;
            str.getClass();
            int i = 4;
            ucyVar3.b |= 4;
            ucyVar3.f = str;
            tys tysVar2 = tys.SYSTEM_TRAY;
            int ordinal = tysVar.ordinal();
            if (ordinal == 0) {
                i = 2;
            } else if (ordinal == 1) {
                i = 3;
            } else if (ordinal != 2) {
                i = 1;
            }
            createBuilder.copyOnWrite();
            ucy ucyVar4 = (ucy) createBuilder.instance;
            ucyVar4.e = i - 1;
            ucyVar4.b |= 2;
            this.c.a(str2, 100, ((ucy) createBuilder.build()).toByteArray());
        }
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str2);
        uaw uawVar = (uaw) this.h.get();
        try {
            this.b.b(twuVar, 100, uawVar, bundle, 5000L);
        } catch (udq unused) {
            tzk.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_BATCH_UPDATE_THREAD_STATE");
            uawVar.e(bundle);
        }
    }

    @Override // defpackage.uat
    public final void c(twu twuVar, aokf aokfVar) {
        boolean z = twuVar != null;
        uqq.i();
        amkq.E(z);
        String str = twuVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0L);
        bundle.putInt("com.google.android.libraries.notifications.NOTIFICATIONS_FETCH_REASON", aokfVar.j);
        uba ubaVar = (uba) this.d.get();
        if (!tyo.m(this.a)) {
            tzk.e("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_LATEST_THREADS");
            ubaVar.e(bundle);
        } else {
            try {
                this.b.a(twuVar, 2, ubaVar, bundle);
            } catch (udq unused) {
                tzk.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_LATEST_THREADS");
                ubaVar.e(bundle);
            }
        }
    }

    @Override // defpackage.uat
    public final void d(twu twuVar) {
        uqq.i();
        amkq.E(true);
        String str = twuVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        ubc ubcVar = (ubc) this.f.get();
        try {
            this.b.a(twuVar, 1, ubcVar, bundle);
            twc twcVar = twc.a;
        } catch (udq unused) {
            tzk.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_REMOVE_TARGET");
            ubcVar.e(bundle);
        }
    }

    @Override // defpackage.uat
    public final void e(twu twuVar, aokm aokmVar) {
        uqq.i();
        amkq.E(true);
        String str = twuVar.b;
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", str);
        bundle.putInt("com.google.android.libraries.notifications.REGISTRATION_REASON", aokmVar.l);
        ubf ubfVar = (ubf) this.g.get();
        try {
            this.b.a(twuVar, 1, ubfVar, bundle);
            twc twcVar = twc.a;
        } catch (udq unused) {
            tzk.g("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_STORE_TARGET");
            ubfVar.e(bundle);
        }
    }
}
