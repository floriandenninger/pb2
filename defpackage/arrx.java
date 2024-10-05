package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arrx extends aonm implements aooz {
    public static final arrx a;
    private static volatile aopf f;
    public arnd b;
    public apxf c;
    private int g;
    private aota h;
    private aqzg i;
    private byte j = 2;
    public aomf d = aomf.b;
    public aony e = emptyProtobufList();

    static {
        arrx arrxVar = new arrx();
        a = arrxVar;
        aonm.registerDefaultInstance(arrx.class, arrxVar);
    }

    private arrx() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001̉\u0006\u0000\u0001\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ည\u0003\u0005Л̉ᐉ\u0005", new Object[]{"g", "b", "c", "h", "d", "e", avgg.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new arrx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (arrx.class) {
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
