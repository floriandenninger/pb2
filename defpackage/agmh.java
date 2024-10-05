package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class agmh implements ajlu, ypd {
    public final aais a;
    public final afsy b;
    public final ypa c;
    private final Executor e;
    private final aajb f;
    private final boolean h;
    private final boolean i;
    private final aolb j;
    private final amce k;
    private Boolean g = null;
    final Map d = new HashMap();

    public agmh(aais aaisVar, afsy afsyVar, ypa ypaVar, Executor executor, aajb aajbVar, amce amceVar, boolean z, boolean z2, aolb aolbVar, byte[] bArr) {
        this.a = aaisVar;
        this.b = afsyVar;
        this.c = ypaVar;
        this.e = executor;
        this.f = aajbVar;
        this.k = amceVar;
        this.h = z;
        this.i = z2;
        this.j = aolbVar;
    }

    private final String g(String str) {
        String str2;
        astq astqVar;
        synchronized (this) {
            str2 = (String) this.d.get(str);
        }
        if (str2 != null || d()) {
            return str2;
        }
        aair a = this.a.a(this.b.c());
        aajb aajbVar = this.f;
        ArrayList arrayList = new ArrayList();
        whl.F(agkj.a, 1, str, aajbVar, arrayList);
        List list = (List) a.e(whl.D(aajbVar, arrayList)).X();
        if (list.isEmpty() || (astqVar = (astq) a.f((String) list.get(0)).g(astq.class).X()) == null || (astqVar.b.b & 4) == 0) {
            return null;
        }
        String localImageUrl = astqVar.getLocalImageUrl();
        synchronized (this) {
            this.d.put(str, localImageUrl);
        }
        return localImageUrl;
    }

    @Override // defpackage.ajlu
    public final String a(String str) {
        if (this.b.c().z()) {
            return null;
        }
        String g = g(str);
        try {
            if (this.i && g == null) {
                Uri parse = Uri.parse(str);
                if (this.j.i(parse)) {
                    String uri = this.j.j(new aolh(), parse).toString();
                    if (!str.equals(uri) && (g = g(uri)) != null) {
                        synchronized (this) {
                            this.d.put(str, g);
                        }
                    }
                }
            }
        } catch (tcw e) {
            zga.d("Failed to remove FIFE options during offline lookup!", e);
        }
        return g;
    }

    public final void b() {
        if (c()) {
            final afsx c = this.b.c();
            this.e.execute(new Runnable() { // from class: agmg
                @Override // java.lang.Runnable
                public final void run() {
                    agmh agmhVar = agmh.this;
                    afsx afsxVar = c;
                    if (agmhVar.d() && agmhVar.c()) {
                        afsx c2 = agmhVar.b.c();
                        if (c2.equals(afsxVar)) {
                            aair a = agmhVar.a.a(c2);
                            List list = (List) a.k(197).X();
                            HashMap hashMap = new HashMap();
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                astq astqVar = (astq) a.f((String) it.next()).g(astq.class).X();
                                if (astqVar != null && !astqVar.getLocalImageUrl().isEmpty()) {
                                    hashMap.put(astqVar.getRemoteImageUrl(), astqVar.getLocalImageUrl());
                                }
                            }
                            if (hashMap.isEmpty()) {
                                return;
                            }
                            synchronized (agmhVar) {
                                if (agmhVar.b.c().equals(afsxVar)) {
                                    agmhVar.d.clear();
                                    agmhVar.d.putAll(hashMap);
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    public final boolean c() {
        return !this.b.c().z();
    }

    public final boolean d() {
        if (!this.h) {
            return false;
        }
        if (this.g == null) {
            this.g = Boolean.valueOf(this.k.b() != 2);
        }
        return this.g.booleanValue();
    }

    public final synchronized void e() {
        this.d.clear();
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{aftm.class, afto.class};
        }
        if (i == 0) {
            b();
            return null;
        }
        if (i == 1) {
            e();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
