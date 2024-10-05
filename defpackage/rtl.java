package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rtl {
    public static final /* synthetic */ int a = 0;
    private static final Intent b = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));

    public static ammv a(Context context) {
        ammv ammvVar;
        amqp d = amqp.d(context.getPackageManager().queryIntentActivities(b, Build.VERSION.SDK_INT >= 23 ? 131136 : 64));
        mjw mjwVar = mjw.t;
        Iterator it = d.h().iterator();
        it.getClass();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (mjwVar.a(next)) {
                    ammvVar = ammv.j(next);
                    break;
                }
            } else {
                ammvVar = amlr.a;
                break;
            }
        }
        return ammvVar.b(rtp.b);
    }
}
