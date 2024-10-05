package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atzb extends aonm implements aooz {
    public static final atzb a;
    private static volatile aopf g;
    public int b;
    public apxf c;
    public aulq d;
    public aulq e;
    private aqyg h;
    private aota i;
    private byte j = 2;
    public aomf f = aomf.b;

    static {
        atzb atzbVar = new atzb();
        a = atzbVar;
        aonm.registerDefaultInstance(atzb.class, atzbVar);
    }

    private atzb() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0004ည\u0005\u0005ᐉ\u0002\u0006ᐉ\u0003", new Object[]{"b", "c", "h", "i", "f", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new atzb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (atzb.class) {
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
