package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class mx extends mz {
    public final PowerManager a;
    final /* synthetic */ ne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx(ne neVar, Context context) {
        super(neVar);
        this.b = neVar;
        this.a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // defpackage.mz
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // defpackage.mz
    public final void b() {
        this.b.T();
    }
}
