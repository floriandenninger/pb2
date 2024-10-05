package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqve extends aonm implements aooz {
    public static final aqve a;
    private static volatile aopf f;
    public aulq b;
    public aulq c;
    public aulq d;
    private int g;
    private aota h;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        aqve aqveVar = new aqve();
        a = aqveVar;
        aonm.registerDefaultInstance(aqve.class, aqveVar);
    }

    private aqve() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ည\u0004", new Object[]{"g", "b", "c", "d", "h", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqve();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqve.class) {
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
