package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqfj extends aonm implements aooz {
    public static final aqfj a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apxf g;
    private apxf h;
    private aqfi i;
    private aota j;
    private byte k = 2;

    static {
        aqfj aqfjVar = new aqfj();
        a = aqfjVar;
        aonm.registerDefaultInstance(aqfj.class, aqfjVar);
    }

    private aqfj() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.k);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.k = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0001\r\u0007\u0000\u0000\u0007\u0001ᐉ\u0003\u0005ᐉ\t\u0006ᐉ\u0004\bᐉ\u0005\tᐉ\u0007\fᐉ\u0001\rᐉ\u0002", new Object[]{"c", "f", "j", "g", "h", "i", "d", "e"});
            case NEW_MUTABLE_INSTANCE:
                return new aqfj();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (aqfj.class) {
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
