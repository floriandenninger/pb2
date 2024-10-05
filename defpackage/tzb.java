package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tzb {
    private static volatile tzc a;

    public static tzc a(Context context) {
        Object applicationContext = context.getApplicationContext();
        if (applicationContext instanceof axqk) {
            return (tzc) ((axqk) applicationContext).lM();
        }
        if (applicationContext instanceof edc) {
            return (tzc) ((edc) applicationContext).a();
        }
        throw new IllegalStateException("Unable to get ChimeComponent from host app. Did you mean for your application to extend GeneratedComponentManager or HasComponent or to use jcga.libraries.notifications.injection.Chime#set(ChimeComponent)?");
    }
}
