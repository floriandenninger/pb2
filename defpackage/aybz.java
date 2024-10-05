package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybz extends ayca {
    public aybz(String str) {
        super(str, false);
        amkq.L(str.endsWith("-bin"), "Binary header is named %s. It must end with %s", str, "-bin");
        amkq.F(str.length() > 4, "empty key name");
    }

    @Override // defpackage.ayca
    public final Object a(byte[] bArr) {
        return bArr;
    }

    @Override // defpackage.ayca
    public final byte[] b(Object obj) {
        return (byte[]) obj;
    }
}
