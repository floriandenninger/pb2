package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.BillingClientNativeCallback;
import org.json.JSONException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class clx extends BroadcastReceiver {
    public final cmq a;
    public boolean b;
    public final /* synthetic */ cly c;
    public final BillingClientNativeCallback d = null;

    public clx(cly clyVar, cmq cmqVar) {
        this.c = clyVar;
        this.a = cmqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        cmn c = cms.c(intent, "BillingBroadcastManager");
        cmq cmqVar = this.a;
        if (cmqVar == null) {
            cms.h(intent.getExtras());
            throw null;
        }
        if (c.a != 0) {
            cmqVar.b(c, amru.q());
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            cms.f("BillingBroadcastManager", "Bundle is null.");
            this.a.b(cmo.f, amru.q());
            return;
        }
        String string = extras.getString("FIRST_PARTY_PURCHASE_DATA");
        if (string == null) {
            cms.f("BillingBroadcastManager", "Couldn't find purchase data in Bundle.");
            this.a.b(cmo.f, amru.q());
        } else {
            try {
                this.a.b(c, amru.r(new cmp(string)));
            } catch (JSONException unused) {
                cms.f("BillingBroadcastManager", String.format("Parse invalid first party purchase info: [%s]", string));
                this.a.b(cmo.f, amru.q());
            }
        }
    }
}
