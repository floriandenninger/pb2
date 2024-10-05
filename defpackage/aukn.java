package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aukn extends aonm implements aooz {
    public static final aukn a;
    private static volatile aopf l;
    public int b;
    public aqyg c;
    public arfs d;
    public aqyg e;
    public int f;
    public aulq g;
    public aukm i;
    public aulq k;
    private aota m;
    private byte n = 2;
    public aony h = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        aukn auknVar = new aukn();
        a = auknVar;
        aonm.registerDefaultInstance(aukn.class, auknVar);
    }

    private aukn() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.n);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.n = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0007\u0001ᐉ\u0000\u0002ᐉ\u0004\u0003Л\u0004ᐉ\u0006\u0005ည\u0007\u0006ᐉ\b\u0007ဉ\u0005\bᐉ\u0001\tᐉ\u0002\nဌ\u0003", new Object[]{"b", "c", "g", "h", aulq.class, "m", "j", "k", "i", "d", "e", "f", aujj.s});
            case NEW_MUTABLE_INSTANCE:
                return new aukn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aukn.class) {
                        aopfVar = l;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            l = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
