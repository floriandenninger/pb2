package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qqv implements Runnable {
    final /* synthetic */ qqx a;

    public qqv(qqx qqxVar) {
        this.a = qqxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.f.b(new ConnectionResult(4));
    }
}
