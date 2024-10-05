package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awgq extends aonm implements aooz {
    public static final awgq a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public awgw e;
    public apmh g;
    private awgn i;
    private aota j;
    private byte k = 2;
    public aony d = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        awgq awgqVar = new awgq();
        a = awgqVar;
        aonm.registerDefaultInstance(awgq.class, awgqVar);
    }

    private awgq() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ည\u0005\u0007ᐉ\u0006\bᐉ\u0001", new Object[]{"b", "c", "d", aqyg.class, "i", "j", "f", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new awgq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awgq.class) {
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
