package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avci extends aonm implements aooz {
    public static final avci a;
    private static volatile aopf p;
    public int b;
    public avck c;
    public aqyg f;
    public apxf g;
    public apmh h;
    public apmh i;
    public int m;
    public avcm n;
    public int o;
    private aqyg q;
    private apxf r;
    private aota s;
    private byte t = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aony j = emptyProtobufList();
    public aomf k = aomf.b;
    public aony l = emptyProtobufList();

    static {
        avci avciVar = new avci();
        a = avciVar;
        aonm.registerDefaultInstance(avci.class, avciVar);
    }

    private avci() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0010\u0000\u0001\u0001\u0014\u0010\u0000\u0004\n\u0001ᐉ\u0001\u0002Л\u0003ᐉ\t\u0004ည\n\u0005ᐉ\u0002\u0006ᐉ\u0003\tဌ\r\nЛ\u000bဉ\u0000\rᐉ\u0006\u000fᐉ\u0004\u0010ᐉ\u0005\u0011ဉ\u000e\u0012င\u000f\u0013Л\u0014\u001b", new Object[]{"b", "f", "j", avcj.class, "s", "k", "q", "g", "m", auye.u, "d", avcg.class, "c", "r", "h", "i", "n", "o", "e", apxf.class, "l", avbr.class});
            case NEW_MUTABLE_INSTANCE:
                return new avci();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (avci.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
