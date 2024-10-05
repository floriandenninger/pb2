package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class fpk extends BroadcastReceiver {
    final /* synthetic */ fpl a;
    private final fpl b;

    public fpk(fpl fplVar, fpl fplVar2) {
        this.a = fplVar;
        this.b = fplVar2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            this.a.l = true;
            fpl fplVar = this.b;
            if (fplVar != null && fplVar.getParent() != null) {
                this.b.getParent().requestDisallowInterceptTouchEvent(false);
            }
            this.a.c(this.b);
        }
    }
}
