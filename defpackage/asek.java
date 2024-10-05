package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asek extends aonm implements aooz {
    public static final asek a;
    private static volatile aopf d;
    public arnd b;
    public boolean c;
    private int e;
    private aqzg f;
    private byte g = 2;

    static {
        asek asekVar = new asek();
        a = asekVar;
        aonm.registerDefaultInstance(asek.class, asekVar);
    }

    private asek() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001̉\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဇ\u0001̉ᐉ\u0002", new Object[]{"e", "b", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asek();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (asek.class) {
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
