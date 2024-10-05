package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apen extends aonm implements aooz {
    public static final apen a;
    private static volatile aopf j;
    public int b;
    public arfs c;
    public aqyg d;
    public apxf e;
    public apxf f;
    public apxf g;
    public apxf h;
    public asuh i;
    private aqyg k;
    private byte l = 2;

    static {
        apen apenVar = new apen();
        a = apenVar;
        aonm.registerDefaultInstance(apen.class, apenVar);
    }

    private apen() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001ϧ\b\u0000\u0000\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\tᐉ\u0005ϧᐉ\t", new Object[]{"b", "c", "d", "e", "f", "g", "k", "h", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new apen();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (apen.class) {
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
