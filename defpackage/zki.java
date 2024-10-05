package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class zki implements zkk, ypd {
    public final shf a;
    public final zkd b;
    public final Map c;
    public final Map d;
    public final afsy e;
    public afsx f;
    private final axpg g;

    public zki(ypa ypaVar, shf shfVar, zkd zkdVar, axpg axpgVar, afsy afsyVar) {
        shfVar.getClass();
        this.a = shfVar;
        this.c = new HashMap();
        this.d = new HashMap();
        ypaVar.g(this);
        zkdVar.getClass();
        this.b = zkdVar;
        axpgVar.getClass();
        this.g = axpgVar;
        afsyVar.getClass();
        this.e = afsyVar;
    }

    public static Uri a(Uri uri) {
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        if (arrayList.size() == 0) {
            return Uri.EMPTY;
        }
        arrayList.remove(arrayList.size() - 1);
        return new Uri.Builder().scheme(uri.getScheme()).path(TextUtils.join("/", arrayList)).build();
    }

    public static boolean i(Uri uri) {
        return TextUtils.isEmpty(uri.getPath()) && TextUtils.isEmpty(uri.getScheme());
    }

    private final void j(List list, Uri uri) {
        if (b(uri) != null) {
            list.add(uri);
        }
        Set c = c(uri);
        if (c != null) {
            Iterator it = c.iterator();
            while (it.hasNext()) {
                j(list, (Uri) it.next());
            }
        }
    }

    public final Object b(Uri uri) {
        List<Uri> singletonList = Collections.singletonList(uri);
        amkq.N(this.g != null);
        e();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Uri uri2 : singletonList) {
            zkh zkhVar = (zkh) this.c.get(uri2);
            if (zkhVar != null && zkhVar.a(this.a)) {
                arrayList.add(uri2);
            }
            if (zkhVar != null) {
                hashMap.put(uri2, zkhVar.a);
            }
        }
        if (!arrayList.isEmpty()) {
            ((zkl) this.g.get()).b(arrayList);
        }
        return hashMap.get(uri);
    }

    public final Set c(Uri uri) {
        return (Set) this.d.get(uri);
    }

    public final void d() {
        this.c.clear();
        this.d.clear();
    }

    public final void e() {
        yjk.f();
        afsx afsxVar = this.f;
        afsx c = this.e.c();
        this.f = c;
        if (afsxVar == null && c == null) {
            return;
        }
        if (afsxVar == null || c == null || !TextUtils.equals(afsxVar.b(), this.f.b())) {
            d();
        }
    }

    @Override // defpackage.zkk
    public final void g(Collection collection, final zjz zjzVar) {
        amkq.N(this.g != null);
        e();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            zkh zkhVar = (zkh) this.c.get(uri);
            if (zkhVar == null || zkhVar.a(this.a)) {
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        ((zkl) this.g.get()).c(arrayList, new zjz() { // from class: zkg
            @Override // defpackage.zjz
            public final void a() {
                zjz zjzVar2 = zjz.this;
                zjy zjyVar = new zjy(false);
                akhs akhsVar = (akhs) zjzVar2;
                akhsVar.h();
                if (zjyVar.a || akhsVar.d == null || akhsVar.e == null) {
                    ((akjv) akhsVar.b).kv();
                } else {
                    akhsVar.d();
                }
            }
        });
    }

    public final void h(Uri uri) {
        int i;
        ArrayList arrayList = new ArrayList();
        j(arrayList, uri);
        int size = arrayList.size();
        while (i < size) {
            Uri uri2 = (Uri) arrayList.get(i);
            this.c.remove(uri2);
            i = c(uri2) != null ? i + 1 : 0;
            do {
                this.d.remove(uri2);
                Uri a = a(uri2);
                Map map = this.d;
                if (map.containsKey(a) && ((LinkedHashSet) map.get(a)).contains(uri2)) {
                    ((LinkedHashSet) map.get(a)).remove(uri2);
                }
                Set set = (Set) this.d.get(a);
                if (set != null && set.size() == 0) {
                    this.d.remove(a);
                }
                uri2 = a(uri2);
                if (!i(uri2) && c(uri2) == null) {
                }
            } while (b(uri2) == null);
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            yjk.f();
            d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
