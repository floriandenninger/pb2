package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqbh extends aonm implements aooz {
    public static final aqbh a;
    private static volatile aopf m;
    public int b;
    public aqyg c;
    public aqyg d;
    public aqbi e;
    public avgg f;
    public avgg g;
    public apxf h;
    public aqbg i;
    public asnf j;
    public aulq l;
    private aqyg n;
    private aota o;
    private aqyg p;
    private byte q = 2;
    public aomf k = aomf.b;

    static {
        aqbh aqbhVar = new aqbh();
        a = aqbhVar;
        aonm.registerDefaultInstance(aqbh.class, aqbhVar);
    }

    private aqbh() {
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
                return newMessageInfo(a, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\n\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0007ᐉ\u0005\bᐉ\u0006\tဉ\u0007\nဉ\b\u000bᐉ\t\fည\n\rᐉ\u000b\u000eᐉ\f", new Object[]{"b", "c", "d", "e", "f", "g", "h", "n", "i", "j", "o", "k", "l", "p"});
            case NEW_MUTABLE_INSTANCE:
                return new aqbh();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = m;
                if (aopfVar == null) {
                    synchronized (aqbh.class) {
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
