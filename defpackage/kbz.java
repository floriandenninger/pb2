package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class kbz extends BroadcastReceiver {
    final /* synthetic */ String a = "com.youtube.mainapp.android";
    final /* synthetic */ kcd b;

    public kbz(kcd kcdVar) {
        this.b = kcdVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.a.equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            kcd kcdVar = this.b;
            kcdVar.c(kcdVar.a());
        }
    }
}
