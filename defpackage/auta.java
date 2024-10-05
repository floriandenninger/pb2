package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auta extends aonm implements aooz {
    public static final auta a;
    private static volatile aopf o;
    public int b;
    public aqyg c;
    public aqyg d;
    public atdf e;
    public apxf h;
    public aqyg i;
    public apxf j;
    public boolean k;
    public apxf m;
    public aulq n;
    private aulq p;
    private aota q;
    private byte r = 2;
    public aony f = emptyProtobufList();
    public aomf g = aomf.b;
    public aony l = emptyProtobufList();

    static {
        auta autaVar = new auta();
        a = autaVar;
        aonm.registerDefaultInstance(auta.class, autaVar);
    }

    private auta() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u0016\u000e\u0000\u0002\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0005ᐉ\u0002\u0007Л\tᐉ\u0004\nည\u0005\u000bᐉ\u0006\rᐉ\b\u000eᐉ\t\u0010ဇ\u000b\u0011Л\u0012ᐉ\r\u0015ᐉ\u0003\u0016ᐉ\f", new Object[]{"b", "c", "d", "e", "f", autb.class, "q", "g", "h", "i", "j", "k", "l", apxf.class, "n", "p", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new auta();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = o;
                if (aopfVar == null) {
                    synchronized (auta.class) {
                        aopfVar = o;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            o = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
