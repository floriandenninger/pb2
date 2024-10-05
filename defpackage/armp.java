package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class armp extends aonm implements aooz {
    public static final armp a;
    private static volatile aopf f;
    public int b;
    public arnd c;
    public aqdx d;
    private byte g = 2;
    public aony e = emptyProtobufList();

    static {
        armp armpVar = new armp();
        a = armpVar;
        aonm.registerDefaultInstance(armp.class, armpVar);
    }

    private armp() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"b", "c", "e", apxf.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new armp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (armp.class) {
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
