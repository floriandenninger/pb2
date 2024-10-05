package defpackage;

import io.grpc.Status;
import java.net.SocketAddress;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayjd implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ ayjp b;

    public ayjd(ayjp ayjpVar, List list) {
        this.b = ayjpVar;
        this.a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ayli ayliVar;
        SocketAddress a = this.b.f.a();
        ayjk ayjkVar = this.b.f;
        ayjkVar.a = this.a;
        ayjkVar.b();
        this.b.g = this.a;
        if (this.b.p.a == ayae.READY || this.b.p.a == ayae.CONNECTING) {
            ayjk ayjkVar2 = this.b.f;
            int i = 0;
            while (true) {
                if (i < ayjkVar2.a.size()) {
                    int indexOf = ((ayan) ayjkVar2.a.get(i)).b.indexOf(a);
                    if (indexOf != -1) {
                        ayjkVar2.b = i;
                        ayjkVar2.c = indexOf;
                        break;
                    }
                    i++;
                } else if (this.b.p.a == ayae.READY) {
                    ayliVar = this.b.o;
                    this.b.o = null;
                    this.b.f.b();
                    this.b.b(ayae.IDLE);
                } else {
                    this.b.n.j(Status.o.withDescription("InternalSubchannel closed pending transport due to address change"));
                    this.b.n = null;
                    this.b.f.b();
                    this.b.h();
                }
            }
        }
        ayliVar = null;
        if (ayliVar != null) {
            ayjp ayjpVar = this.b;
            if (ayjpVar.j != null) {
                ayjpVar.k.j(Status.o.withDescription("InternalSubchannel closed transport early due to address change"));
                this.b.j.a();
                ayjp ayjpVar2 = this.b;
                ayjpVar2.j = null;
                ayjpVar2.k = null;
            }
            ayjp ayjpVar3 = this.b;
            ayjpVar3.k = ayliVar;
            ayjpVar3.j = ayjpVar3.e.a(new ayjc(this), 5L, TimeUnit.SECONDS, this.b.b);
        }
    }
}
