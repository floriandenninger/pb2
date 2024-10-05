package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arko extends aonm implements aooz {
    public static final arko a;
    private static volatile aopf h;
    public int b;
    public arnd c;
    public arkk d;
    public int e;
    public aprr g;
    private byte i = 2;
    public String f = "";

    static {
        arko arkoVar = new arko();
        a = arkoVar;
        aonm.registerDefaultInstance(arko.class, arkoVar);
    }

    private arko() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0003\u0001ᐉ\u0000\u0003ᐉ\u0001\u0004ဌ\u0002\u0005ဈ\u0003\u0006ᐉ\u0004", new Object[]{"b", "c", "d", "e", argn.q, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arko();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (arko.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
