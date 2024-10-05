package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ccg implements cbh, bzo {
    public static final String a = ajbh.S("SystemFgDispatcher");
    public final caj b;
    final Object c = new Object();
    String d;
    final Map e;
    final Map f;
    final Set g;
    final cbi h;
    public ccf i;
    public final cfa j;
    private final Context k;

    public ccg(Context context) {
        this.k = context;
        caj h = caj.h(context);
        this.b = h;
        cfa cfaVar = h.i;
        this.j = cfaVar;
        this.d = null;
        this.e = new LinkedHashMap();
        this.g = new HashSet();
        this.f = new HashMap();
        this.h = new cbi(context, cfaVar, this);
        h.f.b(this);
    }

    public static Intent b(Context context, String str, byt bytVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", bytVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bytVar.b);
        intent.putExtra("KEY_NOTIFICATION", bytVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, byt bytVar) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", bytVar.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", bytVar.b);
        intent.putExtra("KEY_NOTIFICATION", bytVar.c);
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // defpackage.bzo
    public final void a(String str, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            cda cdaVar = (cda) this.f.remove(str);
            if (cdaVar != null && this.g.remove(cdaVar)) {
                this.h.a(this.g);
            }
        }
        byt bytVar = (byt) this.e.remove(str);
        if (str.equals(this.d) && this.e.size() > 0) {
            Iterator it = this.e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                } else {
                    next = it.next();
                }
            }
            this.d = (String) entry.getKey();
            if (this.i != null) {
                byt bytVar2 = (byt) entry.getValue();
                this.i.c(bytVar2.a, bytVar2.b, bytVar2.c);
                this.i.a(bytVar2.a);
            }
        }
        ccf ccfVar = this.i;
        if (bytVar == null || ccfVar == null) {
            return;
        }
        ajbh X = ajbh.X();
        String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(bytVar.a), str, Integer.valueOf(bytVar.b));
        X.T(new Throwable[0]);
        ccfVar.a(bytVar.a);
    }

    @Override // defpackage.cbh
    public final void e(List list) {
    }

    @Override // defpackage.cbh
    public final void f(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            ajbh X = ajbh.X();
            String.format("Constraints unmet for WorkSpec %s", str);
            X.T(new Throwable[0]);
            caj cajVar = this.b;
            cajVar.i.a(new cec(cajVar, str, true));
        }
    }

    public final void g(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        ajbh X = ajbh.X();
        String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2));
        X.T(new Throwable[0]);
        if (notification == null || this.i == null) {
            return;
        }
        this.e.put(stringExtra, new byt(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.d)) {
            this.d = stringExtra;
            this.i.c(intExtra, intExtra2, notification);
            return;
        }
        this.i.b(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        Iterator it = this.e.entrySet().iterator();
        while (it.hasNext()) {
            i |= ((byt) ((Map.Entry) it.next()).getValue()).b;
        }
        byt bytVar = (byt) this.e.get(this.d);
        if (bytVar != null) {
            this.i.c(bytVar.a, i, bytVar.c);
        }
    }

    public final void h() {
        this.i = null;
        synchronized (this.c) {
            this.h.b();
        }
        this.b.f.c(this);
    }
}
