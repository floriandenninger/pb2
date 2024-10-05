package defpackage;

import android.media.MediaCodec;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oxx implements Runnable {
    final /* synthetic */ MediaCodec.CryptoException a;
    final /* synthetic */ oyb b;

    public oxx(oyb oybVar, MediaCodec.CryptoException cryptoException) {
        this.b = oybVar;
        this.a = cryptoException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.c.a(this.a);
    }
}
