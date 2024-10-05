package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atgn extends aonm implements aooz {
    public static final atgn a;
    private static volatile aopf g;
    public int b;
    public boolean e;
    public aqjt f;
    private aqyg h;
    private aota i;
    private apxf j;
    private aulq k;
    private byte l = 2;
    public aomf c = aomf.b;
    public aony d = emptyProtobufList();

    static {
        atgn atgnVar = new atgn();
        a = atgnVar;
        aonm.registerDefaultInstance(atgn.class, atgnVar);
    }

    private atgn() {
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
                return newMessageInfo(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0006\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ည\u0002\u0004Л\u0006ဇ\u0005\u0007ᐉ\u0003\bᐉ\u0007\tᐉ\u0006", new Object[]{"b", "h", "i", "c", "d", atgm.class, "e", "j", "k", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new atgn();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atgn.class) {
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
