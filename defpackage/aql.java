package defpackage;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aql extends arb {
    final /* synthetic */ aqp a;
    final /* synthetic */ String b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ arm d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aql(arm armVar, Object obj, aqp aqpVar, String str, Bundle bundle) {
        super(obj);
        this.d = armVar;
        this.a = aqpVar;
        this.b = str;
        this.c = bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.arb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (this.d.c.get(this.a.f.a()) != this.a) {
            return;
        }
        List list = obj;
        if ((this.h & 1) != 0) {
            list = arm.a(obj, this.c);
        }
        try {
            ark arkVar = this.a.f;
            String str = this.b;
            Bundle bundle = this.c;
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putBundle("data_options", bundle);
            bundle2.putBundle("data_notify_children_changed_options", null);
            if (list != null) {
                bundle2.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            arkVar.b(3, bundle2);
        } catch (RemoteException unused) {
            Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.b + " package=" + this.a.a);
        }
    }
}
