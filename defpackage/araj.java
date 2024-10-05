package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class araj extends aonm implements aooz {
    public static final araj a;
    private static volatile aopf b;
    private int c;
    private arar d;
    private aqyg e;
    private arat f;
    private aota g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private byte l = 2;

    static {
        araj arajVar = new araj();
        a = arajVar;
        aonm.registerDefaultInstance(araj.class, arajVar);
    }

    private araj() {
        aomf aomfVar = aomf.b;
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\n\u0002ᐉ\u000f\u0003ᐉ\u0010\u0004ᐉ\u0011\bᐉ\u0004\fᐉ\u0000\rᐉ\u0005\u000fᐉ\u0003", new Object[]{"c", "h", "i", "j", "k", "f", "d", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new araj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (araj.class) {
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
