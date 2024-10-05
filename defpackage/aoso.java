package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoso extends aonm implements aooz {
    private static final aoso a;
    private static volatile aopf b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private String h = "";

    static {
        aoso aosoVar = new aoso();
        a = aosoVar;
        aonm.registerDefaultInstance(aoso.class, aosoVar);
    }

    private aoso() {
    }

    public static aosn a() {
        return (aosn) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(aosr aosrVar) {
        this.e = aosrVar.u;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(aosq aosqVar) {
        this.g = aosqVar.n;
        this.c |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(aoss aossVar) {
        this.f = aossVar.e;
        this.c |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(aost aostVar) {
        this.d = aostVar.ae;
        this.c |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(String str) {
        str.getClass();
        this.c |= 64;
        this.h = str;
    }

    public aosq c() {
        aosq b2 = aosq.b(this.g);
        return b2 == null ? aosq.UNKNOWN_COMPONENT_APPEARANCE : b2;
    }

    public aosr d() {
        aosr b2 = aosr.b(this.e);
        return b2 == null ? aosr.UNKNOWN_COMPONENT : b2;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0004ဌ\u0003\u0006ဌ\u0005\u0007ဈ\u0006", new Object[]{"c", "d", aost.a(), "e", aosr.a(), "f", aoss.a(), "g", aosq.a(), "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aoso();
            case NEW_BUILDER:
                return new aosn();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aoso.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public aost e() {
        aost b2 = aost.b(this.d);
        return b2 == null ? aost.UNKNOWN_EVENT : b2;
    }
}
