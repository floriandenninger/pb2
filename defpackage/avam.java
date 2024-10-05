package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avam extends aonm implements aooz {
    public static final avam a;
    private static volatile aopf m;
    public int b;
    public Object d;
    public avgg e;
    public aqyg g;
    public aqyg h;
    public aulq j;
    public aulq k;
    private aota n;
    public int c = 0;
    private byte o = 2;
    public aonu f = emptyIntList();
    public aony i = emptyProtobufList();
    public aomf l = aomf.b;

    static {
        avam avamVar = new avam();
        a = avamVar;
        aonm.registerDefaultInstance(avam.class, avamVar);
    }

    private avam() {
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
                return newMessageInfo(a, "\u0001\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0002\t\u0001ᐉ\u0003\u0002ᐉ\u0004\u0003ᐉ\u0005\u0004Л\u0005ᐉ\u0006\u0006ᐉ\u0007\u0007ᐉ\b\bည\t\tᐼ\u0000\nᐼ\u0000\u000b\u001d", new Object[]{"d", "c", "b", "e", "g", "h", "i", aqyg.class, "j", "k", "n", "l", avgg.class, arfs.class, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new avam();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (avam.class) {
                        aopfVar = m;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            m = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
