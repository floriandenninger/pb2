package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arkv extends aonm implements aooz {
    public static final arkv a;
    private static volatile aopf g;
    public int b;
    public arnb c;
    public int e;
    public boolean f;
    private byte h = 2;
    public aomf d = aomf.b;

    static {
        arkv arkvVar = new arkv();
        a = arkvVar;
        aonm.registerDefaultInstance(arkv.class, arkvVar);
    }

    private arkv() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0003ည\u0001\u0004ဌ\u0002\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", apld.s, "f"});
            case NEW_MUTABLE_INSTANCE:
                return new arkv();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (arkv.class) {
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
