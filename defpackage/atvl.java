package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atvl extends aonm implements aooz {
    public static final atvl a;
    private static volatile aopf b;
    private int c;
    private apmh d;
    private atvi e;
    private aqyg f;
    private apxf g;
    private aulq h;
    private byte i = 2;

    static {
        atvl atvlVar = new atvl();
        a = atvlVar;
        aonm.registerDefaultInstance(atvl.class, atvlVar);
    }

    private atvl() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ᐉ\u0005\u0006ᐉ\u0004", new Object[]{"c", "d", "e", "f", "h", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atvl();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atvl.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
