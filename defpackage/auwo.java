package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auwo extends aonm implements aooz {
    public static final auwo a;
    private static volatile aopf j;
    public int b;
    public aulq c;
    public aqyg d;
    public aqyg e;
    public apmh f;
    private aulq k;
    private aota l;
    private byte m = 2;
    public aony g = emptyProtobufList();
    public aony h = emptyProtobufList();
    public aomf i = aomf.b;

    static {
        auwo auwoVar = new auwo();
        a = auwoVar;
        aonm.registerDefaultInstance(auwo.class, auwoVar);
    }

    private auwo() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.m);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\b\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0004\u0005ᐉ\u0005\u0006ည\u0006\u0007ᐉ\u0003\bЛ\tЛ", new Object[]{"b", "c", "d", "e", "f", "l", "i", "k", "g", apxf.class, "h", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new auwo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (auwo.class) {
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
