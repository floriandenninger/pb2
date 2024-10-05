package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class alqn extends alpc {
    private static alqn b;
    private final alqe c;
    private final Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alqn(Context context, alqe alqeVar) {
        super(new IntentFilter("com.google.android.play.core.splitinstall.receiver.SplitInstallUpdateIntentService"), context);
        new ammr("SplitInstallListenerRegistry", (char[]) null);
        new Handler(Looper.getMainLooper());
        this.d = new LinkedHashSet();
        this.c = alqeVar;
    }

    public static synchronized alqn e(Context context) {
        alqn alqnVar;
        synchronized (alqn.class) {
            if (b == null) {
                b = new alqn(context, alqh.a);
            }
            alqnVar = b;
        }
        return alqnVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.alpc
    public final void a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("session_state");
        if (bundleExtra == null) {
            return;
        }
        alqz b2 = alqz.b(bundleExtra);
        alqf a = this.c.a();
        if (b2.b != 3 || a == null) {
            f(b2);
        } else {
            a.a();
        }
    }

    public final synchronized void f(alqz alqzVar) {
        Iterator it = new LinkedHashSet(this.d).iterator();
        while (it.hasNext()) {
            ((alrb) it.next()).i(alqzVar);
        }
        super.d(alqzVar);
    }
}
