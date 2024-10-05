package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aval extends aonm implements aooz {
    public static final aval a;
    private static volatile aopf l;
    public int b;
    public Object d;
    public aulq e;
    public aqyg h;
    public aulq i;
    public aulq j;
    private aota m;
    public int c = 0;
    private byte n = 2;
    public aony f = emptyProtobufList();
    public aony g = emptyProtobufList();
    public aomf k = aomf.b;

    static {
        aval avalVar = new aval();
        a = avalVar;
        aonm.registerDefaultInstance(aval.class, avalVar);
    }

    private aval() {
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
                return newMessageInfo(a, "\u0001\n\u0001\u0001\u0001\n\n\u0000\u0002\t\u0001ᐼ\u0000\u0002ᐉ\u0003\u0003Л\u0004Л\u0005ᐉ\u0005\u0006ᐉ\u0007\u0007ည\b\bᐼ\u0000\tᐉ\u0004\nᐉ\u0006", new Object[]{"d", "c", "b", avgg.class, "e", "f", aqyg.class, "g", aqyg.class, "i", "m", "k", arfs.class, "h", "j"});
            case NEW_MUTABLE_INSTANCE:
                return new aval();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aval.class) {
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
