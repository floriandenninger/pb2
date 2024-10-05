package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajmu implements ypd {
    static final long a = TimeUnit.SECONDS.toMillis(10);
    static final Uri b = new Uri.Builder().scheme("yt").authority("reactr").build();
    private final Map c = new HashMap();
    private final WeakHashMap d = new WeakHashMap();
    private final LruCache e = new LruCache(1000);
    private final shf f;
    private long g;

    public ajmu(shf shfVar, ypa ypaVar) {
        shfVar.getClass();
        this.f = shfVar;
        this.g = Long.MAX_VALUE;
        ypaVar.g(this);
    }

    static Uri a(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.path("");
        for (int i = 0; i < pathSegments.size() - 1; i++) {
            buildUpon.appendPath(pathSegments.get(i));
        }
        return buildUpon.build();
    }

    public static Uri g(int i, String... strArr) {
        amkq.E(true);
        amkq.E(true);
        amkq.E(true);
        amkq.E(!TextUtils.isEmpty(strArr[0]));
        Uri.Builder buildUpon = b.buildUpon();
        buildUpon.authority(i != 1 ? i != 2 ? i != 3 ? "SUBSCRIPTIONS" : "SOCIAL" : "NOTIFICATIONS" : "COMMENTS");
        for (String str : strArr) {
            zhq.m(str);
            buildUpon.appendPath(str);
        }
        return buildUpon.build();
    }

    private final List i(Uri uri, boolean z) {
        yjk.f();
        List list = (List) this.c.get(uri);
        if (list != null || !z) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.c.put(uri, arrayList);
        return arrayList;
    }

    private final boolean j(Uri uri) {
        List i = i(uri, false);
        if (i != null) {
            Iterator it = i.iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == null) {
                    it.remove();
                }
            }
        }
        return (i == null || i.isEmpty()) ? false : true;
    }

    public final ajms b(Uri uri) {
        yjk.f();
        return (ajms) this.e.get(uri);
    }

    public final ajms c(Uri uri, ajms ajmsVar) {
        ajmsVar.getClass();
        ajms ajmsVar2 = (ajms) this.e.get(uri);
        if (ajmsVar2 == null || (ajmsVar = ajmsVar2.e(ajmsVar)) != null) {
            d(uri, ajmsVar);
            return ajmsVar;
        }
        throw new IllegalStateException();
    }

    public final void d(Uri uri, ajms ajmsVar) {
        yjk.f();
        this.e.put(uri, ajmsVar);
        yjk.f();
        for (Uri uri2 = uri; uri2 != null; uri2 = a(uri2)) {
            List i = i(uri2, false);
            if (i != null) {
                i = new ArrayList(i);
            }
            if (i != null) {
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    ajmt ajmtVar = (ajmt) ((WeakReference) it.next()).get();
                    if (ajmtVar == null) {
                        it.remove();
                    } else {
                        ajmtVar.kB(uri2, uri);
                    }
                }
            }
        }
    }

    public final void e(ajmt ajmtVar) {
        ajmtVar.getClass();
        Set set = (Set) this.d.remove(ajmtVar);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            List i = i((Uri) it.next(), false);
            if (i != null) {
                Iterator it2 = i.iterator();
                while (it2.hasNext()) {
                    ajmt ajmtVar2 = (ajmt) ((WeakReference) it2.next()).get();
                    if (ajmtVar2 == null) {
                        it2.remove();
                    } else if (ajmtVar2 == ajmtVar) {
                        it2.remove();
                    }
                }
            }
        }
    }

    public final void h(Uri uri, ajmt ajmtVar) {
        uri.getClass();
        ajmtVar.getClass();
        yjk.f();
        Set set = (Set) this.d.get(ajmtVar);
        if (set == null) {
            set = new HashSet();
            this.d.put(ajmtVar, set);
        }
        if (set.add(uri)) {
            i(uri, true).add(new WeakReference(ajmtVar));
        }
        long d = this.f.d();
        long j = this.g;
        if (j == -1 || d - j >= a) {
            HashMap hashMap = new HashMap();
            hashMap.put(uri, true);
            for (Uri uri2 : this.c.keySet()) {
                if (!hashMap.containsKey(uri2)) {
                    Uri a2 = a(uri2);
                    Boolean bool = (Boolean) hashMap.get(a2);
                    if (bool == null) {
                        bool = Boolean.valueOf(j(a2));
                        hashMap.put(a2, bool);
                    }
                    boolean z = j(uri2) || bool.booleanValue();
                    if (!z) {
                        this.e.remove(uri2);
                    }
                    hashMap.put(uri2, Boolean.valueOf(z));
                }
            }
            this.g = d;
        }
    }

    @Override // defpackage.ypd
    public final Class[] kz(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afto.class};
        }
        if (i == 0) {
            this.e.evictAll();
            this.c.clear();
            this.d.clear();
            this.g = this.f.d();
            return null;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append("unsupported op code: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }
}
