package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arul extends aonm implements aooz {
    public static final arul a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public arum d;
    public aulp e;
    private aota h;
    private aqzg i;
    private byte j = 2;
    public aomf f = aomf.b;

    static {
        arul arulVar = new arul();
        a = arulVar;
        aonm.registerDefaultInstance(arul.class, arulVar);
    }

    private arul() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "d", "e", "h", "f", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arul();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arul.class) {
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
