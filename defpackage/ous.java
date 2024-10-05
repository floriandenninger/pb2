package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ous implements otc {
    public final String a;
    public final Bundle b;
    public final aes c;

    public ous(aes aesVar, String str, Bundle bundle) {
        this.c = aesVar;
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.otc
    public final void a(final osv osvVar) {
        ((otb) osvVar).f.D().execute(new Runnable() { // from class: our
            @Override // java.lang.Runnable
            public final void run() {
                ous ousVar = ous.this;
                ousVar.c.c(yjk.m(((otb) osvVar).f.J().v(ousVar.a, ousVar.b)));
            }
        });
    }

    @Override // defpackage.otc
    public final void b(Exception exc) {
        this.c.c(abd.g());
    }
}
