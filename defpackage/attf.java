package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class attf extends aonm implements aooz {
    public static final attf a;
    private static volatile aopf g;
    public arnd b;
    public attg c;
    public aulp d;
    public apxf e;
    private int h;
    private aota i;
    private aqzg j;
    private byte k = 2;
    public aomf f = aomf.b;

    static {
        attf attfVar = new attf();
        a = attfVar;
        aonm.registerDefaultInstance(attf.class, attfVar);
    }

    private attf() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001̉\u0007\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ည\u0005\u0006ᐉ\u0003̉ᐉ\u0006", new Object[]{"h", "b", "c", "d", "i", "f", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new attf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (attf.class) {
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
