package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqio extends aonm implements aooz {
    public static final aqio a;
    private static volatile aopf j;
    public int b;
    public aqyg c;
    public aulq e;
    public aqyg f;
    public aqyg g;
    public aqyg h;
    private aulq k;
    private byte l = 2;
    public aony d = emptyProtobufList();
    public String i = "";

    static {
        aqio aqioVar = new aqio();
        a = aqioVar;
        aonm.registerDefaultInstance(aqio.class, aqioVar);
    }

    private aqio() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0003\u001b\u0004ᐉ\u0002\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0003\tဈ\u0007", new Object[]{"b", "c", "d", aqip.class, "e", "f", "g", "h", "k", "i"});
            case NEW_MUTABLE_INSTANCE:
                return new aqio();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (aqio.class) {
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
