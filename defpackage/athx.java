package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athx extends aonm implements aooz {
    public static final athx a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aony d = aonm.emptyProtobufList();

    static {
        athx athxVar = new athx();
        a = athxVar;
        aonm.registerDefaultInstance(athx.class, athxVar);
    }

    private athx() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new athx();
            case NEW_BUILDER:
                return new aone((boolean[]) null, (float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (athx.class) {
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
