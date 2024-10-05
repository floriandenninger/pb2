package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awkz extends aonm implements aooz {
    public static final awkz a;
    private static volatile aopf d;
    public int b;
    public long c;
    private int e;
    private aoot f = aoot.a;

    static {
        awkz awkzVar = new awkz();
        a = awkzVar;
        aonm.registerDefaultInstance(awkz.class, awkzVar);
    }

    private awkz() {
        emptyProtobufList();
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0001\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u00042", new Object[]{"e", "b", "c", "f", awky.a});
            case NEW_MUTABLE_INSTANCE:
                return new awkz();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (awkz.class) {
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
