package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aviq extends aonm implements aooz {
    public static final aviq a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public boolean d;
    public int e;
    public int f;

    static {
        aviq aviqVar = new aviq();
        a = aviqVar;
        aonm.registerDefaultInstance(aviq.class, aviqVar);
        b = aonm.newSingularGeneratedExtension(awpy.a, aviqVar, aviqVar, null, 307697168, aoqn.MESSAGE, aviq.class);
    }

    private aviq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001\u0003ဋ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aviq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aviq.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
