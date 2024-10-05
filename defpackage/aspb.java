package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aspb extends aonm implements aooz {
    public static final aspb a;
    private static volatile aopf d;
    public int b;
    public aqyg c;
    private aqyg e;
    private apmh f;
    private byte g = 2;

    static {
        aspb aspbVar = new aspb();
        a = aspbVar;
        aonm.registerDefaultInstance(aspb.class, aspbVar);
    }

    private aspb() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0004", new Object[]{"b", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aspb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aspb.class) {
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
