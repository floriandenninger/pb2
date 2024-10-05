package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class pop extends BroadcastReceiver {
    final /* synthetic */ poq a;

    public pop(poq poqVar) {
        this.a = poqVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        final poq poqVar = this.a;
        poqVar.b.post(new Runnable() { // from class: poo
            @Override // java.lang.Runnable
            public final void run() {
                poq.this.b();
            }
        });
    }
}
