package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aova extends aonm implements aooz {
    public static final aova a;
    private static volatile aopf m;
    public int b;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public aulq g;
    public boolean h;
    public boolean i;
    public apxf j;
    public int k;
    public avgg l;
    private aota n;
    private aqyg o;
    private aovk p;
    private aqyg q;
    private aouy r;
    private byte s = 2;
    public aomf c = aomf.b;

    static {
        aova aovaVar = new aova();
        a = aovaVar;
        aonm.registerDefaultInstance(aova.class, aovaVar);
    }

    private aova() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0015\u000f\u0000\u0000\u000b\u0001ᐉ\u0000\u0002ည\u0001\u0004ᐉ\u0002\u0005ᐉ\u0012\u0006ᐉ\u0004\u0007ဇ\u0006\bဇ\u0007\tᐉ\u0013\fᐉ\b\rᐉ\u0003\u000fᐉ\t\u0010ဌ\n\u0011ᐉ\u000b\u0013ᐉ\u0005\u0015ᐉ\u000e", new Object[]{"b", "n", "c", "d", "r", "f", "h", "i", "l", "j", "e", "o", "k", arfr.a(), "p", "g", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new aova();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aova.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
