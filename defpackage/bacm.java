package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bacm extends aonm implements aooz {
    public static final bacm a;
    private static volatile aopf e;
    public int b;
    public String c = "";
    public aonx d = emptyLongList();

    static {
        bacm bacmVar = new bacm();
        a = bacmVar;
        aonm.registerDefaultInstance(bacm.class, bacmVar);
    }

    private bacm() {
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new bacm();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (int[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (bacm.class) {
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
