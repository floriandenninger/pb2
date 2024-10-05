package defpackage;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public class actb {
    public boolean a;
    private final String c;
    private final int d;
    private final boolean e;
    private String h;
    private eda i;
    private Set j;
    private Set k;
    private edb l;
    private final Set g = new HashSet();
    private final Map f = new HashMap();
    private final String b = i(this);

    /* JADX INFO: Access modifiers changed from: protected */
    public actb(String str, int i, boolean z) {
        this.c = str;
        this.e = z;
        this.d = i;
    }

    private static String i(Object obj) {
        int i;
        String name = obj.getClass().getName();
        int indexOf = name.indexOf(36);
        if (indexOf < 0 || (i = indexOf + 1) >= name.length()) {
            return obj.getClass().getSimpleName();
        }
        return name.substring(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean a(ynz ynzVar) {
        if (!h()) {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 29);
            sb.append("CsiAction [");
            sb.append(str);
            sb.append("] not yet started.");
            zga.l(sb.toString());
            return false;
        }
        boolean z = ynzVar instanceof yob;
        String f = ynzVar.f();
        Class<?> cls = ynzVar.getClass();
        if (z || !this.g.contains(f)) {
            if (TextUtils.isEmpty(f)) {
                zga.l(String.format("CsiAction [%s] triggered with no registered label", this.b));
            } else {
                if (z) {
                    if (this.f.containsKey(f)) {
                        int intValue = ((Integer) this.f.get(f)).intValue();
                        this.f.put(f, Integer.valueOf(intValue + 1));
                        String valueOf = String.valueOf(f);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                        sb2.append(valueOf);
                        sb2.append("_");
                        sb2.append(intValue);
                        f = sb2.toString();
                    } else {
                        this.f.put(f, 1);
                    }
                }
                if (this.l.d(this.i, ynzVar.h(), f)) {
                    this.g.add(f);
                } else {
                    zga.l(String.format("CsiAction [%s] past event %s can't be marked", this.b, f));
                }
            }
        } else if (!TextUtils.equals(this.h, f)) {
            zga.l(String.format("CsiAction [%s] already ticked %s. Ignored.", this.b, f));
        }
        this.a |= this.k.contains(cls) && this.g.size() > 1;
        boolean z2 = this.j.contains(cls) && this.g.size() > 1;
        if (this.k.contains(cls)) {
            String.format("CsiAction DROP [%s](%b) due to: %s", this.b, Boolean.valueOf(this.a), i(ynzVar));
        }
        if (this.j.contains(cls)) {
            String.format("CsiAction END [%s](%b) due to: %s", this.b, Boolean.valueOf(z2), i(ynzVar));
        }
        return z2 || this.a;
    }

    public edb b() {
        if (!h()) {
            zga.l("CsiAction.start() should be called before report. Ignored.");
            return null;
        }
        g("mod_li", true != this.e ? "0" : "1");
        g("conn", String.valueOf(this.d));
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void c(ynz ynzVar, Set set, Set set2) {
        if (h()) {
            String str = this.b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38);
            sb.append("CsiAction [");
            sb.append(str);
            sb.append("] already started. Ignored.");
            zga.l(sb.toString());
            return;
        }
        String.format("CsiAction START [%s] due to: %s", this.b, i(ynzVar));
        set.getClass();
        this.j = set;
        set2.getClass();
        this.k = set2;
        this.l = new edb(this.c);
        this.i = edb.e(ynzVar.h());
        this.h = ynzVar.f();
        g("yt_lt", "warm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(actb actbVar) {
        String.format("CsiAction CLONE [%s] from %s", this.b, i(actbVar));
        if (!actbVar.h() || actbVar.a || !h() || this.a) {
            return;
        }
        Long l = actbVar.i.a;
        this.g.addAll(actbVar.g);
        edb edbVar = actbVar.l;
        long longValue = l.longValue();
        edb edbVar2 = this.l;
        eda e = edb.e(longValue);
        Iterator it = edbVar.a.iterator();
        while (it.hasNext()) {
            eda edaVar = (eda) it.next();
            edbVar2.d(e, edaVar.a.longValue(), edaVar.b);
        }
        Map b = edbVar.b();
        if (b != null && !b.isEmpty()) {
            for (Map.Entry entry : b.entrySet()) {
                edbVar2.c((String) entry.getKey(), (String) entry.getValue());
            }
        }
        this.i = e;
    }

    public final void e() {
        String.format("CsiAction DROP [%s]", this.b);
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str) {
        this.l.b = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void g(String str, String str2) {
        if (h()) {
            this.l.c(str, str2);
        } else {
            zga.l("CsiAction not yet started.");
        }
    }

    final boolean h() {
        return (this.l == null || this.i == null) ? false : true;
    }
}
