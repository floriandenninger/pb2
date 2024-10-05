package defpackage;

import com.google.android.gms.measurement.internal.AppMetadata;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rke implements Callable {
    final /* synthetic */ AppMetadata a;
    final /* synthetic */ rki b;

    public rke(rki rkiVar, AppMetadata appMetadata) {
        this.b = rkiVar;
        this.a = appMetadata;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        rki rkiVar = this.b;
        String str = this.a.a;
        qip.an(str);
        if (!rkiVar.i(str).h() || !ren.b(this.a.v).h()) {
            this.b.aF().k.a("Analytics storage consent denied. Returning null app instance id");
            return null;
        }
        return this.b.c(this.a).n();
    }
}
