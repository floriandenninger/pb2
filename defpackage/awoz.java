package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awoz extends aonm implements aooz {
    public static final awoz a;
    private static volatile aopf d;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        awoz awozVar = new awoz();
        a = awozVar;
        aonm.registerDefaultInstance(awoz.class, awozVar);
    }

    private awoz() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", awpa.class, "c", awpb.class});
            case NEW_MUTABLE_INSTANCE:
                return new awoz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awoz.class) {
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
