package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlg extends aonm implements aooz {
    public static final rlg a;
    private static volatile aopf e;
    public int b;
    public int c;
    public aonx d = emptyLongList();

    static {
        rlg rlgVar = new rlg();
        a = rlgVar;
        aonm.registerDefaultInstance(rlg.class, rlgVar);
    }

    private rlg() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new rlg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (rlg.class) {
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
