package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aszh extends aonm implements aooz {
    public static final aszh a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public avgg f;
    public boolean h;
    public aqyg i;
    public apxf j;
    public aqyg k;
    public apxf l;
    private aqyg n;
    private aqyg o;
    private aqyg p;
    private aqyg q;
    private aqyg r;
    private aqyg s;
    private aulq t;
    private byte u = 2;
    public aony g = emptyProtobufList();

    static {
        aszh aszhVar = new aszh();
        a = aszhVar;
        aonm.registerDefaultInstance(aszh.class, aszhVar);
    }

    private aszh() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0014\u0011\u0000\u0001\u0010\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\t\nЛ\fᐉ\b\u000eဇ\f\u000fᐉ\u000e\u0010ᐉ\u000f\u0011ᐉ\u0010\u0012ᐉ\u0011\u0013ᐉ\u0012\u0014ᐉ\r", new Object[]{"b", "c", "d", "n", "o", "p", "q", "r", "f", "g", avgg.class, "e", "h", "i", "j", "k", "t", "l", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new aszh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aszh.class) {
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
