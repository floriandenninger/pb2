package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqnq extends aonm implements aooz {
    public static final aqnq a;
    private static volatile aopf f;
    public int b;
    public int e;
    private byte g = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();

    static {
        aqnq aqnqVar = new aqnq();
        a = aqnqVar;
        aonm.registerDefaultInstance(aqnq.class, aqnqVar);
    }

    private aqnq() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0002\u0001Л\u0002Л\u0003ဌ\u0000", new Object[]{"b", "c", avgg.class, "d", avgg.class, "e", awjd.a()});
            case NEW_MUTABLE_INSTANCE:
                return new aqnq();
            case NEW_BUILDER:
                return new aone((boolean[][][]) null, (byte[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = f;
                if (aopfVar == null) {
                    synchronized (aqnq.class) {
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
