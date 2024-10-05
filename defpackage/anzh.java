package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.messaging.FirebaseMessaging;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anzh extends BroadcastReceiver {
    public anzi a;

    public anzh(anzi anziVar) {
        this.a = anziVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        anzi anziVar = this.a;
        if (anziVar != null && anziVar.b()) {
            anzi anziVar2 = this.a;
            FirebaseMessaging firebaseMessaging = anziVar2.a;
            FirebaseMessaging.l(anziVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
