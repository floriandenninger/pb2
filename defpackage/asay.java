package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asay extends aonm implements aooz {
    public static final asay a;
    private static volatile aopf g;
    public arnd b;
    public asbd e;
    public aomf f;
    private int h;
    private aqyg i;
    private aota j;
    private aqzg k;
    private byte l = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        asay asayVar = new asay();
        a = asayVar;
        aonm.registerDefaultInstance(asay.class, asayVar);
    }

    private asay() {
        emptyProtobufList();
        this.f = aomf.b;
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001̉\b\u0000\u0002\u0007\u0001ᐉ\u0000\u0006Л\u0007Л\bᐉ\u0002\tᐉ\u0003\nည\u0004\u000bᐉ\u0001̉ᐉ\u0005", new Object[]{"h", "b", "c", asbd.class, "d", asaz.class, "e", "j", "f", "i", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new asay();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asay.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
