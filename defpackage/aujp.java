package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aujp extends aonm implements aooz {
    public static final aujp a;
    private static volatile aopf g;
    public int b;
    public avxs c;
    public aulq d;
    public aulq e;
    public arfs f;
    private aqyg h;
    private aota i;
    private aulq j;
    private byte k = 2;

    static {
        aujp aujpVar = new aujp();
        a = aujpVar;
        aonm.registerDefaultInstance(aujp.class, aujpVar);
    }

    private aujp() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0007\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\u0002\bᐉ\u0007", new Object[]{"b", "c", "d", "f", "h", "i", "e", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aujp();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aujp.class) {
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
