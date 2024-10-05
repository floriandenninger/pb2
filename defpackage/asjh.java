package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asjh extends aonh implements aoni {
    public static final asjh a;
    private static volatile aopf q;
    public Object c;
    public Object e;
    public Object g;
    public int h;
    public aqyg i;
    public aqyg j;
    public apmh k;
    public apmh m;
    public boolean p;
    private int r;
    private aqyg s;
    private aota t;
    private apxf u;
    private asjg v;
    public int b = 0;
    public int d = 0;
    public int f = 0;
    private byte w = 2;
    public aomf n = aomf.b;
    public aony o = emptyProtobufList();

    static {
        asjh asjhVar = new asjh();
        a = asjhVar;
        aonm.registerDefaultInstance(asjh.class, asjhVar);
    }

    private asjh() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0012\u0003\u0001\u0001\u0018\u0012\u0000\u0001\f\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐼ\u0000\u0007ျ\u0002\bᐉ\r\tည\u000e\nᐉ\u0004\u000bᐉ\u000f\fЛ\rဇ\u0010\u000eᐼ\u0001\u000fᐉ\u0011\u0014ြ\u0002\u0015ြ\u0001\u0016ဌ\u0000\u0018ᐼ\u0000", new Object[]{"c", "b", "e", "d", "g", "f", "r", "i", "j", "k", "s", avgg.class, "t", "n", "m", "u", "o", apxf.class, "p", avgm.class, "v", asjf.class, asji.class, "h", asje.a, apif.class});
            case NEW_MUTABLE_INSTANCE:
                return new asjh();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = q;
                if (aopfVar == null) {
                    synchronized (asjh.class) {
                        aopfVar = q;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            q = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
