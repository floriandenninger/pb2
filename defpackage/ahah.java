package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ahah {
    static final byte[] a = {0};
    static final byte[] b = {1};
    public static final /* synthetic */ int c = 0;
    private final ArrayDeque d = new ArrayDeque();
    private final MessageDigest e;
    private int f;
    private final boolean g;

    public ahah() {
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = false;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }

    public static ahae a(boolean z) {
        return new ahad(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] e(byte[] bArr) {
        return Arrays.copyOf(bArr, 10);
    }

    private final void f() {
        while (this.d.size() >= 2) {
            ahaf ahafVar = (ahaf) this.d.pop();
            ahaf ahafVar2 = (ahaf) this.d.pop();
            if (ahafVar.a == ahafVar2.a) {
                this.e.reset();
                this.e.update(b);
                this.e.update(ahafVar2.b);
                this.e.update(ahafVar.b);
                byte[] digest = this.e.digest();
                ArrayDeque arrayDeque = this.d;
                int i = ahafVar2.a + 1;
                if (this.g) {
                    digest = e(digest);
                }
                arrayDeque.push(new ahaf(i, digest));
            } else {
                this.d.push(ahafVar2);
                this.d.push(ahafVar);
                return;
            }
        }
    }

    public final void b(byte[] bArr) {
        this.d.push(new ahaf(0, bArr));
        this.f++;
        f();
    }

    public final void c() {
        this.d.clear();
        this.f = 0;
    }

    public final byte[] d() {
        while (this.d.size() > 1) {
            ahaf ahafVar = (ahaf) this.d.peek();
            if (ahafVar != null) {
                ahafVar.a++;
                f();
            }
        }
        ahaf ahafVar2 = (ahaf) this.d.peek();
        if (this.d.size() != 1 || ahafVar2 == null) {
            this.e.reset();
            return this.g ? e(this.e.digest()) : this.e.digest();
        }
        return ahafVar2.b;
    }

    public ahah(boolean z) {
        try {
            this.e = MessageDigest.getInstance("SHA-256");
            this.g = z;
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException(e);
        }
    }
}
