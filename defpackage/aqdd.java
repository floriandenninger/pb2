package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqdd extends aonm implements aooz {
    public static final aqdd a;
    private static volatile aopf s;
    public int b;
    public aqyg c;
    public aulq d;
    public aqyg e;
    public aulq f;
    public avgg g;
    public aulq h;
    public apxf i;
    public atdf j;
    public aqdc k;
    public aulq l;
    public apxf n;
    public aulq o;
    public aqev p;
    public int q;
    private aota t;
    private byte u = 2;
    public aony m = emptyProtobufList();
    public aomf r = aomf.b;

    static {
        aqdd aqddVar = new aqdd();
        a = aqddVar;
        aonm.registerDefaultInstance(aqdd.class, aqddVar);
    }

    private aqdd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.u);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.u = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0011\u0000\u0001\u0002\u0015\u0011\u0000\u0001\u000e\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0005\u0005ᐉ\u0007\u0007ᐉ\t\bᐉ\u0012\tည\u0013\nᐉ\n\fЛ\rᐉ\u000e\u000fᐉ\u0002\u0010ᐉ\u0004\u0011ᐉ\u0006\u0012ဉ\u0010\u0013ဋ\u0011\u0014ᐉ\u000b\u0015ᐉ\r", new Object[]{"b", "c", "e", "g", "i", "j", "t", "r", "k", "m", apxf.class, "o", "d", "f", "h", "p", "q", "l", "n"});
            case NEW_MUTABLE_INSTANCE:
                return new aqdd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = s;
                if (aopfVar == null) {
                    synchronized (aqdd.class) {
                        aopfVar = s;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            s = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
