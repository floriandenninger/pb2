package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awqv extends aonm implements aooz {
    public static final awqv a;
    private static volatile aopf b;
    private int c;
    private awqi d;
    private awqh e;
    private awrd f;
    private awnw g;
    private byte h = 2;

    static {
        awqv awqvVar = new awqv();
        a = awqvVar;
        aonm.registerDefaultInstance(awqv.class, awqvVar);
    }

    private awqv() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0011\u0019\u0004\u0000\u0000\u0004\u0011ᐉ\u0010\u0015ᐉ\u0014\u0016ᐉ\u0015\u0019ᐉ\u0016", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awqv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (awqv.class) {
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
