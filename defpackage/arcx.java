package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcx extends aonm implements aooz {
    public static final arcx a;
    private static volatile aopf n;
    public int b;
    public avgg c;
    public aqyg d;
    public apxf e;
    public atdf f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public aqyg j;
    public aswa k;
    public aomf l;
    public aony m;
    private apxf o;
    private apxf p;
    private aota q;
    private aqyg r;
    private byte s = 2;

    static {
        arcx arcxVar = new arcx();
        a = arcxVar;
        aonm.registerDefaultInstance(arcx.class, arcxVar);
    }

    private arcx() {
        emptyProtobufList();
        this.l = aomf.b;
        this.m = emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0014\u000f\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0004\u0007ᐉ\t\bᐉ\u000f\tᐉ\u0006\nᐉ\u000b\u000bᐉ\f\fည\u0010\u000eᐉ\u0011\u000fᐉ\n\u0010ᐉ\u0007\u0012Л\u0013ဉ\u000e\u0014ᐉ\u0005", new Object[]{"b", "c", "d", "e", "g", "q", "p", "i", "j", "l", "r", "h", "f", "m", avfv.class, "k", "o"});
            case NEW_MUTABLE_INSTANCE:
                return new arcx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = n;
                if (aopfVar == null) {
                    synchronized (arcx.class) {
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
