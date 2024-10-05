package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aumj extends aonm implements aooz {
    private static final aumj a;
    private static volatile aopf b;
    private int c;
    private long d;
    private String e = "";
    private boolean f;

    static {
        aumj aumjVar = new aumj();
        a = aumjVar;
        aonm.registerDefaultInstance(aumj.class, aumjVar);
    }

    private aumj() {
    }

    public static aumi a() {
        return (aumi) a.createBuilder();
    }

    public static /* synthetic */ void c(aumj aumjVar, long j) {
        aumjVar.g(j);
    }

    public static /* synthetic */ void d(aumj aumjVar, String str) {
        aumjVar.h(str);
    }

    public static /* synthetic */ void e(aumj aumjVar, boolean z) {
        aumjVar.f(z);
    }

    public void f(boolean z) {
        this.c |= 4;
        this.f = z;
    }

    public void g(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void h(String str) {
        this.c |= 2;
        this.e = str;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aumj();
            case NEW_BUILDER:
                return new aumi();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aumj.class) {
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
}
