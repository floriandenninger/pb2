package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avqp extends aonm implements aooz {
    public static final avqp a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private atdf i;
    private apxf j;
    private apjt k;
    private apjt l;
    private apxf m;
    private apjt n;
    private avrd o;
    private apjt p;
    private aota q;
    private byte r = 2;

    static {
        avqp avqpVar = new avqp();
        a = avqpVar;
        aonm.registerDefaultInstance(avqp.class, avqpVar);
    }

    private avqp() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0003\u0017\u000e\u0000\u0000\u000e\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\n\bᐉ\u0014\fᐉ\f\rᐉ\u000e\u000eᐉ\r\u000fᐉ\u0007\u0010ᐉ\b\u0011ᐉ\t\u0014ᐉ\u0012\u0015ᐉ\u0010\u0017ᐉ\u000f", new Object[]{"c", "d", "e", "f", "j", "q", "k", "m", "l", "g", "h", "i", "p", "o", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new avqp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avqp.class) {
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
