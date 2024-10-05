package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auzg extends aonm implements aooz {
    public static final auzg a;
    private static volatile aopf d;
    public int b = 0;
    public Object c;

    static {
        auzg auzgVar = new auzg();
        a = auzgVar;
        aonm.registerDefaultInstance(auzg.class, auzgVar);
    }

    private auzg() {
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
                return newMessageInfo(a, "\u0001\u0001\u0001\u0000\ue5a9䄉\ue5a9䄉\u0001\u0000\u0000\u0000\ue5a9䄉ြ\u0000", new Object[]{"c", "b", auzo.class});
            case NEW_MUTABLE_INSTANCE:
                return new auzg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auzg.class) {
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
