package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqco extends aonh implements aoni {
    public static final aqco a;
    private static volatile aopf r;
    public int b;
    public avgg c;
    public aqyg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public atdf m;
    public asvx n;
    public aoxy o;
    public aqcn p;
    private aqyg s;
    private apxf t;
    private aota u;
    private byte v = 2;
    public aomf j = aomf.b;
    public aony k = aonm.emptyProtobufList();
    public String q = "";

    static {
        aqco aqcoVar = new aqco();
        a = aqcoVar;
        aonm.registerDefaultInstance(aqco.class, aqcoVar);
    }

    private aqco() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.v);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0018\u0011\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\u000bည\n\fᐉ\u000b\r\u001a\u000eᐉ\f\u0011ᐉ\u0011\u0012ᐉ\u0012\u0014ဉ\u000f\u0015ᐉ\u0010\u0018ဈ\u0015", new Object[]{"b", "c", "d", "s", "e", "f", "g", "h", "i", "j", "t", "k", "m", "u", "p", "n", "o", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aqco();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = r;
                if (aopfVar == null) {
                    synchronized (aqco.class) {
                        aopfVar = r;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            r = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
