package defpackage;

import com.google.android.gms.cast.internal.ApplicationStatus;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class qkj implements Runnable {
    final /* synthetic */ qkm a;
    final /* synthetic */ ApplicationStatus b;

    public qkj(qkm qkmVar, ApplicationStatus applicationStatus) {
        this.a = qkmVar;
        this.b = applicationStatus;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        qkm qkmVar = this.a;
        String str = this.b.a;
        if (qko.j(str, qkmVar.e)) {
            z = false;
        } else {
            qkmVar.e = str;
            z = true;
        }
        prh prhVar = qkmVar.o;
        if (prhVar != null && (z || qkmVar.g)) {
            prhVar.A();
        }
        qkmVar.g = false;
    }
}
