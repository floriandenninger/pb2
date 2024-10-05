package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atha extends aonm implements aooz {
    public static final atha a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private aqyg i;
    private aqyg j;
    private apbz k;
    private atdf l;
    private aota m;
    private asnj n;
    private aqyg o;
    private byte p = 2;

    static {
        atha athaVar = new atha();
        a = athaVar;
        aonm.registerDefaultInstance(atha.class, athaVar);
    }

    private atha() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0002\u0013\f\u0000\u0000\f\u0002ᐉ\u0001\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0007\tᐉ\b\nᐉ\t\fᐉ\n\u000fᐉ\r\u0011ᐉ\u000f\u0012ᐉ\u0010\u0013ᐉ\u000b", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "m", "n", "o", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new atha();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atha.class) {
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
