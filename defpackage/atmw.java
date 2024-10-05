package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atmw extends aonm implements aooz {
    public static final atmw a;
    private static volatile aopf h;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public aomf g = aomf.b;

    static {
        atmw atmwVar = new atmw();
        a = atmwVar;
        aonm.registerDefaultInstance(atmw.class, atmwVar);
    }

    private atmw() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0006င\u0005\u0007ည\u0006", new Object[]{"b", "c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atmw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (atmw.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
