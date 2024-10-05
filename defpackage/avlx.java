package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avlx extends aonm implements aooz {
    public static final avlx a;
    private static volatile aopf b;
    private int c;
    private apmh d;
    private aqyg e;
    private aqyg f;
    private aota g;
    private avly h;
    private byte i = 2;

    static {
        avlx avlxVar = new avlx();
        a = avlxVar;
        aonm.registerDefaultInstance(avlx.class, avlxVar);
    }

    private avlx() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000e\u0005\u0000\u0000\u0005\u0003ᐉ\u0006\u0005ᐉ\u0002\tᐉ\u0004\nᐉ\u0005\u000eᐉ\n", new Object[]{"c", "g", "d", "e", "f", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avlx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (avlx.class) {
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
