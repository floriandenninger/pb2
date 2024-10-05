package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aton extends aonm implements aooz {
    public static final aton a;
    private static volatile aopf d;
    public int b = 1;
    public float c = 172800.0f;
    private int e;

    static {
        aton atonVar = new aton();
        a = atonVar;
        aonm.registerDefaultInstance(aton.class, atonVar);
    }

    private aton() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003ခ\u0002", new Object[]{"e", "b", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new aton();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aton.class) {
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
