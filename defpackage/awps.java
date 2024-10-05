package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awps extends aonm implements aooz {
    public static final awps a;
    public static final aonk b;
    private static volatile aopf f;
    public int c;
    public int d;
    public boolean e = true;
    private int g;

    static {
        awps awpsVar = new awps();
        a = awpsVar;
        aonm.registerDefaultInstance(awps.class, awpsVar);
        b = aonm.newSingularGeneratedExtension(awpy.a, awpsVar, awpsVar, null, 188911708, aoqn.MESSAGE, awps.class);
    }

    private awps() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဋ\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"g", "c", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awps();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (awps.class) {
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
