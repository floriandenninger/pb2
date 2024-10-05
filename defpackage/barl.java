package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class barl extends aonm implements aooz {
    public static final barl a;
    private static volatile aopf e;
    public int b;
    public aonu c = emptyIntList();
    public int d;

    static {
        barl barlVar = new barl();
        a = barlVar;
        aonm.registerDefaultInstance(barl.class, barlVar);
    }

    private barl() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"b", "c", aokr.e, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new barl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (barl.class) {
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
