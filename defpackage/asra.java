package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asra extends aonm implements aooz {
    public static final asra a;
    public static final aonk b;
    private static volatile aopf m;
    public int c;
    public asqy e;
    public asqz g;
    public asqx h;
    public boolean l;
    private aulq n;
    private aota o;
    private asrb p;
    private aulq q;
    private byte r = 2;
    public aony d = emptyProtobufList();
    public aony f = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aomf j = aomf.b;
    public String k = "";

    static {
        asra asraVar = new asra();
        a = asraVar;
        aonm.registerDefaultInstance(asra.class, asraVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, asraVar, asraVar, null, 117294427, aoqn.MESSAGE, asra.class);
    }

    private asra() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.r);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.r = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u0013\r\u0000\u0003\n\u0001Л\u0002Л\u0003ᐉ\u0004\u0005ᐉ\u0003\u0006ᐉ\u0001\bᐉ\u0006\tည\u0007\fЛ\u000eᐉ\t\u000fဈ\n\u0010ဇ\u000b\u0012ᐉ\u0000\u0013ᐉ\r", new Object[]{"c", "d", asrc.class, "f", apxf.class, "h", "g", "e", "o", "j", "i", aqss.class, "p", "k", "l", "n", "q"});
            case NEW_MUTABLE_INSTANCE:
                return new asra();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (asra.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
