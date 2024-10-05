package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arny extends aonm implements aooz {
    public static final arny a;
    private static volatile aopf h;
    public arnd b;
    public aroa d;
    public arob e;
    public aomf g;
    private int i;
    private aota j;
    private byte k = 2;
    public aony c = emptyProtobufList();
    public aony f = emptyProtobufList();

    static {
        arny arnyVar = new arny();
        a = arnyVar;
        aonm.registerDefaultInstance(arny.class, arnyVar);
    }

    private arny() {
        emptyProtobufList();
        this.g = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0006\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001\u0005ᐉ\u0002\u0007ᐉ\u0003\bည\u0004\tЛ", new Object[]{"i", "b", "c", arnw.class, "d", "e", "j", "g", "f", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arny();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arny.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
