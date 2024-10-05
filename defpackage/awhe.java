package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awhe extends aonm implements aooz {
    public static final awhe a;
    private static volatile aopf e;
    public int b;
    public awgy c;
    public awgz d;
    private awgx f;
    private byte g = 2;

    static {
        awhe awheVar = new awhe();
        a = awheVar;
        aonm.registerDefaultInstance(awhe.class, awheVar);
    }

    private awhe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.g);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\ueb52⃢\uf4cb♄\u0003\u0000\u0000\u0003\ueb52⃢ᐉ\u0001\uf374\u20f1ᐉ\u0000\uf4cb♄ᐉ\u0002", new Object[]{"b", "d", "c", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awhe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (awhe.class) {
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
