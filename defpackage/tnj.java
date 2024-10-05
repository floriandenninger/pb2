package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class tnj {
    public final Context a;
    public final tow b;
    public final trf c;
    public final trh d;
    public final tss e;
    public final shf f;
    public final vcw g;
    public final ammv h;
    public final tme i;
    public final Executor j;
    public final tko k;

    public tnj(Context context, tow towVar, trf trfVar, trh trhVar, tss tssVar, shf shfVar, vcw vcwVar, ammv ammvVar, tme tmeVar, Executor executor, tko tkoVar) {
        this.a = context;
        this.b = towVar;
        this.c = trfVar;
        this.d = trhVar;
        this.e = tssVar;
        this.f = shfVar;
        this.g = vcwVar;
        this.h = ammvVar;
        this.i = tmeVar;
        this.j = executor;
        this.k = tkoVar;
    }

    public final int a(Uri uri, List list) {
        int i;
        try {
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (!this.g.h(uri)) {
            return 0;
        }
        i = 0;
        for (Uri uri2 : this.g.b(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (!this.g.i(uri2)) {
                            uri2.getPath();
                            int i2 = tsx.a;
                            this.g.f(uri2);
                            i++;
                        } else {
                            i += a(uri2, list);
                        }
                    }
                } catch (IOException e2) {
                    this.e.g(1059);
                    tsx.f(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                this.e.g(1059);
                tsx.f(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return i;
            }
        }
        return i;
    }
}
