package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyf extends aonm implements aooz {
    public static final avyf a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    public aony f = emptyProtobufList();

    static {
        avyf avyfVar = new avyf();
        a = avyfVar;
        aonm.registerDefaultInstance(avyf.class, avyfVar);
    }

    private avyf() {
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
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"d", "c", "b", "e", avya.a, "f", avyc.class, avyb.class, avyd.class, avye.class});
            case NEW_MUTABLE_INSTANCE:
                return new avyf();
            case NEW_BUILDER:
                return new aone((int[]) null, (byte[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avyf.class) {
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
