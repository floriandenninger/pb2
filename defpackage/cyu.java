package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyu implements cql {
    private final ByteBuffer a = ByteBuffer.allocate(4);
    private final /* synthetic */ int b;

    public cyu(int i, byte[] bArr) {
        this.b = i;
    }

    public cyu(int i) {
        this.b = i;
    }

    @Override // defpackage.cql
    public final /* synthetic */ void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        if (this.b == 0) {
            Integer num = (Integer) obj;
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.a) {
                messageDigest.update(this.a.putInt(num.intValue()).array());
            }
            return;
        }
        Long l = (Long) obj;
        messageDigest.update(bArr);
        synchronized (this.a) {
            messageDigest.update(this.a.putLong(l.longValue()).array());
        }
    }
}
