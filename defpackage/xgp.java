package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class xgp {
    public final aoyp a;
    public long b;
    public boolean c;
    private final shf d;
    private final TimeZone e;
    private long f;
    private List g;
    private boolean h;

    public xgp(aoyp aoypVar, shf shfVar) {
        TimeZone timeZone = TimeZone.getDefault();
        this.a = aoypVar;
        shfVar.getClass();
        this.d = shfVar;
        timeZone.getClass();
        this.e = timeZone;
    }

    public final List a(String str, String str2, aamt aamtVar, String str3, List list, Uri uri) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(new AbstractMap.SimpleEntry("p", str2));
        }
        String valueOf = String.valueOf(str);
        arrayList.add(new AbstractMap.SimpleEntry(valueOf.length() != 0 ? "m.d-".concat(valueOf) : new String("m.d-"), Long.toString(this.f - this.b)));
        arrayList.add(new AbstractMap.SimpleEntry("m.v", "2"));
        long offset = this.f + this.e.getOffset(r1);
        String valueOf2 = String.valueOf(str);
        arrayList.add(new AbstractMap.SimpleEntry(valueOf2.length() != 0 ? "m.lt-".concat(valueOf2) : new String("m.lt-"), Long.toString(anaf.ag(offset / 1000))));
        if ((aamtVar == aamt.MULTI_SELECT || aamtVar == aamt.SINGLE_ANSWERS) && !TextUtils.isEmpty(str3)) {
            String valueOf3 = String.valueOf(str);
            arrayList.add(new AbstractMap.SimpleEntry(valueOf3.length() != 0 ? "r.o-".concat(valueOf3) : new String("r.o-"), str3));
        }
        if (this.g != null) {
            arrayList.add(new AbstractMap.SimpleEntry("t", "a"));
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                int intValue = ((Integer) it.next()).intValue();
                String valueOf4 = String.valueOf(str);
                arrayList.add(new AbstractMap.SimpleEntry(valueOf4.length() != 0 ? "r.r-".concat(valueOf4) : new String("r.r-"), (String) list.get(intValue)));
            }
        } else {
            if (this.h || this.c) {
                String valueOf5 = String.valueOf(str);
                arrayList.add(new AbstractMap.SimpleEntry(valueOf5.length() != 0 ? "m.f-".concat(valueOf5) : new String("m.f-"), "1"));
            }
            if (this.c) {
                arrayList.add(new AbstractMap.SimpleEntry("t", "sd"));
            } else if (uri.getQueryParameter("t") == null || !uri.getQueryParameter("t").equals("a")) {
                arrayList.add(new AbstractMap.SimpleEntry("t", "nr"));
            } else {
                arrayList.add(new AbstractMap.SimpleEntry("t", "pa"));
            }
        }
        return arrayList;
    }

    public final List b(auze auzeVar) {
        Uri uri;
        ArrayList arrayList = new ArrayList();
        for (aoye aoyeVar : auzeVar.b) {
            try {
                uri = wbs.ai(aoyeVar.c);
            } catch (MalformedURLException unused) {
                zga.l("Badly formed uri - ignoring");
                uri = null;
            }
            Uri uri2 = uri;
            if (uri2 != null) {
                arrayList.add(new AbstractMap.SimpleEntry(aoyeVar, a("0", "", aamt.MULTI_SELECT, "", auzeVar.c, uri2)));
            }
        }
        return arrayList;
    }

    public final void c() {
        this.b = this.d.c();
    }

    public final void d() {
        this.f = this.d.c();
        this.g = null;
    }

    public final void e(List list) {
        this.f = this.d.c();
        this.g = Collections.unmodifiableList(list);
    }

    public final void f() {
        this.h = true;
    }
}
