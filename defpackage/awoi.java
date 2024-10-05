package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awoi extends aonm implements aooz {
    public static final awoi a;
    public static final aonk b;
    private static volatile aopf d;
    public aoot c = aoot.a;

    static {
        awoi awoiVar = new awoi();
        a = awoiVar;
        aonm.registerDefaultInstance(awoi.class, awoiVar);
        b = aonm.newSingularGeneratedExtension(awog.a, awoiVar, awoiVar, null, 188495463, aoqn.MESSAGE, awoi.class);
    }

    private awoi() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"c", awoh.a});
            case NEW_MUTABLE_INSTANCE:
                return new awoi();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (float[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awoi.class) {
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
