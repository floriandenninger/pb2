package defpackage;

import android.content.IntentFilter;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class na extends mz {
    public final nr a;
    final /* synthetic */ ne b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na(ne neVar, nr nrVar) {
        super(neVar);
        this.b = neVar;
        this.a = nrVar;
    }

    @Override // defpackage.mz
    public final IntentFilter a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    @Override // defpackage.mz
    public final void b() {
        this.b.T();
    }
}
