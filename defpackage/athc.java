package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athc extends aonm implements aooz {
    public static final athc a;
    public static final aonk b;
    private static volatile aopf d;
    public aony c = aonm.emptyProtobufList();

    static {
        athc athcVar = new athc();
        a = athcVar;
        aonm.registerDefaultInstance(athc.class, athcVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, athcVar, athcVar, null, 290993185, aoqn.MESSAGE, athc.class);
    }

    private athc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"c"});
            case NEW_MUTABLE_INSTANCE:
                return new athc();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (athc.class) {
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
