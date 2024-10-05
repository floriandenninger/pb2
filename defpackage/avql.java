package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avql extends aonm implements aooz {
    public static final avql a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private apmh g;
    private apmh h;
    private apmh i;
    private apmh j;
    private apxf k;
    private apxf l;
    private aota m;
    private byte n = 2;

    static {
        avql avqlVar = new avql();
        a = avqlVar;
        aonm.registerDefaultInstance(avql.class, avqlVar);
    }

    private avql() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0006\u0007ᐉ\u000b\tᐉ\r\u000bᐉ\u0007\rᐉ\t\u000eᐉ\b", new Object[]{"c", "d", "e", "f", "g", "h", "l", "m", "i", "k", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new avql();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avql.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
