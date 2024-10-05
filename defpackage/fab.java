package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fab implements faq {
    public apxf a;
    public final rxm b;
    private final aahd c;

    public fab(rxm rxmVar, aahd aahdVar, byte[] bArr) {
        this.b = rxmVar;
        this.c = aahdVar;
    }

    @Override // defpackage.faq
    public final void a(boolean z) {
        apxf apxfVar;
        if (z || (apxfVar = this.a) == null) {
            return;
        }
        this.c.a(apxfVar);
        b();
    }

    public final void b() {
        this.a = null;
        this.b.b(this);
    }
}
