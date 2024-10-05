package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arml extends aonm implements aooz {
    public static final arml a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public apxf d;
    private aota g;
    private aqzg h;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        arml armlVar = new arml();
        a = armlVar;
        aonm.registerDefaultInstance(arml.class, armlVar);
    }

    private arml() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "g", "e", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arml();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arml.class) {
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
