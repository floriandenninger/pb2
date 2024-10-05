package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aybu {
    private static final Logger a = Logger.getLogger(aybu.class.getName());
    private static aybu b;
    private static final Iterable c;
    private final LinkedHashSet d = new LinkedHashSet();
    private final LinkedHashMap e = new LinkedHashMap();

    static {
        ArrayList arrayList = new ArrayList();
        try {
            arrayList.add(Class.forName("aylz"));
        } catch (ClassNotFoundException e) {
            a.logp(Level.WARNING, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find pick-first LoadBalancer", (Throwable) e);
        }
        try {
            arrayList.add(Class.forName("io.grpc.util.SecretRoundRobinLoadBalancerProvider$Provider"));
        } catch (ClassNotFoundException e2) {
            a.logp(Level.FINE, "io.grpc.LoadBalancerRegistry", "getHardCodedClasses", "Unable to find round-robin LoadBalancer", (Throwable) e2);
        }
        c = Collections.unmodifiableList(arrayList);
    }

    public static synchronized aybu b() {
        aybu aybuVar;
        synchronized (aybu.class) {
            if (b == null) {
                List<aybt> a2 = ayaw.a(aybt.class, c, aybt.class.getClassLoader(), new ayct(1));
                b = new aybu();
                for (aybt aybtVar : a2) {
                    Logger logger = a;
                    Level level = Level.FINE;
                    String valueOf = String.valueOf(aybtVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
                    sb.append("Service loader found ");
                    sb.append(valueOf);
                    logger.logp(level, "io.grpc.LoadBalancerRegistry", "getDefaultRegistry", sb.toString());
                    aybtVar.d();
                    b.c(aybtVar);
                }
                b.d();
            }
            aybuVar = b;
        }
        return aybuVar;
    }

    private final synchronized void c(aybt aybtVar) {
        aybtVar.d();
        amkq.F(true, "isAvailable() returned false");
        this.d.add(aybtVar);
    }

    private final synchronized void d() {
        this.e.clear();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            aybt aybtVar = (aybt) it.next();
            String b2 = aybtVar.b();
            if (((aybt) this.e.get(b2)) == null) {
                this.e.put(b2, aybtVar);
            } else {
                aybtVar.c();
            }
        }
    }

    public final synchronized aybt a(String str) {
        return (aybt) this.e.get(str);
    }
}
