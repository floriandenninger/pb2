package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awpt extends aonm implements aooz {
    public static final awpt a;
    public static final aonk b;
    private static volatile aopf e;
    public int c;
    public awpq d;

    static {
        awpt awptVar = new awpt();
        a = awptVar;
        aonm.registerDefaultInstance(awpt.class, awptVar);
        b = aonm.newSingularGeneratedExtension(awpu.a, awptVar, awptVar, null, 193804845, aoqn.MESSAGE, awpt.class);
    }

    private awpt() {
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
                return new awpt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awpt.class) {
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
