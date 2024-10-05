package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.ConditionalUserPropertyParcel;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.TreeSet;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rht implements Runnable {
    final /* synthetic */ Bundle a;
    final /* synthetic */ rid b;
    private final /* synthetic */ int c;

    public rht(rid ridVar, Bundle bundle, int i) {
        this.c = i;
        this.b = ridVar;
        this.a = bundle;
    }

    public /* synthetic */ rht(rid ridVar, Bundle bundle, int i, byte[] bArr) {
        this.c = i;
        this.b = ridVar;
        this.a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        UserAttributeParcel userAttributeParcel;
        int i = this.c;
        if (i == 0) {
            rid ridVar = this.b;
            Bundle bundle = this.a;
            ridVar.n();
            ridVar.a();
            String string = bundle.getString("name");
            String string2 = bundle.getString("origin");
            qip.ax(string);
            qip.ax(string2);
            qip.an(bundle.get("value"));
            if (!ridVar.w.v()) {
                ridVar.aF().k.a("Conditional property not set since app measurement is disabled");
                return;
            }
            try {
                ridVar.l().w(new ConditionalUserPropertyParcel(bundle.getString("app_id"), string2, new UserAttributeParcel(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2), bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), ridVar.N().av(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true), bundle.getLong("trigger_timeout"), ridVar.N().av(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true), bundle.getLong("time_to_live"), ridVar.N().av(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true)));
                return;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
        if (i != 1) {
            rid ridVar2 = this.b;
            Bundle bundle2 = this.a;
            ridVar2.n();
            ridVar2.a();
            qip.ax(bundle2.getString("name"));
            if (!ridVar2.w.v()) {
                ridVar2.aF().k.a("Conditional property not cleared since app measurement is disabled");
                return;
            }
            if (ridVar2.J().o(rfd.ap)) {
                userAttributeParcel = new UserAttributeParcel(bundle2.getString("name"), 0L, null, "");
            } else {
                userAttributeParcel = new UserAttributeParcel(bundle2.getString("name"), 0L, null, null);
            }
            try {
                ridVar2.l().w(new ConditionalUserPropertyParcel(bundle2.getString("app_id"), ridVar2.J().o(rfd.ap) ? "" : bundle2.getString("origin"), userAttributeParcel, bundle2.getLong("creation_timestamp"), bundle2.getBoolean("active"), bundle2.getString("trigger_event_name"), null, bundle2.getLong("trigger_timeout"), null, bundle2.getLong("time_to_live"), ridVar2.N().av(bundle2.getString("app_id"), bundle2.getString("expired_event_name"), bundle2.getBundle("expired_event_params"), ridVar2.J().o(rfd.ap) ? "" : bundle2.getString("origin"), bundle2.getLong("creation_timestamp"), true)));
                return;
            } catch (IllegalArgumentException unused2) {
                return;
            }
        }
        rid ridVar3 = this.b;
        Bundle bundle3 = this.a;
        if (bundle3 == null) {
            ridVar3.M().v.b(new Bundle());
            return;
        }
        Bundle a = ridVar3.M().v.a();
        for (String str : bundle3.keySet()) {
            Object obj = bundle3.get(str);
            if (obj == null || (obj instanceof String) || (obj instanceof Long) || (obj instanceof Double)) {
                if (rkm.am(str)) {
                    ridVar3.aF().h.b("Invalid default event parameter name. Name", str);
                } else if (obj == null) {
                    a.remove(str);
                } else {
                    rkm N = ridVar3.N();
                    ridVar3.J();
                    if (N.ae("param", str, 100, obj)) {
                        ridVar3.N().R(a, str, obj);
                    }
                }
            } else {
                if (ridVar3.N().aj(obj)) {
                    ridVar3.N().G(ridVar3.e, 27, null, null, 0);
                }
                ridVar3.aF().h.c("Invalid default event parameter type. Name, value", str, obj);
            }
        }
        ridVar3.N();
        int b = ridVar3.J().b();
        if (a.size() > b) {
            int i2 = 0;
            for (String str2 : new TreeSet(a.keySet())) {
                i2++;
                if (i2 > b) {
                    a.remove(str2);
                }
            }
            ridVar3.N().G(ridVar3.e, 26, null, null, 0);
            ridVar3.aF().h.a("Too many default event parameters set. Discarding beyond event parameter limit");
        }
        ridVar3.M().v.b(a);
        ridVar3.l().y(a);
    }
}
