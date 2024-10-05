package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aubx extends aonm implements aooz {
    public static final aubx a;
    private static volatile aopf g;
    public int b;
    public atmt c;
    public atmv d;
    public aufe e;
    public aulm f;
    private byte h = 2;

    static {
        aubx aubxVar = new aubx();
        a = aubxVar;
        aonm.registerDefaultInstance(aubx.class, aubxVar);
    }

    private aubx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\ueee9ᣑﰖ㯒\u0004\u0000\u0000\u0003\ueee9ᣑᐉ\u0000\ueeedᣑဉ\u0002\uf697᳗ᐉ\u0003ﰖ㯒ᐉ\u0001", new Object[]{"b", "c", "e", "f", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aubx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aubx.class) {
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
