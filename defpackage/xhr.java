package defpackage;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xhr implements abdc {
    private final afuh a;
    private final xlj b;
    private final Executor c;

    public xhr(afuh afuhVar, xlj xljVar, Executor executor) {
        afuhVar.getClass();
        this.a = afuhVar;
        xljVar.getClass();
        this.b = xljVar;
        executor.getClass();
        this.c = executor;
    }

    @Override // defpackage.abdc
    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.c.execute(new xhq(this, parse));
        } else {
            b(parse);
        }
    }

    public final void b(Uri uri) {
        zhy b = zhy.b(uri);
        for (Map.Entry entry : this.b.f().entrySet()) {
            b.h((String) entry.getKey(), (String) entry.getValue());
        }
        Uri a = b.a();
        String.valueOf(String.valueOf(a)).length();
        afug d = afuh.d("remarketing");
        d.b(a);
        this.a.a(d, afxi.a);
    }
}
