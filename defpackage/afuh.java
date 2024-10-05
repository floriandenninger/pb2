package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class afuh {
    public final aful a;
    public final ysy b;
    public final afql c;
    public final ynx d;
    public final afuj e;
    private final afsy f;
    private final Set g;
    private final ysl h;
    private final shf i;
    private final Executor j;
    private final Executor k;
    private final Executor l;

    public afuh(afsy afsyVar, ysl yslVar, aful afulVar, shf shfVar, ysy ysyVar, afql afqlVar, Executor executor, Executor executor2, ynx ynxVar, afuj afujVar, Set set) {
        this.f = afsyVar;
        this.h = yslVar;
        this.a = afulVar;
        this.i = shfVar;
        this.b = ysyVar;
        this.c = afqlVar;
        this.j = executor;
        this.k = executor2;
        this.l = anaf.E(executor2);
        this.d = ynxVar;
        this.e = afujVar;
        this.g = set;
    }

    public static final afug c(byte[] bArr, String str) {
        return new afug(bArr, str);
    }

    public static final afug d(String str) {
        return new afug(1, str);
    }

    public static final afug e(String str) {
        return new afug(2, str);
    }

    @Deprecated
    public final void a(afug afugVar, cnk cnkVar) {
        b(null, afugVar, cnkVar);
    }

    public final void b(afqm afqmVar, afug afugVar, final cnk cnkVar) {
        int b;
        final Uri uri = afugVar.b;
        if (uri == null || uri.getScheme() == null || uri.getHost() == null) {
            this.j.execute(new Runnable() { // from class: afuc
                @Override // java.lang.Runnable
                public final void run() {
                    cnk cnkVar2 = cnk.this;
                    String valueOf = String.valueOf(uri);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
                    sb.append("Invalid URI ");
                    sb.append(valueOf);
                    cnkVar2.kY(new aftt(sb.toString()));
                }
            });
            return;
        }
        int i = afugVar.k;
        String uri2 = afugVar.b.toString();
        String str = afugVar.a;
        long j = afugVar.e;
        afql afqlVar = this.c;
        if (afqmVar != null) {
            b = afqmVar.a();
        } else {
            b = afqlVar.b();
        }
        long c = this.i.c() + TimeUnit.HOURS.toMillis(b);
        long j2 = (j <= 0 || j >= c) ? c : j;
        long millis = afqmVar != null ? TimeUnit.MINUTES.toMillis(afqmVar.b()) : 0L;
        ArrayList arrayList = new ArrayList();
        if (afqmVar != null) {
            Iterator it = afqmVar.c().iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                if (intValue > 0) {
                    arrayList.add(Long.valueOf(TimeUnit.SECONDS.toMillis(intValue)));
                }
            }
        }
        byte[] bArr = afugVar.c;
        Map map = afugVar.f;
        Set set = this.g;
        shf shfVar = this.i;
        int d = this.c.d();
        afsx afsxVar = afugVar.g;
        if (afsxVar == null) {
            afsxVar = this.f.c();
        }
        afub afubVar = new afub(i, uri2, str, j2, millis, arrayList, bArr, map, cnkVar, set, shfVar, d, afsxVar, afugVar.h, afugVar.j);
        boolean d2 = afqmVar != null ? afqmVar.d() : this.c.g();
        boolean z = afugVar.d;
        if (!d2 || !z || this.a == aful.d) {
            this.h.a(afubVar);
            return;
        }
        afud afudVar = new afud(this, afubVar);
        if (this.c.h()) {
            this.l.execute(afudVar);
        } else {
            this.k.execute(afudVar);
        }
    }
}
