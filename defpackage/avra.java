package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avra extends aonm implements aooz {
    public static final avra a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aqyg h;
    private aota i;
    private byte j = 2;

    static {
        avra avraVar = new avra();
        a = avraVar;
        aonm.registerDefaultInstance(avra.class, avraVar);
    }

    private avra() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0002\r\u0006\u0000\u0000\u0006\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004ᐉ\u0006\bᐉ\u000b\u000bᐉ\u0007\rᐉ\b", new Object[]{"c", "d", "e", "f", "i", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avra();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avra.class) {
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
