package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqh extends aonm implements aooz {
    public static final avqh a;
    private static volatile aopf k;
    public aqyg b;
    public int e;
    public apmh f;
    public apmh g;
    private int l;
    private aota m;
    private aqyg n;
    private aqyg o;
    private apxf p;
    private byte q = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aomf h = aomf.b;
    public aony i = emptyProtobufList();
    public aony j = emptyProtobufList();

    static {
        avqh avqhVar = new avqh();
        a = avqhVar;
        aonm.registerDefaultInstance(avqh.class, avqhVar);
    }

    private avqh() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0004\u000b\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0006\u0005ᐉ\b\u0006Л\u0007ᐉ\u0002\bᐉ\u0003\tᐉ\u0004\nည\u0005\u000bင\u0001\fЛ\rЛ\u000eᐉ\t", new Object[]{"l", "b", "c", aqyg.class, "n", "o", "d", avqg.class, "f", "g", "m", "h", "e", "i", apxf.class, "j", apxf.class, "p"});
            case NEW_MUTABLE_INSTANCE:
                return new avqh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (avqh.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
