package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auup extends aonm implements aooz {
    public static final auup a;
    private static volatile aopf d;
    public apxf b;
    private int e;
    private aota f;
    private aqyg g;
    private aqyg h;
    private byte i = 2;
    public aomf c = aomf.b;

    static {
        auup auupVar = new auup();
        a = auupVar;
        aonm.registerDefaultInstance(auup.class, auupVar);
    }

    private auup() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0004ᐉ\u0001\u0005ည\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004", new Object[]{"e", "b", "f", "c", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auup();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (auup.class) {
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
