package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auyu extends aonm implements aooz {
    public static final auyu a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public aqyg d;
    public aulq e;
    private auyt g;
    private byte h = 2;

    static {
        auyu auyuVar = new auyu();
        a = auyuVar;
        aonm.registerDefaultInstance(auyu.class, auyuVar);
    }

    private auyu() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0004\u0001ᐉ\u0001\u0002ᐉ\u0002\u0004ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "d", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new auyu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (auyu.class) {
                        aopfVar = f;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            f = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
