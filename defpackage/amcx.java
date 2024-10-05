package defpackage;

import com.google.apps.tiktok.contrib.work.TikTokListenableWorker;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class amcx implements amcp {
    private final bzh a;
    private final Map b;
    private final Pattern c = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    private final Pattern d = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public amcx(bzh bzhVar, Map map) {
        this.a = bzhVar;
        this.b = map;
    }

    private static final bzj b(amct amctVar) {
        amkq.N(true);
        byz byzVar = new byz(TikTokListenableWorker.class);
        byzVar.d(amctVar.b);
        amcr amcrVar = amctVar.d;
        byzVar.e(amcrVar.a, amcrVar.b);
        byzVar.f(amctVar.e);
        amxd listIterator = amctVar.h.listIterator();
        while (listIterator.hasNext()) {
            byzVar.c((String) listIterator.next());
        }
        return byzVar.b();
    }

    @Override // defpackage.amcp
    public final anhy a(amct amctVar) {
        amxd listIterator = amctVar.h.listIterator();
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            if (this.c.matcher(str).matches()) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
                sb.append("Tag ");
                sb.append(str);
                sb.append(" is reserved by AccountWorkManager.");
                throw new amcv(sb.toString());
            }
        }
        amxd listIterator2 = amctVar.h.listIterator();
        while (listIterator2.hasNext()) {
            String str2 = (String) listIterator2.next();
            if (this.d.matcher(str2).matches()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 38);
                sb2.append("Tag ");
                sb2.append(str2);
                sb2.append(" is reserved by TikTokWorkManager.");
                throw new amcv(sb2.toString());
            }
        }
        Class cls = amctVar.a;
        String str3 = (String) this.b.get(cls);
        cls.toString();
        str3.getClass();
        amsx r = amsx.r(str3.length() != 0 ? "TikTokWorker#".concat(str3) : new String("TikTokWorker#"));
        amcq amcqVar = new amcq(amctVar);
        amsx amsxVar = amctVar.h;
        amsxVar.getClass();
        amcqVar.c(new amvy(amsxVar, r));
        amct a = amcqVar.a();
        final int i = 1;
        amkq.N(true);
        if (!a.g.h()) {
            amkq.N(true);
            amkq.N(!a.g.h());
            final bzj b = b(a);
            return anfq.h(((bzp) this.a.a(b)).c, new amml() { // from class: amcw
                @Override // defpackage.amml
                public final Object apply(Object obj) {
                    if (i != 0) {
                        return b.a;
                    }
                    return b.a;
                }
            }, angq.a);
        }
        amkq.N(true);
        amkq.N(a.g.h());
        final bzj b2 = b(a);
        bzh bzhVar = this.a;
        String str4 = ((amcs) a.g.c()).a;
        cex cexVar = ((bzp) bzhVar.g(str4, 1, b2)).c;
        final int i2 = 0;
        return anfq.h(cexVar, new amml() { // from class: amcw
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                if (i2 != 0) {
                    return b2.a;
                }
                return b2.a;
            }
        }, angq.a);
    }
}
