package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class oqz extends uzg {
    private uzg a = new orb();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(uzg uzgVar) {
        for (uzg uzgVar2 = uzgVar; uzgVar2 instanceof oqz; uzgVar2 = ((oqz) uzgVar2).a) {
            if (uzgVar2 == this) {
                throw new IllegalStateException("Circular dependency detected! DelegatingUrlChecker cannot delegate to itself.");
            }
        }
        uzgVar.getClass();
        this.a = uzgVar;
    }

    @Override // defpackage.uzg
    protected final boolean b(String str) {
        return this.a.c(Uri.parse(str));
    }
}
