package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.EventParcel;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class rkf implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ String b = "_err";
    final /* synthetic */ Bundle c;
    final /* synthetic */ rkg d;

    public rkf(rkg rkgVar, String str, Bundle bundle) {
        this.d = rkgVar;
        this.a = str;
        this.c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rkm s = this.d.a.s();
        String str = this.a;
        String str2 = this.b;
        Bundle bundle = this.c;
        this.d.a.T();
        EventParcel av = s.av(str, str2, bundle, "auto", System.currentTimeMillis(), false);
        rki rkiVar = this.d.a;
        qip.an(av);
        rkiVar.B(av, this.a);
    }
}
