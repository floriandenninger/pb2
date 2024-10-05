package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avaw extends aonm implements aooz {
    public static final avaw a;
    public static final aonk b;
    private static volatile aopf d;
    public boolean c;
    private int e;

    static {
        avaw avawVar = new avaw();
        a = avawVar;
        aonm.registerDefaultInstance(avaw.class, avawVar);
        b = aonm.newSingularGeneratedExtension(avbb.a, avawVar, avawVar, null, 259636353, aoqn.MESSAGE, avaw.class);
    }

    private avaw() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{"e", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new avaw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avaw.class) {
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
