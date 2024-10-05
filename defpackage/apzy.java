package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apzy extends aonm implements aooz {
    public static final apzy a;
    private static volatile aopf m;
    public int b;
    public apzz c;
    public apzt d;
    public aomf e;
    public aqyg f;
    public aqyg g;
    public boolean h;
    public aony i;
    public aqyg j;
    public aulq k;
    public boolean l;
    private aqyg n;
    private aulq o;
    private aota p;
    private aqyg q;
    private aqyg r;
    private aulq s;
    private aulq t;
    private aulq u;
    private aulq v;
    private aulq w;
    private byte x = 2;

    static {
        apzy apzyVar = new apzy();
        a = apzyVar;
        aonm.registerDefaultInstance(apzy.class, apzyVar);
    }

    private apzy() {
        emptyProtobufList();
        this.e = aomf.b;
        this.i = emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.x);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.x = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0014\u0000\u0001\u0001\u001f\u0014\u0000\u0001\u0011\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ည\u0004\bᐉ\u0005\nᐉ\u0007\u000bᐉ\b\u000eဇ\f\u000fЛ\u0010ᐉ\u000f\u0011ᐉ\u000b\u0012ᐉ\u0010\u0014ᐉ\u0003\u0015ᐉ\t\u0016ᐉ\n\u0017ᐉ\u0012\u0018ᐉ\u0013\u001dᐉ\u0015\u001eᐉ\u0016\u001fဇ\u0017", new Object[]{"b", "n", "c", "d", "e", "p", "f", "g", "h", "i", apxf.class, "t", "s", "u", "o", "q", "r", "j", "v", "k", "w", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new apzy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (apzy.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
