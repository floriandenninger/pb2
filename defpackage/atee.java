package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atee extends aonm implements aooz {
    public static final atee a;
    private static volatile aopf d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        atee ateeVar = new atee();
        a = ateeVar;
        aonm.registerDefaultInstance(atee.class, ateeVar);
    }

    private atee() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.e);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.e = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0001\u0000\uf716⇿\uf3ee鋽\u0005\u0000\u0000\u0005\uf716⇿ᐼ\u0000\uec16㈰ᐼ\u0000\ueb3c刈ᐼ\u0000ﱡ扃ᐼ\u0000\uf3ee鋽ᐼ\u0000", new Object[]{"c", "b", ated.class, atef.class, atec.class, ateh.class, atea.class});
            case NEW_MUTABLE_INSTANCE:
                return new atee();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (atee.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
