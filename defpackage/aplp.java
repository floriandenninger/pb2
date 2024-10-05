package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aplp extends aonm implements aooz {
    public static final aplp a;
    private static volatile aopf i;
    public int b;
    public Object d;
    public aony e;
    public aulq f;
    public aulq g;
    public aomf h;
    private aoyq j;
    private aota k;
    public int c = 0;
    private byte l = 2;

    static {
        aplp aplpVar = new aplp();
        a = aplpVar;
        aonm.registerDefaultInstance(aplp.class, aplpVar);
    }

    private aplp() {
        emptyProtobufList();
        this.e = emptyProtobufList();
        emptyProtobufList();
        this.h = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\b\u0001\u0001\u0007\u0014\b\u0000\u0001\u0007\u0007ᐉ\u0007\bᐼ\u0000\nЛ\rᐉ\r\u000eᐉ\u000e\u000fᐉ\u000f\u0010ည\u0010\u0014ᐼ\u0000", new Object[]{"d", "c", "b", "j", aoyq.class, "e", apxf.class, "f", "g", "k", "h", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new aplp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aplp.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
