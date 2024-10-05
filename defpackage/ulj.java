package defpackage;

import android.accounts.Account;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ulj {
    private final tuh a;

    public ulj(tuh tuhVar) {
        this.a = tuhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final anhy a(uli uliVar, String str, int i) {
        amka h = amka.c(uliVar.a(this.a.a(new Account(str, "com.google")), new tuf(), uou.A(i))).a(tui.class, tur.i, angq.a).b(qnx.class, ufj.b, angq.a).b(IOException.class, ufj.c, angq.a).h(tur.j, angq.a);
        amkq.o(h, new sfi(5), angq.a);
        return h;
    }
}
