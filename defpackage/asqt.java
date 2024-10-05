package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asqt extends aonm implements aooz {
    public static final asqt a;
    private static volatile aopf g;
    public int b;
    public aqyg d;
    public aqyg e;
    public aoot f = aoot.a;
    private byte h = 2;
    public String c = "";

    static {
        asqt asqtVar = new asqt();
        a = asqtVar;
        aonm.registerDefaultInstance(asqt.class, asqtVar);
    }

    private asqt() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0003\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004в", new Object[]{"b", "c", "d", "e", "f", asqs.a});
            case NEW_MUTABLE_INSTANCE:
                return new asqt();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asqt.class) {
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
