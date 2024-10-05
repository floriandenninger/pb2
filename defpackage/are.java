package defpackage;

import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class are implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ IBinder b;
    final /* synthetic */ arj c;
    final /* synthetic */ ark d;

    public are(arj arjVar, ark arkVar, String str, IBinder iBinder) {
        this.c = arjVar;
        this.d = arkVar;
        this.a = str;
        this.b = iBinder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aqp aqpVar = (aqp) this.c.a.c.get(this.d.a());
        if (aqpVar == null) {
            Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.a);
            return;
        }
        String str = this.a;
        IBinder iBinder = this.b;
        boolean z = true;
        boolean z2 = false;
        if (iBinder == null) {
            if (aqpVar.d.remove(str) != null) {
            }
            z = false;
        } else {
            List list = (List) aqpVar.d.get(str);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == ((hx) it.next()).a) {
                        it.remove();
                        z2 = true;
                    }
                }
                if (list.size() == 0) {
                    aqpVar.d.remove(str);
                }
                z = z2;
            }
            z = false;
        }
        if (z) {
            return;
        }
        Log.w("MBServiceCompat", "removeSubscription called for " + this.a + " which is not subscribed");
    }
}
