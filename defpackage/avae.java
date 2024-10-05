package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avae extends aonm implements aooz {
    public static final avae a;
    private static volatile aopf l;
    public int b;
    public aqyg f;
    public arfs g;
    public apmh h;
    public apmh i;
    public avad j;
    public aott k;
    private aota m;
    private byte n = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        avae avaeVar = new avae();
        a = avaeVar;
        aonm.registerDefaultInstance(avae.class, avaeVar);
    }

    private avae() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\f\n\u0000\u0002\b\u0001Л\u0002Л\u0003ᐉ\u0001\u0004ည\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဉ\b\fᐉ\u0007", new Object[]{"b", "c", avaf.class, "d", avag.class, "m", "e", "f", "g", "h", "i", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avae();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (avae.class) {
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
