package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avog extends aonm implements aooz {
    public static final avog a;
    private static volatile aopf b;
    private aqyg A;
    private aqyg B;
    private aqyg C;
    private byte D = 2;
    private int c;
    private int d;
    private aqyg e;
    private aulq f;
    private aqyg g;
    private apxf h;
    private avrd i;
    private apmh j;
    private apmh k;
    private avoh l;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private apjt p;
    private aqyg q;
    private aota r;
    private aqyg s;
    private apxf t;
    private aqyg u;
    private aqyg v;
    private aqyg w;
    private aqyg x;
    private aqyg y;
    private aqyg z;

    static {
        avog avogVar = new avog();
        a = avogVar;
        aonm.registerDefaultInstance(avog.class, avogVar);
    }

    private avog() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.D);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.D = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0019\u0000\u0002\u0002#\u0019\u0000\u0000\u0019\u0002ᐉ\u0014\u0003ᐉ\u0000\u0004ᐉ\u0015\u0007ᐉ \bᐉ!\nᐉ\u0006\u000bᐉ\u001c\fᐉ\u001d\rᐉ\u0016\u000fᐉ\u0018\u0010ᐉ\u001e\u0011ᐉ\u001a\u0012ᐉ\u001b\u0013ᐉ\u0019\u0015ᐉ\n\u0016ᐉ\u0003\u0018ᐉ\u0005\u0019ᐉ\u000b\u001aᐉ\f\u001cᐉ\r\u001dᐉ\u000e\u001eᐉ\u000f\u001fᐉ\b\"ᐉ\t#ᐉ\u0001", new Object[]{"c", "d", "r", "e", "s", "B", "C", "i", "y", "z", "t", "u", "A", "w", "x", "v", "l", "g", "h", "m", "n", "o", "p", "q", "j", "k", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avog();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avog.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
