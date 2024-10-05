package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ard implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IBinder b;
    final /* synthetic */ Bundle c;
    final /* synthetic */ arj d;
    final /* synthetic */ ark e;

    public ard(arj arjVar, ark arkVar, String str, IBinder iBinder, Bundle bundle) {
        this.d = arjVar;
        this.e = arkVar;
        this.a = str;
        this.b = iBinder;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqp aqpVar = (aqp) this.d.a.c.get(this.e.a());
        if (aqpVar == null) {
            Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.a);
            return;
        }
        arm armVar = this.d.a;
        String str = this.a;
        IBinder iBinder = this.b;
        Bundle bundle = this.c;
        List<hx> list = (List) aqpVar.d.get(str);
        if (list == null) {
            list = new ArrayList();
        }
        for (hx hxVar : list) {
            if (iBinder == hxVar.a) {
                Bundle bundle2 = (Bundle) hxVar.b;
                if (bundle == bundle2) {
                    return;
                }
                if (bundle == null) {
                    if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle2 == null) {
                    if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                        return;
                    }
                } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
                    return;
                }
            }
        }
        list.add(new hx(iBinder, bundle));
        aqpVar.d.put(str, list);
        aql aqlVar = new aql(armVar, str, aqpVar, str, bundle);
        if (bundle == null) {
            armVar.b(aqlVar);
        } else {
            armVar.d(aqlVar);
        }
        if (aqlVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + aqpVar.a + " id=" + str);
    }
}
