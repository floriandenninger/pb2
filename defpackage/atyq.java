package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyq extends aonm implements aooz {
    public static final atyq a;
    private static volatile aopf f;
    public int b;
    public aqyg c;
    public aqyg d;
    public apmh e;
    private aqyg g;
    private apmh h;
    private byte i = 2;

    static {
        atyq atyqVar = new atyq();
        a = atyqVar;
        aonm.registerDefaultInstance(atyq.class, atyqVar);
    }

    private atyq() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0005\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ᐉ\u0000\u0004ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"b", "d", "g", "c", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new atyq();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (atyq.class) {
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
