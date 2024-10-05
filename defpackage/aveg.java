package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aveg extends aonm implements aooz {
    public static final aveg a;
    private static volatile aopf d;
    public int b;
    public arej c;
    private atmn e;
    private avrs f;
    private aqeo g;
    private byte h = 2;

    static {
        aveg avegVar = new aveg();
        a = avegVar;
        aonm.registerDefaultInstance(aveg.class, avegVar);
    }

    private aveg() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\uf3e4\u2e6e羽偀\u0004\u0000\u0000\u0004\uf3e4\u2e6eᐉ\u0000\uf3fbヺᐉ\u0001祥䌤ᐉ\u0002羽偀ᐉ\u0003", new Object[]{"b", "e", "c", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new aveg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aveg.class) {
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
