package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class athk extends aonm implements aooz {
    public static final athk a;
    private static volatile aopf h;
    public int b;
    public athp c;
    public athi d;
    public athh f;
    private aota i;
    private byte j = 2;
    public aony e = emptyProtobufList();
    public aomf g = aomf.b;

    static {
        athk athkVar = new athk();
        a = athkVar;
        aonm.registerDefaultInstance(athk.class, athkVar);
    }

    private athk() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0005\u0001ᐉ\u0001\u0002Л\u0003ᐉ\u0005\u0004ည\u0006\u0005ᐉ\u0002\u0006ᐉ\u0000", new Object[]{"b", "d", "e", athn.class, "i", "g", "f", "c"});
            case NEW_MUTABLE_INSTANCE:
                return new athk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (athk.class) {
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
