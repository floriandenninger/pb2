package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class wqd {
    private final afsy a;
    private final Executor b;

    public wqd(afsy afsyVar, Executor executor) {
        this.a = afsyVar;
        this.b = executor;
    }

    private final void c(final xhk xhkVar, final Uri uri, final afve afveVar, final boolean z, final long j) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            throw new wxe("Null or empty uri when trying to log");
        }
        final afug c = xhkVar.c(uri, this.a.c());
        this.b.execute(new Runnable() { // from class: wqc
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri2 = uri;
                afug afugVar = c;
                afve afveVar2 = afveVar;
                boolean z2 = z;
                long j2 = j;
                xhk xhkVar2 = xhkVar;
                String.valueOf(String.valueOf(uri2)).length();
                afugVar.a(afveVar2);
                afugVar.d = z2;
                afugVar.e = j2;
                xhkVar2.a(afugVar, afxi.a);
            }
        });
    }

    public final void a(xhk xhkVar, xeq xeqVar) {
        c(xhkVar, xeqVar.a, xeqVar.b, xeqVar.c, xeqVar.d);
    }

    public final void b(xhk xhkVar, aoye aoyeVar, Uri uri) {
        c(xhkVar, uri, new xhj(aoyeVar.e), aoyeVar.f, Long.MAX_VALUE);
    }
}
