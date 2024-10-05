package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avnh extends aonm implements aooz {
    public static final avnh a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public avgg d;
    public avng e;
    public aqyg f;
    public awgw h;
    public apmh i;
    public avnd j;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private aota q;
    private byte r = 2;
    public aony g = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        avnh avnhVar = new avnh();
        a = avnhVar;
        aonm.registerDefaultInstance(avnh.class, avnhVar);
    }

    private avnh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0013\u000e\u0000\u0001\f\u0001ᐉ\u0000\u0002ᐉ\u0003\u0003ᐉ\u0004\u0004ᐉ\b\u0005ᐉ\u0010\u0006ည\u0011\u0007ᐉ\u0001\bᐉ\u0005\tᐉ\t\u000bЛ\fᐉ\u0007\u000eဉ\u0002\u000fᐉ\f\u0013ᐉ\u0006", new Object[]{"b", "c", "m", "f", "i", "q", "k", "d", "n", "p", "g", aqyg.class, "h", "e", "j", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new avnh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (avnh.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
