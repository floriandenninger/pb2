package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ankk {
    private static final Logger b = Logger.getLogger(ankk.class.getName());
    private static final ConcurrentMap c = new ConcurrentHashMap();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private static final ConcurrentMap e = new ConcurrentHashMap();
    private static final ConcurrentMap f = new ConcurrentHashMap();
    public static final ConcurrentMap a = new ConcurrentHashMap();
    private static final ConcurrentMap g = new ConcurrentHashMap();

    private ankk() {
    }

    @Deprecated
    public static anjj a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        anjj anjjVar = (anjj) f.get(str.toLowerCase(Locale.US));
        if (anjjVar != null) {
            return anjjVar;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }

    public static synchronized aooy b(anod anodVar) {
        aooy a2;
        synchronized (ankk.class) {
            anjp k = k(anodVar.b);
            if (((Boolean) e.get(anodVar.b)).booleanValue()) {
                a2 = k.a(anodVar.c);
            } else {
                String valueOf = String.valueOf(anodVar.b);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return a2;
    }

    public static Object c(anoc anocVar, Class cls) {
        return o(anocVar.b, anocVar.c, cls);
    }

    public static Object d(String str, byte[] bArr, Class cls) {
        return o(str, aomf.x(bArr), cls);
    }

    public static Object e(String str, aooy aooyVar, Class cls) {
        return r(str, cls).d(aooyVar);
    }

    public static synchronized Map f() {
        Map unmodifiableMap;
        synchronized (ankk.class) {
            unmodifiableMap = Collections.unmodifiableMap(g);
        }
        return unmodifiableMap;
    }

    public static synchronized void g(ankc ankcVar) {
        synchronized (ankk.class) {
            if (ankcVar != null) {
                Class b2 = ankcVar.b();
                ConcurrentMap concurrentMap = a;
                if (concurrentMap.containsKey(b2)) {
                    ankc ankcVar2 = (ankc) concurrentMap.get(b2);
                    if (!ankcVar.getClass().getName().equals(ankcVar2.getClass().getName())) {
                        Logger logger = b;
                        Level level = Level.WARNING;
                        String valueOf = String.valueOf(b2);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62);
                        sb.append("Attempted overwrite of a registered PrimitiveWrapper for type ");
                        sb.append(valueOf);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", b2.getName(), ankcVar2.getClass().getName(), ankcVar.getClass().getName()));
                    }
                }
                concurrentMap.put(b2, ankcVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    public static synchronized void h(anod anodVar) {
        synchronized (ankk.class) {
            anjp k = k(anodVar.b);
            if (((Boolean) e.get(anodVar.b)).booleanValue()) {
                k.f(anodVar.c);
            } else {
                String valueOf = String.valueOf(anodVar.b);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
    }

    public static synchronized void i(ankd ankdVar, anju anjuVar) {
        Class b2;
        synchronized (ankk.class) {
            String d2 = ankdVar.d();
            String d3 = anjuVar.d();
            p(d2, ankdVar.getClass(), ankdVar.a().c(), true);
            p(d3, anjuVar.getClass(), Collections.emptyMap(), false);
            if (!d2.equals(d3)) {
                int g2 = anjuVar.g();
                if (!aobq.af(ankdVar.g())) {
                    String valueOf = String.valueOf(ankdVar.getClass());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                    sb.append("failed to register key manager ");
                    sb.append(valueOf);
                    sb.append(" as it is not FIPS compatible.");
                    throw new GeneralSecurityException(sb.toString());
                }
                if (aobq.af(g2)) {
                    ConcurrentMap concurrentMap = c;
                    if (concurrentMap.containsKey(d2) && (b2 = ((ankj) concurrentMap.get(d2)).b()) != null && !b2.getName().equals(anjuVar.getClass().getName())) {
                        Logger logger = b;
                        Level level = Level.WARNING;
                        StringBuilder sb2 = new StringBuilder(d2.length() + 96 + d3.length());
                        sb2.append("Attempted overwrite of a registered key manager for key type ");
                        sb2.append(d2);
                        sb2.append(" with inconsistent public key type ");
                        sb2.append(d3);
                        logger.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb2.toString());
                        throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", ankdVar.getClass().getName(), b2.getName(), anjuVar.getClass().getName()));
                    }
                    if (!concurrentMap.containsKey(d2) || ((ankj) concurrentMap.get(d2)).b() == null) {
                        concurrentMap.put(d2, new anki(ankdVar, anjuVar));
                        d.put(d2, s());
                        q(ankdVar.d(), ankdVar.a().c());
                    }
                    ConcurrentMap concurrentMap2 = e;
                    concurrentMap2.put(d2, true);
                    if (!concurrentMap.containsKey(d3)) {
                        concurrentMap.put(d3, m(anjuVar));
                    }
                    concurrentMap2.put(d3, false);
                } else {
                    String valueOf2 = String.valueOf(anjuVar.getClass());
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf2).length() + 61);
                    sb3.append("failed to register key manager ");
                    sb3.append(valueOf2);
                    sb3.append(" as it is not FIPS compatible.");
                    throw new GeneralSecurityException(sb3.toString());
                }
            } else {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
        }
    }

    public static synchronized void j(anju anjuVar) {
        synchronized (ankk.class) {
            String d2 = anjuVar.d();
            p(d2, anjuVar.getClass(), anjuVar.a().c(), true);
            if (aobq.af(anjuVar.g())) {
                ConcurrentMap concurrentMap = c;
                if (!concurrentMap.containsKey(d2)) {
                    concurrentMap.put(d2, m(anjuVar));
                    d.put(d2, s());
                    q(d2, anjuVar.a().c());
                }
                e.put(d2, true);
            } else {
                String valueOf = String.valueOf(anjuVar.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
                sb.append("failed to register key manager ");
                sb.append(valueOf);
                sb.append(" as it is not FIPS compatible.");
                throw new GeneralSecurityException(sb.toString());
            }
        }
    }

    public static anjp k(String str) {
        return n(str).e();
    }

    private static ankj m(anju anjuVar) {
        return new ankh(anjuVar);
    }

    private static synchronized ankj n(String str) {
        ankj ankjVar;
        synchronized (ankk.class) {
            ConcurrentMap concurrentMap = c;
            if (!concurrentMap.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            ankjVar = (ankj) concurrentMap.get(str);
        }
        return ankjVar;
    }

    private static Object o(String str, aomf aomfVar, Class cls) {
        return r(str, cls).c(aomfVar);
    }

    private static synchronized void p(String str, Class cls, Map map, boolean z) {
        synchronized (ankk.class) {
            ConcurrentMap concurrentMap = c;
            ankj ankjVar = (ankj) concurrentMap.get(str);
            if (ankjVar != null && !ankjVar.a().equals(cls)) {
                b.logp(Level.WARNING, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", str.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(str) : new String("Attempted overwrite of a registered key manager for key type "));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, ankjVar.a().getName(), cls.getName()));
            }
            if (z) {
                ConcurrentMap concurrentMap2 = e;
                if (!concurrentMap2.containsKey(str) || ((Boolean) concurrentMap2.get(str)).booleanValue()) {
                    if (concurrentMap.containsKey(str)) {
                        for (Map.Entry entry : map.entrySet()) {
                            if (!g.containsKey(entry.getKey())) {
                                String str2 = (String) entry.getKey();
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 79 + str.length());
                                sb.append("Attempted to register a new key template ");
                                sb.append(str2);
                                sb.append(" from an existing key manager of type ");
                                sb.append(str);
                                throw new GeneralSecurityException(sb.toString());
                            }
                        }
                    } else {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if (g.containsKey(entry2.getKey())) {
                                String valueOf = String.valueOf((String) entry2.getKey());
                                throw new GeneralSecurityException(valueOf.length() != 0 ? "Attempted overwrite of a registered key template ".concat(valueOf) : new String("Attempted overwrite of a registered key template "));
                            }
                        }
                    }
                } else {
                    throw new GeneralSecurityException(str.length() != 0 ? "New keys are already disallowed for key type ".concat(str) : new String("New keys are already disallowed for key type "));
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [aooy, java.lang.Object] */
    private static void q(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ConcurrentMap concurrentMap = g;
            String str2 = (String) entry.getKey();
            byte[] byteArray = ((anjr) entry.getValue()).a.toByteArray();
            int i = ((anjr) entry.getValue()).b;
            aone createBuilder = anod.a.createBuilder();
            createBuilder.copyOnWrite();
            ((anod) createBuilder.instance).b = str;
            aomf x = aomf.x(byteArray);
            createBuilder.copyOnWrite();
            ((anod) createBuilder.instance).c = x;
            int i2 = i - 1;
            int i3 = i2 != 0 ? i2 != 1 ? 5 : 4 : 3;
            createBuilder.copyOnWrite();
            ((anod) createBuilder.instance).d = aocz.aG(i3);
            concurrentMap.put(str2, new anjq((anod) createBuilder.build()));
        }
    }

    private static anjp r(String str, Class cls) {
        ankj n = n(str);
        if (n.c().contains(cls)) {
            return n.d(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(n.a());
        Set<Class> c2 = n.c();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : c2) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        int length = String.valueOf(name).length();
        StringBuilder sb3 = new StringBuilder(length + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    private static aobq s() {
        return new aobq();
    }

    public static synchronized void l(anjp anjpVar, boolean z) {
        synchronized (ankk.class) {
            if (anjpVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String e2 = anjpVar.e();
            p(e2, anjpVar.getClass(), Collections.emptyMap(), z);
            c.putIfAbsent(e2, new ankg(anjpVar));
            e.put(e2, Boolean.valueOf(z));
        }
    }
}
