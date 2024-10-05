package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apzn extends aonm implements aooz {
    public static final apzn a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public aony d;
    public aony e;
    public aomf f;
    public apmh g;
    public boolean h;
    public String i;
    private aqyg k;
    private aota l;
    private apxf m;
    private apzo n;
    private aqyg o;
    private aulq p;
    private aqyg q;
    private aulq r;
    private apzu s;
    private byte t = 2;

    static {
        apzn apznVar = new apzn();
        a = apznVar;
        aonm.registerDefaultInstance(apzn.class, apznVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, apznVar, apznVar, null, 65060753, aoqn.MESSAGE, apzn.class);
    }

    private apzn() {
        emptyProtobufList();
        this.d = emptyProtobufList();
        this.e = emptyProtobufList();
        this.f = aomf.b;
        this.i = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.t);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.t = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0013\u000f\u0000\u0002\f\u0001Л\u0002Л\u0003ᐉ\b\u0004ည\u0001\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\n\bᐉ\u0004\nᐉ\u0000\fᐉ\u0005\u000fဇ\u0007\u0010ᐉ\t\u0011ᐉ\u000b\u0012ဈ\f\u0013ᐉ\r", new Object[]{"c", "d", apyx.class, "e", apzu.class, "o", "f", "l", "m", "q", "g", "k", "n", "h", "p", "r", "i", "s"});
            case NEW_MUTABLE_INSTANCE:
                return new apzn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apzn.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
