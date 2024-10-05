package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arfa extends aonh implements aoni {
    public static final arfa a;
    private static volatile aopf h;
    public int b;
    public int d;
    public int e;
    public aqyg f;
    public aomf g;
    private apxf i;
    private aovx j;
    private aulq k;
    private aulq m;
    private aota n;
    private byte o = 2;
    public aony c = emptyProtobufList();

    static {
        arfa arfaVar = new arfa();
        a = arfaVar;
        aonm.registerDefaultInstance(arfa.class, arfaVar);
    }

    private arfa() {
        emptyProtobufList();
        this.g = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.o);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0001\u0007\u0001Л\u0002ᐉ\b\u0003ᐉ\u0002\u0004ည\t\u0006င\u0000\u0007င\u0001\bᐉ\u0003\u000bᐉ\u0006\fᐉ\u0007\rᐉ\u0005", new Object[]{"b", "c", arfb.class, "n", "f", "g", "d", "e", "i", "k", "m", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new arfa();
            case NEW_BUILDER:
                return new aong(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arfa.class) {
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
