package defpackage;

import android.content.Context;
import java.util.IllegalFormatException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttx implements tme {
    private final Context a;
    private final tko b;

    public ttx(Context context, tko tkoVar) {
        this.a = context;
        this.b = tkoVar;
    }

    @Override // defpackage.tme
    public final void a(Throwable th, String str, Object... objArr) {
        this.b.m();
        this.b.B();
        if (tsx.a(100L)) {
            try {
                str = String.format(str, objArr);
            } catch (IllegalFormatException e) {
                tsx.f(e, "Bad format string or format arguments: %s", str);
            }
            qwl qwlVar = new qwl(th);
            qwlVar.f = "com.google.android.gms.icing";
            qwlVar.c = "com.google.android.gms.icing.SILENT_FEEDBACK";
            qwlVar.b = str;
            qwlVar.d = true;
            qwj.e(this.a).z(qwlVar.a());
        }
    }
}
