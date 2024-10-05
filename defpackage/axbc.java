package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axbc extends aonm implements aooz {
    public static final axbc a;
    private static volatile aopf f;
    public int b;
    public aomf c;
    public int d;
    public int e;

    static {
        axbc axbcVar = new axbc();
        a = axbcVar;
        aonm.registerDefaultInstance(axbc.class, axbcVar);
    }

    private axbc() {
        emptyProtobufList();
        this.c = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0004\n\u0003\u0000\u0000\u0000\u0004ည\u0002\u0007ဋ\u0005\nဋ\b", new Object[]{"b", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new axbc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (axbc.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
