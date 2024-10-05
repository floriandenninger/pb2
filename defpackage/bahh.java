package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bahh implements Runnable {
    final /* synthetic */ ByteBuffer a;
    final /* synthetic */ bahx b;

    public bahh(bahx bahxVar, ByteBuffer byteBuffer) {
        this.b = bahxVar;
        this.a = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bahx bahxVar = this.b;
        bahxVar.c.execute(bahxVar.b(new bahg(this)));
    }
}
