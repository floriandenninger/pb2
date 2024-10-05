package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvs extends aonm implements aooz {
    public static final atvs a;
    private static volatile aopf g;
    public int b;
    public int c;
    public aonu d = emptyIntList();
    public int e;
    public boolean f;

    static {
        atvs atvsVar = new atvs();
        a = atvsVar;
        aonm.registerDefaultInstance(atvs.class, atvsVar);
    }

    private atvs() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001င\u0000\u0002\u0016\u0003င\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atvs();
            case NEW_BUILDER:
                return new aone((byte[][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atvs.class) {
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
