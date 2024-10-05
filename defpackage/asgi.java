package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asgi extends aonm implements aooz {
    public static final asgi a;
    private static volatile aopf f;
    public int b;
    public aott d;
    public apxf e;
    private aqyg g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        asgi asgiVar = new asgi();
        a = asgiVar;
        aonm.registerDefaultInstance(asgi.class, asgiVar);
    }

    private asgi() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0001\u0003\u0002ᐉ\u0001\u0004Л\u0005ဉ\u0003\u0006ᐉ\u0004", new Object[]{"b", "g", "c", asgh.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new asgi();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (asgi.class) {
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
