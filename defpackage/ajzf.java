package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajzf {
    static final long a = TimeUnit.DAYS.toMillis(1);
    private final shf b;
    private final axpg c;
    private final afsy d;

    public ajzf(shf shfVar, axpg axpgVar, afsy afsyVar) {
        this.b = shfVar;
        this.c = axpgVar;
        this.d = afsyVar;
    }

    public static /* synthetic */ void b(Throwable th) {
        zga.d("Failed to store impression records.", th);
    }

    public final void a(final List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        final String b = this.d.c().b();
        final long c = this.b.c();
        ynm.m(((ywr) this.c.get()).b(new amml() { // from class: ajze
            @Override // defpackage.amml
            public final Object apply(Object obj) {
                aone builder;
                List list2 = list;
                String str = b;
                long j = c;
                awwr awwrVar = (awwr) obj;
                if (awwrVar == null) {
                    builder = awwr.a.createBuilder();
                } else {
                    builder = awwrVar.toBuilder();
                }
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String valueOf = String.valueOf(((apua) it.next()).b);
                    String concat = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
                    awws awwsVar = awws.a;
                    concat.getClass();
                    Map unmodifiableMap = Collections.unmodifiableMap(((awwr) builder.instance).c);
                    if (unmodifiableMap.containsKey(concat)) {
                        awwsVar = (awws) unmodifiableMap.get(concat);
                    }
                    aone builder2 = awwsVar.toBuilder();
                    builder2.bC(j);
                    builder.bB(concat, (awws) builder2.build());
                }
                awwr awwrVar2 = (awwr) builder.build();
                aone createBuilder = awwr.a.createBuilder();
                boolean z = awwrVar2.d;
                createBuilder.copyOnWrite();
                awwr awwrVar3 = (awwr) createBuilder.instance;
                awwrVar3.b |= 1;
                awwrVar3.d = z;
                long j2 = awwrVar2.e;
                createBuilder.copyOnWrite();
                awwr awwrVar4 = (awwr) createBuilder.instance;
                awwrVar4.b |= 2;
                awwrVar4.e = j2;
                if (awwrVar2 == null || awwrVar2.c.size() == 0) {
                    return (awwr) createBuilder.build();
                }
                long j3 = j - ajzf.a;
                for (Map.Entry entry : Collections.unmodifiableMap(awwrVar2.c).entrySet()) {
                    aone createBuilder2 = awws.a.createBuilder();
                    Iterator it2 = ((awws) entry.getValue()).b.iterator();
                    while (it2.hasNext()) {
                        long longValue = ((Long) it2.next()).longValue();
                        if (longValue >= j3) {
                            createBuilder2.bC(longValue);
                        }
                    }
                    if (((awws) createBuilder2.instance).b.size() > 0) {
                        createBuilder.bB((String) entry.getKey(), (awws) createBuilder2.build());
                    }
                }
                return (awwr) createBuilder.build();
            }
        }), ailg.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean c(List list) {
        if (list != null && !list.isEmpty()) {
            String b = this.d.c().b();
            long c = this.b.c();
            awwr awwrVar = (awwr) ynm.g(((ywr) this.c.get()).a(), 2000L, TimeUnit.MILLISECONDS, awwr.a);
            if (awwrVar.d) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                apua apuaVar = (apua) it.next();
                String valueOf = String.valueOf(apuaVar.b);
                String concat = valueOf.length() != 0 ? b.concat(valueOf) : new String(b);
                awws awwsVar = awws.a;
                concat.getClass();
                aoot aootVar = awwrVar.c;
                if (aootVar.containsKey(concat)) {
                    awwsVar = (awws) aootVar.get(concat);
                }
                long j = awwrVar.e;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (j < 0) {
                    j = apuaVar.d;
                }
                long max = Math.max(c - timeUnit.toMillis(j), c - a);
                Iterator it2 = awwsVar.b.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (((Long) it2.next()).longValue() > max) {
                        i++;
                    }
                }
                if (i >= apuaVar.c) {
                    return false;
                }
            }
        }
        return true;
    }
}
