package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aocq extends aonm implements aooz {
    public static final aocq a;
    private static volatile aopf e;
    public String b = "";
    public int c;
    public int d;

    static {
        aocq aocqVar = new aocq();
        a = aocqVar;
        aonm.registerDefaultInstance(aocq.class, aocqVar);
    }

    private aocq() {
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
                return newMessageInfo(a, "\u0000\u0003\u0000\u0000\u0001\u0005\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0004\u0005\f", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aocq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aocq.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
