package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdt extends aonm implements aooz {
    private static final axdt a;
    private static volatile aopf b;
    private int c;
    private long d;
    private int e;

    static {
        axdt axdtVar = new axdt();
        a = axdtVar;
        aonm.registerDefaultInstance(axdt.class, axdtVar);
    }

    private axdt() {
    }

    public static axds a() {
        return (axds) a.createBuilder();
    }

    public static /* synthetic */ axdt b() {
        return a;
    }

    public void e(int i) {
        this.c |= 2;
        this.e = i;
    }

    public void f(long j) {
        this.c |= 1;
        this.d = j;
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new axdt();
            case NEW_BUILDER:
                return new axds();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdt.class) {
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
