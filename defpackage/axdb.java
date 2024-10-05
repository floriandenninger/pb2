package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class axdb extends aonm implements aooz {
    private static final axdb a;
    private static volatile aopf b;
    private int c;
    private axck d;

    static {
        axdb axdbVar = new axdb();
        a = axdbVar;
        aonm.registerDefaultInstance(axdb.class, axdbVar);
    }

    private axdb() {
    }

    public static axdb c() {
        return a;
    }

    public axck a() {
        axck axckVar = this.d;
        return axckVar == null ? axck.a : axckVar;
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new axdb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (axdb.class) {
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
