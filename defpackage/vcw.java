package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class vcw {
    private final Map a;
    private final Map b;
    private final List c;

    public vcw(List list) {
        List<ven> emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        this.a = new HashMap();
        this.b = new HashMap();
        this.c = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            vei veiVar = (vei) it.next();
            if (TextUtils.isEmpty(veiVar.h())) {
                Log.w("MobStore.FileStorage", "Cannot register backend, name empty");
            } else {
                vei veiVar2 = (vei) this.a.put(veiVar.h(), veiVar);
                if (veiVar2 != null) {
                    String canonicalName = veiVar2.getClass().getCanonicalName();
                    String canonicalName2 = veiVar.getClass().getCanonicalName();
                    StringBuilder sb = new StringBuilder(String.valueOf(canonicalName).length() + 30 + String.valueOf(canonicalName2).length());
                    sb.append("Cannot override Backend ");
                    sb.append(canonicalName);
                    sb.append(" with ");
                    sb.append(canonicalName2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        for (ven venVar : emptyList) {
            if (TextUtils.isEmpty(venVar.a())) {
                Log.w("MobStore.FileStorage", "Cannot register transform, name empty");
            } else {
                ven venVar2 = (ven) this.b.put(venVar.a(), venVar);
                if (venVar2 != null) {
                    String canonicalName3 = venVar2.getClass().getCanonicalName();
                    String canonicalName4 = venVar.getClass().getCanonicalName();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName3).length() + 35 + String.valueOf(canonicalName4).length());
                    sb2.append("Cannot to override Transform ");
                    sb2.append(canonicalName3);
                    sb2.append(" with ");
                    sb2.append(canonicalName4);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
        this.c.addAll(emptyList2);
    }

    private static final Uri k(Uri uri) {
        return uri.buildUpon().fragment(null).build();
    }

    private final vcu l(Uri uri) {
        amru n = n(uri);
        vct vctVar = new vct();
        vctVar.a = this;
        vctVar.b = m(uri.getScheme());
        vctVar.d = this.c;
        vctVar.c = n;
        vctVar.e = uri;
        if (!n.isEmpty()) {
            ArrayList arrayList = new ArrayList(uri.getPathSegments());
            if (!arrayList.isEmpty() && !uri.getPath().endsWith("/")) {
                String str = (String) arrayList.get(arrayList.size() - 1);
                ListIterator listIterator = n.listIterator(n.size());
                while (listIterator.hasPrevious()) {
                    str = ((ven) listIterator.previous()).c();
                }
                arrayList.set(arrayList.size() - 1, str);
                uri = uri.buildUpon().path(TextUtils.join("/", arrayList)).encodedFragment(null).build();
            }
        }
        vctVar.f = uri;
        return new vcu(vctVar);
    }

    private final vei m(String str) {
        vei veiVar = (vei) this.a.get(str);
        if (veiVar != null) {
            return veiVar;
        }
        throw new vds(String.format("Cannot open, unregistered backend: %s", str));
    }

    private final amru n(Uri uri) {
        amrp f = amru.f();
        amru a = vdy.a(uri);
        int i = ((amvj) a).c;
        for (int i2 = 0; i2 < i; i2++) {
            String str = (String) a.get(i2);
            ven venVar = (ven) this.b.get(str);
            if (venVar != null) {
                f.h(venVar);
            } else {
                String valueOf = String.valueOf(uri);
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(valueOf).length());
                sb.append("No such transform: ");
                sb.append(str);
                sb.append(": ");
                sb.append(valueOf);
                throw new vds(sb.toString());
            }
        }
        return f.g().a();
    }

    public final long a(Uri uri) {
        vcu l = l(uri);
        return l.b.a(l.f);
    }

    public final Iterable b(Uri uri) {
        vei m = m(uri.getScheme());
        amru n = n(uri);
        ArrayList arrayList = new ArrayList();
        String encodedFragment = uri.getEncodedFragment();
        Iterator it = m.g(k(uri)).iterator();
        while (it.hasNext()) {
            Uri build = ((Uri) it.next()).buildUpon().encodedFragment(encodedFragment).build();
            if (!n.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(build.getPathSegments());
                if (!arrayList2.isEmpty() && !build.getPath().endsWith("/")) {
                    String str = (String) amkq.bj(arrayList2);
                    Iterator it2 = n.iterator();
                    while (it2.hasNext()) {
                        str = ((ven) it2.next()).b();
                    }
                    arrayList2.set(arrayList2.size() - 1, str);
                    build = build.buildUpon().path(TextUtils.join("/", arrayList2)).build();
                }
            }
            arrayList.add(build);
        }
        return arrayList;
    }

    public final Object c(Uri uri, vcv vcvVar) {
        return vcvVar.a(l(uri));
    }

    public final void d(Uri uri) {
        m(uri.getScheme()).i(k(uri));
    }

    public final void e(Uri uri) {
        m(uri.getScheme()).j(k(uri));
    }

    public final void f(Uri uri) {
        vcu l = l(uri);
        l.b.k(l.f);
    }

    public final void g(Uri uri, Uri uri2) {
        vcu l = l(uri);
        vcu l2 = l(uri2);
        vei veiVar = l.b;
        if (veiVar == l2.b) {
            veiVar.l(l.f, l2.f);
            return;
        }
        throw new vds("Cannot rename file across backends");
    }

    public final boolean h(Uri uri) {
        vcu l = l(uri);
        return l.b.m(l.f);
    }

    public final boolean i(Uri uri) {
        return m(uri.getScheme()).n(k(uri));
    }

    @Deprecated
    public final void j(Uri uri) {
        if (h(uri)) {
            if (!i(uri)) {
                f(uri);
                return;
            }
            Iterator it = b(uri).iterator();
            while (it.hasNext()) {
                j((Uri) it.next());
            }
            e(uri);
        }
    }
}
