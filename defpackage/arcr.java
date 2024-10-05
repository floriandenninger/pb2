package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arcr extends aonm implements aooz {
    public static final arcr a;
    private static volatile aopf o;
    public int b;
    public avgg c;
    public aqyg e;
    public int f;
    public atdf g;
    public apxf h;
    public aqyg i;
    public aqyg j;
    public apkd k;
    public apkd l;
    public apkd m;
    public aomf n;
    private aqyg p;
    private apmh q;
    private aota r;
    private byte s = 2;
    public aony d = emptyProtobufList();

    static {
        arcr arcrVar = new arcr();
        a = arcrVar;
        aonm.registerDefaultInstance(arcr.class, arcrVar);
    }

    private arcr() {
        emptyProtobufList();
        emptyProtobufList();
        this.n = aomf.b;
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0002\u0012\u000f\u0000\u0001\r\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006င\u0003\u0007ᐉ\u0006\bᐉ\b\tЛ\nᐉ\r\u000bည\u000e\fᐉ\f\rᐉ\u0007\u0010ᐉ\t\u0011ᐉ\n\u0012ᐉ\u000b", new Object[]{"b", "c", "e", "g", "h", "f", "p", "j", "d", avfv.class, "r", "n", "q", "i", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new arcr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (arcr.class) {
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
