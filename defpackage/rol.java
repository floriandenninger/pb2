package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rol extends qar {
    @Override // defpackage.qar
    public final /* bridge */ /* synthetic */ qnv s(Context context, Looper looper, qrz qrzVar, Object obj, qod qodVar, qoe qoeVar) {
        roq roqVar = qrzVar.g;
        Integer num = qrzVar.h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", qrzVar.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return new rou(context, looper, qrzVar, bundle, qodVar, qoeVar);
    }
}
