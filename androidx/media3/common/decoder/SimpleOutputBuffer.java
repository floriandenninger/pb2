package androidx.media3.common.decoder;

import defpackage.asx;
import defpackage.asy;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SimpleOutputBuffer extends asy {
    public ByteBuffer data;
    private final asx owner;

    public SimpleOutputBuffer(asx asxVar) {
        this.owner = asxVar;
    }

    @Override // defpackage.asp
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
        }
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        return this.data;
    }

    @Override // defpackage.asy
    public void release() {
        this.owner.a(this);
    }
}
