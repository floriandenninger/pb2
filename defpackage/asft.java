package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asft extends aonm implements aooz {
    public static final asft a;
    private static volatile aopf g;
    public int b;
    public arnb c;
    public awhh e;
    private byte h = 2;
    public String d = "";
    public String f = "";

    static {
        asft asftVar = new asft();
        a = asftVar;
        aonm.registerDefaultInstance(asft.class, asftVar);
    }

    private asft() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asft();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asft.class) {
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
