package defpackage;

import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class qgz {
    private final String a;
    private final int b;
    private final owy c;

    public qgz(SharedPreferences sharedPreferences, owy owyVar, long j) {
        this.c = owyVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.a = string;
        this.b = j == 0 ? 1 : 2;
    }

    public final void a(andl andlVar, int i) {
        owu f;
        andk c = andl.c(andlVar);
        String str = this.a;
        c.copyOnWrite();
        ((andl) c.instance).t(str);
        andl andlVar2 = (andl) c.build();
        if (this.b - 1 == 0) {
            f = owu.f(i - 1, andlVar2);
        } else {
            f = owu.d(i - 1, andlVar2);
        }
        this.c.a(f);
    }
}
