package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ywf {
    private final ywe a;
    private final Context b;

    public ywf(ywe yweVar, Context context) {
        this.a = yweVar == null ? ywe.a : yweVar;
        this.b = context;
    }

    public final void a() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        amru a = this.a.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            ywd ywdVar = (ywd) a.get(i);
            Context context = this.b;
            if (Build.VERSION.SDK_INT >= 26) {
                whl.t(context, ywdVar.a, context.getString(ywdVar.b), ywdVar.c, ywdVar.d, ywdVar.e);
            }
        }
        for (String str : this.a.b()) {
            Context context2 = this.b;
            if (Build.VERSION.SDK_INT >= 26) {
                ((NotificationManager) context2.getSystemService("notification")).deleteNotificationChannel(str);
            }
        }
    }
}
