package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arxh extends aonm implements aooz {
    public static final arxh a;
    private static volatile aopf j;
    public int b;
    public arnb c;
    public boolean h;
    private byte k = 2;
    public aomf d = aomf.b;
    public aomf e = aomf.b;
    public aomf f = aomf.b;
    public aomf g = aomf.b;
    public String i = "";

    static {
        arxh arxhVar = new arxh();
        a = arxhVar;
        aonm.registerDefaultInstance(arxh.class, arxhVar);
    }

    private arxh() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ည\u0001\u0005ည\u0004\u0006ည\u0002\u0007ည\u0003\bဇ\u0005\tဈ\u0006", new Object[]{"b", "c", "d", "g", "e", "f", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arxh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (arxh.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
