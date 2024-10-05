package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class areq extends aonh implements aoni {
    public static final areq a;
    private static volatile aopf f;
    public int b;
    public arep d;
    private aota g;
    private byte h = 2;
    public aony c = emptyProtobufList();
    public aomf e = aomf.b;

    static {
        areq areqVar = new areq();
        a = areqVar;
        aonm.registerDefaultInstance(areq.class, areqVar);
    }

    private areq() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003ᐉ\u0001\u0004ည\u0002", new Object[]{"b", "c", apmh.class, "d", "g", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new areq();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (areq.class) {
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
