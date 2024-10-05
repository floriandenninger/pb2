package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aojc extends aonm implements aooz {
    public static final aojc a;
    private static volatile aopf d;
    public aony b = emptyProtobufList();
    public long c;
    private int e;

    static {
        aojc aojcVar = new aojc();
        a = aojcVar;
        aonm.registerDefaultInstance(aojc.class, aojcVar);
    }

    private aojc() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004ဂ\u0000\u0005\u001b", new Object[]{"e", "c", "b", aokh.class});
            case NEW_MUTABLE_INSTANCE:
                return new aojc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aojc.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
