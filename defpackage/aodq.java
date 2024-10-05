package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aodq extends aonm implements aooz {
    public static final aodq a;
    private static volatile aopf c;
    public aoot b = aoot.a;
    private aoot d = aoot.a;
    private aoot e = aoot.a;

    static {
        aodq aodqVar = new aodq();
        a = aodqVar;
        aonm.registerDefaultInstance(aodq.class, aodqVar);
    }

    private aodq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0003\u0000\u0000\u00012\u0002࠲\u00032", new Object[]{"b", aodn.a, "e", aodm.a, ancx.r, "d", aodp.a});
            case NEW_MUTABLE_INSTANCE:
                return new aodq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (aodq.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
