package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avul extends aonm implements aooz {
    public static final avul a;
    private static volatile aopf n;
    public int b;
    public avgg c;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public apmh g;
    public apmh h;
    public boolean k;
    public avum l;
    private aota o;
    private apxf p;
    private aqyg q;
    private apxf r;
    private aqyg s;
    private atok t;
    private byte u = 2;
    public aomf i = aomf.b;
    public aony j = emptyProtobufList();
    public aony m = emptyProtobufList();

    static {
        avul avulVar = new avul();
        a = avulVar;
        aonm.registerDefaultInstance(avul.class, avulVar);
    }

    private avul() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0004\u001a\u0011\u0000\u0002\r\u0004ᐉ\u000f\u0005ᐉ\u0010\u0006ᐉ\u0011\u0007ᐉ\u0007\bည\b\tᐉ\u0001\nᐉ\u0000\u000bᐉ\u0003\fᐉ\u0004\rᐉ\t\u000eᐉ\u0005\u000fᐉ\u0006\u0010Л\u0011ဇ\n\u0013ဉ\u0012\u0014ᐉ\u0013\u001a\u001b", new Object[]{"b", "q", "r", "s", "o", "i", "d", "c", "e", "f", "p", "g", "h", "j", apxf.class, "k", "l", "t", "m", apua.class});
            case NEW_MUTABLE_INSTANCE:
                return new avul();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (avul.class) {
                        aopfVar = n;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            n = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
