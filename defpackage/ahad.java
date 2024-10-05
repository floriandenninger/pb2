package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahad implements ahae {
    int a = 0;
    private final MessageDigest b;
    private final boolean c;

    public ahad(boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.b = messageDigest;
            messageDigest.reset();
            this.c = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // defpackage.ahae
    public final int a() {
        int i = this.a;
        if (i <= 0) {
            return 0;
        }
        int i2 = ahah.c;
        return i - 1;
    }

    @Override // defpackage.ahae
    public final void b() {
        this.b.reset();
        this.a = 0;
    }

    @Override // defpackage.ahae
    public final void c(byte[] bArr, int i, int i2) {
        if (this.a == 0 && i2 > 0) {
            this.b.update(ahah.a);
            this.a++;
        }
        this.b.update(bArr, i, i2);
        this.a += i2;
    }

    @Override // defpackage.ahae
    public final byte[] d() {
        return this.c ? ahah.e(this.b.digest()) : this.b.digest();
    }
}
