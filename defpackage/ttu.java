package defpackage;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ttu implements vem, tvv, ttr {
    public final shf a;
    public final Executor b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    private final ttq e;

    public ttu(shf shfVar, Executor executor) {
        this.a = shfVar;
        this.b = anaf.E(executor);
        this.e = new ttq(executor);
    }

    @Override // defpackage.vem
    public final vel a(Uri uri) {
        return b(uri);
    }

    @Override // defpackage.vem
    public final vel b(Uri uri) {
        synchronized (ttu.class) {
            String str = (String) this.c.get(uri);
            if (str == null) {
                return this.e.b(uri);
            }
            if (this.d.get(str) == null) {
                tsx.d("%s: Can't find file group for uri: %s", "DownloadProgressMonitor", uri);
                return null;
            }
            return (vel) this.d.get(str);
        }
    }

    @Override // defpackage.tvv
    public final void c() {
    }

    @Override // defpackage.tvv
    public final void d() {
    }

    @Override // defpackage.tvv
    public final void e() {
        synchronized (ttu.class) {
            Iterator it = this.d.values().iterator();
            while (it.hasNext()) {
                aafk aafkVar = ((ttt) ((veb) it.next()).a).c;
                int i = tsx.a;
            }
            this.e.e();
        }
    }

    @Override // defpackage.vem
    public final void f() {
    }

    public final void g(String str, long j) {
        synchronized (ttu.class) {
            if (this.d.containsKey(str)) {
                ((veb) this.d.get(str)).a.a((int) j);
            }
        }
    }

    public final void h(String str) {
        synchronized (ttu.class) {
            this.d.remove(str);
        }
    }
}
