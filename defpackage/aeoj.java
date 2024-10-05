package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
final class aeoj implements anhh {
    final /* synthetic */ azrh a;
    final /* synthetic */ String b;
    final /* synthetic */ aeon c;

    public aeoj(aeon aeonVar, azrh azrhVar, String str) {
        this.c = aeonVar;
        this.a = azrhVar;
        this.b = str;
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        byte[] bArr = (byte[]) obj;
        this.a.c(ByteBuffer.allocateDirect(bArr.length).put(bArr));
    }

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        String str = this.b;
        aeon aeonVar = this.c;
        aeonVar.b.b(new aeom(str, aeonVar.a, aeonVar.c, aeonVar.d, this.a, aeonVar.e));
    }
}
