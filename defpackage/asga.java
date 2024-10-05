package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asga extends aonm implements aooz {
    public static final asga a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public asfq d;
    public asgd e;
    private aota i;
    private aqzg j;
    private byte k = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        asga asgaVar = new asga();
        a = asgaVar;
        aonm.registerDefaultInstance(asga.class, asgaVar);
    }

    private asga() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0001\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ည\u0003\u0005ᐉ\u0002\u0006Л\u0007ᐉ\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "g", "e", "f", apxf.class, "i", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new asga();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asga.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
