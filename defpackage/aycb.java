package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aycb extends ayca {
    private final aycc c;

    public aycb(String str, boolean z, aycc ayccVar) {
        super(str, z);
        amkq.L(!str.endsWith("-bin"), "ASCII header is named %s.  Only binary headers may end with %s", str, "-bin");
        ayccVar.getClass();
        this.c = ayccVar;
    }

    @Override // defpackage.ayca
    public final Object a(byte[] bArr) {
        return this.c.a(bArr);
    }

    @Override // defpackage.ayca
    public final byte[] b(Object obj) {
        return this.c.b(obj);
    }
}
