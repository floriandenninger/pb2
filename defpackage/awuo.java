package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awuo extends aonm implements aooz {
    public static final awuo a;
    private static volatile aopf e;
    public int b;
    public long c;
    public aoot d = aoot.a;

    static {
        awuo awuoVar = new awuo();
        a = awuoVar;
        aonm.registerDefaultInstance(awuo.class, awuoVar);
    }

    private awuo() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0001\u0000\u0000\u0001ဂ\u0000\u00032", new Object[]{"b", "c", "d", awun.a});
            case NEW_MUTABLE_INSTANCE:
                return new awuo();
            case NEW_BUILDER:
                return new aone((float[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awuo.class) {
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
