package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awsy extends aonm implements aooz {
    public static final awsy a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public int d;
    public awtn e;
    private int g;

    static {
        awsy awsyVar = new awsy();
        a = awsyVar;
        aonm.registerDefaultInstance(awsy.class, awsyVar);
        b = aonm.newSingularGeneratedExtension(awqd.a, awsyVar, awsyVar, null, 363654335, aoqn.MESSAGE, awsy.class);
    }

    private awsy() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0005ဉ\u0003", new Object[]{"g", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awsy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awsy.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
