package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arpy extends aonm implements aooz {
    public static final arpy a;
    private static volatile aopf g;
    public int b;
    public Object d;
    public aqyg f;
    private aota h;
    public int c = 0;
    private byte i = 2;
    public aomf e = aomf.b;

    static {
        arpy arpyVar = new arpy();
        a = arpyVar;
        aonm.registerDefaultInstance(arpy.class, arpyVar);
    }

    private arpy() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ည\u0001\u0003ᐉ\u0002\u0004ᐼ\u0000\u0005ျ\u0000", new Object[]{"d", "c", "b", "h", "e", "f", apxf.class});
            case NEW_MUTABLE_INSTANCE:
                return new arpy();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arpy.class) {
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
