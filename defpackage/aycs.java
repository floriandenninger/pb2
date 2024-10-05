package defpackage;

import java.net.URI;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aycs extends aycl {
    final /* synthetic */ aycu a;

    public aycs(aycu aycuVar) {
        this.a = aycuVar;
    }

    @Override // defpackage.aycl
    public final aycq a(URI uri, aycj aycjVar) {
        aycr aycrVar = (aycr) this.a.b().get(uri.getScheme());
        if (aycrVar == null) {
            return null;
        }
        return aycrVar.a(uri, aycjVar);
    }

    @Override // defpackage.aycl
    public final String b() {
        String str;
        synchronized (this.a) {
            str = this.a.b;
        }
        return str;
    }
}
