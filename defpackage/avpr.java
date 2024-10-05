package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avpr extends aonm implements aooz {
    public static final avpr a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private aqyg f;
    private aqyg g;
    private avoy h;
    private apmh i;
    private apmh j;
    private aqyg k;
    private apmh l;
    private apmh m;
    private apmh n;
    private aota o;
    private byte p = 2;

    static {
        avpr avprVar = new avpr();
        a = avprVar;
        aonm.registerDefaultInstance(avpr.class, avprVar);
    }

    private avpr() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.p);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.p = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0000\f\u0002ᐉ\u0002\u0003ᐉ\u0005\u0004ᐉ\u0007\u0006ᐉ\u000f\u0007ᐉ\b\bᐉ\u0004\tᐉ\t\fᐉ\n\rᐉ\u000b\u000eᐉ\f\u000fᐉ\r\u0011ᐉ\u0003", new Object[]{"c", "d", "g", "h", "o", "i", "f", "j", "k", "l", "m", "n", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avpr();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avpr.class) {
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
