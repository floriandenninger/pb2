package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asbk extends aonm implements aooz {
    public static final asbk a;
    private static volatile aopf g;
    public arnd b;
    public asbh c;
    private int h;
    private aulq i;
    private aota j;
    private byte k = 2;
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        asbk asbkVar = new asbk();
        a = asbkVar;
        aonm.registerDefaultInstance(asbk.class, asbkVar);
    }

    private asbk() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0002\u0006\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004Л\u0006ᐉ\u0004\u0007ည\u0005\tЛ\nᐉ\u0002", new Object[]{"h", "b", "c", "d", asbi.class, "j", "f", "e", apxf.class, "i"});
            case NEW_MUTABLE_INSTANCE:
                return new asbk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asbk.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
