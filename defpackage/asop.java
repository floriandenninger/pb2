package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asop extends aonm implements aooz {
    public static final asop a;
    private static volatile aopf g;
    public int b;
    public aulq d;
    public apxf f;
    private aulq h;
    private byte i = 2;
    public String c = "";
    public String e = "";

    static {
        asop asopVar = new asop();
        a = asopVar;
        aonm.registerDefaultInstance(asop.class, asopVar);
    }

    private asop() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0003\u0001ᐉ\u0001\u0002ᐉ\u0002\u0003ဈ\u0000\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"b", "h", "d", "c", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asop();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asop.class) {
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
