package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asiy extends aonm implements aooz {
    public static final asiy a;
    private static volatile aopf b;
    private int c;
    private apmh d;
    private apmh e;
    private asja f;
    private atok g;
    private aota h;
    private aqyg i;
    private aqyg j;
    private aqyg k;
    private aqyg l;
    private byte m = 2;

    static {
        asiy asiyVar = new asiy();
        a = asiyVar;
        aonm.registerDefaultInstance(asiy.class, asiyVar);
    }

    private asiy() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0002\u0016\t\u0000\u0000\t\u0002ᐉ\u0002\u0003ᐉ\u0003\u0006ᐉ\u0007\bᐉ\b\nᐉ\u000b\u0011ᐉ\r\u0012ᐉ\u000e\u0015ᐉ\u0011\u0016ᐉ\u0012", new Object[]{"c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case NEW_MUTABLE_INSTANCE:
                return new asiy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (asiy.class) {
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
