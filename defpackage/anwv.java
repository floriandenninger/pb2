package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: PG */
/* loaded from: classes.dex */
final class anwv extends BroadcastReceiver {
    public anww a;

    public anwv(anww anwwVar) {
        this.a = anwwVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        anww anwwVar = this.a;
        if (anwwVar != null && anwwVar.b()) {
            anwu anwuVar = FirebaseInstanceId.a;
            anww anwwVar2 = this.a;
            FirebaseInstanceId firebaseInstanceId = anwwVar2.a;
            FirebaseInstanceId.m(anwwVar2, 0L);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
