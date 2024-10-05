package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbn extends aonm implements aooz {
    public static final aqbn a;
    private static volatile aopf l;
    public int b;
    public avgg c;
    public aqyg d;
    public int e;
    public int f;
    public apxf g;
    public aulq j;
    public boolean k;
    private aota m;
    private byte n = 2;
    public aomf h = aomf.b;
    public aony i = emptyProtobufList();

    static {
        aqbn aqbnVar = new aqbn();
        a = aqbnVar;
        aonm.registerDefaultInstance(aqbn.class, aqbnVar);
    }

    private aqbn() {
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ည\u0006\bЛ\tᐉ\u0007\nဇ\b", new Object[]{"b", "c", "d", "e", "f", "g", "m", "h", "i", apxf.class, "j", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = l;
                if (aopfVar == null) {
                    synchronized (aqbn.class) {
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
