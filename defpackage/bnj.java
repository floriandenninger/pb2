package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bnj extends BroadcastReceiver {
    public final Context a;
    public boolean b = true;
    public final List c = new ArrayList();

    public bnj(Context context) {
        this.a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z;
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || this.b == (!intent.getBooleanExtra("noConnectivity", false))) {
            return;
        }
        this.b = z;
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((MediaRouteButton) it.next()).b();
        }
    }
}
