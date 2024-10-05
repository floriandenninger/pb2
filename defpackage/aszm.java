package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aszm extends aonm implements aooz {
    public static final aszm a;
    private static volatile aopf d;
    public Object c;
    private int e;
    private aqyg f;
    private aqyg g;
    private apmh h;
    private aqyg i;
    public int b = 0;
    private byte j = 2;

    static {
        aszm aszmVar = new aszm();
        a = aszmVar;
        aonm.registerDefaultInstance(aszm.class, aszmVar);
    }

    private aszm() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\t\u0006\u0000\u0000\u0004\u0001ဿ\u0000\u0004ᐉ\u0003\u0006ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tှ\u0000", new Object[]{"c", "b", "e", aufb.d, "f", "g", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aszm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aszm.class) {
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
