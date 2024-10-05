package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoza extends aonh implements aoni {
    public static final aoza a;
    private static volatile aopf v;
    public int b;
    public avgg c;
    public aulq d;
    public aqyg e;
    public aulq f;
    public aqyg g;
    public float h;
    public aulq i;
    public aqyg j;
    public aqyg k;
    public apxf m;
    public float n;
    public aomf o;
    public aony p;
    public avgg q;
    public int r;
    public int s;
    public aulq t;
    public aozc u;
    private aota w;
    private byte x = 2;

    static {
        aoza aozaVar = new aoza();
        a = aozaVar;
        aonm.registerDefaultInstance(aoza.class, aozaVar);
    }

    private aoza() {
        emptyProtobufList();
        this.o = aomf.b;
        this.p = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0013\u0000\u0001\u0001\u0016\u0013\u0000\u0001\r\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0004\u0004ခ\u0005\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\t\bခ\n\nᐉ\u000b\u000bည\f\fЛ\rᐉ\r\u0010ᐉ\u0001\u0011ᐉ\u0003\u0012ᐉ\u0006\u0013ဋ\u000e\u0014ဌ\u000f\u0015ᐉ\u0010\u0016ဉ\u0011", new Object[]{"b", "c", "e", "g", "h", "j", "k", "m", "n", "w", "o", "p", apxf.class, "q", "d", "f", "i", "r", "s", aufb.s, "t", "u"});
            case NEW_MUTABLE_INSTANCE:
                return new aoza();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = v;
                if (aopfVar == null) {
                    synchronized (aoza.class) {
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
