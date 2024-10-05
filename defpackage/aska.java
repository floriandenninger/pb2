package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aska extends aonm implements aooz {
    public static final aska a;
    private static volatile aopf h;
    public int b;
    public aqyg c;
    public int d;
    public aqyg e;
    public aony f;
    public asjx g;
    private apmm i;
    private aqyg j;
    private aqyg k;
    private aulq l;
    private byte m = 2;

    static {
        aska askaVar = new aska();
        a = askaVar;
        aonm.registerDefaultInstance(aska.class, askaVar);
    }

    private aska() {
        emptyProtobufList();
        this.f = emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0001\b\u0001ᐉ\u0000\u0003Л\u0005ᐉ\u0002\u0006ᐉ\u0003\u0007ᐉ\u0004\bᐉ\u0005\tᐉ\u0006\nဌ\u0001\u000bᐉ\b", new Object[]{"b", "c", "f", apmh.class, "e", "i", "g", "j", "k", "d", asje.c, "l"});
            case NEW_MUTABLE_INSTANCE:
                return new aska();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (aska.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
