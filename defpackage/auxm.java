package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auxm extends aonm implements aooz {
    public static final auxm a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqyg e;
    public aulq f;
    public aulq g;
    public aqyg h;
    public aqyg i;
    public aulq j;
    public aqyg k;
    public boolean l;
    private aqyg n;
    private aqyg o;
    private aulq p;
    private aulq q;
    private aulq r;
    private byte s = 2;

    static {
        auxm auxmVar = new auxm();
        a = auxmVar;
        aonm.registerDefaultInstance(auxm.class, auxmVar);
    }

    private auxm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.s);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.s = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0000\u000e\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0005\u0005ᐉ\u0006\u0006ᐉ\b\u0007ᐉ\u0007\bᐉ\u0004\tᐉ\n\nဇ\u000b\u000bᐉ\u0003\fᐉ\f\rᐉ\t\u000fᐉ\u000e\u0010ᐉ\u000f", new Object[]{"b", "c", "n", "d", "g", "h", "j", "i", "f", "k", "l", "e", "p", "o", "q", "r"});
            case NEW_MUTABLE_INSTANCE:
                return new auxm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (auxm.class) {
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
