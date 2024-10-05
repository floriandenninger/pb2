package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aycu {
    private static final Logger c = Logger.getLogger(aycu.class.getName());
    private static aycu d;
    public final aycl a = new aycs(this);
    public String b = "unknown";
    private final LinkedHashSet e = new LinkedHashSet();
    private amrz f = amvo.b;

    public static synchronized aycu a() {
        aycu aycuVar;
        synchronized (aycu.class) {
            if (d == null) {
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.add(Class.forName("ayig"));
                } catch (ClassNotFoundException e) {
                    c.logp(Level.FINE, "io.grpc.NameResolverRegistry", "getHardCodedClasses", "Unable to find DNS NameResolver", (Throwable) e);
                }
                List<aycr> a = ayaw.a(aycr.class, Collections.unmodifiableList(arrayList), aycr.class.getClassLoader(), new ayct(0));
                if (a.isEmpty()) {
                    c.logp(Level.WARNING, "io.grpc.NameResolverRegistry", "getDefaultRegistry", "No NameResolverProviders found via ServiceLoader, including for DNS. This is probably due to a broken build. If using ProGuard, check your configuration");
                }
                d = new aycu();
                for (aycr aycrVar : a) {
                    Logger logger = c;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(aycrVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.NameResolverRegistry", "getDefaultRegistry", sb.toString());
                    aycrVar.c();
                    d.c(aycrVar);
                }
                d.d();
            }
            aycuVar = d;
        }
        return aycuVar;
    }

    private final synchronized void c(aycr aycrVar) {
        aycrVar.c();
        amkq.F(true, "isAvailable() returned false");
        this.e.add(aycrVar);
    }

    private final synchronized void d() {
        HashMap hashMap = new HashMap();
        Iterator it = this.e.iterator();
        String str = "unknown";
        char c2 = 0;
        while (it.hasNext()) {
            aycr aycrVar = (aycr) it.next();
            String b = aycrVar.b();
            if (((aycr) hashMap.get(b)) == null) {
                hashMap.put(b, aycrVar);
            } else {
                aycrVar.d();
            }
            aycrVar.d();
            if (c2 < 5) {
                aycrVar.d();
                str = aycrVar.b();
            }
            c2 = 5;
        }
        this.f = amrz.j(hashMap);
        this.b = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized Map b() {
        return this.f;
    }
}
