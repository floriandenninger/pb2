package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxj extends aonm implements aooz {
    public static final arxj a;
    private static volatile aopf g;
    public int b;
    public String c = "";
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;
    public boolean f;

    static {
        arxj arxjVar = new arxj();
        a = arxjVar;
        aonm.registerDefaultInstance(arxj.class, arxjVar);
    }

    private arxj() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ည\u0001\u0004ဇ\u0002", new Object[]{"b", "c", "d", arxi.class, "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arxj();
            case NEW_BUILDER:
                return new aone((short[][][]) null, (short[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arxj.class) {
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
