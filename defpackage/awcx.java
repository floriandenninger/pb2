package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awcx extends aonh implements aoni {
    public static final awcx a;
    private static volatile aopf h;
    public int b;
    public int f;
    private aota i;
    private byte j = 2;
    public aony c = emptyProtobufList();
    public aony d = emptyProtobufList();
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        awcx awcxVar = new awcx();
        a = awcxVar;
        aonm.registerDefaultInstance(awcx.class, awcxVar);
    }

    private awcx() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0003\u0004\u0001Л\u0002Л\u0003ᐉ\u0001\u0004ည\u0002\u0005Л\u0006င\u0000", new Object[]{"b", "c", awcq.class, "d", aqyg.class, "i", "g", "e", aqyg.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new awcx();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awcx.class) {
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
