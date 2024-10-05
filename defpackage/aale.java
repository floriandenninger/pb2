package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class aale extends aalb {
    private int a;

    public aale(String str) {
        try {
            this.a = (int) ((aqub) aonm.parseFrom(aqub.a, aomf.z(str))).c;
        } catch (aoob unused) {
            this.a = -1;
        }
    }

    @Override // defpackage.aaks
    public final int a() {
        return this.a;
    }

    @Override // defpackage.aakr
    public final /* bridge */ /* synthetic */ whu b(byte[] bArr) {
        aald aaldVar = new aald();
        aaldVar.a = bArr;
        aaldVar.b = "";
        return aaldVar;
    }

    @Override // defpackage.aalb
    public final Class c() {
        return aalf.class;
    }
}
