package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aoxy extends aonm implements aooz {
    public static final aoxy a;
    private static volatile aopf f;
    public aoyh d;
    private int g;
    private byte h = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();
    public String e = "";

    static {
        aoxy aoxyVar = new aoxy();
        a = aoxyVar;
        aonm.registerDefaultInstance(aoxy.class, aoxyVar);
    }

    private aoxy() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဉ\u0000\u0004ဈ\u0001", new Object[]{"g", "b", apxf.class, "c", apxf.class, "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aoxy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aoxy.class) {
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
