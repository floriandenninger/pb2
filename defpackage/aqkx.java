package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqkx extends aonm implements aooz {
    public static final aqkx a;
    public static final aonk b;
    private static volatile aopf d;
    public aony c;
    private int e;
    private apxf f;
    private byte g = 2;

    static {
        aqkx aqkxVar = new aqkx();
        a = aqkxVar;
        aonm.registerDefaultInstance(aqkx.class, aqkxVar);
        b = aonm.newSingularGeneratedExtension(awnw.a, aqkxVar, aqkxVar, null, 167732284, aoqn.MESSAGE, aqkx.class);
    }

    private aqkx() {
        emptyProtobufList();
        this.c = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0003Л", new Object[]{"e", "f", "c", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new aqkx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (aqkx.class) {
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
