package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqcp extends aonm implements aooz {
    public static final aqcp a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public aqyg d;
    public apxf f;
    public atdf g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aomf k;
    private apxf m;
    private aqyg n;
    private asnj o;
    private aota p;
    private aqyg q;
    private byte r = 2;
    public aony e = emptyProtobufList();

    static {
        aqcp aqcpVar = new aqcp();
        a = aqcpVar;
        aonm.registerDefaultInstance(aqcp.class, aqcpVar);
    }

    private aqcp() {
        emptyProtobufList();
        this.k = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0002\u0013\u000e\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\b\bᐉ\u000f\tᐉ\u0005\nᐉ\n\u000bᐉ\u000b\fည\u0010\u000eᐉ\u0011\u000fᐉ\t\u0010ᐉ\f\u0012ᐉ\u0006\u0013Л", new Object[]{"b", "c", "d", "f", "h", "p", "m", "j", "n", "k", "q", "i", "o", "g", "e", avfv.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqcp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqcp.class) {
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
