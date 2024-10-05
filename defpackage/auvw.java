package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class auvw extends aonh implements aoni {
    public static final auvw a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    public auvv d;
    private aqyg f;
    private aqyg g;
    private apkd h;
    private apkd i;
    private aqyg j;
    private aqyg k;
    private aqyg m;
    private avyx n;
    private apxf o;
    private auvq p;
    private auvq q;
    private aulq r;
    private aota s;
    private byte t = 2;

    static {
        auvw auvwVar = new auvw();
        a = auvwVar;
        aonm.registerDefaultInstance(auvw.class, auvwVar);
    }

    private auvw() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0003\u0018\u000f\u0000\u0000\u000f\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\bᐉ\t\tᐉ\u000b\nᐉ\f\fᐉ\u0006\rᐉ\u0005\u000fᐉ\n\u0010ᐉ\u0012\u0012ᐉ\r\u0014ᐉ\u000e\u0015ᐉ\u000f\u0016ᐉ\u0010\u0018ᐉ\u0007", new Object[]{"b", "c", "f", "g", "d", "m", "n", "i", "h", "k", "s", "o", "p", "q", "r", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new auvw();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (auvw.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
