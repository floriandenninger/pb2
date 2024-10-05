package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aalo {
    public final azrw a;
    private final aakv b;

    public aalo(azrw azrwVar, aakv aakvVar) {
        this.a = azrwVar;
        this.b = aakvVar;
    }

    public final aakt a(String str, byte[] bArr) {
        return ((aalu) this.a.get()).c(str, bArr).a(this.b);
    }

    public final Class b(String str) {
        aalb aalbVar;
        aalu aaluVar = (aalu) this.a.get();
        long a = aalu.a(str);
        return (a == -2147483648L || (aalbVar = (aalb) aaluVar.a.get(Long.valueOf(a))) == null) ? aalf.class : aalbVar.c();
    }
}
