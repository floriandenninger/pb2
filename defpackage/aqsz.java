package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqsz extends aonm implements aooz {
    public static final aqsz a;
    private static volatile aopf l;
    public int b;
    public avgg d;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    public aqyg i;
    public apxf j;
    private aqyg m;
    private aqyg n;
    private aqyg o;
    private aota p;
    private byte q = 2;
    public String c = "";
    public aony e = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        aqsz aqszVar = new aqsz();
        a = aqszVar;
        aonm.registerDefaultInstance(aqsz.class, aqszVar);
    }

    private aqsz() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0001\u000b\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ᐉ\t\nᐉ\f\u000bᐉ\r\fည\u000e\rᐉ\b\u000eᐉ\u0006\u0010Л", new Object[]{"b", "c", "d", "f", "g", "h", "n", "i", "j", "p", "k", "o", "m", "e", avfv.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqsz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqsz.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
