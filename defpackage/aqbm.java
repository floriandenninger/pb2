package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbm extends aonm implements aooz {
    public static final aqbm a;
    private static volatile aopf p;
    public int b;
    public avgg c;
    public aqbl d;
    public aqbl e;
    public aulq f;
    public aulq g;
    public int h;
    public aulq i;
    public apxf j;
    public aulq k;
    public apxf m;
    public aqev n;
    private aota q;
    private byte r = 2;
    public aony l = emptyProtobufList();
    public aomf o = aomf.b;

    static {
        aqbm aqbmVar = new aqbm();
        a = aqbmVar;
        aonm.registerDefaultInstance(aqbm.class, aqbmVar);
    }

    private aqbm() {
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
                return newMessageInfo(a, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\u000b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ဋ\u0005\u0006ᐉ\u0007\u0007ᐉ\b\bᐉ\f\tည\r\nЛ\u000bᐉ\u0006\rဉ\u000b\u000eᐉ\u0004\u000fᐉ\t", new Object[]{"b", "c", "d", "e", "f", "h", "j", "k", "q", "o", "l", apxf.class, "i", "n", "g", "m"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = p;
                if (aopfVar == null) {
                    synchronized (aqbm.class) {
                        aopfVar = p;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            p = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
