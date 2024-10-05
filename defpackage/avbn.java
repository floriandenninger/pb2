package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbn extends aonm implements aooz {
    public static final avbn a;
    private static volatile aopf f;
    public int b;
    public int c;
    public aony d = emptyProtobufList();
    public aoyi e;
    private int g;

    static {
        avbn avbnVar = new avbn();
        a = avbnVar;
        aonm.registerDefaultInstance(avbn.class, avbnVar);
    }

    private avbn() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0004\u001b\u0005ဉ\u0002", new Object[]{"g", "b", "c", "d", aoye.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avbn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avbn.class) {
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
