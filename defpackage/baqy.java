package defpackage;

import java.nio.ByteBuffer;
import org.webrtc.JniCommon;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class baqy implements Runnable {
    public final /* synthetic */ ByteBuffer a;
    private final /* synthetic */ int b;

    public /* synthetic */ baqy(ByteBuffer byteBuffer, int i) {
        this.b = i;
        this.a = byteBuffer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            JniCommon.nativeFreeByteBuffer(this.a);
        } else {
            JniCommon.nativeFreeByteBuffer(this.a);
        }
    }
}
