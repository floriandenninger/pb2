package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avyc extends aonm implements aooz {
    public static final avyc a;
    private static volatile aopf c;
    public aont b = emptyFloatList();

    static {
        avyc avycVar = new avyc();
        a = avycVar;
        aonm.registerDefaultInstance(avyc.class, avycVar);
    }

    private avyc() {
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
                return newMessageInfo(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0013", new Object[]{"b"});
            case NEW_MUTABLE_INSTANCE:
                return new avyc();
            case NEW_BUILDER:
                return new aone((float[]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (avyc.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
