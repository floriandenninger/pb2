package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class uae {
    private static antc a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized antc a(Context context, tzz tzzVar, twn twnVar) {
        synchronized (uae.class) {
            if (a == null) {
                if (twnVar.j) {
                    antc a2 = tzzVar.a(context);
                    a = a2;
                    return a2;
                }
                antf antfVar = new antf();
                antfVar.b = "chime-sdk";
                antfVar.b("AIzaSyC8UYZpvA2eknNex0Pjid0_eTLJoDu6los");
                antfVar.c("1:747654520220:android:0000000000000000");
                antfVar.a = twnVar.b;
                a = tzzVar.c(context, antfVar.a());
            }
            return a;
        }
    }
}
