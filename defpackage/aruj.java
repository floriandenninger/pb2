package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aruj extends aonm implements aooz {
    public static final aruj a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public aulp d;
    private arum g;
    private aota h;
    private aqzg i;
    private byte j = 2;
    public aomf e = aomf.b;

    static {
        aruj arujVar = new aruj();
        a = arujVar;
        aonm.registerDefaultInstance(aruj.class, arujVar);
    }

    private aruj() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ᐉ\u0003\u0006ည\u0004̉ᐉ\u0005", new Object[]{"b", "c", "g", "d", "h", "e", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aruj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aruj.class) {
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
