package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arsp extends aonm implements aooz {
    public static final arsp a;
    private static volatile aopf g;
    public int b;
    public arnd c;
    public arsn d;
    public aulp e;
    private aqzg h;
    private byte i = 2;
    public aomf f = aomf.b;

    static {
        arsp arspVar = new arsp();
        a = arspVar;
        aonm.registerDefaultInstance(arsp.class, arspVar);
    }

    private arsp() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001̉\u0005\u0000\u0000\u0004\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003̉ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arsp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arsp.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
