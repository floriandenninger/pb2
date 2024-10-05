package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asua extends aonm implements aooz {
    public static final asua a;
    private static volatile aopf e;
    public int b;
    public aqyg c;
    public aqyg d;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private byte i = 2;

    static {
        asua asuaVar = new asua();
        a = asuaVar;
        aonm.registerDefaultInstance(asua.class, asuaVar);
    }

    private asua() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0004ᐉ\u0002\u0007ᐉ\u0005\nᐉ\u0003\u0010ᐉ\u0007", new Object[]{"b", "c", "f", "g", "d", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new asua();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (asua.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
