package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axcd extends aonm implements aooz {
    private static final axcd a;
    private static volatile aopf b;
    private int c;
    private long d;

    static {
        axcd axcdVar = new axcd();
        a = axcdVar;
        aonm.registerDefaultInstance(axcd.class, axcdVar);
    }

    private axcd() {
    }

    public static axcc a() {
        return (axcc) a.createBuilder();
    }

    public static /* synthetic */ axcd b() {
        return a;
    }

    public void d(long j) {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axcd();
            case NEW_BUILDER:
                return new axcc();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axcd.class) {
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
