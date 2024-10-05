package defpackage;

import java.nio.ByteBuffer;
import java.util.Date;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class der extends axks {
    public Date a;
    public Date b;
    public long c;
    public long d;
    public String e;

    public der() {
        super("mdhd");
        this.a = new Date();
        this.b = new Date();
        this.e = "eng";
    }

    @Override // defpackage.axkq
    protected final long h() {
        return (s() == 1 ? 32L : 20L) + 4;
    }

    @Override // defpackage.axkq
    public final void i(ByteBuffer byteBuffer) {
        u(byteBuffer);
        if (s() == 1) {
            this.a = awxt.f(did.al(byteBuffer));
            this.b = awxt.f(did.al(byteBuffer));
            this.c = did.ak(byteBuffer);
            this.d = did.al(byteBuffer);
        } else {
            this.a = awxt.f(did.ak(byteBuffer));
            this.b = awxt.f(did.ak(byteBuffer));
            this.c = did.ak(byteBuffer);
            this.d = did.ak(byteBuffer);
        }
        int ah = did.ah(byteBuffer);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            sb.append((char) (((ah >> ((2 - i) * 5)) & 31) + 96));
        }
        this.e = sb.toString();
        did.ah(byteBuffer);
    }

    @Override // defpackage.axkq
    protected final void j(ByteBuffer byteBuffer) {
        t(byteBuffer);
        if (s() == 1) {
            byteBuffer.putLong(awxt.e(this.a));
            byteBuffer.putLong(awxt.e(this.b));
            did.aa(byteBuffer, this.c);
            byteBuffer.putLong(this.d);
        } else {
            did.aa(byteBuffer, awxt.e(this.a));
            did.aa(byteBuffer, awxt.e(this.b));
            did.aa(byteBuffer, this.c);
            did.aa(byteBuffer, this.d);
        }
        String str = this.e;
        if (str.getBytes().length == 3) {
            int i = 0;
            for (int i2 = 0; i2 < 3; i2++) {
                i += (str.getBytes()[i2] - 96) << ((2 - i2) * 5);
            }
            did.Y(byteBuffer, i);
            did.Y(byteBuffer, 0);
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
        sb.append("\"");
        sb.append(str);
        sb.append("\" language string isn't exactly 3 characters long!");
        throw new IllegalArgumentException(sb.toString());
    }

    public final String toString() {
        return "MediaHeaderBox[creationTime=" + this.a + ";modificationTime=" + this.b + ";timescale=" + this.c + ";duration=" + this.d + ";language=" + this.e + "]";
    }
}
