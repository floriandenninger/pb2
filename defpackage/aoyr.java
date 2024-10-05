package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoyr extends aonm implements aooz {
    public static final aoyr a;
    private static volatile aopf e;
    public int b;
    public int c;
    public aowj d;

    static {
        aoyr aoyrVar = new aoyr();
        a = aoyrVar;
        aonm.registerDefaultInstance(aoyr.class, aoyrVar);
    }

    private aoyr() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဉ\u0003", new Object[]{"b", "c", aouo.n, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aoyr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aoyr.class) {
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
