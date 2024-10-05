package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class acp {
    public acp(afk afkVar) {
        new WeakReference(afkVar);
        afb.o(afkVar.f45J);
        afb.o(afkVar.K);
        afb.o(afkVar.L);
        afb.o(afkVar.M);
        afb.o(afkVar.N);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static KeyguardManager a(Context context) {
        return (KeyguardManager) context.getSystemService(KeyguardManager.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(KeyguardManager keyguardManager) {
        return keyguardManager.isDeviceSecure();
    }
}
