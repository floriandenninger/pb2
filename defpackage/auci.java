package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auci extends aonm implements aooz {
    public static final auci a;
    private static volatile aopf g;
    public Object c;
    public auda d;
    public aucp e;
    public aucp f;
    private int h;
    private aqyg i;
    public int b = 0;
    private byte j = 2;

    static {
        auci auciVar = new auci();
        a = auciVar;
        aonm.registerDefaultInstance(auci.class, auciVar);
    }

    private auci() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᐉ\u0000\u0002ᐉ\u0002\u0003ᐉ\u0003\u0004ᐼ\u0000\u0005ᐉ\u0001\u0006ᐼ\u0000", new Object[]{"c", "b", "h", "i", "e", "f", aucq.class, "d", aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new auci();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (auci.class) {
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
