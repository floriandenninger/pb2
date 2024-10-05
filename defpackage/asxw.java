package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asxw extends aonm implements aooz {
    public static final asxw a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apmh g;
    private aulq h;
    private aulq i;
    private aqyg j;
    private aota k;
    private byte l = 2;

    static {
        asxw asxwVar = new asxw();
        a = asxwVar;
        aonm.registerDefaultInstance(asxw.class, asxwVar);
    }

    private asxw() {
        emptyProtobufList();
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
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\u000f\b\u0000\u0000\b\u0001ᐉ\u0000\u0006ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nᐉ\u000b\rᐉ\b\u000eᐉ\t\u000fᐉ\n", new Object[]{"c", "d", "e", "f", "g", "k", "h", "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asxw();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asxw.class) {
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
