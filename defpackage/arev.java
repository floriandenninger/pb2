package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arev extends aonh implements aoni {
    public static final arev a;
    private static volatile aopf k;
    public int b;
    public aret c;
    public areu e;
    public arew f;
    public ares g;
    public aulq h;
    private aulq m;
    private aulq n;
    private aovx o;
    private aota p;
    private byte q = 2;
    public aony d = emptyProtobufList();
    public aony i = emptyProtobufList();
    public aomf j = aomf.b;

    static {
        arev arevVar = new arev();
        a = arevVar;
        aonm.registerDefaultInstance(arev.class, arevVar);
    }

    private arev() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.q);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.q = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0002\n\u0001Л\u0002ည\u000b\u0003ᐉ\f\u0004ᐉ\u0000\u0005ᐉ\u0001\u0006ဉ\u0002\tᐉ\u0005\nᐉ\u0007\u000bᐉ\b\fᐉ\u0006\rЛ\u000fᐉ\n", new Object[]{"b", "d", arex.class, "j", "p", "c", "e", "f", "g", "m", "n", "h", "i", apxf.class, "o"});
            case NEW_MUTABLE_INSTANCE:
                return new arev();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = k;
                if (aopfVar == null) {
                    synchronized (arev.class) {
                        aopfVar = k;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            k = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
