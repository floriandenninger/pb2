package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqxx extends aonm implements aooz {
    public static final aqxx a;
    private static volatile aopf d;
    private byte e = 2;
    public aony b = emptyProtobufList();
    public aony c = emptyProtobufList();

    static {
        aqxx aqxxVar = new aqxx();
        a = aqxxVar;
        aonm.registerDefaultInstance(aqxx.class, aqxxVar);
    }

    private aqxx() {
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"b", aqxw.class, "c", aqxw.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqxx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqxx.class) {
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
