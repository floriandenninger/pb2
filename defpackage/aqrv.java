package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqrv extends aonm implements aooz {
    public static final aqrv a;
    private static volatile aopf f;
    public aqyg b;
    public aulq c;
    public aqyg d;
    private int g;
    private aota h;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        aqrv aqrvVar = new aqrv();
        a = aqrvVar;
        aonm.registerDefaultInstance(aqrv.class, aqrvVar);
    }

    private aqrv() {
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
                return new aqrv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqrv.class) {
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
