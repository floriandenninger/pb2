package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ptf {
    private static ptf c;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private final Object d = new Object();
    private int e = 0;

    private ptf(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ptd(this), intentFilter);
    }

    public static synchronized ptf b(Context context) {
        ptf ptfVar;
        synchronized (ptf.class) {
            if (c == null) {
                c = new ptf(context);
            }
            ptfVar = c;
        }
        return ptfVar;
    }

    public final int a() {
        int i;
        synchronized (this.d) {
            i = this.e;
        }
        return i;
    }

    public final void c(int i) {
        synchronized (this.d) {
            if (this.e == i) {
                return;
            }
            this.e = i;
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                bfh bfhVar = (bfh) weakReference.get();
                if (bfhVar != null) {
                    bfhVar.a(i);
                } else {
                    this.b.remove(weakReference);
                }
            }
        }
    }
}
