package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asss extends aonm implements aooz {
    public static final asss a;
    private static volatile aopf g;
    public Object c;
    public int d;
    public boolean e;
    public int f;
    private int h;
    private apxf i;
    public int b = 0;
    private byte j = 2;

    static {
        asss asssVar = new asss();
        a = asssVar;
        aonm.registerDefaultInstance(asss.class, asssVar);
    }

    private asss() {
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
                return newMessageInfo(a, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0003\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဋ\u0002\u0004ᐉ\u0003\u0005ᐼ\u0000\u0006ᐼ\u0000", new Object[]{"c", "b", "h", "d", assi.g, "e", "f", "i", aqyg.class, aulq.class});
            case NEW_MUTABLE_INSTANCE:
                return new asss();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asss.class) {
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
