package defpackage;

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahg implements bahy {
    final /* synthetic */ bahh a;

    public bahg(bahh bahhVar) {
        this.a = bahhVar;
    }

    @Override // defpackage.bahy
    public final void a() {
        bahh bahhVar = this.a;
        ReadableByteChannel readableByteChannel = bahhVar.b.n;
        int read = readableByteChannel == null ? -1 : readableByteChannel.read(bahhVar.a);
        bahh bahhVar2 = this.a;
        bahx bahxVar = bahhVar2.b;
        ByteBuffer byteBuffer = bahhVar2.a;
        if (read != -1) {
            bahu bahuVar = bahxVar.b;
            bahuVar.a(new bahr(bahuVar, bahxVar.o, byteBuffer));
            return;
        }
        ReadableByteChannel readableByteChannel2 = bahxVar.n;
        if (readableByteChannel2 != null) {
            readableByteChannel2.close();
        }
        if (bahxVar.g.compareAndSet(5, 7)) {
            bahxVar.j();
            bahu bahuVar2 = bahxVar.b;
            bahuVar2.b.execute(new bahs(bahuVar2, bahxVar.o, 0));
        }
    }
}
