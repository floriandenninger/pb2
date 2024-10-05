package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqck extends aonm implements aooz {
    public static final aqck a;
    private static volatile aopf p;
    public int b;
    public avgg c;
    public aqyg e;
    public aqyg f;
    public aqyg h;
    public aony i;
    public aqyg j;
    public aony k;
    public aony l;
    public apxf m;
    public atdf n;
    public aomf o;
    private aota q;
    private byte r = 2;
    public aony d = emptyProtobufList();
    public aony g = emptyProtobufList();

    static {
        aqck aqckVar = new aqck();
        a = aqckVar;
        aonm.registerDefaultInstance(aqck.class, aqckVar);
    }

    private aqck() {
        emptyProtobufList();
        this.i = emptyProtobufList();
        this.k = emptyProtobufList();
        this.l = emptyProtobufList();
        this.o = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0005\r\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0002\u0004Л\u0005ᐉ\u0003\u0006Л\u0007ᐉ\u0004\bЛ\tЛ\nᐉ\u0005\u000bᐉ\u0006\rည\b\u000eᐉ\t\u000fᐉ\u0001", new Object[]{"b", "c", "d", avfv.class, "f", "g", apkd.class, "h", "i", aqyg.class, "j", "k", aqyg.class, "l", apkd.class, "m", "n", "o", "q", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqck();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aqck.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
