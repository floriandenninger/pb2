package defpackage;

import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class anlk implements anjh {
    private static final byte[] a = new byte[0];
    private final anod b;
    private final anjh c;

    public anlk(anod anodVar, anjh anjhVar) {
        this.b = anodVar;
        this.c = anjhVar;
    }

    @Override // defpackage.anjh
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] byteArray = ankk.b(this.b).toByteArray();
        byte[] a2 = this.c.a(byteArray, a);
        byte[] a3 = ((anjh) ankk.d(this.b.b, byteArray, anjh.class)).a(bArr, bArr2);
        int length = a2.length;
        return ByteBuffer.allocate(length + 4 + a3.length).putInt(length).put(a2).put(a3).array();
    }
}
