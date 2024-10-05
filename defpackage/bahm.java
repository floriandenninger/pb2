package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahm implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ bahx b;

    public bahm(bahx bahxVar, String str) {
        this.b = bahxVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bahx bahxVar = this.b;
        bahxVar.p = URI.create(bahxVar.m).resolve(this.a).toString();
        bahx bahxVar2 = this.b;
        bahxVar2.f.add(bahxVar2.p);
        this.b.m(2, 3, new bahl(this));
    }
}
