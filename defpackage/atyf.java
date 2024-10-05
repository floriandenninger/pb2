package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atyf extends aonm implements aooz {
    public static final atyf a;
    private static volatile aopf e;
    public int d;
    private int f;
    private atya g;
    private byte h = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        atyf atyfVar = new atyf();
        a = atyfVar;
        aonm.registerDefaultInstance(atyf.class, atyfVar);
    }

    private atyf() {
        emptyProtobufList();
        emptyIntList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0002\u0001Л\u0002\u001b\u0004င\u0000\u0005ᐉ\u0001", new Object[]{"f", "b", atye.class, "c", atyd.class, "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new atyf();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (atyf.class) {
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
