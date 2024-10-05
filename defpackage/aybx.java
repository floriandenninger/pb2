package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybx extends ayca {
    private final ayby c;

    public aybx(String str, ayby aybyVar) {
        super(str, false);
        amkq.L(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        aybyVar.getClass();
        this.c = aybyVar;
    }

    @Override // defpackage.ayca
    public final Object a(byte[] bArr) {
        return this.c.a(new String(bArr, amme.a));
    }

    @Override // defpackage.ayca
    public final byte[] b(Object obj) {
        return this.c.b(obj).getBytes(amme.a);
    }
}
