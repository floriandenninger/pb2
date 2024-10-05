package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arss extends aonm implements aooz {
    public static final arss a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public aomf e;
    public aplc f;
    private arsu h;
    private aota i;
    private aqzg j;
    private aulq k;
    private aulq l;
    private aulq m;
    private byte n = 2;
    public aony d = emptyProtobufList();

    static {
        arss arssVar = new arss();
        a = arssVar;
        aonm.registerDefaultInstance(arss.class, arssVar);
    }

    private arss() {
        emptyProtobufList();
        this.e = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001̉\n\u0000\u0001\t\u0001ᐉ\u0000\u0004Л\u0005ည\u0004\nᐉ\u0002\u000bᐉ\u0003\rᐉ\b\u000eᐉ\t\u000fᐉ\n\u0010ᐉ\u000b̉ᐉ\u0007", new Object[]{"b", "c", "d", arst.class, "e", "h", "i", "k", "f", "l", "m", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arss();
            case NEW_BUILDER:
                return new aone((char[][][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arss.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
