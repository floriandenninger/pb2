package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bang implements bane {
    private final String a;

    public bang(String str) {
        this.a = str;
    }

    @Override // defpackage.bane
    public final int a(int i) {
        return this.a.length();
    }

    @Override // defpackage.bane
    public final void b(StringBuffer stringBuffer, int i) {
        stringBuffer.append(this.a);
    }
}
