package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class artv extends aonm implements aooz {
    public static final artv a;
    private static volatile aopf e;
    public arnd b;
    public apxf d;
    private int f;
    private byte g = 2;
    public aony c = emptyProtobufList();

    static {
        artv artvVar = new artv();
        a = artvVar;
        aonm.registerDefaultInstance(artv.class, artvVar);
    }

    private artv() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᐉ\u0000\u0003Л\u0004ᐉ\u0001", new Object[]{"f", "b", "c", apxf.class, "d"});
            case NEW_MUTABLE_INSTANCE:
                return new artv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (artv.class) {
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
