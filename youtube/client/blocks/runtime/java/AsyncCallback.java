package youtube.client.blocks.runtime.java;

import defpackage.anaf;
import defpackage.angq;
import defpackage.anhh;
import defpackage.anhy;
import j$.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class AsyncCallback implements anhh {
    private final int a;

    public AsyncCallback(int i) {
        this.a = i;
    }

    public static void register(anhy anhyVar, int i) {
        anaf.Y(anhyVar, new AsyncCallback(i), angq.a);
    }

    @Override // defpackage.anhh
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        nativeOnSuccess(this.a, (byte[]) obj);
    }

    public native void nativeOnFailure(int i, byte[] bArr);

    public native void nativeOnSuccess(int i, byte[] bArr);

    @Override // defpackage.anhh
    public final void qg(Throwable th) {
        nativeOnFailure(this.a, th.getMessage().getBytes(StandardCharsets.UTF_8));
    }
}
