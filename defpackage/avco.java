package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avco extends aonm implements aooz {
    public static final avco a;
    private static volatile aopf d;
    public int b;
    public avcn c;
    private aqyg e;
    private aqyg f;
    private apxf g;
    private aqyg h;
    private aota i;
    private byte j = 2;

    static {
        avco avcoVar = new avco();
        a = avcoVar;
        aonm.registerDefaultInstance(avco.class, avcoVar);
    }

    private avco() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\bᐉ\u0005", new Object[]{"b", "e", "f", "g", "c", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avco();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (avco.class) {
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
