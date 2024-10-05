package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avay extends aonm implements aooz {
    public static final avay a;
    public static final aonk b;
    private static volatile aopf e;
    public aony c = aonm.emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        avay avayVar = new avay();
        a = avayVar;
        aonm.registerDefaultInstance(avay.class, avayVar);
        b = aonm.newSingularGeneratedExtension(avbb.a, avayVar, avayVar, null, 343899489, aoqn.MESSAGE, avay.class);
    }

    private avay() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"c", "d", aqtn.class});
            case NEW_MUTABLE_INSTANCE:
                return new avay();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (avay.class) {
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
