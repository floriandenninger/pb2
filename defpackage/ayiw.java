package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ayiw implements aybd {
    private final /* synthetic */ int a;

    public ayiw(int i) {
        this.a = i;
    }

    @Override // defpackage.aycc
    public final /* synthetic */ Object a(byte[] bArr) {
        if (this.a != 0) {
            return bArr;
        }
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String str = new String(bArr, aybe.a);
        throw new NumberFormatException(str.length() != 0 ? "Malformed status code ".concat(str) : new String("Malformed status code "));
    }

    @Override // defpackage.aycc
    public final /* synthetic */ byte[] b(Object obj) {
        if (this.a == 0) {
            throw new UnsupportedOperationException();
        }
        return (byte[]) obj;
    }
}
