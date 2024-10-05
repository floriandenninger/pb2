package defpackage;

import android.media.MediaCodec;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ass {
    public byte[] a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    public final MediaCodec.CryptoInfo i;
    public final asr j;

    public ass() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = pts.a >= 24 ? new asr(cryptoInfo) : null;
    }
}
