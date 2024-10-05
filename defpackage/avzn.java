package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avzn extends aonm implements aooz {
    public static final avzn a;
    private static volatile aopf f;
    public int b;
    public avzq c;
    public avzo e;
    private aqyg g;
    private apxf h;
    private aota i;
    private avzl j;
    private byte k = 2;
    public aomf d = aomf.b;

    static {
        avzn avznVar = new avzn();
        a = avznVar;
        aonm.registerDefaultInstance(avzn.class, avznVar);
    }

    private avzn() {
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"b", "c", "g", "h", "d", "i", "j", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new avzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (avzn.class) {
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
