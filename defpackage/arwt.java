package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arwt extends aonm implements aooz {
    public static final arwt a;
    private static volatile aopf d;
    public arnd b;
    private int e;
    private aqzg f;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        arwt arwtVar = new arwt();
        a = arwtVar;
        aonm.registerDefaultInstance(arwt.class, arwtVar);
    }

    private arwt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л̉ᐉ\u0001", new Object[]{"e", "b", "c", apxf.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arwt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arwt.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
