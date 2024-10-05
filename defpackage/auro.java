package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auro extends aonm implements aooz {
    public static final auro a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private apxf e;
    private aqyg f;
    private aqyg g;
    private aqyg h;
    private aulq i;
    private aulq j;
    private aulq k;
    private apxf l;
    private aota m;
    private byte n = 2;

    static {
        auro auroVar = new auro();
        a = auroVar;
        aonm.registerDefaultInstance(auro.class, auroVar);
    }

    private auro() {
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001ᐉ\u0001\u0003ᐉ\u0003\u0004ᐉ\u0004\u0005ᐉ\u0007\u0006ᐉ\b\u0007ᐉ\u0005\bᐉ\t\tᐉ\r\rᐉ\f\u0010ᐉ\u000b", new Object[]{"c", "d", "e", "f", "h", "i", "g", "j", "m", "l", "k"});
            case NEW_MUTABLE_INSTANCE:
                return new auro();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auro.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
