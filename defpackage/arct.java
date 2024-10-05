package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arct extends aonm implements aooz {
    public static final arct a;
    private static volatile aopf o;
    public int b;
    public auda c;
    public avgg d;
    public aqyg e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public apxf i;
    public aony j;
    public atdf k;
    public aswa l;
    public aomf m;
    public aony n;
    private aqyg p;
    private aqyg q;
    private apxf r;
    private aqyg s;
    private aota t;
    private aqyg u;
    private arcs v;
    private asnj w;
    private arar x;
    private byte y = 2;

    static {
        arct arctVar = new arct();
        a = arctVar;
        aonm.registerDefaultInstance(arct.class, arctVar);
    }

    private arct() {
        emptyProtobufList();
        emptyProtobufList();
        this.j = emptyProtobufList();
        emptyProtobufList();
        this.m = aomf.b;
        this.n = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.y);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.y = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0015\u0000\u0001\u0002\u001a\u0015\u0000\u0002\u0013\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0007\u0006ᐉ\t\bᐉ\u000b\tᐉ\b\nᐉ\u000f\u000bည\u0010\u000eᐉ\u0011\u0010ᐉ\u0001\u0011ᐉ\u0006\u0012ᐉ\f\u0013ᐉ\u0012\u0014ᐉ\u0013\u0015Л\u0016ᐉ\u0014\u0017Л\u0018ဉ\r\u0019ᐉ\n\u001aᐉ\u0004", new Object[]{"b", "d", "e", "f", "g", "i", "s", "h", "t", "m", "u", "c", "q", "k", "v", "w", "j", apjt.class, "x", "n", avfv.class, "l", "r", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new arct();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arct.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
