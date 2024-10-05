package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aptj extends aonm implements aooz {
    public static final aptj a;
    private static volatile aopf g;
    public boolean e;
    public boolean f;
    private int h;
    private aota i;
    private aqyg j;
    private aulq k;
    private aulq l;
    private aovx m;
    private byte n = 2;
    public aony b = emptyProtobufList();
    public int c = 3;
    public aomf d = aomf.b;

    static {
        aptj aptjVar = new aptj();
        a = aptjVar;
        aonm.registerDefaultInstance(aptj.class, aptjVar);
    }

    private aptj() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0001\u0006\u0001Л\u0002င\u0000\u0003ᐉ\u0001\u0004ည\u0002\u0005ဇ\u0003\u0006ᐉ\u0004\u0007ဇ\u0005\bᐉ\u0006\tᐉ\u0007\u000bᐉ\b", new Object[]{"h", "b", aptk.class, "c", "i", "d", "e", "j", "f", "k", "l", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aptj();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (boolean[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aptj.class) {
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
