package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class cat extends BroadcastReceiver {
    static {
        ajbh.S("ConstraintProxy");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Context context, List list) {
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (it.hasNext()) {
            byo byoVar = ((cda) it.next()).k;
            z4 |= byoVar.d;
            z |= byoVar.b;
            z2 |= byoVar.e;
            z3 |= byoVar.i != 1;
            if (z4 && z && z2 && z3) {
                break;
            }
        }
        context.sendBroadcast(ConstraintProxyUpdateReceiver.a(context, z4, z, z2, z3));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ajbh X = ajbh.X();
        String.format("onReceive : %s", intent);
        X.T(new Throwable[0]);
        context.startService(cas.b(context));
    }
}
