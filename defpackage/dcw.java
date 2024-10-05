package defpackage;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcw implements cqi {
    public static final /* synthetic */ int b = 0;
    private final int c;
    private final cqi d;

    public dcw(int i, cqi cqiVar) {
        this.c = i;
        this.d = cqiVar;
    }

    @Override // defpackage.cqi
    public final void a(MessageDigest messageDigest) {
        this.d.a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.c).array());
    }

    @Override // defpackage.cqi
    public final boolean equals(Object obj) {
        if (obj instanceof dcw) {
            dcw dcwVar = (dcw) obj;
            if (this.c == dcwVar.c && this.d.equals(dcwVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqi
    public final int hashCode() {
        return ddn.f(this.d, this.c);
    }
}
