package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsy extends aonm implements aooz {
    public static final aqsy a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public avgg d;
    public apxf e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    private aqyg k;
    private aota l;
    private byte m = 2;
    public aomf i = aomf.b;

    static {
        aqsy aqsyVar = new aqsy();
        a = aqsyVar;
        aonm.registerDefaultInstance(aqsy.class, aqsyVar);
    }

    private aqsy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u000e\t\u0000\u0000\b\u0002ᐉ\u0001\u0003ᐉ\u0002\u0006ᐉ\u0005\u0007ᐉ\u0006\nᐉ\u0007\u000bᐉ\b\fᐉ\t\rᐉ\u0004\u000eည\n", new Object[]{"b", "c", "d", "k", "f", "g", "h", "l", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqsy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqsy.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
