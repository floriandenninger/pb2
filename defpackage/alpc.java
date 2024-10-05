package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class alpc {
    private final IntentFilter b;
    private final Context c;
    protected final Set a = new HashSet();
    private alpb d = null;
    private volatile boolean e = false;

    /* JADX INFO: Access modifiers changed from: protected */
    public alpc(IntentFilter intentFilter, Context context) {
        this.b = intentFilter;
        this.c = alta.q(context);
    }

    private final void e() {
        alpb alpbVar;
        if (!this.a.isEmpty() && this.d == null) {
            alpb alpbVar2 = new alpb(this);
            this.d = alpbVar2;
            this.c.registerReceiver(alpbVar2, this.b);
        }
        if (!this.a.isEmpty() || (alpbVar = this.d) == null) {
            return;
        }
        this.c.unregisterReceiver(alpbVar);
        this.d = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void b(alpd alpdVar) {
        this.a.add(alpdVar);
        e();
    }

    public final synchronized void c(alpd alpdVar) {
        this.a.remove(alpdVar);
        e();
    }

    public final synchronized void d(Object obj) {
        Iterator it = new HashSet(this.a).iterator();
        while (it.hasNext()) {
            ((alpd) it.next()).i(obj);
        }
    }
}
