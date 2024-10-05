package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anqx implements anjh {
    private final anrd a;
    private final anjy b;

    public anqx(anrd anrdVar, anjy anjyVar) {
        this.a = anrdVar;
        this.b = anjyVar;
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.a.a(bArr);
        return aocz.av(a, this.b.a(aocz.av(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
