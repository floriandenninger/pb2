package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcn extends aonm implements aooz {
    private static final axcn a;
    private static volatile aopf b;
    private int c;
    private boolean d;

    static {
        axcn axcnVar = new axcn();
        a = axcnVar;
        aonm.registerDefaultInstance(axcn.class, axcnVar);
    }

    private axcn() {
    }

    public static axcm a() {
        return (axcm) a.createBuilder();
    }

    public static /* synthetic */ axcn b() {
        return a;
    }

    public void d(boolean z) {
        this.c |= 1;
        this.d = z;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axcn();
            case NEW_BUILDER:
                return new axcm();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axcn.class) {
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
