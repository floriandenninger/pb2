package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aeie {
    static final Character[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public final amnv b;
    public final long c;
    public final shf d;
    public final ScheduledExecutorService e;
    public final aeig f;
    public final long g;
    public long h;
    public final long i;
    public final ArrayList j;
    public final Set k;
    public String l;
    public boolean m;
    public final yss n;
    private final ysy o;
    private final int p;
    private final boolean q;
    private boolean r;

    public aeie(amnv amnvVar, String str, List list, long j, long j2, int i, shf shfVar, ScheduledExecutorService scheduledExecutorService, ysy ysyVar, aeig aeigVar, aaoz aaozVar, yss yssVar, Set set) {
        afki.a(amnvVar);
        this.b = amnvVar;
        this.c = j > 0 ? j : 25000L;
        this.i = j2;
        afki.a(shfVar);
        this.d = shfVar;
        this.g = shfVar.d();
        afki.a(scheduledExecutorService);
        this.e = scheduledExecutorService;
        this.f = aeigVar;
        this.r = false;
        this.l = "ns";
        this.o = ysyVar;
        this.p = i;
        this.n = yssVar;
        this.k = set;
        ArrayList arrayList = new ArrayList();
        this.j = arrayList;
        if (list.isEmpty()) {
            this.q = true;
            zhq.m(str);
            Uri parse = Uri.parse(str);
            arrayList.add(new aeib(this, parse, aaozVar));
            arrayList.add(new aeib(this, a(parse), aaozVar));
            arrayList.add(new aeib(this, parse.buildUpon().appendQueryParameter("cmo", "pf=1").build(), aaozVar));
            return;
        }
        this.q = false;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.j.add(new aeib(this, Uri.parse((String) it.next()), aaozVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Uri a(Uri uri) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            Character[] chArr = a;
            int length = chArr.length;
            sb.append(chArr[random.nextInt(16)].charValue());
        }
        zhy b = zhy.b(uri);
        b.g("id", sb.toString());
        return b.a();
    }

    public static void f(aeib aeibVar) {
        Uri uri;
        try {
            try {
                if (!aeibVar.f.get().aT()) {
                    uri = aeibVar.a;
                } else {
                    uri = aelz.a(aeibVar.a);
                }
                aeibVar.e.h(new ath(uri));
                aeibVar.f(aeibVar.e.i());
                aeibVar.d();
                try {
                    aeibVar.e.j();
                } catch (atn unused) {
                }
            } catch (Throwable th) {
                try {
                    aeibVar.e.j();
                } catch (atn unused2) {
                }
                throw th;
            }
        } catch (atn unused3) {
            aeibVar.c();
            try {
                aeibVar.e.j();
            } catch (atn unused4) {
            }
        }
    }

    private final aely j(String str) {
        aely a2;
        if (str == null) {
            a2 = this.f.b();
        } else {
            a2 = this.f.a(str);
        }
        if (a2 != null) {
            return a2;
        }
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            aeib aeibVar = (aeib) arrayList.get(i);
            String b = aeibVar.b();
            if (b != null && !TextUtils.equals(b, str)) {
                return new aely(b, -1, aeibVar.a());
            }
        }
        return null;
    }

    public final synchronized long b() {
        return ((aeib) this.j.get(0)).c;
    }

    public final synchronized aely c(String str) {
        return j(str);
    }

    public final synchronized aely d() {
        return j(null);
    }

    public final synchronized void g(long j) {
        this.l = null;
        this.m = true;
        if (this.r) {
            return;
        }
        this.h = this.d.d();
        this.r = true;
        this.e.schedule(new aeid(this, this.o, this.q, this.p), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void h(String str) {
        this.l = str;
        this.m = false;
    }

    public final void e(Uri uri) {
        aeig aeigVar = this.f;
        String host = uri == null ? null : uri.getHost();
        if (host != null) {
            aeigVar.b.put(host, uri);
            aejw aejwVar = (aejw) aeigVar.a.get(host);
            if (aejwVar != null) {
                aejwVar.b = uri;
            }
        }
    }

    public aeie() {
    }
}
