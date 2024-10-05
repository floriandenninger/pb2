package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class azvr implements aztu, azxt {
    private final azyo a;

    public azvr() {
    }

    public azvr(azyo azyoVar) {
        this((byte[]) null);
        this.a = azyoVar;
    }

    public azvr(byte[] bArr) {
        this();
    }

    @Override // defpackage.aztu
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        b();
        return azsf.a;
    }

    public final void b() {
        this.a.m();
    }

    public final String toString() {
        return "RemoveReceiveOnCancel[" + this.a + ']';
    }
}
