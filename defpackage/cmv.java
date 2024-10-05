package defpackage;

import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cmv implements cmu {
    private final FileChannel a;
    private final long b;
    private final long c;

    public cmv(FileChannel fileChannel, long j, long j2) {
        this.a = fileChannel;
        this.b = j;
        this.c = j2;
    }

    @Override // defpackage.cmu
    public final long a() {
        return this.c;
    }

    @Override // defpackage.cmu
    public final void b(MessageDigest[] messageDigestArr, long j, int i) {
        MappedByteBuffer map = this.a.map(FileChannel.MapMode.READ_ONLY, this.b + j, i);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            messageDigest.update(map);
        }
    }
}
