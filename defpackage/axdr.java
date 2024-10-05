package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdr extends aonm implements aooz {
    private static final axdr a;
    private static volatile aopf b;
    private int c;
    private long d;
    private axeq e;
    private long f;
    private axer g;
    private int h;

    static {
        axdr axdrVar = new axdr();
        a = axdrVar;
        aonm.registerDefaultInstance(axdr.class, axdrVar);
    }

    private axdr() {
    }

    public static axdp b() {
        return (axdp) a.createBuilder();
    }

    public static axdr e() {
        return a;
    }

    public static /* synthetic */ void f(axdr axdrVar, long j) {
        axdrVar.k(j);
    }

    public static /* synthetic */ void g(axdr axdrVar, axeq axeqVar) {
        axdrVar.m(axeqVar);
    }

    public static /* synthetic */ void h(axdr axdrVar, long j) {
        axdrVar.n(j);
    }

    public static /* synthetic */ void i(axdr axdrVar, axer axerVar) {
        axdrVar.o(axerVar);
    }

    public static /* synthetic */ void j(axdr axdrVar, axdq axdqVar) {
        axdrVar.l(axdqVar);
    }

    public void k(long j) {
        this.c |= 1;
        this.d = j;
    }

    public void l(axdq axdqVar) {
        this.h = axdqVar.d;
        this.c |= 16;
    }

    public void m(axeq axeqVar) {
        axeqVar.getClass();
        this.e = axeqVar;
        this.c |= 2;
    }

    public void n(long j) {
        this.c |= 4;
        this.f = j;
    }

    public void o(axer axerVar) {
        axerVar.getClass();
        this.g = axerVar;
        this.c |= 8;
    }

    public long a() {
        return this.f;
    }

    public axdq c() {
        axdq b2 = axdq.b(this.h);
        return b2 == null ? axdq.KEYFRAME_LABEL_UNSPECIFIED : b2;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဌ\u0004", new Object[]{"c", "d", "e", "f", "g", "h", axdq.a()});
            case NEW_MUTABLE_INSTANCE:
                return new axdr();
            case NEW_BUILDER:
                return new axdp();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdr.class) {
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
