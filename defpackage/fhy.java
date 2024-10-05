package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fhy implements afyt {
    private final agaf a;
    private final shf b;
    private final aaea c;

    public fhy(agaf agafVar, shf shfVar, aaea aaeaVar) {
        agafVar.getClass();
        this.a = agafVar;
        shfVar.getClass();
        this.b = shfVar;
        this.c = aaeaVar;
    }

    @Override // defpackage.afyt
    public final long a() {
        agaf agafVar = this.a;
        shf shfVar = this.b;
        ammv i = agafVar.i();
        if (((Long) i.e(0L)).longValue() == 0) {
            return -1L;
        }
        return TimeUnit.MILLISECONDS.toSeconds(shfVar.c() - ((Long) i.c()).longValue());
    }

    @Override // defpackage.afyt
    public final /* synthetic */ anhy b(final Context context) {
        return anfq.h(c(), new amml() { // from class: afyr
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                afyt afytVar = afyt.this;
                Context context2 = context;
                return new afys(((Boolean) obj).booleanValue(), aear.E(context2), afytVar.e(context2));
            }
        }, angq.a);
    }

    @Override // defpackage.afyt
    public final anhy c() {
        return anaf.O(Boolean.valueOf(fhe.B(this.a)));
    }

    @Override // defpackage.afyt
    public final boolean d(Context context) {
        return aear.E(context);
    }

    @Override // defpackage.afyt
    public final boolean e(Context context) {
        aswb aswbVar = this.c.a().e;
        if (aswbVar == null) {
            aswbVar = aswb.a;
        }
        String str = aswbVar.j;
        if (!TextUtils.isEmpty(str) && Build.VERSION.SDK_INT >= 26) {
            NotificationChannel notificationChannel = ((NotificationManager) context.getSystemService("notification")).getNotificationChannel(str);
            if (notificationChannel != null) {
                return (notificationChannel.getImportance() == 0 || notificationChannel.getImportance() == -1000) ? false : true;
            }
            String valueOf = String.valueOf(str);
            afsi.b(1, 7, valueOf.length() != 0 ? "Android O+ Notification Channel does not exist: ".concat(valueOf) : new String("Android O+ Notification Channel does not exist: "));
        }
        return true;
    }
}
