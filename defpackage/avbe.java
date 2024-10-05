package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avbe extends aonm implements aooz {
    public static final avbe a;
    private static volatile aopf g;
    public int b;
    public aulq c;
    public apxf e;
    private aota h;
    private byte i = 2;
    public aony d = emptyProtobufList();
    public aomf f = aomf.b;

    static {
        avbe avbeVar = new avbe();
        a = avbeVar;
        aonm.registerDefaultInstance(avbe.class, avbeVar);
    }

    private avbe() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0002\u0005ည\u0003", new Object[]{"b", "c", "d", aulq.class, "e", "h", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avbe();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (avbe.class) {
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
