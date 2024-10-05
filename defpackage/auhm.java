package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auhm extends aonm implements aooz {
    public static final auhm a;
    private static volatile aopf v;
    public int b;
    public avgg c;
    public aulq d;
    public arfs e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aulq k;
    public apxf l;
    public aulq n;
    public long o;
    public apln p;
    public boolean r;
    public augn s;
    public augx t;
    public boolean u;
    private byte w = 2;
    public aony m = emptyProtobufList();
    public aony q = emptyProtobufList();

    static {
        auhm auhmVar = new auhm();
        a = auhmVar;
        aonm.registerDefaultInstance(auhm.class, auhmVar);
    }

    private auhm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.w);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0015\u0013\u0000\u0002\r\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0007\bᐉ\b\tᐉ\t\nЛ\u000bᐉ\n\fဂ\u000b\rဉ\f\u000eЛ\u000fဇ\r\u0011ဉ\u000f\u0012ဉ\u0010\u0014ᐉ\u0006\u0015ဇ\u0012", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j", "k", "l", "m", apxf.class, "n", "o", "p", "q", apxf.class, "r", "s", "t", "i", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new auhm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (auhm.class) {
                        aopfVar = v;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            v = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
