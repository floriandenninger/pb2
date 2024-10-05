package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arae extends aonm implements aooz {
    public static final arae a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private apmh f;
    private apmh g;
    private aota h;
    private byte i = 2;

    static {
        arae araeVar = new arae();
        a = araeVar;
        aonm.registerDefaultInstance(arae.class, araeVar);
    }

    private arae() {
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0003ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\bᐉ\u0007", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new arae();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (arae.class) {
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
